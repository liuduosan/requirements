package reqs.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RequirementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RequirementExample() {
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

        public Criteria andShortDescIsNull() {
            addCriterion("short_desc is null");
            return (Criteria) this;
        }

        public Criteria andShortDescIsNotNull() {
            addCriterion("short_desc is not null");
            return (Criteria) this;
        }

        public Criteria andShortDescEqualTo(String value) {
            addCriterion("short_desc =", value, "shortDesc");
            return (Criteria) this;
        }

        public Criteria andShortDescNotEqualTo(String value) {
            addCriterion("short_desc <>", value, "shortDesc");
            return (Criteria) this;
        }

        public Criteria andShortDescGreaterThan(String value) {
            addCriterion("short_desc >", value, "shortDesc");
            return (Criteria) this;
        }

        public Criteria andShortDescGreaterThanOrEqualTo(String value) {
            addCriterion("short_desc >=", value, "shortDesc");
            return (Criteria) this;
        }

        public Criteria andShortDescLessThan(String value) {
            addCriterion("short_desc <", value, "shortDesc");
            return (Criteria) this;
        }

        public Criteria andShortDescLessThanOrEqualTo(String value) {
            addCriterion("short_desc <=", value, "shortDesc");
            return (Criteria) this;
        }

        public Criteria andShortDescLike(String value) {
            addCriterion("short_desc like", value, "shortDesc");
            return (Criteria) this;
        }

        public Criteria andShortDescNotLike(String value) {
            addCriterion("short_desc not like", value, "shortDesc");
            return (Criteria) this;
        }

        public Criteria andShortDescIn(List<String> values) {
            addCriterion("short_desc in", values, "shortDesc");
            return (Criteria) this;
        }

        public Criteria andShortDescNotIn(List<String> values) {
            addCriterion("short_desc not in", values, "shortDesc");
            return (Criteria) this;
        }

        public Criteria andShortDescBetween(String value1, String value2) {
            addCriterion("short_desc between", value1, value2, "shortDesc");
            return (Criteria) this;
        }

        public Criteria andShortDescNotBetween(String value1, String value2) {
            addCriterion("short_desc not between", value1, value2, "shortDesc");
            return (Criteria) this;
        }

        public Criteria andDetailIsNull() {
            addCriterion("detail is null");
            return (Criteria) this;
        }

        public Criteria andDetailIsNotNull() {
            addCriterion("detail is not null");
            return (Criteria) this;
        }

        public Criteria andDetailEqualTo(String value) {
            addCriterion("detail =", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotEqualTo(String value) {
            addCriterion("detail <>", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThan(String value) {
            addCriterion("detail >", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThanOrEqualTo(String value) {
            addCriterion("detail >=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThan(String value) {
            addCriterion("detail <", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThanOrEqualTo(String value) {
            addCriterion("detail <=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLike(String value) {
            addCriterion("detail like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotLike(String value) {
            addCriterion("detail not like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailIn(List<String> values) {
            addCriterion("detail in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotIn(List<String> values) {
            addCriterion("detail not in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailBetween(String value1, String value2) {
            addCriterion("detail between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotBetween(String value1, String value2) {
            addCriterion("detail not between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeIsNull() {
            addCriterion("onlineTime is null");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeIsNotNull() {
            addCriterion("onlineTime is not null");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeEqualTo(String value) {
            addCriterion("onlineTime =", value, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeNotEqualTo(String value) {
            addCriterion("onlineTime <>", value, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeGreaterThan(String value) {
            addCriterion("onlineTime >", value, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeGreaterThanOrEqualTo(String value) {
            addCriterion("onlineTime >=", value, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeLessThan(String value) {
            addCriterion("onlineTime <", value, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeLessThanOrEqualTo(String value) {
            addCriterion("onlineTime <=", value, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeLike(String value) {
            addCriterion("onlineTime like", value, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeNotLike(String value) {
            addCriterion("onlineTime not like", value, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeIn(List<String> values) {
            addCriterion("onlineTime in", values, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeNotIn(List<String> values) {
            addCriterion("onlineTime not in", values, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeBetween(String value1, String value2) {
            addCriterion("onlineTime between", value1, value2, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeNotBetween(String value1, String value2) {
            addCriterion("onlineTime not between", value1, value2, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andImgIsNull() {
            addCriterion("img is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("img is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("img =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("img <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("img >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("img >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("img <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("img <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("img like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("img not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("img in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("img not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("img between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("img not between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andDeptIsNull() {
            addCriterion("dept is null");
            return (Criteria) this;
        }

        public Criteria andDeptIsNotNull() {
            addCriterion("dept is not null");
            return (Criteria) this;
        }

        public Criteria andDeptEqualTo(String value) {
            addCriterion("dept =", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotEqualTo(String value) {
            addCriterion("dept <>", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThan(String value) {
            addCriterion("dept >", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThanOrEqualTo(String value) {
            addCriterion("dept >=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThan(String value) {
            addCriterion("dept <", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThanOrEqualTo(String value) {
            addCriterion("dept <=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLike(String value) {
            addCriterion("dept like", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotLike(String value) {
            addCriterion("dept not like", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptIn(List<String> values) {
            addCriterion("dept in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotIn(List<String> values) {
            addCriterion("dept not in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptBetween(String value1, String value2) {
            addCriterion("dept between", value1, value2, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotBetween(String value1, String value2) {
            addCriterion("dept not between", value1, value2, "dept");
            return (Criteria) this;
        }

        public Criteria andPuterIsNull() {
            addCriterion("puter is null");
            return (Criteria) this;
        }

        public Criteria andPuterIsNotNull() {
            addCriterion("puter is not null");
            return (Criteria) this;
        }

        public Criteria andPuterEqualTo(String value) {
            addCriterion("puter =", value, "puter");
            return (Criteria) this;
        }

        public Criteria andPuterNotEqualTo(String value) {
            addCriterion("puter <>", value, "puter");
            return (Criteria) this;
        }

        public Criteria andPuterGreaterThan(String value) {
            addCriterion("puter >", value, "puter");
            return (Criteria) this;
        }

        public Criteria andPuterGreaterThanOrEqualTo(String value) {
            addCriterion("puter >=", value, "puter");
            return (Criteria) this;
        }

        public Criteria andPuterLessThan(String value) {
            addCriterion("puter <", value, "puter");
            return (Criteria) this;
        }

        public Criteria andPuterLessThanOrEqualTo(String value) {
            addCriterion("puter <=", value, "puter");
            return (Criteria) this;
        }

        public Criteria andPuterLike(String value) {
            addCriterion("puter like", value, "puter");
            return (Criteria) this;
        }

        public Criteria andPuterNotLike(String value) {
            addCriterion("puter not like", value, "puter");
            return (Criteria) this;
        }

        public Criteria andPuterIn(List<String> values) {
            addCriterion("puter in", values, "puter");
            return (Criteria) this;
        }

        public Criteria andPuterNotIn(List<String> values) {
            addCriterion("puter not in", values, "puter");
            return (Criteria) this;
        }

        public Criteria andPuterBetween(String value1, String value2) {
            addCriterion("puter between", value1, value2, "puter");
            return (Criteria) this;
        }

        public Criteria andPuterNotBetween(String value1, String value2) {
            addCriterion("puter not between", value1, value2, "puter");
            return (Criteria) this;
        }

        public Criteria andConnecttypeIsNull() {
            addCriterion("connectType is null");
            return (Criteria) this;
        }

        public Criteria andConnecttypeIsNotNull() {
            addCriterion("connectType is not null");
            return (Criteria) this;
        }

        public Criteria andConnecttypeEqualTo(String value) {
            addCriterion("connectType =", value, "connecttype");
            return (Criteria) this;
        }

        public Criteria andConnecttypeNotEqualTo(String value) {
            addCriterion("connectType <>", value, "connecttype");
            return (Criteria) this;
        }

        public Criteria andConnecttypeGreaterThan(String value) {
            addCriterion("connectType >", value, "connecttype");
            return (Criteria) this;
        }

        public Criteria andConnecttypeGreaterThanOrEqualTo(String value) {
            addCriterion("connectType >=", value, "connecttype");
            return (Criteria) this;
        }

        public Criteria andConnecttypeLessThan(String value) {
            addCriterion("connectType <", value, "connecttype");
            return (Criteria) this;
        }

        public Criteria andConnecttypeLessThanOrEqualTo(String value) {
            addCriterion("connectType <=", value, "connecttype");
            return (Criteria) this;
        }

        public Criteria andConnecttypeLike(String value) {
            addCriterion("connectType like", value, "connecttype");
            return (Criteria) this;
        }

        public Criteria andConnecttypeNotLike(String value) {
            addCriterion("connectType not like", value, "connecttype");
            return (Criteria) this;
        }

        public Criteria andConnecttypeIn(List<String> values) {
            addCriterion("connectType in", values, "connecttype");
            return (Criteria) this;
        }

        public Criteria andConnecttypeNotIn(List<String> values) {
            addCriterion("connectType not in", values, "connecttype");
            return (Criteria) this;
        }

        public Criteria andConnecttypeBetween(String value1, String value2) {
            addCriterion("connectType between", value1, value2, "connecttype");
            return (Criteria) this;
        }

        public Criteria andConnecttypeNotBetween(String value1, String value2) {
            addCriterion("connectType not between", value1, value2, "connecttype");
            return (Criteria) this;
        }

        public Criteria andConnecttypevalueIsNull() {
            addCriterion("connectTypeValue is null");
            return (Criteria) this;
        }

        public Criteria andConnecttypevalueIsNotNull() {
            addCriterion("connectTypeValue is not null");
            return (Criteria) this;
        }

        public Criteria andConnecttypevalueEqualTo(String value) {
            addCriterion("connectTypeValue =", value, "connecttypevalue");
            return (Criteria) this;
        }

        public Criteria andConnecttypevalueNotEqualTo(String value) {
            addCriterion("connectTypeValue <>", value, "connecttypevalue");
            return (Criteria) this;
        }

        public Criteria andConnecttypevalueGreaterThan(String value) {
            addCriterion("connectTypeValue >", value, "connecttypevalue");
            return (Criteria) this;
        }

        public Criteria andConnecttypevalueGreaterThanOrEqualTo(String value) {
            addCriterion("connectTypeValue >=", value, "connecttypevalue");
            return (Criteria) this;
        }

        public Criteria andConnecttypevalueLessThan(String value) {
            addCriterion("connectTypeValue <", value, "connecttypevalue");
            return (Criteria) this;
        }

        public Criteria andConnecttypevalueLessThanOrEqualTo(String value) {
            addCriterion("connectTypeValue <=", value, "connecttypevalue");
            return (Criteria) this;
        }

        public Criteria andConnecttypevalueLike(String value) {
            addCriterion("connectTypeValue like", value, "connecttypevalue");
            return (Criteria) this;
        }

        public Criteria andConnecttypevalueNotLike(String value) {
            addCriterion("connectTypeValue not like", value, "connecttypevalue");
            return (Criteria) this;
        }

        public Criteria andConnecttypevalueIn(List<String> values) {
            addCriterion("connectTypeValue in", values, "connecttypevalue");
            return (Criteria) this;
        }

        public Criteria andConnecttypevalueNotIn(List<String> values) {
            addCriterion("connectTypeValue not in", values, "connecttypevalue");
            return (Criteria) this;
        }

        public Criteria andConnecttypevalueBetween(String value1, String value2) {
            addCriterion("connectTypeValue between", value1, value2, "connecttypevalue");
            return (Criteria) this;
        }

        public Criteria andConnecttypevalueNotBetween(String value1, String value2) {
            addCriterion("connectTypeValue not between", value1, value2, "connecttypevalue");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("cTime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("cTime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Date value) {
            addCriterion("cTime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Date value) {
            addCriterion("cTime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Date value) {
            addCriterion("cTime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cTime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Date value) {
            addCriterion("cTime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Date value) {
            addCriterion("cTime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Date> values) {
            addCriterion("cTime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Date> values) {
            addCriterion("cTime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Date value1, Date value2) {
            addCriterion("cTime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Date value1, Date value2) {
            addCriterion("cTime not between", value1, value2, "ctime");
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