package com.huuloc.newsapi.service.imp;

import com.huuloc.newsapi.converter.NewsConverter;
import com.huuloc.newsapi.dto.NewsDTO;
import com.huuloc.newsapi.entity.CategoryEntity;
import com.huuloc.newsapi.entity.NewsEntity;
import com.huuloc.newsapi.repository.CategoryRepository;
import com.huuloc.newsapi.repository.NewsRepository;
import com.huuloc.newsapi.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class NewsService implements INewsService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private NewsRepository newsRepository;
    @Autowired
    private NewsConverter converter;

    @Override
    public NewsDTO save(NewsDTO newsDTO) {
        if (newsDTO.getId() != null) {
            NewsEntity oldNewsEntity = newsRepository
                    .findById(newsDTO.getId())
                    .orElseThrow(() -> new RuntimeException("This news not found"));
            newsDTO.setCreatedDate(oldNewsEntity.getCreatedDate());
            newsDTO.setCreatedBy(oldNewsEntity.getCreatedBy());
        }

        NewsEntity newsEntity = converter.toEntity(newsDTO);

        CategoryEntity categoryEntity = categoryRepository.findOneByCode(newsDTO.getCategoryCode());
        newsEntity.setCategory(categoryEntity);

        newsEntity = newsRepository.save(newsEntity);

        return converter.toDTO(newsEntity);
    }

    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            newsRepository.deleteById(id);
        }
    }

    @Override
    public List<NewsDTO> findAll() {
        List<NewsEntity> newsEntities = newsRepository.findAll();
        return newsEntities.stream()
                .map(item -> converter.toDTO(item))
                .toList();
    }

    @Override
    public NewsDTO findOneById(Long id) {
        NewsEntity news = newsRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("This news not found"));
        return converter.toDTO(news);
    }
}
