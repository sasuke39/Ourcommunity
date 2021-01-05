package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.pojo.Invitation;

public interface InvitationMapper {
    int deleteByPrimaryKey(Integer invId);

    int insert(Invitation record);

    int insertSelective(Invitation record);

    Invitation selectByPrimaryKey(Integer invId);

    int updateByPrimaryKeySelective(Invitation record);

    int updateByPrimaryKey(Invitation record);
}