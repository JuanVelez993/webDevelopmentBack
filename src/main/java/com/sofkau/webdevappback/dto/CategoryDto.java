package com.sofkau.webdevappback.dto;

import java.util.ArrayList;
import java.util.List;

public class CategoryDto {

    private Long id;

    private String name;

    private List<TaskDto> listOfTasks= new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TaskDto> getListOfTasks() {
        return listOfTasks;
    }

    public void setListOfTasks(List<TaskDto> listOfTasks) {
        this.listOfTasks = listOfTasks;
    }
}
