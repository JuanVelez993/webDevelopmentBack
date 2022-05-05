package com.sofkau.webdevappback.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "Task")
@Table(name = "todolist")
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String taskName;
    private boolean isDone;
    private Long fk_Category;
}
