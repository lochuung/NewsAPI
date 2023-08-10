package com.huuloc.newsapi.entity;

import jakarta.persistence.*;

import java.io.Serial;
import java.util.List;

@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity {
    @Serial
    private static final long serialVersionUID = 94327598321L;

    private String username;
    private String password;
    private Integer status;

    @ManyToMany
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    List<RoleEntity> roles;
}
