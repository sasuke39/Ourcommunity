package com.atguigu.spingcloud.pojo;

public class User {
    private Long userId;

    private String userUsername;

    private String userPhonenumber;

    private Integer userFollowingnumber;

    private Integer userFollowersnumber;

    private String userExtends1;

    private String userExtends2;

    private String userExtends3;

    private String userExtends4;

    private String userExtends5;

    private String userExtends6;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserUsername() {
        return userUsername;
    }

    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername == null ? null : userUsername.trim();
    }

    public String getUserPhonenumber() {
        return userPhonenumber;
    }

    public void setUserPhonenumber(String userPhonenumber) {
        this.userPhonenumber = userPhonenumber == null ? null : userPhonenumber.trim();
    }

    public Integer getUserFollowingnumber() {
        return userFollowingnumber;
    }

    public void setUserFollowingnumber(Integer userFollowingnumber) {
        this.userFollowingnumber = userFollowingnumber;
    }

    public Integer getUserFollowersnumber() {
        return userFollowersnumber;
    }

    public void setUserFollowersnumber(Integer userFollowersnumber) {
        this.userFollowersnumber = userFollowersnumber;
    }

    public String getUserExtends1() {
        return userExtends1;
    }

    public void setUserExtends1(String userExtends1) {
        this.userExtends1 = userExtends1 == null ? null : userExtends1.trim();
    }

    public String getUserExtends2() {
        return userExtends2;
    }

    public void setUserExtends2(String userExtends2) {
        this.userExtends2 = userExtends2 == null ? null : userExtends2.trim();
    }

    public String getUserExtends3() {
        return userExtends3;
    }

    public void setUserExtends3(String userExtends3) {
        this.userExtends3 = userExtends3 == null ? null : userExtends3.trim();
    }

    public String getUserExtends4() {
        return userExtends4;
    }

    public void setUserExtends4(String userExtends4) {
        this.userExtends4 = userExtends4 == null ? null : userExtends4.trim();
    }

    public String getUserExtends5() {
        return userExtends5;
    }

    public void setUserExtends5(String userExtends5) {
        this.userExtends5 = userExtends5 == null ? null : userExtends5.trim();
    }

    public String getUserExtends6() {
        return userExtends6;
    }

    public void setUserExtends6(String userExtends6) {
        this.userExtends6 = userExtends6 == null ? null : userExtends6.trim();
    }
}