package com.atguigu.springcloud.entities;

import lombok.Data;

@Data
public class Comment {
    Long com_id;
    Long com_userId;
    Long com_invitationId;
    Integer com_likesNumber;
    String com_content;
    Integer com_floodsNumber;
}
