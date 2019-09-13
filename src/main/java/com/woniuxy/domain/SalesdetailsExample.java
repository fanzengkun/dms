package com.woniuxy.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SalesdetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalesdetailsExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andSdidIsNull() {
            addCriterion("sdid is null");
            return (Criteria) this;
        }

        public Criteria andSdidIsNotNull() {
            addCriterion("sdid is not null");
            return (Criteria) this;
        }

        public Criteria andSdidEqualTo(Integer value) {
            addCriterion("sdid =", value, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidNotEqualTo(Integer value) {
            addCriterion("sdid <>", value, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidGreaterThan(Integer value) {
            addCriterion("sdid >", value, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sdid >=", value, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidLessThan(Integer value) {
            addCriterion("sdid <", value, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidLessThanOrEqualTo(Integer value) {
            addCriterion("sdid <=", value, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidIn(List<Integer> values) {
            addCriterion("sdid in", values, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidNotIn(List<Integer> values) {
            addCriterion("sdid not in", values, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidBetween(Integer value1, Integer value2) {
            addCriterion("sdid between", value1, value2, "sdid");
            return (Criteria) this;
        }

        public Criteria andSdidNotBetween(Integer value1, Integer value2) {
            addCriterion("sdid not between", value1, value2, "sdid");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andAidIsNull() {
            addCriterion("aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Integer value) {
            addCriterion("aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Integer value) {
            addCriterion("aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Integer value) {
            addCriterion("aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Integer value) {
            addCriterion("aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Integer value) {
            addCriterion("aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Integer> values) {
            addCriterion("aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Integer> values) {
            addCriterion("aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Integer value1, Integer value2) {
            addCriterion("aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Integer value1, Integer value2) {
            addCriterion("aid not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andSaletimeIsNull() {
            addCriterion("saleTime is null");
            return (Criteria) this;
        }

        public Criteria andSaletimeIsNotNull() {
            addCriterion("saleTime is not null");
            return (Criteria) this;
        }

        public Criteria andSaletimeEqualTo(Date value) {
            addCriterionForJDBCDate("saleTime =", value, "saletime");
            return (Criteria) this;
        }

        public Criteria andSaletimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("saleTime <>", value, "saletime");
            return (Criteria) this;
        }

        public Criteria andSaletimeGreaterThan(Date value) {
            addCriterionForJDBCDate("saleTime >", value, "saletime");
            return (Criteria) this;
        }

        public Criteria andSaletimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("saleTime >=", value, "saletime");
            return (Criteria) this;
        }

        public Criteria andSaletimeLessThan(Date value) {
            addCriterionForJDBCDate("saleTime <", value, "saletime");
            return (Criteria) this;
        }

        public Criteria andSaletimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("saleTime <=", value, "saletime");
            return (Criteria) this;
        }

        public Criteria andSaletimeIn(List<Date> values) {
            addCriterionForJDBCDate("saleTime in", values, "saletime");
            return (Criteria) this;
        }

        public Criteria andSaletimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("saleTime not in", values, "saletime");
            return (Criteria) this;
        }

        public Criteria andSaletimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("saleTime between", value1, value2, "saletime");
            return (Criteria) this;
        }

        public Criteria andSaletimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("saleTime not between", value1, value2, "saletime");
            return (Criteria) this;
        }

        public Criteria andTotalamountIsNull() {
            addCriterion("totalAmount is null");
            return (Criteria) this;
        }

        public Criteria andTotalamountIsNotNull() {
            addCriterion("totalAmount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalamountEqualTo(Double value) {
            addCriterion("totalAmount =", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotEqualTo(Double value) {
            addCriterion("totalAmount <>", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountGreaterThan(Double value) {
            addCriterion("totalAmount >", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountGreaterThanOrEqualTo(Double value) {
            addCriterion("totalAmount >=", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountLessThan(Double value) {
            addCriterion("totalAmount <", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountLessThanOrEqualTo(Double value) {
            addCriterion("totalAmount <=", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountIn(List<Double> values) {
            addCriterion("totalAmount in", values, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotIn(List<Double> values) {
            addCriterion("totalAmount not in", values, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountBetween(Double value1, Double value2) {
            addCriterion("totalAmount between", value1, value2, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotBetween(Double value1, Double value2) {
            addCriterion("totalAmount not between", value1, value2, "totalamount");
            return (Criteria) this;
        }

        public Criteria andSoidIsNull() {
            addCriterion("soid is null");
            return (Criteria) this;
        }

        public Criteria andSoidIsNotNull() {
            addCriterion("soid is not null");
            return (Criteria) this;
        }

        public Criteria andSoidEqualTo(Integer value) {
            addCriterion("soid =", value, "soid");
            return (Criteria) this;
        }

        public Criteria andSoidNotEqualTo(Integer value) {
            addCriterion("soid <>", value, "soid");
            return (Criteria) this;
        }

        public Criteria andSoidGreaterThan(Integer value) {
            addCriterion("soid >", value, "soid");
            return (Criteria) this;
        }

        public Criteria andSoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("soid >=", value, "soid");
            return (Criteria) this;
        }

        public Criteria andSoidLessThan(Integer value) {
            addCriterion("soid <", value, "soid");
            return (Criteria) this;
        }

        public Criteria andSoidLessThanOrEqualTo(Integer value) {
            addCriterion("soid <=", value, "soid");
            return (Criteria) this;
        }

        public Criteria andSoidIn(List<Integer> values) {
            addCriterion("soid in", values, "soid");
            return (Criteria) this;
        }

        public Criteria andSoidNotIn(List<Integer> values) {
            addCriterion("soid not in", values, "soid");
            return (Criteria) this;
        }

        public Criteria andSoidBetween(Integer value1, Integer value2) {
            addCriterion("soid between", value1, value2, "soid");
            return (Criteria) this;
        }

        public Criteria andSoidNotBetween(Integer value1, Integer value2) {
            addCriterion("soid not between", value1, value2, "soid");
            return (Criteria) this;
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