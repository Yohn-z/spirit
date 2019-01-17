package com.spirit.pojo;

import java.util.ArrayList;
import java.util.List;

public class RManufacturersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RManufacturersExample() {
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

        public Criteria andMIdIsNull() {
            addCriterion("m_id is null");
            return (Criteria) this;
        }

        public Criteria andMIdIsNotNull() {
            addCriterion("m_id is not null");
            return (Criteria) this;
        }

        public Criteria andMIdEqualTo(Long value) {
            addCriterion("m_id =", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotEqualTo(Long value) {
            addCriterion("m_id <>", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThan(Long value) {
            addCriterion("m_id >", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThanOrEqualTo(Long value) {
            addCriterion("m_id >=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThan(Long value) {
            addCriterion("m_id <", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThanOrEqualTo(Long value) {
            addCriterion("m_id <=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdIn(List<Long> values) {
            addCriterion("m_id in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotIn(List<Long> values) {
            addCriterion("m_id not in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdBetween(Long value1, Long value2) {
            addCriterion("m_id between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotBetween(Long value1, Long value2) {
            addCriterion("m_id not between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMNameIsNull() {
            addCriterion("m_name is null");
            return (Criteria) this;
        }

        public Criteria andMNameIsNotNull() {
            addCriterion("m_name is not null");
            return (Criteria) this;
        }

        public Criteria andMNameEqualTo(String value) {
            addCriterion("m_name =", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotEqualTo(String value) {
            addCriterion("m_name <>", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameGreaterThan(String value) {
            addCriterion("m_name >", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameGreaterThanOrEqualTo(String value) {
            addCriterion("m_name >=", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLessThan(String value) {
            addCriterion("m_name <", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLessThanOrEqualTo(String value) {
            addCriterion("m_name <=", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLike(String value) {
            addCriterion("m_name like", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotLike(String value) {
            addCriterion("m_name not like", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameIn(List<String> values) {
            addCriterion("m_name in", values, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotIn(List<String> values) {
            addCriterion("m_name not in", values, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameBetween(String value1, String value2) {
            addCriterion("m_name between", value1, value2, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotBetween(String value1, String value2) {
            addCriterion("m_name not between", value1, value2, "mName");
            return (Criteria) this;
        }

        public Criteria andMAddressIsNull() {
            addCriterion("m_address is null");
            return (Criteria) this;
        }

        public Criteria andMAddressIsNotNull() {
            addCriterion("m_address is not null");
            return (Criteria) this;
        }

        public Criteria andMAddressEqualTo(String value) {
            addCriterion("m_address =", value, "mAddress");
            return (Criteria) this;
        }

        public Criteria andMAddressNotEqualTo(String value) {
            addCriterion("m_address <>", value, "mAddress");
            return (Criteria) this;
        }

        public Criteria andMAddressGreaterThan(String value) {
            addCriterion("m_address >", value, "mAddress");
            return (Criteria) this;
        }

        public Criteria andMAddressGreaterThanOrEqualTo(String value) {
            addCriterion("m_address >=", value, "mAddress");
            return (Criteria) this;
        }

        public Criteria andMAddressLessThan(String value) {
            addCriterion("m_address <", value, "mAddress");
            return (Criteria) this;
        }

        public Criteria andMAddressLessThanOrEqualTo(String value) {
            addCriterion("m_address <=", value, "mAddress");
            return (Criteria) this;
        }

        public Criteria andMAddressLike(String value) {
            addCriterion("m_address like", value, "mAddress");
            return (Criteria) this;
        }

        public Criteria andMAddressNotLike(String value) {
            addCriterion("m_address not like", value, "mAddress");
            return (Criteria) this;
        }

        public Criteria andMAddressIn(List<String> values) {
            addCriterion("m_address in", values, "mAddress");
            return (Criteria) this;
        }

        public Criteria andMAddressNotIn(List<String> values) {
            addCriterion("m_address not in", values, "mAddress");
            return (Criteria) this;
        }

        public Criteria andMAddressBetween(String value1, String value2) {
            addCriterion("m_address between", value1, value2, "mAddress");
            return (Criteria) this;
        }

        public Criteria andMAddressNotBetween(String value1, String value2) {
            addCriterion("m_address not between", value1, value2, "mAddress");
            return (Criteria) this;
        }

        public Criteria andMTelIsNull() {
            addCriterion("m_tel is null");
            return (Criteria) this;
        }

        public Criteria andMTelIsNotNull() {
            addCriterion("m_tel is not null");
            return (Criteria) this;
        }

        public Criteria andMTelEqualTo(String value) {
            addCriterion("m_tel =", value, "mTel");
            return (Criteria) this;
        }

        public Criteria andMTelNotEqualTo(String value) {
            addCriterion("m_tel <>", value, "mTel");
            return (Criteria) this;
        }

        public Criteria andMTelGreaterThan(String value) {
            addCriterion("m_tel >", value, "mTel");
            return (Criteria) this;
        }

        public Criteria andMTelGreaterThanOrEqualTo(String value) {
            addCriterion("m_tel >=", value, "mTel");
            return (Criteria) this;
        }

        public Criteria andMTelLessThan(String value) {
            addCriterion("m_tel <", value, "mTel");
            return (Criteria) this;
        }

        public Criteria andMTelLessThanOrEqualTo(String value) {
            addCriterion("m_tel <=", value, "mTel");
            return (Criteria) this;
        }

        public Criteria andMTelLike(String value) {
            addCriterion("m_tel like", value, "mTel");
            return (Criteria) this;
        }

        public Criteria andMTelNotLike(String value) {
            addCriterion("m_tel not like", value, "mTel");
            return (Criteria) this;
        }

        public Criteria andMTelIn(List<String> values) {
            addCriterion("m_tel in", values, "mTel");
            return (Criteria) this;
        }

        public Criteria andMTelNotIn(List<String> values) {
            addCriterion("m_tel not in", values, "mTel");
            return (Criteria) this;
        }

        public Criteria andMTelBetween(String value1, String value2) {
            addCriterion("m_tel between", value1, value2, "mTel");
            return (Criteria) this;
        }

        public Criteria andMTelNotBetween(String value1, String value2) {
            addCriterion("m_tel not between", value1, value2, "mTel");
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