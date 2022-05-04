package com.sofkau.webdevappback.dao;

import com.sofkau.webdevappback.entity.Category;
import com.sofkau.webdevappback.entity.Task;


import java.util.List;


public interface CategoryDao {

    Category createCategory(Category category);

    Category createTasks(Task task);

    void deleteTasks(Task task);

    void deleteCategory(Category category);

    List<Category> findAllCategories();


}
