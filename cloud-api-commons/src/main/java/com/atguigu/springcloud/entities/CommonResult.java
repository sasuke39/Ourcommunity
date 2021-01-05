package com.atguigu.springcloud.entities;

import com.atguigu.springcloud.resultCode.ResultData;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data   //set/get方法
//@AllArgsConstructor //有参构造器
@NoArgsConstructor  //无参构造器
public class CommonResult<T> {
    private ResultData code;
    private String message;
    private T data;
    private String serverPort;

    public CommonResult(ResultData code,String message,String serverPort,T data){
        this(code, message, serverPort);
        this.data=data;
    }

    public CommonResult(ResultData code,String message,String serverPort){
        this.code=code;
        this.message=message;
        this.serverPort=serverPort;
    }


}
