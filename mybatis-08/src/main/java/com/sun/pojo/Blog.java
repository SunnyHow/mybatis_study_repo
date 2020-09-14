package com.sun.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Author SunHao
 * @Date 2020/9/7 9:25
 */
@Data
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime;    //属性名和字段名不一致，
    private int views;
}
