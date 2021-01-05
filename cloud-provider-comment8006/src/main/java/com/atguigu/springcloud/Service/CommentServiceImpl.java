package com.atguigu.springcloud.Service;

import com.atguigu.springcloud.dao.CommentMapper;
import com.atguigu.springcloud.pojo.Comment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CommentServiceImpl implements CommentService {

    @Resource
    CommentMapper commentMapper;
    @Override
    public int create(Comment comment) {
        return commentMapper.insert(comment);
    }

    @Override
    public Comment getUserById(Long id) {
        return commentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int deleteById(Long id) {
        return commentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int update(Comment comment) {
        return commentMapper.updateByPrimaryKey(comment);
    }
}
