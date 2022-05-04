package com.sofkau.webdevappback.service;


import com.sofkau.webdevappback.dao.CategoryDaoImplementation;
import com.sofkau.webdevappback.entity.Category;
import com.sofkau.webdevappback.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryDaoImplementation categoryDao;


    public List<Category> findAllCategories() {
        return categoryDao.findAllCategories();
    }

    public Category createCategory(Category category) {
        return categoryDao.createCategory(category);
    }


    public Category createTasks(Task task) {
       return categoryDao.createTasks(task);
    }

    public void deleteTasks(Task task) {
        categoryDao.deleteTasks(task);

    }


    public void deleteCategory(Category category) {
        categoryDao.deleteCategory(category);

    }

}
