package com.sofkau.webdevappback.service;

import com.sofkau.webdevappback.dto.CategoryDto;
import com.sofkau.webdevappback.dto.TaskDto;
import com.sofkau.webdevappback.entity.Category;
import com.sofkau.webdevappback.entity.Task;


import java.util.List;


public interface CategoryService {

    CategoryDto createCategory(CategoryDto categoryDto);

    CategoryDto createTask(TaskDto taskDto);

    TaskDto editTasks(TaskDto taskDto);

    void deleteTask(TaskDto taskDto);

    void deleteCategory(CategoryDto category);

    List<CategoryDto> findAllCategories();


}
