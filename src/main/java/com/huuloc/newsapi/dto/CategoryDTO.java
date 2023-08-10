package com.huuloc.newsapi.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;

@Getter
@Setter
@ToString
public class CategoryDTO extends BaseDTO {
    @Serial
    private static final long serialVersionUID = -54358794332453L;
    private String name;
    private String code;
}
