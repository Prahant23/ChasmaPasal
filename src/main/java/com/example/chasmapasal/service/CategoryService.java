package  com.example.chasmapasal.service;

import  com.example.chasmapasal.entity.Category;

import java.util.List;


public interface CategoryService {

    void save(Category category);
    List<Category> findAll();
}
