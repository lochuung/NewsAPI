package com.huuloc.newsapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.util.List;

@Entity
@Table(name = "category")
@Getter
@Setter
public class CategoryEntity extends BaseEntity {
    @Serial
    private static final long serialVersionUID = 3249858982432L;
    private String name;
    private String code;
    @OneToMany(mappedBy = "category")
    List<NewsEntity> news;

}
