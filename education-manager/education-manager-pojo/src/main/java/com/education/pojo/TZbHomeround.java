package com.education.pojo;

import java.util.Date;

public class TZbHomeround {
    private Integer zbId;

    private String zbName;

    private String zbPicture;

    private String zbUrl;

    private Integer zbWeight;

    private Boolean zbEnable;

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

    public String getZbPicture() {
        return zbPicture;
    }

    public void setZbPicture(String zbPicture) {
        this.zbPicture = zbPicture == null ? null : zbPicture.trim();
    }

    public String getZbUrl() {
        return zbUrl;
    }

    public void setZbUrl(String zbUrl) {
        this.zbUrl = zbUrl == null ? null : zbUrl.trim();
    }

    public Integer getZbWeight() {
        return zbWeight;
    }

    public void setZbWeight(Integer zbWeight) {
        this.zbWeight = zbWeight;
    }

    public Boolean getZbEnable() {
        return zbEnable;
    }

    public void setZbEnable(Boolean zbEnable) {
        this.zbEnable = zbEnable;
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