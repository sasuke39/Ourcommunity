package com.atguigu.springcloud.pojo;

public class Comment {
    private Integer comId;

    private Integer comUserid;

    private Integer comInvitationid;

    private Integer comLikesnumber;

    private String comContent;

    private String comExtends1;

    private String comExtends2;

    private String comExtends3;

    private String comExtends4;

    private Integer comFloodsnumber;

    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
    }

    public Integer getComUserid() {
        return comUserid;
    }

    public void setComUserid(Integer comUserid) {
        this.comUserid = comUserid;
    }

    public Integer getComInvitationid() {
        return comInvitationid;
    }

    public void setComInvitationid(Integer comInvitationid) {
        this.comInvitationid = comInvitationid;
    }

    public Integer getComLikesnumber() {
        return comLikesnumber;
    }

    public void setComLikesnumber(Integer comLikesnumber) {
        this.comLikesnumber = comLikesnumber;
    }

    public String getComContent() {
        return comContent;
    }

    public void setComContent(String comContent) {
        this.comContent = comContent == null ? null : comContent.trim();
    }

    public String getComExtends1() {
        return comExtends1;
    }

    public void setComExtends1(String comExtends1) {
        this.comExtends1 = comExtends1 == null ? null : comExtends1.trim();
    }

    public String getComExtends2() {
        return comExtends2;
    }

    public void setComExtends2(String comExtends2) {
        this.comExtends2 = comExtends2 == null ? null : comExtends2.trim();
    }

    public String getComExtends3() {
        return comExtends3;
    }

    public void setComExtends3(String comExtends3) {
        this.comExtends3 = comExtends3 == null ? null : comExtends3.trim();
    }

    public String getComExtends4() {
        return comExtends4;
    }

    public void setComExtends4(String comExtends4) {
        this.comExtends4 = comExtends4 == null ? null : comExtends4.trim();
    }

    public Integer getComFloodsnumber() {
        return comFloodsnumber;
    }

    public void setComFloodsnumber(Integer comFloodsnumber) {
        this.comFloodsnumber = comFloodsnumber;
    }
}