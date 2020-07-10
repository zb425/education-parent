package com.education.pojo;

import java.util.Date;

public class TZbDatabank {
    private Integer zbId;

    private String zbDatabankName;

    private String zbDatabankUsername;

    private String zbDatabankUrl;

    private Integer zbDatabankCount;

    private Integer zbDatabankAuthority;

    private Date zbCreateTime;

    private Date zbUpdateTime;

    public Integer getZbId() {
        return zbId;
    }

    public void setZbId(Integer zbId) {
        this.zbId = zbId;
    }

    public String getZbDatabankName() {
        return zbDatabankName;
    }

    public void setZbDatabankName(String zbDatabankName) {
        this.zbDatabankName = zbDatabankName == null ? null : zbDatabankName.trim();
    }

    public String getZbDatabankUsername() {
        return zbDatabankUsername;
    }

    public void setZbDatabankUsername(String zbDatabankUsername) {
        this.zbDatabankUsername = zbDatabankUsername == null ? null : zbDatabankUsername.trim();
    }

    public String getZbDatabankUrl() {
        return zbDatabankUrl;
    }

    public void setZbDatabankUrl(String zbDatabankUrl) {
        this.zbDatabankUrl = zbDatabankUrl == null ? null : zbDatabankUrl.trim();
    }

    public Integer getZbDatabankCount() {
        return zbDatabankCount;
    }

    public void setZbDatabankCount(Integer zbDatabankCount) {
        this.zbDatabankCount = zbDatabankCount;
    }

    public Integer getZbDatabankAuthority() {
        return zbDatabankAuthority;
    }

    public void setZbDatabankAuthority(Integer zbDatabankAuthority) {
        this.zbDatabankAuthority = zbDatabankAuthority;
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