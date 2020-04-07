package cn.zzs.mybatis.repository.dataobject;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SalesEngineeringOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalesEngineeringOrderExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderContractNoIsNull() {
            addCriterion("order_contract_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderContractNoIsNotNull() {
            addCriterion("order_contract_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderContractNoEqualTo(String value) {
            addCriterion("order_contract_no =", value, "orderContractNo");
            return (Criteria) this;
        }

        public Criteria andOrderContractNoNotEqualTo(String value) {
            addCriterion("order_contract_no <>", value, "orderContractNo");
            return (Criteria) this;
        }

        public Criteria andOrderContractNoGreaterThan(String value) {
            addCriterion("order_contract_no >", value, "orderContractNo");
            return (Criteria) this;
        }

        public Criteria andOrderContractNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_contract_no >=", value, "orderContractNo");
            return (Criteria) this;
        }

        public Criteria andOrderContractNoLessThan(String value) {
            addCriterion("order_contract_no <", value, "orderContractNo");
            return (Criteria) this;
        }

        public Criteria andOrderContractNoLessThanOrEqualTo(String value) {
            addCriterion("order_contract_no <=", value, "orderContractNo");
            return (Criteria) this;
        }

        public Criteria andOrderContractNoLike(String value) {
            addCriterion("order_contract_no like", value, "orderContractNo");
            return (Criteria) this;
        }

        public Criteria andOrderContractNoNotLike(String value) {
            addCriterion("order_contract_no not like", value, "orderContractNo");
            return (Criteria) this;
        }

        public Criteria andOrderContractNoIn(List<String> values) {
            addCriterion("order_contract_no in", values, "orderContractNo");
            return (Criteria) this;
        }

        public Criteria andOrderContractNoNotIn(List<String> values) {
            addCriterion("order_contract_no not in", values, "orderContractNo");
            return (Criteria) this;
        }

        public Criteria andOrderContractNoBetween(String value1, String value2) {
            addCriterion("order_contract_no between", value1, value2, "orderContractNo");
            return (Criteria) this;
        }

        public Criteria andOrderContractNoNotBetween(String value1, String value2) {
            addCriterion("order_contract_no not between", value1, value2, "orderContractNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("org_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("org_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(String value) {
            addCriterion("org_id =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(String value) {
            addCriterion("org_id <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(String value) {
            addCriterion("org_id >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("org_id >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(String value) {
            addCriterion("org_id <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(String value) {
            addCriterion("org_id <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLike(String value) {
            addCriterion("org_id like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotLike(String value) {
            addCriterion("org_id not like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<String> values) {
            addCriterion("org_id in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<String> values) {
            addCriterion("org_id not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(String value1, String value2) {
            addCriterion("org_id between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(String value1, String value2) {
            addCriterion("org_id not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrderCategoryIsNull() {
            addCriterion("order_category is null");
            return (Criteria) this;
        }

        public Criteria andOrderCategoryIsNotNull() {
            addCriterion("order_category is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCategoryEqualTo(String value) {
            addCriterion("order_category =", value, "orderCategory");
            return (Criteria) this;
        }

        public Criteria andOrderCategoryNotEqualTo(String value) {
            addCriterion("order_category <>", value, "orderCategory");
            return (Criteria) this;
        }

        public Criteria andOrderCategoryGreaterThan(String value) {
            addCriterion("order_category >", value, "orderCategory");
            return (Criteria) this;
        }

        public Criteria andOrderCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("order_category >=", value, "orderCategory");
            return (Criteria) this;
        }

        public Criteria andOrderCategoryLessThan(String value) {
            addCriterion("order_category <", value, "orderCategory");
            return (Criteria) this;
        }

        public Criteria andOrderCategoryLessThanOrEqualTo(String value) {
            addCriterion("order_category <=", value, "orderCategory");
            return (Criteria) this;
        }

        public Criteria andOrderCategoryLike(String value) {
            addCriterion("order_category like", value, "orderCategory");
            return (Criteria) this;
        }

        public Criteria andOrderCategoryNotLike(String value) {
            addCriterion("order_category not like", value, "orderCategory");
            return (Criteria) this;
        }

        public Criteria andOrderCategoryIn(List<String> values) {
            addCriterion("order_category in", values, "orderCategory");
            return (Criteria) this;
        }

        public Criteria andOrderCategoryNotIn(List<String> values) {
            addCriterion("order_category not in", values, "orderCategory");
            return (Criteria) this;
        }

        public Criteria andOrderCategoryBetween(String value1, String value2) {
            addCriterion("order_category between", value1, value2, "orderCategory");
            return (Criteria) this;
        }

        public Criteria andOrderCategoryNotBetween(String value1, String value2) {
            addCriterion("order_category not between", value1, value2, "orderCategory");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(String value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(String value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(String value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(String value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(String value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLike(String value) {
            addCriterion("order_type like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotLike(String value) {
            addCriterion("order_type not like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<String> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<String> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(String value1, String value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(String value1, String value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIsNull() {
            addCriterion("product_category is null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIsNotNull() {
            addCriterion("product_category is not null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryEqualTo(String value) {
            addCriterion("product_category =", value, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNotEqualTo(String value) {
            addCriterion("product_category <>", value, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryGreaterThan(String value) {
            addCriterion("product_category >", value, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("product_category >=", value, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryLessThan(String value) {
            addCriterion("product_category <", value, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryLessThanOrEqualTo(String value) {
            addCriterion("product_category <=", value, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryLike(String value) {
            addCriterion("product_category like", value, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNotLike(String value) {
            addCriterion("product_category not like", value, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIn(List<String> values) {
            addCriterion("product_category in", values, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNotIn(List<String> values) {
            addCriterion("product_category not in", values, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryBetween(String value1, String value2) {
            addCriterion("product_category between", value1, value2, "productCategory");
            return (Criteria) this;
        }

        public Criteria andProductCategoryNotBetween(String value1, String value2) {
            addCriterion("product_category not between", value1, value2, "productCategory");
            return (Criteria) this;
        }

        public Criteria andDesignSourceIsNull() {
            addCriterion("design_source is null");
            return (Criteria) this;
        }

        public Criteria andDesignSourceIsNotNull() {
            addCriterion("design_source is not null");
            return (Criteria) this;
        }

        public Criteria andDesignSourceEqualTo(String value) {
            addCriterion("design_source =", value, "designSource");
            return (Criteria) this;
        }

        public Criteria andDesignSourceNotEqualTo(String value) {
            addCriterion("design_source <>", value, "designSource");
            return (Criteria) this;
        }

        public Criteria andDesignSourceGreaterThan(String value) {
            addCriterion("design_source >", value, "designSource");
            return (Criteria) this;
        }

        public Criteria andDesignSourceGreaterThanOrEqualTo(String value) {
            addCriterion("design_source >=", value, "designSource");
            return (Criteria) this;
        }

        public Criteria andDesignSourceLessThan(String value) {
            addCriterion("design_source <", value, "designSource");
            return (Criteria) this;
        }

        public Criteria andDesignSourceLessThanOrEqualTo(String value) {
            addCriterion("design_source <=", value, "designSource");
            return (Criteria) this;
        }

        public Criteria andDesignSourceLike(String value) {
            addCriterion("design_source like", value, "designSource");
            return (Criteria) this;
        }

        public Criteria andDesignSourceNotLike(String value) {
            addCriterion("design_source not like", value, "designSource");
            return (Criteria) this;
        }

        public Criteria andDesignSourceIn(List<String> values) {
            addCriterion("design_source in", values, "designSource");
            return (Criteria) this;
        }

        public Criteria andDesignSourceNotIn(List<String> values) {
            addCriterion("design_source not in", values, "designSource");
            return (Criteria) this;
        }

        public Criteria andDesignSourceBetween(String value1, String value2) {
            addCriterion("design_source between", value1, value2, "designSource");
            return (Criteria) this;
        }

        public Criteria andDesignSourceNotBetween(String value1, String value2) {
            addCriterion("design_source not between", value1, value2, "designSource");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andFirstSyncDtIsNull() {
            addCriterion("first_sync_dt is null");
            return (Criteria) this;
        }

        public Criteria andFirstSyncDtIsNotNull() {
            addCriterion("first_sync_dt is not null");
            return (Criteria) this;
        }

        public Criteria andFirstSyncDtEqualTo(Date value) {
            addCriterion("first_sync_dt =", value, "firstSyncDt");
            return (Criteria) this;
        }

        public Criteria andFirstSyncDtNotEqualTo(Date value) {
            addCriterion("first_sync_dt <>", value, "firstSyncDt");
            return (Criteria) this;
        }

        public Criteria andFirstSyncDtGreaterThan(Date value) {
            addCriterion("first_sync_dt >", value, "firstSyncDt");
            return (Criteria) this;
        }

        public Criteria andFirstSyncDtGreaterThanOrEqualTo(Date value) {
            addCriterion("first_sync_dt >=", value, "firstSyncDt");
            return (Criteria) this;
        }

        public Criteria andFirstSyncDtLessThan(Date value) {
            addCriterion("first_sync_dt <", value, "firstSyncDt");
            return (Criteria) this;
        }

        public Criteria andFirstSyncDtLessThanOrEqualTo(Date value) {
            addCriterion("first_sync_dt <=", value, "firstSyncDt");
            return (Criteria) this;
        }

        public Criteria andFirstSyncDtIn(List<Date> values) {
            addCriterion("first_sync_dt in", values, "firstSyncDt");
            return (Criteria) this;
        }

        public Criteria andFirstSyncDtNotIn(List<Date> values) {
            addCriterion("first_sync_dt not in", values, "firstSyncDt");
            return (Criteria) this;
        }

        public Criteria andFirstSyncDtBetween(Date value1, Date value2) {
            addCriterion("first_sync_dt between", value1, value2, "firstSyncDt");
            return (Criteria) this;
        }

        public Criteria andFirstSyncDtNotBetween(Date value1, Date value2) {
            addCriterion("first_sync_dt not between", value1, value2, "firstSyncDt");
            return (Criteria) this;
        }

        public Criteria andFirstPrincipalIdIsNull() {
            addCriterion("first_principal_id is null");
            return (Criteria) this;
        }

        public Criteria andFirstPrincipalIdIsNotNull() {
            addCriterion("first_principal_id is not null");
            return (Criteria) this;
        }

        public Criteria andFirstPrincipalIdEqualTo(String value) {
            addCriterion("first_principal_id =", value, "firstPrincipalId");
            return (Criteria) this;
        }

        public Criteria andFirstPrincipalIdNotEqualTo(String value) {
            addCriterion("first_principal_id <>", value, "firstPrincipalId");
            return (Criteria) this;
        }

        public Criteria andFirstPrincipalIdGreaterThan(String value) {
            addCriterion("first_principal_id >", value, "firstPrincipalId");
            return (Criteria) this;
        }

        public Criteria andFirstPrincipalIdGreaterThanOrEqualTo(String value) {
            addCriterion("first_principal_id >=", value, "firstPrincipalId");
            return (Criteria) this;
        }

        public Criteria andFirstPrincipalIdLessThan(String value) {
            addCriterion("first_principal_id <", value, "firstPrincipalId");
            return (Criteria) this;
        }

        public Criteria andFirstPrincipalIdLessThanOrEqualTo(String value) {
            addCriterion("first_principal_id <=", value, "firstPrincipalId");
            return (Criteria) this;
        }

        public Criteria andFirstPrincipalIdLike(String value) {
            addCriterion("first_principal_id like", value, "firstPrincipalId");
            return (Criteria) this;
        }

        public Criteria andFirstPrincipalIdNotLike(String value) {
            addCriterion("first_principal_id not like", value, "firstPrincipalId");
            return (Criteria) this;
        }

        public Criteria andFirstPrincipalIdIn(List<String> values) {
            addCriterion("first_principal_id in", values, "firstPrincipalId");
            return (Criteria) this;
        }

        public Criteria andFirstPrincipalIdNotIn(List<String> values) {
            addCriterion("first_principal_id not in", values, "firstPrincipalId");
            return (Criteria) this;
        }

        public Criteria andFirstPrincipalIdBetween(String value1, String value2) {
            addCriterion("first_principal_id between", value1, value2, "firstPrincipalId");
            return (Criteria) this;
        }

        public Criteria andFirstPrincipalIdNotBetween(String value1, String value2) {
            addCriterion("first_principal_id not between", value1, value2, "firstPrincipalId");
            return (Criteria) this;
        }

        public Criteria andFirstPrincipalIsNull() {
            addCriterion("first_principal is null");
            return (Criteria) this;
        }

        public Criteria andFirstPrincipalIsNotNull() {
            addCriterion("first_principal is not null");
            return (Criteria) this;
        }

        public Criteria andFirstPrincipalEqualTo(String value) {
            addCriterion("first_principal =", value, "firstPrincipal");
            return (Criteria) this;
        }

        public Criteria andFirstPrincipalNotEqualTo(String value) {
            addCriterion("first_principal <>", value, "firstPrincipal");
            return (Criteria) this;
        }

        public Criteria andFirstPrincipalGreaterThan(String value) {
            addCriterion("first_principal >", value, "firstPrincipal");
            return (Criteria) this;
        }

        public Criteria andFirstPrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("first_principal >=", value, "firstPrincipal");
            return (Criteria) this;
        }

        public Criteria andFirstPrincipalLessThan(String value) {
            addCriterion("first_principal <", value, "firstPrincipal");
            return (Criteria) this;
        }

        public Criteria andFirstPrincipalLessThanOrEqualTo(String value) {
            addCriterion("first_principal <=", value, "firstPrincipal");
            return (Criteria) this;
        }

        public Criteria andFirstPrincipalLike(String value) {
            addCriterion("first_principal like", value, "firstPrincipal");
            return (Criteria) this;
        }

        public Criteria andFirstPrincipalNotLike(String value) {
            addCriterion("first_principal not like", value, "firstPrincipal");
            return (Criteria) this;
        }

        public Criteria andFirstPrincipalIn(List<String> values) {
            addCriterion("first_principal in", values, "firstPrincipal");
            return (Criteria) this;
        }

        public Criteria andFirstPrincipalNotIn(List<String> values) {
            addCriterion("first_principal not in", values, "firstPrincipal");
            return (Criteria) this;
        }

        public Criteria andFirstPrincipalBetween(String value1, String value2) {
            addCriterion("first_principal between", value1, value2, "firstPrincipal");
            return (Criteria) this;
        }

        public Criteria andFirstPrincipalNotBetween(String value1, String value2) {
            addCriterion("first_principal not between", value1, value2, "firstPrincipal");
            return (Criteria) this;
        }

        public Criteria andSyncDtIsNull() {
            addCriterion("sync_dt is null");
            return (Criteria) this;
        }

        public Criteria andSyncDtIsNotNull() {
            addCriterion("sync_dt is not null");
            return (Criteria) this;
        }

        public Criteria andSyncDtEqualTo(Date value) {
            addCriterion("sync_dt =", value, "syncDt");
            return (Criteria) this;
        }

        public Criteria andSyncDtNotEqualTo(Date value) {
            addCriterion("sync_dt <>", value, "syncDt");
            return (Criteria) this;
        }

        public Criteria andSyncDtGreaterThan(Date value) {
            addCriterion("sync_dt >", value, "syncDt");
            return (Criteria) this;
        }

        public Criteria andSyncDtGreaterThanOrEqualTo(Date value) {
            addCriterion("sync_dt >=", value, "syncDt");
            return (Criteria) this;
        }

        public Criteria andSyncDtLessThan(Date value) {
            addCriterion("sync_dt <", value, "syncDt");
            return (Criteria) this;
        }

        public Criteria andSyncDtLessThanOrEqualTo(Date value) {
            addCriterion("sync_dt <=", value, "syncDt");
            return (Criteria) this;
        }

        public Criteria andSyncDtIn(List<Date> values) {
            addCriterion("sync_dt in", values, "syncDt");
            return (Criteria) this;
        }

        public Criteria andSyncDtNotIn(List<Date> values) {
            addCriterion("sync_dt not in", values, "syncDt");
            return (Criteria) this;
        }

        public Criteria andSyncDtBetween(Date value1, Date value2) {
            addCriterion("sync_dt between", value1, value2, "syncDt");
            return (Criteria) this;
        }

        public Criteria andSyncDtNotBetween(Date value1, Date value2) {
            addCriterion("sync_dt not between", value1, value2, "syncDt");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNull() {
            addCriterion("principal is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNotNull() {
            addCriterion("principal is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalEqualTo(String value) {
            addCriterion("principal =", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotEqualTo(String value) {
            addCriterion("principal <>", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThan(String value) {
            addCriterion("principal >", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("principal >=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThan(String value) {
            addCriterion("principal <", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThanOrEqualTo(String value) {
            addCriterion("principal <=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLike(String value) {
            addCriterion("principal like", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotLike(String value) {
            addCriterion("principal not like", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalIn(List<String> values) {
            addCriterion("principal in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotIn(List<String> values) {
            addCriterion("principal not in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalBetween(String value1, String value2) {
            addCriterion("principal between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotBetween(String value1, String value2) {
            addCriterion("principal not between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalIdIsNull() {
            addCriterion("principal_id is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalIdIsNotNull() {
            addCriterion("principal_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalIdEqualTo(String value) {
            addCriterion("principal_id =", value, "principalId");
            return (Criteria) this;
        }

        public Criteria andPrincipalIdNotEqualTo(String value) {
            addCriterion("principal_id <>", value, "principalId");
            return (Criteria) this;
        }

        public Criteria andPrincipalIdGreaterThan(String value) {
            addCriterion("principal_id >", value, "principalId");
            return (Criteria) this;
        }

        public Criteria andPrincipalIdGreaterThanOrEqualTo(String value) {
            addCriterion("principal_id >=", value, "principalId");
            return (Criteria) this;
        }

        public Criteria andPrincipalIdLessThan(String value) {
            addCriterion("principal_id <", value, "principalId");
            return (Criteria) this;
        }

        public Criteria andPrincipalIdLessThanOrEqualTo(String value) {
            addCriterion("principal_id <=", value, "principalId");
            return (Criteria) this;
        }

        public Criteria andPrincipalIdLike(String value) {
            addCriterion("principal_id like", value, "principalId");
            return (Criteria) this;
        }

        public Criteria andPrincipalIdNotLike(String value) {
            addCriterion("principal_id not like", value, "principalId");
            return (Criteria) this;
        }

        public Criteria andPrincipalIdIn(List<String> values) {
            addCriterion("principal_id in", values, "principalId");
            return (Criteria) this;
        }

        public Criteria andPrincipalIdNotIn(List<String> values) {
            addCriterion("principal_id not in", values, "principalId");
            return (Criteria) this;
        }

        public Criteria andPrincipalIdBetween(String value1, String value2) {
            addCriterion("principal_id between", value1, value2, "principalId");
            return (Criteria) this;
        }

        public Criteria andPrincipalIdNotBetween(String value1, String value2) {
            addCriterion("principal_id not between", value1, value2, "principalId");
            return (Criteria) this;
        }

        public Criteria andSyncStatusIsNull() {
            addCriterion("sync_status is null");
            return (Criteria) this;
        }

        public Criteria andSyncStatusIsNotNull() {
            addCriterion("sync_status is not null");
            return (Criteria) this;
        }

        public Criteria andSyncStatusEqualTo(Boolean value) {
            addCriterion("sync_status =", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusNotEqualTo(Boolean value) {
            addCriterion("sync_status <>", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusGreaterThan(Boolean value) {
            addCriterion("sync_status >", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sync_status >=", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusLessThan(Boolean value) {
            addCriterion("sync_status <", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("sync_status <=", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusIn(List<Boolean> values) {
            addCriterion("sync_status in", values, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusNotIn(List<Boolean> values) {
            addCriterion("sync_status not in", values, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("sync_status between", value1, value2, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sync_status not between", value1, value2, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andExemptAuditIsNull() {
            addCriterion("exempt_audit is null");
            return (Criteria) this;
        }

        public Criteria andExemptAuditIsNotNull() {
            addCriterion("exempt_audit is not null");
            return (Criteria) this;
        }

        public Criteria andExemptAuditEqualTo(Boolean value) {
            addCriterion("exempt_audit =", value, "exemptAudit");
            return (Criteria) this;
        }

        public Criteria andExemptAuditNotEqualTo(Boolean value) {
            addCriterion("exempt_audit <>", value, "exemptAudit");
            return (Criteria) this;
        }

        public Criteria andExemptAuditGreaterThan(Boolean value) {
            addCriterion("exempt_audit >", value, "exemptAudit");
            return (Criteria) this;
        }

        public Criteria andExemptAuditGreaterThanOrEqualTo(Boolean value) {
            addCriterion("exempt_audit >=", value, "exemptAudit");
            return (Criteria) this;
        }

        public Criteria andExemptAuditLessThan(Boolean value) {
            addCriterion("exempt_audit <", value, "exemptAudit");
            return (Criteria) this;
        }

        public Criteria andExemptAuditLessThanOrEqualTo(Boolean value) {
            addCriterion("exempt_audit <=", value, "exemptAudit");
            return (Criteria) this;
        }

        public Criteria andExemptAuditIn(List<Boolean> values) {
            addCriterion("exempt_audit in", values, "exemptAudit");
            return (Criteria) this;
        }

        public Criteria andExemptAuditNotIn(List<Boolean> values) {
            addCriterion("exempt_audit not in", values, "exemptAudit");
            return (Criteria) this;
        }

        public Criteria andExemptAuditBetween(Boolean value1, Boolean value2) {
            addCriterion("exempt_audit between", value1, value2, "exemptAudit");
            return (Criteria) this;
        }

        public Criteria andExemptAuditNotBetween(Boolean value1, Boolean value2) {
            addCriterion("exempt_audit not between", value1, value2, "exemptAudit");
            return (Criteria) this;
        }

        public Criteria andRepeatOrderIsNull() {
            addCriterion("repeat_order is null");
            return (Criteria) this;
        }

        public Criteria andRepeatOrderIsNotNull() {
            addCriterion("repeat_order is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatOrderEqualTo(Boolean value) {
            addCriterion("repeat_order =", value, "repeatOrder");
            return (Criteria) this;
        }

        public Criteria andRepeatOrderNotEqualTo(Boolean value) {
            addCriterion("repeat_order <>", value, "repeatOrder");
            return (Criteria) this;
        }

        public Criteria andRepeatOrderGreaterThan(Boolean value) {
            addCriterion("repeat_order >", value, "repeatOrder");
            return (Criteria) this;
        }

        public Criteria andRepeatOrderGreaterThanOrEqualTo(Boolean value) {
            addCriterion("repeat_order >=", value, "repeatOrder");
            return (Criteria) this;
        }

        public Criteria andRepeatOrderLessThan(Boolean value) {
            addCriterion("repeat_order <", value, "repeatOrder");
            return (Criteria) this;
        }

        public Criteria andRepeatOrderLessThanOrEqualTo(Boolean value) {
            addCriterion("repeat_order <=", value, "repeatOrder");
            return (Criteria) this;
        }

        public Criteria andRepeatOrderIn(List<Boolean> values) {
            addCriterion("repeat_order in", values, "repeatOrder");
            return (Criteria) this;
        }

        public Criteria andRepeatOrderNotIn(List<Boolean> values) {
            addCriterion("repeat_order not in", values, "repeatOrder");
            return (Criteria) this;
        }

        public Criteria andRepeatOrderBetween(Boolean value1, Boolean value2) {
            addCriterion("repeat_order between", value1, value2, "repeatOrder");
            return (Criteria) this;
        }

        public Criteria andRepeatOrderNotBetween(Boolean value1, Boolean value2) {
            addCriterion("repeat_order not between", value1, value2, "repeatOrder");
            return (Criteria) this;
        }

        public Criteria andRepeatSyncIsNull() {
            addCriterion("repeat_sync is null");
            return (Criteria) this;
        }

        public Criteria andRepeatSyncIsNotNull() {
            addCriterion("repeat_sync is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatSyncEqualTo(Boolean value) {
            addCriterion("repeat_sync =", value, "repeatSync");
            return (Criteria) this;
        }

        public Criteria andRepeatSyncNotEqualTo(Boolean value) {
            addCriterion("repeat_sync <>", value, "repeatSync");
            return (Criteria) this;
        }

        public Criteria andRepeatSyncGreaterThan(Boolean value) {
            addCriterion("repeat_sync >", value, "repeatSync");
            return (Criteria) this;
        }

        public Criteria andRepeatSyncGreaterThanOrEqualTo(Boolean value) {
            addCriterion("repeat_sync >=", value, "repeatSync");
            return (Criteria) this;
        }

        public Criteria andRepeatSyncLessThan(Boolean value) {
            addCriterion("repeat_sync <", value, "repeatSync");
            return (Criteria) this;
        }

        public Criteria andRepeatSyncLessThanOrEqualTo(Boolean value) {
            addCriterion("repeat_sync <=", value, "repeatSync");
            return (Criteria) this;
        }

        public Criteria andRepeatSyncIn(List<Boolean> values) {
            addCriterion("repeat_sync in", values, "repeatSync");
            return (Criteria) this;
        }

        public Criteria andRepeatSyncNotIn(List<Boolean> values) {
            addCriterion("repeat_sync not in", values, "repeatSync");
            return (Criteria) this;
        }

        public Criteria andRepeatSyncBetween(Boolean value1, Boolean value2) {
            addCriterion("repeat_sync between", value1, value2, "repeatSync");
            return (Criteria) this;
        }

        public Criteria andRepeatSyncNotBetween(Boolean value1, Boolean value2) {
            addCriterion("repeat_sync not between", value1, value2, "repeatSync");
            return (Criteria) this;
        }

        public Criteria andIsGroupIsNull() {
            addCriterion("is_group is null");
            return (Criteria) this;
        }

        public Criteria andIsGroupIsNotNull() {
            addCriterion("is_group is not null");
            return (Criteria) this;
        }

        public Criteria andIsGroupEqualTo(Boolean value) {
            addCriterion("is_group =", value, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupNotEqualTo(Boolean value) {
            addCriterion("is_group <>", value, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupGreaterThan(Boolean value) {
            addCriterion("is_group >", value, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_group >=", value, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupLessThan(Boolean value) {
            addCriterion("is_group <", value, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupLessThanOrEqualTo(Boolean value) {
            addCriterion("is_group <=", value, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupIn(List<Boolean> values) {
            addCriterion("is_group in", values, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupNotIn(List<Boolean> values) {
            addCriterion("is_group not in", values, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupBetween(Boolean value1, Boolean value2) {
            addCriterion("is_group between", value1, value2, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_group not between", value1, value2, "isGroup");
            return (Criteria) this;
        }

        public Criteria andHideIsNull() {
            addCriterion("hide is null");
            return (Criteria) this;
        }

        public Criteria andHideIsNotNull() {
            addCriterion("hide is not null");
            return (Criteria) this;
        }

        public Criteria andHideEqualTo(Boolean value) {
            addCriterion("hide =", value, "hide");
            return (Criteria) this;
        }

        public Criteria andHideNotEqualTo(Boolean value) {
            addCriterion("hide <>", value, "hide");
            return (Criteria) this;
        }

        public Criteria andHideGreaterThan(Boolean value) {
            addCriterion("hide >", value, "hide");
            return (Criteria) this;
        }

        public Criteria andHideGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hide >=", value, "hide");
            return (Criteria) this;
        }

        public Criteria andHideLessThan(Boolean value) {
            addCriterion("hide <", value, "hide");
            return (Criteria) this;
        }

        public Criteria andHideLessThanOrEqualTo(Boolean value) {
            addCriterion("hide <=", value, "hide");
            return (Criteria) this;
        }

        public Criteria andHideIn(List<Boolean> values) {
            addCriterion("hide in", values, "hide");
            return (Criteria) this;
        }

        public Criteria andHideNotIn(List<Boolean> values) {
            addCriterion("hide not in", values, "hide");
            return (Criteria) this;
        }

        public Criteria andHideBetween(Boolean value1, Boolean value2) {
            addCriterion("hide between", value1, value2, "hide");
            return (Criteria) this;
        }

        public Criteria andHideNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hide not between", value1, value2, "hide");
            return (Criteria) this;
        }

        public Criteria andOldIsNull() {
            addCriterion("old is null");
            return (Criteria) this;
        }

        public Criteria andOldIsNotNull() {
            addCriterion("old is not null");
            return (Criteria) this;
        }

        public Criteria andOldEqualTo(Boolean value) {
            addCriterion("old =", value, "old");
            return (Criteria) this;
        }

        public Criteria andOldNotEqualTo(Boolean value) {
            addCriterion("old <>", value, "old");
            return (Criteria) this;
        }

        public Criteria andOldGreaterThan(Boolean value) {
            addCriterion("old >", value, "old");
            return (Criteria) this;
        }

        public Criteria andOldGreaterThanOrEqualTo(Boolean value) {
            addCriterion("old >=", value, "old");
            return (Criteria) this;
        }

        public Criteria andOldLessThan(Boolean value) {
            addCriterion("old <", value, "old");
            return (Criteria) this;
        }

        public Criteria andOldLessThanOrEqualTo(Boolean value) {
            addCriterion("old <=", value, "old");
            return (Criteria) this;
        }

        public Criteria andOldIn(List<Boolean> values) {
            addCriterion("old in", values, "old");
            return (Criteria) this;
        }

        public Criteria andOldNotIn(List<Boolean> values) {
            addCriterion("old not in", values, "old");
            return (Criteria) this;
        }

        public Criteria andOldBetween(Boolean value1, Boolean value2) {
            addCriterion("old between", value1, value2, "old");
            return (Criteria) this;
        }

        public Criteria andOldNotBetween(Boolean value1, Boolean value2) {
            addCriterion("old not between", value1, value2, "old");
            return (Criteria) this;
        }

        public Criteria andDecideFirstIsNull() {
            addCriterion("decide_first is null");
            return (Criteria) this;
        }

        public Criteria andDecideFirstIsNotNull() {
            addCriterion("decide_first is not null");
            return (Criteria) this;
        }

        public Criteria andDecideFirstEqualTo(Boolean value) {
            addCriterion("decide_first =", value, "decideFirst");
            return (Criteria) this;
        }

        public Criteria andDecideFirstNotEqualTo(Boolean value) {
            addCriterion("decide_first <>", value, "decideFirst");
            return (Criteria) this;
        }

        public Criteria andDecideFirstGreaterThan(Boolean value) {
            addCriterion("decide_first >", value, "decideFirst");
            return (Criteria) this;
        }

        public Criteria andDecideFirstGreaterThanOrEqualTo(Boolean value) {
            addCriterion("decide_first >=", value, "decideFirst");
            return (Criteria) this;
        }

        public Criteria andDecideFirstLessThan(Boolean value) {
            addCriterion("decide_first <", value, "decideFirst");
            return (Criteria) this;
        }

        public Criteria andDecideFirstLessThanOrEqualTo(Boolean value) {
            addCriterion("decide_first <=", value, "decideFirst");
            return (Criteria) this;
        }

        public Criteria andDecideFirstIn(List<Boolean> values) {
            addCriterion("decide_first in", values, "decideFirst");
            return (Criteria) this;
        }

        public Criteria andDecideFirstNotIn(List<Boolean> values) {
            addCriterion("decide_first not in", values, "decideFirst");
            return (Criteria) this;
        }

        public Criteria andDecideFirstBetween(Boolean value1, Boolean value2) {
            addCriterion("decide_first between", value1, value2, "decideFirst");
            return (Criteria) this;
        }

        public Criteria andDecideFirstNotBetween(Boolean value1, Boolean value2) {
            addCriterion("decide_first not between", value1, value2, "decideFirst");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Boolean value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Boolean> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Boolean> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andFranchiserCodeIsNull() {
            addCriterion("franchiser_code is null");
            return (Criteria) this;
        }

        public Criteria andFranchiserCodeIsNotNull() {
            addCriterion("franchiser_code is not null");
            return (Criteria) this;
        }

        public Criteria andFranchiserCodeEqualTo(String value) {
            addCriterion("franchiser_code =", value, "franchiserCode");
            return (Criteria) this;
        }

        public Criteria andFranchiserCodeNotEqualTo(String value) {
            addCriterion("franchiser_code <>", value, "franchiserCode");
            return (Criteria) this;
        }

        public Criteria andFranchiserCodeGreaterThan(String value) {
            addCriterion("franchiser_code >", value, "franchiserCode");
            return (Criteria) this;
        }

        public Criteria andFranchiserCodeGreaterThanOrEqualTo(String value) {
            addCriterion("franchiser_code >=", value, "franchiserCode");
            return (Criteria) this;
        }

        public Criteria andFranchiserCodeLessThan(String value) {
            addCriterion("franchiser_code <", value, "franchiserCode");
            return (Criteria) this;
        }

        public Criteria andFranchiserCodeLessThanOrEqualTo(String value) {
            addCriterion("franchiser_code <=", value, "franchiserCode");
            return (Criteria) this;
        }

        public Criteria andFranchiserCodeLike(String value) {
            addCriterion("franchiser_code like", value, "franchiserCode");
            return (Criteria) this;
        }

        public Criteria andFranchiserCodeNotLike(String value) {
            addCriterion("franchiser_code not like", value, "franchiserCode");
            return (Criteria) this;
        }

        public Criteria andFranchiserCodeIn(List<String> values) {
            addCriterion("franchiser_code in", values, "franchiserCode");
            return (Criteria) this;
        }

        public Criteria andFranchiserCodeNotIn(List<String> values) {
            addCriterion("franchiser_code not in", values, "franchiserCode");
            return (Criteria) this;
        }

        public Criteria andFranchiserCodeBetween(String value1, String value2) {
            addCriterion("franchiser_code between", value1, value2, "franchiserCode");
            return (Criteria) this;
        }

        public Criteria andFranchiserCodeNotBetween(String value1, String value2) {
            addCriterion("franchiser_code not between", value1, value2, "franchiserCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeIsNull() {
            addCriterion("shop_code is null");
            return (Criteria) this;
        }

        public Criteria andShopCodeIsNotNull() {
            addCriterion("shop_code is not null");
            return (Criteria) this;
        }

        public Criteria andShopCodeEqualTo(String value) {
            addCriterion("shop_code =", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeNotEqualTo(String value) {
            addCriterion("shop_code <>", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeGreaterThan(String value) {
            addCriterion("shop_code >", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeGreaterThanOrEqualTo(String value) {
            addCriterion("shop_code >=", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeLessThan(String value) {
            addCriterion("shop_code <", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeLessThanOrEqualTo(String value) {
            addCriterion("shop_code <=", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeLike(String value) {
            addCriterion("shop_code like", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeNotLike(String value) {
            addCriterion("shop_code not like", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeIn(List<String> values) {
            addCriterion("shop_code in", values, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeNotIn(List<String> values) {
            addCriterion("shop_code not in", values, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeBetween(String value1, String value2) {
            addCriterion("shop_code between", value1, value2, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeNotBetween(String value1, String value2) {
            addCriterion("shop_code not between", value1, value2, "shopCode");
            return (Criteria) this;
        }

        public Criteria andExpectDeliveryDtIsNull() {
            addCriterion("expect_delivery_dt is null");
            return (Criteria) this;
        }

        public Criteria andExpectDeliveryDtIsNotNull() {
            addCriterion("expect_delivery_dt is not null");
            return (Criteria) this;
        }

        public Criteria andExpectDeliveryDtEqualTo(Date value) {
            addCriterion("expect_delivery_dt =", value, "expectDeliveryDt");
            return (Criteria) this;
        }

        public Criteria andExpectDeliveryDtNotEqualTo(Date value) {
            addCriterion("expect_delivery_dt <>", value, "expectDeliveryDt");
            return (Criteria) this;
        }

        public Criteria andExpectDeliveryDtGreaterThan(Date value) {
            addCriterion("expect_delivery_dt >", value, "expectDeliveryDt");
            return (Criteria) this;
        }

        public Criteria andExpectDeliveryDtGreaterThanOrEqualTo(Date value) {
            addCriterion("expect_delivery_dt >=", value, "expectDeliveryDt");
            return (Criteria) this;
        }

        public Criteria andExpectDeliveryDtLessThan(Date value) {
            addCriterion("expect_delivery_dt <", value, "expectDeliveryDt");
            return (Criteria) this;
        }

        public Criteria andExpectDeliveryDtLessThanOrEqualTo(Date value) {
            addCriterion("expect_delivery_dt <=", value, "expectDeliveryDt");
            return (Criteria) this;
        }

        public Criteria andExpectDeliveryDtIn(List<Date> values) {
            addCriterion("expect_delivery_dt in", values, "expectDeliveryDt");
            return (Criteria) this;
        }

        public Criteria andExpectDeliveryDtNotIn(List<Date> values) {
            addCriterion("expect_delivery_dt not in", values, "expectDeliveryDt");
            return (Criteria) this;
        }

        public Criteria andExpectDeliveryDtBetween(Date value1, Date value2) {
            addCriterion("expect_delivery_dt between", value1, value2, "expectDeliveryDt");
            return (Criteria) this;
        }

        public Criteria andExpectDeliveryDtNotBetween(Date value1, Date value2) {
            addCriterion("expect_delivery_dt not between", value1, value2, "expectDeliveryDt");
            return (Criteria) this;
        }

        public Criteria andPlanDeliveryDtIsNull() {
            addCriterion("plan_delivery_dt is null");
            return (Criteria) this;
        }

        public Criteria andPlanDeliveryDtIsNotNull() {
            addCriterion("plan_delivery_dt is not null");
            return (Criteria) this;
        }

        public Criteria andPlanDeliveryDtEqualTo(Date value) {
            addCriterion("plan_delivery_dt =", value, "planDeliveryDt");
            return (Criteria) this;
        }

        public Criteria andPlanDeliveryDtNotEqualTo(Date value) {
            addCriterion("plan_delivery_dt <>", value, "planDeliveryDt");
            return (Criteria) this;
        }

        public Criteria andPlanDeliveryDtGreaterThan(Date value) {
            addCriterion("plan_delivery_dt >", value, "planDeliveryDt");
            return (Criteria) this;
        }

        public Criteria andPlanDeliveryDtGreaterThanOrEqualTo(Date value) {
            addCriterion("plan_delivery_dt >=", value, "planDeliveryDt");
            return (Criteria) this;
        }

        public Criteria andPlanDeliveryDtLessThan(Date value) {
            addCriterion("plan_delivery_dt <", value, "planDeliveryDt");
            return (Criteria) this;
        }

        public Criteria andPlanDeliveryDtLessThanOrEqualTo(Date value) {
            addCriterion("plan_delivery_dt <=", value, "planDeliveryDt");
            return (Criteria) this;
        }

        public Criteria andPlanDeliveryDtIn(List<Date> values) {
            addCriterion("plan_delivery_dt in", values, "planDeliveryDt");
            return (Criteria) this;
        }

        public Criteria andPlanDeliveryDtNotIn(List<Date> values) {
            addCriterion("plan_delivery_dt not in", values, "planDeliveryDt");
            return (Criteria) this;
        }

        public Criteria andPlanDeliveryDtBetween(Date value1, Date value2) {
            addCriterion("plan_delivery_dt between", value1, value2, "planDeliveryDt");
            return (Criteria) this;
        }

        public Criteria andPlanDeliveryDtNotBetween(Date value1, Date value2) {
            addCriterion("plan_delivery_dt not between", value1, value2, "planDeliveryDt");
            return (Criteria) this;
        }

        public Criteria andBasinInstallModeIsNull() {
            addCriterion("basin_install_mode is null");
            return (Criteria) this;
        }

        public Criteria andBasinInstallModeIsNotNull() {
            addCriterion("basin_install_mode is not null");
            return (Criteria) this;
        }

        public Criteria andBasinInstallModeEqualTo(String value) {
            addCriterion("basin_install_mode =", value, "basinInstallMode");
            return (Criteria) this;
        }

        public Criteria andBasinInstallModeNotEqualTo(String value) {
            addCriterion("basin_install_mode <>", value, "basinInstallMode");
            return (Criteria) this;
        }

        public Criteria andBasinInstallModeGreaterThan(String value) {
            addCriterion("basin_install_mode >", value, "basinInstallMode");
            return (Criteria) this;
        }

        public Criteria andBasinInstallModeGreaterThanOrEqualTo(String value) {
            addCriterion("basin_install_mode >=", value, "basinInstallMode");
            return (Criteria) this;
        }

        public Criteria andBasinInstallModeLessThan(String value) {
            addCriterion("basin_install_mode <", value, "basinInstallMode");
            return (Criteria) this;
        }

        public Criteria andBasinInstallModeLessThanOrEqualTo(String value) {
            addCriterion("basin_install_mode <=", value, "basinInstallMode");
            return (Criteria) this;
        }

        public Criteria andBasinInstallModeLike(String value) {
            addCriterion("basin_install_mode like", value, "basinInstallMode");
            return (Criteria) this;
        }

        public Criteria andBasinInstallModeNotLike(String value) {
            addCriterion("basin_install_mode not like", value, "basinInstallMode");
            return (Criteria) this;
        }

        public Criteria andBasinInstallModeIn(List<String> values) {
            addCriterion("basin_install_mode in", values, "basinInstallMode");
            return (Criteria) this;
        }

        public Criteria andBasinInstallModeNotIn(List<String> values) {
            addCriterion("basin_install_mode not in", values, "basinInstallMode");
            return (Criteria) this;
        }

        public Criteria andBasinInstallModeBetween(String value1, String value2) {
            addCriterion("basin_install_mode between", value1, value2, "basinInstallMode");
            return (Criteria) this;
        }

        public Criteria andBasinInstallModeNotBetween(String value1, String value2) {
            addCriterion("basin_install_mode not between", value1, value2, "basinInstallMode");
            return (Criteria) this;
        }

        public Criteria andDesignerIsNull() {
            addCriterion("designer is null");
            return (Criteria) this;
        }

        public Criteria andDesignerIsNotNull() {
            addCriterion("designer is not null");
            return (Criteria) this;
        }

        public Criteria andDesignerEqualTo(String value) {
            addCriterion("designer =", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerNotEqualTo(String value) {
            addCriterion("designer <>", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerGreaterThan(String value) {
            addCriterion("designer >", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerGreaterThanOrEqualTo(String value) {
            addCriterion("designer >=", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerLessThan(String value) {
            addCriterion("designer <", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerLessThanOrEqualTo(String value) {
            addCriterion("designer <=", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerLike(String value) {
            addCriterion("designer like", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerNotLike(String value) {
            addCriterion("designer not like", value, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerIn(List<String> values) {
            addCriterion("designer in", values, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerNotIn(List<String> values) {
            addCriterion("designer not in", values, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerBetween(String value1, String value2) {
            addCriterion("designer between", value1, value2, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerNotBetween(String value1, String value2) {
            addCriterion("designer not between", value1, value2, "designer");
            return (Criteria) this;
        }

        public Criteria andDesignerIdIsNull() {
            addCriterion("designer_id is null");
            return (Criteria) this;
        }

        public Criteria andDesignerIdIsNotNull() {
            addCriterion("designer_id is not null");
            return (Criteria) this;
        }

        public Criteria andDesignerIdEqualTo(String value) {
            addCriterion("designer_id =", value, "designerId");
            return (Criteria) this;
        }

        public Criteria andDesignerIdNotEqualTo(String value) {
            addCriterion("designer_id <>", value, "designerId");
            return (Criteria) this;
        }

        public Criteria andDesignerIdGreaterThan(String value) {
            addCriterion("designer_id >", value, "designerId");
            return (Criteria) this;
        }

        public Criteria andDesignerIdGreaterThanOrEqualTo(String value) {
            addCriterion("designer_id >=", value, "designerId");
            return (Criteria) this;
        }

        public Criteria andDesignerIdLessThan(String value) {
            addCriterion("designer_id <", value, "designerId");
            return (Criteria) this;
        }

        public Criteria andDesignerIdLessThanOrEqualTo(String value) {
            addCriterion("designer_id <=", value, "designerId");
            return (Criteria) this;
        }

        public Criteria andDesignerIdLike(String value) {
            addCriterion("designer_id like", value, "designerId");
            return (Criteria) this;
        }

        public Criteria andDesignerIdNotLike(String value) {
            addCriterion("designer_id not like", value, "designerId");
            return (Criteria) this;
        }

        public Criteria andDesignerIdIn(List<String> values) {
            addCriterion("designer_id in", values, "designerId");
            return (Criteria) this;
        }

        public Criteria andDesignerIdNotIn(List<String> values) {
            addCriterion("designer_id not in", values, "designerId");
            return (Criteria) this;
        }

        public Criteria andDesignerIdBetween(String value1, String value2) {
            addCriterion("designer_id between", value1, value2, "designerId");
            return (Criteria) this;
        }

        public Criteria andDesignerIdNotBetween(String value1, String value2) {
            addCriterion("designer_id not between", value1, value2, "designerId");
            return (Criteria) this;
        }

        public Criteria andDesignerTelIsNull() {
            addCriterion("designer_tel is null");
            return (Criteria) this;
        }

        public Criteria andDesignerTelIsNotNull() {
            addCriterion("designer_tel is not null");
            return (Criteria) this;
        }

        public Criteria andDesignerTelEqualTo(String value) {
            addCriterion("designer_tel =", value, "designerTel");
            return (Criteria) this;
        }

        public Criteria andDesignerTelNotEqualTo(String value) {
            addCriterion("designer_tel <>", value, "designerTel");
            return (Criteria) this;
        }

        public Criteria andDesignerTelGreaterThan(String value) {
            addCriterion("designer_tel >", value, "designerTel");
            return (Criteria) this;
        }

        public Criteria andDesignerTelGreaterThanOrEqualTo(String value) {
            addCriterion("designer_tel >=", value, "designerTel");
            return (Criteria) this;
        }

        public Criteria andDesignerTelLessThan(String value) {
            addCriterion("designer_tel <", value, "designerTel");
            return (Criteria) this;
        }

        public Criteria andDesignerTelLessThanOrEqualTo(String value) {
            addCriterion("designer_tel <=", value, "designerTel");
            return (Criteria) this;
        }

        public Criteria andDesignerTelLike(String value) {
            addCriterion("designer_tel like", value, "designerTel");
            return (Criteria) this;
        }

        public Criteria andDesignerTelNotLike(String value) {
            addCriterion("designer_tel not like", value, "designerTel");
            return (Criteria) this;
        }

        public Criteria andDesignerTelIn(List<String> values) {
            addCriterion("designer_tel in", values, "designerTel");
            return (Criteria) this;
        }

        public Criteria andDesignerTelNotIn(List<String> values) {
            addCriterion("designer_tel not in", values, "designerTel");
            return (Criteria) this;
        }

        public Criteria andDesignerTelBetween(String value1, String value2) {
            addCriterion("designer_tel between", value1, value2, "designerTel");
            return (Criteria) this;
        }

        public Criteria andDesignerTelNotBetween(String value1, String value2) {
            addCriterion("designer_tel not between", value1, value2, "designerTel");
            return (Criteria) this;
        }

        public Criteria andProductRequirementIsNull() {
            addCriterion("product_requirement is null");
            return (Criteria) this;
        }

        public Criteria andProductRequirementIsNotNull() {
            addCriterion("product_requirement is not null");
            return (Criteria) this;
        }

        public Criteria andProductRequirementEqualTo(String value) {
            addCriterion("product_requirement =", value, "productRequirement");
            return (Criteria) this;
        }

        public Criteria andProductRequirementNotEqualTo(String value) {
            addCriterion("product_requirement <>", value, "productRequirement");
            return (Criteria) this;
        }

        public Criteria andProductRequirementGreaterThan(String value) {
            addCriterion("product_requirement >", value, "productRequirement");
            return (Criteria) this;
        }

        public Criteria andProductRequirementGreaterThanOrEqualTo(String value) {
            addCriterion("product_requirement >=", value, "productRequirement");
            return (Criteria) this;
        }

        public Criteria andProductRequirementLessThan(String value) {
            addCriterion("product_requirement <", value, "productRequirement");
            return (Criteria) this;
        }

        public Criteria andProductRequirementLessThanOrEqualTo(String value) {
            addCriterion("product_requirement <=", value, "productRequirement");
            return (Criteria) this;
        }

        public Criteria andProductRequirementLike(String value) {
            addCriterion("product_requirement like", value, "productRequirement");
            return (Criteria) this;
        }

        public Criteria andProductRequirementNotLike(String value) {
            addCriterion("product_requirement not like", value, "productRequirement");
            return (Criteria) this;
        }

        public Criteria andProductRequirementIn(List<String> values) {
            addCriterion("product_requirement in", values, "productRequirement");
            return (Criteria) this;
        }

        public Criteria andProductRequirementNotIn(List<String> values) {
            addCriterion("product_requirement not in", values, "productRequirement");
            return (Criteria) this;
        }

        public Criteria andProductRequirementBetween(String value1, String value2) {
            addCriterion("product_requirement between", value1, value2, "productRequirement");
            return (Criteria) this;
        }

        public Criteria andProductRequirementNotBetween(String value1, String value2) {
            addCriterion("product_requirement not between", value1, value2, "productRequirement");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIsNull() {
            addCriterion("activity_type is null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIsNotNull() {
            addCriterion("activity_type is not null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeEqualTo(String value) {
            addCriterion("activity_type =", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotEqualTo(String value) {
            addCriterion("activity_type <>", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeGreaterThan(String value) {
            addCriterion("activity_type >", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("activity_type >=", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeLessThan(String value) {
            addCriterion("activity_type <", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeLessThanOrEqualTo(String value) {
            addCriterion("activity_type <=", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeLike(String value) {
            addCriterion("activity_type like", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotLike(String value) {
            addCriterion("activity_type not like", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIn(List<String> values) {
            addCriterion("activity_type in", values, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotIn(List<String> values) {
            addCriterion("activity_type not in", values, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeBetween(String value1, String value2) {
            addCriterion("activity_type between", value1, value2, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotBetween(String value1, String value2) {
            addCriterion("activity_type not between", value1, value2, "activityType");
            return (Criteria) this;
        }

        public Criteria andReceiverIdIsNull() {
            addCriterion("receiver_id is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIdIsNotNull() {
            addCriterion("receiver_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverIdEqualTo(String value) {
            addCriterion("receiver_id =", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdNotEqualTo(String value) {
            addCriterion("receiver_id <>", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdGreaterThan(String value) {
            addCriterion("receiver_id >", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_id >=", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdLessThan(String value) {
            addCriterion("receiver_id <", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdLessThanOrEqualTo(String value) {
            addCriterion("receiver_id <=", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdLike(String value) {
            addCriterion("receiver_id like", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdNotLike(String value) {
            addCriterion("receiver_id not like", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdIn(List<String> values) {
            addCriterion("receiver_id in", values, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdNotIn(List<String> values) {
            addCriterion("receiver_id not in", values, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdBetween(String value1, String value2) {
            addCriterion("receiver_id between", value1, value2, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdNotBetween(String value1, String value2) {
            addCriterion("receiver_id not between", value1, value2, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNull() {
            addCriterion("receiver is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNotNull() {
            addCriterion("receiver is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverEqualTo(String value) {
            addCriterion("receiver =", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotEqualTo(String value) {
            addCriterion("receiver <>", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThan(String value) {
            addCriterion("receiver >", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThanOrEqualTo(String value) {
            addCriterion("receiver >=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThan(String value) {
            addCriterion("receiver <", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThanOrEqualTo(String value) {
            addCriterion("receiver <=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLike(String value) {
            addCriterion("receiver like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotLike(String value) {
            addCriterion("receiver not like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverIn(List<String> values) {
            addCriterion("receiver in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotIn(List<String> values) {
            addCriterion("receiver not in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverBetween(String value1, String value2) {
            addCriterion("receiver between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotBetween(String value1, String value2) {
            addCriterion("receiver not between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverTelIsNull() {
            addCriterion("receiver_tel is null");
            return (Criteria) this;
        }

        public Criteria andReceiverTelIsNotNull() {
            addCriterion("receiver_tel is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverTelEqualTo(String value) {
            addCriterion("receiver_tel =", value, "receiverTel");
            return (Criteria) this;
        }

        public Criteria andReceiverTelNotEqualTo(String value) {
            addCriterion("receiver_tel <>", value, "receiverTel");
            return (Criteria) this;
        }

        public Criteria andReceiverTelGreaterThan(String value) {
            addCriterion("receiver_tel >", value, "receiverTel");
            return (Criteria) this;
        }

        public Criteria andReceiverTelGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_tel >=", value, "receiverTel");
            return (Criteria) this;
        }

        public Criteria andReceiverTelLessThan(String value) {
            addCriterion("receiver_tel <", value, "receiverTel");
            return (Criteria) this;
        }

        public Criteria andReceiverTelLessThanOrEqualTo(String value) {
            addCriterion("receiver_tel <=", value, "receiverTel");
            return (Criteria) this;
        }

        public Criteria andReceiverTelLike(String value) {
            addCriterion("receiver_tel like", value, "receiverTel");
            return (Criteria) this;
        }

        public Criteria andReceiverTelNotLike(String value) {
            addCriterion("receiver_tel not like", value, "receiverTel");
            return (Criteria) this;
        }

        public Criteria andReceiverTelIn(List<String> values) {
            addCriterion("receiver_tel in", values, "receiverTel");
            return (Criteria) this;
        }

        public Criteria andReceiverTelNotIn(List<String> values) {
            addCriterion("receiver_tel not in", values, "receiverTel");
            return (Criteria) this;
        }

        public Criteria andReceiverTelBetween(String value1, String value2) {
            addCriterion("receiver_tel between", value1, value2, "receiverTel");
            return (Criteria) this;
        }

        public Criteria andReceiverTelNotBetween(String value1, String value2) {
            addCriterion("receiver_tel not between", value1, value2, "receiverTel");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressIsNull() {
            addCriterion("receive_address is null");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressIsNotNull() {
            addCriterion("receive_address is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressEqualTo(String value) {
            addCriterion("receive_address =", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressNotEqualTo(String value) {
            addCriterion("receive_address <>", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressGreaterThan(String value) {
            addCriterion("receive_address >", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressGreaterThanOrEqualTo(String value) {
            addCriterion("receive_address >=", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressLessThan(String value) {
            addCriterion("receive_address <", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressLessThanOrEqualTo(String value) {
            addCriterion("receive_address <=", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressLike(String value) {
            addCriterion("receive_address like", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressNotLike(String value) {
            addCriterion("receive_address not like", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressIn(List<String> values) {
            addCriterion("receive_address in", values, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressNotIn(List<String> values) {
            addCriterion("receive_address not in", values, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressBetween(String value1, String value2) {
            addCriterion("receive_address between", value1, value2, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressNotBetween(String value1, String value2) {
            addCriterion("receive_address not between", value1, value2, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountItemFileIsNull() {
            addCriterion("amount_item_file is null");
            return (Criteria) this;
        }

        public Criteria andAmountItemFileIsNotNull() {
            addCriterion("amount_item_file is not null");
            return (Criteria) this;
        }

        public Criteria andAmountItemFileEqualTo(String value) {
            addCriterion("amount_item_file =", value, "amountItemFile");
            return (Criteria) this;
        }

        public Criteria andAmountItemFileNotEqualTo(String value) {
            addCriterion("amount_item_file <>", value, "amountItemFile");
            return (Criteria) this;
        }

        public Criteria andAmountItemFileGreaterThan(String value) {
            addCriterion("amount_item_file >", value, "amountItemFile");
            return (Criteria) this;
        }

        public Criteria andAmountItemFileGreaterThanOrEqualTo(String value) {
            addCriterion("amount_item_file >=", value, "amountItemFile");
            return (Criteria) this;
        }

        public Criteria andAmountItemFileLessThan(String value) {
            addCriterion("amount_item_file <", value, "amountItemFile");
            return (Criteria) this;
        }

        public Criteria andAmountItemFileLessThanOrEqualTo(String value) {
            addCriterion("amount_item_file <=", value, "amountItemFile");
            return (Criteria) this;
        }

        public Criteria andAmountItemFileLike(String value) {
            addCriterion("amount_item_file like", value, "amountItemFile");
            return (Criteria) this;
        }

        public Criteria andAmountItemFileNotLike(String value) {
            addCriterion("amount_item_file not like", value, "amountItemFile");
            return (Criteria) this;
        }

        public Criteria andAmountItemFileIn(List<String> values) {
            addCriterion("amount_item_file in", values, "amountItemFile");
            return (Criteria) this;
        }

        public Criteria andAmountItemFileNotIn(List<String> values) {
            addCriterion("amount_item_file not in", values, "amountItemFile");
            return (Criteria) this;
        }

        public Criteria andAmountItemFileBetween(String value1, String value2) {
            addCriterion("amount_item_file between", value1, value2, "amountItemFile");
            return (Criteria) this;
        }

        public Criteria andAmountItemFileNotBetween(String value1, String value2) {
            addCriterion("amount_item_file not between", value1, value2, "amountItemFile");
            return (Criteria) this;
        }

        public Criteria andProgressNameIsNull() {
            addCriterion("progress_name is null");
            return (Criteria) this;
        }

        public Criteria andProgressNameIsNotNull() {
            addCriterion("progress_name is not null");
            return (Criteria) this;
        }

        public Criteria andProgressNameEqualTo(String value) {
            addCriterion("progress_name =", value, "progressName");
            return (Criteria) this;
        }

        public Criteria andProgressNameNotEqualTo(String value) {
            addCriterion("progress_name <>", value, "progressName");
            return (Criteria) this;
        }

        public Criteria andProgressNameGreaterThan(String value) {
            addCriterion("progress_name >", value, "progressName");
            return (Criteria) this;
        }

        public Criteria andProgressNameGreaterThanOrEqualTo(String value) {
            addCriterion("progress_name >=", value, "progressName");
            return (Criteria) this;
        }

        public Criteria andProgressNameLessThan(String value) {
            addCriterion("progress_name <", value, "progressName");
            return (Criteria) this;
        }

        public Criteria andProgressNameLessThanOrEqualTo(String value) {
            addCriterion("progress_name <=", value, "progressName");
            return (Criteria) this;
        }

        public Criteria andProgressNameLike(String value) {
            addCriterion("progress_name like", value, "progressName");
            return (Criteria) this;
        }

        public Criteria andProgressNameNotLike(String value) {
            addCriterion("progress_name not like", value, "progressName");
            return (Criteria) this;
        }

        public Criteria andProgressNameIn(List<String> values) {
            addCriterion("progress_name in", values, "progressName");
            return (Criteria) this;
        }

        public Criteria andProgressNameNotIn(List<String> values) {
            addCriterion("progress_name not in", values, "progressName");
            return (Criteria) this;
        }

        public Criteria andProgressNameBetween(String value1, String value2) {
            addCriterion("progress_name between", value1, value2, "progressName");
            return (Criteria) this;
        }

        public Criteria andProgressNameNotBetween(String value1, String value2) {
            addCriterion("progress_name not between", value1, value2, "progressName");
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

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andApplyCodeIsNull() {
            addCriterion("apply_code is null");
            return (Criteria) this;
        }

        public Criteria andApplyCodeIsNotNull() {
            addCriterion("apply_code is not null");
            return (Criteria) this;
        }

        public Criteria andApplyCodeEqualTo(String value) {
            addCriterion("apply_code =", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeNotEqualTo(String value) {
            addCriterion("apply_code <>", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeGreaterThan(String value) {
            addCriterion("apply_code >", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("apply_code >=", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeLessThan(String value) {
            addCriterion("apply_code <", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeLessThanOrEqualTo(String value) {
            addCriterion("apply_code <=", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeLike(String value) {
            addCriterion("apply_code like", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeNotLike(String value) {
            addCriterion("apply_code not like", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeIn(List<String> values) {
            addCriterion("apply_code in", values, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeNotIn(List<String> values) {
            addCriterion("apply_code not in", values, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeBetween(String value1, String value2) {
            addCriterion("apply_code between", value1, value2, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeNotBetween(String value1, String value2) {
            addCriterion("apply_code not between", value1, value2, "applyCode");
            return (Criteria) this;
        }

        public Criteria andSignApplyIdIsNull() {
            addCriterion("sign_apply_id is null");
            return (Criteria) this;
        }

        public Criteria andSignApplyIdIsNotNull() {
            addCriterion("sign_apply_id is not null");
            return (Criteria) this;
        }

        public Criteria andSignApplyIdEqualTo(String value) {
            addCriterion("sign_apply_id =", value, "signApplyId");
            return (Criteria) this;
        }

        public Criteria andSignApplyIdNotEqualTo(String value) {
            addCriterion("sign_apply_id <>", value, "signApplyId");
            return (Criteria) this;
        }

        public Criteria andSignApplyIdGreaterThan(String value) {
            addCriterion("sign_apply_id >", value, "signApplyId");
            return (Criteria) this;
        }

        public Criteria andSignApplyIdGreaterThanOrEqualTo(String value) {
            addCriterion("sign_apply_id >=", value, "signApplyId");
            return (Criteria) this;
        }

        public Criteria andSignApplyIdLessThan(String value) {
            addCriterion("sign_apply_id <", value, "signApplyId");
            return (Criteria) this;
        }

        public Criteria andSignApplyIdLessThanOrEqualTo(String value) {
            addCriterion("sign_apply_id <=", value, "signApplyId");
            return (Criteria) this;
        }

        public Criteria andSignApplyIdLike(String value) {
            addCriterion("sign_apply_id like", value, "signApplyId");
            return (Criteria) this;
        }

        public Criteria andSignApplyIdNotLike(String value) {
            addCriterion("sign_apply_id not like", value, "signApplyId");
            return (Criteria) this;
        }

        public Criteria andSignApplyIdIn(List<String> values) {
            addCriterion("sign_apply_id in", values, "signApplyId");
            return (Criteria) this;
        }

        public Criteria andSignApplyIdNotIn(List<String> values) {
            addCriterion("sign_apply_id not in", values, "signApplyId");
            return (Criteria) this;
        }

        public Criteria andSignApplyIdBetween(String value1, String value2) {
            addCriterion("sign_apply_id between", value1, value2, "signApplyId");
            return (Criteria) this;
        }

        public Criteria andSignApplyIdNotBetween(String value1, String value2) {
            addCriterion("sign_apply_id not between", value1, value2, "signApplyId");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNull() {
            addCriterion("creator_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNotNull() {
            addCriterion("creator_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdEqualTo(String value) {
            addCriterion("creator_id =", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotEqualTo(String value) {
            addCriterion("creator_id <>", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThan(String value) {
            addCriterion("creator_id >", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThanOrEqualTo(String value) {
            addCriterion("creator_id >=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThan(String value) {
            addCriterion("creator_id <", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThanOrEqualTo(String value) {
            addCriterion("creator_id <=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLike(String value) {
            addCriterion("creator_id like", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotLike(String value) {
            addCriterion("creator_id not like", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIn(List<String> values) {
            addCriterion("creator_id in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotIn(List<String> values) {
            addCriterion("creator_id not in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdBetween(String value1, String value2) {
            addCriterion("creator_id between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotBetween(String value1, String value2) {
            addCriterion("creator_id not between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreateDtIsNull() {
            addCriterion("create_dt is null");
            return (Criteria) this;
        }

        public Criteria andCreateDtIsNotNull() {
            addCriterion("create_dt is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDtEqualTo(Date value) {
            addCriterion("create_dt =", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtNotEqualTo(Date value) {
            addCriterion("create_dt <>", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtGreaterThan(Date value) {
            addCriterion("create_dt >", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtGreaterThanOrEqualTo(Date value) {
            addCriterion("create_dt >=", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtLessThan(Date value) {
            addCriterion("create_dt <", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtLessThanOrEqualTo(Date value) {
            addCriterion("create_dt <=", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtIn(List<Date> values) {
            addCriterion("create_dt in", values, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtNotIn(List<Date> values) {
            addCriterion("create_dt not in", values, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtBetween(Date value1, Date value2) {
            addCriterion("create_dt between", value1, value2, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtNotBetween(Date value1, Date value2) {
            addCriterion("create_dt not between", value1, value2, "createDt");
            return (Criteria) this;
        }

        public Criteria andLastUpdatorIsNull() {
            addCriterion("last_updator is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatorIsNotNull() {
            addCriterion("last_updator is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatorEqualTo(String value) {
            addCriterion("last_updator =", value, "lastUpdator");
            return (Criteria) this;
        }

        public Criteria andLastUpdatorNotEqualTo(String value) {
            addCriterion("last_updator <>", value, "lastUpdator");
            return (Criteria) this;
        }

        public Criteria andLastUpdatorGreaterThan(String value) {
            addCriterion("last_updator >", value, "lastUpdator");
            return (Criteria) this;
        }

        public Criteria andLastUpdatorGreaterThanOrEqualTo(String value) {
            addCriterion("last_updator >=", value, "lastUpdator");
            return (Criteria) this;
        }

        public Criteria andLastUpdatorLessThan(String value) {
            addCriterion("last_updator <", value, "lastUpdator");
            return (Criteria) this;
        }

        public Criteria andLastUpdatorLessThanOrEqualTo(String value) {
            addCriterion("last_updator <=", value, "lastUpdator");
            return (Criteria) this;
        }

        public Criteria andLastUpdatorLike(String value) {
            addCriterion("last_updator like", value, "lastUpdator");
            return (Criteria) this;
        }

        public Criteria andLastUpdatorNotLike(String value) {
            addCriterion("last_updator not like", value, "lastUpdator");
            return (Criteria) this;
        }

        public Criteria andLastUpdatorIn(List<String> values) {
            addCriterion("last_updator in", values, "lastUpdator");
            return (Criteria) this;
        }

        public Criteria andLastUpdatorNotIn(List<String> values) {
            addCriterion("last_updator not in", values, "lastUpdator");
            return (Criteria) this;
        }

        public Criteria andLastUpdatorBetween(String value1, String value2) {
            addCriterion("last_updator between", value1, value2, "lastUpdator");
            return (Criteria) this;
        }

        public Criteria andLastUpdatorNotBetween(String value1, String value2) {
            addCriterion("last_updator not between", value1, value2, "lastUpdator");
            return (Criteria) this;
        }

        public Criteria andLastUpdatorIdIsNull() {
            addCriterion("last_updator_id is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatorIdIsNotNull() {
            addCriterion("last_updator_id is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatorIdEqualTo(String value) {
            addCriterion("last_updator_id =", value, "lastUpdatorId");
            return (Criteria) this;
        }

        public Criteria andLastUpdatorIdNotEqualTo(String value) {
            addCriterion("last_updator_id <>", value, "lastUpdatorId");
            return (Criteria) this;
        }

        public Criteria andLastUpdatorIdGreaterThan(String value) {
            addCriterion("last_updator_id >", value, "lastUpdatorId");
            return (Criteria) this;
        }

        public Criteria andLastUpdatorIdGreaterThanOrEqualTo(String value) {
            addCriterion("last_updator_id >=", value, "lastUpdatorId");
            return (Criteria) this;
        }

        public Criteria andLastUpdatorIdLessThan(String value) {
            addCriterion("last_updator_id <", value, "lastUpdatorId");
            return (Criteria) this;
        }

        public Criteria andLastUpdatorIdLessThanOrEqualTo(String value) {
            addCriterion("last_updator_id <=", value, "lastUpdatorId");
            return (Criteria) this;
        }

        public Criteria andLastUpdatorIdLike(String value) {
            addCriterion("last_updator_id like", value, "lastUpdatorId");
            return (Criteria) this;
        }

        public Criteria andLastUpdatorIdNotLike(String value) {
            addCriterion("last_updator_id not like", value, "lastUpdatorId");
            return (Criteria) this;
        }

        public Criteria andLastUpdatorIdIn(List<String> values) {
            addCriterion("last_updator_id in", values, "lastUpdatorId");
            return (Criteria) this;
        }

        public Criteria andLastUpdatorIdNotIn(List<String> values) {
            addCriterion("last_updator_id not in", values, "lastUpdatorId");
            return (Criteria) this;
        }

        public Criteria andLastUpdatorIdBetween(String value1, String value2) {
            addCriterion("last_updator_id between", value1, value2, "lastUpdatorId");
            return (Criteria) this;
        }

        public Criteria andLastUpdatorIdNotBetween(String value1, String value2) {
            addCriterion("last_updator_id not between", value1, value2, "lastUpdatorId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDtIsNull() {
            addCriterion("last_update_dt is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDtIsNotNull() {
            addCriterion("last_update_dt is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDtEqualTo(Date value) {
            addCriterion("last_update_dt =", value, "lastUpdateDt");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDtNotEqualTo(Date value) {
            addCriterion("last_update_dt <>", value, "lastUpdateDt");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDtGreaterThan(Date value) {
            addCriterion("last_update_dt >", value, "lastUpdateDt");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDtGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update_dt >=", value, "lastUpdateDt");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDtLessThan(Date value) {
            addCriterion("last_update_dt <", value, "lastUpdateDt");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDtLessThanOrEqualTo(Date value) {
            addCriterion("last_update_dt <=", value, "lastUpdateDt");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDtIn(List<Date> values) {
            addCriterion("last_update_dt in", values, "lastUpdateDt");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDtNotIn(List<Date> values) {
            addCriterion("last_update_dt not in", values, "lastUpdateDt");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDtBetween(Date value1, Date value2) {
            addCriterion("last_update_dt between", value1, value2, "lastUpdateDt");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDtNotBetween(Date value1, Date value2) {
            addCriterion("last_update_dt not between", value1, value2, "lastUpdateDt");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(String value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(String value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(String value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(String value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLike(String value) {
            addCriterion("customer_id like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotLike(String value) {
            addCriterion("customer_id not like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<String> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<String> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(String value1, String value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(String value1, String value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(String value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(String value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(String value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(String value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(String value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(String value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLike(String value) {
            addCriterion("shop_id like", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotLike(String value) {
            addCriterion("shop_id not like", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<String> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<String> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(String value1, String value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(String value1, String value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andRepeatBatchNoIsNull() {
            addCriterion("repeat_batch_no is null");
            return (Criteria) this;
        }

        public Criteria andRepeatBatchNoIsNotNull() {
            addCriterion("repeat_batch_no is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatBatchNoEqualTo(String value) {
            addCriterion("repeat_batch_no =", value, "repeatBatchNo");
            return (Criteria) this;
        }

        public Criteria andRepeatBatchNoNotEqualTo(String value) {
            addCriterion("repeat_batch_no <>", value, "repeatBatchNo");
            return (Criteria) this;
        }

        public Criteria andRepeatBatchNoGreaterThan(String value) {
            addCriterion("repeat_batch_no >", value, "repeatBatchNo");
            return (Criteria) this;
        }

        public Criteria andRepeatBatchNoGreaterThanOrEqualTo(String value) {
            addCriterion("repeat_batch_no >=", value, "repeatBatchNo");
            return (Criteria) this;
        }

        public Criteria andRepeatBatchNoLessThan(String value) {
            addCriterion("repeat_batch_no <", value, "repeatBatchNo");
            return (Criteria) this;
        }

        public Criteria andRepeatBatchNoLessThanOrEqualTo(String value) {
            addCriterion("repeat_batch_no <=", value, "repeatBatchNo");
            return (Criteria) this;
        }

        public Criteria andRepeatBatchNoLike(String value) {
            addCriterion("repeat_batch_no like", value, "repeatBatchNo");
            return (Criteria) this;
        }

        public Criteria andRepeatBatchNoNotLike(String value) {
            addCriterion("repeat_batch_no not like", value, "repeatBatchNo");
            return (Criteria) this;
        }

        public Criteria andRepeatBatchNoIn(List<String> values) {
            addCriterion("repeat_batch_no in", values, "repeatBatchNo");
            return (Criteria) this;
        }

        public Criteria andRepeatBatchNoNotIn(List<String> values) {
            addCriterion("repeat_batch_no not in", values, "repeatBatchNo");
            return (Criteria) this;
        }

        public Criteria andRepeatBatchNoBetween(String value1, String value2) {
            addCriterion("repeat_batch_no between", value1, value2, "repeatBatchNo");
            return (Criteria) this;
        }

        public Criteria andRepeatBatchNoNotBetween(String value1, String value2) {
            addCriterion("repeat_batch_no not between", value1, value2, "repeatBatchNo");
            return (Criteria) this;
        }

        public Criteria andServiceOrderIdIsNull() {
            addCriterion("service_order_id is null");
            return (Criteria) this;
        }

        public Criteria andServiceOrderIdIsNotNull() {
            addCriterion("service_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andServiceOrderIdEqualTo(String value) {
            addCriterion("service_order_id =", value, "serviceOrderId");
            return (Criteria) this;
        }

        public Criteria andServiceOrderIdNotEqualTo(String value) {
            addCriterion("service_order_id <>", value, "serviceOrderId");
            return (Criteria) this;
        }

        public Criteria andServiceOrderIdGreaterThan(String value) {
            addCriterion("service_order_id >", value, "serviceOrderId");
            return (Criteria) this;
        }

        public Criteria andServiceOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("service_order_id >=", value, "serviceOrderId");
            return (Criteria) this;
        }

        public Criteria andServiceOrderIdLessThan(String value) {
            addCriterion("service_order_id <", value, "serviceOrderId");
            return (Criteria) this;
        }

        public Criteria andServiceOrderIdLessThanOrEqualTo(String value) {
            addCriterion("service_order_id <=", value, "serviceOrderId");
            return (Criteria) this;
        }

        public Criteria andServiceOrderIdLike(String value) {
            addCriterion("service_order_id like", value, "serviceOrderId");
            return (Criteria) this;
        }

        public Criteria andServiceOrderIdNotLike(String value) {
            addCriterion("service_order_id not like", value, "serviceOrderId");
            return (Criteria) this;
        }

        public Criteria andServiceOrderIdIn(List<String> values) {
            addCriterion("service_order_id in", values, "serviceOrderId");
            return (Criteria) this;
        }

        public Criteria andServiceOrderIdNotIn(List<String> values) {
            addCriterion("service_order_id not in", values, "serviceOrderId");
            return (Criteria) this;
        }

        public Criteria andServiceOrderIdBetween(String value1, String value2) {
            addCriterion("service_order_id between", value1, value2, "serviceOrderId");
            return (Criteria) this;
        }

        public Criteria andServiceOrderIdNotBetween(String value1, String value2) {
            addCriterion("service_order_id not between", value1, value2, "serviceOrderId");
            return (Criteria) this;
        }

        public Criteria andIsReplaceTransmitIsNull() {
            addCriterion("is_replace_transmit is null");
            return (Criteria) this;
        }

        public Criteria andIsReplaceTransmitIsNotNull() {
            addCriterion("is_replace_transmit is not null");
            return (Criteria) this;
        }

        public Criteria andIsReplaceTransmitEqualTo(Byte value) {
            addCriterion("is_replace_transmit =", value, "isReplaceTransmit");
            return (Criteria) this;
        }

        public Criteria andIsReplaceTransmitNotEqualTo(Byte value) {
            addCriterion("is_replace_transmit <>", value, "isReplaceTransmit");
            return (Criteria) this;
        }

        public Criteria andIsReplaceTransmitGreaterThan(Byte value) {
            addCriterion("is_replace_transmit >", value, "isReplaceTransmit");
            return (Criteria) this;
        }

        public Criteria andIsReplaceTransmitGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_replace_transmit >=", value, "isReplaceTransmit");
            return (Criteria) this;
        }

        public Criteria andIsReplaceTransmitLessThan(Byte value) {
            addCriterion("is_replace_transmit <", value, "isReplaceTransmit");
            return (Criteria) this;
        }

        public Criteria andIsReplaceTransmitLessThanOrEqualTo(Byte value) {
            addCriterion("is_replace_transmit <=", value, "isReplaceTransmit");
            return (Criteria) this;
        }

        public Criteria andIsReplaceTransmitIn(List<Byte> values) {
            addCriterion("is_replace_transmit in", values, "isReplaceTransmit");
            return (Criteria) this;
        }

        public Criteria andIsReplaceTransmitNotIn(List<Byte> values) {
            addCriterion("is_replace_transmit not in", values, "isReplaceTransmit");
            return (Criteria) this;
        }

        public Criteria andIsReplaceTransmitBetween(Byte value1, Byte value2) {
            addCriterion("is_replace_transmit between", value1, value2, "isReplaceTransmit");
            return (Criteria) this;
        }

        public Criteria andIsReplaceTransmitNotBetween(Byte value1, Byte value2) {
            addCriterion("is_replace_transmit not between", value1, value2, "isReplaceTransmit");
            return (Criteria) this;
        }

        public Criteria andTransmitTryTimesIsNull() {
            addCriterion("transmit_try_times is null");
            return (Criteria) this;
        }

        public Criteria andTransmitTryTimesIsNotNull() {
            addCriterion("transmit_try_times is not null");
            return (Criteria) this;
        }

        public Criteria andTransmitTryTimesEqualTo(Byte value) {
            addCriterion("transmit_try_times =", value, "transmitTryTimes");
            return (Criteria) this;
        }

        public Criteria andTransmitTryTimesNotEqualTo(Byte value) {
            addCriterion("transmit_try_times <>", value, "transmitTryTimes");
            return (Criteria) this;
        }

        public Criteria andTransmitTryTimesGreaterThan(Byte value) {
            addCriterion("transmit_try_times >", value, "transmitTryTimes");
            return (Criteria) this;
        }

        public Criteria andTransmitTryTimesGreaterThanOrEqualTo(Byte value) {
            addCriterion("transmit_try_times >=", value, "transmitTryTimes");
            return (Criteria) this;
        }

        public Criteria andTransmitTryTimesLessThan(Byte value) {
            addCriterion("transmit_try_times <", value, "transmitTryTimes");
            return (Criteria) this;
        }

        public Criteria andTransmitTryTimesLessThanOrEqualTo(Byte value) {
            addCriterion("transmit_try_times <=", value, "transmitTryTimes");
            return (Criteria) this;
        }

        public Criteria andTransmitTryTimesIn(List<Byte> values) {
            addCriterion("transmit_try_times in", values, "transmitTryTimes");
            return (Criteria) this;
        }

        public Criteria andTransmitTryTimesNotIn(List<Byte> values) {
            addCriterion("transmit_try_times not in", values, "transmitTryTimes");
            return (Criteria) this;
        }

        public Criteria andTransmitTryTimesBetween(Byte value1, Byte value2) {
            addCriterion("transmit_try_times between", value1, value2, "transmitTryTimes");
            return (Criteria) this;
        }

        public Criteria andTransmitTryTimesNotBetween(Byte value1, Byte value2) {
            addCriterion("transmit_try_times not between", value1, value2, "transmitTryTimes");
            return (Criteria) this;
        }

        public Criteria andProductChannelIsNull() {
            addCriterion("product_channel is null");
            return (Criteria) this;
        }

        public Criteria andProductChannelIsNotNull() {
            addCriterion("product_channel is not null");
            return (Criteria) this;
        }

        public Criteria andProductChannelEqualTo(String value) {
            addCriterion("product_channel =", value, "productChannel");
            return (Criteria) this;
        }

        public Criteria andProductChannelNotEqualTo(String value) {
            addCriterion("product_channel <>", value, "productChannel");
            return (Criteria) this;
        }

        public Criteria andProductChannelGreaterThan(String value) {
            addCriterion("product_channel >", value, "productChannel");
            return (Criteria) this;
        }

        public Criteria andProductChannelGreaterThanOrEqualTo(String value) {
            addCriterion("product_channel >=", value, "productChannel");
            return (Criteria) this;
        }

        public Criteria andProductChannelLessThan(String value) {
            addCriterion("product_channel <", value, "productChannel");
            return (Criteria) this;
        }

        public Criteria andProductChannelLessThanOrEqualTo(String value) {
            addCriterion("product_channel <=", value, "productChannel");
            return (Criteria) this;
        }

        public Criteria andProductChannelLike(String value) {
            addCriterion("product_channel like", value, "productChannel");
            return (Criteria) this;
        }

        public Criteria andProductChannelNotLike(String value) {
            addCriterion("product_channel not like", value, "productChannel");
            return (Criteria) this;
        }

        public Criteria andProductChannelIn(List<String> values) {
            addCriterion("product_channel in", values, "productChannel");
            return (Criteria) this;
        }

        public Criteria andProductChannelNotIn(List<String> values) {
            addCriterion("product_channel not in", values, "productChannel");
            return (Criteria) this;
        }

        public Criteria andProductChannelBetween(String value1, String value2) {
            addCriterion("product_channel between", value1, value2, "productChannel");
            return (Criteria) this;
        }

        public Criteria andProductChannelNotBetween(String value1, String value2) {
            addCriterion("product_channel not between", value1, value2, "productChannel");
            return (Criteria) this;
        }

        public Criteria andSpecialButtonIsNull() {
            addCriterion("special_button is null");
            return (Criteria) this;
        }

        public Criteria andSpecialButtonIsNotNull() {
            addCriterion("special_button is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialButtonEqualTo(Byte value) {
            addCriterion("special_button =", value, "specialButton");
            return (Criteria) this;
        }

        public Criteria andSpecialButtonNotEqualTo(Byte value) {
            addCriterion("special_button <>", value, "specialButton");
            return (Criteria) this;
        }

        public Criteria andSpecialButtonGreaterThan(Byte value) {
            addCriterion("special_button >", value, "specialButton");
            return (Criteria) this;
        }

        public Criteria andSpecialButtonGreaterThanOrEqualTo(Byte value) {
            addCriterion("special_button >=", value, "specialButton");
            return (Criteria) this;
        }

        public Criteria andSpecialButtonLessThan(Byte value) {
            addCriterion("special_button <", value, "specialButton");
            return (Criteria) this;
        }

        public Criteria andSpecialButtonLessThanOrEqualTo(Byte value) {
            addCriterion("special_button <=", value, "specialButton");
            return (Criteria) this;
        }

        public Criteria andSpecialButtonIn(List<Byte> values) {
            addCriterion("special_button in", values, "specialButton");
            return (Criteria) this;
        }

        public Criteria andSpecialButtonNotIn(List<Byte> values) {
            addCriterion("special_button not in", values, "specialButton");
            return (Criteria) this;
        }

        public Criteria andSpecialButtonBetween(Byte value1, Byte value2) {
            addCriterion("special_button between", value1, value2, "specialButton");
            return (Criteria) this;
        }

        public Criteria andSpecialButtonNotBetween(Byte value1, Byte value2) {
            addCriterion("special_button not between", value1, value2, "specialButton");
            return (Criteria) this;
        }

        public Criteria andOrderRecycleIsNull() {
            addCriterion("order_recycle is null");
            return (Criteria) this;
        }

        public Criteria andOrderRecycleIsNotNull() {
            addCriterion("order_recycle is not null");
            return (Criteria) this;
        }

        public Criteria andOrderRecycleEqualTo(Boolean value) {
            addCriterion("order_recycle =", value, "orderRecycle");
            return (Criteria) this;
        }

        public Criteria andOrderRecycleNotEqualTo(Boolean value) {
            addCriterion("order_recycle <>", value, "orderRecycle");
            return (Criteria) this;
        }

        public Criteria andOrderRecycleGreaterThan(Boolean value) {
            addCriterion("order_recycle >", value, "orderRecycle");
            return (Criteria) this;
        }

        public Criteria andOrderRecycleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("order_recycle >=", value, "orderRecycle");
            return (Criteria) this;
        }

        public Criteria andOrderRecycleLessThan(Boolean value) {
            addCriterion("order_recycle <", value, "orderRecycle");
            return (Criteria) this;
        }

        public Criteria andOrderRecycleLessThanOrEqualTo(Boolean value) {
            addCriterion("order_recycle <=", value, "orderRecycle");
            return (Criteria) this;
        }

        public Criteria andOrderRecycleIn(List<Boolean> values) {
            addCriterion("order_recycle in", values, "orderRecycle");
            return (Criteria) this;
        }

        public Criteria andOrderRecycleNotIn(List<Boolean> values) {
            addCriterion("order_recycle not in", values, "orderRecycle");
            return (Criteria) this;
        }

        public Criteria andOrderRecycleBetween(Boolean value1, Boolean value2) {
            addCriterion("order_recycle between", value1, value2, "orderRecycle");
            return (Criteria) this;
        }

        public Criteria andOrderRecycleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("order_recycle not between", value1, value2, "orderRecycle");
            return (Criteria) this;
        }

        public Criteria andBatchImportNoIsNull() {
            addCriterion("batch_import_no is null");
            return (Criteria) this;
        }

        public Criteria andBatchImportNoIsNotNull() {
            addCriterion("batch_import_no is not null");
            return (Criteria) this;
        }

        public Criteria andBatchImportNoEqualTo(String value) {
            addCriterion("batch_import_no =", value, "batchImportNo");
            return (Criteria) this;
        }

        public Criteria andBatchImportNoNotEqualTo(String value) {
            addCriterion("batch_import_no <>", value, "batchImportNo");
            return (Criteria) this;
        }

        public Criteria andBatchImportNoGreaterThan(String value) {
            addCriterion("batch_import_no >", value, "batchImportNo");
            return (Criteria) this;
        }

        public Criteria andBatchImportNoGreaterThanOrEqualTo(String value) {
            addCriterion("batch_import_no >=", value, "batchImportNo");
            return (Criteria) this;
        }

        public Criteria andBatchImportNoLessThan(String value) {
            addCriterion("batch_import_no <", value, "batchImportNo");
            return (Criteria) this;
        }

        public Criteria andBatchImportNoLessThanOrEqualTo(String value) {
            addCriterion("batch_import_no <=", value, "batchImportNo");
            return (Criteria) this;
        }

        public Criteria andBatchImportNoLike(String value) {
            addCriterion("batch_import_no like", value, "batchImportNo");
            return (Criteria) this;
        }

        public Criteria andBatchImportNoNotLike(String value) {
            addCriterion("batch_import_no not like", value, "batchImportNo");
            return (Criteria) this;
        }

        public Criteria andBatchImportNoIn(List<String> values) {
            addCriterion("batch_import_no in", values, "batchImportNo");
            return (Criteria) this;
        }

        public Criteria andBatchImportNoNotIn(List<String> values) {
            addCriterion("batch_import_no not in", values, "batchImportNo");
            return (Criteria) this;
        }

        public Criteria andBatchImportNoBetween(String value1, String value2) {
            addCriterion("batch_import_no between", value1, value2, "batchImportNo");
            return (Criteria) this;
        }

        public Criteria andBatchImportNoNotBetween(String value1, String value2) {
            addCriterion("batch_import_no not between", value1, value2, "batchImportNo");
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