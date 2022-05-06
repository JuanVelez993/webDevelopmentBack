package com.sofkau.webdevappback.service;

import com.sofkau.webdevappback.dto.CategoryDto;
import com.sofkau.webdevappback.dto.TaskDto;
import com.sofkau.webdevappback.dto.mapper.CategoryMapper;
import com.sofkau.webdevappback.dto.mapper.TaskMapper;
import com.sofkau.webdevappback.entity.Category;
import com.sofkau.webdevappback.entity.Task;
import com.sofkau.webdevappback.repository.CategoryRepository;
import com.sofkau.webdevappback.repository.TaskRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CategoryServiceImplementation implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private CategoryMapper categoryMapper;

    @Autowired
    private TaskMapper taskMapper;


    @Override
    public List<CategoryDto> findAllCategories() {
        List<Category> categoryList = categoryRepository.findAll();
        return categoryMapper.toCategoryDtos(categoryList);
    }

    @Override
    public CategoryDto createCategory(CategoryDto categoryDto) {
        Category category = categoryRepository.save(categoryMapper.toCategory(categoryDto));
        return categoryMapper.toCategoryDto(category);
    }

    @Override
    public CategoryDto createTask(TaskDto taskDto) {
        Category category = categoryRepository.findById(taskDto.getFk_Category()).get();
        category.addTask(taskMapper.toTask(taskDto));
        taskRepository.save(taskMapper.toTask(taskDto));
        return categoryMapper.toCategoryDto(categoryRepository.save(category));
    }

    @Override
    public TaskDto editTasks(TaskDto taskDto) {
        return taskMapper.toTaskDto(taskRepository.save(taskMapper.toTask(taskDto)));
    }

    @Override
    public void deleteTask(TaskDto taskDto) {
        taskRepository.deleteById(taskDto.getId());
    }

    @Override
    public void deleteCategory(CategoryDto categoryDto) {
        Category category = categoryMapper.toCategory(categoryDto);
        if (!category.getListOfTasks().isEmpty()) {
            category.getListOfTasks()
                    .forEach(task -> taskRepository.deleteById(task.getId()));
        }
        categoryRepository.deleteById(category.getId());

    }






}
