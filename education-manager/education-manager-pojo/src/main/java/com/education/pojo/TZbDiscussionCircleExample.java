package com.education.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TZbDiscussionCircleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TZbDiscussionCircleExample() {
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

        public Criteria andZbCircleUsernameIsNull() {
            addCriterion("zb_circle_username is null");
            return (Criteria) this;
        }

        public Criteria andZbCircleUsernameIsNotNull() {
            addCriterion("zb_circle_username is not null");
            return (Criteria) this;
        }

        public Criteria andZbCircleUsernameEqualTo(String value) {
            addCriterion("zb_circle_username =", value, "zbCircleUsername");
            return (Criteria) this;
        }

        public Criteria andZbCircleUsernameNotEqualTo(String value) {
            addCriterion("zb_circle_username <>", value, "zbCircleUsername");
            return (Criteria) this;
        }

        public Criteria andZbCircleUsernameGreaterThan(String value) {
            addCriterion("zb_circle_username >", value, "zbCircleUsername");
            return (Criteria) this;
        }

        public Criteria andZbCircleUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("zb_circle_username >=", value, "zbCircleUsername");
            return (Criteria) this;
        }

        public Criteria andZbCircleUsernameLessThan(String value) {
            addCriterion("zb_circle_username <", value, "zbCircleUsername");
            return (Criteria) this;
        }

        public Criteria andZbCircleUsernameLessThanOrEqualTo(String value) {
            addCriterion("zb_circle_username <=", value, "zbCircleUsername");
            return (Criteria) this;
        }

        public Criteria andZbCircleUsernameLike(String value) {
            addCriterion("zb_circle_username like", value, "zbCircleUsername");
            return (Criteria) this;
        }

        public Criteria andZbCircleUsernameNotLike(String value) {
            addCriterion("zb_circle_username not like", value, "zbCircleUsername");
            return (Criteria) this;
        }

        public Criteria andZbCircleUsernameIn(List<String> values) {
            addCriterion("zb_circle_username in", values, "zbCircleUsername");
            return (Criteria) this;
        }

        public Criteria andZbCircleUsernameNotIn(List<String> values) {
            addCriterion("zb_circle_username not in", values, "zbCircleUsername");
            return (Criteria) this;
        }

        public Criteria andZbCircleUsernameBetween(String value1, String value2) {
            addCriterion("zb_circle_username between", value1, value2, "zbCircleUsername");
            return (Criteria) this;
        }

        public Criteria andZbCircleUsernameNotBetween(String value1, String value2) {
            addCriterion("zb_circle_username not between", value1, value2, "zbCircleUsername");
            return (Criteria) this;
        }

        public Criteria andZbCircleContentIsNull() {
            addCriterion("zb_circle_content is null");
            return (Criteria) this;
        }

        public Criteria andZbCircleContentIsNotNull() {
            addCriterion("zb_circle_content is not null");
            return (Criteria) this;
        }

        public Criteria andZbCircleContentEqualTo(String value) {
            addCriterion("zb_circle_content =", value, "zbCircleContent");
            return (Criteria) this;
        }

        public Criteria andZbCircleContentNotEqualTo(String value) {
            addCriterion("zb_circle_content <>", value, "zbCircleContent");
            return (Criteria) this;
        }

        public Criteria andZbCircleContentGreaterThan(String value) {
            addCriterion("zb_circle_content >", value, "zbCircleContent");
            return (Criteria) this;
        }

        public Criteria andZbCircleContentGreaterThanOrEqualTo(String value) {
            addCriterion("zb_circle_content >=", value, "zbCircleContent");
            return (Criteria) this;
        }

        public Criteria andZbCircleContentLessThan(String value) {
            addCriterion("zb_circle_content <", value, "zbCircleContent");
            return (Criteria) this;
        }

        public Criteria andZbCircleContentLessThanOrEqualTo(String value) {
            addCriterion("zb_circle_content <=", value, "zbCircleContent");
            return (Criteria) this;
        }

        public Criteria andZbCircleContentLike(String value) {
            addCriterion("zb_circle_content like", value, "zbCircleContent");
            return (Criteria) this;
        }

        public Criteria andZbCircleContentNotLike(String value) {
            addCriterion("zb_circle_content not like", value, "zbCircleContent");
            return (Criteria) this;
        }

        public Criteria andZbCircleContentIn(List<String> values) {
            addCriterion("zb_circle_content in", values, "zbCircleContent");
            return (Criteria) this;
        }

        public Criteria andZbCircleContentNotIn(List<String> values) {
            addCriterion("zb_circle_content not in", values, "zbCircleContent");
            return (Criteria) this;
        }

        public Criteria andZbCircleContentBetween(String value1, String value2) {
            addCriterion("zb_circle_content between", value1, value2, "zbCircleContent");
            return (Criteria) this;
        }

        public Criteria andZbCircleContentNotBetween(String value1, String value2) {
            addCriterion("zb_circle_content not between", value1, value2, "zbCircleContent");
            return (Criteria) this;
        }

        public Criteria andZbCircleImageIsNull() {
            addCriterion("zb_circle_image is null");
            return (Criteria) this;
        }

        public Criteria andZbCircleImageIsNotNull() {
            addCriterion("zb_circle_image is not null");
            return (Criteria) this;
        }

        public Criteria andZbCircleImageEqualTo(String value) {
            addCriterion("zb_circle_image =", value, "zbCircleImage");
            return (Criteria) this;
        }

        public Criteria andZbCircleImageNotEqualTo(String value) {
            addCriterion("zb_circle_image <>", value, "zbCircleImage");
            return (Criteria) this;
        }

        public Criteria andZbCircleImageGreaterThan(String value) {
            addCriterion("zb_circle_image >", value, "zbCircleImage");
            return (Criteria) this;
        }

        public Criteria andZbCircleImageGreaterThanOrEqualTo(String value) {
            addCriterion("zb_circle_image >=", value, "zbCircleImage");
            return (Criteria) this;
        }

        public Criteria andZbCircleImageLessThan(String value) {
            addCriterion("zb_circle_image <", value, "zbCircleImage");
            return (Criteria) this;
        }

        public Criteria andZbCircleImageLessThanOrEqualTo(String value) {
            addCriterion("zb_circle_image <=", value, "zbCircleImage");
            return (Criteria) this;
        }

        public Criteria andZbCircleImageLike(String value) {
            addCriterion("zb_circle_image like", value, "zbCircleImage");
            return (Criteria) this;
        }

        public Criteria andZbCircleImageNotLike(String value) {
            addCriterion("zb_circle_image not like", value, "zbCircleImage");
            return (Criteria) this;
        }

        public Criteria andZbCircleImageIn(List<String> values) {
            addCriterion("zb_circle_image in", values, "zbCircleImage");
            return (Criteria) this;
        }

        public Criteria andZbCircleImageNotIn(List<String> values) {
            addCriterion("zb_circle_image not in", values, "zbCircleImage");
            return (Criteria) this;
        }

        public Criteria andZbCircleImageBetween(String value1, String value2) {
            addCriterion("zb_circle_image between", value1, value2, "zbCircleImage");
            return (Criteria) this;
        }

        public Criteria andZbCircleImageNotBetween(String value1, String value2) {
            addCriterion("zb_circle_image not between", value1, value2, "zbCircleImage");
            return (Criteria) this;
        }

        public Criteria andZbCircleDiscussionidIsNull() {
            addCriterion("zb_circle_discussionId is null");
            return (Criteria) this;
        }

        public Criteria andZbCircleDiscussionidIsNotNull() {
            addCriterion("zb_circle_discussionId is not null");
            return (Criteria) this;
        }

        public Criteria andZbCircleDiscussionidEqualTo(Integer value) {
            addCriterion("zb_circle_discussionId =", value, "zbCircleDiscussionid");
            return (Criteria) this;
        }

        public Criteria andZbCircleDiscussionidNotEqualTo(Integer value) {
            addCriterion("zb_circle_discussionId <>", value, "zbCircleDiscussionid");
            return (Criteria) this;
        }

        public Criteria andZbCircleDiscussionidGreaterThan(Integer value) {
            addCriterion("zb_circle_discussionId >", value, "zbCircleDiscussionid");
            return (Criteria) this;
        }

        public Criteria andZbCircleDiscussionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("zb_circle_discussionId >=", value, "zbCircleDiscussionid");
            return (Criteria) this;
        }

        public Criteria andZbCircleDiscussionidLessThan(Integer value) {
            addCriterion("zb_circle_discussionId <", value, "zbCircleDiscussionid");
            return (Criteria) this;
        }

        public Criteria andZbCircleDiscussionidLessThanOrEqualTo(Integer value) {
            addCriterion("zb_circle_discussionId <=", value, "zbCircleDiscussionid");
            return (Criteria) this;
        }

        public Criteria andZbCircleDiscussionidIn(List<Integer> values) {
            addCriterion("zb_circle_discussionId in", values, "zbCircleDiscussionid");
            return (Criteria) this;
        }

        public Criteria andZbCircleDiscussionidNotIn(List<Integer> values) {
            addCriterion("zb_circle_discussionId not in", values, "zbCircleDiscussionid");
            return (Criteria) this;
        }

        public Criteria andZbCircleDiscussionidBetween(Integer value1, Integer value2) {
            addCriterion("zb_circle_discussionId between", value1, value2, "zbCircleDiscussionid");
            return (Criteria) this;
        }

        public Criteria andZbCircleDiscussionidNotBetween(Integer value1, Integer value2) {
            addCriterion("zb_circle_discussionId not between", value1, value2, "zbCircleDiscussionid");
            return (Criteria) this;
        }

        public Criteria andZbCircleAuthorityIsNull() {
            addCriterion("zb_circle_authority is null");
            return (Criteria) this;
        }

        public Criteria andZbCircleAuthorityIsNotNull() {
            addCriterion("zb_circle_authority is not null");
            return (Criteria) this;
        }

        public Criteria andZbCircleAuthorityEqualTo(Integer value) {
            addCriterion("zb_circle_authority =", value, "zbCircleAuthority");
            return (Criteria) this;
        }

        public Criteria andZbCircleAuthorityNotEqualTo(Integer value) {
            addCriterion("zb_circle_authority <>", value, "zbCircleAuthority");
            return (Criteria) this;
        }

        public Criteria andZbCircleAuthorityGreaterThan(Integer value) {
            addCriterion("zb_circle_authority >", value, "zbCircleAuthority");
            return (Criteria) this;
        }

        public Criteria andZbCircleAuthorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("zb_circle_authority >=", value, "zbCircleAuthority");
            return (Criteria) this;
        }

        public Criteria andZbCircleAuthorityLessThan(Integer value) {
            addCriterion("zb_circle_authority <", value, "zbCircleAuthority");
            return (Criteria) this;
        }

        public Criteria andZbCircleAuthorityLessThanOrEqualTo(Integer value) {
            addCriterion("zb_circle_authority <=", value, "zbCircleAuthority");
            return (Criteria) this;
        }

        public Criteria andZbCircleAuthorityIn(List<Integer> values) {
            addCriterion("zb_circle_authority in", values, "zbCircleAuthority");
            return (Criteria) this;
        }

        public Criteria andZbCircleAuthorityNotIn(List<Integer> values) {
            addCriterion("zb_circle_authority not in", values, "zbCircleAuthority");
            return (Criteria) this;
        }

        public Criteria andZbCircleAuthorityBetween(Integer value1, Integer value2) {
            addCriterion("zb_circle_authority between", value1, value2, "zbCircleAuthority");
            return (Criteria) this;
        }

        public Criteria andZbCircleAuthorityNotBetween(Integer value1, Integer value2) {
            addCriterion("zb_circle_authority not between", value1, value2, "zbCircleAuthority");
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