package com.education.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TZbHomeroundExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TZbHomeroundExample() {
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

        public Criteria andZbUrlIsNull() {
            addCriterion("zb_url is null");
            return (Criteria) this;
        }

        public Criteria andZbUrlIsNotNull() {
            addCriterion("zb_url is not null");
            return (Criteria) this;
        }

        public Criteria andZbUrlEqualTo(String value) {
            addCriterion("zb_url =", value, "zbUrl");
            return (Criteria) this;
        }

        public Criteria andZbUrlNotEqualTo(String value) {
            addCriterion("zb_url <>", value, "zbUrl");
            return (Criteria) this;
        }

        public Criteria andZbUrlGreaterThan(String value) {
            addCriterion("zb_url >", value, "zbUrl");
            return (Criteria) this;
        }

        public Criteria andZbUrlGreaterThanOrEqualTo(String value) {
            addCriterion("zb_url >=", value, "zbUrl");
            return (Criteria) this;
        }

        public Criteria andZbUrlLessThan(String value) {
            addCriterion("zb_url <", value, "zbUrl");
            return (Criteria) this;
        }

        public Criteria andZbUrlLessThanOrEqualTo(String value) {
            addCriterion("zb_url <=", value, "zbUrl");
            return (Criteria) this;
        }

        public Criteria andZbUrlLike(String value) {
            addCriterion("zb_url like", value, "zbUrl");
            return (Criteria) this;
        }

        public Criteria andZbUrlNotLike(String value) {
            addCriterion("zb_url not like", value, "zbUrl");
            return (Criteria) this;
        }

        public Criteria andZbUrlIn(List<String> values) {
            addCriterion("zb_url in", values, "zbUrl");
            return (Criteria) this;
        }

        public Criteria andZbUrlNotIn(List<String> values) {
            addCriterion("zb_url not in", values, "zbUrl");
            return (Criteria) this;
        }

        public Criteria andZbUrlBetween(String value1, String value2) {
            addCriterion("zb_url between", value1, value2, "zbUrl");
            return (Criteria) this;
        }

        public Criteria andZbUrlNotBetween(String value1, String value2) {
            addCriterion("zb_url not between", value1, value2, "zbUrl");
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

        public Criteria andZbEnableIsNull() {
            addCriterion("zb_enable is null");
            return (Criteria) this;
        }

        public Criteria andZbEnableIsNotNull() {
            addCriterion("zb_enable is not null");
            return (Criteria) this;
        }

        public Criteria andZbEnableEqualTo(Boolean value) {
            addCriterion("zb_enable =", value, "zbEnable");
            return (Criteria) this;
        }

        public Criteria andZbEnableNotEqualTo(Boolean value) {
            addCriterion("zb_enable <>", value, "zbEnable");
            return (Criteria) this;
        }

        public Criteria andZbEnableGreaterThan(Boolean value) {
            addCriterion("zb_enable >", value, "zbEnable");
            return (Criteria) this;
        }

        public Criteria andZbEnableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("zb_enable >=", value, "zbEnable");
            return (Criteria) this;
        }

        public Criteria andZbEnableLessThan(Boolean value) {
            addCriterion("zb_enable <", value, "zbEnable");
            return (Criteria) this;
        }

        public Criteria andZbEnableLessThanOrEqualTo(Boolean value) {
            addCriterion("zb_enable <=", value, "zbEnable");
            return (Criteria) this;
        }

        public Criteria andZbEnableIn(List<Boolean> values) {
            addCriterion("zb_enable in", values, "zbEnable");
            return (Criteria) this;
        }

        public Criteria andZbEnableNotIn(List<Boolean> values) {
            addCriterion("zb_enable not in", values, "zbEnable");
            return (Criteria) this;
        }

        public Criteria andZbEnableBetween(Boolean value1, Boolean value2) {
            addCriterion("zb_enable between", value1, value2, "zbEnable");
            return (Criteria) this;
        }

        public Criteria andZbEnableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("zb_enable not between", value1, value2, "zbEnable");
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