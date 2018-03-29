package com.xie.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClassEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassEntityExample() {
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

        public Criteria andClassificationIdIsNull() {
            addCriterion("classification_id is null");
            return (Criteria) this;
        }

        public Criteria andClassificationIdIsNotNull() {
            addCriterion("classification_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassificationIdEqualTo(Integer value) {
            addCriterion("classification_id =", value, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdNotEqualTo(Integer value) {
            addCriterion("classification_id <>", value, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdGreaterThan(Integer value) {
            addCriterion("classification_id >", value, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("classification_id >=", value, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdLessThan(Integer value) {
            addCriterion("classification_id <", value, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdLessThanOrEqualTo(Integer value) {
            addCriterion("classification_id <=", value, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdIn(List<Integer> values) {
            addCriterion("classification_id in", values, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdNotIn(List<Integer> values) {
            addCriterion("classification_id not in", values, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdBetween(Integer value1, Integer value2) {
            addCriterion("classification_id between", value1, value2, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("classification_id not between", value1, value2, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationNameIsNull() {
            addCriterion("classification_name is null");
            return (Criteria) this;
        }

        public Criteria andClassificationNameIsNotNull() {
            addCriterion("classification_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassificationNameEqualTo(String value) {
            addCriterion("classification_name =", value, "classificationName");
            return (Criteria) this;
        }

        public Criteria andClassificationNameNotEqualTo(String value) {
            addCriterion("classification_name <>", value, "classificationName");
            return (Criteria) this;
        }

        public Criteria andClassificationNameGreaterThan(String value) {
            addCriterion("classification_name >", value, "classificationName");
            return (Criteria) this;
        }

        public Criteria andClassificationNameGreaterThanOrEqualTo(String value) {
            addCriterion("classification_name >=", value, "classificationName");
            return (Criteria) this;
        }

        public Criteria andClassificationNameLessThan(String value) {
            addCriterion("classification_name <", value, "classificationName");
            return (Criteria) this;
        }

        public Criteria andClassificationNameLessThanOrEqualTo(String value) {
            addCriterion("classification_name <=", value, "classificationName");
            return (Criteria) this;
        }

        public Criteria andClassificationNameLike(String value) {
            addCriterion("classification_name like", value, "classificationName");
            return (Criteria) this;
        }

        public Criteria andClassificationNameNotLike(String value) {
            addCriterion("classification_name not like", value, "classificationName");
            return (Criteria) this;
        }

        public Criteria andClassificationNameIn(List<String> values) {
            addCriterion("classification_name in", values, "classificationName");
            return (Criteria) this;
        }

        public Criteria andClassificationNameNotIn(List<String> values) {
            addCriterion("classification_name not in", values, "classificationName");
            return (Criteria) this;
        }

        public Criteria andClassificationNameBetween(String value1, String value2) {
            addCriterion("classification_name between", value1, value2, "classificationName");
            return (Criteria) this;
        }

        public Criteria andClassificationNameNotBetween(String value1, String value2) {
            addCriterion("classification_name not between", value1, value2, "classificationName");
            return (Criteria) this;
        }

        public Criteria andClassificationCtimeIsNull() {
            addCriterion("classification_ctime is null");
            return (Criteria) this;
        }

        public Criteria andClassificationCtimeIsNotNull() {
            addCriterion("classification_ctime is not null");
            return (Criteria) this;
        }

        public Criteria andClassificationCtimeEqualTo(Date value) {
            addCriterion("classification_ctime =", value, "classificationCtime");
            return (Criteria) this;
        }

        public Criteria andClassificationCtimeNotEqualTo(Date value) {
            addCriterion("classification_ctime <>", value, "classificationCtime");
            return (Criteria) this;
        }

        public Criteria andClassificationCtimeGreaterThan(Date value) {
            addCriterion("classification_ctime >", value, "classificationCtime");
            return (Criteria) this;
        }

        public Criteria andClassificationCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("classification_ctime >=", value, "classificationCtime");
            return (Criteria) this;
        }

        public Criteria andClassificationCtimeLessThan(Date value) {
            addCriterion("classification_ctime <", value, "classificationCtime");
            return (Criteria) this;
        }

        public Criteria andClassificationCtimeLessThanOrEqualTo(Date value) {
            addCriterion("classification_ctime <=", value, "classificationCtime");
            return (Criteria) this;
        }

        public Criteria andClassificationCtimeIn(List<Date> values) {
            addCriterion("classification_ctime in", values, "classificationCtime");
            return (Criteria) this;
        }

        public Criteria andClassificationCtimeNotIn(List<Date> values) {
            addCriterion("classification_ctime not in", values, "classificationCtime");
            return (Criteria) this;
        }

        public Criteria andClassificationCtimeBetween(Date value1, Date value2) {
            addCriterion("classification_ctime between", value1, value2, "classificationCtime");
            return (Criteria) this;
        }

        public Criteria andClassificationCtimeNotBetween(Date value1, Date value2) {
            addCriterion("classification_ctime not between", value1, value2, "classificationCtime");
            return (Criteria) this;
        }

        public Criteria andClassificationMtimeIsNull() {
            addCriterion("classification_mtime is null");
            return (Criteria) this;
        }

        public Criteria andClassificationMtimeIsNotNull() {
            addCriterion("classification_mtime is not null");
            return (Criteria) this;
        }

        public Criteria andClassificationMtimeEqualTo(Date value) {
            addCriterion("classification_mtime =", value, "classificationMtime");
            return (Criteria) this;
        }

        public Criteria andClassificationMtimeNotEqualTo(Date value) {
            addCriterion("classification_mtime <>", value, "classificationMtime");
            return (Criteria) this;
        }

        public Criteria andClassificationMtimeGreaterThan(Date value) {
            addCriterion("classification_mtime >", value, "classificationMtime");
            return (Criteria) this;
        }

        public Criteria andClassificationMtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("classification_mtime >=", value, "classificationMtime");
            return (Criteria) this;
        }

        public Criteria andClassificationMtimeLessThan(Date value) {
            addCriterion("classification_mtime <", value, "classificationMtime");
            return (Criteria) this;
        }

        public Criteria andClassificationMtimeLessThanOrEqualTo(Date value) {
            addCriterion("classification_mtime <=", value, "classificationMtime");
            return (Criteria) this;
        }

        public Criteria andClassificationMtimeIn(List<Date> values) {
            addCriterion("classification_mtime in", values, "classificationMtime");
            return (Criteria) this;
        }

        public Criteria andClassificationMtimeNotIn(List<Date> values) {
            addCriterion("classification_mtime not in", values, "classificationMtime");
            return (Criteria) this;
        }

        public Criteria andClassificationMtimeBetween(Date value1, Date value2) {
            addCriterion("classification_mtime between", value1, value2, "classificationMtime");
            return (Criteria) this;
        }

        public Criteria andClassificationMtimeNotBetween(Date value1, Date value2) {
            addCriterion("classification_mtime not between", value1, value2, "classificationMtime");
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