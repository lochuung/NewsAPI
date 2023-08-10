package com.huuloc.newsapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.io.Serial;
import java.util.List;

@Entity
@Table(name = "role")
public class RoleEntity extends BaseEntity {

    @Serial
    private static final long serialVersionUID = 94327598432L;

    private String name;
    private String code;

    @ManyToMany(mappedBy = "roles")
    List<UserEntity> users;
}
