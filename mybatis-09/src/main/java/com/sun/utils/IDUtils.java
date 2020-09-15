package com.sun.utils;

import org.junit.Test;

import java.util.UUID;

/**
 * @Author SunHao
 * @Date 2020/9/7 23:01
 */
public class IDUtils {

    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    @Test
    public void test(){
        System.out.println(IDUtils.getId());
    }
}
