package com.questionpro.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data

public class Story {
		private String title;
	    private String url;
	    private int score;
	    private LocalDateTime submissionTime;
	    private String submittedBy;
	  
}
