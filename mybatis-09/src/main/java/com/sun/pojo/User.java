package com.sun.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author SunHao
 * @Date 2020/9/15 23:22
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = -3694636967062838808L;
    private int id;
    private String name;
    private String pwd;
}
