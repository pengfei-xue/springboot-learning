package com.example.demo.entity;

import lombok.Data;

import java.sql.Date;

@Data
public class User {
    private long id;
    private String name;
    private long departmentId;
    private Date createTime;
}