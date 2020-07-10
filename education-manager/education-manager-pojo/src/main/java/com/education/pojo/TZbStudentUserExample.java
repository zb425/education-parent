package com.education.pojo;

import java.util.ArrayList;
import java.util.List;

public class TZbStudentUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TZbStudentUserExample() {
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

        public Criteria andZbStudentIdIsNull() {
            addCriterion("zb_student_id is null");
            return (Criteria) this;
        }

        public Criteria andZbStudentIdIsNotNull() {
            addCriterion("zb_student_id is not null");
            return (Criteria) this;
        }

        public Criteria andZbStudentIdEqualTo(Integer value) {
            addCriterion("zb_student_id =", value, "zbStudentId");
            return (Criteria) this;
        }

        public Criteria andZbStudentIdNotEqualTo(Integer value) {
            addCriterion("zb_student_id <>", value, "zbStudentId");
            return (Criteria) this;
        }

        public Criteria andZbStudentIdGreaterThan(Integer value) {
            addCriterion("zb_student_id >", value, "zbStudentId");
            return (Criteria) this;
        }

        public Criteria andZbStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("zb_student_id >=", value, "zbStudentId");
            return (Criteria) this;
        }

        public Criteria andZbStudentIdLessThan(Integer value) {
            addCriterion("zb_student_id <", value, "zbStudentId");
            return (Criteria) this;
        }

        public Criteria andZbStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("zb_student_id <=", value, "zbStudentId");
            return (Criteria) this;
        }

        public Criteria andZbStudentIdIn(List<Integer> values) {
            addCriterion("zb_student_id in", values, "zbStudentId");
            return (Criteria) this;
        }

        public Criteria andZbStudentIdNotIn(List<Integer> values) {
            addCriterion("zb_student_id not in", values, "zbStudentId");
            return (Criteria) this;
        }

        public Criteria andZbStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("zb_student_id between", value1, value2, "zbStudentId");
            return (Criteria) this;
        }

        public Criteria andZbStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("zb_student_id not between", value1, value2, "zbStudentId");
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

        public Criteria andZbStudentEmailIsNull() {
            addCriterion("zb_student_email is null");
            return (Criteria) this;
        }

        public Criteria andZbStudentEmailIsNotNull() {
            addCriterion("zb_student_email is not null");
            return (Criteria) this;
        }

        public Criteria andZbStudentEmailEqualTo(String value) {
            addCriterion("zb_student_email =", value, "zbStudentEmail");
            return (Criteria) this;
        }

        public Criteria andZbStudentEmailNotEqualTo(String value) {
            addCriterion("zb_student_email <>", value, "zbStudentEmail");
            return (Criteria) this;
        }

        public Criteria andZbStudentEmailGreaterThan(String value) {
            addCriterion("zb_student_email >", value, "zbStudentEmail");
            return (Criteria) this;
        }

        public Criteria andZbStudentEmailGreaterThanOrEqualTo(String value) {
            addCriterion("zb_student_email >=", value, "zbStudentEmail");
            return (Criteria) this;
        }

        public Criteria andZbStudentEmailLessThan(String value) {
            addCriterion("zb_student_email <", value, "zbStudentEmail");
            return (Criteria) this;
        }

        public Criteria andZbStudentEmailLessThanOrEqualTo(String value) {
            addCriterion("zb_student_email <=", value, "zbStudentEmail");
            return (Criteria) this;
        }

        public Criteria andZbStudentEmailLike(String value) {
            addCriterion("zb_student_email like", value, "zbStudentEmail");
            return (Criteria) this;
        }

        public Criteria andZbStudentEmailNotLike(String value) {
            addCriterion("zb_student_email not like", value, "zbStudentEmail");
            return (Criteria) this;
        }

        public Criteria andZbStudentEmailIn(List<String> values) {
            addCriterion("zb_student_email in", values, "zbStudentEmail");
            return (Criteria) this;
        }

        public Criteria andZbStudentEmailNotIn(List<String> values) {
            addCriterion("zb_student_email not in", values, "zbStudentEmail");
            return (Criteria) this;
        }

        public Criteria andZbStudentEmailBetween(String value1, String value2) {
            addCriterion("zb_student_email between", value1, value2, "zbStudentEmail");
            return (Criteria) this;
        }

        public Criteria andZbStudentEmailNotBetween(String value1, String value2) {
            addCriterion("zb_student_email not between", value1, value2, "zbStudentEmail");
            return (Criteria) this;
        }

        public Criteria andZbStudentPhoneIsNull() {
            addCriterion("zb_student_phone is null");
            return (Criteria) this;
        }

        public Criteria andZbStudentPhoneIsNotNull() {
            addCriterion("zb_student_phone is not null");
            return (Criteria) this;
        }

        public Criteria andZbStudentPhoneEqualTo(String value) {
            addCriterion("zb_student_phone =", value, "zbStudentPhone");
            return (Criteria) this;
        }

        public Criteria andZbStudentPhoneNotEqualTo(String value) {
            addCriterion("zb_student_phone <>", value, "zbStudentPhone");
            return (Criteria) this;
        }

        public Criteria andZbStudentPhoneGreaterThan(String value) {
            addCriterion("zb_student_phone >", value, "zbStudentPhone");
            return (Criteria) this;
        }

        public Criteria andZbStudentPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("zb_student_phone >=", value, "zbStudentPhone");
            return (Criteria) this;
        }

        public Criteria andZbStudentPhoneLessThan(String value) {
            addCriterion("zb_student_phone <", value, "zbStudentPhone");
            return (Criteria) this;
        }

        public Criteria andZbStudentPhoneLessThanOrEqualTo(String value) {
            addCriterion("zb_student_phone <=", value, "zbStudentPhone");
            return (Criteria) this;
        }

        public Criteria andZbStudentPhoneLike(String value) {
            addCriterion("zb_student_phone like", value, "zbStudentPhone");
            return (Criteria) this;
        }

        public Criteria andZbStudentPhoneNotLike(String value) {
            addCriterion("zb_student_phone not like", value, "zbStudentPhone");
            return (Criteria) this;
        }

        public Criteria andZbStudentPhoneIn(List<String> values) {
            addCriterion("zb_student_phone in", values, "zbStudentPhone");
            return (Criteria) this;
        }

        public Criteria andZbStudentPhoneNotIn(List<String> values) {
            addCriterion("zb_student_phone not in", values, "zbStudentPhone");
            return (Criteria) this;
        }

        public Criteria andZbStudentPhoneBetween(String value1, String value2) {
            addCriterion("zb_student_phone between", value1, value2, "zbStudentPhone");
            return (Criteria) this;
        }

        public Criteria andZbStudentPhoneNotBetween(String value1, String value2) {
            addCriterion("zb_student_phone not between", value1, value2, "zbStudentPhone");
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