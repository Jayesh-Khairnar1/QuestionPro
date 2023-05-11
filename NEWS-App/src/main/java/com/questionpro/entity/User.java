package com.questionpro.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class User {
    private String id;
    private String about;
    private LocalDateTime created;
    private int karma;
    private List<Integer> submitted;
}
