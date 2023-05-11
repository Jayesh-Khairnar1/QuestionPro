package com.questionpro.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.questionpro.entity.Comment;
import com.questionpro.entity.Story;

import com.questionpro.service.StoryService;



@RestController
@RequestMapping("https://hacker-news.firebaseio.com/v0/ ")

public class StoryController {
	
	@Autowired
	public StoryService storyService;
	 


	  
	    @Cacheable
	    @GetMapping("/top-stories")
	    public List<Story> getTopStories() {
	
	        return storyService.getTopStories();
	    }
	    
	    
	    @Cacheable
	    @GetMapping("/past-stories")
	    public List<Story> getPastStories() {
	       
	        return storyService.getPastStories();
	    }
	    @Cacheable
	    @GetMapping("/comments")
	    public List<Comment> getComments(String storyId) {
	    	
	    	return comme
	    }
	   
	  

}
