package com.sun.dao;

import com.sun.pojo.Student;

import java.util.List;

/**
 * @Author SunHao
 * @Date 2020/9/4 16:16
 */
public interface StudentMapper {
    //查询所有的学生信息，以及对应的老师的信息
    public List<Student> getStudent();
    public List<Student> getStudent2();
}
