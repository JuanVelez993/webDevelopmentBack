package com.sofkau.webdevappback.controller;

import com.sofkau.webdevappback.dto.CategoryDto;
import com.sofkau.webdevappback.dto.TaskDto;
import com.sofkau.webdevappback.entity.Category;
import com.sofkau.webdevappback.entity.Task;
import com.sofkau.webdevappback.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:3000")
public class CategoryController {

    @Autowired
    private CategoryService service;

    @GetMapping("get/categories")
    public List<CategoryDto> getAllCategories(){
        return service.findAllCategories();
    };

    @PostMapping("create/category")
    public CategoryDto createCategory(@RequestBody CategoryDto category){
        return service.createCategory(category);
    };

    @PostMapping("create/task")
    public CategoryDto createTask(@RequestBody TaskDto task){
        return service.createTask(task);
    };


    @PutMapping("update/task")
    public TaskDto updateTask(@RequestBody TaskDto task){
        return service.editTasks(task);
    };

    @DeleteMapping("delete/category")
    public void deleteCategory(@RequestBody CategoryDto category){
        service.deleteCategory(category);
    };

    @DeleteMapping("delete/task")
    public void deleteTask(@RequestBody TaskDto task){
        service.deleteTask(task);
    };

}
