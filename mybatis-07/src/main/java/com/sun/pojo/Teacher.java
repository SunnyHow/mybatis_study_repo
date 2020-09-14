package com.sun.pojo;

import lombok.Data;

import java.util.List;

/**
 * @Author SunHao
 * @Date 2020/9/4 16:14
 */
@Data
public class Teacher {
    private int id;
    private String name;

    //一个老师可以拥有多个学生
    private List<Student> students;
}
