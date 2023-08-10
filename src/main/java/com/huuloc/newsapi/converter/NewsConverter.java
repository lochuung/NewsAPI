package com.huuloc.newsapi.converter;

import com.huuloc.newsapi.dto.NewsDTO;
import com.huuloc.newsapi.entity.NewsEntity;
import org.springframework.stereotype.Component;

@Component
public class NewsConverter {
    public NewsEntity toEntity(NewsDTO newsDTO) {
        NewsEntity newsEntity = new NewsEntity();
        if (newsDTO.getId() != null) {
            newsEntity.setId(newsDTO.getId());
            newsEntity.setCreatedBy(newsDTO.getCreatedBy());
            newsEntity.setCreatedDate(newsDTO.getCreatedDate());
        }

        newsEntity.setTitle(newsDTO.getTitle());
        newsEntity.setShortDescription(newsDTO.getShortDescription());
        newsEntity.setContent(newsDTO.getContent());
        newsEntity.setThumbnail(newsDTO.getThumbnail());

        return newsEntity;
    }

    public NewsDTO toDTO(NewsEntity newsEntity) {
        NewsDTO newsDTO = new NewsDTO();

        if (newsEntity.getCategory() != null) {
            newsDTO.setCategoryCode(newsEntity.getCategory().getCode());
        }
        newsDTO.setId(newsEntity.getId());
        newsDTO.setTitle(newsEntity.getTitle());
        newsDTO.setShortDescription(newsEntity.getShortDescription());
        newsDTO.setContent(newsEntity.getContent());
        newsDTO.setThumbnail(newsEntity.getThumbnail());
        newsDTO.setCreatedBy(newsEntity.getCreatedBy());
        newsDTO.setCreatedDate(newsEntity.getCreatedDate());
        newsDTO.setModifiedBy(newsEntity.getModifiedBy());
        newsDTO.setModifiedDate(newsEntity.getModifiedDate());

        return newsDTO;
    }
}
