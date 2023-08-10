package com.huuloc.newsapi.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;

@Entity
@Table(name = "news")
@Getter
@Setter
public class NewsEntity extends BaseEntity {
    @Serial
    private static final long serialVersionUID = -412343424521L;

    private String title;
    @Column(name = "short_description")
    private String shortDescription;
    private String content;
    private String thumbnail;

    @ManyToOne(fetch = jakarta.persistence.FetchType.LAZY)
    @JoinColumn(name = "category_id")
    CategoryEntity category;
}
