package com.huuloc.newsapi.controller;

import com.huuloc.newsapi.dto.CategoryDTO;
import com.huuloc.newsapi.service.imp.CategoryServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    private CategoryServiceImp categoryServiceImp;

    @GetMapping("/api/category")
    public List<CategoryDTO> doGet() {
        return categoryServiceImp.findAll();
    }

    @PostMapping("/api/category")
    public CategoryDTO doPost(@RequestBody CategoryDTO categoryDTO) {
        return categoryServiceImp.save(categoryDTO);
    }

    @PutMapping("/api/category/{id}")
    public CategoryDTO doPut(@RequestBody CategoryDTO categoryDTO, @PathVariable("id") Long id) {
        categoryDTO.setId(id);
        System.out.println(categoryDTO);
        return categoryServiceImp.save(categoryDTO);
    }

    @DeleteMapping("/api/category")
    public void delete(Long[] ids) {
        categoryServiceImp.delete(ids);
    }
}
