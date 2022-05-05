package com.sofkau.webdevappback.dao;

import com.sofkau.webdevappback.entity.Category;
import com.sofkau.webdevappback.entity.Task;
import com.sofkau.webdevappback.repository.CategoryRepository;
import com.sofkau.webdevappback.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoryDaoImplementation implements CategoryDao {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private TaskRepository taskRepository;


    @Override
    public List<Category> findAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category createTask(Task task) {
        Category category = categoryRepository.findById(task.getFk_Category()).get();
        category.addTask(task);
        taskRepository.save(task);
        return categoryRepository.save(category);
    }

    @Override
    public Task editTasks(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public void deleteTask(Task task) {
        taskRepository.deleteById(task.getId());

    }

    @Override
    public void deleteCategory(Category category) {
        categoryRepository.deleteById(category.getId());

    }




}
