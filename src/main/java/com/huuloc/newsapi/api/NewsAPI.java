package com.huuloc.newsapi.api;

import com.huuloc.newsapi.dto.NewsDTO;
import com.huuloc.newsapi.service.imp.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NewsAPI {
    @Autowired
    private NewsService newsService;

    @PostMapping("/api/news")
    public NewsDTO doPost(@RequestBody NewsDTO newsDTO) {
        newsDTO.setId(null);
        return newsService.save(newsDTO);
    }

    @GetMapping("/api/news")
    public List<NewsDTO> doGet() {
        return newsService.findAll();
    }

    @GetMapping("/api/news/{id}")
    public NewsDTO doGetOne(@PathVariable("id") Long id) {
        return newsService.findOneById(id);
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
