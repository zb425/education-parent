package com.education.pojo;

import java.util.Date;

public class TZbDiscussionCircle {
    private Integer zbId;

    private String zbCircleUsername;

    private String zbCircleContent;

    private String zbCircleImage;

    private Integer zbCircleDiscussionid;

    private Integer zbCircleAuthority;

    private Date zbCreateTime;

    private Date zbUpdateTime;

    public Integer getZbId() {
        return zbId;
    }

    public void setZbId(Integer zbId) {
        this.zbId = zbId;
    }

    public String getZbCircleUsername() {
        return zbCircleUsername;
    }

    public void setZbCircleUsername(String zbCircleUsername) {
        this.zbCircleUsername = zbCircleUsername == null ? null : zbCircleUsername.trim();
    }

    public String getZbCircleContent() {
        return zbCircleContent;
    }

    public void setZbCircleContent(String zbCircleContent) {
        this.zbCircleContent = zbCircleContent == null ? null : zbCircleContent.trim();
    }

    public String getZbCircleImage() {
        return zbCircleImage;
    }

    public void setZbCircleImage(String zbCircleImage) {
        this.zbCircleImage = zbCircleImage == null ? null : zbCircleImage.trim();
    }

    public Integer getZbCircleDiscussionid() {
        return zbCircleDiscussionid;
    }

    public void setZbCircleDiscussionid(Integer zbCircleDiscussionid) {
        this.zbCircleDiscussionid = zbCircleDiscussionid;
    }

    public Integer getZbCircleAuthority() {
        return zbCircleAuthority;
    }

    public void setZbCircleAuthority(Integer zbCircleAuthority) {
        this.zbCircleAuthority = zbCircleAuthority;
    }

    public Date getZbCreateTime() {
        return zbCreateTime;
    }

    public void setZbCreateTime(Date zbCreateTime) {
        this.zbCreateTime = zbCreateTime;
    }

    public Date getZbUpdateTime() {
        return zbUpdateTime;
    }

    public void setZbUpdateTime(Date zbUpdateTime) {
        this.zbUpdateTime = zbUpdateTime;
    }
}