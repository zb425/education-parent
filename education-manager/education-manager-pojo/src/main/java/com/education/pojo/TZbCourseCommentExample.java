package com.education.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TZbCourseCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TZbCourseCommentExample() {
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

        public Criteria andZbToUsernameIsNull() {
            addCriterion("zb_to_username is null");
            return (Criteria) this;
        }

        public Criteria andZbToUsernameIsNotNull() {
            addCriterion("zb_to_username is not null");
            return (Criteria) this;
        }

        public Criteria andZbToUsernameEqualTo(String value) {
            addCriterion("zb_to_username =", value, "zbToUsername");
            return (Criteria) this;
        }

        public Criteria andZbToUsernameNotEqualTo(String value) {
            addCriterion("zb_to_username <>", value, "zbToUsername");
            return (Criteria) this;
        }

        public Criteria andZbToUsernameGreaterThan(String value) {
            addCriterion("zb_to_username >", value, "zbToUsername");
            return (Criteria) this;
        }

        public Criteria andZbToUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("zb_to_username >=", value, "zbToUsername");
            return (Criteria) this;
        }

        public Criteria andZbToUsernameLessThan(String value) {
            addCriterion("zb_to_username <", value, "zbToUsername");
            return (Criteria) this;
        }

        public Criteria andZbToUsernameLessThanOrEqualTo(String value) {
            addCriterion("zb_to_username <=", value, "zbToUsername");
            return (Criteria) this;
        }

        public Criteria andZbToUsernameLike(String value) {
            addCriterion("zb_to_username like", value, "zbToUsername");
            return (Criteria) this;
        }

        public Criteria andZbToUsernameNotLike(String value) {
            addCriterion("zb_to_username not like", value, "zbToUsername");
            return (Criteria) this;
        }

        public Criteria andZbToUsernameIn(List<String> values) {
            addCriterion("zb_to_username in", values, "zbToUsername");
            return (Criteria) this;
        }

        public Criteria andZbToUsernameNotIn(List<String> values) {
            addCriterion("zb_to_username not in", values, "zbToUsername");
            return (Criteria) this;
        }

        public Criteria andZbToUsernameBetween(String value1, String value2) {
            addCriterion("zb_to_username between", value1, value2, "zbToUsername");
            return (Criteria) this;
        }

        public Criteria andZbToUsernameNotBetween(String value1, String value2) {
            addCriterion("zb_to_username not between", value1, value2, "zbToUsername");
            return (Criteria) this;
        }

        public Criteria andZbCourseIdIsNull() {
            addCriterion("zb_course_id is null");
            return (Criteria) this;
        }

        public Criteria andZbCourseIdIsNotNull() {
            addCriterion("zb_course_id is not null");
            return (Criteria) this;
        }

        public Criteria andZbCourseIdEqualTo(Integer value) {
            addCriterion("zb_course_id =", value, "zbCourseId");
            return (Criteria) this;
        }

        public Criteria andZbCourseIdNotEqualTo(Integer value) {
            addCriterion("zb_course_id <>", value, "zbCourseId");
            return (Criteria) this;
        }

        public Criteria andZbCourseIdGreaterThan(Integer value) {
            addCriterion("zb_course_id >", value, "zbCourseId");
            return (Criteria) this;
        }

        public Criteria andZbCourseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("zb_course_id >=", value, "zbCourseId");
            return (Criteria) this;
        }

        public Criteria andZbCourseIdLessThan(Integer value) {
            addCriterion("zb_course_id <", value, "zbCourseId");
            return (Criteria) this;
        }

        public Criteria andZbCourseIdLessThanOrEqualTo(Integer value) {
            addCriterion("zb_course_id <=", value, "zbCourseId");
            return (Criteria) this;
        }

        public Criteria andZbCourseIdIn(List<Integer> values) {
            addCriterion("zb_course_id in", values, "zbCourseId");
            return (Criteria) this;
        }

        public Criteria andZbCourseIdNotIn(List<Integer> values) {
            addCriterion("zb_course_id not in", values, "zbCourseId");
            return (Criteria) this;
        }

        public Criteria andZbCourseIdBetween(Integer value1, Integer value2) {
            addCriterion("zb_course_id between", value1, value2, "zbCourseId");
            return (Criteria) this;
        }

        public Criteria andZbCourseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("zb_course_id not between", value1, value2, "zbCourseId");
            return (Criteria) this;
        }

        public Criteria andZbSectionIdIsNull() {
            addCriterion("zb_section_id is null");
            return (Criteria) this;
        }

        public Criteria andZbSectionIdIsNotNull() {
            addCriterion("zb_section_id is not null");
            return (Criteria) this;
        }

        public Criteria andZbSectionIdEqualTo(Integer value) {
            addCriterion("zb_section_id =", value, "zbSectionId");
            return (Criteria) this;
        }

        public Criteria andZbSectionIdNotEqualTo(Integer value) {
            addCriterion("zb_section_id <>", value, "zbSectionId");
            return (Criteria) this;
        }

        public Criteria andZbSectionIdGreaterThan(Integer value) {
            addCriterion("zb_section_id >", value, "zbSectionId");
            return (Criteria) this;
        }

        public Criteria andZbSectionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("zb_section_id >=", value, "zbSectionId");
            return (Criteria) this;
        }

        public Criteria andZbSectionIdLessThan(Integer value) {
            addCriterion("zb_section_id <", value, "zbSectionId");
            return (Criteria) this;
        }

        public Criteria andZbSectionIdLessThanOrEqualTo(Integer value) {
            addCriterion("zb_section_id <=", value, "zbSectionId");
            return (Criteria) this;
        }

        public Criteria andZbSectionIdIn(List<Integer> values) {
            addCriterion("zb_section_id in", values, "zbSectionId");
            return (Criteria) this;
        }

        public Criteria andZbSectionIdNotIn(List<Integer> values) {
            addCriterion("zb_section_id not in", values, "zbSectionId");
            return (Criteria) this;
        }

        public Criteria andZbSectionIdBetween(Integer value1, Integer value2) {
            addCriterion("zb_section_id between", value1, value2, "zbSectionId");
            return (Criteria) this;
        }

        public Criteria andZbSectionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("zb_section_id not between", value1, value2, "zbSectionId");
            return (Criteria) this;
        }

        public Criteria andZbSectionTitleIsNull() {
            addCriterion("zb_section_title is null");
            return (Criteria) this;
        }

        public Criteria andZbSectionTitleIsNotNull() {
            addCriterion("zb_section_title is not null");
            return (Criteria) this;
        }

        public Criteria andZbSectionTitleEqualTo(String value) {
            addCriterion("zb_section_title =", value, "zbSectionTitle");
            return (Criteria) this;
        }

        public Criteria andZbSectionTitleNotEqualTo(String value) {
            addCriterion("zb_section_title <>", value, "zbSectionTitle");
            return (Criteria) this;
        }

        public Criteria andZbSectionTitleGreaterThan(String value) {
            addCriterion("zb_section_title >", value, "zbSectionTitle");
            return (Criteria) this;
        }

        public Criteria andZbSectionTitleGreaterThanOrEqualTo(String value) {
            addCriterion("zb_section_title >=", value, "zbSectionTitle");
            return (Criteria) this;
        }

        public Criteria andZbSectionTitleLessThan(String value) {
            addCriterion("zb_section_title <", value, "zbSectionTitle");
            return (Criteria) this;
        }

        public Criteria andZbSectionTitleLessThanOrEqualTo(String value) {
            addCriterion("zb_section_title <=", value, "zbSectionTitle");
            return (Criteria) this;
        }

        public Criteria andZbSectionTitleLike(String value) {
            addCriterion("zb_section_title like", value, "zbSectionTitle");
            return (Criteria) this;
        }

        public Criteria andZbSectionTitleNotLike(String value) {
            addCriterion("zb_section_title not like", value, "zbSectionTitle");
            return (Criteria) this;
        }

        public Criteria andZbSectionTitleIn(List<String> values) {
            addCriterion("zb_section_title in", values, "zbSectionTitle");
            return (Criteria) this;
        }

        public Criteria andZbSectionTitleNotIn(List<String> values) {
            addCriterion("zb_section_title not in", values, "zbSectionTitle");
            return (Criteria) this;
        }

        public Criteria andZbSectionTitleBetween(String value1, String value2) {
            addCriterion("zb_section_title between", value1, value2, "zbSectionTitle");
            return (Criteria) this;
        }

        public Criteria andZbSectionTitleNotBetween(String value1, String value2) {
            addCriterion("zb_section_title not between", value1, value2, "zbSectionTitle");
            return (Criteria) this;
        }

        public Criteria andZbContentIsNull() {
            addCriterion("zb_content is null");
            return (Criteria) this;
        }

        public Criteria andZbContentIsNotNull() {
            addCriterion("zb_content is not null");
            return (Criteria) this;
        }

        public Criteria andZbContentEqualTo(String value) {
            addCriterion("zb_content =", value, "zbContent");
            return (Criteria) this;
        }

        public Criteria andZbContentNotEqualTo(String value) {
            addCriterion("zb_content <>", value, "zbContent");
            return (Criteria) this;
        }

        public Criteria andZbContentGreaterThan(String value) {
            addCriterion("zb_content >", value, "zbContent");
            return (Criteria) this;
        }

        public Criteria andZbContentGreaterThanOrEqualTo(String value) {
            addCriterion("zb_content >=", value, "zbContent");
            return (Criteria) this;
        }

        public Criteria andZbContentLessThan(String value) {
            addCriterion("zb_content <", value, "zbContent");
            return (Criteria) this;
        }

        public Criteria andZbContentLessThanOrEqualTo(String value) {
            addCriterion("zb_content <=", value, "zbContent");
            return (Criteria) this;
        }

        public Criteria andZbContentLike(String value) {
            addCriterion("zb_content like", value, "zbContent");
            return (Criteria) this;
        }

        public Criteria andZbContentNotLike(String value) {
            addCriterion("zb_content not like", value, "zbContent");
            return (Criteria) this;
        }

        public Criteria andZbContentIn(List<String> values) {
            addCriterion("zb_content in", values, "zbContent");
            return (Criteria) this;
        }

        public Criteria andZbContentNotIn(List<String> values) {
            addCriterion("zb_content not in", values, "zbContent");
            return (Criteria) this;
        }

        public Criteria andZbContentBetween(String value1, String value2) {
            addCriterion("zb_content between", value1, value2, "zbContent");
            return (Criteria) this;
        }

        public Criteria andZbContentNotBetween(String value1, String value2) {
            addCriterion("zb_content not between", value1, value2, "zbContent");
            return (Criteria) this;
        }

        public Criteria andZbRefIdIsNull() {
            addCriterion("zb_ref_id is null");
            return (Criteria) this;
        }

        public Criteria andZbRefIdIsNotNull() {
            addCriterion("zb_ref_id is not null");
            return (Criteria) this;
        }

        public Criteria andZbRefIdEqualTo(Integer value) {
            addCriterion("zb_ref_id =", value, "zbRefId");
            return (Criteria) this;
        }

        public Criteria andZbRefIdNotEqualTo(Integer value) {
            addCriterion("zb_ref_id <>", value, "zbRefId");
            return (Criteria) this;
        }

        public Criteria andZbRefIdGreaterThan(Integer value) {
            addCriterion("zb_ref_id >", value, "zbRefId");
            return (Criteria) this;
        }

        public Criteria andZbRefIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("zb_ref_id >=", value, "zbRefId");
            return (Criteria) this;
        }

        public Criteria andZbRefIdLessThan(Integer value) {
            addCriterion("zb_ref_id <", value, "zbRefId");
            return (Criteria) this;
        }

        public Criteria andZbRefIdLessThanOrEqualTo(Integer value) {
            addCriterion("zb_ref_id <=", value, "zbRefId");
            return (Criteria) this;
        }

        public Criteria andZbRefIdIn(List<Integer> values) {
            addCriterion("zb_ref_id in", values, "zbRefId");
            return (Criteria) this;
        }

        public Criteria andZbRefIdNotIn(List<Integer> values) {
            addCriterion("zb_ref_id not in", values, "zbRefId");
            return (Criteria) this;
        }

        public Criteria andZbRefIdBetween(Integer value1, Integer value2) {
            addCriterion("zb_ref_id between", value1, value2, "zbRefId");
            return (Criteria) this;
        }

        public Criteria andZbRefIdNotBetween(Integer value1, Integer value2) {
            addCriterion("zb_ref_id not between", value1, value2, "zbRefId");
            return (Criteria) this;
        }

        public Criteria andZbRefContentIsNull() {
            addCriterion("zb_ref_content is null");
            return (Criteria) this;
        }

        public Criteria andZbRefContentIsNotNull() {
            addCriterion("zb_ref_content is not null");
            return (Criteria) this;
        }

        public Criteria andZbRefContentEqualTo(String value) {
            addCriterion("zb_ref_content =", value, "zbRefContent");
            return (Criteria) this;
        }

        public Criteria andZbRefContentNotEqualTo(String value) {
            addCriterion("zb_ref_content <>", value, "zbRefContent");
            return (Criteria) this;
        }

        public Criteria andZbRefContentGreaterThan(String value) {
            addCriterion("zb_ref_content >", value, "zbRefContent");
            return (Criteria) this;
        }

        public Criteria andZbRefContentGreaterThanOrEqualTo(String value) {
            addCriterion("zb_ref_content >=", value, "zbRefContent");
            return (Criteria) this;
        }

        public Criteria andZbRefContentLessThan(String value) {
            addCriterion("zb_ref_content <", value, "zbRefContent");
            return (Criteria) this;
        }

        public Criteria andZbRefContentLessThanOrEqualTo(String value) {
            addCriterion("zb_ref_content <=", value, "zbRefContent");
            return (Criteria) this;
        }

        public Criteria andZbRefContentLike(String value) {
            addCriterion("zb_ref_content like", value, "zbRefContent");
            return (Criteria) this;
        }

        public Criteria andZbRefContentNotLike(String value) {
            addCriterion("zb_ref_content not like", value, "zbRefContent");
            return (Criteria) this;
        }

        public Criteria andZbRefContentIn(List<String> values) {
            addCriterion("zb_ref_content in", values, "zbRefContent");
            return (Criteria) this;
        }

        public Criteria andZbRefContentNotIn(List<String> values) {
            addCriterion("zb_ref_content not in", values, "zbRefContent");
            return (Criteria) this;
        }

        public Criteria andZbRefContentBetween(String value1, String value2) {
            addCriterion("zb_ref_content between", value1, value2, "zbRefContent");
            return (Criteria) this;
        }

        public Criteria andZbRefContentNotBetween(String value1, String value2) {
            addCriterion("zb_ref_content not between", value1, value2, "zbRefContent");
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

        public Criteria andZbTypeEqualTo(Byte value) {
            addCriterion("zb_type =", value, "zbType");
            return (Criteria) this;
        }

        public Criteria andZbTypeNotEqualTo(Byte value) {
            addCriterion("zb_type <>", value, "zbType");
            return (Criteria) this;
        }

        public Criteria andZbTypeGreaterThan(Byte value) {
            addCriterion("zb_type >", value, "zbType");
            return (Criteria) this;
        }

        public Criteria andZbTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("zb_type >=", value, "zbType");
            return (Criteria) this;
        }

        public Criteria andZbTypeLessThan(Byte value) {
            addCriterion("zb_type <", value, "zbType");
            return (Criteria) this;
        }

        public Criteria andZbTypeLessThanOrEqualTo(Byte value) {
            addCriterion("zb_type <=", value, "zbType");
            return (Criteria) this;
        }

        public Criteria andZbTypeIn(List<Byte> values) {
            addCriterion("zb_type in", values, "zbType");
            return (Criteria) this;
        }

        public Criteria andZbTypeNotIn(List<Byte> values) {
            addCriterion("zb_type not in", values, "zbType");
            return (Criteria) this;
        }

        public Criteria andZbTypeBetween(Byte value1, Byte value2) {
            addCriterion("zb_type between", value1, value2, "zbType");
            return (Criteria) this;
        }

        public Criteria andZbTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("zb_type not between", value1, value2, "zbType");
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