package com.huuloc.newsapi.converter;

import com.huuloc.newsapi.dto.CategoryDTO;
import com.huuloc.newsapi.entity.CategoryEntity;
import org.springframework.stereotype.Component;

@Component
public class CategoryConverter {

    public CategoryDTO toDTO(CategoryEntity entity) {
        CategoryDTO result = new CategoryDTO();

        result.setId(entity.getId());
        result.setName(entity.getName());
        result.setCode(entity.getCode());
        result.setCreatedDate(entity.getCreatedDate());
        result.setCreatedBy(entity.getCreatedBy());
        result.setModifiedDate(entity.getModifiedDate());
        result.setModifiedBy(entity.getModifiedBy());

        return result;
    }

    public CategoryEntity toEntity(CategoryDTO dto) {
        CategoryEntity result = new CategoryEntity();
        if (dto.getId() != null) {
            result.setId(dto.getId());
            result.setCreatedDate(dto.getCreatedDate());
            result.setCreatedBy(dto.getCreatedBy());
        }
        result.setName(dto.getName());
        result.setCode(dto.getCode());
        return result;
    }
}
