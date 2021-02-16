package com.jstvnyk.mygraphql.query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.jstvnyk.mygraphql.dao.entity.Post;
import com.jstvnyk.mygraphql.service.PostService;

@Component
public class PostsQuery implements GraphQLQueryResolver{

	
	@Autowired
	private PostService postService;
	
	public List<Post> recentPosts(int count, int offset){
		
		return this.postService.getRecentPosts(count, offset);
	}
}
	