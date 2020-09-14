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

    List<Blog> queryBlogChoose(Map map);

    //更新博客
    int updateBlog(Map map);

    //查询第1-2-3号记录的博客
    List<Blog> queryBlogForeach(Map map);
}
