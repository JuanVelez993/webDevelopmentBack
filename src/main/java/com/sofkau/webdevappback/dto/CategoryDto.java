package com.sofkau.webdevappback.dto;

import com.sofkau.webdevappback.entity.Task;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CategoryDto {

    private Long id;

    private String name;

    private List<Task> listOfTasks= new ArrayList<>();
}
