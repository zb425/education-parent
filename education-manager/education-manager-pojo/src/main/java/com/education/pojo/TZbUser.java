package com.education.pojo;

import java.util.Date;

public class TZbUser {
    private Integer zbId;

    private String zbRealname;

    private String zbUsername;

    private String zbPassword;

    private Integer zbGender;

    private String zbHeader;

    private String zbMobile;

    private Integer zbStatus;

    private String zbEducation;

    private String zbCollegeName;

    private String zbTitle;

    private String zbProvince;

    private String zbCity;

    private String zbDistrict;

    private Integer zbWeight;

    private Date zbCreateTime;

    private Date zbUpdateTime;

    public Integer getZbId() {
        return zbId;
    }

    public void setZbId(Integer zbId) {
        this.zbId = zbId;
    }

    public String getZbRealname() {
        return zbRealname;
    }

    public void setZbRealname(String zbRealname) {
        this.zbRealname = zbRealname == null ? null : zbRealname.trim();
    }

    public String getZbUsername() {
        return zbUsername;
    }

    public void setZbUsername(String zbUsername) {
        this.zbUsername = zbUsername == null ? null : zbUsername.trim();
    }

    public String getZbPassword() {
        return zbPassword;
    }

    public void setZbPassword(String zbPassword) {
        this.zbPassword = zbPassword == null ? null : zbPassword.trim();
    }

    public Integer getZbGender() {
        return zbGender;
    }

    public void setZbGender(Integer zbGender) {
        this.zbGender = zbGender;
    }

    public String getZbHeader() {
        return zbHeader;
    }

    public void setZbHeader(String zbHeader) {
        this.zbHeader = zbHeader == null ? null : zbHeader.trim();
    }

    public String getZbMobile() {
        return zbMobile;
    }

    public void setZbMobile(String zbMobile) {
        this.zbMobile = zbMobile == null ? null : zbMobile.trim();
    }

    public Integer getZbStatus() {
        return zbStatus;
    }

    public void setZbStatus(Integer zbStatus) {
        this.zbStatus = zbStatus;
    }


    public String getZbEducation() {
        return zbEducation;
    }

    public void setZbEducation(String zbEducation) {
        this.zbEducation = zbEducation == null ? null : zbEducation.trim();
    }

    public String getZbCollegeName() {
        return zbCollegeName;
    }

    public void setZbCollegeName(String zbCollegeName) {
        this.zbCollegeName = zbCollegeName == null ? null : zbCollegeName.trim();
    }

    public String getZbTitle() {
        return zbTitle;
    }

    public void setZbTitle(String zbTitle) {
        this.zbTitle = zbTitle == null ? null : zbTitle.trim();
    }

    public String getZbProvince() {
        return zbProvince;
    }

    public void setZbProvince(String zbProvince) {
        this.zbProvince = zbProvince == null ? null : zbProvince.trim();
    }

    public String getZbCity() {
        return zbCity;
    }

    public void setZbCity(String zbCity) {
        this.zbCity = zbCity == null ? null : zbCity.trim();
    }

    public String getZbDistrict() {
        return zbDistrict;
    }

    public void setZbDistrict(String zbDistrict) {
        this.zbDistrict = zbDistrict == null ? null : zbDistrict.trim();
    }

    public Integer getZbWeight() {
        return zbWeight;
    }

    public void setZbWeight(Integer zbWeight) {
        this.zbWeight = zbWeight;
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
        return "TZbUser{" +
                "zbId=" + zbId +
                ", zbRealname='" + zbRealname + '\'' +
                ", zbUsername='" + zbUsername + '\'' +
                ", zbPassword='" + zbPassword + '\'' +
                ", zbGender=" + zbGender +
                ", zbHeader='" + zbHeader + '\'' +
                ", zbMobile='" + zbMobile + '\'' +
                ", zbStatus=" + zbStatus +
                ", zbEducation='" + zbEducation + '\'' +
                ", zbCollegeName='" + zbCollegeName + '\'' +
                ", zbTitle='" + zbTitle + '\'' +
                ", zbProvince='" + zbProvince + '\'' +
                ", zbCity='" + zbCity + '\'' +
                ", zbDistrict='" + zbDistrict + '\'' +
                ", zbWeight=" + zbWeight +
                ", zbCreateTime=" + zbCreateTime +
                ", zbUpdateTime=" + zbUpdateTime +
                '}';
    }
}