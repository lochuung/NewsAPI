package com.huuloc.newsapi.service;

import com.huuloc.newsapi.dto.NewsDTO;

import java.util.List;

public interface INewsService {
    NewsDTO save(NewsDTO newsDTO);

    void delete(Long[] ids);

    List<NewsDTO> findAll();
    NewsDTO findOneById(Long id);
}
