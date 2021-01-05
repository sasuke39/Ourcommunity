package com.atguigu.springcloud.pojo;

public class Invitation {
    private Integer invId;

    private String invTitle;

    private Integer invUserid;

    private String invContent;

    private Integer invCommentsnubmer;

    public Integer getInvId() {
        return invId;
    }

    public void setInvId(Integer invId) {
        this.invId = invId;
    }

    public String getInvTitle() {
        return invTitle;
    }

    public void setInvTitle(String invTitle) {
        this.invTitle = invTitle == null ? null : invTitle.trim();
    }

    public Integer getInvUserid() {
        return invUserid;
    }

    public void setInvUserid(Integer invUserid) {
        this.invUserid = invUserid;
    }

    public String getInvContent() {
        return invContent;
    }

    public void setInvContent(String invContent) {
        this.invContent = invContent == null ? null : invContent.trim();
    }

    public Integer getInvCommentsnubmer() {
        return invCommentsnubmer;
    }

    public void setInvCommentsnubmer(Integer invCommentsnubmer) {
        this.invCommentsnubmer = invCommentsnubmer;
    }
}