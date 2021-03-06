package com.xie.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReplyEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReplyEntityExample() {
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

        public Criteria andReplyIdIsNull() {
            addCriterion("reply_id is null");
            return (Criteria) this;
        }

        public Criteria andReplyIdIsNotNull() {
            addCriterion("reply_id is not null");
            return (Criteria) this;
        }

        public Criteria andReplyIdEqualTo(Long value) {
            addCriterion("reply_id =", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotEqualTo(Long value) {
            addCriterion("reply_id <>", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdGreaterThan(Long value) {
            addCriterion("reply_id >", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("reply_id >=", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdLessThan(Long value) {
            addCriterion("reply_id <", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdLessThanOrEqualTo(Long value) {
            addCriterion("reply_id <=", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdIn(List<Long> values) {
            addCriterion("reply_id in", values, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotIn(List<Long> values) {
            addCriterion("reply_id not in", values, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdBetween(Long value1, Long value2) {
            addCriterion("reply_id between", value1, value2, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotBetween(Long value1, Long value2) {
            addCriterion("reply_id not between", value1, value2, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyBodyIsNull() {
            addCriterion("reply_body is null");
            return (Criteria) this;
        }

        public Criteria andReplyBodyIsNotNull() {
            addCriterion("reply_body is not null");
            return (Criteria) this;
        }

        public Criteria andReplyBodyEqualTo(String value) {
            addCriterion("reply_body =", value, "replyBody");
            return (Criteria) this;
        }

        public Criteria andReplyBodyNotEqualTo(String value) {
            addCriterion("reply_body <>", value, "replyBody");
            return (Criteria) this;
        }

        public Criteria andReplyBodyGreaterThan(String value) {
            addCriterion("reply_body >", value, "replyBody");
            return (Criteria) this;
        }

        public Criteria andReplyBodyGreaterThanOrEqualTo(String value) {
            addCriterion("reply_body >=", value, "replyBody");
            return (Criteria) this;
        }

        public Criteria andReplyBodyLessThan(String value) {
            addCriterion("reply_body <", value, "replyBody");
            return (Criteria) this;
        }

        public Criteria andReplyBodyLessThanOrEqualTo(String value) {
            addCriterion("reply_body <=", value, "replyBody");
            return (Criteria) this;
        }

        public Criteria andReplyBodyLike(String value) {
            addCriterion("reply_body like", value, "replyBody");
            return (Criteria) this;
        }

        public Criteria andReplyBodyNotLike(String value) {
            addCriterion("reply_body not like", value, "replyBody");
            return (Criteria) this;
        }

        public Criteria andReplyBodyIn(List<String> values) {
            addCriterion("reply_body in", values, "replyBody");
            return (Criteria) this;
        }

        public Criteria andReplyBodyNotIn(List<String> values) {
            addCriterion("reply_body not in", values, "replyBody");
            return (Criteria) this;
        }

        public Criteria andReplyBodyBetween(String value1, String value2) {
            addCriterion("reply_body between", value1, value2, "replyBody");
            return (Criteria) this;
        }

        public Criteria andReplyBodyNotBetween(String value1, String value2) {
            addCriterion("reply_body not between", value1, value2, "replyBody");
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

        public Criteria andReplyNameIsNull() {
            addCriterion("reply_name is null");
            return (Criteria) this;
        }

        public Criteria andReplyNameIsNotNull() {
            addCriterion("reply_name is not null");
            return (Criteria) this;
        }

        public Criteria andReplyNameEqualTo(String value) {
            addCriterion("reply_name =", value, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameNotEqualTo(String value) {
            addCriterion("reply_name <>", value, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameGreaterThan(String value) {
            addCriterion("reply_name >", value, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameGreaterThanOrEqualTo(String value) {
            addCriterion("reply_name >=", value, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameLessThan(String value) {
            addCriterion("reply_name <", value, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameLessThanOrEqualTo(String value) {
            addCriterion("reply_name <=", value, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameLike(String value) {
            addCriterion("reply_name like", value, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameNotLike(String value) {
            addCriterion("reply_name not like", value, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameIn(List<String> values) {
            addCriterion("reply_name in", values, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameNotIn(List<String> values) {
            addCriterion("reply_name not in", values, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameBetween(String value1, String value2) {
            addCriterion("reply_name between", value1, value2, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameNotBetween(String value1, String value2) {
            addCriterion("reply_name not between", value1, value2, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyCtimeIsNull() {
            addCriterion("reply_ctime is null");
            return (Criteria) this;
        }

        public Criteria andReplyCtimeIsNotNull() {
            addCriterion("reply_ctime is not null");
            return (Criteria) this;
        }

        public Criteria andReplyCtimeEqualTo(Date value) {
            addCriterion("reply_ctime =", value, "replyCtime");
            return (Criteria) this;
        }

        public Criteria andReplyCtimeNotEqualTo(Date value) {
            addCriterion("reply_ctime <>", value, "replyCtime");
            return (Criteria) this;
        }

        public Criteria andReplyCtimeGreaterThan(Date value) {
            addCriterion("reply_ctime >", value, "replyCtime");
            return (Criteria) this;
        }

        public Criteria andReplyCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reply_ctime >=", value, "replyCtime");
            return (Criteria) this;
        }

        public Criteria andReplyCtimeLessThan(Date value) {
            addCriterion("reply_ctime <", value, "replyCtime");
            return (Criteria) this;
        }

        public Criteria andReplyCtimeLessThanOrEqualTo(Date value) {
            addCriterion("reply_ctime <=", value, "replyCtime");
            return (Criteria) this;
        }

        public Criteria andReplyCtimeIn(List<Date> values) {
            addCriterion("reply_ctime in", values, "replyCtime");
            return (Criteria) this;
        }

        public Criteria andReplyCtimeNotIn(List<Date> values) {
            addCriterion("reply_ctime not in", values, "replyCtime");
            return (Criteria) this;
        }

        public Criteria andReplyCtimeBetween(Date value1, Date value2) {
            addCriterion("reply_ctime between", value1, value2, "replyCtime");
            return (Criteria) this;
        }

        public Criteria andReplyCtimeNotBetween(Date value1, Date value2) {
            addCriterion("reply_ctime not between", value1, value2, "replyCtime");
            return (Criteria) this;
        }

        public Criteria andReplyMtimeIsNull() {
            addCriterion("reply_mtime is null");
            return (Criteria) this;
        }

        public Criteria andReplyMtimeIsNotNull() {
            addCriterion("reply_mtime is not null");
            return (Criteria) this;
        }

        public Criteria andReplyMtimeEqualTo(Date value) {
            addCriterion("reply_mtime =", value, "replyMtime");
            return (Criteria) this;
        }

        public Criteria andReplyMtimeNotEqualTo(Date value) {
            addCriterion("reply_mtime <>", value, "replyMtime");
            return (Criteria) this;
        }

        public Criteria andReplyMtimeGreaterThan(Date value) {
            addCriterion("reply_mtime >", value, "replyMtime");
            return (Criteria) this;
        }

        public Criteria andReplyMtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reply_mtime >=", value, "replyMtime");
            return (Criteria) this;
        }

        public Criteria andReplyMtimeLessThan(Date value) {
            addCriterion("reply_mtime <", value, "replyMtime");
            return (Criteria) this;
        }

        public Criteria andReplyMtimeLessThanOrEqualTo(Date value) {
            addCriterion("reply_mtime <=", value, "replyMtime");
            return (Criteria) this;
        }

        public Criteria andReplyMtimeIn(List<Date> values) {
            addCriterion("reply_mtime in", values, "replyMtime");
            return (Criteria) this;
        }

        public Criteria andReplyMtimeNotIn(List<Date> values) {
            addCriterion("reply_mtime not in", values, "replyMtime");
            return (Criteria) this;
        }

        public Criteria andReplyMtimeBetween(Date value1, Date value2) {
            addCriterion("reply_mtime between", value1, value2, "replyMtime");
            return (Criteria) this;
        }

        public Criteria andReplyMtimeNotBetween(Date value1, Date value2) {
            addCriterion("reply_mtime not between", value1, value2, "replyMtime");
            return (Criteria) this;
        }

        public Criteria andReplyStatusIsNull() {
            addCriterion("reply_status is null");
            return (Criteria) this;
        }

        public Criteria andReplyStatusIsNotNull() {
            addCriterion("reply_status is not null");
            return (Criteria) this;
        }

        public Criteria andReplyStatusEqualTo(String value) {
            addCriterion("reply_status =", value, "replyStatus");
            return (Criteria) this;
        }

        public Criteria andReplyStatusNotEqualTo(String value) {
            addCriterion("reply_status <>", value, "replyStatus");
            return (Criteria) this;
        }

        public Criteria andReplyStatusGreaterThan(String value) {
            addCriterion("reply_status >", value, "replyStatus");
            return (Criteria) this;
        }

        public Criteria andReplyStatusGreaterThanOrEqualTo(String value) {
            addCriterion("reply_status >=", value, "replyStatus");
            return (Criteria) this;
        }

        public Criteria andReplyStatusLessThan(String value) {
            addCriterion("reply_status <", value, "replyStatus");
            return (Criteria) this;
        }

        public Criteria andReplyStatusLessThanOrEqualTo(String value) {
            addCriterion("reply_status <=", value, "replyStatus");
            return (Criteria) this;
        }

        public Criteria andReplyStatusLike(String value) {
            addCriterion("reply_status like", value, "replyStatus");
            return (Criteria) this;
        }

        public Criteria andReplyStatusNotLike(String value) {
            addCriterion("reply_status not like", value, "replyStatus");
            return (Criteria) this;
        }

        public Criteria andReplyStatusIn(List<String> values) {
            addCriterion("reply_status in", values, "replyStatus");
            return (Criteria) this;
        }

        public Criteria andReplyStatusNotIn(List<String> values) {
            addCriterion("reply_status not in", values, "replyStatus");
            return (Criteria) this;
        }

        public Criteria andReplyStatusBetween(String value1, String value2) {
            addCriterion("reply_status between", value1, value2, "replyStatus");
            return (Criteria) this;
        }

        public Criteria andReplyStatusNotBetween(String value1, String value2) {
            addCriterion("reply_status not between", value1, value2, "replyStatus");
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