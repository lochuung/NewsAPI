package com.huuloc.newsapi.service.imp;

import com.huuloc.newsapi.converter.CategoryConverter;
import com.huuloc.newsapi.dto.CategoryDTO;
import com.huuloc.newsapi.entity.CategoryEntity;
import com.huuloc.newsapi.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImp implements com.huuloc.newsapi.service.CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private CategoryConverter categoryConverter;


    @Override
    public CategoryDTO save(CategoryDTO categoryDTO) {
        if (categoryDTO.getId() != null) {
            CategoryEntity oldCategoryEntity = categoryRepository
                    .findById(categoryDTO.getId())
                    .orElseThrow(() -> new RuntimeException("Category not found"));

            categoryDTO.setCreatedDate(oldCategoryEntity.getCreatedDate());
            categoryDTO.setCreatedBy(oldCategoryEntity.getCreatedBy());
        }
        CategoryEntity categoryEntity = categoryConverter.toEntity(categoryDTO);
        categoryEntity = categoryRepository.save(categoryEntity);

        return categoryConverter.toDTO(categoryEntity);
    }

    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            categoryRepository.deleteById(id);
        }
    }

    @Override
    public List<CategoryDTO> findAll() {
        List<CategoryEntity> categories = categoryRepository.findAll();
        return categories.stream()
                .map((entity) -> categoryConverter.toDTO(entity))
                .toList();
    }
}
