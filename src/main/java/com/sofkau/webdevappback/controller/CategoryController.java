package com.sofkau.webdevappback.controller;

import com.sofkau.webdevappback.entity.Category;
import com.sofkau.webdevappback.entity.Task;
import com.sofkau.webdevappback.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("api/")
public class CategoryController {

    @Autowired
    private CategoryService service;

    @GetMapping("get/categories")
    public List<Category> getAllCategories(){
        return service.findAllCategories();
    };

    @PostMapping("create/category")
    public Category createCategory(@RequestBody Category category){
        return service.createCategory(category);
    };

    @PostMapping("create/task")
    public Category createTask(@RequestBody Task task){
        return service.createTasks(task);
    };

    @DeleteMapping("delete/category")
    public void deleteCategory(@RequestBody Category category){
        service.deleteCategory(category);
    };

    @DeleteMapping("delete/task")
    public void deleteTask(@RequestBody Task task){
        service.deleteTasks(task);
    };

}
