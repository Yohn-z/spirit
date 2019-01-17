package com.spirit.pojo;

import java.util.ArrayList;
import java.util.List;

public class RLiquorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RLiquorExample() {
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

        public Criteria andLIdIsNull() {
            addCriterion("l_id is null");
            return (Criteria) this;
        }

        public Criteria andLIdIsNotNull() {
            addCriterion("l_id is not null");
            return (Criteria) this;
        }

        public Criteria andLIdEqualTo(String value) {
            addCriterion("l_id =", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotEqualTo(String value) {
            addCriterion("l_id <>", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdGreaterThan(String value) {
            addCriterion("l_id >", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdGreaterThanOrEqualTo(String value) {
            addCriterion("l_id >=", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdLessThan(String value) {
            addCriterion("l_id <", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdLessThanOrEqualTo(String value) {
            addCriterion("l_id <=", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdLike(String value) {
            addCriterion("l_id like", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotLike(String value) {
            addCriterion("l_id not like", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdIn(List<String> values) {
            addCriterion("l_id in", values, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotIn(List<String> values) {
            addCriterion("l_id not in", values, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdBetween(String value1, String value2) {
            addCriterion("l_id between", value1, value2, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotBetween(String value1, String value2) {
            addCriterion("l_id not between", value1, value2, "lId");
            return (Criteria) this;
        }

        public Criteria andLNameIsNull() {
            addCriterion("l_name is null");
            return (Criteria) this;
        }

        public Criteria andLNameIsNotNull() {
            addCriterion("l_name is not null");
            return (Criteria) this;
        }

        public Criteria andLNameEqualTo(String value) {
            addCriterion("l_name =", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameNotEqualTo(String value) {
            addCriterion("l_name <>", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameGreaterThan(String value) {
            addCriterion("l_name >", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameGreaterThanOrEqualTo(String value) {
            addCriterion("l_name >=", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameLessThan(String value) {
            addCriterion("l_name <", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameLessThanOrEqualTo(String value) {
            addCriterion("l_name <=", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameLike(String value) {
            addCriterion("l_name like", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameNotLike(String value) {
            addCriterion("l_name not like", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameIn(List<String> values) {
            addCriterion("l_name in", values, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameNotIn(List<String> values) {
            addCriterion("l_name not in", values, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameBetween(String value1, String value2) {
            addCriterion("l_name between", value1, value2, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameNotBetween(String value1, String value2) {
            addCriterion("l_name not between", value1, value2, "lName");
            return (Criteria) this;
        }

        public Criteria andOIdIsNull() {
            addCriterion("o_id is null");
            return (Criteria) this;
        }

        public Criteria andOIdIsNotNull() {
            addCriterion("o_id is not null");
            return (Criteria) this;
        }

        public Criteria andOIdEqualTo(Long value) {
            addCriterion("o_id =", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotEqualTo(Long value) {
            addCriterion("o_id <>", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThan(Long value) {
            addCriterion("o_id >", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThanOrEqualTo(Long value) {
            addCriterion("o_id >=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThan(Long value) {
            addCriterion("o_id <", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThanOrEqualTo(Long value) {
            addCriterion("o_id <=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdIn(List<Long> values) {
            addCriterion("o_id in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotIn(List<Long> values) {
            addCriterion("o_id not in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdBetween(Long value1, Long value2) {
            addCriterion("o_id between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotBetween(Long value1, Long value2) {
            addCriterion("o_id not between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andLDegreesIsNull() {
            addCriterion("l_degrees is null");
            return (Criteria) this;
        }

        public Criteria andLDegreesIsNotNull() {
            addCriterion("l_degrees is not null");
            return (Criteria) this;
        }

        public Criteria andLDegreesEqualTo(Float value) {
            addCriterion("l_degrees =", value, "lDegrees");
            return (Criteria) this;
        }

        public Criteria andLDegreesNotEqualTo(Float value) {
            addCriterion("l_degrees <>", value, "lDegrees");
            return (Criteria) this;
        }

        public Criteria andLDegreesGreaterThan(Float value) {
            addCriterion("l_degrees >", value, "lDegrees");
            return (Criteria) this;
        }

        public Criteria andLDegreesGreaterThanOrEqualTo(Float value) {
            addCriterion("l_degrees >=", value, "lDegrees");
            return (Criteria) this;
        }

        public Criteria andLDegreesLessThan(Float value) {
            addCriterion("l_degrees <", value, "lDegrees");
            return (Criteria) this;
        }

        public Criteria andLDegreesLessThanOrEqualTo(Float value) {
            addCriterion("l_degrees <=", value, "lDegrees");
            return (Criteria) this;
        }

        public Criteria andLDegreesIn(List<Float> values) {
            addCriterion("l_degrees in", values, "lDegrees");
            return (Criteria) this;
        }

        public Criteria andLDegreesNotIn(List<Float> values) {
            addCriterion("l_degrees not in", values, "lDegrees");
            return (Criteria) this;
        }

        public Criteria andLDegreesBetween(Float value1, Float value2) {
            addCriterion("l_degrees between", value1, value2, "lDegrees");
            return (Criteria) this;
        }

        public Criteria andLDegreesNotBetween(Float value1, Float value2) {
            addCriterion("l_degrees not between", value1, value2, "lDegrees");
            return (Criteria) this;
        }

        public Criteria andLCapacityIsNull() {
            addCriterion("l_capacity is null");
            return (Criteria) this;
        }

        public Criteria andLCapacityIsNotNull() {
            addCriterion("l_capacity is not null");
            return (Criteria) this;
        }

        public Criteria andLCapacityEqualTo(Integer value) {
            addCriterion("l_capacity =", value, "lCapacity");
            return (Criteria) this;
        }

        public Criteria andLCapacityNotEqualTo(Integer value) {
            addCriterion("l_capacity <>", value, "lCapacity");
            return (Criteria) this;
        }

        public Criteria andLCapacityGreaterThan(Integer value) {
            addCriterion("l_capacity >", value, "lCapacity");
            return (Criteria) this;
        }

        public Criteria andLCapacityGreaterThanOrEqualTo(Integer value) {
            addCriterion("l_capacity >=", value, "lCapacity");
            return (Criteria) this;
        }

        public Criteria andLCapacityLessThan(Integer value) {
            addCriterion("l_capacity <", value, "lCapacity");
            return (Criteria) this;
        }

        public Criteria andLCapacityLessThanOrEqualTo(Integer value) {
            addCriterion("l_capacity <=", value, "lCapacity");
            return (Criteria) this;
        }

        public Criteria andLCapacityIn(List<Integer> values) {
            addCriterion("l_capacity in", values, "lCapacity");
            return (Criteria) this;
        }

        public Criteria andLCapacityNotIn(List<Integer> values) {
            addCriterion("l_capacity not in", values, "lCapacity");
            return (Criteria) this;
        }

        public Criteria andLCapacityBetween(Integer value1, Integer value2) {
            addCriterion("l_capacity between", value1, value2, "lCapacity");
            return (Criteria) this;
        }

        public Criteria andLCapacityNotBetween(Integer value1, Integer value2) {
            addCriterion("l_capacity not between", value1, value2, "lCapacity");
            return (Criteria) this;
        }

        public Criteria andLWeightIsNull() {
            addCriterion("l_weight is null");
            return (Criteria) this;
        }

        public Criteria andLWeightIsNotNull() {
            addCriterion("l_weight is not null");
            return (Criteria) this;
        }

        public Criteria andLWeightEqualTo(Integer value) {
            addCriterion("l_weight =", value, "lWeight");
            return (Criteria) this;
        }

        public Criteria andLWeightNotEqualTo(Integer value) {
            addCriterion("l_weight <>", value, "lWeight");
            return (Criteria) this;
        }

        public Criteria andLWeightGreaterThan(Integer value) {
            addCriterion("l_weight >", value, "lWeight");
            return (Criteria) this;
        }

        public Criteria andLWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("l_weight >=", value, "lWeight");
            return (Criteria) this;
        }

        public Criteria andLWeightLessThan(Integer value) {
            addCriterion("l_weight <", value, "lWeight");
            return (Criteria) this;
        }

        public Criteria andLWeightLessThanOrEqualTo(Integer value) {
            addCriterion("l_weight <=", value, "lWeight");
            return (Criteria) this;
        }

        public Criteria andLWeightIn(List<Integer> values) {
            addCriterion("l_weight in", values, "lWeight");
            return (Criteria) this;
        }

        public Criteria andLWeightNotIn(List<Integer> values) {
            addCriterion("l_weight not in", values, "lWeight");
            return (Criteria) this;
        }

        public Criteria andLWeightBetween(Integer value1, Integer value2) {
            addCriterion("l_weight between", value1, value2, "lWeight");
            return (Criteria) this;
        }

        public Criteria andLWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("l_weight not between", value1, value2, "lWeight");
            return (Criteria) this;
        }

        public Criteria andLNumIsNull() {
            addCriterion("l_num is null");
            return (Criteria) this;
        }

        public Criteria andLNumIsNotNull() {
            addCriterion("l_num is not null");
            return (Criteria) this;
        }

        public Criteria andLNumEqualTo(Integer value) {
            addCriterion("l_num =", value, "lNum");
            return (Criteria) this;
        }

        public Criteria andLNumNotEqualTo(Integer value) {
            addCriterion("l_num <>", value, "lNum");
            return (Criteria) this;
        }

        public Criteria andLNumGreaterThan(Integer value) {
            addCriterion("l_num >", value, "lNum");
            return (Criteria) this;
        }

        public Criteria andLNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("l_num >=", value, "lNum");
            return (Criteria) this;
        }

        public Criteria andLNumLessThan(Integer value) {
            addCriterion("l_num <", value, "lNum");
            return (Criteria) this;
        }

        public Criteria andLNumLessThanOrEqualTo(Integer value) {
            addCriterion("l_num <=", value, "lNum");
            return (Criteria) this;
        }

        public Criteria andLNumIn(List<Integer> values) {
            addCriterion("l_num in", values, "lNum");
            return (Criteria) this;
        }

        public Criteria andLNumNotIn(List<Integer> values) {
            addCriterion("l_num not in", values, "lNum");
            return (Criteria) this;
        }

        public Criteria andLNumBetween(Integer value1, Integer value2) {
            addCriterion("l_num between", value1, value2, "lNum");
            return (Criteria) this;
        }

        public Criteria andLNumNotBetween(Integer value1, Integer value2) {
            addCriterion("l_num not between", value1, value2, "lNum");
            return (Criteria) this;
        }

        public Criteria andLProducedtimeIsNull() {
            addCriterion("l_producedtime is null");
            return (Criteria) this;
        }

        public Criteria andLProducedtimeIsNotNull() {
            addCriterion("l_producedtime is not null");
            return (Criteria) this;
        }

        public Criteria andLProducedtimeEqualTo(String value) {
            addCriterion("l_producedtime =", value, "lProducedtime");
            return (Criteria) this;
        }

        public Criteria andLProducedtimeNotEqualTo(String value) {
            addCriterion("l_producedtime <>", value, "lProducedtime");
            return (Criteria) this;
        }

        public Criteria andLProducedtimeGreaterThan(String value) {
            addCriterion("l_producedtime >", value, "lProducedtime");
            return (Criteria) this;
        }

        public Criteria andLProducedtimeGreaterThanOrEqualTo(String value) {
            addCriterion("l_producedtime >=", value, "lProducedtime");
            return (Criteria) this;
        }

        public Criteria andLProducedtimeLessThan(String value) {
            addCriterion("l_producedtime <", value, "lProducedtime");
            return (Criteria) this;
        }

        public Criteria andLProducedtimeLessThanOrEqualTo(String value) {
            addCriterion("l_producedtime <=", value, "lProducedtime");
            return (Criteria) this;
        }

        public Criteria andLProducedtimeLike(String value) {
            addCriterion("l_producedtime like", value, "lProducedtime");
            return (Criteria) this;
        }

        public Criteria andLProducedtimeNotLike(String value) {
            addCriterion("l_producedtime not like", value, "lProducedtime");
            return (Criteria) this;
        }

        public Criteria andLProducedtimeIn(List<String> values) {
            addCriterion("l_producedtime in", values, "lProducedtime");
            return (Criteria) this;
        }

        public Criteria andLProducedtimeNotIn(List<String> values) {
            addCriterion("l_producedtime not in", values, "lProducedtime");
            return (Criteria) this;
        }

        public Criteria andLProducedtimeBetween(String value1, String value2) {
            addCriterion("l_producedtime between", value1, value2, "lProducedtime");
            return (Criteria) this;
        }

        public Criteria andLProducedtimeNotBetween(String value1, String value2) {
            addCriterion("l_producedtime not between", value1, value2, "lProducedtime");
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