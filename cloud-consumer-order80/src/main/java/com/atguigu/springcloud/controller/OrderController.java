package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.entities.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import sun.rmi.runtime.Log;

import javax.annotation.Resource;
import javax.sound.midi.Patch;

@RestController
public class OrderController {
    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);


    public static final String PAYMENT_URL="http://CLOUD-PAYMENT-SERVICE";

    public static final String USER_URL="http://CLOUD-USER-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        logger.info("********插入的数据：" + payment);
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id")Long id){
        logger.info("*******查询的id："+id);
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }
    @GetMapping("/consumer/payment/getServices")
    public Object getServices(){
        logger.info("****consumer get services:");
        return restTemplate.getForObject(PAYMENT_URL+"/payment/discovery",Object.class);
    }
    @GetMapping("/consumer/user/get/{id}")
    public CommonResult<User> getUser(@PathVariable("id")Long id){
        logger.info("******查询的用户id："+id);
        Assert.notNull(id,"id不能为空！");
        return restTemplate.getForObject(USER_URL+"/user/get/"+id,CommonResult.class);
    }
}
