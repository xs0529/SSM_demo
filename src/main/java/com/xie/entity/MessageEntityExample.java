package com.xie.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageEntityExample() {
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

        public Criteria andMessageIdIsNull() {
            addCriterion("message_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageIdIsNotNull() {
            addCriterion("message_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageIdEqualTo(Long value) {
            addCriterion("message_id =", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotEqualTo(Long value) {
            addCriterion("message_id <>", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThan(Long value) {
            addCriterion("message_id >", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThanOrEqualTo(Long value) {
            addCriterion("message_id >=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThan(Long value) {
            addCriterion("message_id <", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThanOrEqualTo(Long value) {
            addCriterion("message_id <=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdIn(List<Long> values) {
            addCriterion("message_id in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotIn(List<Long> values) {
            addCriterion("message_id not in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdBetween(Long value1, Long value2) {
            addCriterion("message_id between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotBetween(Long value1, Long value2) {
            addCriterion("message_id not between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageBodyIsNull() {
            addCriterion("message_body is null");
            return (Criteria) this;
        }

        public Criteria andMessageBodyIsNotNull() {
            addCriterion("message_body is not null");
            return (Criteria) this;
        }

        public Criteria andMessageBodyEqualTo(String value) {
            addCriterion("message_body =", value, "messageBody");
            return (Criteria) this;
        }

        public Criteria andMessageBodyNotEqualTo(String value) {
            addCriterion("message_body <>", value, "messageBody");
            return (Criteria) this;
        }

        public Criteria andMessageBodyGreaterThan(String value) {
            addCriterion("message_body >", value, "messageBody");
            return (Criteria) this;
        }

        public Criteria andMessageBodyGreaterThanOrEqualTo(String value) {
            addCriterion("message_body >=", value, "messageBody");
            return (Criteria) this;
        }

        public Criteria andMessageBodyLessThan(String value) {
            addCriterion("message_body <", value, "messageBody");
            return (Criteria) this;
        }

        public Criteria andMessageBodyLessThanOrEqualTo(String value) {
            addCriterion("message_body <=", value, "messageBody");
            return (Criteria) this;
        }

        public Criteria andMessageBodyLike(String value) {
            addCriterion("message_body like", value, "messageBody");
            return (Criteria) this;
        }

        public Criteria andMessageBodyNotLike(String value) {
            addCriterion("message_body not like", value, "messageBody");
            return (Criteria) this;
        }

        public Criteria andMessageBodyIn(List<String> values) {
            addCriterion("message_body in", values, "messageBody");
            return (Criteria) this;
        }

        public Criteria andMessageBodyNotIn(List<String> values) {
            addCriterion("message_body not in", values, "messageBody");
            return (Criteria) this;
        }

        public Criteria andMessageBodyBetween(String value1, String value2) {
            addCriterion("message_body between", value1, value2, "messageBody");
            return (Criteria) this;
        }

        public Criteria andMessageBodyNotBetween(String value1, String value2) {
            addCriterion("message_body not between", value1, value2, "messageBody");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNull() {
            addCriterion("article_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNotNull() {
            addCriterion("article_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleIdEqualTo(Long value) {
            addCriterion("article_id =", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotEqualTo(Long value) {
            addCriterion("article_id <>", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThan(Long value) {
            addCriterion("article_id >", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("article_id >=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThan(Long value) {
            addCriterion("article_id <", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThanOrEqualTo(Long value) {
            addCriterion("article_id <=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIn(List<Long> values) {
            addCriterion("article_id in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotIn(List<Long> values) {
            addCriterion("article_id not in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdBetween(Long value1, Long value2) {
            addCriterion("article_id between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotBetween(Long value1, Long value2) {
            addCriterion("article_id not between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andMessageCtimeIsNull() {
            addCriterion("message_ctime is null");
            return (Criteria) this;
        }

        public Criteria andMessageCtimeIsNotNull() {
            addCriterion("message_ctime is not null");
            return (Criteria) this;
        }

        public Criteria andMessageCtimeEqualTo(Date value) {
            addCriterion("message_ctime =", value, "messageCtime");
            return (Criteria) this;
        }

        public Criteria andMessageCtimeNotEqualTo(Date value) {
            addCriterion("message_ctime <>", value, "messageCtime");
            return (Criteria) this;
        }

        public Criteria andMessageCtimeGreaterThan(Date value) {
            addCriterion("message_ctime >", value, "messageCtime");
            return (Criteria) this;
        }

        public Criteria andMessageCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("message_ctime >=", value, "messageCtime");
            return (Criteria) this;
        }

        public Criteria andMessageCtimeLessThan(Date value) {
            addCriterion("message_ctime <", value, "messageCtime");
            return (Criteria) this;
        }

        public Criteria andMessageCtimeLessThanOrEqualTo(Date value) {
            addCriterion("message_ctime <=", value, "messageCtime");
            return (Criteria) this;
        }

        public Criteria andMessageCtimeIn(List<Date> values) {
            addCriterion("message_ctime in", values, "messageCtime");
            return (Criteria) this;
        }

        public Criteria andMessageCtimeNotIn(List<Date> values) {
            addCriterion("message_ctime not in", values, "messageCtime");
            return (Criteria) this;
        }

        public Criteria andMessageCtimeBetween(Date value1, Date value2) {
            addCriterion("message_ctime between", value1, value2, "messageCtime");
            return (Criteria) this;
        }

        public Criteria andMessageCtimeNotBetween(Date value1, Date value2) {
            addCriterion("message_ctime not between", value1, value2, "messageCtime");
            return (Criteria) this;
        }

        public Criteria andMessageMtimeIsNull() {
            addCriterion("message_mtime is null");
            return (Criteria) this;
        }

        public Criteria andMessageMtimeIsNotNull() {
            addCriterion("message_mtime is not null");
            return (Criteria) this;
        }

        public Criteria andMessageMtimeEqualTo(Date value) {
            addCriterion("message_mtime =", value, "messageMtime");
            return (Criteria) this;
        }

        public Criteria andMessageMtimeNotEqualTo(Date value) {
            addCriterion("message_mtime <>", value, "messageMtime");
            return (Criteria) this;
        }

        public Criteria andMessageMtimeGreaterThan(Date value) {
            addCriterion("message_mtime >", value, "messageMtime");
            return (Criteria) this;
        }

        public Criteria andMessageMtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("message_mtime >=", value, "messageMtime");
            return (Criteria) this;
        }

        public Criteria andMessageMtimeLessThan(Date value) {
            addCriterion("message_mtime <", value, "messageMtime");
            return (Criteria) this;
        }

        public Criteria andMessageMtimeLessThanOrEqualTo(Date value) {
            addCriterion("message_mtime <=", value, "messageMtime");
            return (Criteria) this;
        }

        public Criteria andMessageMtimeIn(List<Date> values) {
            addCriterion("message_mtime in", values, "messageMtime");
            return (Criteria) this;
        }

        public Criteria andMessageMtimeNotIn(List<Date> values) {
            addCriterion("message_mtime not in", values, "messageMtime");
            return (Criteria) this;
        }

        public Criteria andMessageMtimeBetween(Date value1, Date value2) {
            addCriterion("message_mtime between", value1, value2, "messageMtime");
            return (Criteria) this;
        }

        public Criteria andMessageMtimeNotBetween(Date value1, Date value2) {
            addCriterion("message_mtime not between", value1, value2, "messageMtime");
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