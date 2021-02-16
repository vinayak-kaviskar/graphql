package com.jstvnyk.mygraphql.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.jstvnyk.mygraphql.dao.entity.Post;
import com.jstvnyk.mygraphql.service.PostService;

@Component
public class PostMutation implements GraphQLMutationResolver {

	@Autowired
	private PostService postService;

	public Post writePost(String title, String text, String category, String author) {

		return this.postService.addPost(title, text, category, author);

	}

}
