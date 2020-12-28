package com.atguigu.spingcloud.Controller;

import com.atguigu.spingcloud.Service.UserService;
import com.atguigu.spingcloud.pojo.User;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j  //日志
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Value("${server.port}")
    private String serverPort;
    @Resource
    private UserService userService;

    @Resource
    private DiscoveryClient discoveryClient;
    //前后端分离，所以不能直接返回对象，数据要先经过CommonResult封装再返回
    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody User user){//RequestBody注解可以将请求体中对对应的JSON字符串绑定到相应的Bean上
        int result = userService.create(user);
        logger.info("******插入的数据为：" + user);
        logger.info("******插入结果：" + result);

        if(result > 0){
            //插入成功
            return new CommonResult(200, "插入数据库成功,serverPort:"+serverPort, result);
        }else{
            return new CommonResult(444, "插入数据库失败,serverPort:"+serverPort);
        }
    }
    @GetMapping("/user/get/{id}")
    public CommonResult getUserById(@PathVariable("id") Long id){
        User user = userService.getUserById(id);
        logger.info("******查询结果：" + user);

        if(user != null){
            //查询成功
            return new CommonResult(200, "查询成功,serverPort:"+serverPort, user);
        }else{
            return new CommonResult(444, "没有对应记录，查询ID：,serverPort:"+serverPort+ id);
        }
    }
}
