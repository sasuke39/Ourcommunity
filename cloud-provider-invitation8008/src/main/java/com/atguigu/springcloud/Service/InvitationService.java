package com.atguigu.springcloud.Service;

import com.atguigu.springcloud.pojo.Invitation;
import org.apache.ibatis.annotations.Param;

public interface InvitationService {
    int createInvitation(Invitation invitation);
    Invitation getInvitationById(@Param("id") Integer id);
    int deleteInvitationById(@Param("id") Integer id);
    int updateInvitation(@Param("invitation") Invitation invitation);
}
