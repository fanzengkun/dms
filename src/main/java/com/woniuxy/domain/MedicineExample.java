package com.woniuxy.domain;

import java.util.ArrayList;
import java.util.List;

public class MedicineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MedicineExample() {
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

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Integer value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Integer value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Integer value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Integer value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Integer value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Integer> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Integer> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Integer value1, Integer value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Integer value1, Integer value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andMnameIsNull() {
            addCriterion("mname is null");
            return (Criteria) this;
        }

        public Criteria andMnameIsNotNull() {
            addCriterion("mname is not null");
            return (Criteria) this;
        }

        public Criteria andMnameEqualTo(String value) {
            addCriterion("mname =", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotEqualTo(String value) {
            addCriterion("mname <>", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThan(String value) {
            addCriterion("mname >", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThanOrEqualTo(String value) {
            addCriterion("mname >=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThan(String value) {
            addCriterion("mname <", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThanOrEqualTo(String value) {
            addCriterion("mname <=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLike(String value) {
            addCriterion("mname like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotLike(String value) {
            addCriterion("mname not like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameIn(List<String> values) {
            addCriterion("mname in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotIn(List<String> values) {
            addCriterion("mname not in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameBetween(String value1, String value2) {
            addCriterion("mname between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotBetween(String value1, String value2) {
            addCriterion("mname not between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andRestquantityIsNull() {
            addCriterion("restquantity is null");
            return (Criteria) this;
        }

        public Criteria andRestquantityIsNotNull() {
            addCriterion("restquantity is not null");
            return (Criteria) this;
        }

        public Criteria andRestquantityEqualTo(Integer value) {
            addCriterion("restquantity =", value, "restquantity");
            return (Criteria) this;
        }

        public Criteria andRestquantityNotEqualTo(Integer value) {
            addCriterion("restquantity <>", value, "restquantity");
            return (Criteria) this;
        }

        public Criteria andRestquantityGreaterThan(Integer value) {
            addCriterion("restquantity >", value, "restquantity");
            return (Criteria) this;
        }

        public Criteria andRestquantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("restquantity >=", value, "restquantity");
            return (Criteria) this;
        }

        public Criteria andRestquantityLessThan(Integer value) {
            addCriterion("restquantity <", value, "restquantity");
            return (Criteria) this;
        }

        public Criteria andRestquantityLessThanOrEqualTo(Integer value) {
            addCriterion("restquantity <=", value, "restquantity");
            return (Criteria) this;
        }

        public Criteria andRestquantityIn(List<Integer> values) {
            addCriterion("restquantity in", values, "restquantity");
            return (Criteria) this;
        }

        public Criteria andRestquantityNotIn(List<Integer> values) {
            addCriterion("restquantity not in", values, "restquantity");
            return (Criteria) this;
        }

        public Criteria andRestquantityBetween(Integer value1, Integer value2) {
            addCriterion("restquantity between", value1, value2, "restquantity");
            return (Criteria) this;
        }

        public Criteria andRestquantityNotBetween(Integer value1, Integer value2) {
            addCriterion("restquantity not between", value1, value2, "restquantity");
            return (Criteria) this;
        }

        public Criteria andDemandquantityIsNull() {
            addCriterion("demandQuantity is null");
            return (Criteria) this;
        }

        public Criteria andDemandquantityIsNotNull() {
            addCriterion("demandQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andDemandquantityEqualTo(Integer value) {
            addCriterion("demandQuantity =", value, "demandquantity");
            return (Criteria) this;
        }

        public Criteria andDemandquantityNotEqualTo(Integer value) {
            addCriterion("demandQuantity <>", value, "demandquantity");
            return (Criteria) this;
        }

        public Criteria andDemandquantityGreaterThan(Integer value) {
            addCriterion("demandQuantity >", value, "demandquantity");
            return (Criteria) this;
        }

        public Criteria andDemandquantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("demandQuantity >=", value, "demandquantity");
            return (Criteria) this;
        }

        public Criteria andDemandquantityLessThan(Integer value) {
            addCriterion("demandQuantity <", value, "demandquantity");
            return (Criteria) this;
        }

        public Criteria andDemandquantityLessThanOrEqualTo(Integer value) {
            addCriterion("demandQuantity <=", value, "demandquantity");
            return (Criteria) this;
        }

        public Criteria andDemandquantityIn(List<Integer> values) {
            addCriterion("demandQuantity in", values, "demandquantity");
            return (Criteria) this;
        }

        public Criteria andDemandquantityNotIn(List<Integer> values) {
            addCriterion("demandQuantity not in", values, "demandquantity");
            return (Criteria) this;
        }

        public Criteria andDemandquantityBetween(Integer value1, Integer value2) {
            addCriterion("demandQuantity between", value1, value2, "demandquantity");
            return (Criteria) this;
        }

        public Criteria andDemandquantityNotBetween(Integer value1, Integer value2) {
            addCriterion("demandQuantity not between", value1, value2, "demandquantity");
            return (Criteria) this;
        }

        public Criteria andMtidIsNull() {
            addCriterion("mtid is null");
            return (Criteria) this;
        }

        public Criteria andMtidIsNotNull() {
            addCriterion("mtid is not null");
            return (Criteria) this;
        }

        public Criteria andMtidEqualTo(Integer value) {
            addCriterion("mtid =", value, "mtid");
            return (Criteria) this;
        }

        public Criteria andMtidNotEqualTo(Integer value) {
            addCriterion("mtid <>", value, "mtid");
            return (Criteria) this;
        }

        public Criteria andMtidGreaterThan(Integer value) {
            addCriterion("mtid >", value, "mtid");
            return (Criteria) this;
        }

        public Criteria andMtidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mtid >=", value, "mtid");
            return (Criteria) this;
        }

        public Criteria andMtidLessThan(Integer value) {
            addCriterion("mtid <", value, "mtid");
            return (Criteria) this;
        }

        public Criteria andMtidLessThanOrEqualTo(Integer value) {
            addCriterion("mtid <=", value, "mtid");
            return (Criteria) this;
        }

        public Criteria andMtidIn(List<Integer> values) {
            addCriterion("mtid in", values, "mtid");
            return (Criteria) this;
        }

        public Criteria andMtidNotIn(List<Integer> values) {
            addCriterion("mtid not in", values, "mtid");
            return (Criteria) this;
        }

        public Criteria andMtidBetween(Integer value1, Integer value2) {
            addCriterion("mtid between", value1, value2, "mtid");
            return (Criteria) this;
        }

        public Criteria andMtidNotBetween(Integer value1, Integer value2) {
            addCriterion("mtid not between", value1, value2, "mtid");
            return (Criteria) this;
        }

        public Criteria andMdescribeIsNull() {
            addCriterion("mdescribe is null");
            return (Criteria) this;
        }

        public Criteria andMdescribeIsNotNull() {
            addCriterion("mdescribe is not null");
            return (Criteria) this;
        }

        public Criteria andMdescribeEqualTo(String value) {
            addCriterion("mdescribe =", value, "mdescribe");
            return (Criteria) this;
        }

        public Criteria andMdescribeNotEqualTo(String value) {
            addCriterion("mdescribe <>", value, "mdescribe");
            return (Criteria) this;
        }

        public Criteria andMdescribeGreaterThan(String value) {
            addCriterion("mdescribe >", value, "mdescribe");
            return (Criteria) this;
        }

        public Criteria andMdescribeGreaterThanOrEqualTo(String value) {
            addCriterion("mdescribe >=", value, "mdescribe");
            return (Criteria) this;
        }

        public Criteria andMdescribeLessThan(String value) {
            addCriterion("mdescribe <", value, "mdescribe");
            return (Criteria) this;
        }

        public Criteria andMdescribeLessThanOrEqualTo(String value) {
            addCriterion("mdescribe <=", value, "mdescribe");
            return (Criteria) this;
        }

        public Criteria andMdescribeLike(String value) {
            addCriterion("mdescribe like", value, "mdescribe");
            return (Criteria) this;
        }

        public Criteria andMdescribeNotLike(String value) {
            addCriterion("mdescribe not like", value, "mdescribe");
            return (Criteria) this;
        }

        public Criteria andMdescribeIn(List<String> values) {
            addCriterion("mdescribe in", values, "mdescribe");
            return (Criteria) this;
        }

        public Criteria andMdescribeNotIn(List<String> values) {
            addCriterion("mdescribe not in", values, "mdescribe");
            return (Criteria) this;
        }

        public Criteria andMdescribeBetween(String value1, String value2) {
            addCriterion("mdescribe between", value1, value2, "mdescribe");
            return (Criteria) this;
        }

        public Criteria andMdescribeNotBetween(String value1, String value2) {
            addCriterion("mdescribe not between", value1, value2, "mdescribe");
            return (Criteria) this;
        }

        public Criteria andMaddressIsNull() {
            addCriterion("maddress is null");
            return (Criteria) this;
        }

        public Criteria andMaddressIsNotNull() {
            addCriterion("maddress is not null");
            return (Criteria) this;
        }

        public Criteria andMaddressEqualTo(String value) {
            addCriterion("maddress =", value, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressNotEqualTo(String value) {
            addCriterion("maddress <>", value, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressGreaterThan(String value) {
            addCriterion("maddress >", value, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressGreaterThanOrEqualTo(String value) {
            addCriterion("maddress >=", value, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressLessThan(String value) {
            addCriterion("maddress <", value, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressLessThanOrEqualTo(String value) {
            addCriterion("maddress <=", value, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressLike(String value) {
            addCriterion("maddress like", value, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressNotLike(String value) {
            addCriterion("maddress not like", value, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressIn(List<String> values) {
            addCriterion("maddress in", values, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressNotIn(List<String> values) {
            addCriterion("maddress not in", values, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressBetween(String value1, String value2) {
            addCriterion("maddress between", value1, value2, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressNotBetween(String value1, String value2) {
            addCriterion("maddress not between", value1, value2, "maddress");
            return (Criteria) this;
        }

        public Criteria andCodingIsNull() {
            addCriterion("coding is null");
            return (Criteria) this;
        }

        public Criteria andCodingIsNotNull() {
            addCriterion("coding is not null");
            return (Criteria) this;
        }

        public Criteria andCodingEqualTo(String value) {
            addCriterion("coding =", value, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingNotEqualTo(String value) {
            addCriterion("coding <>", value, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingGreaterThan(String value) {
            addCriterion("coding >", value, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingGreaterThanOrEqualTo(String value) {
            addCriterion("coding >=", value, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingLessThan(String value) {
            addCriterion("coding <", value, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingLessThanOrEqualTo(String value) {
            addCriterion("coding <=", value, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingLike(String value) {
            addCriterion("coding like", value, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingNotLike(String value) {
            addCriterion("coding not like", value, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingIn(List<String> values) {
            addCriterion("coding in", values, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingNotIn(List<String> values) {
            addCriterion("coding not in", values, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingBetween(String value1, String value2) {
            addCriterion("coding between", value1, value2, "coding");
            return (Criteria) this;
        }

        public Criteria andCodingNotBetween(String value1, String value2) {
            addCriterion("coding not between", value1, value2, "coding");
            return (Criteria) this;
        }

        public Criteria andMpriceIsNull() {
            addCriterion("mprice is null");
            return (Criteria) this;
        }

        public Criteria andMpriceIsNotNull() {
            addCriterion("mprice is not null");
            return (Criteria) this;
        }

        public Criteria andMpriceEqualTo(Double value) {
            addCriterion("mprice =", value, "mprice");
            return (Criteria) this;
        }

        public Criteria andMpriceNotEqualTo(Double value) {
            addCriterion("mprice <>", value, "mprice");
            return (Criteria) this;
        }

        public Criteria andMpriceGreaterThan(Double value) {
            addCriterion("mprice >", value, "mprice");
            return (Criteria) this;
        }

        public Criteria andMpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("mprice >=", value, "mprice");
            return (Criteria) this;
        }

        public Criteria andMpriceLessThan(Double value) {
            addCriterion("mprice <", value, "mprice");
            return (Criteria) this;
        }

        public Criteria andMpriceLessThanOrEqualTo(Double value) {
            addCriterion("mprice <=", value, "mprice");
            return (Criteria) this;
        }

        public Criteria andMpriceIn(List<Double> values) {
            addCriterion("mprice in", values, "mprice");
            return (Criteria) this;
        }

        public Criteria andMpriceNotIn(List<Double> values) {
            addCriterion("mprice not in", values, "mprice");
            return (Criteria) this;
        }

        public Criteria andMpriceBetween(Double value1, Double value2) {
            addCriterion("mprice between", value1, value2, "mprice");
            return (Criteria) this;
        }

        public Criteria andMpriceNotBetween(Double value1, Double value2) {
            addCriterion("mprice not between", value1, value2, "mprice");
            return (Criteria) this;
        }

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
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