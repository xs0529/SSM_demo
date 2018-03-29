package com.xie.entity;

import java.util.ArrayList;
import java.util.List;

public class AdminEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminEntityExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAdminUsernameIsNull() {
            addCriterion("admin_username is null");
            return (Criteria) this;
        }

        public Criteria andAdminUsernameIsNotNull() {
            addCriterion("admin_username is not null");
            return (Criteria) this;
        }

        public Criteria andAdminUsernameEqualTo(String value) {
            addCriterion("admin_username =", value, "adminUsername");
            return (Criteria) this;
        }

        public Criteria andAdminUsernameNotEqualTo(String value) {
            addCriterion("admin_username <>", value, "adminUsername");
            return (Criteria) this;
        }

        public Criteria andAdminUsernameGreaterThan(String value) {
            addCriterion("admin_username >", value, "adminUsername");
            return (Criteria) this;
        }

        public Criteria andAdminUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_username >=", value, "adminUsername");
            return (Criteria) this;
        }

        public Criteria andAdminUsernameLessThan(String value) {
            addCriterion("admin_username <", value, "adminUsername");
            return (Criteria) this;
        }

        public Criteria andAdminUsernameLessThanOrEqualTo(String value) {
            addCriterion("admin_username <=", value, "adminUsername");
            return (Criteria) this;
        }

        public Criteria andAdminUsernameLike(String value) {
            addCriterion("admin_username like", value, "adminUsername");
            return (Criteria) this;
        }

        public Criteria andAdminUsernameNotLike(String value) {
            addCriterion("admin_username not like", value, "adminUsername");
            return (Criteria) this;
        }

        public Criteria andAdminUsernameIn(List<String> values) {
            addCriterion("admin_username in", values, "adminUsername");
            return (Criteria) this;
        }

        public Criteria andAdminUsernameNotIn(List<String> values) {
            addCriterion("admin_username not in", values, "adminUsername");
            return (Criteria) this;
        }

        public Criteria andAdminUsernameBetween(String value1, String value2) {
            addCriterion("admin_username between", value1, value2, "adminUsername");
            return (Criteria) this;
        }

        public Criteria andAdminUsernameNotBetween(String value1, String value2) {
            addCriterion("admin_username not between", value1, value2, "adminUsername");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIsNull() {
            addCriterion("admin_password is null");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIsNotNull() {
            addCriterion("admin_password is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordEqualTo(String value) {
            addCriterion("admin_password =", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotEqualTo(String value) {
            addCriterion("admin_password <>", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordGreaterThan(String value) {
            addCriterion("admin_password >", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("admin_password >=", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLessThan(String value) {
            addCriterion("admin_password <", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLessThanOrEqualTo(String value) {
            addCriterion("admin_password <=", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLike(String value) {
            addCriterion("admin_password like", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotLike(String value) {
            addCriterion("admin_password not like", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIn(List<String> values) {
            addCriterion("admin_password in", values, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotIn(List<String> values) {
            addCriterion("admin_password not in", values, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordBetween(String value1, String value2) {
            addCriterion("admin_password between", value1, value2, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotBetween(String value1, String value2) {
            addCriterion("admin_password not between", value1, value2, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNull() {
            addCriterion("admin_name is null");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNotNull() {
            addCriterion("admin_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNameEqualTo(String value) {
            addCriterion("admin_name =", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotEqualTo(String value) {
            addCriterion("admin_name <>", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThan(String value) {
            addCriterion("admin_name >", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_name >=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThan(String value) {
            addCriterion("admin_name <", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThanOrEqualTo(String value) {
            addCriterion("admin_name <=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLike(String value) {
            addCriterion("admin_name like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotLike(String value) {
            addCriterion("admin_name not like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameIn(List<String> values) {
            addCriterion("admin_name in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotIn(List<String> values) {
            addCriterion("admin_name not in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameBetween(String value1, String value2) {
            addCriterion("admin_name between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotBetween(String value1, String value2) {
            addCriterion("admin_name not between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminBodyIsNull() {
            addCriterion("admin_body is null");
            return (Criteria) this;
        }

        public Criteria andAdminBodyIsNotNull() {
            addCriterion("admin_body is not null");
            return (Criteria) this;
        }

        public Criteria andAdminBodyEqualTo(String value) {
            addCriterion("admin_body =", value, "adminBody");
            return (Criteria) this;
        }

        public Criteria andAdminBodyNotEqualTo(String value) {
            addCriterion("admin_body <>", value, "adminBody");
            return (Criteria) this;
        }

        public Criteria andAdminBodyGreaterThan(String value) {
            addCriterion("admin_body >", value, "adminBody");
            return (Criteria) this;
        }

        public Criteria andAdminBodyGreaterThanOrEqualTo(String value) {
            addCriterion("admin_body >=", value, "adminBody");
            return (Criteria) this;
        }

        public Criteria andAdminBodyLessThan(String value) {
            addCriterion("admin_body <", value, "adminBody");
            return (Criteria) this;
        }

        public Criteria andAdminBodyLessThanOrEqualTo(String value) {
            addCriterion("admin_body <=", value, "adminBody");
            return (Criteria) this;
        }

        public Criteria andAdminBodyLike(String value) {
            addCriterion("admin_body like", value, "adminBody");
            return (Criteria) this;
        }

        public Criteria andAdminBodyNotLike(String value) {
            addCriterion("admin_body not like", value, "adminBody");
            return (Criteria) this;
        }

        public Criteria andAdminBodyIn(List<String> values) {
            addCriterion("admin_body in", values, "adminBody");
            return (Criteria) this;
        }

        public Criteria andAdminBodyNotIn(List<String> values) {
            addCriterion("admin_body not in", values, "adminBody");
            return (Criteria) this;
        }

        public Criteria andAdminBodyBetween(String value1, String value2) {
            addCriterion("admin_body between", value1, value2, "adminBody");
            return (Criteria) this;
        }

        public Criteria andAdminBodyNotBetween(String value1, String value2) {
            addCriterion("admin_body not between", value1, value2, "adminBody");
            return (Criteria) this;
        }

        public Criteria andAdminImgIsNull() {
            addCriterion("admin_img is null");
            return (Criteria) this;
        }

        public Criteria andAdminImgIsNotNull() {
            addCriterion("admin_img is not null");
            return (Criteria) this;
        }

        public Criteria andAdminImgEqualTo(String value) {
            addCriterion("admin_img =", value, "adminImg");
            return (Criteria) this;
        }

        public Criteria andAdminImgNotEqualTo(String value) {
            addCriterion("admin_img <>", value, "adminImg");
            return (Criteria) this;
        }

        public Criteria andAdminImgGreaterThan(String value) {
            addCriterion("admin_img >", value, "adminImg");
            return (Criteria) this;
        }

        public Criteria andAdminImgGreaterThanOrEqualTo(String value) {
            addCriterion("admin_img >=", value, "adminImg");
            return (Criteria) this;
        }

        public Criteria andAdminImgLessThan(String value) {
            addCriterion("admin_img <", value, "adminImg");
            return (Criteria) this;
        }

        public Criteria andAdminImgLessThanOrEqualTo(String value) {
            addCriterion("admin_img <=", value, "adminImg");
            return (Criteria) this;
        }

        public Criteria andAdminImgLike(String value) {
            addCriterion("admin_img like", value, "adminImg");
            return (Criteria) this;
        }

        public Criteria andAdminImgNotLike(String value) {
            addCriterion("admin_img not like", value, "adminImg");
            return (Criteria) this;
        }

        public Criteria andAdminImgIn(List<String> values) {
            addCriterion("admin_img in", values, "adminImg");
            return (Criteria) this;
        }

        public Criteria andAdminImgNotIn(List<String> values) {
            addCriterion("admin_img not in", values, "adminImg");
            return (Criteria) this;
        }

        public Criteria andAdminImgBetween(String value1, String value2) {
            addCriterion("admin_img between", value1, value2, "adminImg");
            return (Criteria) this;
        }

        public Criteria andAdminImgNotBetween(String value1, String value2) {
            addCriterion("admin_img not between", value1, value2, "adminImg");
            return (Criteria) this;
        }

        public Criteria andAdminTextIsNull() {
            addCriterion("admin_text is null");
            return (Criteria) this;
        }

        public Criteria andAdminTextIsNotNull() {
            addCriterion("admin_text is not null");
            return (Criteria) this;
        }

        public Criteria andAdminTextEqualTo(String value) {
            addCriterion("admin_text =", value, "adminText");
            return (Criteria) this;
        }

        public Criteria andAdminTextNotEqualTo(String value) {
            addCriterion("admin_text <>", value, "adminText");
            return (Criteria) this;
        }

        public Criteria andAdminTextGreaterThan(String value) {
            addCriterion("admin_text >", value, "adminText");
            return (Criteria) this;
        }

        public Criteria andAdminTextGreaterThanOrEqualTo(String value) {
            addCriterion("admin_text >=", value, "adminText");
            return (Criteria) this;
        }

        public Criteria andAdminTextLessThan(String value) {
            addCriterion("admin_text <", value, "adminText");
            return (Criteria) this;
        }

        public Criteria andAdminTextLessThanOrEqualTo(String value) {
            addCriterion("admin_text <=", value, "adminText");
            return (Criteria) this;
        }

        public Criteria andAdminTextLike(String value) {
            addCriterion("admin_text like", value, "adminText");
            return (Criteria) this;
        }

        public Criteria andAdminTextNotLike(String value) {
            addCriterion("admin_text not like", value, "adminText");
            return (Criteria) this;
        }

        public Criteria andAdminTextIn(List<String> values) {
            addCriterion("admin_text in", values, "adminText");
            return (Criteria) this;
        }

        public Criteria andAdminTextNotIn(List<String> values) {
            addCriterion("admin_text not in", values, "adminText");
            return (Criteria) this;
        }

        public Criteria andAdminTextBetween(String value1, String value2) {
            addCriterion("admin_text between", value1, value2, "adminText");
            return (Criteria) this;
        }

        public Criteria andAdminTextNotBetween(String value1, String value2) {
            addCriterion("admin_text not between", value1, value2, "adminText");
            return (Criteria) this;
        }

        public Criteria andAdminNewsIsNull() {
            addCriterion("admin_news is null");
            return (Criteria) this;
        }

        public Criteria andAdminNewsIsNotNull() {
            addCriterion("admin_news is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNewsEqualTo(Integer value) {
            addCriterion("admin_news =", value, "adminNews");
            return (Criteria) this;
        }

        public Criteria andAdminNewsNotEqualTo(Integer value) {
            addCriterion("admin_news <>", value, "adminNews");
            return (Criteria) this;
        }

        public Criteria andAdminNewsGreaterThan(Integer value) {
            addCriterion("admin_news >", value, "adminNews");
            return (Criteria) this;
        }

        public Criteria andAdminNewsGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_news >=", value, "adminNews");
            return (Criteria) this;
        }

        public Criteria andAdminNewsLessThan(Integer value) {
            addCriterion("admin_news <", value, "adminNews");
            return (Criteria) this;
        }

        public Criteria andAdminNewsLessThanOrEqualTo(Integer value) {
            addCriterion("admin_news <=", value, "adminNews");
            return (Criteria) this;
        }

        public Criteria andAdminNewsIn(List<Integer> values) {
            addCriterion("admin_news in", values, "adminNews");
            return (Criteria) this;
        }

        public Criteria andAdminNewsNotIn(List<Integer> values) {
            addCriterion("admin_news not in", values, "adminNews");
            return (Criteria) this;
        }

        public Criteria andAdminNewsBetween(Integer value1, Integer value2) {
            addCriterion("admin_news between", value1, value2, "adminNews");
            return (Criteria) this;
        }

        public Criteria andAdminNewsNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_news not between", value1, value2, "adminNews");
            return (Criteria) this;
        }

        public Criteria andAdminNoticeIsNull() {
            addCriterion("admin_notice is null");
            return (Criteria) this;
        }

        public Criteria andAdminNoticeIsNotNull() {
            addCriterion("admin_notice is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNoticeEqualTo(Integer value) {
            addCriterion("admin_notice =", value, "adminNotice");
            return (Criteria) this;
        }

        public Criteria andAdminNoticeNotEqualTo(Integer value) {
            addCriterion("admin_notice <>", value, "adminNotice");
            return (Criteria) this;
        }

        public Criteria andAdminNoticeGreaterThan(Integer value) {
            addCriterion("admin_notice >", value, "adminNotice");
            return (Criteria) this;
        }

        public Criteria andAdminNoticeGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_notice >=", value, "adminNotice");
            return (Criteria) this;
        }

        public Criteria andAdminNoticeLessThan(Integer value) {
            addCriterion("admin_notice <", value, "adminNotice");
            return (Criteria) this;
        }

        public Criteria andAdminNoticeLessThanOrEqualTo(Integer value) {
            addCriterion("admin_notice <=", value, "adminNotice");
            return (Criteria) this;
        }

        public Criteria andAdminNoticeIn(List<Integer> values) {
            addCriterion("admin_notice in", values, "adminNotice");
            return (Criteria) this;
        }

        public Criteria andAdminNoticeNotIn(List<Integer> values) {
            addCriterion("admin_notice not in", values, "adminNotice");
            return (Criteria) this;
        }

        public Criteria andAdminNoticeBetween(Integer value1, Integer value2) {
            addCriterion("admin_notice between", value1, value2, "adminNotice");
            return (Criteria) this;
        }

        public Criteria andAdminNoticeNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_notice not between", value1, value2, "adminNotice");
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