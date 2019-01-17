package com.spirit.pojo;

import java.util.ArrayList;
import java.util.List;

public class RUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RUserExample() {
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

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Long value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Long value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Long value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Long value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Long value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Long value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Long> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Long> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Long value1, Long value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Long value1, Long value2) {
            addCriterion("u_id not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUNameIsNull() {
            addCriterion("u_name is null");
            return (Criteria) this;
        }

        public Criteria andUNameIsNotNull() {
            addCriterion("u_name is not null");
            return (Criteria) this;
        }

        public Criteria andUNameEqualTo(String value) {
            addCriterion("u_name =", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotEqualTo(String value) {
            addCriterion("u_name <>", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThan(String value) {
            addCriterion("u_name >", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThanOrEqualTo(String value) {
            addCriterion("u_name >=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThan(String value) {
            addCriterion("u_name <", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThanOrEqualTo(String value) {
            addCriterion("u_name <=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLike(String value) {
            addCriterion("u_name like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotLike(String value) {
            addCriterion("u_name not like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameIn(List<String> values) {
            addCriterion("u_name in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotIn(List<String> values) {
            addCriterion("u_name not in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameBetween(String value1, String value2) {
            addCriterion("u_name between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotBetween(String value1, String value2) {
            addCriterion("u_name not between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUPassIsNull() {
            addCriterion("u_pass is null");
            return (Criteria) this;
        }

        public Criteria andUPassIsNotNull() {
            addCriterion("u_pass is not null");
            return (Criteria) this;
        }

        public Criteria andUPassEqualTo(String value) {
            addCriterion("u_pass =", value, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassNotEqualTo(String value) {
            addCriterion("u_pass <>", value, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassGreaterThan(String value) {
            addCriterion("u_pass >", value, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassGreaterThanOrEqualTo(String value) {
            addCriterion("u_pass >=", value, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassLessThan(String value) {
            addCriterion("u_pass <", value, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassLessThanOrEqualTo(String value) {
            addCriterion("u_pass <=", value, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassLike(String value) {
            addCriterion("u_pass like", value, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassNotLike(String value) {
            addCriterion("u_pass not like", value, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassIn(List<String> values) {
            addCriterion("u_pass in", values, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassNotIn(List<String> values) {
            addCriterion("u_pass not in", values, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassBetween(String value1, String value2) {
            addCriterion("u_pass between", value1, value2, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassNotBetween(String value1, String value2) {
            addCriterion("u_pass not between", value1, value2, "uPass");
            return (Criteria) this;
        }

        public Criteria andURoleIsNull() {
            addCriterion("u_role is null");
            return (Criteria) this;
        }

        public Criteria andURoleIsNotNull() {
            addCriterion("u_role is not null");
            return (Criteria) this;
        }

        public Criteria andURoleEqualTo(Integer value) {
            addCriterion("u_role =", value, "uRole");
            return (Criteria) this;
        }

        public Criteria andURoleNotEqualTo(Integer value) {
            addCriterion("u_role <>", value, "uRole");
            return (Criteria) this;
        }

        public Criteria andURoleGreaterThan(Integer value) {
            addCriterion("u_role >", value, "uRole");
            return (Criteria) this;
        }

        public Criteria andURoleGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_role >=", value, "uRole");
            return (Criteria) this;
        }

        public Criteria andURoleLessThan(Integer value) {
            addCriterion("u_role <", value, "uRole");
            return (Criteria) this;
        }

        public Criteria andURoleLessThanOrEqualTo(Integer value) {
            addCriterion("u_role <=", value, "uRole");
            return (Criteria) this;
        }

        public Criteria andURoleIn(List<Integer> values) {
            addCriterion("u_role in", values, "uRole");
            return (Criteria) this;
        }

        public Criteria andURoleNotIn(List<Integer> values) {
            addCriterion("u_role not in", values, "uRole");
            return (Criteria) this;
        }

        public Criteria andURoleBetween(Integer value1, Integer value2) {
            addCriterion("u_role between", value1, value2, "uRole");
            return (Criteria) this;
        }

        public Criteria andURoleNotBetween(Integer value1, Integer value2) {
            addCriterion("u_role not between", value1, value2, "uRole");
            return (Criteria) this;
        }

        public Criteria andUStatusIsNull() {
            addCriterion("u_status is null");
            return (Criteria) this;
        }

        public Criteria andUStatusIsNotNull() {
            addCriterion("u_status is not null");
            return (Criteria) this;
        }

        public Criteria andUStatusEqualTo(Integer value) {
            addCriterion("u_status =", value, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusNotEqualTo(Integer value) {
            addCriterion("u_status <>", value, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusGreaterThan(Integer value) {
            addCriterion("u_status >", value, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_status >=", value, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusLessThan(Integer value) {
            addCriterion("u_status <", value, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusLessThanOrEqualTo(Integer value) {
            addCriterion("u_status <=", value, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusIn(List<Integer> values) {
            addCriterion("u_status in", values, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusNotIn(List<Integer> values) {
            addCriterion("u_status not in", values, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusBetween(Integer value1, Integer value2) {
            addCriterion("u_status between", value1, value2, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("u_status not between", value1, value2, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUCreatTimeIsNull() {
            addCriterion("u_creat_time is null");
            return (Criteria) this;
        }

        public Criteria andUCreatTimeIsNotNull() {
            addCriterion("u_creat_time is not null");
            return (Criteria) this;
        }

        public Criteria andUCreatTimeEqualTo(String value) {
            addCriterion("u_creat_time =", value, "uCreatTime");
            return (Criteria) this;
        }

        public Criteria andUCreatTimeNotEqualTo(String value) {
            addCriterion("u_creat_time <>", value, "uCreatTime");
            return (Criteria) this;
        }

        public Criteria andUCreatTimeGreaterThan(String value) {
            addCriterion("u_creat_time >", value, "uCreatTime");
            return (Criteria) this;
        }

        public Criteria andUCreatTimeGreaterThanOrEqualTo(String value) {
            addCriterion("u_creat_time >=", value, "uCreatTime");
            return (Criteria) this;
        }

        public Criteria andUCreatTimeLessThan(String value) {
            addCriterion("u_creat_time <", value, "uCreatTime");
            return (Criteria) this;
        }

        public Criteria andUCreatTimeLessThanOrEqualTo(String value) {
            addCriterion("u_creat_time <=", value, "uCreatTime");
            return (Criteria) this;
        }

        public Criteria andUCreatTimeLike(String value) {
            addCriterion("u_creat_time like", value, "uCreatTime");
            return (Criteria) this;
        }

        public Criteria andUCreatTimeNotLike(String value) {
            addCriterion("u_creat_time not like", value, "uCreatTime");
            return (Criteria) this;
        }

        public Criteria andUCreatTimeIn(List<String> values) {
            addCriterion("u_creat_time in", values, "uCreatTime");
            return (Criteria) this;
        }

        public Criteria andUCreatTimeNotIn(List<String> values) {
            addCriterion("u_creat_time not in", values, "uCreatTime");
            return (Criteria) this;
        }

        public Criteria andUCreatTimeBetween(String value1, String value2) {
            addCriterion("u_creat_time between", value1, value2, "uCreatTime");
            return (Criteria) this;
        }

        public Criteria andUCreatTimeNotBetween(String value1, String value2) {
            addCriterion("u_creat_time not between", value1, value2, "uCreatTime");
            return (Criteria) this;
        }

        public Criteria andULastTimeIsNull() {
            addCriterion("u_last_time is null");
            return (Criteria) this;
        }

        public Criteria andULastTimeIsNotNull() {
            addCriterion("u_last_time is not null");
            return (Criteria) this;
        }

        public Criteria andULastTimeEqualTo(String value) {
            addCriterion("u_last_time =", value, "uLastTime");
            return (Criteria) this;
        }

        public Criteria andULastTimeNotEqualTo(String value) {
            addCriterion("u_last_time <>", value, "uLastTime");
            return (Criteria) this;
        }

        public Criteria andULastTimeGreaterThan(String value) {
            addCriterion("u_last_time >", value, "uLastTime");
            return (Criteria) this;
        }

        public Criteria andULastTimeGreaterThanOrEqualTo(String value) {
            addCriterion("u_last_time >=", value, "uLastTime");
            return (Criteria) this;
        }

        public Criteria andULastTimeLessThan(String value) {
            addCriterion("u_last_time <", value, "uLastTime");
            return (Criteria) this;
        }

        public Criteria andULastTimeLessThanOrEqualTo(String value) {
            addCriterion("u_last_time <=", value, "uLastTime");
            return (Criteria) this;
        }

        public Criteria andULastTimeLike(String value) {
            addCriterion("u_last_time like", value, "uLastTime");
            return (Criteria) this;
        }

        public Criteria andULastTimeNotLike(String value) {
            addCriterion("u_last_time not like", value, "uLastTime");
            return (Criteria) this;
        }

        public Criteria andULastTimeIn(List<String> values) {
            addCriterion("u_last_time in", values, "uLastTime");
            return (Criteria) this;
        }

        public Criteria andULastTimeNotIn(List<String> values) {
            addCriterion("u_last_time not in", values, "uLastTime");
            return (Criteria) this;
        }

        public Criteria andULastTimeBetween(String value1, String value2) {
            addCriterion("u_last_time between", value1, value2, "uLastTime");
            return (Criteria) this;
        }

        public Criteria andULastTimeNotBetween(String value1, String value2) {
            addCriterion("u_last_time not between", value1, value2, "uLastTime");
            return (Criteria) this;
        }

        public Criteria andUIpIsNull() {
            addCriterion("u_ip is null");
            return (Criteria) this;
        }

        public Criteria andUIpIsNotNull() {
            addCriterion("u_ip is not null");
            return (Criteria) this;
        }

        public Criteria andUIpEqualTo(String value) {
            addCriterion("u_ip =", value, "uIp");
            return (Criteria) this;
        }

        public Criteria andUIpNotEqualTo(String value) {
            addCriterion("u_ip <>", value, "uIp");
            return (Criteria) this;
        }

        public Criteria andUIpGreaterThan(String value) {
            addCriterion("u_ip >", value, "uIp");
            return (Criteria) this;
        }

        public Criteria andUIpGreaterThanOrEqualTo(String value) {
            addCriterion("u_ip >=", value, "uIp");
            return (Criteria) this;
        }

        public Criteria andUIpLessThan(String value) {
            addCriterion("u_ip <", value, "uIp");
            return (Criteria) this;
        }

        public Criteria andUIpLessThanOrEqualTo(String value) {
            addCriterion("u_ip <=", value, "uIp");
            return (Criteria) this;
        }

        public Criteria andUIpLike(String value) {
            addCriterion("u_ip like", value, "uIp");
            return (Criteria) this;
        }

        public Criteria andUIpNotLike(String value) {
            addCriterion("u_ip not like", value, "uIp");
            return (Criteria) this;
        }

        public Criteria andUIpIn(List<String> values) {
            addCriterion("u_ip in", values, "uIp");
            return (Criteria) this;
        }

        public Criteria andUIpNotIn(List<String> values) {
            addCriterion("u_ip not in", values, "uIp");
            return (Criteria) this;
        }

        public Criteria andUIpBetween(String value1, String value2) {
            addCriterion("u_ip between", value1, value2, "uIp");
            return (Criteria) this;
        }

        public Criteria andUIpNotBetween(String value1, String value2) {
            addCriterion("u_ip not between", value1, value2, "uIp");
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