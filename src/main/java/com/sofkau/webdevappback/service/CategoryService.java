package com.sofkau.webdevappback.service;

import com.sofkau.webdevappback.dto.CategoryDto;
import com.sofkau.webdevappback.entity.Category;
import com.sofkau.webdevappback.entity.Task;


import java.util.List;


public interface CategoryService {

    Category createCategory(Category category);

    Category createTask(Task task);

    Task editTasks(Task task);

    void deleteTask(Task task);

    void deleteCategory(Category category);

    List<CategoryDto> findAllCategories();


}
