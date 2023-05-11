package com.questionpro.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.questionpro.entity.Comment;
import com.questionpro.entity.Story;

public interface StoryService {
	
	//top-stories 
	public List<Story> getTopStories();
	
    //past-stories 
	
	public List<Story> getPastStories(); 
	
	//comments
	  public List<Comment> getComments(String storyId);
}
