package com.sun.dao;

import com.sun.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @Author SunHao
 * @Date 2020/9/7 22:57
 */
public interface BlogMapper {

    //插入博客
    int insertBlog(Blog blog);

    //查询博客
    List<Blog> queryBlogIF(Map map);
}
