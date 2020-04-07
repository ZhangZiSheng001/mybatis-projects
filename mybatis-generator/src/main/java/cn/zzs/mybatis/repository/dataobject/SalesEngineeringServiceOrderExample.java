package cn.zzs.mybatis.repository.dataobject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SalesEngineeringServiceOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalesEngineeringServiceOrderExample() {
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

        public Criteria andServiceOrderNoIsNull() {
            addCriterion("service_order_no is null");
            return (Criteria) this;
        }

        public Criteria andServiceOrderNoIsNotNull() {
            addCriterion("service_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andServiceOrderNoEqualTo(String value) {
            addCriterion("service_order_no =", value, "serviceOrderNo");
            return (Criteria) this;
        }

        public Criteria andServiceOrderNoNotEqualTo(String value) {
            addCriterion("service_order_no <>", value, "serviceOrderNo");
            return (Criteria) this;
        }

        public Criteria andServiceOrderNoGreaterThan(String value) {
            addCriterion("service_order_no >", value, "serviceOrderNo");
            return (Criteria) this;
        }

        public Criteria andServiceOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("service_order_no >=", value, "serviceOrderNo");
            return (Criteria) this;
        }

        public Criteria andServiceOrderNoLessThan(String value) {
            addCriterion("service_order_no <", value, "serviceOrderNo");
            return (Criteria) this;
        }

        public Criteria andServiceOrderNoLessThanOrEqualTo(String value) {
            addCriterion("service_order_no <=", value, "serviceOrderNo");
            return (Criteria) this;
        }

        public Criteria andServiceOrderNoLike(String value) {
            addCriterion("service_order_no like", value, "serviceOrderNo");
            return (Criteria) this;
        }

        public Criteria andServiceOrderNoNotLike(String value) {
            addCriterion("service_order_no not like", value, "serviceOrderNo");
            return (Criteria) this;
        }

        public Criteria andServiceOrderNoIn(List<String> values) {
            addCriterion("service_order_no in", values, "serviceOrderNo");
            return (Criteria) this;
        }

        public Criteria andServiceOrderNoNotIn(List<String> values) {
            addCriterion("service_order_no not in", values, "serviceOrderNo");
            return (Criteria) this;
        }

        public Criteria andServiceOrderNoBetween(String value1, String value2) {
            addCriterion("service_order_no between", value1, value2, "serviceOrderNo");
            return (Criteria) this;
        }

        public Criteria andServiceOrderNoNotBetween(String value1, String value2) {
            addCriterion("service_order_no not between", value1, value2, "serviceOrderNo");
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

        public Criteria andProjectAbbreviationIsNull() {
            addCriterion("project_abbreviation is null");
            return (Criteria) this;
        }

        public Criteria andProjectAbbreviationIsNotNull() {
            addCriterion("project_abbreviation is not null");
            return (Criteria) this;
        }

        public Criteria andProjectAbbreviationEqualTo(String value) {
            addCriterion("project_abbreviation =", value, "projectAbbreviation");
            return (Criteria) this;
        }

        public Criteria andProjectAbbreviationNotEqualTo(String value) {
            addCriterion("project_abbreviation <>", value, "projectAbbreviation");
            return (Criteria) this;
        }

        public Criteria andProjectAbbreviationGreaterThan(String value) {
            addCriterion("project_abbreviation >", value, "projectAbbreviation");
            return (Criteria) this;
        }

        public Criteria andProjectAbbreviationGreaterThanOrEqualTo(String value) {
            addCriterion("project_abbreviation >=", value, "projectAbbreviation");
            return (Criteria) this;
        }

        public Criteria andProjectAbbreviationLessThan(String value) {
            addCriterion("project_abbreviation <", value, "projectAbbreviation");
            return (Criteria) this;
        }

        public Criteria andProjectAbbreviationLessThanOrEqualTo(String value) {
            addCriterion("project_abbreviation <=", value, "projectAbbreviation");
            return (Criteria) this;
        }

        public Criteria andProjectAbbreviationLike(String value) {
            addCriterion("project_abbreviation like", value, "projectAbbreviation");
            return (Criteria) this;
        }

        public Criteria andProjectAbbreviationNotLike(String value) {
            addCriterion("project_abbreviation not like", value, "projectAbbreviation");
            return (Criteria) this;
        }

        public Criteria andProjectAbbreviationIn(List<String> values) {
            addCriterion("project_abbreviation in", values, "projectAbbreviation");
            return (Criteria) this;
        }

        public Criteria andProjectAbbreviationNotIn(List<String> values) {
            addCriterion("project_abbreviation not in", values, "projectAbbreviation");
            return (Criteria) this;
        }

        public Criteria andProjectAbbreviationBetween(String value1, String value2) {
            addCriterion("project_abbreviation between", value1, value2, "projectAbbreviation");
            return (Criteria) this;
        }

        public Criteria andProjectAbbreviationNotBetween(String value1, String value2) {
            addCriterion("project_abbreviation not between", value1, value2, "projectAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCompanyAbbreviationIsNull() {
            addCriterion("company_abbreviation is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAbbreviationIsNotNull() {
            addCriterion("company_abbreviation is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAbbreviationEqualTo(String value) {
            addCriterion("company_abbreviation =", value, "companyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCompanyAbbreviationNotEqualTo(String value) {
            addCriterion("company_abbreviation <>", value, "companyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCompanyAbbreviationGreaterThan(String value) {
            addCriterion("company_abbreviation >", value, "companyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCompanyAbbreviationGreaterThanOrEqualTo(String value) {
            addCriterion("company_abbreviation >=", value, "companyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCompanyAbbreviationLessThan(String value) {
            addCriterion("company_abbreviation <", value, "companyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCompanyAbbreviationLessThanOrEqualTo(String value) {
            addCriterion("company_abbreviation <=", value, "companyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCompanyAbbreviationLike(String value) {
            addCriterion("company_abbreviation like", value, "companyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCompanyAbbreviationNotLike(String value) {
            addCriterion("company_abbreviation not like", value, "companyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCompanyAbbreviationIn(List<String> values) {
            addCriterion("company_abbreviation in", values, "companyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCompanyAbbreviationNotIn(List<String> values) {
            addCriterion("company_abbreviation not in", values, "companyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCompanyAbbreviationBetween(String value1, String value2) {
            addCriterion("company_abbreviation between", value1, value2, "companyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andCompanyAbbreviationNotBetween(String value1, String value2) {
            addCriterion("company_abbreviation not between", value1, value2, "companyAbbreviation");
            return (Criteria) this;
        }

        public Criteria andEstateAbbreviationIsNull() {
            addCriterion("estate_abbreviation is null");
            return (Criteria) this;
        }

        public Criteria andEstateAbbreviationIsNotNull() {
            addCriterion("estate_abbreviation is not null");
            return (Criteria) this;
        }

        public Criteria andEstateAbbreviationEqualTo(String value) {
            addCriterion("estate_abbreviation =", value, "estateAbbreviation");
            return (Criteria) this;
        }

        public Criteria andEstateAbbreviationNotEqualTo(String value) {
            addCriterion("estate_abbreviation <>", value, "estateAbbreviation");
            return (Criteria) this;
        }

        public Criteria andEstateAbbreviationGreaterThan(String value) {
            addCriterion("estate_abbreviation >", value, "estateAbbreviation");
            return (Criteria) this;
        }

        public Criteria andEstateAbbreviationGreaterThanOrEqualTo(String value) {
            addCriterion("estate_abbreviation >=", value, "estateAbbreviation");
            return (Criteria) this;
        }

        public Criteria andEstateAbbreviationLessThan(String value) {
            addCriterion("estate_abbreviation <", value, "estateAbbreviation");
            return (Criteria) this;
        }

        public Criteria andEstateAbbreviationLessThanOrEqualTo(String value) {
            addCriterion("estate_abbreviation <=", value, "estateAbbreviation");
            return (Criteria) this;
        }

        public Criteria andEstateAbbreviationLike(String value) {
            addCriterion("estate_abbreviation like", value, "estateAbbreviation");
            return (Criteria) this;
        }

        public Criteria andEstateAbbreviationNotLike(String value) {
            addCriterion("estate_abbreviation not like", value, "estateAbbreviation");
            return (Criteria) this;
        }

        public Criteria andEstateAbbreviationIn(List<String> values) {
            addCriterion("estate_abbreviation in", values, "estateAbbreviation");
            return (Criteria) this;
        }

        public Criteria andEstateAbbreviationNotIn(List<String> values) {
            addCriterion("estate_abbreviation not in", values, "estateAbbreviation");
            return (Criteria) this;
        }

        public Criteria andEstateAbbreviationBetween(String value1, String value2) {
            addCriterion("estate_abbreviation between", value1, value2, "estateAbbreviation");
            return (Criteria) this;
        }

        public Criteria andEstateAbbreviationNotBetween(String value1, String value2) {
            addCriterion("estate_abbreviation not between", value1, value2, "estateAbbreviation");
            return (Criteria) this;
        }

        public Criteria andContractNumberIsNull() {
            addCriterion("contract_number is null");
            return (Criteria) this;
        }

        public Criteria andContractNumberIsNotNull() {
            addCriterion("contract_number is not null");
            return (Criteria) this;
        }

        public Criteria andContractNumberEqualTo(String value) {
            addCriterion("contract_number =", value, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberNotEqualTo(String value) {
            addCriterion("contract_number <>", value, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberGreaterThan(String value) {
            addCriterion("contract_number >", value, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberGreaterThanOrEqualTo(String value) {
            addCriterion("contract_number >=", value, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberLessThan(String value) {
            addCriterion("contract_number <", value, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberLessThanOrEqualTo(String value) {
            addCriterion("contract_number <=", value, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberLike(String value) {
            addCriterion("contract_number like", value, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberNotLike(String value) {
            addCriterion("contract_number not like", value, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberIn(List<String> values) {
            addCriterion("contract_number in", values, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberNotIn(List<String> values) {
            addCriterion("contract_number not in", values, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberBetween(String value1, String value2) {
            addCriterion("contract_number between", value1, value2, "contractNumber");
            return (Criteria) this;
        }

        public Criteria andContractNumberNotBetween(String value1, String value2) {
            addCriterion("contract_number not between", value1, value2, "contractNumber");
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

        public Criteria andHouseTypeIsNull() {
            addCriterion("house_type is null");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIsNotNull() {
            addCriterion("house_type is not null");
            return (Criteria) this;
        }

        public Criteria andHouseTypeEqualTo(String value) {
            addCriterion("house_type =", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotEqualTo(String value) {
            addCriterion("house_type <>", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeGreaterThan(String value) {
            addCriterion("house_type >", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("house_type >=", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLessThan(String value) {
            addCriterion("house_type <", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLessThanOrEqualTo(String value) {
            addCriterion("house_type <=", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLike(String value) {
            addCriterion("house_type like", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotLike(String value) {
            addCriterion("house_type not like", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIn(List<String> values) {
            addCriterion("house_type in", values, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotIn(List<String> values) {
            addCriterion("house_type not in", values, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeBetween(String value1, String value2) {
            addCriterion("house_type between", value1, value2, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotBetween(String value1, String value2) {
            addCriterion("house_type not between", value1, value2, "houseType");
            return (Criteria) this;
        }

        public Criteria andPlanNoIsNull() {
            addCriterion("plan_no is null");
            return (Criteria) this;
        }

        public Criteria andPlanNoIsNotNull() {
            addCriterion("plan_no is not null");
            return (Criteria) this;
        }

        public Criteria andPlanNoEqualTo(String value) {
            addCriterion("plan_no =", value, "planNo");
            return (Criteria) this;
        }

        public Criteria andPlanNoNotEqualTo(String value) {
            addCriterion("plan_no <>", value, "planNo");
            return (Criteria) this;
        }

        public Criteria andPlanNoGreaterThan(String value) {
            addCriterion("plan_no >", value, "planNo");
            return (Criteria) this;
        }

        public Criteria andPlanNoGreaterThanOrEqualTo(String value) {
            addCriterion("plan_no >=", value, "planNo");
            return (Criteria) this;
        }

        public Criteria andPlanNoLessThan(String value) {
            addCriterion("plan_no <", value, "planNo");
            return (Criteria) this;
        }

        public Criteria andPlanNoLessThanOrEqualTo(String value) {
            addCriterion("plan_no <=", value, "planNo");
            return (Criteria) this;
        }

        public Criteria andPlanNoLike(String value) {
            addCriterion("plan_no like", value, "planNo");
            return (Criteria) this;
        }

        public Criteria andPlanNoNotLike(String value) {
            addCriterion("plan_no not like", value, "planNo");
            return (Criteria) this;
        }

        public Criteria andPlanNoIn(List<String> values) {
            addCriterion("plan_no in", values, "planNo");
            return (Criteria) this;
        }

        public Criteria andPlanNoNotIn(List<String> values) {
            addCriterion("plan_no not in", values, "planNo");
            return (Criteria) this;
        }

        public Criteria andPlanNoBetween(String value1, String value2) {
            addCriterion("plan_no between", value1, value2, "planNo");
            return (Criteria) this;
        }

        public Criteria andPlanNoNotBetween(String value1, String value2) {
            addCriterion("plan_no not between", value1, value2, "planNo");
            return (Criteria) this;
        }

        public Criteria andBatchInfoIsNull() {
            addCriterion("batch_info is null");
            return (Criteria) this;
        }

        public Criteria andBatchInfoIsNotNull() {
            addCriterion("batch_info is not null");
            return (Criteria) this;
        }

        public Criteria andBatchInfoEqualTo(String value) {
            addCriterion("batch_info =", value, "batchInfo");
            return (Criteria) this;
        }

        public Criteria andBatchInfoNotEqualTo(String value) {
            addCriterion("batch_info <>", value, "batchInfo");
            return (Criteria) this;
        }

        public Criteria andBatchInfoGreaterThan(String value) {
            addCriterion("batch_info >", value, "batchInfo");
            return (Criteria) this;
        }

        public Criteria andBatchInfoGreaterThanOrEqualTo(String value) {
            addCriterion("batch_info >=", value, "batchInfo");
            return (Criteria) this;
        }

        public Criteria andBatchInfoLessThan(String value) {
            addCriterion("batch_info <", value, "batchInfo");
            return (Criteria) this;
        }

        public Criteria andBatchInfoLessThanOrEqualTo(String value) {
            addCriterion("batch_info <=", value, "batchInfo");
            return (Criteria) this;
        }

        public Criteria andBatchInfoLike(String value) {
            addCriterion("batch_info like", value, "batchInfo");
            return (Criteria) this;
        }

        public Criteria andBatchInfoNotLike(String value) {
            addCriterion("batch_info not like", value, "batchInfo");
            return (Criteria) this;
        }

        public Criteria andBatchInfoIn(List<String> values) {
            addCriterion("batch_info in", values, "batchInfo");
            return (Criteria) this;
        }

        public Criteria andBatchInfoNotIn(List<String> values) {
            addCriterion("batch_info not in", values, "batchInfo");
            return (Criteria) this;
        }

        public Criteria andBatchInfoBetween(String value1, String value2) {
            addCriterion("batch_info between", value1, value2, "batchInfo");
            return (Criteria) this;
        }

        public Criteria andBatchInfoNotBetween(String value1, String value2) {
            addCriterion("batch_info not between", value1, value2, "batchInfo");
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

        public Criteria andShopNoIsNull() {
            addCriterion("shop_no is null");
            return (Criteria) this;
        }

        public Criteria andShopNoIsNotNull() {
            addCriterion("shop_no is not null");
            return (Criteria) this;
        }

        public Criteria andShopNoEqualTo(String value) {
            addCriterion("shop_no =", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoNotEqualTo(String value) {
            addCriterion("shop_no <>", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoGreaterThan(String value) {
            addCriterion("shop_no >", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoGreaterThanOrEqualTo(String value) {
            addCriterion("shop_no >=", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoLessThan(String value) {
            addCriterion("shop_no <", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoLessThanOrEqualTo(String value) {
            addCriterion("shop_no <=", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoLike(String value) {
            addCriterion("shop_no like", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoNotLike(String value) {
            addCriterion("shop_no not like", value, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoIn(List<String> values) {
            addCriterion("shop_no in", values, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoNotIn(List<String> values) {
            addCriterion("shop_no not in", values, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoBetween(String value1, String value2) {
            addCriterion("shop_no between", value1, value2, "shopNo");
            return (Criteria) this;
        }

        public Criteria andShopNoNotBetween(String value1, String value2) {
            addCriterion("shop_no not between", value1, value2, "shopNo");
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

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andOnkeyCreateOrderIsNull() {
            addCriterion("onkey_create_order is null");
            return (Criteria) this;
        }

        public Criteria andOnkeyCreateOrderIsNotNull() {
            addCriterion("onkey_create_order is not null");
            return (Criteria) this;
        }

        public Criteria andOnkeyCreateOrderEqualTo(Boolean value) {
            addCriterion("onkey_create_order =", value, "onkeyCreateOrder");
            return (Criteria) this;
        }

        public Criteria andOnkeyCreateOrderNotEqualTo(Boolean value) {
            addCriterion("onkey_create_order <>", value, "onkeyCreateOrder");
            return (Criteria) this;
        }

        public Criteria andOnkeyCreateOrderGreaterThan(Boolean value) {
            addCriterion("onkey_create_order >", value, "onkeyCreateOrder");
            return (Criteria) this;
        }

        public Criteria andOnkeyCreateOrderGreaterThanOrEqualTo(Boolean value) {
            addCriterion("onkey_create_order >=", value, "onkeyCreateOrder");
            return (Criteria) this;
        }

        public Criteria andOnkeyCreateOrderLessThan(Boolean value) {
            addCriterion("onkey_create_order <", value, "onkeyCreateOrder");
            return (Criteria) this;
        }

        public Criteria andOnkeyCreateOrderLessThanOrEqualTo(Boolean value) {
            addCriterion("onkey_create_order <=", value, "onkeyCreateOrder");
            return (Criteria) this;
        }

        public Criteria andOnkeyCreateOrderIn(List<Boolean> values) {
            addCriterion("onkey_create_order in", values, "onkeyCreateOrder");
            return (Criteria) this;
        }

        public Criteria andOnkeyCreateOrderNotIn(List<Boolean> values) {
            addCriterion("onkey_create_order not in", values, "onkeyCreateOrder");
            return (Criteria) this;
        }

        public Criteria andOnkeyCreateOrderBetween(Boolean value1, Boolean value2) {
            addCriterion("onkey_create_order between", value1, value2, "onkeyCreateOrder");
            return (Criteria) this;
        }

        public Criteria andOnkeyCreateOrderNotBetween(Boolean value1, Boolean value2) {
            addCriterion("onkey_create_order not between", value1, value2, "onkeyCreateOrder");
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

        public Criteria andExcelContractNoTotalIsNull() {
            addCriterion("excel_contract_no_total is null");
            return (Criteria) this;
        }

        public Criteria andExcelContractNoTotalIsNotNull() {
            addCriterion("excel_contract_no_total is not null");
            return (Criteria) this;
        }

        public Criteria andExcelContractNoTotalEqualTo(Integer value) {
            addCriterion("excel_contract_no_total =", value, "excelContractNoTotal");
            return (Criteria) this;
        }

        public Criteria andExcelContractNoTotalNotEqualTo(Integer value) {
            addCriterion("excel_contract_no_total <>", value, "excelContractNoTotal");
            return (Criteria) this;
        }

        public Criteria andExcelContractNoTotalGreaterThan(Integer value) {
            addCriterion("excel_contract_no_total >", value, "excelContractNoTotal");
            return (Criteria) this;
        }

        public Criteria andExcelContractNoTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("excel_contract_no_total >=", value, "excelContractNoTotal");
            return (Criteria) this;
        }

        public Criteria andExcelContractNoTotalLessThan(Integer value) {
            addCriterion("excel_contract_no_total <", value, "excelContractNoTotal");
            return (Criteria) this;
        }

        public Criteria andExcelContractNoTotalLessThanOrEqualTo(Integer value) {
            addCriterion("excel_contract_no_total <=", value, "excelContractNoTotal");
            return (Criteria) this;
        }

        public Criteria andExcelContractNoTotalIn(List<Integer> values) {
            addCriterion("excel_contract_no_total in", values, "excelContractNoTotal");
            return (Criteria) this;
        }

        public Criteria andExcelContractNoTotalNotIn(List<Integer> values) {
            addCriterion("excel_contract_no_total not in", values, "excelContractNoTotal");
            return (Criteria) this;
        }

        public Criteria andExcelContractNoTotalBetween(Integer value1, Integer value2) {
            addCriterion("excel_contract_no_total between", value1, value2, "excelContractNoTotal");
            return (Criteria) this;
        }

        public Criteria andExcelContractNoTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("excel_contract_no_total not between", value1, value2, "excelContractNoTotal");
            return (Criteria) this;
        }

        public Criteria andOrgNoIsNull() {
            addCriterion("org_no is null");
            return (Criteria) this;
        }

        public Criteria andOrgNoIsNotNull() {
            addCriterion("org_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNoEqualTo(String value) {
            addCriterion("org_no =", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotEqualTo(String value) {
            addCriterion("org_no <>", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoGreaterThan(String value) {
            addCriterion("org_no >", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoGreaterThanOrEqualTo(String value) {
            addCriterion("org_no >=", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoLessThan(String value) {
            addCriterion("org_no <", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoLessThanOrEqualTo(String value) {
            addCriterion("org_no <=", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoLike(String value) {
            addCriterion("org_no like", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotLike(String value) {
            addCriterion("org_no not like", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoIn(List<String> values) {
            addCriterion("org_no in", values, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotIn(List<String> values) {
            addCriterion("org_no not in", values, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoBetween(String value1, String value2) {
            addCriterion("org_no between", value1, value2, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotBetween(String value1, String value2) {
            addCriterion("org_no not between", value1, value2, "orgNo");
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