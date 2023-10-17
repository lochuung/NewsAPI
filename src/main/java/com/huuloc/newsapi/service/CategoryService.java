package com.huuloc.newsapi.service;

import com.huuloc.newsapi.dto.CategoryDTO;

import java.util.List;

public interface CategoryService {
    CategoryDTO save(CategoryDTO categoryDTO);
    void delete(Long[] ids);
    List<CategoryDTO> findAll();
}
