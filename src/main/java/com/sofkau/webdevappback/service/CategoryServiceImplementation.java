package com.sofkau.webdevappback.service;

import com.sofkau.webdevappback.dto.CategoryDto;
import com.sofkau.webdevappback.dto.TaskDto;
import com.sofkau.webdevappback.entity.Category;
import com.sofkau.webdevappback.entity.Task;
import com.sofkau.webdevappback.repository.CategoryRepository;
import com.sofkau.webdevappback.repository.TaskRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoryServiceImplementation implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private ModelMapper modelMapper;


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


    private CategoryDto categoryToDTO(Category category){
        CategoryDto categoryDTO = modelMapper.map(category, CategoryDto.class);
        return categoryDTO;
    };

    private Category dtoToCategory(CategoryDto categoryDto){
        Category category = category = modelMapper.map(categoryDto, Category.class);
        return category;
    }

    private TaskDto taskToDTO(Task task){
        TaskDto taskDTO = modelMapper.map(task, TaskDto.class);
        return taskDTO;
    };

    private Task dtoToTask(TaskDto taskDto){
        Task task = modelMapper.map(taskDto, Task.class);
        return task;
    }



}
