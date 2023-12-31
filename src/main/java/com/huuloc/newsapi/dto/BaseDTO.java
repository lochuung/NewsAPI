package com.huuloc.newsapi.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public abstract class BaseDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 5435234321431L;
    private Long id;
    private Date createdDate;
    private String createdBy;
    private Date modifiedDate;
    private String modifiedBy;
}
