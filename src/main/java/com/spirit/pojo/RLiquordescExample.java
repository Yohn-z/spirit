package com.spirit.pojo;

import java.util.ArrayList;
import java.util.List;

public class RLiquordescExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RLiquordescExample() {
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

        public Criteria andLdPriceIsNull() {
            addCriterion("ld_price is null");
            return (Criteria) this;
        }

        public Criteria andLdPriceIsNotNull() {
            addCriterion("ld_price is not null");
            return (Criteria) this;
        }

        public Criteria andLdPriceEqualTo(Double value) {
            addCriterion("ld_price =", value, "ldPrice");
            return (Criteria) this;
        }

        public Criteria andLdPriceNotEqualTo(Double value) {
            addCriterion("ld_price <>", value, "ldPrice");
            return (Criteria) this;
        }

        public Criteria andLdPriceGreaterThan(Double value) {
            addCriterion("ld_price >", value, "ldPrice");
            return (Criteria) this;
        }

        public Criteria andLdPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("ld_price >=", value, "ldPrice");
            return (Criteria) this;
        }

        public Criteria andLdPriceLessThan(Double value) {
            addCriterion("ld_price <", value, "ldPrice");
            return (Criteria) this;
        }

        public Criteria andLdPriceLessThanOrEqualTo(Double value) {
            addCriterion("ld_price <=", value, "ldPrice");
            return (Criteria) this;
        }

        public Criteria andLdPriceIn(List<Double> values) {
            addCriterion("ld_price in", values, "ldPrice");
            return (Criteria) this;
        }

        public Criteria andLdPriceNotIn(List<Double> values) {
            addCriterion("ld_price not in", values, "ldPrice");
            return (Criteria) this;
        }

        public Criteria andLdPriceBetween(Double value1, Double value2) {
            addCriterion("ld_price between", value1, value2, "ldPrice");
            return (Criteria) this;
        }

        public Criteria andLdPriceNotBetween(Double value1, Double value2) {
            addCriterion("ld_price not between", value1, value2, "ldPrice");
            return (Criteria) this;
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

        public Criteria andLdChannelsIsNull() {
            addCriterion("ld_channels is null");
            return (Criteria) this;
        }

        public Criteria andLdChannelsIsNotNull() {
            addCriterion("ld_channels is not null");
            return (Criteria) this;
        }

        public Criteria andLdChannelsEqualTo(String value) {
            addCriterion("ld_channels =", value, "ldChannels");
            return (Criteria) this;
        }

        public Criteria andLdChannelsNotEqualTo(String value) {
            addCriterion("ld_channels <>", value, "ldChannels");
            return (Criteria) this;
        }

        public Criteria andLdChannelsGreaterThan(String value) {
            addCriterion("ld_channels >", value, "ldChannels");
            return (Criteria) this;
        }

        public Criteria andLdChannelsGreaterThanOrEqualTo(String value) {
            addCriterion("ld_channels >=", value, "ldChannels");
            return (Criteria) this;
        }

        public Criteria andLdChannelsLessThan(String value) {
            addCriterion("ld_channels <", value, "ldChannels");
            return (Criteria) this;
        }

        public Criteria andLdChannelsLessThanOrEqualTo(String value) {
            addCriterion("ld_channels <=", value, "ldChannels");
            return (Criteria) this;
        }

        public Criteria andLdChannelsLike(String value) {
            addCriterion("ld_channels like", value, "ldChannels");
            return (Criteria) this;
        }

        public Criteria andLdChannelsNotLike(String value) {
            addCriterion("ld_channels not like", value, "ldChannels");
            return (Criteria) this;
        }

        public Criteria andLdChannelsIn(List<String> values) {
            addCriterion("ld_channels in", values, "ldChannels");
            return (Criteria) this;
        }

        public Criteria andLdChannelsNotIn(List<String> values) {
            addCriterion("ld_channels not in", values, "ldChannels");
            return (Criteria) this;
        }

        public Criteria andLdChannelsBetween(String value1, String value2) {
            addCriterion("ld_channels between", value1, value2, "ldChannels");
            return (Criteria) this;
        }

        public Criteria andLdChannelsNotBetween(String value1, String value2) {
            addCriterion("ld_channels not between", value1, value2, "ldChannels");
            return (Criteria) this;
        }

        public Criteria andLdSealIsNull() {
            addCriterion("ld_seal is null");
            return (Criteria) this;
        }

        public Criteria andLdSealIsNotNull() {
            addCriterion("ld_seal is not null");
            return (Criteria) this;
        }

        public Criteria andLdSealEqualTo(Integer value) {
            addCriterion("ld_seal =", value, "ldSeal");
            return (Criteria) this;
        }

        public Criteria andLdSealNotEqualTo(Integer value) {
            addCriterion("ld_seal <>", value, "ldSeal");
            return (Criteria) this;
        }

        public Criteria andLdSealGreaterThan(Integer value) {
            addCriterion("ld_seal >", value, "ldSeal");
            return (Criteria) this;
        }

        public Criteria andLdSealGreaterThanOrEqualTo(Integer value) {
            addCriterion("ld_seal >=", value, "ldSeal");
            return (Criteria) this;
        }

        public Criteria andLdSealLessThan(Integer value) {
            addCriterion("ld_seal <", value, "ldSeal");
            return (Criteria) this;
        }

        public Criteria andLdSealLessThanOrEqualTo(Integer value) {
            addCriterion("ld_seal <=", value, "ldSeal");
            return (Criteria) this;
        }

        public Criteria andLdSealIn(List<Integer> values) {
            addCriterion("ld_seal in", values, "ldSeal");
            return (Criteria) this;
        }

        public Criteria andLdSealNotIn(List<Integer> values) {
            addCriterion("ld_seal not in", values, "ldSeal");
            return (Criteria) this;
        }

        public Criteria andLdSealBetween(Integer value1, Integer value2) {
            addCriterion("ld_seal between", value1, value2, "ldSeal");
            return (Criteria) this;
        }

        public Criteria andLdSealNotBetween(Integer value1, Integer value2) {
            addCriterion("ld_seal not between", value1, value2, "ldSeal");
            return (Criteria) this;
        }

        public Criteria andLdBeforeIsNull() {
            addCriterion("ld_before is null");
            return (Criteria) this;
        }

        public Criteria andLdBeforeIsNotNull() {
            addCriterion("ld_before is not null");
            return (Criteria) this;
        }

        public Criteria andLdBeforeEqualTo(String value) {
            addCriterion("ld_before =", value, "ldBefore");
            return (Criteria) this;
        }

        public Criteria andLdBeforeNotEqualTo(String value) {
            addCriterion("ld_before <>", value, "ldBefore");
            return (Criteria) this;
        }

        public Criteria andLdBeforeGreaterThan(String value) {
            addCriterion("ld_before >", value, "ldBefore");
            return (Criteria) this;
        }

        public Criteria andLdBeforeGreaterThanOrEqualTo(String value) {
            addCriterion("ld_before >=", value, "ldBefore");
            return (Criteria) this;
        }

        public Criteria andLdBeforeLessThan(String value) {
            addCriterion("ld_before <", value, "ldBefore");
            return (Criteria) this;
        }

        public Criteria andLdBeforeLessThanOrEqualTo(String value) {
            addCriterion("ld_before <=", value, "ldBefore");
            return (Criteria) this;
        }

        public Criteria andLdBeforeLike(String value) {
            addCriterion("ld_before like", value, "ldBefore");
            return (Criteria) this;
        }

        public Criteria andLdBeforeNotLike(String value) {
            addCriterion("ld_before not like", value, "ldBefore");
            return (Criteria) this;
        }

        public Criteria andLdBeforeIn(List<String> values) {
            addCriterion("ld_before in", values, "ldBefore");
            return (Criteria) this;
        }

        public Criteria andLdBeforeNotIn(List<String> values) {
            addCriterion("ld_before not in", values, "ldBefore");
            return (Criteria) this;
        }

        public Criteria andLdBeforeBetween(String value1, String value2) {
            addCriterion("ld_before between", value1, value2, "ldBefore");
            return (Criteria) this;
        }

        public Criteria andLdBeforeNotBetween(String value1, String value2) {
            addCriterion("ld_before not between", value1, value2, "ldBefore");
            return (Criteria) this;
        }

        public Criteria andLdBackIsNull() {
            addCriterion("ld_back is null");
            return (Criteria) this;
        }

        public Criteria andLdBackIsNotNull() {
            addCriterion("ld_back is not null");
            return (Criteria) this;
        }

        public Criteria andLdBackEqualTo(String value) {
            addCriterion("ld_back =", value, "ldBack");
            return (Criteria) this;
        }

        public Criteria andLdBackNotEqualTo(String value) {
            addCriterion("ld_back <>", value, "ldBack");
            return (Criteria) this;
        }

        public Criteria andLdBackGreaterThan(String value) {
            addCriterion("ld_back >", value, "ldBack");
            return (Criteria) this;
        }

        public Criteria andLdBackGreaterThanOrEqualTo(String value) {
            addCriterion("ld_back >=", value, "ldBack");
            return (Criteria) this;
        }

        public Criteria andLdBackLessThan(String value) {
            addCriterion("ld_back <", value, "ldBack");
            return (Criteria) this;
        }

        public Criteria andLdBackLessThanOrEqualTo(String value) {
            addCriterion("ld_back <=", value, "ldBack");
            return (Criteria) this;
        }

        public Criteria andLdBackLike(String value) {
            addCriterion("ld_back like", value, "ldBack");
            return (Criteria) this;
        }

        public Criteria andLdBackNotLike(String value) {
            addCriterion("ld_back not like", value, "ldBack");
            return (Criteria) this;
        }

        public Criteria andLdBackIn(List<String> values) {
            addCriterion("ld_back in", values, "ldBack");
            return (Criteria) this;
        }

        public Criteria andLdBackNotIn(List<String> values) {
            addCriterion("ld_back not in", values, "ldBack");
            return (Criteria) this;
        }

        public Criteria andLdBackBetween(String value1, String value2) {
            addCriterion("ld_back between", value1, value2, "ldBack");
            return (Criteria) this;
        }

        public Criteria andLdBackNotBetween(String value1, String value2) {
            addCriterion("ld_back not between", value1, value2, "ldBack");
            return (Criteria) this;
        }

        public Criteria andLdTopIsNull() {
            addCriterion("ld_top is null");
            return (Criteria) this;
        }

        public Criteria andLdTopIsNotNull() {
            addCriterion("ld_top is not null");
            return (Criteria) this;
        }

        public Criteria andLdTopEqualTo(String value) {
            addCriterion("ld_top =", value, "ldTop");
            return (Criteria) this;
        }

        public Criteria andLdTopNotEqualTo(String value) {
            addCriterion("ld_top <>", value, "ldTop");
            return (Criteria) this;
        }

        public Criteria andLdTopGreaterThan(String value) {
            addCriterion("ld_top >", value, "ldTop");
            return (Criteria) this;
        }

        public Criteria andLdTopGreaterThanOrEqualTo(String value) {
            addCriterion("ld_top >=", value, "ldTop");
            return (Criteria) this;
        }

        public Criteria andLdTopLessThan(String value) {
            addCriterion("ld_top <", value, "ldTop");
            return (Criteria) this;
        }

        public Criteria andLdTopLessThanOrEqualTo(String value) {
            addCriterion("ld_top <=", value, "ldTop");
            return (Criteria) this;
        }

        public Criteria andLdTopLike(String value) {
            addCriterion("ld_top like", value, "ldTop");
            return (Criteria) this;
        }

        public Criteria andLdTopNotLike(String value) {
            addCriterion("ld_top not like", value, "ldTop");
            return (Criteria) this;
        }

        public Criteria andLdTopIn(List<String> values) {
            addCriterion("ld_top in", values, "ldTop");
            return (Criteria) this;
        }

        public Criteria andLdTopNotIn(List<String> values) {
            addCriterion("ld_top not in", values, "ldTop");
            return (Criteria) this;
        }

        public Criteria andLdTopBetween(String value1, String value2) {
            addCriterion("ld_top between", value1, value2, "ldTop");
            return (Criteria) this;
        }

        public Criteria andLdTopNotBetween(String value1, String value2) {
            addCriterion("ld_top not between", value1, value2, "ldTop");
            return (Criteria) this;
        }

        public Criteria andLdAddtimeIsNull() {
            addCriterion("ld_addtime is null");
            return (Criteria) this;
        }

        public Criteria andLdAddtimeIsNotNull() {
            addCriterion("ld_addtime is not null");
            return (Criteria) this;
        }

        public Criteria andLdAddtimeEqualTo(String value) {
            addCriterion("ld_addtime =", value, "ldAddtime");
            return (Criteria) this;
        }

        public Criteria andLdAddtimeNotEqualTo(String value) {
            addCriterion("ld_addtime <>", value, "ldAddtime");
            return (Criteria) this;
        }

        public Criteria andLdAddtimeGreaterThan(String value) {
            addCriterion("ld_addtime >", value, "ldAddtime");
            return (Criteria) this;
        }

        public Criteria andLdAddtimeGreaterThanOrEqualTo(String value) {
            addCriterion("ld_addtime >=", value, "ldAddtime");
            return (Criteria) this;
        }

        public Criteria andLdAddtimeLessThan(String value) {
            addCriterion("ld_addtime <", value, "ldAddtime");
            return (Criteria) this;
        }

        public Criteria andLdAddtimeLessThanOrEqualTo(String value) {
            addCriterion("ld_addtime <=", value, "ldAddtime");
            return (Criteria) this;
        }

        public Criteria andLdAddtimeLike(String value) {
            addCriterion("ld_addtime like", value, "ldAddtime");
            return (Criteria) this;
        }

        public Criteria andLdAddtimeNotLike(String value) {
            addCriterion("ld_addtime not like", value, "ldAddtime");
            return (Criteria) this;
        }

        public Criteria andLdAddtimeIn(List<String> values) {
            addCriterion("ld_addtime in", values, "ldAddtime");
            return (Criteria) this;
        }

        public Criteria andLdAddtimeNotIn(List<String> values) {
            addCriterion("ld_addtime not in", values, "ldAddtime");
            return (Criteria) this;
        }

        public Criteria andLdAddtimeBetween(String value1, String value2) {
            addCriterion("ld_addtime between", value1, value2, "ldAddtime");
            return (Criteria) this;
        }

        public Criteria andLdAddtimeNotBetween(String value1, String value2) {
            addCriterion("ld_addtime not between", value1, value2, "ldAddtime");
            return (Criteria) this;
        }

        public Criteria andLdTextIsNull() {
            addCriterion("ld_text is null");
            return (Criteria) this;
        }

        public Criteria andLdTextIsNotNull() {
            addCriterion("ld_text is not null");
            return (Criteria) this;
        }

        public Criteria andLdTextEqualTo(String value) {
            addCriterion("ld_text =", value, "ldText");
            return (Criteria) this;
        }

        public Criteria andLdTextNotEqualTo(String value) {
            addCriterion("ld_text <>", value, "ldText");
            return (Criteria) this;
        }

        public Criteria andLdTextGreaterThan(String value) {
            addCriterion("ld_text >", value, "ldText");
            return (Criteria) this;
        }

        public Criteria andLdTextGreaterThanOrEqualTo(String value) {
            addCriterion("ld_text >=", value, "ldText");
            return (Criteria) this;
        }

        public Criteria andLdTextLessThan(String value) {
            addCriterion("ld_text <", value, "ldText");
            return (Criteria) this;
        }

        public Criteria andLdTextLessThanOrEqualTo(String value) {
            addCriterion("ld_text <=", value, "ldText");
            return (Criteria) this;
        }

        public Criteria andLdTextLike(String value) {
            addCriterion("ld_text like", value, "ldText");
            return (Criteria) this;
        }

        public Criteria andLdTextNotLike(String value) {
            addCriterion("ld_text not like", value, "ldText");
            return (Criteria) this;
        }

        public Criteria andLdTextIn(List<String> values) {
            addCriterion("ld_text in", values, "ldText");
            return (Criteria) this;
        }

        public Criteria andLdTextNotIn(List<String> values) {
            addCriterion("ld_text not in", values, "ldText");
            return (Criteria) this;
        }

        public Criteria andLdTextBetween(String value1, String value2) {
            addCriterion("ld_text between", value1, value2, "ldText");
            return (Criteria) this;
        }

        public Criteria andLdTextNotBetween(String value1, String value2) {
            addCriterion("ld_text not between", value1, value2, "ldText");
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