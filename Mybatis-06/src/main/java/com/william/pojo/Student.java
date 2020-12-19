package com.william.pojo;


import lombok.Data;

@Data
public class Student {
    private int id;
    private String name;

    private Teacher teacher;
}
