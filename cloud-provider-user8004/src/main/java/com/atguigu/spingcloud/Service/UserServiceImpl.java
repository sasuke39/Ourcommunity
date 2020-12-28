package com.atguigu.spingcloud.Service;

import com.atguigu.spingcloud.dao.UserMapper;
import com.atguigu.spingcloud.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;
    @Override
    public int create(User user) {
        return userMapper.insert(user);
    }

    @Override
    public User getUserById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int deleteById(Long id) {
        return userMapper.deleteByPrimaryKey(id);
    }
}
