package com.huuloc.newsapi.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.io.Serial;

@Component
@Getter
@Setter
public class NewsDTO extends BaseDTO {
    @Serial
    private static final long serialVersionUID = 23432535234321431L;

    private String title;
    private String shortDescription;
    private String content;
    private String thumbnail;
    private String categoryCode;
}
