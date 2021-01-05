package com.atguigu.springcloud.resultCode;

public enum  ResultData {

    SUCCESS(200, "成功"),
    FAILED(500, "失败"),
    NOTFOUND(444, "没有对应记录，查询ID");

    private int code;
    private String desc;

    ResultData(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
