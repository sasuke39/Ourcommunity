package com.atguigu.spingcloud.Service;

import com.atguigu.spingcloud.pojo.User;
import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    int create(User payment);
    User getUserById(@Param("id") Long id);
    int deleteById(@Param("id") Long id);
}
