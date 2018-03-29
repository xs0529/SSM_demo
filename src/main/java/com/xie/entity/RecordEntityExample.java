package com.xie.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecordEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecordEntityExample() {
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

        public Criteria andRecordIdIsNull() {
            addCriterion("record_id is null");
            return (Criteria) this;
        }

        public Criteria andRecordIdIsNotNull() {
            addCriterion("record_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecordIdEqualTo(Long value) {
            addCriterion("record_id =", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotEqualTo(Long value) {
            addCriterion("record_id <>", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThan(Long value) {
            addCriterion("record_id >", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThanOrEqualTo(Long value) {
            addCriterion("record_id >=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThan(Long value) {
            addCriterion("record_id <", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThanOrEqualTo(Long value) {
            addCriterion("record_id <=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdIn(List<Long> values) {
            addCriterion("record_id in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotIn(List<Long> values) {
            addCriterion("record_id not in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdBetween(Long value1, Long value2) {
            addCriterion("record_id between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotBetween(Long value1, Long value2) {
            addCriterion("record_id not between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordTypeIsNull() {
            addCriterion("record_type is null");
            return (Criteria) this;
        }

        public Criteria andRecordTypeIsNotNull() {
            addCriterion("record_type is not null");
            return (Criteria) this;
        }

        public Criteria andRecordTypeEqualTo(String value) {
            addCriterion("record_type =", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeNotEqualTo(String value) {
            addCriterion("record_type <>", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeGreaterThan(String value) {
            addCriterion("record_type >", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeGreaterThanOrEqualTo(String value) {
            addCriterion("record_type >=", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeLessThan(String value) {
            addCriterion("record_type <", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeLessThanOrEqualTo(String value) {
            addCriterion("record_type <=", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeLike(String value) {
            addCriterion("record_type like", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeNotLike(String value) {
            addCriterion("record_type not like", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeIn(List<String> values) {
            addCriterion("record_type in", values, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeNotIn(List<String> values) {
            addCriterion("record_type not in", values, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeBetween(String value1, String value2) {
            addCriterion("record_type between", value1, value2, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeNotBetween(String value1, String value2) {
            addCriterion("record_type not between", value1, value2, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordBodyIsNull() {
            addCriterion("record_body is null");
            return (Criteria) this;
        }

        public Criteria andRecordBodyIsNotNull() {
            addCriterion("record_body is not null");
            return (Criteria) this;
        }

        public Criteria andRecordBodyEqualTo(String value) {
            addCriterion("record_body =", value, "recordBody");
            return (Criteria) this;
        }

        public Criteria andRecordBodyNotEqualTo(String value) {
            addCriterion("record_body <>", value, "recordBody");
            return (Criteria) this;
        }

        public Criteria andRecordBodyGreaterThan(String value) {
            addCriterion("record_body >", value, "recordBody");
            return (Criteria) this;
        }

        public Criteria andRecordBodyGreaterThanOrEqualTo(String value) {
            addCriterion("record_body >=", value, "recordBody");
            return (Criteria) this;
        }

        public Criteria andRecordBodyLessThan(String value) {
            addCriterion("record_body <", value, "recordBody");
            return (Criteria) this;
        }

        public Criteria andRecordBodyLessThanOrEqualTo(String value) {
            addCriterion("record_body <=", value, "recordBody");
            return (Criteria) this;
        }

        public Criteria andRecordBodyLike(String value) {
            addCriterion("record_body like", value, "recordBody");
            return (Criteria) this;
        }

        public Criteria andRecordBodyNotLike(String value) {
            addCriterion("record_body not like", value, "recordBody");
            return (Criteria) this;
        }

        public Criteria andRecordBodyIn(List<String> values) {
            addCriterion("record_body in", values, "recordBody");
            return (Criteria) this;
        }

        public Criteria andRecordBodyNotIn(List<String> values) {
            addCriterion("record_body not in", values, "recordBody");
            return (Criteria) this;
        }

        public Criteria andRecordBodyBetween(String value1, String value2) {
            addCriterion("record_body between", value1, value2, "recordBody");
            return (Criteria) this;
        }

        public Criteria andRecordBodyNotBetween(String value1, String value2) {
            addCriterion("record_body not between", value1, value2, "recordBody");
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

        public Criteria andUserIpIsNull() {
            addCriterion("user_ip is null");
            return (Criteria) this;
        }

        public Criteria andUserIpIsNotNull() {
            addCriterion("user_ip is not null");
            return (Criteria) this;
        }

        public Criteria andUserIpEqualTo(String value) {
            addCriterion("user_ip =", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpNotEqualTo(String value) {
            addCriterion("user_ip <>", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpGreaterThan(String value) {
            addCriterion("user_ip >", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpGreaterThanOrEqualTo(String value) {
            addCriterion("user_ip >=", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpLessThan(String value) {
            addCriterion("user_ip <", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpLessThanOrEqualTo(String value) {
            addCriterion("user_ip <=", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpLike(String value) {
            addCriterion("user_ip like", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpNotLike(String value) {
            addCriterion("user_ip not like", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpIn(List<String> values) {
            addCriterion("user_ip in", values, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpNotIn(List<String> values) {
            addCriterion("user_ip not in", values, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpBetween(String value1, String value2) {
            addCriterion("user_ip between", value1, value2, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpNotBetween(String value1, String value2) {
            addCriterion("user_ip not between", value1, value2, "userIp");
            return (Criteria) this;
        }

        public Criteria andRecordCtimeIsNull() {
            addCriterion("record_ctime is null");
            return (Criteria) this;
        }

        public Criteria andRecordCtimeIsNotNull() {
            addCriterion("record_ctime is not null");
            return (Criteria) this;
        }

        public Criteria andRecordCtimeEqualTo(Date value) {
            addCriterion("record_ctime =", value, "recordCtime");
            return (Criteria) this;
        }

        public Criteria andRecordCtimeNotEqualTo(Date value) {
            addCriterion("record_ctime <>", value, "recordCtime");
            return (Criteria) this;
        }

        public Criteria andRecordCtimeGreaterThan(Date value) {
            addCriterion("record_ctime >", value, "recordCtime");
            return (Criteria) this;
        }

        public Criteria andRecordCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("record_ctime >=", value, "recordCtime");
            return (Criteria) this;
        }

        public Criteria andRecordCtimeLessThan(Date value) {
            addCriterion("record_ctime <", value, "recordCtime");
            return (Criteria) this;
        }

        public Criteria andRecordCtimeLessThanOrEqualTo(Date value) {
            addCriterion("record_ctime <=", value, "recordCtime");
            return (Criteria) this;
        }

        public Criteria andRecordCtimeIn(List<Date> values) {
            addCriterion("record_ctime in", values, "recordCtime");
            return (Criteria) this;
        }

        public Criteria andRecordCtimeNotIn(List<Date> values) {
            addCriterion("record_ctime not in", values, "recordCtime");
            return (Criteria) this;
        }

        public Criteria andRecordCtimeBetween(Date value1, Date value2) {
            addCriterion("record_ctime between", value1, value2, "recordCtime");
            return (Criteria) this;
        }

        public Criteria andRecordCtimeNotBetween(Date value1, Date value2) {
            addCriterion("record_ctime not between", value1, value2, "recordCtime");
            return (Criteria) this;
        }

        public Criteria andRecordMtimeIsNull() {
            addCriterion("record_mtime is null");
            return (Criteria) this;
        }

        public Criteria andRecordMtimeIsNotNull() {
            addCriterion("record_mtime is not null");
            return (Criteria) this;
        }

        public Criteria andRecordMtimeEqualTo(Date value) {
            addCriterion("record_mtime =", value, "recordMtime");
            return (Criteria) this;
        }

        public Criteria andRecordMtimeNotEqualTo(Date value) {
            addCriterion("record_mtime <>", value, "recordMtime");
            return (Criteria) this;
        }

        public Criteria andRecordMtimeGreaterThan(Date value) {
            addCriterion("record_mtime >", value, "recordMtime");
            return (Criteria) this;
        }

        public Criteria andRecordMtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("record_mtime >=", value, "recordMtime");
            return (Criteria) this;
        }

        public Criteria andRecordMtimeLessThan(Date value) {
            addCriterion("record_mtime <", value, "recordMtime");
            return (Criteria) this;
        }

        public Criteria andRecordMtimeLessThanOrEqualTo(Date value) {
            addCriterion("record_mtime <=", value, "recordMtime");
            return (Criteria) this;
        }

        public Criteria andRecordMtimeIn(List<Date> values) {
            addCriterion("record_mtime in", values, "recordMtime");
            return (Criteria) this;
        }

        public Criteria andRecordMtimeNotIn(List<Date> values) {
            addCriterion("record_mtime not in", values, "recordMtime");
            return (Criteria) this;
        }

        public Criteria andRecordMtimeBetween(Date value1, Date value2) {
            addCriterion("record_mtime between", value1, value2, "recordMtime");
            return (Criteria) this;
        }

        public Criteria andRecordMtimeNotBetween(Date value1, Date value2) {
            addCriterion("record_mtime not between", value1, value2, "recordMtime");
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