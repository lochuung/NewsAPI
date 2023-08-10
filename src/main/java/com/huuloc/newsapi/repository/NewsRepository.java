package com.huuloc.newsapi.repository;

import com.huuloc.newsapi.entity.CategoryEntity;
import com.huuloc.newsapi.entity.NewsEntity;
import com.huuloc.newsapi.service.imp.NewsService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends JpaRepository<NewsEntity, Long> {
    NewsEntity findOneById(Long id);
}
