package com.education.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TZbUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TZbUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andZbIdIsNull() {
            addCriterion("zb_id is null");
            return (Criteria) this;
        }

        public Criteria andZbIdIsNotNull() {
            addCriterion("zb_id is not null");
            return (Criteria) this;
        }

        public Criteria andZbIdEqualTo(Integer value) {
            addCriterion("zb_id =", value, "zbId");
            return (Criteria) this;
        }

        public Criteria andZbIdNotEqualTo(Integer value) {
            addCriterion("zb_id <>", value, "zbId");
            return (Criteria) this;
        }

        public Criteria andZbIdGreaterThan(Integer value) {
            addCriterion("zb_id >", value, "zbId");
            return (Criteria) this;
        }

        public Criteria andZbIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("zb_id >=", value, "zbId");
            return (Criteria) this;
        }

        public Criteria andZbIdLessThan(Integer value) {
            addCriterion("zb_id <", value, "zbId");
            return (Criteria) this;
        }

        public Criteria andZbIdLessThanOrEqualTo(Integer value) {
            addCriterion("zb_id <=", value, "zbId");
            return (Criteria) this;
        }

        public Criteria andZbIdIn(List<Integer> values) {
            addCriterion("zb_id in", values, "zbId");
            return (Criteria) this;
        }

        public Criteria andZbIdNotIn(List<Integer> values) {
            addCriterion("zb_id not in", values, "zbId");
            return (Criteria) this;
        }

        public Criteria andZbIdBetween(Integer value1, Integer value2) {
            addCriterion("zb_id between", value1, value2, "zbId");
            return (Criteria) this;
        }

        public Criteria andZbIdNotBetween(Integer value1, Integer value2) {
            addCriterion("zb_id not between", value1, value2, "zbId");
            return (Criteria) this;
        }

        public Criteria andZbRealnameIsNull() {
            addCriterion("zb_realname is null");
            return (Criteria) this;
        }

        public Criteria andZbRealnameIsNotNull() {
            addCriterion("zb_realname is not null");
            return (Criteria) this;
        }

        public Criteria andZbRealnameEqualTo(String value) {
            addCriterion("zb_realname =", value, "zbRealname");
            return (Criteria) this;
        }

        public Criteria andZbRealnameNotEqualTo(String value) {
            addCriterion("zb_realname <>", value, "zbRealname");
            return (Criteria) this;
        }

        public Criteria andZbRealnameGreaterThan(String value) {
            addCriterion("zb_realname >", value, "zbRealname");
            return (Criteria) this;
        }

        public Criteria andZbRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("zb_realname >=", value, "zbRealname");
            return (Criteria) this;
        }

        public Criteria andZbRealnameLessThan(String value) {
            addCriterion("zb_realname <", value, "zbRealname");
            return (Criteria) this;
        }

        public Criteria andZbRealnameLessThanOrEqualTo(String value) {
            addCriterion("zb_realname <=", value, "zbRealname");
            return (Criteria) this;
        }

        public Criteria andZbRealnameLike(String value) {
            addCriterion("zb_realname like", value, "zbRealname");
            return (Criteria) this;
        }

        public Criteria andZbRealnameNotLike(String value) {
            addCriterion("zb_realname not like", value, "zbRealname");
            return (Criteria) this;
        }

        public Criteria andZbRealnameIn(List<String> values) {
            addCriterion("zb_realname in", values, "zbRealname");
            return (Criteria) this;
        }

        public Criteria andZbRealnameNotIn(List<String> values) {
            addCriterion("zb_realname not in", values, "zbRealname");
            return (Criteria) this;
        }

        public Criteria andZbRealnameBetween(String value1, String value2) {
            addCriterion("zb_realname between", value1, value2, "zbRealname");
            return (Criteria) this;
        }

        public Criteria andZbRealnameNotBetween(String value1, String value2) {
            addCriterion("zb_realname not between", value1, value2, "zbRealname");
            return (Criteria) this;
        }

        public Criteria andZbUsernameIsNull() {
            addCriterion("zb_username is null");
            return (Criteria) this;
        }

        public Criteria andZbUsernameIsNotNull() {
            addCriterion("zb_username is not null");
            return (Criteria) this;
        }

        public Criteria andZbUsernameEqualTo(String value) {
            addCriterion("zb_username =", value, "zbUsername");
            return (Criteria) this;
        }

        public Criteria andZbUsernameNotEqualTo(String value) {
            addCriterion("zb_username <>", value, "zbUsername");
            return (Criteria) this;
        }

        public Criteria andZbUsernameGreaterThan(String value) {
            addCriterion("zb_username >", value, "zbUsername");
            return (Criteria) this;
        }

        public Criteria andZbUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("zb_username >=", value, "zbUsername");
            return (Criteria) this;
        }

        public Criteria andZbUsernameLessThan(String value) {
            addCriterion("zb_username <", value, "zbUsername");
            return (Criteria) this;
        }

        public Criteria andZbUsernameLessThanOrEqualTo(String value) {
            addCriterion("zb_username <=", value, "zbUsername");
            return (Criteria) this;
        }

        public Criteria andZbUsernameLike(String value) {
            addCriterion("zb_username like", value, "zbUsername");
            return (Criteria) this;
        }

        public Criteria andZbUsernameNotLike(String value) {
            addCriterion("zb_username not like", value, "zbUsername");
            return (Criteria) this;
        }

        public Criteria andZbUsernameIn(List<String> values) {
            addCriterion("zb_username in", values, "zbUsername");
            return (Criteria) this;
        }

        public Criteria andZbUsernameNotIn(List<String> values) {
            addCriterion("zb_username not in", values, "zbUsername");
            return (Criteria) this;
        }

        public Criteria andZbUsernameBetween(String value1, String value2) {
            addCriterion("zb_username between", value1, value2, "zbUsername");
            return (Criteria) this;
        }

        public Criteria andZbUsernameNotBetween(String value1, String value2) {
            addCriterion("zb_username not between", value1, value2, "zbUsername");
            return (Criteria) this;
        }

        public Criteria andZbPasswordIsNull() {
            addCriterion("zb_password is null");
            return (Criteria) this;
        }

        public Criteria andZbPasswordIsNotNull() {
            addCriterion("zb_password is not null");
            return (Criteria) this;
        }

        public Criteria andZbPasswordEqualTo(String value) {
            addCriterion("zb_password =", value, "zbPassword");
            return (Criteria) this;
        }

        public Criteria andZbPasswordNotEqualTo(String value) {
            addCriterion("zb_password <>", value, "zbPassword");
            return (Criteria) this;
        }

        public Criteria andZbPasswordGreaterThan(String value) {
            addCriterion("zb_password >", value, "zbPassword");
            return (Criteria) this;
        }

        public Criteria andZbPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("zb_password >=", value, "zbPassword");
            return (Criteria) this;
        }

        public Criteria andZbPasswordLessThan(String value) {
            addCriterion("zb_password <", value, "zbPassword");
            return (Criteria) this;
        }

        public Criteria andZbPasswordLessThanOrEqualTo(String value) {
            addCriterion("zb_password <=", value, "zbPassword");
            return (Criteria) this;
        }

        public Criteria andZbPasswordLike(String value) {
            addCriterion("zb_password like", value, "zbPassword");
            return (Criteria) this;
        }

        public Criteria andZbPasswordNotLike(String value) {
            addCriterion("zb_password not like", value, "zbPassword");
            return (Criteria) this;
        }

        public Criteria andZbPasswordIn(List<String> values) {
            addCriterion("zb_password in", values, "zbPassword");
            return (Criteria) this;
        }

        public Criteria andZbPasswordNotIn(List<String> values) {
            addCriterion("zb_password not in", values, "zbPassword");
            return (Criteria) this;
        }

        public Criteria andZbPasswordBetween(String value1, String value2) {
            addCriterion("zb_password between", value1, value2, "zbPassword");
            return (Criteria) this;
        }

        public Criteria andZbPasswordNotBetween(String value1, String value2) {
            addCriterion("zb_password not between", value1, value2, "zbPassword");
            return (Criteria) this;
        }

        public Criteria andZbGenderIsNull() {
            addCriterion("zb_gender is null");
            return (Criteria) this;
        }

        public Criteria andZbGenderIsNotNull() {
            addCriterion("zb_gender is not null");
            return (Criteria) this;
        }

        public Criteria andZbGenderEqualTo(Boolean value) {
            addCriterion("zb_gender =", value, "zbGender");
            return (Criteria) this;
        }

        public Criteria andZbGenderNotEqualTo(Boolean value) {
            addCriterion("zb_gender <>", value, "zbGender");
            return (Criteria) this;
        }

        public Criteria andZbGenderGreaterThan(Boolean value) {
            addCriterion("zb_gender >", value, "zbGender");
            return (Criteria) this;
        }

        public Criteria andZbGenderGreaterThanOrEqualTo(Boolean value) {
            addCriterion("zb_gender >=", value, "zbGender");
            return (Criteria) this;
        }

        public Criteria andZbGenderLessThan(Boolean value) {
            addCriterion("zb_gender <", value, "zbGender");
            return (Criteria) this;
        }

        public Criteria andZbGenderLessThanOrEqualTo(Boolean value) {
            addCriterion("zb_gender <=", value, "zbGender");
            return (Criteria) this;
        }

        public Criteria andZbGenderIn(List<Boolean> values) {
            addCriterion("zb_gender in", values, "zbGender");
            return (Criteria) this;
        }

        public Criteria andZbGenderNotIn(List<Boolean> values) {
            addCriterion("zb_gender not in", values, "zbGender");
            return (Criteria) this;
        }

        public Criteria andZbGenderBetween(Boolean value1, Boolean value2) {
            addCriterion("zb_gender between", value1, value2, "zbGender");
            return (Criteria) this;
        }

        public Criteria andZbGenderNotBetween(Boolean value1, Boolean value2) {
            addCriterion("zb_gender not between", value1, value2, "zbGender");
            return (Criteria) this;
        }

        public Criteria andZbHeaderIsNull() {
            addCriterion("zb_header is null");
            return (Criteria) this;
        }

        public Criteria andZbHeaderIsNotNull() {
            addCriterion("zb_header is not null");
            return (Criteria) this;
        }

        public Criteria andZbHeaderEqualTo(String value) {
            addCriterion("zb_header =", value, "zbHeader");
            return (Criteria) this;
        }

        public Criteria andZbHeaderNotEqualTo(String value) {
            addCriterion("zb_header <>", value, "zbHeader");
            return (Criteria) this;
        }

        public Criteria andZbHeaderGreaterThan(String value) {
            addCriterion("zb_header >", value, "zbHeader");
            return (Criteria) this;
        }

        public Criteria andZbHeaderGreaterThanOrEqualTo(String value) {
            addCriterion("zb_header >=", value, "zbHeader");
            return (Criteria) this;
        }

        public Criteria andZbHeaderLessThan(String value) {
            addCriterion("zb_header <", value, "zbHeader");
            return (Criteria) this;
        }

        public Criteria andZbHeaderLessThanOrEqualTo(String value) {
            addCriterion("zb_header <=", value, "zbHeader");
            return (Criteria) this;
        }

        public Criteria andZbHeaderLike(String value) {
            addCriterion("zb_header like", value, "zbHeader");
            return (Criteria) this;
        }

        public Criteria andZbHeaderNotLike(String value) {
            addCriterion("zb_header not like", value, "zbHeader");
            return (Criteria) this;
        }

        public Criteria andZbHeaderIn(List<String> values) {
            addCriterion("zb_header in", values, "zbHeader");
            return (Criteria) this;
        }

        public Criteria andZbHeaderNotIn(List<String> values) {
            addCriterion("zb_header not in", values, "zbHeader");
            return (Criteria) this;
        }

        public Criteria andZbHeaderBetween(String value1, String value2) {
            addCriterion("zb_header between", value1, value2, "zbHeader");
            return (Criteria) this;
        }

        public Criteria andZbHeaderNotBetween(String value1, String value2) {
            addCriterion("zb_header not between", value1, value2, "zbHeader");
            return (Criteria) this;
        }

        public Criteria andZbMobileIsNull() {
            addCriterion("zb_mobile is null");
            return (Criteria) this;
        }

        public Criteria andZbMobileIsNotNull() {
            addCriterion("zb_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andZbMobileEqualTo(String value) {
            addCriterion("zb_mobile =", value, "zbMobile");
            return (Criteria) this;
        }

        public Criteria andZbMobileNotEqualTo(String value) {
            addCriterion("zb_mobile <>", value, "zbMobile");
            return (Criteria) this;
        }

        public Criteria andZbMobileGreaterThan(String value) {
            addCriterion("zb_mobile >", value, "zbMobile");
            return (Criteria) this;
        }

        public Criteria andZbMobileGreaterThanOrEqualTo(String value) {
            addCriterion("zb_mobile >=", value, "zbMobile");
            return (Criteria) this;
        }

        public Criteria andZbMobileLessThan(String value) {
            addCriterion("zb_mobile <", value, "zbMobile");
            return (Criteria) this;
        }

        public Criteria andZbMobileLessThanOrEqualTo(String value) {
            addCriterion("zb_mobile <=", value, "zbMobile");
            return (Criteria) this;
        }

        public Criteria andZbMobileLike(String value) {
            addCriterion("zb_mobile like", value, "zbMobile");
            return (Criteria) this;
        }

        public Criteria andZbMobileNotLike(String value) {
            addCriterion("zb_mobile not like", value, "zbMobile");
            return (Criteria) this;
        }

        public Criteria andZbMobileIn(List<String> values) {
            addCriterion("zb_mobile in", values, "zbMobile");
            return (Criteria) this;
        }

        public Criteria andZbMobileNotIn(List<String> values) {
            addCriterion("zb_mobile not in", values, "zbMobile");
            return (Criteria) this;
        }

        public Criteria andZbMobileBetween(String value1, String value2) {
            addCriterion("zb_mobile between", value1, value2, "zbMobile");
            return (Criteria) this;
        }

        public Criteria andZbMobileNotBetween(String value1, String value2) {
            addCriterion("zb_mobile not between", value1, value2, "zbMobile");
            return (Criteria) this;
        }

        public Criteria andZbStatusIsNull() {
            addCriterion("zb_status is null");
            return (Criteria) this;
        }

        public Criteria andZbStatusIsNotNull() {
            addCriterion("zb_status is not null");
            return (Criteria) this;
        }

        public Criteria andZbStatusEqualTo(Integer value) {
            addCriterion("zb_status =", value, "zbStatus");
            return (Criteria) this;
        }

        public Criteria andZbStatusNotEqualTo(Boolean value) {
            addCriterion("zb_status <>", value, "zbStatus");
            return (Criteria) this;
        }

        public Criteria andZbStatusGreaterThan(Boolean value) {
            addCriterion("zb_status >", value, "zbStatus");
            return (Criteria) this;
        }

        public Criteria andZbStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("zb_status >=", value, "zbStatus");
            return (Criteria) this;
        }

        public Criteria andZbStatusLessThan(Boolean value) {
            addCriterion("zb_status <", value, "zbStatus");
            return (Criteria) this;
        }

        public Criteria andZbStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("zb_status <=", value, "zbStatus");
            return (Criteria) this;
        }

        public Criteria andZbStatusIn(List<Boolean> values) {
            addCriterion("zb_status in", values, "zbStatus");
            return (Criteria) this;
        }

        public Criteria andZbStatusNotIn(List<Boolean> values) {
            addCriterion("zb_status not in", values, "zbStatus");
            return (Criteria) this;
        }

        public Criteria andZbStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("zb_status between", value1, value2, "zbStatus");
            return (Criteria) this;
        }

        public Criteria andZbStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("zb_status not between", value1, value2, "zbStatus");
            return (Criteria) this;
        }

        /*public Criteria andZbBirthdayIsNull() {
            addCriterion("zb_birthday is null");
            return (Criteria) this;
        }

        public Criteria andZbBirthdayIsNotNull() {
            addCriterion("zb_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andZbBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("zb_birthday =", value, "zbBirthday");
            return (Criteria) this;
        }

        public Criteria andZbBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("zb_birthday <>", value, "zbBirthday");
            return (Criteria) this;
        }

        public Criteria andZbBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("zb_birthday >", value, "zbBirthday");
            return (Criteria) this;
        }

        public Criteria andZbBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("zb_birthday >=", value, "zbBirthday");
            return (Criteria) this;
        }

        public Criteria andZbBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("zb_birthday <", value, "zbBirthday");
            return (Criteria) this;
        }

        public Criteria andZbBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("zb_birthday <=", value, "zbBirthday");
            return (Criteria) this;
        }

        public Criteria andZbBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("zb_birthday in", values, "zbBirthday");
            return (Criteria) this;
        }

        public Criteria andZbBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("zb_birthday not in", values, "zbBirthday");
            return (Criteria) this;
        }

        public Criteria andZbBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("zb_birthday between", value1, value2, "zbBirthday");
            return (Criteria) this;
        }

        public Criteria andZbBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("zb_birthday not between", value1, value2, "zbBirthday");
            return (Criteria) this;
        }*/

        public Criteria andZbEducationIsNull() {
            addCriterion("zb_education is null");
            return (Criteria) this;
        }

        public Criteria andZbEducationIsNotNull() {
            addCriterion("zb_education is not null");
            return (Criteria) this;
        }

        public Criteria andZbEducationEqualTo(String value) {
            addCriterion("zb_education =", value, "zbEducation");
            return (Criteria) this;
        }

        public Criteria andZbEducationNotEqualTo(String value) {
            addCriterion("zb_education <>", value, "zbEducation");
            return (Criteria) this;
        }

        public Criteria andZbEducationGreaterThan(String value) {
            addCriterion("zb_education >", value, "zbEducation");
            return (Criteria) this;
        }

        public Criteria andZbEducationGreaterThanOrEqualTo(String value) {
            addCriterion("zb_education >=", value, "zbEducation");
            return (Criteria) this;
        }

        public Criteria andZbEducationLessThan(String value) {
            addCriterion("zb_education <", value, "zbEducation");
            return (Criteria) this;
        }

        public Criteria andZbEducationLessThanOrEqualTo(String value) {
            addCriterion("zb_education <=", value, "zbEducation");
            return (Criteria) this;
        }

        public Criteria andZbEducationLike(String value) {
            addCriterion("zb_education like", value, "zbEducation");
            return (Criteria) this;
        }

        public Criteria andZbEducationNotLike(String value) {
            addCriterion("zb_education not like", value, "zbEducation");
            return (Criteria) this;
        }

        public Criteria andZbEducationIn(List<String> values) {
            addCriterion("zb_education in", values, "zbEducation");
            return (Criteria) this;
        }

        public Criteria andZbEducationNotIn(List<String> values) {
            addCriterion("zb_education not in", values, "zbEducation");
            return (Criteria) this;
        }

        public Criteria andZbEducationBetween(String value1, String value2) {
            addCriterion("zb_education between", value1, value2, "zbEducation");
            return (Criteria) this;
        }

        public Criteria andZbEducationNotBetween(String value1, String value2) {
            addCriterion("zb_education not between", value1, value2, "zbEducation");
            return (Criteria) this;
        }

        public Criteria andZbCollegeNameIsNull() {
            addCriterion("zb_college_name is null");
            return (Criteria) this;
        }

        public Criteria andZbCollegeNameIsNotNull() {
            addCriterion("zb_college_name is not null");
            return (Criteria) this;
        }

        public Criteria andZbCollegeNameEqualTo(String value) {
            addCriterion("zb_college_name =", value, "zbCollegeName");
            return (Criteria) this;
        }

        public Criteria andZbCollegeNameNotEqualTo(String value) {
            addCriterion("zb_college_name <>", value, "zbCollegeName");
            return (Criteria) this;
        }

        public Criteria andZbCollegeNameGreaterThan(String value) {
            addCriterion("zb_college_name >", value, "zbCollegeName");
            return (Criteria) this;
        }

        public Criteria andZbCollegeNameGreaterThanOrEqualTo(String value) {
            addCriterion("zb_college_name >=", value, "zbCollegeName");
            return (Criteria) this;
        }

        public Criteria andZbCollegeNameLessThan(String value) {
            addCriterion("zb_college_name <", value, "zbCollegeName");
            return (Criteria) this;
        }

        public Criteria andZbCollegeNameLessThanOrEqualTo(String value) {
            addCriterion("zb_college_name <=", value, "zbCollegeName");
            return (Criteria) this;
        }

        public Criteria andZbCollegeNameLike(String value) {
            addCriterion("zb_college_name like", value, "zbCollegeName");
            return (Criteria) this;
        }

        public Criteria andZbCollegeNameNotLike(String value) {
            addCriterion("zb_college_name not like", value, "zbCollegeName");
            return (Criteria) this;
        }

        public Criteria andZbCollegeNameIn(List<String> values) {
            addCriterion("zb_college_name in", values, "zbCollegeName");
            return (Criteria) this;
        }

        public Criteria andZbCollegeNameNotIn(List<String> values) {
            addCriterion("zb_college_name not in", values, "zbCollegeName");
            return (Criteria) this;
        }

        public Criteria andZbCollegeNameBetween(String value1, String value2) {
            addCriterion("zb_college_name between", value1, value2, "zbCollegeName");
            return (Criteria) this;
        }

        public Criteria andZbCollegeNameNotBetween(String value1, String value2) {
            addCriterion("zb_college_name not between", value1, value2, "zbCollegeName");
            return (Criteria) this;
        }

        public Criteria andZbTitleIsNull() {
            addCriterion("zb_title is null");
            return (Criteria) this;
        }

        public Criteria andZbTitleIsNotNull() {
            addCriterion("zb_title is not null");
            return (Criteria) this;
        }

        public Criteria andZbTitleEqualTo(String value) {
            addCriterion("zb_title =", value, "zbTitle");
            return (Criteria) this;
        }

        public Criteria andZbTitleNotEqualTo(String value) {
            addCriterion("zb_title <>", value, "zbTitle");
            return (Criteria) this;
        }

        public Criteria andZbTitleGreaterThan(String value) {
            addCriterion("zb_title >", value, "zbTitle");
            return (Criteria) this;
        }

        public Criteria andZbTitleGreaterThanOrEqualTo(String value) {
            addCriterion("zb_title >=", value, "zbTitle");
            return (Criteria) this;
        }

        public Criteria andZbTitleLessThan(String value) {
            addCriterion("zb_title <", value, "zbTitle");
            return (Criteria) this;
        }

        public Criteria andZbTitleLessThanOrEqualTo(String value) {
            addCriterion("zb_title <=", value, "zbTitle");
            return (Criteria) this;
        }

        public Criteria andZbTitleLike(String value) {
            addCriterion("zb_title like", value, "zbTitle");
            return (Criteria) this;
        }

        public Criteria andZbTitleNotLike(String value) {
            addCriterion("zb_title not like", value, "zbTitle");
            return (Criteria) this;
        }

        public Criteria andZbTitleIn(List<String> values) {
            addCriterion("zb_title in", values, "zbTitle");
            return (Criteria) this;
        }

        public Criteria andZbTitleNotIn(List<String> values) {
            addCriterion("zb_title not in", values, "zbTitle");
            return (Criteria) this;
        }

        public Criteria andZbTitleBetween(String value1, String value2) {
            addCriterion("zb_title between", value1, value2, "zbTitle");
            return (Criteria) this;
        }

        public Criteria andZbTitleNotBetween(String value1, String value2) {
            addCriterion("zb_title not between", value1, value2, "zbTitle");
            return (Criteria) this;
        }

        public Criteria andZbProvinceIsNull() {
            addCriterion("zb_province is null");
            return (Criteria) this;
        }

        public Criteria andZbProvinceIsNotNull() {
            addCriterion("zb_province is not null");
            return (Criteria) this;
        }

        public Criteria andZbProvinceEqualTo(String value) {
            addCriterion("zb_province =", value, "zbProvince");
            return (Criteria) this;
        }

        public Criteria andZbProvinceNotEqualTo(String value) {
            addCriterion("zb_province <>", value, "zbProvince");
            return (Criteria) this;
        }

        public Criteria andZbProvinceGreaterThan(String value) {
            addCriterion("zb_province >", value, "zbProvince");
            return (Criteria) this;
        }

        public Criteria andZbProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("zb_province >=", value, "zbProvince");
            return (Criteria) this;
        }

        public Criteria andZbProvinceLessThan(String value) {
            addCriterion("zb_province <", value, "zbProvince");
            return (Criteria) this;
        }

        public Criteria andZbProvinceLessThanOrEqualTo(String value) {
            addCriterion("zb_province <=", value, "zbProvince");
            return (Criteria) this;
        }

        public Criteria andZbProvinceLike(String value) {
            addCriterion("zb_province like", value, "zbProvince");
            return (Criteria) this;
        }

        public Criteria andZbProvinceNotLike(String value) {
            addCriterion("zb_province not like", value, "zbProvince");
            return (Criteria) this;
        }

        public Criteria andZbProvinceIn(List<String> values) {
            addCriterion("zb_province in", values, "zbProvince");
            return (Criteria) this;
        }

        public Criteria andZbProvinceNotIn(List<String> values) {
            addCriterion("zb_province not in", values, "zbProvince");
            return (Criteria) this;
        }

        public Criteria andZbProvinceBetween(String value1, String value2) {
            addCriterion("zb_province between", value1, value2, "zbProvince");
            return (Criteria) this;
        }

        public Criteria andZbProvinceNotBetween(String value1, String value2) {
            addCriterion("zb_province not between", value1, value2, "zbProvince");
            return (Criteria) this;
        }

        public Criteria andZbCityIsNull() {
            addCriterion("zb_city is null");
            return (Criteria) this;
        }

        public Criteria andZbCityIsNotNull() {
            addCriterion("zb_city is not null");
            return (Criteria) this;
        }

        public Criteria andZbCityEqualTo(String value) {
            addCriterion("zb_city =", value, "zbCity");
            return (Criteria) this;
        }

        public Criteria andZbCityNotEqualTo(String value) {
            addCriterion("zb_city <>", value, "zbCity");
            return (Criteria) this;
        }

        public Criteria andZbCityGreaterThan(String value) {
            addCriterion("zb_city >", value, "zbCity");
            return (Criteria) this;
        }

        public Criteria andZbCityGreaterThanOrEqualTo(String value) {
            addCriterion("zb_city >=", value, "zbCity");
            return (Criteria) this;
        }

        public Criteria andZbCityLessThan(String value) {
            addCriterion("zb_city <", value, "zbCity");
            return (Criteria) this;
        }

        public Criteria andZbCityLessThanOrEqualTo(String value) {
            addCriterion("zb_city <=", value, "zbCity");
            return (Criteria) this;
        }

        public Criteria andZbCityLike(String value) {
            addCriterion("zb_city like", value, "zbCity");
            return (Criteria) this;
        }

        public Criteria andZbCityNotLike(String value) {
            addCriterion("zb_city not like", value, "zbCity");
            return (Criteria) this;
        }

        public Criteria andZbCityIn(List<String> values) {
            addCriterion("zb_city in", values, "zbCity");
            return (Criteria) this;
        }

        public Criteria andZbCityNotIn(List<String> values) {
            addCriterion("zb_city not in", values, "zbCity");
            return (Criteria) this;
        }

        public Criteria andZbCityBetween(String value1, String value2) {
            addCriterion("zb_city between", value1, value2, "zbCity");
            return (Criteria) this;
        }

        public Criteria andZbCityNotBetween(String value1, String value2) {
            addCriterion("zb_city not between", value1, value2, "zbCity");
            return (Criteria) this;
        }

        public Criteria andZbDistrictIsNull() {
            addCriterion("zb_district is null");
            return (Criteria) this;
        }

        public Criteria andZbDistrictIsNotNull() {
            addCriterion("zb_district is not null");
            return (Criteria) this;
        }

        public Criteria andZbDistrictEqualTo(String value) {
            addCriterion("zb_district =", value, "zbDistrict");
            return (Criteria) this;
        }

        public Criteria andZbDistrictNotEqualTo(String value) {
            addCriterion("zb_district <>", value, "zbDistrict");
            return (Criteria) this;
        }

        public Criteria andZbDistrictGreaterThan(String value) {
            addCriterion("zb_district >", value, "zbDistrict");
            return (Criteria) this;
        }

        public Criteria andZbDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("zb_district >=", value, "zbDistrict");
            return (Criteria) this;
        }

        public Criteria andZbDistrictLessThan(String value) {
            addCriterion("zb_district <", value, "zbDistrict");
            return (Criteria) this;
        }

        public Criteria andZbDistrictLessThanOrEqualTo(String value) {
            addCriterion("zb_district <=", value, "zbDistrict");
            return (Criteria) this;
        }

        public Criteria andZbDistrictLike(String value) {
            addCriterion("zb_district like", value, "zbDistrict");
            return (Criteria) this;
        }

        public Criteria andZbDistrictNotLike(String value) {
            addCriterion("zb_district not like", value, "zbDistrict");
            return (Criteria) this;
        }

        public Criteria andZbDistrictIn(List<String> values) {
            addCriterion("zb_district in", values, "zbDistrict");
            return (Criteria) this;
        }

        public Criteria andZbDistrictNotIn(List<String> values) {
            addCriterion("zb_district not in", values, "zbDistrict");
            return (Criteria) this;
        }

        public Criteria andZbDistrictBetween(String value1, String value2) {
            addCriterion("zb_district between", value1, value2, "zbDistrict");
            return (Criteria) this;
        }

        public Criteria andZbDistrictNotBetween(String value1, String value2) {
            addCriterion("zb_district not between", value1, value2, "zbDistrict");
            return (Criteria) this;
        }

        public Criteria andZbWeightIsNull() {
            addCriterion("zb_weight is null");
            return (Criteria) this;
        }

        public Criteria andZbWeightIsNotNull() {
            addCriterion("zb_weight is not null");
            return (Criteria) this;
        }

        public Criteria andZbWeightEqualTo(Integer value) {
            addCriterion("zb_weight =", value, "zbWeight");
            return (Criteria) this;
        }

        public Criteria andZbWeightNotEqualTo(Integer value) {
            addCriterion("zb_weight <>", value, "zbWeight");
            return (Criteria) this;
        }

        public Criteria andZbWeightGreaterThan(Integer value) {
            addCriterion("zb_weight >", value, "zbWeight");
            return (Criteria) this;
        }

        public Criteria andZbWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("zb_weight >=", value, "zbWeight");
            return (Criteria) this;
        }

        public Criteria andZbWeightLessThan(Integer value) {
            addCriterion("zb_weight <", value, "zbWeight");
            return (Criteria) this;
        }

        public Criteria andZbWeightLessThanOrEqualTo(Integer value) {
            addCriterion("zb_weight <=", value, "zbWeight");
            return (Criteria) this;
        }

        public Criteria andZbWeightIn(List<Integer> values) {
            addCriterion("zb_weight in", values, "zbWeight");
            return (Criteria) this;
        }

        public Criteria andZbWeightNotIn(List<Integer> values) {
            addCriterion("zb_weight not in", values, "zbWeight");
            return (Criteria) this;
        }

        public Criteria andZbWeightBetween(Integer value1, Integer value2) {
            addCriterion("zb_weight between", value1, value2, "zbWeight");
            return (Criteria) this;
        }

        public Criteria andZbWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("zb_weight not between", value1, value2, "zbWeight");
            return (Criteria) this;
        }

        public Criteria andZbCreateTimeIsNull() {
            addCriterion("zb_create_time is null");
            return (Criteria) this;
        }

        public Criteria andZbCreateTimeIsNotNull() {
            addCriterion("zb_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andZbCreateTimeEqualTo(Date value) {
            addCriterion("zb_create_time =", value, "zbCreateTime");
            return (Criteria) this;
        }

        public Criteria andZbCreateTimeNotEqualTo(Date value) {
            addCriterion("zb_create_time <>", value, "zbCreateTime");
            return (Criteria) this;
        }

        public Criteria andZbCreateTimeGreaterThan(Date value) {
            addCriterion("zb_create_time >", value, "zbCreateTime");
            return (Criteria) this;
        }

        public Criteria andZbCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("zb_create_time >=", value, "zbCreateTime");
            return (Criteria) this;
        }

        public Criteria andZbCreateTimeLessThan(Date value) {
            addCriterion("zb_create_time <", value, "zbCreateTime");
            return (Criteria) this;
        }

        public Criteria andZbCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("zb_create_time <=", value, "zbCreateTime");
            return (Criteria) this;
        }

        public Criteria andZbCreateTimeIn(List<Date> values) {
            addCriterion("zb_create_time in", values, "zbCreateTime");
            return (Criteria) this;
        }

        public Criteria andZbCreateTimeNotIn(List<Date> values) {
            addCriterion("zb_create_time not in", values, "zbCreateTime");
            return (Criteria) this;
        }

        public Criteria andZbCreateTimeBetween(Date value1, Date value2) {
            addCriterion("zb_create_time between", value1, value2, "zbCreateTime");
            return (Criteria) this;
        }

        public Criteria andZbCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("zb_create_time not between", value1, value2, "zbCreateTime");
            return (Criteria) this;
        }

        public Criteria andZbUpdateTimeIsNull() {
            addCriterion("zb_update_time is null");
            return (Criteria) this;
        }

        public Criteria andZbUpdateTimeIsNotNull() {
            addCriterion("zb_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andZbUpdateTimeEqualTo(Date value) {
            addCriterion("zb_update_time =", value, "zbUpdateTime");
            return (Criteria) this;
        }

        public Criteria andZbUpdateTimeNotEqualTo(Date value) {
            addCriterion("zb_update_time <>", value, "zbUpdateTime");
            return (Criteria) this;
        }

        public Criteria andZbUpdateTimeGreaterThan(Date value) {
            addCriterion("zb_update_time >", value, "zbUpdateTime");
            return (Criteria) this;
        }

        public Criteria andZbUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("zb_update_time >=", value, "zbUpdateTime");
            return (Criteria) this;
        }

        public Criteria andZbUpdateTimeLessThan(Date value) {
            addCriterion("zb_update_time <", value, "zbUpdateTime");
            return (Criteria) this;
        }

        public Criteria andZbUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("zb_update_time <=", value, "zbUpdateTime");
            return (Criteria) this;
        }

        public Criteria andZbUpdateTimeIn(List<Date> values) {
            addCriterion("zb_update_time in", values, "zbUpdateTime");
            return (Criteria) this;
        }

        public Criteria andZbUpdateTimeNotIn(List<Date> values) {
            addCriterion("zb_update_time not in", values, "zbUpdateTime");
            return (Criteria) this;
        }

        public Criteria andZbUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("zb_update_time between", value1, value2, "zbUpdateTime");
            return (Criteria) this;
        }

        public Criteria andZbUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("zb_update_time not between", value1, value2, "zbUpdateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}