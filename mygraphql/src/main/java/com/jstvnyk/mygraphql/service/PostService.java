package com.jstvnyk.mygraphql.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jstvnyk.mygraphql.dao.entity.Author;
import com.jstvnyk.mygraphql.dao.entity.Post;
import com.jstvnyk.mygraphql.dao.repository.PostRepository;

@Service
public class PostService {

	private final PostRepository postRepository;

	public PostService(final PostRepository postRepository) {
		this.postRepository = postRepository;
	}

	public List<Post> getRecentPosts(int count, int offset) {

		return this.postRepository.findAll();

	}

	public Post addPost(String title, String text, String category, String author) {

		Author authorEntity = new Author();
		authorEntity.setName(author);

		Post post = new Post();
		post.setTitle(title);
		post.setText(text);
		post.setCategory(category);
		post.setAuthorId(authorEntity);

		return this.postRepository.save(post);

	}
}
