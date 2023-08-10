package com.huuloc.newsapi.api.web;

import com.huuloc.newsapi.dto.NewsDTO;
import com.huuloc.newsapi.service.imp.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

@RestController
public class NewsAPI {
    @Autowired
    private NewsService newsService;

    @PostMapping("/api/news")
    public NewsDTO doPost(@RequestBody NewsDTO newsDTO) {
        newsDTO.setId(null);
        return newsService.save(newsDTO);
    }

    @PutMapping("api/news/{id}")
    public NewsDTO doPut(@RequestBody NewsDTO newsDTO, @PathVariable("id") Long id) {
        newsDTO.setId(id);
        return newsService.save(newsDTO);
    }

    @DeleteMapping("api/news")
    public void doDelete(@RequestBody Long[] ids) {
        newsService.delete(ids);
    }
}
