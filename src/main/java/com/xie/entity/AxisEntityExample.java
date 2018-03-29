package com.xie.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AxisEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AxisEntityExample() {
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

        public Criteria andTimeAxisIdIsNull() {
            addCriterion("time_axis_id is null");
            return (Criteria) this;
        }

        public Criteria andTimeAxisIdIsNotNull() {
            addCriterion("time_axis_id is not null");
            return (Criteria) this;
        }

        public Criteria andTimeAxisIdEqualTo(Integer value) {
            addCriterion("time_axis_id =", value, "timeAxisId");
            return (Criteria) this;
        }

        public Criteria andTimeAxisIdNotEqualTo(Integer value) {
            addCriterion("time_axis_id <>", value, "timeAxisId");
            return (Criteria) this;
        }

        public Criteria andTimeAxisIdGreaterThan(Integer value) {
            addCriterion("time_axis_id >", value, "timeAxisId");
            return (Criteria) this;
        }

        public Criteria andTimeAxisIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_axis_id >=", value, "timeAxisId");
            return (Criteria) this;
        }

        public Criteria andTimeAxisIdLessThan(Integer value) {
            addCriterion("time_axis_id <", value, "timeAxisId");
            return (Criteria) this;
        }

        public Criteria andTimeAxisIdLessThanOrEqualTo(Integer value) {
            addCriterion("time_axis_id <=", value, "timeAxisId");
            return (Criteria) this;
        }

        public Criteria andTimeAxisIdIn(List<Integer> values) {
            addCriterion("time_axis_id in", values, "timeAxisId");
            return (Criteria) this;
        }

        public Criteria andTimeAxisIdNotIn(List<Integer> values) {
            addCriterion("time_axis_id not in", values, "timeAxisId");
            return (Criteria) this;
        }

        public Criteria andTimeAxisIdBetween(Integer value1, Integer value2) {
            addCriterion("time_axis_id between", value1, value2, "timeAxisId");
            return (Criteria) this;
        }

        public Criteria andTimeAxisIdNotBetween(Integer value1, Integer value2) {
            addCriterion("time_axis_id not between", value1, value2, "timeAxisId");
            return (Criteria) this;
        }

        public Criteria andTimeAxisTitleIsNull() {
            addCriterion("time_axis_title is null");
            return (Criteria) this;
        }

        public Criteria andTimeAxisTitleIsNotNull() {
            addCriterion("time_axis_title is not null");
            return (Criteria) this;
        }

        public Criteria andTimeAxisTitleEqualTo(String value) {
            addCriterion("time_axis_title =", value, "timeAxisTitle");
            return (Criteria) this;
        }

        public Criteria andTimeAxisTitleNotEqualTo(String value) {
            addCriterion("time_axis_title <>", value, "timeAxisTitle");
            return (Criteria) this;
        }

        public Criteria andTimeAxisTitleGreaterThan(String value) {
            addCriterion("time_axis_title >", value, "timeAxisTitle");
            return (Criteria) this;
        }

        public Criteria andTimeAxisTitleGreaterThanOrEqualTo(String value) {
            addCriterion("time_axis_title >=", value, "timeAxisTitle");
            return (Criteria) this;
        }

        public Criteria andTimeAxisTitleLessThan(String value) {
            addCriterion("time_axis_title <", value, "timeAxisTitle");
            return (Criteria) this;
        }

        public Criteria andTimeAxisTitleLessThanOrEqualTo(String value) {
            addCriterion("time_axis_title <=", value, "timeAxisTitle");
            return (Criteria) this;
        }

        public Criteria andTimeAxisTitleLike(String value) {
            addCriterion("time_axis_title like", value, "timeAxisTitle");
            return (Criteria) this;
        }

        public Criteria andTimeAxisTitleNotLike(String value) {
            addCriterion("time_axis_title not like", value, "timeAxisTitle");
            return (Criteria) this;
        }

        public Criteria andTimeAxisTitleIn(List<String> values) {
            addCriterion("time_axis_title in", values, "timeAxisTitle");
            return (Criteria) this;
        }

        public Criteria andTimeAxisTitleNotIn(List<String> values) {
            addCriterion("time_axis_title not in", values, "timeAxisTitle");
            return (Criteria) this;
        }

        public Criteria andTimeAxisTitleBetween(String value1, String value2) {
            addCriterion("time_axis_title between", value1, value2, "timeAxisTitle");
            return (Criteria) this;
        }

        public Criteria andTimeAxisTitleNotBetween(String value1, String value2) {
            addCriterion("time_axis_title not between", value1, value2, "timeAxisTitle");
            return (Criteria) this;
        }

        public Criteria andTimeAxisBodyIsNull() {
            addCriterion("time_axis_body is null");
            return (Criteria) this;
        }

        public Criteria andTimeAxisBodyIsNotNull() {
            addCriterion("time_axis_body is not null");
            return (Criteria) this;
        }

        public Criteria andTimeAxisBodyEqualTo(String value) {
            addCriterion("time_axis_body =", value, "timeAxisBody");
            return (Criteria) this;
        }

        public Criteria andTimeAxisBodyNotEqualTo(String value) {
            addCriterion("time_axis_body <>", value, "timeAxisBody");
            return (Criteria) this;
        }

        public Criteria andTimeAxisBodyGreaterThan(String value) {
            addCriterion("time_axis_body >", value, "timeAxisBody");
            return (Criteria) this;
        }

        public Criteria andTimeAxisBodyGreaterThanOrEqualTo(String value) {
            addCriterion("time_axis_body >=", value, "timeAxisBody");
            return (Criteria) this;
        }

        public Criteria andTimeAxisBodyLessThan(String value) {
            addCriterion("time_axis_body <", value, "timeAxisBody");
            return (Criteria) this;
        }

        public Criteria andTimeAxisBodyLessThanOrEqualTo(String value) {
            addCriterion("time_axis_body <=", value, "timeAxisBody");
            return (Criteria) this;
        }

        public Criteria andTimeAxisBodyLike(String value) {
            addCriterion("time_axis_body like", value, "timeAxisBody");
            return (Criteria) this;
        }

        public Criteria andTimeAxisBodyNotLike(String value) {
            addCriterion("time_axis_body not like", value, "timeAxisBody");
            return (Criteria) this;
        }

        public Criteria andTimeAxisBodyIn(List<String> values) {
            addCriterion("time_axis_body in", values, "timeAxisBody");
            return (Criteria) this;
        }

        public Criteria andTimeAxisBodyNotIn(List<String> values) {
            addCriterion("time_axis_body not in", values, "timeAxisBody");
            return (Criteria) this;
        }

        public Criteria andTimeAxisBodyBetween(String value1, String value2) {
            addCriterion("time_axis_body between", value1, value2, "timeAxisBody");
            return (Criteria) this;
        }

        public Criteria andTimeAxisBodyNotBetween(String value1, String value2) {
            addCriterion("time_axis_body not between", value1, value2, "timeAxisBody");
            return (Criteria) this;
        }

        public Criteria andTimeAxisCtimeIsNull() {
            addCriterion("time_axis_ctime is null");
            return (Criteria) this;
        }

        public Criteria andTimeAxisCtimeIsNotNull() {
            addCriterion("time_axis_ctime is not null");
            return (Criteria) this;
        }

        public Criteria andTimeAxisCtimeEqualTo(Date value) {
            addCriterion("time_axis_ctime =", value, "timeAxisCtime");
            return (Criteria) this;
        }

        public Criteria andTimeAxisCtimeNotEqualTo(Date value) {
            addCriterion("time_axis_ctime <>", value, "timeAxisCtime");
            return (Criteria) this;
        }

        public Criteria andTimeAxisCtimeGreaterThan(Date value) {
            addCriterion("time_axis_ctime >", value, "timeAxisCtime");
            return (Criteria) this;
        }

        public Criteria andTimeAxisCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time_axis_ctime >=", value, "timeAxisCtime");
            return (Criteria) this;
        }

        public Criteria andTimeAxisCtimeLessThan(Date value) {
            addCriterion("time_axis_ctime <", value, "timeAxisCtime");
            return (Criteria) this;
        }

        public Criteria andTimeAxisCtimeLessThanOrEqualTo(Date value) {
            addCriterion("time_axis_ctime <=", value, "timeAxisCtime");
            return (Criteria) this;
        }

        public Criteria andTimeAxisCtimeIn(List<Date> values) {
            addCriterion("time_axis_ctime in", values, "timeAxisCtime");
            return (Criteria) this;
        }

        public Criteria andTimeAxisCtimeNotIn(List<Date> values) {
            addCriterion("time_axis_ctime not in", values, "timeAxisCtime");
            return (Criteria) this;
        }

        public Criteria andTimeAxisCtimeBetween(Date value1, Date value2) {
            addCriterion("time_axis_ctime between", value1, value2, "timeAxisCtime");
            return (Criteria) this;
        }

        public Criteria andTimeAxisCtimeNotBetween(Date value1, Date value2) {
            addCriterion("time_axis_ctime not between", value1, value2, "timeAxisCtime");
            return (Criteria) this;
        }

        public Criteria andTimeAxisMtimeIsNull() {
            addCriterion("time_axis_mtime is null");
            return (Criteria) this;
        }

        public Criteria andTimeAxisMtimeIsNotNull() {
            addCriterion("time_axis_mtime is not null");
            return (Criteria) this;
        }

        public Criteria andTimeAxisMtimeEqualTo(Date value) {
            addCriterion("time_axis_mtime =", value, "timeAxisMtime");
            return (Criteria) this;
        }

        public Criteria andTimeAxisMtimeNotEqualTo(Date value) {
            addCriterion("time_axis_mtime <>", value, "timeAxisMtime");
            return (Criteria) this;
        }

        public Criteria andTimeAxisMtimeGreaterThan(Date value) {
            addCriterion("time_axis_mtime >", value, "timeAxisMtime");
            return (Criteria) this;
        }

        public Criteria andTimeAxisMtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time_axis_mtime >=", value, "timeAxisMtime");
            return (Criteria) this;
        }

        public Criteria andTimeAxisMtimeLessThan(Date value) {
            addCriterion("time_axis_mtime <", value, "timeAxisMtime");
            return (Criteria) this;
        }

        public Criteria andTimeAxisMtimeLessThanOrEqualTo(Date value) {
            addCriterion("time_axis_mtime <=", value, "timeAxisMtime");
            return (Criteria) this;
        }

        public Criteria andTimeAxisMtimeIn(List<Date> values) {
            addCriterion("time_axis_mtime in", values, "timeAxisMtime");
            return (Criteria) this;
        }

        public Criteria andTimeAxisMtimeNotIn(List<Date> values) {
            addCriterion("time_axis_mtime not in", values, "timeAxisMtime");
            return (Criteria) this;
        }

        public Criteria andTimeAxisMtimeBetween(Date value1, Date value2) {
            addCriterion("time_axis_mtime between", value1, value2, "timeAxisMtime");
            return (Criteria) this;
        }

        public Criteria andTimeAxisMtimeNotBetween(Date value1, Date value2) {
            addCriterion("time_axis_mtime not between", value1, value2, "timeAxisMtime");
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