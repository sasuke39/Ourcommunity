package com.atguigu.springcloud.Service;

import com.atguigu.springcloud.dao.InvitationMapper;
import com.atguigu.springcloud.pojo.Invitation;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class InvitationServiceImpl implements InvitationService {

    @Resource
    InvitationMapper invitationMapper;
    @Override
    public int createInvitation(Invitation invitation) {
        return invitationMapper.insert(invitation);
    }

    @Override
    public Invitation getInvitationById(Integer id) {
        return invitationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int deleteInvitationById(Integer id) {
        return invitationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateInvitation(Invitation invitation) {
        return invitationMapper.updateByPrimaryKey(invitation);
    }
}
