package com.sun.dao;

import com.sun.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @Author SunHao
 * @Date 2020/9/15 23:23
 */
public interface UserMapper {

    //根据id查询用户
    User queryUserById(@Param("id") int id);
}
