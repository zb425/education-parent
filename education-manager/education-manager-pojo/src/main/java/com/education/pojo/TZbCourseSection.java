package com.education.pojo;

import java.util.Date;

public class TZbCourseSection {
    private Integer zbId;

    private Integer zbCourseId;

    private Integer zbParentId;

    private String zbName;

    private Integer zbSort;

    private String zbTime;

    private Boolean zbOnsale;

    private String zbVideoUrl;

    private Date zbCreateTime;

    private Date zbUpdateTime;

    public Integer getZbId() {
        return zbId;
    }

    public void setZbId(Integer zbId) {
        this.zbId = zbId;
    }

    public Integer getZbCourseId() {
        return zbCourseId;
    }

    public void setZbCourseId(Integer zbCourseId) {
        this.zbCourseId = zbCourseId;
    }

    public Integer getZbParentId() {
        return zbParentId;
    }

    public void setZbParentId(Integer zbParentId) {
        this.zbParentId = zbParentId;
    }

    public String getZbName() {
        return zbName;
    }

    public void setZbName(String zbName) {
        this.zbName = zbName == null ? null : zbName.trim();
    }

    public Integer getZbSort() {
        return zbSort;
    }

    public void setZbSort(Integer zbSort) {
        this.zbSort = zbSort;
    }

    public String getZbTime() {
        return zbTime;
    }

    public void setZbTime(String zbTime) {
        this.zbTime = zbTime == null ? null : zbTime.trim();
    }

    public Boolean getZbOnsale() {
        return zbOnsale;
    }

    public void setZbOnsale(Boolean zbOnsale) {
        this.zbOnsale = zbOnsale;
    }

    public String getZbVideoUrl() {
        return zbVideoUrl;
    }

    public void setZbVideoUrl(String zbVideoUrl) {
        this.zbVideoUrl = zbVideoUrl == null ? null : zbVideoUrl.trim();
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