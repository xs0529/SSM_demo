package com.xie.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleEntityExample() {
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

        public Criteria andArticleTitleIsNull() {
            addCriterion("article_title is null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIsNotNull() {
            addCriterion("article_title is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleEqualTo(String value) {
            addCriterion("article_title =", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotEqualTo(String value) {
            addCriterion("article_title <>", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThan(String value) {
            addCriterion("article_title >", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThanOrEqualTo(String value) {
            addCriterion("article_title >=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThan(String value) {
            addCriterion("article_title <", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThanOrEqualTo(String value) {
            addCriterion("article_title <=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLike(String value) {
            addCriterion("article_title like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotLike(String value) {
            addCriterion("article_title not like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIn(List<String> values) {
            addCriterion("article_title in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotIn(List<String> values) {
            addCriterion("article_title not in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleBetween(String value1, String value2) {
            addCriterion("article_title between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotBetween(String value1, String value2) {
            addCriterion("article_title not between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleStateIsNull() {
            addCriterion("article_state is null");
            return (Criteria) this;
        }

        public Criteria andArticleStateIsNotNull() {
            addCriterion("article_state is not null");
            return (Criteria) this;
        }

        public Criteria andArticleStateEqualTo(String value) {
            addCriterion("article_state =", value, "articleState");
            return (Criteria) this;
        }

        public Criteria andArticleStateNotEqualTo(String value) {
            addCriterion("article_state <>", value, "articleState");
            return (Criteria) this;
        }

        public Criteria andArticleStateGreaterThan(String value) {
            addCriterion("article_state >", value, "articleState");
            return (Criteria) this;
        }

        public Criteria andArticleStateGreaterThanOrEqualTo(String value) {
            addCriterion("article_state >=", value, "articleState");
            return (Criteria) this;
        }

        public Criteria andArticleStateLessThan(String value) {
            addCriterion("article_state <", value, "articleState");
            return (Criteria) this;
        }

        public Criteria andArticleStateLessThanOrEqualTo(String value) {
            addCriterion("article_state <=", value, "articleState");
            return (Criteria) this;
        }

        public Criteria andArticleStateLike(String value) {
            addCriterion("article_state like", value, "articleState");
            return (Criteria) this;
        }

        public Criteria andArticleStateNotLike(String value) {
            addCriterion("article_state not like", value, "articleState");
            return (Criteria) this;
        }

        public Criteria andArticleStateIn(List<String> values) {
            addCriterion("article_state in", values, "articleState");
            return (Criteria) this;
        }

        public Criteria andArticleStateNotIn(List<String> values) {
            addCriterion("article_state not in", values, "articleState");
            return (Criteria) this;
        }

        public Criteria andArticleStateBetween(String value1, String value2) {
            addCriterion("article_state between", value1, value2, "articleState");
            return (Criteria) this;
        }

        public Criteria andArticleStateNotBetween(String value1, String value2) {
            addCriterion("article_state not between", value1, value2, "articleState");
            return (Criteria) this;
        }

        public Criteria andArticleImageIsNull() {
            addCriterion("article_image is null");
            return (Criteria) this;
        }

        public Criteria andArticleImageIsNotNull() {
            addCriterion("article_image is not null");
            return (Criteria) this;
        }

        public Criteria andArticleImageEqualTo(String value) {
            addCriterion("article_image =", value, "articleImage");
            return (Criteria) this;
        }

        public Criteria andArticleImageNotEqualTo(String value) {
            addCriterion("article_image <>", value, "articleImage");
            return (Criteria) this;
        }

        public Criteria andArticleImageGreaterThan(String value) {
            addCriterion("article_image >", value, "articleImage");
            return (Criteria) this;
        }

        public Criteria andArticleImageGreaterThanOrEqualTo(String value) {
            addCriterion("article_image >=", value, "articleImage");
            return (Criteria) this;
        }

        public Criteria andArticleImageLessThan(String value) {
            addCriterion("article_image <", value, "articleImage");
            return (Criteria) this;
        }

        public Criteria andArticleImageLessThanOrEqualTo(String value) {
            addCriterion("article_image <=", value, "articleImage");
            return (Criteria) this;
        }

        public Criteria andArticleImageLike(String value) {
            addCriterion("article_image like", value, "articleImage");
            return (Criteria) this;
        }

        public Criteria andArticleImageNotLike(String value) {
            addCriterion("article_image not like", value, "articleImage");
            return (Criteria) this;
        }

        public Criteria andArticleImageIn(List<String> values) {
            addCriterion("article_image in", values, "articleImage");
            return (Criteria) this;
        }

        public Criteria andArticleImageNotIn(List<String> values) {
            addCriterion("article_image not in", values, "articleImage");
            return (Criteria) this;
        }

        public Criteria andArticleImageBetween(String value1, String value2) {
            addCriterion("article_image between", value1, value2, "articleImage");
            return (Criteria) this;
        }

        public Criteria andArticleImageNotBetween(String value1, String value2) {
            addCriterion("article_image not between", value1, value2, "articleImage");
            return (Criteria) this;
        }

        public Criteria andArticleReadingIsNull() {
            addCriterion("article_reading is null");
            return (Criteria) this;
        }

        public Criteria andArticleReadingIsNotNull() {
            addCriterion("article_reading is not null");
            return (Criteria) this;
        }

        public Criteria andArticleReadingEqualTo(Long value) {
            addCriterion("article_reading =", value, "articleReading");
            return (Criteria) this;
        }

        public Criteria andArticleReadingNotEqualTo(Long value) {
            addCriterion("article_reading <>", value, "articleReading");
            return (Criteria) this;
        }

        public Criteria andArticleReadingGreaterThan(Long value) {
            addCriterion("article_reading >", value, "articleReading");
            return (Criteria) this;
        }

        public Criteria andArticleReadingGreaterThanOrEqualTo(Long value) {
            addCriterion("article_reading >=", value, "articleReading");
            return (Criteria) this;
        }

        public Criteria andArticleReadingLessThan(Long value) {
            addCriterion("article_reading <", value, "articleReading");
            return (Criteria) this;
        }

        public Criteria andArticleReadingLessThanOrEqualTo(Long value) {
            addCriterion("article_reading <=", value, "articleReading");
            return (Criteria) this;
        }

        public Criteria andArticleReadingIn(List<Long> values) {
            addCriterion("article_reading in", values, "articleReading");
            return (Criteria) this;
        }

        public Criteria andArticleReadingNotIn(List<Long> values) {
            addCriterion("article_reading not in", values, "articleReading");
            return (Criteria) this;
        }

        public Criteria andArticleReadingBetween(Long value1, Long value2) {
            addCriterion("article_reading between", value1, value2, "articleReading");
            return (Criteria) this;
        }

        public Criteria andArticleReadingNotBetween(Long value1, Long value2) {
            addCriterion("article_reading not between", value1, value2, "articleReading");
            return (Criteria) this;
        }

        public Criteria andArticleTagIsNull() {
            addCriterion("article_tag is null");
            return (Criteria) this;
        }

        public Criteria andArticleTagIsNotNull() {
            addCriterion("article_tag is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTagEqualTo(String value) {
            addCriterion("article_tag =", value, "articleTag");
            return (Criteria) this;
        }

        public Criteria andArticleTagNotEqualTo(String value) {
            addCriterion("article_tag <>", value, "articleTag");
            return (Criteria) this;
        }

        public Criteria andArticleTagGreaterThan(String value) {
            addCriterion("article_tag >", value, "articleTag");
            return (Criteria) this;
        }

        public Criteria andArticleTagGreaterThanOrEqualTo(String value) {
            addCriterion("article_tag >=", value, "articleTag");
            return (Criteria) this;
        }

        public Criteria andArticleTagLessThan(String value) {
            addCriterion("article_tag <", value, "articleTag");
            return (Criteria) this;
        }

        public Criteria andArticleTagLessThanOrEqualTo(String value) {
            addCriterion("article_tag <=", value, "articleTag");
            return (Criteria) this;
        }

        public Criteria andArticleTagLike(String value) {
            addCriterion("article_tag like", value, "articleTag");
            return (Criteria) this;
        }

        public Criteria andArticleTagNotLike(String value) {
            addCriterion("article_tag not like", value, "articleTag");
            return (Criteria) this;
        }

        public Criteria andArticleTagIn(List<String> values) {
            addCriterion("article_tag in", values, "articleTag");
            return (Criteria) this;
        }

        public Criteria andArticleTagNotIn(List<String> values) {
            addCriterion("article_tag not in", values, "articleTag");
            return (Criteria) this;
        }

        public Criteria andArticleTagBetween(String value1, String value2) {
            addCriterion("article_tag between", value1, value2, "articleTag");
            return (Criteria) this;
        }

        public Criteria andArticleTagNotBetween(String value1, String value2) {
            addCriterion("article_tag not between", value1, value2, "articleTag");
            return (Criteria) this;
        }

        public Criteria andArticleCtimeIsNull() {
            addCriterion("article_ctime is null");
            return (Criteria) this;
        }

        public Criteria andArticleCtimeIsNotNull() {
            addCriterion("article_ctime is not null");
            return (Criteria) this;
        }

        public Criteria andArticleCtimeEqualTo(Date value) {
            addCriterion("article_ctime =", value, "articleCtime");
            return (Criteria) this;
        }

        public Criteria andArticleCtimeNotEqualTo(Date value) {
            addCriterion("article_ctime <>", value, "articleCtime");
            return (Criteria) this;
        }

        public Criteria andArticleCtimeGreaterThan(Date value) {
            addCriterion("article_ctime >", value, "articleCtime");
            return (Criteria) this;
        }

        public Criteria andArticleCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("article_ctime >=", value, "articleCtime");
            return (Criteria) this;
        }

        public Criteria andArticleCtimeLessThan(Date value) {
            addCriterion("article_ctime <", value, "articleCtime");
            return (Criteria) this;
        }

        public Criteria andArticleCtimeLessThanOrEqualTo(Date value) {
            addCriterion("article_ctime <=", value, "articleCtime");
            return (Criteria) this;
        }

        public Criteria andArticleCtimeIn(List<Date> values) {
            addCriterion("article_ctime in", values, "articleCtime");
            return (Criteria) this;
        }

        public Criteria andArticleCtimeNotIn(List<Date> values) {
            addCriterion("article_ctime not in", values, "articleCtime");
            return (Criteria) this;
        }

        public Criteria andArticleCtimeBetween(Date value1, Date value2) {
            addCriterion("article_ctime between", value1, value2, "articleCtime");
            return (Criteria) this;
        }

        public Criteria andArticleCtimeNotBetween(Date value1, Date value2) {
            addCriterion("article_ctime not between", value1, value2, "articleCtime");
            return (Criteria) this;
        }

        public Criteria andArticleMtimeIsNull() {
            addCriterion("article_mtime is null");
            return (Criteria) this;
        }

        public Criteria andArticleMtimeIsNotNull() {
            addCriterion("article_mtime is not null");
            return (Criteria) this;
        }

        public Criteria andArticleMtimeEqualTo(Date value) {
            addCriterion("article_mtime =", value, "articleMtime");
            return (Criteria) this;
        }

        public Criteria andArticleMtimeNotEqualTo(Date value) {
            addCriterion("article_mtime <>", value, "articleMtime");
            return (Criteria) this;
        }

        public Criteria andArticleMtimeGreaterThan(Date value) {
            addCriterion("article_mtime >", value, "articleMtime");
            return (Criteria) this;
        }

        public Criteria andArticleMtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("article_mtime >=", value, "articleMtime");
            return (Criteria) this;
        }

        public Criteria andArticleMtimeLessThan(Date value) {
            addCriterion("article_mtime <", value, "articleMtime");
            return (Criteria) this;
        }

        public Criteria andArticleMtimeLessThanOrEqualTo(Date value) {
            addCriterion("article_mtime <=", value, "articleMtime");
            return (Criteria) this;
        }

        public Criteria andArticleMtimeIn(List<Date> values) {
            addCriterion("article_mtime in", values, "articleMtime");
            return (Criteria) this;
        }

        public Criteria andArticleMtimeNotIn(List<Date> values) {
            addCriterion("article_mtime not in", values, "articleMtime");
            return (Criteria) this;
        }

        public Criteria andArticleMtimeBetween(Date value1, Date value2) {
            addCriterion("article_mtime between", value1, value2, "articleMtime");
            return (Criteria) this;
        }

        public Criteria andArticleMtimeNotBetween(Date value1, Date value2) {
            addCriterion("article_mtime not between", value1, value2, "articleMtime");
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