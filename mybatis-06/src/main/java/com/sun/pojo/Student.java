package com.sun.pojo;

import lombok.Data;

/**
 * @Author SunHao
 * @Date 2020/9/4 16:13
 */
@Data
public class Student {
    private int id;
    private String name;
    //学生需要关联一个老师
    private Teacher teacher;
}
