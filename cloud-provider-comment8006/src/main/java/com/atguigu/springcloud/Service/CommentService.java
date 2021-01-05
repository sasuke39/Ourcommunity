package com.atguigu.springcloud.Service;

import com.atguigu.springcloud.pojo.Comment;
import org.apache.ibatis.annotations.Param;

public interface CommentService {
    int create(Comment comment);
    Comment getUserById(@Param("id") Long id);
    int deleteById(@Param("id") Long id);
    int update(@Param("comment") Comment comment);
}
