package com.education.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TZbDiscussionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TZbDiscussionExample() {
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

        public Criteria andZbImageIsNull() {
            addCriterion("zb_image is null");
            return (Criteria) this;
        }

        public Criteria andZbImageIsNotNull() {
            addCriterion("zb_image is not null");
            return (Criteria) this;
        }

        public Criteria andZbImageEqualTo(String value) {
            addCriterion("zb_image =", value, "zbImage");
            return (Criteria) this;
        }

        public Criteria andZbImageNotEqualTo(String value) {
            addCriterion("zb_image <>", value, "zbImage");
            return (Criteria) this;
        }

        public Criteria andZbImageGreaterThan(String value) {
            addCriterion("zb_image >", value, "zbImage");
            return (Criteria) this;
        }

        public Criteria andZbImageGreaterThanOrEqualTo(String value) {
            addCriterion("zb_image >=", value, "zbImage");
            return (Criteria) this;
        }

        public Criteria andZbImageLessThan(String value) {
            addCriterion("zb_image <", value, "zbImage");
            return (Criteria) this;
        }

        public Criteria andZbImageLessThanOrEqualTo(String value) {
            addCriterion("zb_image <=", value, "zbImage");
            return (Criteria) this;
        }

        public Criteria andZbImageLike(String value) {
            addCriterion("zb_image like", value, "zbImage");
            return (Criteria) this;
        }

        public Criteria andZbImageNotLike(String value) {
            addCriterion("zb_image not like", value, "zbImage");
            return (Criteria) this;
        }

        public Criteria andZbImageIn(List<String> values) {
            addCriterion("zb_image in", values, "zbImage");
            return (Criteria) this;
        }

        public Criteria andZbImageNotIn(List<String> values) {
            addCriterion("zb_image not in", values, "zbImage");
            return (Criteria) this;
        }

        public Criteria andZbImageBetween(String value1, String value2) {
            addCriterion("zb_image between", value1, value2, "zbImage");
            return (Criteria) this;
        }

        public Criteria andZbImageNotBetween(String value1, String value2) {
            addCriterion("zb_image not between", value1, value2, "zbImage");
            return (Criteria) this;
        }

        public Criteria andZbCircleIsNull() {
            addCriterion("zb_circle is null");
            return (Criteria) this;
        }

        public Criteria andZbCircleIsNotNull() {
            addCriterion("zb_circle is not null");
            return (Criteria) this;
        }

        public Criteria andZbCircleEqualTo(Integer value) {
            addCriterion("zb_circle =", value, "zbCircle");
            return (Criteria) this;
        }

        public Criteria andZbCircleNotEqualTo(Integer value) {
            addCriterion("zb_circle <>", value, "zbCircle");
            return (Criteria) this;
        }

        public Criteria andZbCircleGreaterThan(Integer value) {
            addCriterion("zb_circle >", value, "zbCircle");
            return (Criteria) this;
        }

        public Criteria andZbCircleGreaterThanOrEqualTo(Integer value) {
            addCriterion("zb_circle >=", value, "zbCircle");
            return (Criteria) this;
        }

        public Criteria andZbCircleLessThan(Integer value) {
            addCriterion("zb_circle <", value, "zbCircle");
            return (Criteria) this;
        }

        public Criteria andZbCircleLessThanOrEqualTo(Integer value) {
            addCriterion("zb_circle <=", value, "zbCircle");
            return (Criteria) this;
        }

        public Criteria andZbCircleIn(List<Integer> values) {
            addCriterion("zb_circle in", values, "zbCircle");
            return (Criteria) this;
        }

        public Criteria andZbCircleNotIn(List<Integer> values) {
            addCriterion("zb_circle not in", values, "zbCircle");
            return (Criteria) this;
        }

        public Criteria andZbCircleBetween(Integer value1, Integer value2) {
            addCriterion("zb_circle between", value1, value2, "zbCircle");
            return (Criteria) this;
        }

        public Criteria andZbCircleNotBetween(Integer value1, Integer value2) {
            addCriterion("zb_circle not between", value1, value2, "zbCircle");
            return (Criteria) this;
        }

        public Criteria andZbReadIsNull() {
            addCriterion("zb_read is null");
            return (Criteria) this;
        }

        public Criteria andZbReadIsNotNull() {
            addCriterion("zb_read is not null");
            return (Criteria) this;
        }

        public Criteria andZbReadEqualTo(Integer value) {
            addCriterion("zb_read =", value, "zbRead");
            return (Criteria) this;
        }

        public Criteria andZbReadNotEqualTo(Integer value) {
            addCriterion("zb_read <>", value, "zbRead");
            return (Criteria) this;
        }

        public Criteria andZbReadGreaterThan(Integer value) {
            addCriterion("zb_read >", value, "zbRead");
            return (Criteria) this;
        }

        public Criteria andZbReadGreaterThanOrEqualTo(Integer value) {
            addCriterion("zb_read >=", value, "zbRead");
            return (Criteria) this;
        }

        public Criteria andZbReadLessThan(Integer value) {
            addCriterion("zb_read <", value, "zbRead");
            return (Criteria) this;
        }

        public Criteria andZbReadLessThanOrEqualTo(Integer value) {
            addCriterion("zb_read <=", value, "zbRead");
            return (Criteria) this;
        }

        public Criteria andZbReadIn(List<Integer> values) {
            addCriterion("zb_read in", values, "zbRead");
            return (Criteria) this;
        }

        public Criteria andZbReadNotIn(List<Integer> values) {
            addCriterion("zb_read not in", values, "zbRead");
            return (Criteria) this;
        }

        public Criteria andZbReadBetween(Integer value1, Integer value2) {
            addCriterion("zb_read between", value1, value2, "zbRead");
            return (Criteria) this;
        }

        public Criteria andZbReadNotBetween(Integer value1, Integer value2) {
            addCriterion("zb_read not between", value1, value2, "zbRead");
            return (Criteria) this;
        }

        public Criteria andZbAuthorityIsNull() {
            addCriterion("zb_authority is null");
            return (Criteria) this;
        }

        public Criteria andZbAuthorityIsNotNull() {
            addCriterion("zb_authority is not null");
            return (Criteria) this;
        }

        public Criteria andZbAuthorityEqualTo(Integer value) {
            addCriterion("zb_authority =", value, "zbAuthority");
            return (Criteria) this;
        }

        public Criteria andZbAuthorityNotEqualTo(Integer value) {
            addCriterion("zb_authority <>", value, "zbAuthority");
            return (Criteria) this;
        }

        public Criteria andZbAuthorityGreaterThan(Integer value) {
            addCriterion("zb_authority >", value, "zbAuthority");
            return (Criteria) this;
        }

        public Criteria andZbAuthorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("zb_authority >=", value, "zbAuthority");
            return (Criteria) this;
        }

        public Criteria andZbAuthorityLessThan(Integer value) {
            addCriterion("zb_authority <", value, "zbAuthority");
            return (Criteria) this;
        }

        public Criteria andZbAuthorityLessThanOrEqualTo(Integer value) {
            addCriterion("zb_authority <=", value, "zbAuthority");
            return (Criteria) this;
        }

        public Criteria andZbAuthorityIn(List<Integer> values) {
            addCriterion("zb_authority in", values, "zbAuthority");
            return (Criteria) this;
        }

        public Criteria andZbAuthorityNotIn(List<Integer> values) {
            addCriterion("zb_authority not in", values, "zbAuthority");
            return (Criteria) this;
        }

        public Criteria andZbAuthorityBetween(Integer value1, Integer value2) {
            addCriterion("zb_authority between", value1, value2, "zbAuthority");
            return (Criteria) this;
        }

        public Criteria andZbAuthorityNotBetween(Integer value1, Integer value2) {
            addCriterion("zb_authority not between", value1, value2, "zbAuthority");
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