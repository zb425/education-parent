package com.education.pojo;

import java.util.Date;

public class TZbDiscussion {
    private Integer zbId;

    private String zbName;

    private String zbUsername;

    private String zbContent;

    private String zbImage;

    private Integer zbCircle;

    private Integer zbRead;

    private Integer zbAuthority;

    private Date zbCreateTime;

    private Date zbUpdateTime;

    public Integer getZbId() {
        return zbId;
    }

    public void setZbId(Integer zbId) {
        this.zbId = zbId;
    }

    public String getZbName() {
        return zbName;
    }

    public void setZbName(String zbName) {
        this.zbName = zbName == null ? null : zbName.trim();
    }

    public String getZbUsername() {
        return zbUsername;
    }

    public void setZbUsername(String zbUsername) {
        this.zbUsername = zbUsername == null ? null : zbUsername.trim();
    }

    public String getZbContent() {
        return zbContent;
    }

    public void setZbContent(String zbContent) {
        this.zbContent = zbContent == null ? null : zbContent.trim();
    }

    public String getZbImage() {
        return zbImage;
    }

    public void setZbImage(String zbImage) {
        this.zbImage = zbImage == null ? null : zbImage.trim();
    }

    public Integer getZbCircle() {
        return zbCircle;
    }

    public void setZbCircle(Integer zbCircle) {
        this.zbCircle = zbCircle;
    }

    public Integer getZbRead() {
        return zbRead;
    }

    public void setZbRead(Integer zbRead) {
        this.zbRead = zbRead;
    }

    public Integer getZbAuthority() {
        return zbAuthority;
    }

    public void setZbAuthority(Integer zbAuthority) {
        this.zbAuthority = zbAuthority;
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