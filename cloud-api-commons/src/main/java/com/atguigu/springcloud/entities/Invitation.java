package com.atguigu.springcloud.entities;

import lombok.Data;

@Data
public class Invitation {
    Long inv_id;
    String inv_title;
    Long Inv_userId;
    String inv_content;
    Integer inv_commentsNumber;

    @Override
    public String toString() {
        return "Invitation{" +
                "inv_id=" + inv_id +
                ", inv_title='" + inv_title + '\'' +
                ", Inv_userId=" + Inv_userId +
                ", inv_content='" + inv_content + '\'' +
                ", inv_commentsNumber=" + inv_commentsNumber +
                '}';
    }
}
