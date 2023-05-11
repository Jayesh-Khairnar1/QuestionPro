package com.questionpro.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.questionpro.entity.Comment;
import com.questionpro.entity.Story;
import com.questionpro.service.StoryService;

@Service
public class StoryServiceImpl implements StoryService {

	private List<Story> topStories = new ArrayList();
	private List<Story> pastStories = new ArrayList();

	public List<Story> getPastStories() {
		return topStories.stream().sorted(Comparator.comparingInt(Story::getScore).reversed()).limit(10)
				.collect(Collectors.toList());
	}

	public List<Story> getTopStories() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@GetMapping("/comments")
	public List<Comment> getComments(String storyId) {

		List<Comment> comments = // fetchCommentsFromDataSource(storyId);

				comments.sort(Comparator.comparingInt(c -> c.getChildComments().size()));
		comments.sort(Comparator.comparingInt(Comment::getChildCommentsCount).reversed());

		return comments.subList(0, Math.min(10, comments.size()));
	}
}
