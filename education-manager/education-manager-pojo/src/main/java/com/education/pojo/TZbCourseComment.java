package com.education.pojo;

import java.util.Date;

public class TZbCourseComment {
    private Integer zbId;

    private String zbUsername;

    private String zbToUsername;

    private Integer zbCourseId;

    private Integer zbSectionId;

    private String zbSectionTitle;

    private String zbContent;

    private Integer zbRefId;

    private String zbRefContent;

    private Byte zbType;

    private Date zbCreateTime;

    private Date zbUpdateTime;

    public Integer getZbId() {
        return zbId;
    }

    public void setZbId(Integer zbId) {
        this.zbId = zbId;
    }

    public String getZbUsername() {
        return zbUsername;
    }

    public void setZbUsername(String zbUsername) {
        this.zbUsername = zbUsername == null ? null : zbUsername.trim();
    }

    public String getZbToUsername() {
        return zbToUsername;
    }

    public void setZbToUsername(String zbToUsername) {
        this.zbToUsername = zbToUsername == null ? null : zbToUsername.trim();
    }

    public Integer getZbCourseId() {
        return zbCourseId;
    }

    public void setZbCourseId(Integer zbCourseId) {
        this.zbCourseId = zbCourseId;
    }

    public Integer getZbSectionId() {
        return zbSectionId;
    }

    public void setZbSectionId(Integer zbSectionId) {
        this.zbSectionId = zbSectionId;
    }

    public String getZbSectionTitle() {
        return zbSectionTitle;
    }

    public void setZbSectionTitle(String zbSectionTitle) {
        this.zbSectionTitle = zbSectionTitle == null ? null : zbSectionTitle.trim();
    }

    public String getZbContent() {
        return zbContent;
    }

    public void setZbContent(String zbContent) {
        this.zbContent = zbContent == null ? null : zbContent.trim();
    }

    public Integer getZbRefId() {
        return zbRefId;
    }

    public void setZbRefId(Integer zbRefId) {
        this.zbRefId = zbRefId;
    }

    public String getZbRefContent() {
        return zbRefContent;
    }

    public void setZbRefContent(String zbRefContent) {
        this.zbRefContent = zbRefContent == null ? null : zbRefContent.trim();
    }

    public Byte getZbType() {
        return zbType;
    }

    public void setZbType(Byte zbType) {
        this.zbType = zbType;
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