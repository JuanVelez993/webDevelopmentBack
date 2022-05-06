package com.sofkau.webdevappback.dto;


import lombok.Data;

@Data
public class TaskDto {

    private Long id;
    private String taskName;
    private boolean isDone;
    private Long fk_Category;
}
