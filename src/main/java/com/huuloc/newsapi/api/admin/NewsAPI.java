package com.huuloc.newsapi.api.admin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "NewsAPIOfAdmin")
public class NewsAPI {
    @PostMapping("/api/admin/news")
    public String createNews() {
        return "ok";
    }
}
