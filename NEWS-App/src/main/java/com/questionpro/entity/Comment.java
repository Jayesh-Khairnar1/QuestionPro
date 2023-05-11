package com.questionpro.entity;

import java.util.List;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Comment {
		private String text;
	    private String userHandle;
		
}
