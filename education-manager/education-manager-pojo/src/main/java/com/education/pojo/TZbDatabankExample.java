package com.education.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TZbDatabankExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TZbDatabankExample() {
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

        public Criteria andZbDatabankNameIsNull() {
            addCriterion("zb_databank_name is null");
            return (Criteria) this;
        }

        public Criteria andZbDatabankNameIsNotNull() {
            addCriterion("zb_databank_name is not null");
            return (Criteria) this;
        }

        public Criteria andZbDatabankNameEqualTo(String value) {
            addCriterion("zb_databank_name =", value, "zbDatabankName");
            return (Criteria) this;
        }

        public Criteria andZbDatabankNameNotEqualTo(String value) {
            addCriterion("zb_databank_name <>", value, "zbDatabankName");
            return (Criteria) this;
        }

        public Criteria andZbDatabankNameGreaterThan(String value) {
            addCriterion("zb_databank_name >", value, "zbDatabankName");
            return (Criteria) this;
        }

        public Criteria andZbDatabankNameGreaterThanOrEqualTo(String value) {
            addCriterion("zb_databank_name >=", value, "zbDatabankName");
            return (Criteria) this;
        }

        public Criteria andZbDatabankNameLessThan(String value) {
            addCriterion("zb_databank_name <", value, "zbDatabankName");
            return (Criteria) this;
        }

        public Criteria andZbDatabankNameLessThanOrEqualTo(String value) {
            addCriterion("zb_databank_name <=", value, "zbDatabankName");
            return (Criteria) this;
        }

        public Criteria andZbDatabankNameLike(String value) {
            addCriterion("zb_databank_name like", value, "zbDatabankName");
            return (Criteria) this;
        }

        public Criteria andZbDatabankNameNotLike(String value) {
            addCriterion("zb_databank_name not like", value, "zbDatabankName");
            return (Criteria) this;
        }

        public Criteria andZbDatabankNameIn(List<String> values) {
            addCriterion("zb_databank_name in", values, "zbDatabankName");
            return (Criteria) this;
        }

        public Criteria andZbDatabankNameNotIn(List<String> values) {
            addCriterion("zb_databank_name not in", values, "zbDatabankName");
            return (Criteria) this;
        }

        public Criteria andZbDatabankNameBetween(String value1, String value2) {
            addCriterion("zb_databank_name between", value1, value2, "zbDatabankName");
            return (Criteria) this;
        }

        public Criteria andZbDatabankNameNotBetween(String value1, String value2) {
            addCriterion("zb_databank_name not between", value1, value2, "zbDatabankName");
            return (Criteria) this;
        }

        public Criteria andZbDatabankUsernameIsNull() {
            addCriterion("zb_databank_username is null");
            return (Criteria) this;
        }

        public Criteria andZbDatabankUsernameIsNotNull() {
            addCriterion("zb_databank_username is not null");
            return (Criteria) this;
        }

        public Criteria andZbDatabankUsernameEqualTo(String value) {
            addCriterion("zb_databank_username =", value, "zbDatabankUsername");
            return (Criteria) this;
        }

        public Criteria andZbDatabankUsernameNotEqualTo(String value) {
            addCriterion("zb_databank_username <>", value, "zbDatabankUsername");
            return (Criteria) this;
        }

        public Criteria andZbDatabankUsernameGreaterThan(String value) {
            addCriterion("zb_databank_username >", value, "zbDatabankUsername");
            return (Criteria) this;
        }

        public Criteria andZbDatabankUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("zb_databank_username >=", value, "zbDatabankUsername");
            return (Criteria) this;
        }

        public Criteria andZbDatabankUsernameLessThan(String value) {
            addCriterion("zb_databank_username <", value, "zbDatabankUsername");
            return (Criteria) this;
        }

        public Criteria andZbDatabankUsernameLessThanOrEqualTo(String value) {
            addCriterion("zb_databank_username <=", value, "zbDatabankUsername");
            return (Criteria) this;
        }

        public Criteria andZbDatabankUsernameLike(String value) {
            addCriterion("zb_databank_username like", value, "zbDatabankUsername");
            return (Criteria) this;
        }

        public Criteria andZbDatabankUsernameNotLike(String value) {
            addCriterion("zb_databank_username not like", value, "zbDatabankUsername");
            return (Criteria) this;
        }

        public Criteria andZbDatabankUsernameIn(List<String> values) {
            addCriterion("zb_databank_username in", values, "zbDatabankUsername");
            return (Criteria) this;
        }

        public Criteria andZbDatabankUsernameNotIn(List<String> values) {
            addCriterion("zb_databank_username not in", values, "zbDatabankUsername");
            return (Criteria) this;
        }

        public Criteria andZbDatabankUsernameBetween(String value1, String value2) {
            addCriterion("zb_databank_username between", value1, value2, "zbDatabankUsername");
            return (Criteria) this;
        }

        public Criteria andZbDatabankUsernameNotBetween(String value1, String value2) {
            addCriterion("zb_databank_username not between", value1, value2, "zbDatabankUsername");
            return (Criteria) this;
        }

        public Criteria andZbDatabankUrlIsNull() {
            addCriterion("zb_databank_url is null");
            return (Criteria) this;
        }

        public Criteria andZbDatabankUrlIsNotNull() {
            addCriterion("zb_databank_url is not null");
            return (Criteria) this;
        }

        public Criteria andZbDatabankUrlEqualTo(String value) {
            addCriterion("zb_databank_url =", value, "zbDatabankUrl");
            return (Criteria) this;
        }

        public Criteria andZbDatabankUrlNotEqualTo(String value) {
            addCriterion("zb_databank_url <>", value, "zbDatabankUrl");
            return (Criteria) this;
        }

        public Criteria andZbDatabankUrlGreaterThan(String value) {
            addCriterion("zb_databank_url >", value, "zbDatabankUrl");
            return (Criteria) this;
        }

        public Criteria andZbDatabankUrlGreaterThanOrEqualTo(String value) {
            addCriterion("zb_databank_url >=", value, "zbDatabankUrl");
            return (Criteria) this;
        }

        public Criteria andZbDatabankUrlLessThan(String value) {
            addCriterion("zb_databank_url <", value, "zbDatabankUrl");
            return (Criteria) this;
        }

        public Criteria andZbDatabankUrlLessThanOrEqualTo(String value) {
            addCriterion("zb_databank_url <=", value, "zbDatabankUrl");
            return (Criteria) this;
        }

        public Criteria andZbDatabankUrlLike(String value) {
            addCriterion("zb_databank_url like", value, "zbDatabankUrl");
            return (Criteria) this;
        }

        public Criteria andZbDatabankUrlNotLike(String value) {
            addCriterion("zb_databank_url not like", value, "zbDatabankUrl");
            return (Criteria) this;
        }

        public Criteria andZbDatabankUrlIn(List<String> values) {
            addCriterion("zb_databank_url in", values, "zbDatabankUrl");
            return (Criteria) this;
        }

        public Criteria andZbDatabankUrlNotIn(List<String> values) {
            addCriterion("zb_databank_url not in", values, "zbDatabankUrl");
            return (Criteria) this;
        }

        public Criteria andZbDatabankUrlBetween(String value1, String value2) {
            addCriterion("zb_databank_url between", value1, value2, "zbDatabankUrl");
            return (Criteria) this;
        }

        public Criteria andZbDatabankUrlNotBetween(String value1, String value2) {
            addCriterion("zb_databank_url not between", value1, value2, "zbDatabankUrl");
            return (Criteria) this;
        }

        public Criteria andZbDatabankCountIsNull() {
            addCriterion("zb_databank_count is null");
            return (Criteria) this;
        }

        public Criteria andZbDatabankCountIsNotNull() {
            addCriterion("zb_databank_count is not null");
            return (Criteria) this;
        }

        public Criteria andZbDatabankCountEqualTo(Integer value) {
            addCriterion("zb_databank_count =", value, "zbDatabankCount");
            return (Criteria) this;
        }

        public Criteria andZbDatabankCountNotEqualTo(Integer value) {
            addCriterion("zb_databank_count <>", value, "zbDatabankCount");
            return (Criteria) this;
        }

        public Criteria andZbDatabankCountGreaterThan(Integer value) {
            addCriterion("zb_databank_count >", value, "zbDatabankCount");
            return (Criteria) this;
        }

        public Criteria andZbDatabankCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("zb_databank_count >=", value, "zbDatabankCount");
            return (Criteria) this;
        }

        public Criteria andZbDatabankCountLessThan(Integer value) {
            addCriterion("zb_databank_count <", value, "zbDatabankCount");
            return (Criteria) this;
        }

        public Criteria andZbDatabankCountLessThanOrEqualTo(Integer value) {
            addCriterion("zb_databank_count <=", value, "zbDatabankCount");
            return (Criteria) this;
        }

        public Criteria andZbDatabankCountIn(List<Integer> values) {
            addCriterion("zb_databank_count in", values, "zbDatabankCount");
            return (Criteria) this;
        }

        public Criteria andZbDatabankCountNotIn(List<Integer> values) {
            addCriterion("zb_databank_count not in", values, "zbDatabankCount");
            return (Criteria) this;
        }

        public Criteria andZbDatabankCountBetween(Integer value1, Integer value2) {
            addCriterion("zb_databank_count between", value1, value2, "zbDatabankCount");
            return (Criteria) this;
        }

        public Criteria andZbDatabankCountNotBetween(Integer value1, Integer value2) {
            addCriterion("zb_databank_count not between", value1, value2, "zbDatabankCount");
            return (Criteria) this;
        }

        public Criteria andZbDatabankAuthorityIsNull() {
            addCriterion("zb_databank_authority is null");
            return (Criteria) this;
        }

        public Criteria andZbDatabankAuthorityIsNotNull() {
            addCriterion("zb_databank_authority is not null");
            return (Criteria) this;
        }

        public Criteria andZbDatabankAuthorityEqualTo(Integer value) {
            addCriterion("zb_databank_authority =", value, "zbDatabankAuthority");
            return (Criteria) this;
        }

        public Criteria andZbDatabankAuthorityNotEqualTo(Integer value) {
            addCriterion("zb_databank_authority <>", value, "zbDatabankAuthority");
            return (Criteria) this;
        }

        public Criteria andZbDatabankAuthorityGreaterThan(Integer value) {
            addCriterion("zb_databank_authority >", value, "zbDatabankAuthority");
            return (Criteria) this;
        }

        public Criteria andZbDatabankAuthorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("zb_databank_authority >=", value, "zbDatabankAuthority");
            return (Criteria) this;
        }

        public Criteria andZbDatabankAuthorityLessThan(Integer value) {
            addCriterion("zb_databank_authority <", value, "zbDatabankAuthority");
            return (Criteria) this;
        }

        public Criteria andZbDatabankAuthorityLessThanOrEqualTo(Integer value) {
            addCriterion("zb_databank_authority <=", value, "zbDatabankAuthority");
            return (Criteria) this;
        }

        public Criteria andZbDatabankAuthorityIn(List<Integer> values) {
            addCriterion("zb_databank_authority in", values, "zbDatabankAuthority");
            return (Criteria) this;
        }

        public Criteria andZbDatabankAuthorityNotIn(List<Integer> values) {
            addCriterion("zb_databank_authority not in", values, "zbDatabankAuthority");
            return (Criteria) this;
        }

        public Criteria andZbDatabankAuthorityBetween(Integer value1, Integer value2) {
            addCriterion("zb_databank_authority between", value1, value2, "zbDatabankAuthority");
            return (Criteria) this;
        }

        public Criteria andZbDatabankAuthorityNotBetween(Integer value1, Integer value2) {
            addCriterion("zb_databank_authority not between", value1, value2, "zbDatabankAuthority");
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