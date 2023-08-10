package com.huuloc.newsapi.api;

import com.huuloc.newsapi.dto.CategoryDTO;
import com.huuloc.newsapi.service.imp.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryAPI {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/api/category")
    public List<CategoryDTO> doGet() {
        return categoryService.findAll();
    }

    @PostMapping("/api/category")
    public CategoryDTO doPost(@RequestBody CategoryDTO categoryDTO) {
        return categoryService.save(categoryDTO);
    }

    @PutMapping("/api/category/{id}")
    public CategoryDTO doPut(@RequestBody CategoryDTO categoryDTO, @PathVariable("id") Long id) {
        categoryDTO.setId(id);
        System.out.println(categoryDTO);
        return categoryService.save(categoryDTO);
    }

    @DeleteMapping("/api/category")
    public void delete(Long[] ids) {
        categoryService.delete(ids);
    }
}
