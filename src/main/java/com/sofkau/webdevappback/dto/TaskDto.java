package com.sofkau.webdevappback.dto;


import lombok.Data;

public class TaskDto {

    private Long id;
    private String taskName;
    private boolean isDone;
    private Long fk_Category;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public Long getFk_Category() {
        return fk_Category;
    }

    public void setFk_Category(Long fk_Category) {
        this.fk_Category = fk_Category;
    }
}
