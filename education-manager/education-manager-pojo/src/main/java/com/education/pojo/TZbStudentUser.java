package com.education.pojo;

public class TZbStudentUser {
    private Integer zbStudentId;

    private String zbUsername;

    private String zbStudentEmail;

    private String zbStudentPhone;

    private String zbPassword;

    public Integer getZbStudentId() {
        return zbStudentId;
    }

    public void setZbStudentId(Integer zbStudentId) {
        this.zbStudentId = zbStudentId;
    }

    public String getZbUsername() {
        return zbUsername;
    }

    public void setZbUsername(String zbUsername) {
        this.zbUsername = zbUsername == null ? null : zbUsername.trim();
    }

    public String getZbStudentEmail() {
        return zbStudentEmail;
    }

    public void setZbStudentEmail(String zbStudentEmail) {
        this.zbStudentEmail = zbStudentEmail == null ? null : zbStudentEmail.trim();
    }

    public String getZbStudentPhone() {
        return zbStudentPhone;
    }

    public void setZbStudentPhone(String zbStudentPhone) {
        this.zbStudentPhone = zbStudentPhone == null ? null : zbStudentPhone.trim();
    }

    public String getZbPassword() {
        return zbPassword;
    }

    public void setZbPassword(String zbPassword) {
        this.zbPassword = zbPassword == null ? null : zbPassword.trim();
    }
}