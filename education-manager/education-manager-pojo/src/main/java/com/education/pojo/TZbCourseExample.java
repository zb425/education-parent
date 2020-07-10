package com.education.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TZbCourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TZbCourseExample() {
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

        public Criteria andZbNameIsNull() {
            addCriterion("zb_name is null");
            return (Criteria) this;
        }

        public Criteria andZbNameIsNotNull() {
            addCriterion("zb_name is not null");
            return (Criteria) this;
        }

        public Criteria andZbNameEqualTo(String value) {
            addCriterion("zb_name =", value, "zbName");
            return (Criteria) this;
        }

        public Criteria andZbNameNotEqualTo(String value) {
            addCriterion("zb_name <>", value, "zbName");
            return (Criteria) this;
        }

        public Criteria andZbNameGreaterThan(String value) {
            addCriterion("zb_name >", value, "zbName");
            return (Criteria) this;
        }

        public Criteria andZbNameGreaterThanOrEqualTo(String value) {
            addCriterion("zb_name >=", value, "zbName");
            return (Criteria) this;
        }

        public Criteria andZbNameLessThan(String value) {
            addCriterion("zb_name <", value, "zbName");
            return (Criteria) this;
        }

        public Criteria andZbNameLessThanOrEqualTo(String value) {
            addCriterion("zb_name <=", value, "zbName");
            return (Criteria) this;
        }

        public Criteria andZbNameLike(String value) {
            addCriterion("zb_name like", value, "zbName");
            return (Criteria) this;
        }

        public Criteria andZbNameNotLike(String value) {
            addCriterion("zb_name not like", value, "zbName");
            return (Criteria) this;
        }

        public Criteria andZbNameIn(List<String> values) {
            addCriterion("zb_name in", values, "zbName");
            return (Criteria) this;
        }

        public Criteria andZbNameNotIn(List<String> values) {
            addCriterion("zb_name not in", values, "zbName");
            return (Criteria) this;
        }

        public Criteria andZbNameBetween(String value1, String value2) {
            addCriterion("zb_name between", value1, value2, "zbName");
            return (Criteria) this;
        }

        public Criteria andZbNameNotBetween(String value1, String value2) {
            addCriterion("zb_name not between", value1, value2, "zbName");
            return (Criteria) this;
        }

        public Criteria andZbTypeIsNull() {
            addCriterion("zb_type is null");
            return (Criteria) this;
        }

        public Criteria andZbTypeIsNotNull() {
            addCriterion("zb_type is not null");
            return (Criteria) this;
        }

        public Criteria andZbTypeEqualTo(String value) {
            addCriterion("zb_type =", value, "zbType");
            return (Criteria) this;
        }

        public Criteria andZbTypeNotEqualTo(String value) {
            addCriterion("zb_type <>", value, "zbType");
            return (Criteria) this;
        }

        public Criteria andZbTypeGreaterThan(String value) {
            addCriterion("zb_type >", value, "zbType");
            return (Criteria) this;
        }

        public Criteria andZbTypeGreaterThanOrEqualTo(String value) {
            addCriterion("zb_type >=", value, "zbType");
            return (Criteria) this;
        }

        public Criteria andZbTypeLessThan(String value) {
            addCriterion("zb_type <", value, "zbType");
            return (Criteria) this;
        }

        public Criteria andZbTypeLessThanOrEqualTo(String value) {
            addCriterion("zb_type <=", value, "zbType");
            return (Criteria) this;
        }

        public Criteria andZbTypeLike(String value) {
            addCriterion("zb_type like", value, "zbType");
            return (Criteria) this;
        }

        public Criteria andZbTypeNotLike(String value) {
            addCriterion("zb_type not like", value, "zbType");
            return (Criteria) this;
        }

        public Criteria andZbTypeIn(List<String> values) {
            addCriterion("zb_type in", values, "zbType");
            return (Criteria) this;
        }

        public Criteria andZbTypeNotIn(List<String> values) {
            addCriterion("zb_type not in", values, "zbType");
            return (Criteria) this;
        }

        public Criteria andZbTypeBetween(String value1, String value2) {
            addCriterion("zb_type between", value1, value2, "zbType");
            return (Criteria) this;
        }

        public Criteria andZbTypeNotBetween(String value1, String value2) {
            addCriterion("zb_type not between", value1, value2, "zbType");
            return (Criteria) this;
        }

        public Criteria andZbCoursetypeIsNull() {
            addCriterion("zb_coursetype is null");
            return (Criteria) this;
        }

        public Criteria andZbCoursetypeIsNotNull() {
            addCriterion("zb_coursetype is not null");
            return (Criteria) this;
        }

        public Criteria andZbCoursetypeEqualTo(String value) {
            addCriterion("zb_coursetype =", value, "zbCoursetype");
            return (Criteria) this;
        }

        public Criteria andZbCoursetypeNotEqualTo(String value) {
            addCriterion("zb_coursetype <>", value, "zbCoursetype");
            return (Criteria) this;
        }

        public Criteria andZbCoursetypeGreaterThan(String value) {
            addCriterion("zb_coursetype >", value, "zbCoursetype");
            return (Criteria) this;
        }

        public Criteria andZbCoursetypeGreaterThanOrEqualTo(String value) {
            addCriterion("zb_coursetype >=", value, "zbCoursetype");
            return (Criteria) this;
        }

        public Criteria andZbCoursetypeLessThan(String value) {
            addCriterion("zb_coursetype <", value, "zbCoursetype");
            return (Criteria) this;
        }

        public Criteria andZbCoursetypeLessThanOrEqualTo(String value) {
            addCriterion("zb_coursetype <=", value, "zbCoursetype");
            return (Criteria) this;
        }

        public Criteria andZbCoursetypeLike(String value) {
            addCriterion("zb_coursetype like", value, "zbCoursetype");
            return (Criteria) this;
        }

        public Criteria andZbCoursetypeNotLike(String value) {
            addCriterion("zb_coursetype not like", value, "zbCoursetype");
            return (Criteria) this;
        }

        public Criteria andZbCoursetypeIn(List<String> values) {
            addCriterion("zb_coursetype in", values, "zbCoursetype");
            return (Criteria) this;
        }

        public Criteria andZbCoursetypeNotIn(List<String> values) {
            addCriterion("zb_coursetype not in", values, "zbCoursetype");
            return (Criteria) this;
        }

        public Criteria andZbCoursetypeBetween(String value1, String value2) {
            addCriterion("zb_coursetype between", value1, value2, "zbCoursetype");
            return (Criteria) this;
        }

        public Criteria andZbCoursetypeNotBetween(String value1, String value2) {
            addCriterion("zb_coursetype not between", value1, value2, "zbCoursetype");
            return (Criteria) this;
        }

        public Criteria andZbCoursetypeNameIsNull() {
            addCriterion("zb_coursetype_name is null");
            return (Criteria) this;
        }

        public Criteria andZbCoursetypeNameIsNotNull() {
            addCriterion("zb_coursetype_name is not null");
            return (Criteria) this;
        }

        public Criteria andZbCoursetypeNameEqualTo(String value) {
            addCriterion("zb_coursetype_name =", value, "zbCoursetypeName");
            return (Criteria) this;
        }

        public Criteria andZbCoursetypeNameNotEqualTo(String value) {
            addCriterion("zb_coursetype_name <>", value, "zbCoursetypeName");
            return (Criteria) this;
        }

        public Criteria andZbCoursetypeNameGreaterThan(String value) {
            addCriterion("zb_coursetype_name >", value, "zbCoursetypeName");
            return (Criteria) this;
        }

        public Criteria andZbCoursetypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("zb_coursetype_name >=", value, "zbCoursetypeName");
            return (Criteria) this;
        }

        public Criteria andZbCoursetypeNameLessThan(String value) {
            addCriterion("zb_coursetype_name <", value, "zbCoursetypeName");
            return (Criteria) this;
        }

        public Criteria andZbCoursetypeNameLessThanOrEqualTo(String value) {
            addCriterion("zb_coursetype_name <=", value, "zbCoursetypeName");
            return (Criteria) this;
        }

        public Criteria andZbCoursetypeNameLike(String value) {
            addCriterion("zb_coursetype_name like", value, "zbCoursetypeName");
            return (Criteria) this;
        }

        public Criteria andZbCoursetypeNameNotLike(String value) {
            addCriterion("zb_coursetype_name not like", value, "zbCoursetypeName");
            return (Criteria) this;
        }

        public Criteria andZbCoursetypeNameIn(List<String> values) {
            addCriterion("zb_coursetype_name in", values, "zbCoursetypeName");
            return (Criteria) this;
        }

        public Criteria andZbCoursetypeNameNotIn(List<String> values) {
            addCriterion("zb_coursetype_name not in", values, "zbCoursetypeName");
            return (Criteria) this;
        }

        public Criteria andZbCoursetypeNameBetween(String value1, String value2) {
            addCriterion("zb_coursetype_name between", value1, value2, "zbCoursetypeName");
            return (Criteria) this;
        }

        public Criteria andZbCoursetypeNameNotBetween(String value1, String value2) {
            addCriterion("zb_coursetype_name not between", value1, value2, "zbCoursetypeName");
            return (Criteria) this;
        }

        public Criteria andZbSubCoursetypeIsNull() {
            addCriterion("zb_sub_coursetype is null");
            return (Criteria) this;
        }

        public Criteria andZbSubCoursetypeIsNotNull() {
            addCriterion("zb_sub_coursetype is not null");
            return (Criteria) this;
        }

        public Criteria andZbSubCoursetypeEqualTo(String value) {
            addCriterion("zb_sub_coursetype =", value, "zbSubCoursetype");
            return (Criteria) this;
        }

        public Criteria andZbSubCoursetypeNotEqualTo(String value) {
            addCriterion("zb_sub_coursetype <>", value, "zbSubCoursetype");
            return (Criteria) this;
        }

        public Criteria andZbSubCoursetypeGreaterThan(String value) {
            addCriterion("zb_sub_coursetype >", value, "zbSubCoursetype");
            return (Criteria) this;
        }

        public Criteria andZbSubCoursetypeGreaterThanOrEqualTo(String value) {
            addCriterion("zb_sub_coursetype >=", value, "zbSubCoursetype");
            return (Criteria) this;
        }

        public Criteria andZbSubCoursetypeLessThan(String value) {
            addCriterion("zb_sub_coursetype <", value, "zbSubCoursetype");
            return (Criteria) this;
        }

        public Criteria andZbSubCoursetypeLessThanOrEqualTo(String value) {
            addCriterion("zb_sub_coursetype <=", value, "zbSubCoursetype");
            return (Criteria) this;
        }

        public Criteria andZbSubCoursetypeLike(String value) {
            addCriterion("zb_sub_coursetype like", value, "zbSubCoursetype");
            return (Criteria) this;
        }

        public Criteria andZbSubCoursetypeNotLike(String value) {
            addCriterion("zb_sub_coursetype not like", value, "zbSubCoursetype");
            return (Criteria) this;
        }

        public Criteria andZbSubCoursetypeIn(List<String> values) {
            addCriterion("zb_sub_coursetype in", values, "zbSubCoursetype");
            return (Criteria) this;
        }

        public Criteria andZbSubCoursetypeNotIn(List<String> values) {
            addCriterion("zb_sub_coursetype not in", values, "zbSubCoursetype");
            return (Criteria) this;
        }

        public Criteria andZbSubCoursetypeBetween(String value1, String value2) {
            addCriterion("zb_sub_coursetype between", value1, value2, "zbSubCoursetype");
            return (Criteria) this;
        }

        public Criteria andZbSubCoursetypeNotBetween(String value1, String value2) {
            addCriterion("zb_sub_coursetype not between", value1, value2, "zbSubCoursetype");
            return (Criteria) this;
        }

        public Criteria andZbSubCoursetypeNameIsNull() {
            addCriterion("zb_sub_coursetype_name is null");
            return (Criteria) this;
        }

        public Criteria andZbSubCoursetypeNameIsNotNull() {
            addCriterion("zb_sub_coursetype_name is not null");
            return (Criteria) this;
        }

        public Criteria andZbSubCoursetypeNameEqualTo(String value) {
            addCriterion("zb_sub_coursetype_name =", value, "zbSubCoursetypeName");
            return (Criteria) this;
        }

        public Criteria andZbSubCoursetypeNameNotEqualTo(String value) {
            addCriterion("zb_sub_coursetype_name <>", value, "zbSubCoursetypeName");
            return (Criteria) this;
        }

        public Criteria andZbSubCoursetypeNameGreaterThan(String value) {
            addCriterion("zb_sub_coursetype_name >", value, "zbSubCoursetypeName");
            return (Criteria) this;
        }

        public Criteria andZbSubCoursetypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("zb_sub_coursetype_name >=", value, "zbSubCoursetypeName");
            return (Criteria) this;
        }

        public Criteria andZbSubCoursetypeNameLessThan(String value) {
            addCriterion("zb_sub_coursetype_name <", value, "zbSubCoursetypeName");
            return (Criteria) this;
        }

        public Criteria andZbSubCoursetypeNameLessThanOrEqualTo(String value) {
            addCriterion("zb_sub_coursetype_name <=", value, "zbSubCoursetypeName");
            return (Criteria) this;
        }

        public Criteria andZbSubCoursetypeNameLike(String value) {
            addCriterion("zb_sub_coursetype_name like", value, "zbSubCoursetypeName");
            return (Criteria) this;
        }

        public Criteria andZbSubCoursetypeNameNotLike(String value) {
            addCriterion("zb_sub_coursetype_name not like", value, "zbSubCoursetypeName");
            return (Criteria) this;
        }

        public Criteria andZbSubCoursetypeNameIn(List<String> values) {
            addCriterion("zb_sub_coursetype_name in", values, "zbSubCoursetypeName");
            return (Criteria) this;
        }

        public Criteria andZbSubCoursetypeNameNotIn(List<String> values) {
            addCriterion("zb_sub_coursetype_name not in", values, "zbSubCoursetypeName");
            return (Criteria) this;
        }

        public Criteria andZbSubCoursetypeNameBetween(String value1, String value2) {
            addCriterion("zb_sub_coursetype_name between", value1, value2, "zbSubCoursetypeName");
            return (Criteria) this;
        }

        public Criteria andZbSubCoursetypeNameNotBetween(String value1, String value2) {
            addCriterion("zb_sub_coursetype_name not between", value1, value2, "zbSubCoursetypeName");
            return (Criteria) this;
        }

        public Criteria andZbDirectionIsNull() {
            addCriterion("zb_direction is null");
            return (Criteria) this;
        }

        public Criteria andZbDirectionIsNotNull() {
            addCriterion("zb_direction is not null");
            return (Criteria) this;
        }

        public Criteria andZbDirectionEqualTo(String value) {
            addCriterion("zb_direction =", value, "zbDirection");
            return (Criteria) this;
        }

        public Criteria andZbDirectionNotEqualTo(String value) {
            addCriterion("zb_direction <>", value, "zbDirection");
            return (Criteria) this;
        }

        public Criteria andZbDirectionGreaterThan(String value) {
            addCriterion("zb_direction >", value, "zbDirection");
            return (Criteria) this;
        }

        public Criteria andZbDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("zb_direction >=", value, "zbDirection");
            return (Criteria) this;
        }

        public Criteria andZbDirectionLessThan(String value) {
            addCriterion("zb_direction <", value, "zbDirection");
            return (Criteria) this;
        }

        public Criteria andZbDirectionLessThanOrEqualTo(String value) {
            addCriterion("zb_direction <=", value, "zbDirection");
            return (Criteria) this;
        }

        public Criteria andZbDirectionLike(String value) {
            addCriterion("zb_direction like", value, "zbDirection");
            return (Criteria) this;
        }

        public Criteria andZbDirectionNotLike(String value) {
            addCriterion("zb_direction not like", value, "zbDirection");
            return (Criteria) this;
        }

        public Criteria andZbDirectionIn(List<String> values) {
            addCriterion("zb_direction in", values, "zbDirection");
            return (Criteria) this;
        }

        public Criteria andZbDirectionNotIn(List<String> values) {
            addCriterion("zb_direction not in", values, "zbDirection");
            return (Criteria) this;
        }

        public Criteria andZbDirectionBetween(String value1, String value2) {
            addCriterion("zb_direction between", value1, value2, "zbDirection");
            return (Criteria) this;
        }

        public Criteria andZbDirectionNotBetween(String value1, String value2) {
            addCriterion("zb_direction not between", value1, value2, "zbDirection");
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

        public Criteria andZbLevelIsNull() {
            addCriterion("zb_level is null");
            return (Criteria) this;
        }

        public Criteria andZbLevelIsNotNull() {
            addCriterion("zb_level is not null");
            return (Criteria) this;
        }

        public Criteria andZbLevelEqualTo(Boolean value) {
            addCriterion("zb_level =", value, "zbLevel");
            return (Criteria) this;
        }

        public Criteria andZbLevelNotEqualTo(Boolean value) {
            addCriterion("zb_level <>", value, "zbLevel");
            return (Criteria) this;
        }

        public Criteria andZbLevelGreaterThan(Boolean value) {
            addCriterion("zb_level >", value, "zbLevel");
            return (Criteria) this;
        }

        public Criteria andZbLevelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("zb_level >=", value, "zbLevel");
            return (Criteria) this;
        }

        public Criteria andZbLevelLessThan(Boolean value) {
            addCriterion("zb_level <", value, "zbLevel");
            return (Criteria) this;
        }

        public Criteria andZbLevelLessThanOrEqualTo(Boolean value) {
            addCriterion("zb_level <=", value, "zbLevel");
            return (Criteria) this;
        }

        public Criteria andZbLevelIn(List<Boolean> values) {
            addCriterion("zb_level in", values, "zbLevel");
            return (Criteria) this;
        }

        public Criteria andZbLevelNotIn(List<Boolean> values) {
            addCriterion("zb_level not in", values, "zbLevel");
            return (Criteria) this;
        }

        public Criteria andZbLevelBetween(Boolean value1, Boolean value2) {
            addCriterion("zb_level between", value1, value2, "zbLevel");
            return (Criteria) this;
        }

        public Criteria andZbLevelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("zb_level not between", value1, value2, "zbLevel");
            return (Criteria) this;
        }

        public Criteria andZbFreeIsNull() {
            addCriterion("zb_free is null");
            return (Criteria) this;
        }

        public Criteria andZbFreeIsNotNull() {
            addCriterion("zb_free is not null");
            return (Criteria) this;
        }

        public Criteria andZbFreeEqualTo(Boolean value) {
            addCriterion("zb_free =", value, "zbFree");
            return (Criteria) this;
        }

        public Criteria andZbFreeNotEqualTo(Boolean value) {
            addCriterion("zb_free <>", value, "zbFree");
            return (Criteria) this;
        }

        public Criteria andZbFreeGreaterThan(Boolean value) {
            addCriterion("zb_free >", value, "zbFree");
            return (Criteria) this;
        }

        public Criteria andZbFreeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("zb_free >=", value, "zbFree");
            return (Criteria) this;
        }

        public Criteria andZbFreeLessThan(Boolean value) {
            addCriterion("zb_free <", value, "zbFree");
            return (Criteria) this;
        }

        public Criteria andZbFreeLessThanOrEqualTo(Boolean value) {
            addCriterion("zb_free <=", value, "zbFree");
            return (Criteria) this;
        }

        public Criteria andZbFreeIn(List<Boolean> values) {
            addCriterion("zb_free in", values, "zbFree");
            return (Criteria) this;
        }

        public Criteria andZbFreeNotIn(List<Boolean> values) {
            addCriterion("zb_free not in", values, "zbFree");
            return (Criteria) this;
        }

        public Criteria andZbFreeBetween(Boolean value1, Boolean value2) {
            addCriterion("zb_free between", value1, value2, "zbFree");
            return (Criteria) this;
        }

        public Criteria andZbFreeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("zb_free not between", value1, value2, "zbFree");
            return (Criteria) this;
        }

        public Criteria andZbPriceIsNull() {
            addCriterion("zb_price is null");
            return (Criteria) this;
        }

        public Criteria andZbPriceIsNotNull() {
            addCriterion("zb_price is not null");
            return (Criteria) this;
        }

        public Criteria andZbPriceEqualTo(BigDecimal value) {
            addCriterion("zb_price =", value, "zbPrice");
            return (Criteria) this;
        }

        public Criteria andZbPriceNotEqualTo(BigDecimal value) {
            addCriterion("zb_price <>", value, "zbPrice");
            return (Criteria) this;
        }

        public Criteria andZbPriceGreaterThan(BigDecimal value) {
            addCriterion("zb_price >", value, "zbPrice");
            return (Criteria) this;
        }

        public Criteria andZbPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("zb_price >=", value, "zbPrice");
            return (Criteria) this;
        }

        public Criteria andZbPriceLessThan(BigDecimal value) {
            addCriterion("zb_price <", value, "zbPrice");
            return (Criteria) this;
        }

        public Criteria andZbPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("zb_price <=", value, "zbPrice");
            return (Criteria) this;
        }

        public Criteria andZbPriceIn(List<BigDecimal> values) {
            addCriterion("zb_price in", values, "zbPrice");
            return (Criteria) this;
        }

        public Criteria andZbPriceNotIn(List<BigDecimal> values) {
            addCriterion("zb_price not in", values, "zbPrice");
            return (Criteria) this;
        }

        public Criteria andZbPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zb_price between", value1, value2, "zbPrice");
            return (Criteria) this;
        }

        public Criteria andZbPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zb_price not between", value1, value2, "zbPrice");
            return (Criteria) this;
        }

        public Criteria andZbTimeIsNull() {
            addCriterion("zb_time is null");
            return (Criteria) this;
        }

        public Criteria andZbTimeIsNotNull() {
            addCriterion("zb_time is not null");
            return (Criteria) this;
        }

        public Criteria andZbTimeEqualTo(String value) {
            addCriterion("zb_time =", value, "zbTime");
            return (Criteria) this;
        }

        public Criteria andZbTimeNotEqualTo(String value) {
            addCriterion("zb_time <>", value, "zbTime");
            return (Criteria) this;
        }

        public Criteria andZbTimeGreaterThan(String value) {
            addCriterion("zb_time >", value, "zbTime");
            return (Criteria) this;
        }

        public Criteria andZbTimeGreaterThanOrEqualTo(String value) {
            addCriterion("zb_time >=", value, "zbTime");
            return (Criteria) this;
        }

        public Criteria andZbTimeLessThan(String value) {
            addCriterion("zb_time <", value, "zbTime");
            return (Criteria) this;
        }

        public Criteria andZbTimeLessThanOrEqualTo(String value) {
            addCriterion("zb_time <=", value, "zbTime");
            return (Criteria) this;
        }

        public Criteria andZbTimeLike(String value) {
            addCriterion("zb_time like", value, "zbTime");
            return (Criteria) this;
        }

        public Criteria andZbTimeNotLike(String value) {
            addCriterion("zb_time not like", value, "zbTime");
            return (Criteria) this;
        }

        public Criteria andZbTimeIn(List<String> values) {
            addCriterion("zb_time in", values, "zbTime");
            return (Criteria) this;
        }

        public Criteria andZbTimeNotIn(List<String> values) {
            addCriterion("zb_time not in", values, "zbTime");
            return (Criteria) this;
        }

        public Criteria andZbTimeBetween(String value1, String value2) {
            addCriterion("zb_time between", value1, value2, "zbTime");
            return (Criteria) this;
        }

        public Criteria andZbTimeNotBetween(String value1, String value2) {
            addCriterion("zb_time not between", value1, value2, "zbTime");
            return (Criteria) this;
        }

        public Criteria andZbOnsaleIsNull() {
            addCriterion("zb_onsale is null");
            return (Criteria) this;
        }

        public Criteria andZbOnsaleIsNotNull() {
            addCriterion("zb_onsale is not null");
            return (Criteria) this;
        }

        public Criteria andZbOnsaleEqualTo(Boolean value) {
            addCriterion("zb_onsale =", value, "zbOnsale");
            return (Criteria) this;
        }

        public Criteria andZbOnsaleNotEqualTo(Boolean value) {
            addCriterion("zb_onsale <>", value, "zbOnsale");
            return (Criteria) this;
        }

        public Criteria andZbOnsaleGreaterThan(Boolean value) {
            addCriterion("zb_onsale >", value, "zbOnsale");
            return (Criteria) this;
        }

        public Criteria andZbOnsaleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("zb_onsale >=", value, "zbOnsale");
            return (Criteria) this;
        }

        public Criteria andZbOnsaleLessThan(Boolean value) {
            addCriterion("zb_onsale <", value, "zbOnsale");
            return (Criteria) this;
        }

        public Criteria andZbOnsaleLessThanOrEqualTo(Boolean value) {
            addCriterion("zb_onsale <=", value, "zbOnsale");
            return (Criteria) this;
        }

        public Criteria andZbOnsaleIn(List<Boolean> values) {
            addCriterion("zb_onsale in", values, "zbOnsale");
            return (Criteria) this;
        }

        public Criteria andZbOnsaleNotIn(List<Boolean> values) {
            addCriterion("zb_onsale not in", values, "zbOnsale");
            return (Criteria) this;
        }

        public Criteria andZbOnsaleBetween(Boolean value1, Boolean value2) {
            addCriterion("zb_onsale between", value1, value2, "zbOnsale");
            return (Criteria) this;
        }

        public Criteria andZbOnsaleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("zb_onsale not between", value1, value2, "zbOnsale");
            return (Criteria) this;
        }

        public Criteria andZbPictureIsNull() {
            addCriterion("zb_picture is null");
            return (Criteria) this;
        }

        public Criteria andZbPictureIsNotNull() {
            addCriterion("zb_picture is not null");
            return (Criteria) this;
        }

        public Criteria andZbPictureEqualTo(String value) {
            addCriterion("zb_picture =", value, "zbPicture");
            return (Criteria) this;
        }

        public Criteria andZbPictureNotEqualTo(String value) {
            addCriterion("zb_picture <>", value, "zbPicture");
            return (Criteria) this;
        }

        public Criteria andZbPictureGreaterThan(String value) {
            addCriterion("zb_picture >", value, "zbPicture");
            return (Criteria) this;
        }

        public Criteria andZbPictureGreaterThanOrEqualTo(String value) {
            addCriterion("zb_picture >=", value, "zbPicture");
            return (Criteria) this;
        }

        public Criteria andZbPictureLessThan(String value) {
            addCriterion("zb_picture <", value, "zbPicture");
            return (Criteria) this;
        }

        public Criteria andZbPictureLessThanOrEqualTo(String value) {
            addCriterion("zb_picture <=", value, "zbPicture");
            return (Criteria) this;
        }

        public Criteria andZbPictureLike(String value) {
            addCriterion("zb_picture like", value, "zbPicture");
            return (Criteria) this;
        }

        public Criteria andZbPictureNotLike(String value) {
            addCriterion("zb_picture not like", value, "zbPicture");
            return (Criteria) this;
        }

        public Criteria andZbPictureIn(List<String> values) {
            addCriterion("zb_picture in", values, "zbPicture");
            return (Criteria) this;
        }

        public Criteria andZbPictureNotIn(List<String> values) {
            addCriterion("zb_picture not in", values, "zbPicture");
            return (Criteria) this;
        }

        public Criteria andZbPictureBetween(String value1, String value2) {
            addCriterion("zb_picture between", value1, value2, "zbPicture");
            return (Criteria) this;
        }

        public Criteria andZbPictureNotBetween(String value1, String value2) {
            addCriterion("zb_picture not between", value1, value2, "zbPicture");
            return (Criteria) this;
        }

        public Criteria andZbRecommendIsNull() {
            addCriterion("zb_recommend is null");
            return (Criteria) this;
        }

        public Criteria andZbRecommendIsNotNull() {
            addCriterion("zb_recommend is not null");
            return (Criteria) this;
        }

        public Criteria andZbRecommendEqualTo(Boolean value) {
            addCriterion("zb_recommend =", value, "zbRecommend");
            return (Criteria) this;
        }

        public Criteria andZbRecommendNotEqualTo(Boolean value) {
            addCriterion("zb_recommend <>", value, "zbRecommend");
            return (Criteria) this;
        }

        public Criteria andZbRecommendGreaterThan(Boolean value) {
            addCriterion("zb_recommend >", value, "zbRecommend");
            return (Criteria) this;
        }

        public Criteria andZbRecommendGreaterThanOrEqualTo(Boolean value) {
            addCriterion("zb_recommend >=", value, "zbRecommend");
            return (Criteria) this;
        }

        public Criteria andZbRecommendLessThan(Boolean value) {
            addCriterion("zb_recommend <", value, "zbRecommend");
            return (Criteria) this;
        }

        public Criteria andZbRecommendLessThanOrEqualTo(Boolean value) {
            addCriterion("zb_recommend <=", value, "zbRecommend");
            return (Criteria) this;
        }

        public Criteria andZbRecommendIn(List<Boolean> values) {
            addCriterion("zb_recommend in", values, "zbRecommend");
            return (Criteria) this;
        }

        public Criteria andZbRecommendNotIn(List<Boolean> values) {
            addCriterion("zb_recommend not in", values, "zbRecommend");
            return (Criteria) this;
        }

        public Criteria andZbRecommendBetween(Boolean value1, Boolean value2) {
            addCriterion("zb_recommend between", value1, value2, "zbRecommend");
            return (Criteria) this;
        }

        public Criteria andZbRecommendNotBetween(Boolean value1, Boolean value2) {
            addCriterion("zb_recommend not between", value1, value2, "zbRecommend");
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

        public Criteria andZbStudyCountIsNull() {
            addCriterion("zb_study_count is null");
            return (Criteria) this;
        }

        public Criteria andZbStudyCountIsNotNull() {
            addCriterion("zb_study_count is not null");
            return (Criteria) this;
        }

        public Criteria andZbStudyCountEqualTo(Integer value) {
            addCriterion("zb_study_count =", value, "zbStudyCount");
            return (Criteria) this;
        }

        public Criteria andZbStudyCountNotEqualTo(Integer value) {
            addCriterion("zb_study_count <>", value, "zbStudyCount");
            return (Criteria) this;
        }

        public Criteria andZbStudyCountGreaterThan(Integer value) {
            addCriterion("zb_study_count >", value, "zbStudyCount");
            return (Criteria) this;
        }

        public Criteria andZbStudyCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("zb_study_count >=", value, "zbStudyCount");
            return (Criteria) this;
        }

        public Criteria andZbStudyCountLessThan(Integer value) {
            addCriterion("zb_study_count <", value, "zbStudyCount");
            return (Criteria) this;
        }

        public Criteria andZbStudyCountLessThanOrEqualTo(Integer value) {
            addCriterion("zb_study_count <=", value, "zbStudyCount");
            return (Criteria) this;
        }

        public Criteria andZbStudyCountIn(List<Integer> values) {
            addCriterion("zb_study_count in", values, "zbStudyCount");
            return (Criteria) this;
        }

        public Criteria andZbStudyCountNotIn(List<Integer> values) {
            addCriterion("zb_study_count not in", values, "zbStudyCount");
            return (Criteria) this;
        }

        public Criteria andZbStudyCountBetween(Integer value1, Integer value2) {
            addCriterion("zb_study_count between", value1, value2, "zbStudyCount");
            return (Criteria) this;
        }

        public Criteria andZbStudyCountNotBetween(Integer value1, Integer value2) {
            addCriterion("zb_study_count not between", value1, value2, "zbStudyCount");
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

        public Criteria andZbCreateUserIsNull() {
            addCriterion("zb_create_user is null");
            return (Criteria) this;
        }

        public Criteria andZbCreateUserIsNotNull() {
            addCriterion("zb_create_user is not null");
            return (Criteria) this;
        }

        public Criteria andZbCreateUserEqualTo(String value) {
            addCriterion("zb_create_user =", value, "zbCreateUser");
            return (Criteria) this;
        }

        public Criteria andZbCreateUserNotEqualTo(String value) {
            addCriterion("zb_create_user <>", value, "zbCreateUser");
            return (Criteria) this;
        }

        public Criteria andZbCreateUserGreaterThan(String value) {
            addCriterion("zb_create_user >", value, "zbCreateUser");
            return (Criteria) this;
        }

        public Criteria andZbCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("zb_create_user >=", value, "zbCreateUser");
            return (Criteria) this;
        }

        public Criteria andZbCreateUserLessThan(String value) {
            addCriterion("zb_create_user <", value, "zbCreateUser");
            return (Criteria) this;
        }

        public Criteria andZbCreateUserLessThanOrEqualTo(String value) {
            addCriterion("zb_create_user <=", value, "zbCreateUser");
            return (Criteria) this;
        }

        public Criteria andZbCreateUserLike(String value) {
            addCriterion("zb_create_user like", value, "zbCreateUser");
            return (Criteria) this;
        }

        public Criteria andZbCreateUserNotLike(String value) {
            addCriterion("zb_create_user not like", value, "zbCreateUser");
            return (Criteria) this;
        }

        public Criteria andZbCreateUserIn(List<String> values) {
            addCriterion("zb_create_user in", values, "zbCreateUser");
            return (Criteria) this;
        }

        public Criteria andZbCreateUserNotIn(List<String> values) {
            addCriterion("zb_create_user not in", values, "zbCreateUser");
            return (Criteria) this;
        }

        public Criteria andZbCreateUserBetween(String value1, String value2) {
            addCriterion("zb_create_user between", value1, value2, "zbCreateUser");
            return (Criteria) this;
        }

        public Criteria andZbCreateUserNotBetween(String value1, String value2) {
            addCriterion("zb_create_user not between", value1, value2, "zbCreateUser");
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

        public Criteria andZbUpdateUserIsNull() {
            addCriterion("zb_update_user is null");
            return (Criteria) this;
        }

        public Criteria andZbUpdateUserIsNotNull() {
            addCriterion("zb_update_user is not null");
            return (Criteria) this;
        }

        public Criteria andZbUpdateUserEqualTo(String value) {
            addCriterion("zb_update_user =", value, "zbUpdateUser");
            return (Criteria) this;
        }

        public Criteria andZbUpdateUserNotEqualTo(String value) {
            addCriterion("zb_update_user <>", value, "zbUpdateUser");
            return (Criteria) this;
        }

        public Criteria andZbUpdateUserGreaterThan(String value) {
            addCriterion("zb_update_user >", value, "zbUpdateUser");
            return (Criteria) this;
        }

        public Criteria andZbUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("zb_update_user >=", value, "zbUpdateUser");
            return (Criteria) this;
        }

        public Criteria andZbUpdateUserLessThan(String value) {
            addCriterion("zb_update_user <", value, "zbUpdateUser");
            return (Criteria) this;
        }

        public Criteria andZbUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("zb_update_user <=", value, "zbUpdateUser");
            return (Criteria) this;
        }

        public Criteria andZbUpdateUserLike(String value) {
            addCriterion("zb_update_user like", value, "zbUpdateUser");
            return (Criteria) this;
        }

        public Criteria andZbUpdateUserNotLike(String value) {
            addCriterion("zb_update_user not like", value, "zbUpdateUser");
            return (Criteria) this;
        }

        public Criteria andZbUpdateUserIn(List<String> values) {
            addCriterion("zb_update_user in", values, "zbUpdateUser");
            return (Criteria) this;
        }

        public Criteria andZbUpdateUserNotIn(List<String> values) {
            addCriterion("zb_update_user not in", values, "zbUpdateUser");
            return (Criteria) this;
        }

        public Criteria andZbUpdateUserBetween(String value1, String value2) {
            addCriterion("zb_update_user between", value1, value2, "zbUpdateUser");
            return (Criteria) this;
        }

        public Criteria andZbUpdateUserNotBetween(String value1, String value2) {
            addCriterion("zb_update_user not between", value1, value2, "zbUpdateUser");
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