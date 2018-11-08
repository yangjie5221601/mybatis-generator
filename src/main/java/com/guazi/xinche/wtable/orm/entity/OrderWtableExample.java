package com.guazi.xinche.wtable.orm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderWtableExample {
    /**
     * order_wtable
     */
    protected String orderByClause;

    /**
     * order_wtable
     */
    protected boolean distinct;

    /**
     * order_wtable
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated
     */
    public OrderWtableExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * order_wtable null
     */
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Integer value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Integer value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Integer value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Integer value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Integer> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Integer> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Integer value1, Integer value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Integer value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Integer value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Integer value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Integer value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Integer value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Integer> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Integer> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Integer value1, Integer value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andChexiIdIsNull() {
            addCriterion("chexi_id is null");
            return (Criteria) this;
        }

        public Criteria andChexiIdIsNotNull() {
            addCriterion("chexi_id is not null");
            return (Criteria) this;
        }

        public Criteria andChexiIdEqualTo(Integer value) {
            addCriterion("chexi_id =", value, "chexiId");
            return (Criteria) this;
        }

        public Criteria andChexiIdNotEqualTo(Integer value) {
            addCriterion("chexi_id <>", value, "chexiId");
            return (Criteria) this;
        }

        public Criteria andChexiIdGreaterThan(Integer value) {
            addCriterion("chexi_id >", value, "chexiId");
            return (Criteria) this;
        }

        public Criteria andChexiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("chexi_id >=", value, "chexiId");
            return (Criteria) this;
        }

        public Criteria andChexiIdLessThan(Integer value) {
            addCriterion("chexi_id <", value, "chexiId");
            return (Criteria) this;
        }

        public Criteria andChexiIdLessThanOrEqualTo(Integer value) {
            addCriterion("chexi_id <=", value, "chexiId");
            return (Criteria) this;
        }

        public Criteria andChexiIdIn(List<Integer> values) {
            addCriterion("chexi_id in", values, "chexiId");
            return (Criteria) this;
        }

        public Criteria andChexiIdNotIn(List<Integer> values) {
            addCriterion("chexi_id not in", values, "chexiId");
            return (Criteria) this;
        }

        public Criteria andChexiIdBetween(Integer value1, Integer value2) {
            addCriterion("chexi_id between", value1, value2, "chexiId");
            return (Criteria) this;
        }

        public Criteria andChexiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("chexi_id not between", value1, value2, "chexiId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNull() {
            addCriterion("sku_id is null");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNotNull() {
            addCriterion("sku_id is not null");
            return (Criteria) this;
        }

        public Criteria andSkuIdEqualTo(Integer value) {
            addCriterion("sku_id =", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualTo(Integer value) {
            addCriterion("sku_id <>", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThan(Integer value) {
            addCriterion("sku_id >", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sku_id >=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThan(Integer value) {
            addCriterion("sku_id <", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualTo(Integer value) {
            addCriterion("sku_id <=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIn(List<Integer> values) {
            addCriterion("sku_id in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotIn(List<Integer> values) {
            addCriterion("sku_id not in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdBetween(Integer value1, Integer value2) {
            addCriterion("sku_id between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sku_id not between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andVinIsNull() {
            addCriterion("vin is null");
            return (Criteria) this;
        }

        public Criteria andVinIsNotNull() {
            addCriterion("vin is not null");
            return (Criteria) this;
        }

        public Criteria andVinEqualTo(String value) {
            addCriterion("vin =", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotEqualTo(String value) {
            addCriterion("vin <>", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinGreaterThan(String value) {
            addCriterion("vin >", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinGreaterThanOrEqualTo(String value) {
            addCriterion("vin >=", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLessThan(String value) {
            addCriterion("vin <", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLessThanOrEqualTo(String value) {
            addCriterion("vin <=", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLike(String value) {
            addCriterion("vin like", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotLike(String value) {
            addCriterion("vin not like", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinIn(List<String> values) {
            addCriterion("vin in", values, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotIn(List<String> values) {
            addCriterion("vin not in", values, "vin");
            return (Criteria) this;
        }

        public Criteria andVinBetween(String value1, String value2) {
            addCriterion("vin between", value1, value2, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotBetween(String value1, String value2) {
            addCriterion("vin not between", value1, value2, "vin");
            return (Criteria) this;
        }

        public Criteria andBoardingCityIdIsNull() {
            addCriterion("boarding_city_id is null");
            return (Criteria) this;
        }

        public Criteria andBoardingCityIdIsNotNull() {
            addCriterion("boarding_city_id is not null");
            return (Criteria) this;
        }

        public Criteria andBoardingCityIdEqualTo(Integer value) {
            addCriterion("boarding_city_id =", value, "boardingCityId");
            return (Criteria) this;
        }

        public Criteria andBoardingCityIdNotEqualTo(Integer value) {
            addCriterion("boarding_city_id <>", value, "boardingCityId");
            return (Criteria) this;
        }

        public Criteria andBoardingCityIdGreaterThan(Integer value) {
            addCriterion("boarding_city_id >", value, "boardingCityId");
            return (Criteria) this;
        }

        public Criteria andBoardingCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("boarding_city_id >=", value, "boardingCityId");
            return (Criteria) this;
        }

        public Criteria andBoardingCityIdLessThan(Integer value) {
            addCriterion("boarding_city_id <", value, "boardingCityId");
            return (Criteria) this;
        }

        public Criteria andBoardingCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("boarding_city_id <=", value, "boardingCityId");
            return (Criteria) this;
        }

        public Criteria andBoardingCityIdIn(List<Integer> values) {
            addCriterion("boarding_city_id in", values, "boardingCityId");
            return (Criteria) this;
        }

        public Criteria andBoardingCityIdNotIn(List<Integer> values) {
            addCriterion("boarding_city_id not in", values, "boardingCityId");
            return (Criteria) this;
        }

        public Criteria andBoardingCityIdBetween(Integer value1, Integer value2) {
            addCriterion("boarding_city_id between", value1, value2, "boardingCityId");
            return (Criteria) this;
        }

        public Criteria andBoardingCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("boarding_city_id not between", value1, value2, "boardingCityId");
            return (Criteria) this;
        }

        public Criteria andDeliveryCityIdIsNull() {
            addCriterion("delivery_city_id is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryCityIdIsNotNull() {
            addCriterion("delivery_city_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryCityIdEqualTo(Integer value) {
            addCriterion("delivery_city_id =", value, "deliveryCityId");
            return (Criteria) this;
        }

        public Criteria andDeliveryCityIdNotEqualTo(Integer value) {
            addCriterion("delivery_city_id <>", value, "deliveryCityId");
            return (Criteria) this;
        }

        public Criteria andDeliveryCityIdGreaterThan(Integer value) {
            addCriterion("delivery_city_id >", value, "deliveryCityId");
            return (Criteria) this;
        }

        public Criteria andDeliveryCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("delivery_city_id >=", value, "deliveryCityId");
            return (Criteria) this;
        }

        public Criteria andDeliveryCityIdLessThan(Integer value) {
            addCriterion("delivery_city_id <", value, "deliveryCityId");
            return (Criteria) this;
        }

        public Criteria andDeliveryCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("delivery_city_id <=", value, "deliveryCityId");
            return (Criteria) this;
        }

        public Criteria andDeliveryCityIdIn(List<Integer> values) {
            addCriterion("delivery_city_id in", values, "deliveryCityId");
            return (Criteria) this;
        }

        public Criteria andDeliveryCityIdNotIn(List<Integer> values) {
            addCriterion("delivery_city_id not in", values, "deliveryCityId");
            return (Criteria) this;
        }

        public Criteria andDeliveryCityIdBetween(Integer value1, Integer value2) {
            addCriterion("delivery_city_id between", value1, value2, "deliveryCityId");
            return (Criteria) this;
        }

        public Criteria andDeliveryCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("delivery_city_id not between", value1, value2, "deliveryCityId");
            return (Criteria) this;
        }

        public Criteria andBillingCityIdIsNull() {
            addCriterion("billing_city_id is null");
            return (Criteria) this;
        }

        public Criteria andBillingCityIdIsNotNull() {
            addCriterion("billing_city_id is not null");
            return (Criteria) this;
        }

        public Criteria andBillingCityIdEqualTo(Integer value) {
            addCriterion("billing_city_id =", value, "billingCityId");
            return (Criteria) this;
        }

        public Criteria andBillingCityIdNotEqualTo(Integer value) {
            addCriterion("billing_city_id <>", value, "billingCityId");
            return (Criteria) this;
        }

        public Criteria andBillingCityIdGreaterThan(Integer value) {
            addCriterion("billing_city_id >", value, "billingCityId");
            return (Criteria) this;
        }

        public Criteria andBillingCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("billing_city_id >=", value, "billingCityId");
            return (Criteria) this;
        }

        public Criteria andBillingCityIdLessThan(Integer value) {
            addCriterion("billing_city_id <", value, "billingCityId");
            return (Criteria) this;
        }

        public Criteria andBillingCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("billing_city_id <=", value, "billingCityId");
            return (Criteria) this;
        }

        public Criteria andBillingCityIdIn(List<Integer> values) {
            addCriterion("billing_city_id in", values, "billingCityId");
            return (Criteria) this;
        }

        public Criteria andBillingCityIdNotIn(List<Integer> values) {
            addCriterion("billing_city_id not in", values, "billingCityId");
            return (Criteria) this;
        }

        public Criteria andBillingCityIdBetween(Integer value1, Integer value2) {
            addCriterion("billing_city_id between", value1, value2, "billingCityId");
            return (Criteria) this;
        }

        public Criteria andBillingCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("billing_city_id not between", value1, value2, "billingCityId");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNull() {
            addCriterion("car_id is null");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNotNull() {
            addCriterion("car_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarIdEqualTo(Integer value) {
            addCriterion("car_id =", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotEqualTo(Integer value) {
            addCriterion("car_id <>", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThan(Integer value) {
            addCriterion("car_id >", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_id >=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThan(Integer value) {
            addCriterion("car_id <", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanOrEqualTo(Integer value) {
            addCriterion("car_id <=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdIn(List<Integer> values) {
            addCriterion("car_id in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotIn(List<Integer> values) {
            addCriterion("car_id not in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdBetween(Integer value1, Integer value2) {
            addCriterion("car_id between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotBetween(Integer value1, Integer value2) {
            addCriterion("car_id not between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andSupplyCarTypeIsNull() {
            addCriterion("supply_car_type is null");
            return (Criteria) this;
        }

        public Criteria andSupplyCarTypeIsNotNull() {
            addCriterion("supply_car_type is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyCarTypeEqualTo(Byte value) {
            addCriterion("supply_car_type =", value, "supplyCarType");
            return (Criteria) this;
        }

        public Criteria andSupplyCarTypeNotEqualTo(Byte value) {
            addCriterion("supply_car_type <>", value, "supplyCarType");
            return (Criteria) this;
        }

        public Criteria andSupplyCarTypeGreaterThan(Byte value) {
            addCriterion("supply_car_type >", value, "supplyCarType");
            return (Criteria) this;
        }

        public Criteria andSupplyCarTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("supply_car_type >=", value, "supplyCarType");
            return (Criteria) this;
        }

        public Criteria andSupplyCarTypeLessThan(Byte value) {
            addCriterion("supply_car_type <", value, "supplyCarType");
            return (Criteria) this;
        }

        public Criteria andSupplyCarTypeLessThanOrEqualTo(Byte value) {
            addCriterion("supply_car_type <=", value, "supplyCarType");
            return (Criteria) this;
        }

        public Criteria andSupplyCarTypeIn(List<Byte> values) {
            addCriterion("supply_car_type in", values, "supplyCarType");
            return (Criteria) this;
        }

        public Criteria andSupplyCarTypeNotIn(List<Byte> values) {
            addCriterion("supply_car_type not in", values, "supplyCarType");
            return (Criteria) this;
        }

        public Criteria andSupplyCarTypeBetween(Byte value1, Byte value2) {
            addCriterion("supply_car_type between", value1, value2, "supplyCarType");
            return (Criteria) this;
        }

        public Criteria andSupplyCarTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("supply_car_type not between", value1, value2, "supplyCarType");
            return (Criteria) this;
        }

        public Criteria andDownPaymentTimeIsNull() {
            addCriterion("down_payment_time is null");
            return (Criteria) this;
        }

        public Criteria andDownPaymentTimeIsNotNull() {
            addCriterion("down_payment_time is not null");
            return (Criteria) this;
        }

        public Criteria andDownPaymentTimeEqualTo(Long value) {
            addCriterion("down_payment_time =", value, "downPaymentTime");
            return (Criteria) this;
        }

        public Criteria andDownPaymentTimeNotEqualTo(Long value) {
            addCriterion("down_payment_time <>", value, "downPaymentTime");
            return (Criteria) this;
        }

        public Criteria andDownPaymentTimeGreaterThan(Long value) {
            addCriterion("down_payment_time >", value, "downPaymentTime");
            return (Criteria) this;
        }

        public Criteria andDownPaymentTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("down_payment_time >=", value, "downPaymentTime");
            return (Criteria) this;
        }

        public Criteria andDownPaymentTimeLessThan(Long value) {
            addCriterion("down_payment_time <", value, "downPaymentTime");
            return (Criteria) this;
        }

        public Criteria andDownPaymentTimeLessThanOrEqualTo(Long value) {
            addCriterion("down_payment_time <=", value, "downPaymentTime");
            return (Criteria) this;
        }

        public Criteria andDownPaymentTimeIn(List<Long> values) {
            addCriterion("down_payment_time in", values, "downPaymentTime");
            return (Criteria) this;
        }

        public Criteria andDownPaymentTimeNotIn(List<Long> values) {
            addCriterion("down_payment_time not in", values, "downPaymentTime");
            return (Criteria) this;
        }

        public Criteria andDownPaymentTimeBetween(Long value1, Long value2) {
            addCriterion("down_payment_time between", value1, value2, "downPaymentTime");
            return (Criteria) this;
        }

        public Criteria andDownPaymentTimeNotBetween(Long value1, Long value2) {
            addCriterion("down_payment_time not between", value1, value2, "downPaymentTime");
            return (Criteria) this;
        }

        public Criteria andDownPaymentStatusIsNull() {
            addCriterion("down_payment_status is null");
            return (Criteria) this;
        }

        public Criteria andDownPaymentStatusIsNotNull() {
            addCriterion("down_payment_status is not null");
            return (Criteria) this;
        }

        public Criteria andDownPaymentStatusEqualTo(Byte value) {
            addCriterion("down_payment_status =", value, "downPaymentStatus");
            return (Criteria) this;
        }

        public Criteria andDownPaymentStatusNotEqualTo(Byte value) {
            addCriterion("down_payment_status <>", value, "downPaymentStatus");
            return (Criteria) this;
        }

        public Criteria andDownPaymentStatusGreaterThan(Byte value) {
            addCriterion("down_payment_status >", value, "downPaymentStatus");
            return (Criteria) this;
        }

        public Criteria andDownPaymentStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("down_payment_status >=", value, "downPaymentStatus");
            return (Criteria) this;
        }

        public Criteria andDownPaymentStatusLessThan(Byte value) {
            addCriterion("down_payment_status <", value, "downPaymentStatus");
            return (Criteria) this;
        }

        public Criteria andDownPaymentStatusLessThanOrEqualTo(Byte value) {
            addCriterion("down_payment_status <=", value, "downPaymentStatus");
            return (Criteria) this;
        }

        public Criteria andDownPaymentStatusIn(List<Byte> values) {
            addCriterion("down_payment_status in", values, "downPaymentStatus");
            return (Criteria) this;
        }

        public Criteria andDownPaymentStatusNotIn(List<Byte> values) {
            addCriterion("down_payment_status not in", values, "downPaymentStatus");
            return (Criteria) this;
        }

        public Criteria andDownPaymentStatusBetween(Byte value1, Byte value2) {
            addCriterion("down_payment_status between", value1, value2, "downPaymentStatus");
            return (Criteria) this;
        }

        public Criteria andDownPaymentStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("down_payment_status not between", value1, value2, "downPaymentStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Byte value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Byte value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Byte value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Byte value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Byte value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Byte> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Byte> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Byte value1, Byte value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andPerformanceStatusIsNull() {
            addCriterion("performance_status is null");
            return (Criteria) this;
        }

        public Criteria andPerformanceStatusIsNotNull() {
            addCriterion("performance_status is not null");
            return (Criteria) this;
        }

        public Criteria andPerformanceStatusEqualTo(Byte value) {
            addCriterion("performance_status =", value, "performanceStatus");
            return (Criteria) this;
        }

        public Criteria andPerformanceStatusNotEqualTo(Byte value) {
            addCriterion("performance_status <>", value, "performanceStatus");
            return (Criteria) this;
        }

        public Criteria andPerformanceStatusGreaterThan(Byte value) {
            addCriterion("performance_status >", value, "performanceStatus");
            return (Criteria) this;
        }

        public Criteria andPerformanceStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("performance_status >=", value, "performanceStatus");
            return (Criteria) this;
        }

        public Criteria andPerformanceStatusLessThan(Byte value) {
            addCriterion("performance_status <", value, "performanceStatus");
            return (Criteria) this;
        }

        public Criteria andPerformanceStatusLessThanOrEqualTo(Byte value) {
            addCriterion("performance_status <=", value, "performanceStatus");
            return (Criteria) this;
        }

        public Criteria andPerformanceStatusIn(List<Byte> values) {
            addCriterion("performance_status in", values, "performanceStatus");
            return (Criteria) this;
        }

        public Criteria andPerformanceStatusNotIn(List<Byte> values) {
            addCriterion("performance_status not in", values, "performanceStatus");
            return (Criteria) this;
        }

        public Criteria andPerformanceStatusBetween(Byte value1, Byte value2) {
            addCriterion("performance_status between", value1, value2, "performanceStatus");
            return (Criteria) this;
        }

        public Criteria andPerformanceStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("performance_status not between", value1, value2, "performanceStatus");
            return (Criteria) this;
        }

        public Criteria andProcessNode1StartTimeIsNull() {
            addCriterion("process_node1_start_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode1StartTimeIsNotNull() {
            addCriterion("process_node1_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode1StartTimeEqualTo(Long value) {
            addCriterion("process_node1_start_time =", value, "processNode1StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode1StartTimeNotEqualTo(Long value) {
            addCriterion("process_node1_start_time <>", value, "processNode1StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode1StartTimeGreaterThan(Long value) {
            addCriterion("process_node1_start_time >", value, "processNode1StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode1StartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node1_start_time >=", value, "processNode1StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode1StartTimeLessThan(Long value) {
            addCriterion("process_node1_start_time <", value, "processNode1StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode1StartTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node1_start_time <=", value, "processNode1StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode1StartTimeIn(List<Long> values) {
            addCriterion("process_node1_start_time in", values, "processNode1StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode1StartTimeNotIn(List<Long> values) {
            addCriterion("process_node1_start_time not in", values, "processNode1StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode1StartTimeBetween(Long value1, Long value2) {
            addCriterion("process_node1_start_time between", value1, value2, "processNode1StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode1StartTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node1_start_time not between", value1, value2, "processNode1StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode1EndTimeIsNull() {
            addCriterion("process_node1_end_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode1EndTimeIsNotNull() {
            addCriterion("process_node1_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode1EndTimeEqualTo(Long value) {
            addCriterion("process_node1_end_time =", value, "processNode1EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode1EndTimeNotEqualTo(Long value) {
            addCriterion("process_node1_end_time <>", value, "processNode1EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode1EndTimeGreaterThan(Long value) {
            addCriterion("process_node1_end_time >", value, "processNode1EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode1EndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node1_end_time >=", value, "processNode1EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode1EndTimeLessThan(Long value) {
            addCriterion("process_node1_end_time <", value, "processNode1EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode1EndTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node1_end_time <=", value, "processNode1EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode1EndTimeIn(List<Long> values) {
            addCriterion("process_node1_end_time in", values, "processNode1EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode1EndTimeNotIn(List<Long> values) {
            addCriterion("process_node1_end_time not in", values, "processNode1EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode1EndTimeBetween(Long value1, Long value2) {
            addCriterion("process_node1_end_time between", value1, value2, "processNode1EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode1EndTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node1_end_time not between", value1, value2, "processNode1EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode2StartTimeIsNull() {
            addCriterion("process_node2_start_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode2StartTimeIsNotNull() {
            addCriterion("process_node2_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode2StartTimeEqualTo(Long value) {
            addCriterion("process_node2_start_time =", value, "processNode2StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode2StartTimeNotEqualTo(Long value) {
            addCriterion("process_node2_start_time <>", value, "processNode2StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode2StartTimeGreaterThan(Long value) {
            addCriterion("process_node2_start_time >", value, "processNode2StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode2StartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node2_start_time >=", value, "processNode2StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode2StartTimeLessThan(Long value) {
            addCriterion("process_node2_start_time <", value, "processNode2StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode2StartTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node2_start_time <=", value, "processNode2StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode2StartTimeIn(List<Long> values) {
            addCriterion("process_node2_start_time in", values, "processNode2StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode2StartTimeNotIn(List<Long> values) {
            addCriterion("process_node2_start_time not in", values, "processNode2StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode2StartTimeBetween(Long value1, Long value2) {
            addCriterion("process_node2_start_time between", value1, value2, "processNode2StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode2StartTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node2_start_time not between", value1, value2, "processNode2StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode2EndTimeIsNull() {
            addCriterion("process_node2_end_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode2EndTimeIsNotNull() {
            addCriterion("process_node2_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode2EndTimeEqualTo(Long value) {
            addCriterion("process_node2_end_time =", value, "processNode2EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode2EndTimeNotEqualTo(Long value) {
            addCriterion("process_node2_end_time <>", value, "processNode2EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode2EndTimeGreaterThan(Long value) {
            addCriterion("process_node2_end_time >", value, "processNode2EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode2EndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node2_end_time >=", value, "processNode2EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode2EndTimeLessThan(Long value) {
            addCriterion("process_node2_end_time <", value, "processNode2EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode2EndTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node2_end_time <=", value, "processNode2EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode2EndTimeIn(List<Long> values) {
            addCriterion("process_node2_end_time in", values, "processNode2EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode2EndTimeNotIn(List<Long> values) {
            addCriterion("process_node2_end_time not in", values, "processNode2EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode2EndTimeBetween(Long value1, Long value2) {
            addCriterion("process_node2_end_time between", value1, value2, "processNode2EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode2EndTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node2_end_time not between", value1, value2, "processNode2EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode3StartTimeIsNull() {
            addCriterion("process_node3_start_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode3StartTimeIsNotNull() {
            addCriterion("process_node3_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode3StartTimeEqualTo(Long value) {
            addCriterion("process_node3_start_time =", value, "processNode3StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode3StartTimeNotEqualTo(Long value) {
            addCriterion("process_node3_start_time <>", value, "processNode3StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode3StartTimeGreaterThan(Long value) {
            addCriterion("process_node3_start_time >", value, "processNode3StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode3StartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node3_start_time >=", value, "processNode3StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode3StartTimeLessThan(Long value) {
            addCriterion("process_node3_start_time <", value, "processNode3StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode3StartTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node3_start_time <=", value, "processNode3StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode3StartTimeIn(List<Long> values) {
            addCriterion("process_node3_start_time in", values, "processNode3StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode3StartTimeNotIn(List<Long> values) {
            addCriterion("process_node3_start_time not in", values, "processNode3StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode3StartTimeBetween(Long value1, Long value2) {
            addCriterion("process_node3_start_time between", value1, value2, "processNode3StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode3StartTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node3_start_time not between", value1, value2, "processNode3StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode3EndTimeIsNull() {
            addCriterion("process_node3_end_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode3EndTimeIsNotNull() {
            addCriterion("process_node3_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode3EndTimeEqualTo(Long value) {
            addCriterion("process_node3_end_time =", value, "processNode3EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode3EndTimeNotEqualTo(Long value) {
            addCriterion("process_node3_end_time <>", value, "processNode3EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode3EndTimeGreaterThan(Long value) {
            addCriterion("process_node3_end_time >", value, "processNode3EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode3EndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node3_end_time >=", value, "processNode3EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode3EndTimeLessThan(Long value) {
            addCriterion("process_node3_end_time <", value, "processNode3EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode3EndTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node3_end_time <=", value, "processNode3EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode3EndTimeIn(List<Long> values) {
            addCriterion("process_node3_end_time in", values, "processNode3EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode3EndTimeNotIn(List<Long> values) {
            addCriterion("process_node3_end_time not in", values, "processNode3EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode3EndTimeBetween(Long value1, Long value2) {
            addCriterion("process_node3_end_time between", value1, value2, "processNode3EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode3EndTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node3_end_time not between", value1, value2, "processNode3EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode4StartTimeIsNull() {
            addCriterion("process_node4_start_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode4StartTimeIsNotNull() {
            addCriterion("process_node4_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode4StartTimeEqualTo(Long value) {
            addCriterion("process_node4_start_time =", value, "processNode4StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode4StartTimeNotEqualTo(Long value) {
            addCriterion("process_node4_start_time <>", value, "processNode4StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode4StartTimeGreaterThan(Long value) {
            addCriterion("process_node4_start_time >", value, "processNode4StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode4StartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node4_start_time >=", value, "processNode4StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode4StartTimeLessThan(Long value) {
            addCriterion("process_node4_start_time <", value, "processNode4StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode4StartTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node4_start_time <=", value, "processNode4StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode4StartTimeIn(List<Long> values) {
            addCriterion("process_node4_start_time in", values, "processNode4StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode4StartTimeNotIn(List<Long> values) {
            addCriterion("process_node4_start_time not in", values, "processNode4StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode4StartTimeBetween(Long value1, Long value2) {
            addCriterion("process_node4_start_time between", value1, value2, "processNode4StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode4StartTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node4_start_time not between", value1, value2, "processNode4StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode4EndTimeIsNull() {
            addCriterion("process_node4_end_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode4EndTimeIsNotNull() {
            addCriterion("process_node4_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode4EndTimeEqualTo(Long value) {
            addCriterion("process_node4_end_time =", value, "processNode4EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode4EndTimeNotEqualTo(Long value) {
            addCriterion("process_node4_end_time <>", value, "processNode4EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode4EndTimeGreaterThan(Long value) {
            addCriterion("process_node4_end_time >", value, "processNode4EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode4EndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node4_end_time >=", value, "processNode4EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode4EndTimeLessThan(Long value) {
            addCriterion("process_node4_end_time <", value, "processNode4EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode4EndTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node4_end_time <=", value, "processNode4EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode4EndTimeIn(List<Long> values) {
            addCriterion("process_node4_end_time in", values, "processNode4EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode4EndTimeNotIn(List<Long> values) {
            addCriterion("process_node4_end_time not in", values, "processNode4EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode4EndTimeBetween(Long value1, Long value2) {
            addCriterion("process_node4_end_time between", value1, value2, "processNode4EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode4EndTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node4_end_time not between", value1, value2, "processNode4EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode5StartTimeIsNull() {
            addCriterion("process_node5_start_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode5StartTimeIsNotNull() {
            addCriterion("process_node5_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode5StartTimeEqualTo(Long value) {
            addCriterion("process_node5_start_time =", value, "processNode5StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode5StartTimeNotEqualTo(Long value) {
            addCriterion("process_node5_start_time <>", value, "processNode5StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode5StartTimeGreaterThan(Long value) {
            addCriterion("process_node5_start_time >", value, "processNode5StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode5StartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node5_start_time >=", value, "processNode5StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode5StartTimeLessThan(Long value) {
            addCriterion("process_node5_start_time <", value, "processNode5StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode5StartTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node5_start_time <=", value, "processNode5StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode5StartTimeIn(List<Long> values) {
            addCriterion("process_node5_start_time in", values, "processNode5StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode5StartTimeNotIn(List<Long> values) {
            addCriterion("process_node5_start_time not in", values, "processNode5StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode5StartTimeBetween(Long value1, Long value2) {
            addCriterion("process_node5_start_time between", value1, value2, "processNode5StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode5StartTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node5_start_time not between", value1, value2, "processNode5StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode5EndTimeIsNull() {
            addCriterion("process_node5_end_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode5EndTimeIsNotNull() {
            addCriterion("process_node5_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode5EndTimeEqualTo(Long value) {
            addCriterion("process_node5_end_time =", value, "processNode5EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode5EndTimeNotEqualTo(Long value) {
            addCriterion("process_node5_end_time <>", value, "processNode5EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode5EndTimeGreaterThan(Long value) {
            addCriterion("process_node5_end_time >", value, "processNode5EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode5EndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node5_end_time >=", value, "processNode5EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode5EndTimeLessThan(Long value) {
            addCriterion("process_node5_end_time <", value, "processNode5EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode5EndTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node5_end_time <=", value, "processNode5EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode5EndTimeIn(List<Long> values) {
            addCriterion("process_node5_end_time in", values, "processNode5EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode5EndTimeNotIn(List<Long> values) {
            addCriterion("process_node5_end_time not in", values, "processNode5EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode5EndTimeBetween(Long value1, Long value2) {
            addCriterion("process_node5_end_time between", value1, value2, "processNode5EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode5EndTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node5_end_time not between", value1, value2, "processNode5EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode6StartTimeIsNull() {
            addCriterion("process_node6_start_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode6StartTimeIsNotNull() {
            addCriterion("process_node6_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode6StartTimeEqualTo(Long value) {
            addCriterion("process_node6_start_time =", value, "processNode6StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode6StartTimeNotEqualTo(Long value) {
            addCriterion("process_node6_start_time <>", value, "processNode6StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode6StartTimeGreaterThan(Long value) {
            addCriterion("process_node6_start_time >", value, "processNode6StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode6StartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node6_start_time >=", value, "processNode6StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode6StartTimeLessThan(Long value) {
            addCriterion("process_node6_start_time <", value, "processNode6StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode6StartTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node6_start_time <=", value, "processNode6StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode6StartTimeIn(List<Long> values) {
            addCriterion("process_node6_start_time in", values, "processNode6StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode6StartTimeNotIn(List<Long> values) {
            addCriterion("process_node6_start_time not in", values, "processNode6StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode6StartTimeBetween(Long value1, Long value2) {
            addCriterion("process_node6_start_time between", value1, value2, "processNode6StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode6StartTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node6_start_time not between", value1, value2, "processNode6StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode6EndTimeIsNull() {
            addCriterion("process_node6_end_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode6EndTimeIsNotNull() {
            addCriterion("process_node6_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode6EndTimeEqualTo(Long value) {
            addCriterion("process_node6_end_time =", value, "processNode6EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode6EndTimeNotEqualTo(Long value) {
            addCriterion("process_node6_end_time <>", value, "processNode6EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode6EndTimeGreaterThan(Long value) {
            addCriterion("process_node6_end_time >", value, "processNode6EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode6EndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node6_end_time >=", value, "processNode6EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode6EndTimeLessThan(Long value) {
            addCriterion("process_node6_end_time <", value, "processNode6EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode6EndTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node6_end_time <=", value, "processNode6EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode6EndTimeIn(List<Long> values) {
            addCriterion("process_node6_end_time in", values, "processNode6EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode6EndTimeNotIn(List<Long> values) {
            addCriterion("process_node6_end_time not in", values, "processNode6EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode6EndTimeBetween(Long value1, Long value2) {
            addCriterion("process_node6_end_time between", value1, value2, "processNode6EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode6EndTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node6_end_time not between", value1, value2, "processNode6EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode7StartTimeIsNull() {
            addCriterion("process_node7_start_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode7StartTimeIsNotNull() {
            addCriterion("process_node7_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode7StartTimeEqualTo(Long value) {
            addCriterion("process_node7_start_time =", value, "processNode7StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode7StartTimeNotEqualTo(Long value) {
            addCriterion("process_node7_start_time <>", value, "processNode7StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode7StartTimeGreaterThan(Long value) {
            addCriterion("process_node7_start_time >", value, "processNode7StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode7StartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node7_start_time >=", value, "processNode7StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode7StartTimeLessThan(Long value) {
            addCriterion("process_node7_start_time <", value, "processNode7StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode7StartTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node7_start_time <=", value, "processNode7StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode7StartTimeIn(List<Long> values) {
            addCriterion("process_node7_start_time in", values, "processNode7StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode7StartTimeNotIn(List<Long> values) {
            addCriterion("process_node7_start_time not in", values, "processNode7StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode7StartTimeBetween(Long value1, Long value2) {
            addCriterion("process_node7_start_time between", value1, value2, "processNode7StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode7StartTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node7_start_time not between", value1, value2, "processNode7StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode7EndTimeIsNull() {
            addCriterion("process_node7_end_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode7EndTimeIsNotNull() {
            addCriterion("process_node7_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode7EndTimeEqualTo(Long value) {
            addCriterion("process_node7_end_time =", value, "processNode7EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode7EndTimeNotEqualTo(Long value) {
            addCriterion("process_node7_end_time <>", value, "processNode7EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode7EndTimeGreaterThan(Long value) {
            addCriterion("process_node7_end_time >", value, "processNode7EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode7EndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node7_end_time >=", value, "processNode7EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode7EndTimeLessThan(Long value) {
            addCriterion("process_node7_end_time <", value, "processNode7EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode7EndTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node7_end_time <=", value, "processNode7EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode7EndTimeIn(List<Long> values) {
            addCriterion("process_node7_end_time in", values, "processNode7EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode7EndTimeNotIn(List<Long> values) {
            addCriterion("process_node7_end_time not in", values, "processNode7EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode7EndTimeBetween(Long value1, Long value2) {
            addCriterion("process_node7_end_time between", value1, value2, "processNode7EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode7EndTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node7_end_time not between", value1, value2, "processNode7EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode8StartTimeIsNull() {
            addCriterion("process_node8_start_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode8StartTimeIsNotNull() {
            addCriterion("process_node8_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode8StartTimeEqualTo(Long value) {
            addCriterion("process_node8_start_time =", value, "processNode8StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode8StartTimeNotEqualTo(Long value) {
            addCriterion("process_node8_start_time <>", value, "processNode8StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode8StartTimeGreaterThan(Long value) {
            addCriterion("process_node8_start_time >", value, "processNode8StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode8StartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node8_start_time >=", value, "processNode8StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode8StartTimeLessThan(Long value) {
            addCriterion("process_node8_start_time <", value, "processNode8StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode8StartTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node8_start_time <=", value, "processNode8StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode8StartTimeIn(List<Long> values) {
            addCriterion("process_node8_start_time in", values, "processNode8StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode8StartTimeNotIn(List<Long> values) {
            addCriterion("process_node8_start_time not in", values, "processNode8StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode8StartTimeBetween(Long value1, Long value2) {
            addCriterion("process_node8_start_time between", value1, value2, "processNode8StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode8StartTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node8_start_time not between", value1, value2, "processNode8StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode8EndTimeIsNull() {
            addCriterion("process_node8_end_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode8EndTimeIsNotNull() {
            addCriterion("process_node8_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode8EndTimeEqualTo(Long value) {
            addCriterion("process_node8_end_time =", value, "processNode8EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode8EndTimeNotEqualTo(Long value) {
            addCriterion("process_node8_end_time <>", value, "processNode8EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode8EndTimeGreaterThan(Long value) {
            addCriterion("process_node8_end_time >", value, "processNode8EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode8EndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node8_end_time >=", value, "processNode8EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode8EndTimeLessThan(Long value) {
            addCriterion("process_node8_end_time <", value, "processNode8EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode8EndTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node8_end_time <=", value, "processNode8EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode8EndTimeIn(List<Long> values) {
            addCriterion("process_node8_end_time in", values, "processNode8EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode8EndTimeNotIn(List<Long> values) {
            addCriterion("process_node8_end_time not in", values, "processNode8EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode8EndTimeBetween(Long value1, Long value2) {
            addCriterion("process_node8_end_time between", value1, value2, "processNode8EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode8EndTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node8_end_time not between", value1, value2, "processNode8EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode9StartTimeIsNull() {
            addCriterion("process_node9_start_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode9StartTimeIsNotNull() {
            addCriterion("process_node9_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode9StartTimeEqualTo(Long value) {
            addCriterion("process_node9_start_time =", value, "processNode9StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode9StartTimeNotEqualTo(Long value) {
            addCriterion("process_node9_start_time <>", value, "processNode9StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode9StartTimeGreaterThan(Long value) {
            addCriterion("process_node9_start_time >", value, "processNode9StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode9StartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node9_start_time >=", value, "processNode9StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode9StartTimeLessThan(Long value) {
            addCriterion("process_node9_start_time <", value, "processNode9StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode9StartTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node9_start_time <=", value, "processNode9StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode9StartTimeIn(List<Long> values) {
            addCriterion("process_node9_start_time in", values, "processNode9StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode9StartTimeNotIn(List<Long> values) {
            addCriterion("process_node9_start_time not in", values, "processNode9StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode9StartTimeBetween(Long value1, Long value2) {
            addCriterion("process_node9_start_time between", value1, value2, "processNode9StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode9StartTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node9_start_time not between", value1, value2, "processNode9StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode9EndTimeIsNull() {
            addCriterion("process_node9_end_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode9EndTimeIsNotNull() {
            addCriterion("process_node9_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode9EndTimeEqualTo(Long value) {
            addCriterion("process_node9_end_time =", value, "processNode9EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode9EndTimeNotEqualTo(Long value) {
            addCriterion("process_node9_end_time <>", value, "processNode9EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode9EndTimeGreaterThan(Long value) {
            addCriterion("process_node9_end_time >", value, "processNode9EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode9EndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node9_end_time >=", value, "processNode9EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode9EndTimeLessThan(Long value) {
            addCriterion("process_node9_end_time <", value, "processNode9EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode9EndTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node9_end_time <=", value, "processNode9EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode9EndTimeIn(List<Long> values) {
            addCriterion("process_node9_end_time in", values, "processNode9EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode9EndTimeNotIn(List<Long> values) {
            addCriterion("process_node9_end_time not in", values, "processNode9EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode9EndTimeBetween(Long value1, Long value2) {
            addCriterion("process_node9_end_time between", value1, value2, "processNode9EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode9EndTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node9_end_time not between", value1, value2, "processNode9EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode10StartTimeIsNull() {
            addCriterion("process_node10_start_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode10StartTimeIsNotNull() {
            addCriterion("process_node10_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode10StartTimeEqualTo(Long value) {
            addCriterion("process_node10_start_time =", value, "processNode10StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode10StartTimeNotEqualTo(Long value) {
            addCriterion("process_node10_start_time <>", value, "processNode10StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode10StartTimeGreaterThan(Long value) {
            addCriterion("process_node10_start_time >", value, "processNode10StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode10StartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node10_start_time >=", value, "processNode10StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode10StartTimeLessThan(Long value) {
            addCriterion("process_node10_start_time <", value, "processNode10StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode10StartTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node10_start_time <=", value, "processNode10StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode10StartTimeIn(List<Long> values) {
            addCriterion("process_node10_start_time in", values, "processNode10StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode10StartTimeNotIn(List<Long> values) {
            addCriterion("process_node10_start_time not in", values, "processNode10StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode10StartTimeBetween(Long value1, Long value2) {
            addCriterion("process_node10_start_time between", value1, value2, "processNode10StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode10StartTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node10_start_time not between", value1, value2, "processNode10StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode10EndTimeIsNull() {
            addCriterion("process_node10_end_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode10EndTimeIsNotNull() {
            addCriterion("process_node10_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode10EndTimeEqualTo(Long value) {
            addCriterion("process_node10_end_time =", value, "processNode10EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode10EndTimeNotEqualTo(Long value) {
            addCriterion("process_node10_end_time <>", value, "processNode10EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode10EndTimeGreaterThan(Long value) {
            addCriterion("process_node10_end_time >", value, "processNode10EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode10EndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node10_end_time >=", value, "processNode10EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode10EndTimeLessThan(Long value) {
            addCriterion("process_node10_end_time <", value, "processNode10EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode10EndTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node10_end_time <=", value, "processNode10EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode10EndTimeIn(List<Long> values) {
            addCriterion("process_node10_end_time in", values, "processNode10EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode10EndTimeNotIn(List<Long> values) {
            addCriterion("process_node10_end_time not in", values, "processNode10EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode10EndTimeBetween(Long value1, Long value2) {
            addCriterion("process_node10_end_time between", value1, value2, "processNode10EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode10EndTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node10_end_time not between", value1, value2, "processNode10EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode11StartTimeIsNull() {
            addCriterion("process_node11_start_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode11StartTimeIsNotNull() {
            addCriterion("process_node11_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode11StartTimeEqualTo(Long value) {
            addCriterion("process_node11_start_time =", value, "processNode11StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode11StartTimeNotEqualTo(Long value) {
            addCriterion("process_node11_start_time <>", value, "processNode11StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode11StartTimeGreaterThan(Long value) {
            addCriterion("process_node11_start_time >", value, "processNode11StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode11StartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node11_start_time >=", value, "processNode11StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode11StartTimeLessThan(Long value) {
            addCriterion("process_node11_start_time <", value, "processNode11StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode11StartTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node11_start_time <=", value, "processNode11StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode11StartTimeIn(List<Long> values) {
            addCriterion("process_node11_start_time in", values, "processNode11StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode11StartTimeNotIn(List<Long> values) {
            addCriterion("process_node11_start_time not in", values, "processNode11StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode11StartTimeBetween(Long value1, Long value2) {
            addCriterion("process_node11_start_time between", value1, value2, "processNode11StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode11StartTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node11_start_time not between", value1, value2, "processNode11StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode11EndTimeIsNull() {
            addCriterion("process_node11_end_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode11EndTimeIsNotNull() {
            addCriterion("process_node11_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode11EndTimeEqualTo(Long value) {
            addCriterion("process_node11_end_time =", value, "processNode11EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode11EndTimeNotEqualTo(Long value) {
            addCriterion("process_node11_end_time <>", value, "processNode11EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode11EndTimeGreaterThan(Long value) {
            addCriterion("process_node11_end_time >", value, "processNode11EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode11EndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node11_end_time >=", value, "processNode11EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode11EndTimeLessThan(Long value) {
            addCriterion("process_node11_end_time <", value, "processNode11EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode11EndTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node11_end_time <=", value, "processNode11EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode11EndTimeIn(List<Long> values) {
            addCriterion("process_node11_end_time in", values, "processNode11EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode11EndTimeNotIn(List<Long> values) {
            addCriterion("process_node11_end_time not in", values, "processNode11EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode11EndTimeBetween(Long value1, Long value2) {
            addCriterion("process_node11_end_time between", value1, value2, "processNode11EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode11EndTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node11_end_time not between", value1, value2, "processNode11EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode12StartTimeIsNull() {
            addCriterion("process_node12_start_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode12StartTimeIsNotNull() {
            addCriterion("process_node12_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode12StartTimeEqualTo(Long value) {
            addCriterion("process_node12_start_time =", value, "processNode12StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode12StartTimeNotEqualTo(Long value) {
            addCriterion("process_node12_start_time <>", value, "processNode12StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode12StartTimeGreaterThan(Long value) {
            addCriterion("process_node12_start_time >", value, "processNode12StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode12StartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node12_start_time >=", value, "processNode12StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode12StartTimeLessThan(Long value) {
            addCriterion("process_node12_start_time <", value, "processNode12StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode12StartTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node12_start_time <=", value, "processNode12StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode12StartTimeIn(List<Long> values) {
            addCriterion("process_node12_start_time in", values, "processNode12StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode12StartTimeNotIn(List<Long> values) {
            addCriterion("process_node12_start_time not in", values, "processNode12StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode12StartTimeBetween(Long value1, Long value2) {
            addCriterion("process_node12_start_time between", value1, value2, "processNode12StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode12StartTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node12_start_time not between", value1, value2, "processNode12StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode12EndTimeIsNull() {
            addCriterion("process_node12_end_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode12EndTimeIsNotNull() {
            addCriterion("process_node12_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode12EndTimeEqualTo(Long value) {
            addCriterion("process_node12_end_time =", value, "processNode12EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode12EndTimeNotEqualTo(Long value) {
            addCriterion("process_node12_end_time <>", value, "processNode12EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode12EndTimeGreaterThan(Long value) {
            addCriterion("process_node12_end_time >", value, "processNode12EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode12EndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node12_end_time >=", value, "processNode12EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode12EndTimeLessThan(Long value) {
            addCriterion("process_node12_end_time <", value, "processNode12EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode12EndTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node12_end_time <=", value, "processNode12EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode12EndTimeIn(List<Long> values) {
            addCriterion("process_node12_end_time in", values, "processNode12EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode12EndTimeNotIn(List<Long> values) {
            addCriterion("process_node12_end_time not in", values, "processNode12EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode12EndTimeBetween(Long value1, Long value2) {
            addCriterion("process_node12_end_time between", value1, value2, "processNode12EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode12EndTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node12_end_time not between", value1, value2, "processNode12EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode13StartTimeIsNull() {
            addCriterion("process_node13_start_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode13StartTimeIsNotNull() {
            addCriterion("process_node13_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode13StartTimeEqualTo(Long value) {
            addCriterion("process_node13_start_time =", value, "processNode13StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode13StartTimeNotEqualTo(Long value) {
            addCriterion("process_node13_start_time <>", value, "processNode13StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode13StartTimeGreaterThan(Long value) {
            addCriterion("process_node13_start_time >", value, "processNode13StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode13StartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node13_start_time >=", value, "processNode13StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode13StartTimeLessThan(Long value) {
            addCriterion("process_node13_start_time <", value, "processNode13StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode13StartTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node13_start_time <=", value, "processNode13StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode13StartTimeIn(List<Long> values) {
            addCriterion("process_node13_start_time in", values, "processNode13StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode13StartTimeNotIn(List<Long> values) {
            addCriterion("process_node13_start_time not in", values, "processNode13StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode13StartTimeBetween(Long value1, Long value2) {
            addCriterion("process_node13_start_time between", value1, value2, "processNode13StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode13StartTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node13_start_time not between", value1, value2, "processNode13StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode13EndTimeIsNull() {
            addCriterion("process_node13_end_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode13EndTimeIsNotNull() {
            addCriterion("process_node13_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode13EndTimeEqualTo(Long value) {
            addCriterion("process_node13_end_time =", value, "processNode13EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode13EndTimeNotEqualTo(Long value) {
            addCriterion("process_node13_end_time <>", value, "processNode13EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode13EndTimeGreaterThan(Long value) {
            addCriterion("process_node13_end_time >", value, "processNode13EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode13EndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node13_end_time >=", value, "processNode13EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode13EndTimeLessThan(Long value) {
            addCriterion("process_node13_end_time <", value, "processNode13EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode13EndTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node13_end_time <=", value, "processNode13EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode13EndTimeIn(List<Long> values) {
            addCriterion("process_node13_end_time in", values, "processNode13EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode13EndTimeNotIn(List<Long> values) {
            addCriterion("process_node13_end_time not in", values, "processNode13EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode13EndTimeBetween(Long value1, Long value2) {
            addCriterion("process_node13_end_time between", value1, value2, "processNode13EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode13EndTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node13_end_time not between", value1, value2, "processNode13EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode14StartTimeIsNull() {
            addCriterion("process_node14_start_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode14StartTimeIsNotNull() {
            addCriterion("process_node14_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode14StartTimeEqualTo(Long value) {
            addCriterion("process_node14_start_time =", value, "processNode14StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode14StartTimeNotEqualTo(Long value) {
            addCriterion("process_node14_start_time <>", value, "processNode14StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode14StartTimeGreaterThan(Long value) {
            addCriterion("process_node14_start_time >", value, "processNode14StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode14StartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node14_start_time >=", value, "processNode14StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode14StartTimeLessThan(Long value) {
            addCriterion("process_node14_start_time <", value, "processNode14StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode14StartTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node14_start_time <=", value, "processNode14StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode14StartTimeIn(List<Long> values) {
            addCriterion("process_node14_start_time in", values, "processNode14StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode14StartTimeNotIn(List<Long> values) {
            addCriterion("process_node14_start_time not in", values, "processNode14StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode14StartTimeBetween(Long value1, Long value2) {
            addCriterion("process_node14_start_time between", value1, value2, "processNode14StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode14StartTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node14_start_time not between", value1, value2, "processNode14StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode14EndTimeIsNull() {
            addCriterion("process_node14_end_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode14EndTimeIsNotNull() {
            addCriterion("process_node14_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode14EndTimeEqualTo(Long value) {
            addCriterion("process_node14_end_time =", value, "processNode14EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode14EndTimeNotEqualTo(Long value) {
            addCriterion("process_node14_end_time <>", value, "processNode14EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode14EndTimeGreaterThan(Long value) {
            addCriterion("process_node14_end_time >", value, "processNode14EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode14EndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node14_end_time >=", value, "processNode14EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode14EndTimeLessThan(Long value) {
            addCriterion("process_node14_end_time <", value, "processNode14EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode14EndTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node14_end_time <=", value, "processNode14EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode14EndTimeIn(List<Long> values) {
            addCriterion("process_node14_end_time in", values, "processNode14EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode14EndTimeNotIn(List<Long> values) {
            addCriterion("process_node14_end_time not in", values, "processNode14EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode14EndTimeBetween(Long value1, Long value2) {
            addCriterion("process_node14_end_time between", value1, value2, "processNode14EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode14EndTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node14_end_time not between", value1, value2, "processNode14EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode15StartTimeIsNull() {
            addCriterion("process_node15_start_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode15StartTimeIsNotNull() {
            addCriterion("process_node15_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode15StartTimeEqualTo(Long value) {
            addCriterion("process_node15_start_time =", value, "processNode15StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode15StartTimeNotEqualTo(Long value) {
            addCriterion("process_node15_start_time <>", value, "processNode15StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode15StartTimeGreaterThan(Long value) {
            addCriterion("process_node15_start_time >", value, "processNode15StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode15StartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node15_start_time >=", value, "processNode15StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode15StartTimeLessThan(Long value) {
            addCriterion("process_node15_start_time <", value, "processNode15StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode15StartTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node15_start_time <=", value, "processNode15StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode15StartTimeIn(List<Long> values) {
            addCriterion("process_node15_start_time in", values, "processNode15StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode15StartTimeNotIn(List<Long> values) {
            addCriterion("process_node15_start_time not in", values, "processNode15StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode15StartTimeBetween(Long value1, Long value2) {
            addCriterion("process_node15_start_time between", value1, value2, "processNode15StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode15StartTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node15_start_time not between", value1, value2, "processNode15StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode15EndTimeIsNull() {
            addCriterion("process_node15_end_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode15EndTimeIsNotNull() {
            addCriterion("process_node15_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode15EndTimeEqualTo(Long value) {
            addCriterion("process_node15_end_time =", value, "processNode15EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode15EndTimeNotEqualTo(Long value) {
            addCriterion("process_node15_end_time <>", value, "processNode15EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode15EndTimeGreaterThan(Long value) {
            addCriterion("process_node15_end_time >", value, "processNode15EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode15EndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node15_end_time >=", value, "processNode15EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode15EndTimeLessThan(Long value) {
            addCriterion("process_node15_end_time <", value, "processNode15EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode15EndTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node15_end_time <=", value, "processNode15EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode15EndTimeIn(List<Long> values) {
            addCriterion("process_node15_end_time in", values, "processNode15EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode15EndTimeNotIn(List<Long> values) {
            addCriterion("process_node15_end_time not in", values, "processNode15EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode15EndTimeBetween(Long value1, Long value2) {
            addCriterion("process_node15_end_time between", value1, value2, "processNode15EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode15EndTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node15_end_time not between", value1, value2, "processNode15EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode16StartTimeIsNull() {
            addCriterion("process_node16_start_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode16StartTimeIsNotNull() {
            addCriterion("process_node16_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode16StartTimeEqualTo(Long value) {
            addCriterion("process_node16_start_time =", value, "processNode16StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode16StartTimeNotEqualTo(Long value) {
            addCriterion("process_node16_start_time <>", value, "processNode16StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode16StartTimeGreaterThan(Long value) {
            addCriterion("process_node16_start_time >", value, "processNode16StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode16StartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node16_start_time >=", value, "processNode16StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode16StartTimeLessThan(Long value) {
            addCriterion("process_node16_start_time <", value, "processNode16StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode16StartTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node16_start_time <=", value, "processNode16StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode16StartTimeIn(List<Long> values) {
            addCriterion("process_node16_start_time in", values, "processNode16StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode16StartTimeNotIn(List<Long> values) {
            addCriterion("process_node16_start_time not in", values, "processNode16StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode16StartTimeBetween(Long value1, Long value2) {
            addCriterion("process_node16_start_time between", value1, value2, "processNode16StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode16StartTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node16_start_time not between", value1, value2, "processNode16StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode16EndTimeIsNull() {
            addCriterion("process_node16_end_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode16EndTimeIsNotNull() {
            addCriterion("process_node16_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode16EndTimeEqualTo(Long value) {
            addCriterion("process_node16_end_time =", value, "processNode16EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode16EndTimeNotEqualTo(Long value) {
            addCriterion("process_node16_end_time <>", value, "processNode16EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode16EndTimeGreaterThan(Long value) {
            addCriterion("process_node16_end_time >", value, "processNode16EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode16EndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node16_end_time >=", value, "processNode16EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode16EndTimeLessThan(Long value) {
            addCriterion("process_node16_end_time <", value, "processNode16EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode16EndTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node16_end_time <=", value, "processNode16EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode16EndTimeIn(List<Long> values) {
            addCriterion("process_node16_end_time in", values, "processNode16EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode16EndTimeNotIn(List<Long> values) {
            addCriterion("process_node16_end_time not in", values, "processNode16EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode16EndTimeBetween(Long value1, Long value2) {
            addCriterion("process_node16_end_time between", value1, value2, "processNode16EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode16EndTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node16_end_time not between", value1, value2, "processNode16EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode17StartTimeIsNull() {
            addCriterion("process_node17_start_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode17StartTimeIsNotNull() {
            addCriterion("process_node17_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode17StartTimeEqualTo(Long value) {
            addCriterion("process_node17_start_time =", value, "processNode17StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode17StartTimeNotEqualTo(Long value) {
            addCriterion("process_node17_start_time <>", value, "processNode17StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode17StartTimeGreaterThan(Long value) {
            addCriterion("process_node17_start_time >", value, "processNode17StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode17StartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node17_start_time >=", value, "processNode17StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode17StartTimeLessThan(Long value) {
            addCriterion("process_node17_start_time <", value, "processNode17StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode17StartTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node17_start_time <=", value, "processNode17StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode17StartTimeIn(List<Long> values) {
            addCriterion("process_node17_start_time in", values, "processNode17StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode17StartTimeNotIn(List<Long> values) {
            addCriterion("process_node17_start_time not in", values, "processNode17StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode17StartTimeBetween(Long value1, Long value2) {
            addCriterion("process_node17_start_time between", value1, value2, "processNode17StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode17StartTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node17_start_time not between", value1, value2, "processNode17StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode17EndTimeIsNull() {
            addCriterion("process_node17_end_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode17EndTimeIsNotNull() {
            addCriterion("process_node17_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode17EndTimeEqualTo(Long value) {
            addCriterion("process_node17_end_time =", value, "processNode17EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode17EndTimeNotEqualTo(Long value) {
            addCriterion("process_node17_end_time <>", value, "processNode17EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode17EndTimeGreaterThan(Long value) {
            addCriterion("process_node17_end_time >", value, "processNode17EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode17EndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node17_end_time >=", value, "processNode17EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode17EndTimeLessThan(Long value) {
            addCriterion("process_node17_end_time <", value, "processNode17EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode17EndTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node17_end_time <=", value, "processNode17EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode17EndTimeIn(List<Long> values) {
            addCriterion("process_node17_end_time in", values, "processNode17EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode17EndTimeNotIn(List<Long> values) {
            addCriterion("process_node17_end_time not in", values, "processNode17EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode17EndTimeBetween(Long value1, Long value2) {
            addCriterion("process_node17_end_time between", value1, value2, "processNode17EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode17EndTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node17_end_time not between", value1, value2, "processNode17EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode18StartTimeIsNull() {
            addCriterion("process_node18_start_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode18StartTimeIsNotNull() {
            addCriterion("process_node18_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode18StartTimeEqualTo(Long value) {
            addCriterion("process_node18_start_time =", value, "processNode18StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode18StartTimeNotEqualTo(Long value) {
            addCriterion("process_node18_start_time <>", value, "processNode18StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode18StartTimeGreaterThan(Long value) {
            addCriterion("process_node18_start_time >", value, "processNode18StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode18StartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node18_start_time >=", value, "processNode18StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode18StartTimeLessThan(Long value) {
            addCriterion("process_node18_start_time <", value, "processNode18StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode18StartTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node18_start_time <=", value, "processNode18StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode18StartTimeIn(List<Long> values) {
            addCriterion("process_node18_start_time in", values, "processNode18StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode18StartTimeNotIn(List<Long> values) {
            addCriterion("process_node18_start_time not in", values, "processNode18StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode18StartTimeBetween(Long value1, Long value2) {
            addCriterion("process_node18_start_time between", value1, value2, "processNode18StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode18StartTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node18_start_time not between", value1, value2, "processNode18StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode18EndTimeIsNull() {
            addCriterion("process_node18_end_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode18EndTimeIsNotNull() {
            addCriterion("process_node18_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode18EndTimeEqualTo(Long value) {
            addCriterion("process_node18_end_time =", value, "processNode18EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode18EndTimeNotEqualTo(Long value) {
            addCriterion("process_node18_end_time <>", value, "processNode18EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode18EndTimeGreaterThan(Long value) {
            addCriterion("process_node18_end_time >", value, "processNode18EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode18EndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node18_end_time >=", value, "processNode18EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode18EndTimeLessThan(Long value) {
            addCriterion("process_node18_end_time <", value, "processNode18EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode18EndTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node18_end_time <=", value, "processNode18EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode18EndTimeIn(List<Long> values) {
            addCriterion("process_node18_end_time in", values, "processNode18EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode18EndTimeNotIn(List<Long> values) {
            addCriterion("process_node18_end_time not in", values, "processNode18EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode18EndTimeBetween(Long value1, Long value2) {
            addCriterion("process_node18_end_time between", value1, value2, "processNode18EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode18EndTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node18_end_time not between", value1, value2, "processNode18EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode19StartTimeIsNull() {
            addCriterion("process_node19_start_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode19StartTimeIsNotNull() {
            addCriterion("process_node19_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode19StartTimeEqualTo(Long value) {
            addCriterion("process_node19_start_time =", value, "processNode19StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode19StartTimeNotEqualTo(Long value) {
            addCriterion("process_node19_start_time <>", value, "processNode19StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode19StartTimeGreaterThan(Long value) {
            addCriterion("process_node19_start_time >", value, "processNode19StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode19StartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node19_start_time >=", value, "processNode19StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode19StartTimeLessThan(Long value) {
            addCriterion("process_node19_start_time <", value, "processNode19StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode19StartTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node19_start_time <=", value, "processNode19StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode19StartTimeIn(List<Long> values) {
            addCriterion("process_node19_start_time in", values, "processNode19StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode19StartTimeNotIn(List<Long> values) {
            addCriterion("process_node19_start_time not in", values, "processNode19StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode19StartTimeBetween(Long value1, Long value2) {
            addCriterion("process_node19_start_time between", value1, value2, "processNode19StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode19StartTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node19_start_time not between", value1, value2, "processNode19StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode19EndTimeIsNull() {
            addCriterion("process_node19_end_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode19EndTimeIsNotNull() {
            addCriterion("process_node19_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode19EndTimeEqualTo(Long value) {
            addCriterion("process_node19_end_time =", value, "processNode19EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode19EndTimeNotEqualTo(Long value) {
            addCriterion("process_node19_end_time <>", value, "processNode19EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode19EndTimeGreaterThan(Long value) {
            addCriterion("process_node19_end_time >", value, "processNode19EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode19EndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node19_end_time >=", value, "processNode19EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode19EndTimeLessThan(Long value) {
            addCriterion("process_node19_end_time <", value, "processNode19EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode19EndTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node19_end_time <=", value, "processNode19EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode19EndTimeIn(List<Long> values) {
            addCriterion("process_node19_end_time in", values, "processNode19EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode19EndTimeNotIn(List<Long> values) {
            addCriterion("process_node19_end_time not in", values, "processNode19EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode19EndTimeBetween(Long value1, Long value2) {
            addCriterion("process_node19_end_time between", value1, value2, "processNode19EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode19EndTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node19_end_time not between", value1, value2, "processNode19EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode20StartTimeIsNull() {
            addCriterion("process_node20_start_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode20StartTimeIsNotNull() {
            addCriterion("process_node20_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode20StartTimeEqualTo(Long value) {
            addCriterion("process_node20_start_time =", value, "processNode20StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode20StartTimeNotEqualTo(Long value) {
            addCriterion("process_node20_start_time <>", value, "processNode20StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode20StartTimeGreaterThan(Long value) {
            addCriterion("process_node20_start_time >", value, "processNode20StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode20StartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node20_start_time >=", value, "processNode20StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode20StartTimeLessThan(Long value) {
            addCriterion("process_node20_start_time <", value, "processNode20StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode20StartTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node20_start_time <=", value, "processNode20StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode20StartTimeIn(List<Long> values) {
            addCriterion("process_node20_start_time in", values, "processNode20StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode20StartTimeNotIn(List<Long> values) {
            addCriterion("process_node20_start_time not in", values, "processNode20StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode20StartTimeBetween(Long value1, Long value2) {
            addCriterion("process_node20_start_time between", value1, value2, "processNode20StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode20StartTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node20_start_time not between", value1, value2, "processNode20StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode20EndTimeIsNull() {
            addCriterion("process_node20_end_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode20EndTimeIsNotNull() {
            addCriterion("process_node20_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode20EndTimeEqualTo(Long value) {
            addCriterion("process_node20_end_time =", value, "processNode20EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode20EndTimeNotEqualTo(Long value) {
            addCriterion("process_node20_end_time <>", value, "processNode20EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode20EndTimeGreaterThan(Long value) {
            addCriterion("process_node20_end_time >", value, "processNode20EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode20EndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node20_end_time >=", value, "processNode20EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode20EndTimeLessThan(Long value) {
            addCriterion("process_node20_end_time <", value, "processNode20EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode20EndTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node20_end_time <=", value, "processNode20EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode20EndTimeIn(List<Long> values) {
            addCriterion("process_node20_end_time in", values, "processNode20EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode20EndTimeNotIn(List<Long> values) {
            addCriterion("process_node20_end_time not in", values, "processNode20EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode20EndTimeBetween(Long value1, Long value2) {
            addCriterion("process_node20_end_time between", value1, value2, "processNode20EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode20EndTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node20_end_time not between", value1, value2, "processNode20EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode21StartTimeIsNull() {
            addCriterion("process_node21_start_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode21StartTimeIsNotNull() {
            addCriterion("process_node21_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode21StartTimeEqualTo(Long value) {
            addCriterion("process_node21_start_time =", value, "processNode21StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode21StartTimeNotEqualTo(Long value) {
            addCriterion("process_node21_start_time <>", value, "processNode21StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode21StartTimeGreaterThan(Long value) {
            addCriterion("process_node21_start_time >", value, "processNode21StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode21StartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node21_start_time >=", value, "processNode21StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode21StartTimeLessThan(Long value) {
            addCriterion("process_node21_start_time <", value, "processNode21StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode21StartTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node21_start_time <=", value, "processNode21StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode21StartTimeIn(List<Long> values) {
            addCriterion("process_node21_start_time in", values, "processNode21StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode21StartTimeNotIn(List<Long> values) {
            addCriterion("process_node21_start_time not in", values, "processNode21StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode21StartTimeBetween(Long value1, Long value2) {
            addCriterion("process_node21_start_time between", value1, value2, "processNode21StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode21StartTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node21_start_time not between", value1, value2, "processNode21StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode21EndTimeIsNull() {
            addCriterion("process_node21_end_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode21EndTimeIsNotNull() {
            addCriterion("process_node21_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode21EndTimeEqualTo(Long value) {
            addCriterion("process_node21_end_time =", value, "processNode21EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode21EndTimeNotEqualTo(Long value) {
            addCriterion("process_node21_end_time <>", value, "processNode21EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode21EndTimeGreaterThan(Long value) {
            addCriterion("process_node21_end_time >", value, "processNode21EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode21EndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node21_end_time >=", value, "processNode21EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode21EndTimeLessThan(Long value) {
            addCriterion("process_node21_end_time <", value, "processNode21EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode21EndTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node21_end_time <=", value, "processNode21EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode21EndTimeIn(List<Long> values) {
            addCriterion("process_node21_end_time in", values, "processNode21EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode21EndTimeNotIn(List<Long> values) {
            addCriterion("process_node21_end_time not in", values, "processNode21EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode21EndTimeBetween(Long value1, Long value2) {
            addCriterion("process_node21_end_time between", value1, value2, "processNode21EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode21EndTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node21_end_time not between", value1, value2, "processNode21EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode22StartTimeIsNull() {
            addCriterion("process_node22_start_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode22StartTimeIsNotNull() {
            addCriterion("process_node22_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode22StartTimeEqualTo(Long value) {
            addCriterion("process_node22_start_time =", value, "processNode22StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode22StartTimeNotEqualTo(Long value) {
            addCriterion("process_node22_start_time <>", value, "processNode22StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode22StartTimeGreaterThan(Long value) {
            addCriterion("process_node22_start_time >", value, "processNode22StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode22StartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node22_start_time >=", value, "processNode22StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode22StartTimeLessThan(Long value) {
            addCriterion("process_node22_start_time <", value, "processNode22StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode22StartTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node22_start_time <=", value, "processNode22StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode22StartTimeIn(List<Long> values) {
            addCriterion("process_node22_start_time in", values, "processNode22StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode22StartTimeNotIn(List<Long> values) {
            addCriterion("process_node22_start_time not in", values, "processNode22StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode22StartTimeBetween(Long value1, Long value2) {
            addCriterion("process_node22_start_time between", value1, value2, "processNode22StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode22StartTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node22_start_time not between", value1, value2, "processNode22StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode22EndTimeIsNull() {
            addCriterion("process_node22_end_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode22EndTimeIsNotNull() {
            addCriterion("process_node22_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode22EndTimeEqualTo(Long value) {
            addCriterion("process_node22_end_time =", value, "processNode22EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode22EndTimeNotEqualTo(Long value) {
            addCriterion("process_node22_end_time <>", value, "processNode22EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode22EndTimeGreaterThan(Long value) {
            addCriterion("process_node22_end_time >", value, "processNode22EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode22EndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node22_end_time >=", value, "processNode22EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode22EndTimeLessThan(Long value) {
            addCriterion("process_node22_end_time <", value, "processNode22EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode22EndTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node22_end_time <=", value, "processNode22EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode22EndTimeIn(List<Long> values) {
            addCriterion("process_node22_end_time in", values, "processNode22EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode22EndTimeNotIn(List<Long> values) {
            addCriterion("process_node22_end_time not in", values, "processNode22EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode22EndTimeBetween(Long value1, Long value2) {
            addCriterion("process_node22_end_time between", value1, value2, "processNode22EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode22EndTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node22_end_time not between", value1, value2, "processNode22EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode23StartTimeIsNull() {
            addCriterion("process_node23_start_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode23StartTimeIsNotNull() {
            addCriterion("process_node23_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode23StartTimeEqualTo(Long value) {
            addCriterion("process_node23_start_time =", value, "processNode23StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode23StartTimeNotEqualTo(Long value) {
            addCriterion("process_node23_start_time <>", value, "processNode23StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode23StartTimeGreaterThan(Long value) {
            addCriterion("process_node23_start_time >", value, "processNode23StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode23StartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node23_start_time >=", value, "processNode23StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode23StartTimeLessThan(Long value) {
            addCriterion("process_node23_start_time <", value, "processNode23StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode23StartTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node23_start_time <=", value, "processNode23StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode23StartTimeIn(List<Long> values) {
            addCriterion("process_node23_start_time in", values, "processNode23StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode23StartTimeNotIn(List<Long> values) {
            addCriterion("process_node23_start_time not in", values, "processNode23StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode23StartTimeBetween(Long value1, Long value2) {
            addCriterion("process_node23_start_time between", value1, value2, "processNode23StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode23StartTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node23_start_time not between", value1, value2, "processNode23StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode23EndTimeIsNull() {
            addCriterion("process_node23_end_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode23EndTimeIsNotNull() {
            addCriterion("process_node23_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode23EndTimeEqualTo(Long value) {
            addCriterion("process_node23_end_time =", value, "processNode23EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode23EndTimeNotEqualTo(Long value) {
            addCriterion("process_node23_end_time <>", value, "processNode23EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode23EndTimeGreaterThan(Long value) {
            addCriterion("process_node23_end_time >", value, "processNode23EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode23EndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node23_end_time >=", value, "processNode23EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode23EndTimeLessThan(Long value) {
            addCriterion("process_node23_end_time <", value, "processNode23EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode23EndTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node23_end_time <=", value, "processNode23EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode23EndTimeIn(List<Long> values) {
            addCriterion("process_node23_end_time in", values, "processNode23EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode23EndTimeNotIn(List<Long> values) {
            addCriterion("process_node23_end_time not in", values, "processNode23EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode23EndTimeBetween(Long value1, Long value2) {
            addCriterion("process_node23_end_time between", value1, value2, "processNode23EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode23EndTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node23_end_time not between", value1, value2, "processNode23EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode24StartTimeIsNull() {
            addCriterion("process_node24_start_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode24StartTimeIsNotNull() {
            addCriterion("process_node24_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode24StartTimeEqualTo(Long value) {
            addCriterion("process_node24_start_time =", value, "processNode24StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode24StartTimeNotEqualTo(Long value) {
            addCriterion("process_node24_start_time <>", value, "processNode24StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode24StartTimeGreaterThan(Long value) {
            addCriterion("process_node24_start_time >", value, "processNode24StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode24StartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node24_start_time >=", value, "processNode24StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode24StartTimeLessThan(Long value) {
            addCriterion("process_node24_start_time <", value, "processNode24StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode24StartTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node24_start_time <=", value, "processNode24StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode24StartTimeIn(List<Long> values) {
            addCriterion("process_node24_start_time in", values, "processNode24StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode24StartTimeNotIn(List<Long> values) {
            addCriterion("process_node24_start_time not in", values, "processNode24StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode24StartTimeBetween(Long value1, Long value2) {
            addCriterion("process_node24_start_time between", value1, value2, "processNode24StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode24StartTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node24_start_time not between", value1, value2, "processNode24StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode24EndTimeIsNull() {
            addCriterion("process_node24_end_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode24EndTimeIsNotNull() {
            addCriterion("process_node24_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode24EndTimeEqualTo(Long value) {
            addCriterion("process_node24_end_time =", value, "processNode24EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode24EndTimeNotEqualTo(Long value) {
            addCriterion("process_node24_end_time <>", value, "processNode24EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode24EndTimeGreaterThan(Long value) {
            addCriterion("process_node24_end_time >", value, "processNode24EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode24EndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node24_end_time >=", value, "processNode24EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode24EndTimeLessThan(Long value) {
            addCriterion("process_node24_end_time <", value, "processNode24EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode24EndTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node24_end_time <=", value, "processNode24EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode24EndTimeIn(List<Long> values) {
            addCriterion("process_node24_end_time in", values, "processNode24EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode24EndTimeNotIn(List<Long> values) {
            addCriterion("process_node24_end_time not in", values, "processNode24EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode24EndTimeBetween(Long value1, Long value2) {
            addCriterion("process_node24_end_time between", value1, value2, "processNode24EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode24EndTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node24_end_time not between", value1, value2, "processNode24EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode25StartTimeIsNull() {
            addCriterion("process_node25_start_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode25StartTimeIsNotNull() {
            addCriterion("process_node25_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode25StartTimeEqualTo(Long value) {
            addCriterion("process_node25_start_time =", value, "processNode25StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode25StartTimeNotEqualTo(Long value) {
            addCriterion("process_node25_start_time <>", value, "processNode25StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode25StartTimeGreaterThan(Long value) {
            addCriterion("process_node25_start_time >", value, "processNode25StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode25StartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node25_start_time >=", value, "processNode25StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode25StartTimeLessThan(Long value) {
            addCriterion("process_node25_start_time <", value, "processNode25StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode25StartTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node25_start_time <=", value, "processNode25StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode25StartTimeIn(List<Long> values) {
            addCriterion("process_node25_start_time in", values, "processNode25StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode25StartTimeNotIn(List<Long> values) {
            addCriterion("process_node25_start_time not in", values, "processNode25StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode25StartTimeBetween(Long value1, Long value2) {
            addCriterion("process_node25_start_time between", value1, value2, "processNode25StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode25StartTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node25_start_time not between", value1, value2, "processNode25StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode25EndTimeIsNull() {
            addCriterion("process_node25_end_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode25EndTimeIsNotNull() {
            addCriterion("process_node25_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode25EndTimeEqualTo(Long value) {
            addCriterion("process_node25_end_time =", value, "processNode25EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode25EndTimeNotEqualTo(Long value) {
            addCriterion("process_node25_end_time <>", value, "processNode25EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode25EndTimeGreaterThan(Long value) {
            addCriterion("process_node25_end_time >", value, "processNode25EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode25EndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node25_end_time >=", value, "processNode25EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode25EndTimeLessThan(Long value) {
            addCriterion("process_node25_end_time <", value, "processNode25EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode25EndTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node25_end_time <=", value, "processNode25EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode25EndTimeIn(List<Long> values) {
            addCriterion("process_node25_end_time in", values, "processNode25EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode25EndTimeNotIn(List<Long> values) {
            addCriterion("process_node25_end_time not in", values, "processNode25EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode25EndTimeBetween(Long value1, Long value2) {
            addCriterion("process_node25_end_time between", value1, value2, "processNode25EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode25EndTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node25_end_time not between", value1, value2, "processNode25EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode26StartTimeIsNull() {
            addCriterion("process_node26_start_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode26StartTimeIsNotNull() {
            addCriterion("process_node26_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode26StartTimeEqualTo(Long value) {
            addCriterion("process_node26_start_time =", value, "processNode26StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode26StartTimeNotEqualTo(Long value) {
            addCriterion("process_node26_start_time <>", value, "processNode26StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode26StartTimeGreaterThan(Long value) {
            addCriterion("process_node26_start_time >", value, "processNode26StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode26StartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node26_start_time >=", value, "processNode26StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode26StartTimeLessThan(Long value) {
            addCriterion("process_node26_start_time <", value, "processNode26StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode26StartTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node26_start_time <=", value, "processNode26StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode26StartTimeIn(List<Long> values) {
            addCriterion("process_node26_start_time in", values, "processNode26StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode26StartTimeNotIn(List<Long> values) {
            addCriterion("process_node26_start_time not in", values, "processNode26StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode26StartTimeBetween(Long value1, Long value2) {
            addCriterion("process_node26_start_time between", value1, value2, "processNode26StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode26StartTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node26_start_time not between", value1, value2, "processNode26StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode26EndTimeIsNull() {
            addCriterion("process_node26_end_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode26EndTimeIsNotNull() {
            addCriterion("process_node26_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode26EndTimeEqualTo(Long value) {
            addCriterion("process_node26_end_time =", value, "processNode26EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode26EndTimeNotEqualTo(Long value) {
            addCriterion("process_node26_end_time <>", value, "processNode26EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode26EndTimeGreaterThan(Long value) {
            addCriterion("process_node26_end_time >", value, "processNode26EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode26EndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node26_end_time >=", value, "processNode26EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode26EndTimeLessThan(Long value) {
            addCriterion("process_node26_end_time <", value, "processNode26EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode26EndTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node26_end_time <=", value, "processNode26EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode26EndTimeIn(List<Long> values) {
            addCriterion("process_node26_end_time in", values, "processNode26EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode26EndTimeNotIn(List<Long> values) {
            addCriterion("process_node26_end_time not in", values, "processNode26EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode26EndTimeBetween(Long value1, Long value2) {
            addCriterion("process_node26_end_time between", value1, value2, "processNode26EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode26EndTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node26_end_time not between", value1, value2, "processNode26EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode27StartTimeIsNull() {
            addCriterion("process_node27_start_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode27StartTimeIsNotNull() {
            addCriterion("process_node27_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode27StartTimeEqualTo(Long value) {
            addCriterion("process_node27_start_time =", value, "processNode27StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode27StartTimeNotEqualTo(Long value) {
            addCriterion("process_node27_start_time <>", value, "processNode27StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode27StartTimeGreaterThan(Long value) {
            addCriterion("process_node27_start_time >", value, "processNode27StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode27StartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node27_start_time >=", value, "processNode27StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode27StartTimeLessThan(Long value) {
            addCriterion("process_node27_start_time <", value, "processNode27StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode27StartTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node27_start_time <=", value, "processNode27StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode27StartTimeIn(List<Long> values) {
            addCriterion("process_node27_start_time in", values, "processNode27StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode27StartTimeNotIn(List<Long> values) {
            addCriterion("process_node27_start_time not in", values, "processNode27StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode27StartTimeBetween(Long value1, Long value2) {
            addCriterion("process_node27_start_time between", value1, value2, "processNode27StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode27StartTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node27_start_time not between", value1, value2, "processNode27StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode27EndTimeIsNull() {
            addCriterion("process_node27_end_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode27EndTimeIsNotNull() {
            addCriterion("process_node27_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode27EndTimeEqualTo(Long value) {
            addCriterion("process_node27_end_time =", value, "processNode27EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode27EndTimeNotEqualTo(Long value) {
            addCriterion("process_node27_end_time <>", value, "processNode27EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode27EndTimeGreaterThan(Long value) {
            addCriterion("process_node27_end_time >", value, "processNode27EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode27EndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node27_end_time >=", value, "processNode27EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode27EndTimeLessThan(Long value) {
            addCriterion("process_node27_end_time <", value, "processNode27EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode27EndTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node27_end_time <=", value, "processNode27EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode27EndTimeIn(List<Long> values) {
            addCriterion("process_node27_end_time in", values, "processNode27EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode27EndTimeNotIn(List<Long> values) {
            addCriterion("process_node27_end_time not in", values, "processNode27EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode27EndTimeBetween(Long value1, Long value2) {
            addCriterion("process_node27_end_time between", value1, value2, "processNode27EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode27EndTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node27_end_time not between", value1, value2, "processNode27EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode28StartTimeIsNull() {
            addCriterion("process_node28_start_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode28StartTimeIsNotNull() {
            addCriterion("process_node28_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode28StartTimeEqualTo(Long value) {
            addCriterion("process_node28_start_time =", value, "processNode28StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode28StartTimeNotEqualTo(Long value) {
            addCriterion("process_node28_start_time <>", value, "processNode28StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode28StartTimeGreaterThan(Long value) {
            addCriterion("process_node28_start_time >", value, "processNode28StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode28StartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node28_start_time >=", value, "processNode28StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode28StartTimeLessThan(Long value) {
            addCriterion("process_node28_start_time <", value, "processNode28StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode28StartTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node28_start_time <=", value, "processNode28StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode28StartTimeIn(List<Long> values) {
            addCriterion("process_node28_start_time in", values, "processNode28StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode28StartTimeNotIn(List<Long> values) {
            addCriterion("process_node28_start_time not in", values, "processNode28StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode28StartTimeBetween(Long value1, Long value2) {
            addCriterion("process_node28_start_time between", value1, value2, "processNode28StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode28StartTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node28_start_time not between", value1, value2, "processNode28StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode28EndTimeIsNull() {
            addCriterion("process_node28_end_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode28EndTimeIsNotNull() {
            addCriterion("process_node28_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode28EndTimeEqualTo(Long value) {
            addCriterion("process_node28_end_time =", value, "processNode28EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode28EndTimeNotEqualTo(Long value) {
            addCriterion("process_node28_end_time <>", value, "processNode28EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode28EndTimeGreaterThan(Long value) {
            addCriterion("process_node28_end_time >", value, "processNode28EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode28EndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node28_end_time >=", value, "processNode28EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode28EndTimeLessThan(Long value) {
            addCriterion("process_node28_end_time <", value, "processNode28EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode28EndTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node28_end_time <=", value, "processNode28EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode28EndTimeIn(List<Long> values) {
            addCriterion("process_node28_end_time in", values, "processNode28EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode28EndTimeNotIn(List<Long> values) {
            addCriterion("process_node28_end_time not in", values, "processNode28EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode28EndTimeBetween(Long value1, Long value2) {
            addCriterion("process_node28_end_time between", value1, value2, "processNode28EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode28EndTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node28_end_time not between", value1, value2, "processNode28EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode29StartTimeIsNull() {
            addCriterion("process_node29_start_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode29StartTimeIsNotNull() {
            addCriterion("process_node29_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode29StartTimeEqualTo(Long value) {
            addCriterion("process_node29_start_time =", value, "processNode29StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode29StartTimeNotEqualTo(Long value) {
            addCriterion("process_node29_start_time <>", value, "processNode29StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode29StartTimeGreaterThan(Long value) {
            addCriterion("process_node29_start_time >", value, "processNode29StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode29StartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node29_start_time >=", value, "processNode29StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode29StartTimeLessThan(Long value) {
            addCriterion("process_node29_start_time <", value, "processNode29StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode29StartTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node29_start_time <=", value, "processNode29StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode29StartTimeIn(List<Long> values) {
            addCriterion("process_node29_start_time in", values, "processNode29StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode29StartTimeNotIn(List<Long> values) {
            addCriterion("process_node29_start_time not in", values, "processNode29StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode29StartTimeBetween(Long value1, Long value2) {
            addCriterion("process_node29_start_time between", value1, value2, "processNode29StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode29StartTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node29_start_time not between", value1, value2, "processNode29StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode29EndTimeIsNull() {
            addCriterion("process_node29_end_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode29EndTimeIsNotNull() {
            addCriterion("process_node29_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode29EndTimeEqualTo(Long value) {
            addCriterion("process_node29_end_time =", value, "processNode29EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode29EndTimeNotEqualTo(Long value) {
            addCriterion("process_node29_end_time <>", value, "processNode29EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode29EndTimeGreaterThan(Long value) {
            addCriterion("process_node29_end_time >", value, "processNode29EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode29EndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node29_end_time >=", value, "processNode29EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode29EndTimeLessThan(Long value) {
            addCriterion("process_node29_end_time <", value, "processNode29EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode29EndTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node29_end_time <=", value, "processNode29EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode29EndTimeIn(List<Long> values) {
            addCriterion("process_node29_end_time in", values, "processNode29EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode29EndTimeNotIn(List<Long> values) {
            addCriterion("process_node29_end_time not in", values, "processNode29EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode29EndTimeBetween(Long value1, Long value2) {
            addCriterion("process_node29_end_time between", value1, value2, "processNode29EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode29EndTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node29_end_time not between", value1, value2, "processNode29EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode30StartTimeIsNull() {
            addCriterion("process_node30_start_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode30StartTimeIsNotNull() {
            addCriterion("process_node30_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode30StartTimeEqualTo(Long value) {
            addCriterion("process_node30_start_time =", value, "processNode30StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode30StartTimeNotEqualTo(Long value) {
            addCriterion("process_node30_start_time <>", value, "processNode30StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode30StartTimeGreaterThan(Long value) {
            addCriterion("process_node30_start_time >", value, "processNode30StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode30StartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node30_start_time >=", value, "processNode30StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode30StartTimeLessThan(Long value) {
            addCriterion("process_node30_start_time <", value, "processNode30StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode30StartTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node30_start_time <=", value, "processNode30StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode30StartTimeIn(List<Long> values) {
            addCriterion("process_node30_start_time in", values, "processNode30StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode30StartTimeNotIn(List<Long> values) {
            addCriterion("process_node30_start_time not in", values, "processNode30StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode30StartTimeBetween(Long value1, Long value2) {
            addCriterion("process_node30_start_time between", value1, value2, "processNode30StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode30StartTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node30_start_time not between", value1, value2, "processNode30StartTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode30EndTimeIsNull() {
            addCriterion("process_node30_end_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessNode30EndTimeIsNotNull() {
            addCriterion("process_node30_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNode30EndTimeEqualTo(Long value) {
            addCriterion("process_node30_end_time =", value, "processNode30EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode30EndTimeNotEqualTo(Long value) {
            addCriterion("process_node30_end_time <>", value, "processNode30EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode30EndTimeGreaterThan(Long value) {
            addCriterion("process_node30_end_time >", value, "processNode30EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode30EndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("process_node30_end_time >=", value, "processNode30EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode30EndTimeLessThan(Long value) {
            addCriterion("process_node30_end_time <", value, "processNode30EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode30EndTimeLessThanOrEqualTo(Long value) {
            addCriterion("process_node30_end_time <=", value, "processNode30EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode30EndTimeIn(List<Long> values) {
            addCriterion("process_node30_end_time in", values, "processNode30EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode30EndTimeNotIn(List<Long> values) {
            addCriterion("process_node30_end_time not in", values, "processNode30EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode30EndTimeBetween(Long value1, Long value2) {
            addCriterion("process_node30_end_time between", value1, value2, "processNode30EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNode30EndTimeNotBetween(Long value1, Long value2) {
            addCriterion("process_node30_end_time not between", value1, value2, "processNode30EndTime");
            return (Criteria) this;
        }

        public Criteria andProcessNodeIsNull() {
            addCriterion("process_node is null");
            return (Criteria) this;
        }

        public Criteria andProcessNodeIsNotNull() {
            addCriterion("process_node is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNodeEqualTo(String value) {
            addCriterion("process_node =", value, "processNode");
            return (Criteria) this;
        }

        public Criteria andProcessNodeNotEqualTo(String value) {
            addCriterion("process_node <>", value, "processNode");
            return (Criteria) this;
        }

        public Criteria andProcessNodeGreaterThan(String value) {
            addCriterion("process_node >", value, "processNode");
            return (Criteria) this;
        }

        public Criteria andProcessNodeGreaterThanOrEqualTo(String value) {
            addCriterion("process_node >=", value, "processNode");
            return (Criteria) this;
        }

        public Criteria andProcessNodeLessThan(String value) {
            addCriterion("process_node <", value, "processNode");
            return (Criteria) this;
        }

        public Criteria andProcessNodeLessThanOrEqualTo(String value) {
            addCriterion("process_node <=", value, "processNode");
            return (Criteria) this;
        }

        public Criteria andProcessNodeLike(String value) {
            addCriterion("process_node like", value, "processNode");
            return (Criteria) this;
        }

        public Criteria andProcessNodeNotLike(String value) {
            addCriterion("process_node not like", value, "processNode");
            return (Criteria) this;
        }

        public Criteria andProcessNodeIn(List<String> values) {
            addCriterion("process_node in", values, "processNode");
            return (Criteria) this;
        }

        public Criteria andProcessNodeNotIn(List<String> values) {
            addCriterion("process_node not in", values, "processNode");
            return (Criteria) this;
        }

        public Criteria andProcessNodeBetween(String value1, String value2) {
            addCriterion("process_node between", value1, value2, "processNode");
            return (Criteria) this;
        }

        public Criteria andProcessNodeNotBetween(String value1, String value2) {
            addCriterion("process_node not between", value1, value2, "processNode");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("created_by like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("created_by not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNull() {
            addCriterion("updated_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNotNull() {
            addCriterion("updated_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByEqualTo(String value) {
            addCriterion("updated_by =", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotEqualTo(String value) {
            addCriterion("updated_by <>", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThan(String value) {
            addCriterion("updated_by >", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThanOrEqualTo(String value) {
            addCriterion("updated_by >=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThan(String value) {
            addCriterion("updated_by <", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThanOrEqualTo(String value) {
            addCriterion("updated_by <=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLike(String value) {
            addCriterion("updated_by like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotLike(String value) {
            addCriterion("updated_by not like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIn(List<String> values) {
            addCriterion("updated_by in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotIn(List<String> values) {
            addCriterion("updated_by not in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByBetween(String value1, String value2) {
            addCriterion("updated_by between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotBetween(String value1, String value2) {
            addCriterion("updated_by not between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Byte value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Byte value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Byte value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Byte value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Byte value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Byte> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Byte> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Byte value1, Byte value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Byte value1, Byte value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andChexingIdIsNull() {
            addCriterion("chexing_id is null");
            return (Criteria) this;
        }

        public Criteria andChexingIdIsNotNull() {
            addCriterion("chexing_id is not null");
            return (Criteria) this;
        }

        public Criteria andChexingIdEqualTo(Integer value) {
            addCriterion("chexing_id =", value, "chexingId");
            return (Criteria) this;
        }

        public Criteria andChexingIdNotEqualTo(Integer value) {
            addCriterion("chexing_id <>", value, "chexingId");
            return (Criteria) this;
        }

        public Criteria andChexingIdGreaterThan(Integer value) {
            addCriterion("chexing_id >", value, "chexingId");
            return (Criteria) this;
        }

        public Criteria andChexingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("chexing_id >=", value, "chexingId");
            return (Criteria) this;
        }

        public Criteria andChexingIdLessThan(Integer value) {
            addCriterion("chexing_id <", value, "chexingId");
            return (Criteria) this;
        }

        public Criteria andChexingIdLessThanOrEqualTo(Integer value) {
            addCriterion("chexing_id <=", value, "chexingId");
            return (Criteria) this;
        }

        public Criteria andChexingIdIn(List<Integer> values) {
            addCriterion("chexing_id in", values, "chexingId");
            return (Criteria) this;
        }

        public Criteria andChexingIdNotIn(List<Integer> values) {
            addCriterion("chexing_id not in", values, "chexingId");
            return (Criteria) this;
        }

        public Criteria andChexingIdBetween(Integer value1, Integer value2) {
            addCriterion("chexing_id between", value1, value2, "chexingId");
            return (Criteria) this;
        }

        public Criteria andChexingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("chexing_id not between", value1, value2, "chexingId");
            return (Criteria) this;
        }

        public Criteria andPerformanceStatusUpdatedAtIsNull() {
            addCriterion("performance_status_updated_at is null");
            return (Criteria) this;
        }

        public Criteria andPerformanceStatusUpdatedAtIsNotNull() {
            addCriterion("performance_status_updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andPerformanceStatusUpdatedAtEqualTo(Date value) {
            addCriterion("performance_status_updated_at =", value, "performanceStatusUpdatedAt");
            return (Criteria) this;
        }

        public Criteria andPerformanceStatusUpdatedAtNotEqualTo(Date value) {
            addCriterion("performance_status_updated_at <>", value, "performanceStatusUpdatedAt");
            return (Criteria) this;
        }

        public Criteria andPerformanceStatusUpdatedAtGreaterThan(Date value) {
            addCriterion("performance_status_updated_at >", value, "performanceStatusUpdatedAt");
            return (Criteria) this;
        }

        public Criteria andPerformanceStatusUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("performance_status_updated_at >=", value, "performanceStatusUpdatedAt");
            return (Criteria) this;
        }

        public Criteria andPerformanceStatusUpdatedAtLessThan(Date value) {
            addCriterion("performance_status_updated_at <", value, "performanceStatusUpdatedAt");
            return (Criteria) this;
        }

        public Criteria andPerformanceStatusUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("performance_status_updated_at <=", value, "performanceStatusUpdatedAt");
            return (Criteria) this;
        }

        public Criteria andPerformanceStatusUpdatedAtIn(List<Date> values) {
            addCriterion("performance_status_updated_at in", values, "performanceStatusUpdatedAt");
            return (Criteria) this;
        }

        public Criteria andPerformanceStatusUpdatedAtNotIn(List<Date> values) {
            addCriterion("performance_status_updated_at not in", values, "performanceStatusUpdatedAt");
            return (Criteria) this;
        }

        public Criteria andPerformanceStatusUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("performance_status_updated_at between", value1, value2, "performanceStatusUpdatedAt");
            return (Criteria) this;
        }

        public Criteria andPerformanceStatusUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("performance_status_updated_at not between", value1, value2, "performanceStatusUpdatedAt");
            return (Criteria) this;
        }

        public Criteria andOrderStatusUpdatedAtIsNull() {
            addCriterion("order_status_updated_at is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusUpdatedAtIsNotNull() {
            addCriterion("order_status_updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusUpdatedAtEqualTo(Date value) {
            addCriterion("order_status_updated_at =", value, "orderStatusUpdatedAt");
            return (Criteria) this;
        }

        public Criteria andOrderStatusUpdatedAtNotEqualTo(Date value) {
            addCriterion("order_status_updated_at <>", value, "orderStatusUpdatedAt");
            return (Criteria) this;
        }

        public Criteria andOrderStatusUpdatedAtGreaterThan(Date value) {
            addCriterion("order_status_updated_at >", value, "orderStatusUpdatedAt");
            return (Criteria) this;
        }

        public Criteria andOrderStatusUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("order_status_updated_at >=", value, "orderStatusUpdatedAt");
            return (Criteria) this;
        }

        public Criteria andOrderStatusUpdatedAtLessThan(Date value) {
            addCriterion("order_status_updated_at <", value, "orderStatusUpdatedAt");
            return (Criteria) this;
        }

        public Criteria andOrderStatusUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("order_status_updated_at <=", value, "orderStatusUpdatedAt");
            return (Criteria) this;
        }

        public Criteria andOrderStatusUpdatedAtIn(List<Date> values) {
            addCriterion("order_status_updated_at in", values, "orderStatusUpdatedAt");
            return (Criteria) this;
        }

        public Criteria andOrderStatusUpdatedAtNotIn(List<Date> values) {
            addCriterion("order_status_updated_at not in", values, "orderStatusUpdatedAt");
            return (Criteria) this;
        }

        public Criteria andOrderStatusUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("order_status_updated_at between", value1, value2, "orderStatusUpdatedAt");
            return (Criteria) this;
        }

        public Criteria andOrderStatusUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("order_status_updated_at not between", value1, value2, "orderStatusUpdatedAt");
            return (Criteria) this;
        }
    }

    /**
     * order_wtable
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * order_wtable null
     */
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