package com.education.pojo;

import java.util.Date;

public class TZbCoursetype {
    private Integer zbId;

    private String zbName;

    private String zbCode;

    private String zbParentCode;

    private Integer zbSort;

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

    public String getZbCode() {
        return zbCode;
    }

    public void setZbCode(String zbCode) {
        this.zbCode = zbCode == null ? null : zbCode.trim();
    }

    public String getZbParentCode() {
        return zbParentCode;
    }

    public void setZbParentCode(String zbParentCode) {
        this.zbParentCode = zbParentCode == null ? null : zbParentCode.trim();
    }

    public Integer getZbSort() {
        return zbSort;
    }

    public void setZbSort(Integer zbSort) {
        this.zbSort = zbSort;
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

    @Override
    public String toString() {
        return "TZbCoursetype{" +
                "zbId=" + zbId +
                ", zbName='" + zbName + '\'' +
                ", zbCode='" + zbCode + '\'' +
                ", zbParentCode='" + zbParentCode + '\'' +
                ", zbSort=" + zbSort +
                ", zbCreateTime=" + zbCreateTime +
                ", zbUpdateTime=" + zbUpdateTime +
                '}';
    }
}