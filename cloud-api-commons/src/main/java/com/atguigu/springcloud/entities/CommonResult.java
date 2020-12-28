package com.atguigu.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data   //set/get方法
//@AllArgsConstructor //有参构造器
@NoArgsConstructor  //无参构造器
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code,String message,T data){
        this.code=code;
        this.message=message;
        this.data=data;
    }

    public CommonResult(Integer code,String message){
        this.code=code;
        this.message=message;

    }

}
