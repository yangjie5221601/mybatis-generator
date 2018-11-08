package com.guazi.xinche.wtable.orm.entity;

import java.util.Date;

public class OrderWtable {
    /**
     * pk
     */
    private Long id;

    /**
     * 订单id
     */
    private Long orderId;

    /**
     * 客户姓名
     */
    private String customerName;

    /**
     * 订单城市ID
     */
    private Integer cityId;

    /**
     * 品牌ID
     */
    private Integer brandId;

    /**
     * 车系Id
     */
    private Integer chexiId;

    /**
     * sku_id
     */
    private Integer skuId;

    /**
     * 车辆vin码
     */
    private String vin;

    /**
     * 车辆上牌城市ID
     */
    private Integer boardingCityId;

    /**
     * 交车城市
     */
    private Integer deliveryCityId;

    /**
     * 开票城市id
     */
    private Integer billingCityId;

    /**
     * 车辆id
     */
    private Integer carId;

    /**
     * 配车类型 1 现车 2非现车
     */
    private Byte supplyCarType;

    /**
     * 首付时间
     */
    private Long downPaymentTime;

    /**
     * 首付状态0未完成1已完成
     */
    private Byte downPaymentStatus;

    /**
     * 订单状态
     */
    private Byte orderStatus;

    /**
     * 履约状态 0未交车 1已交车
     */
    private Byte performanceStatus;

    /**
     * 节点开始时间
     */
    private Long processNode1StartTime;

    /**
     * 节点结束时间
     */
    private Long processNode1EndTime;

    /**
     * 节点开始时间
     */
    private Long processNode2StartTime;

    /**
     * 节点结束时间
     */
    private Long processNode2EndTime;

    /**
     * 节点开始时间
     */
    private Long processNode3StartTime;

    /**
     * 节点结束时间
     */
    private Long processNode3EndTime;

    /**
     * 节点开始时间
     */
    private Long processNode4StartTime;

    /**
     * 节点结束时间
     */
    private Long processNode4EndTime;

    /**
     * 节点开始时间
     */
    private Long processNode5StartTime;

    /**
     * 节点结束时间
     */
    private Long processNode5EndTime;

    /**
     * 节点开始时间
     */
    private Long processNode6StartTime;

    /**
     * 节点结束时间
     */
    private Long processNode6EndTime;

    /**
     * 节点开始时间
     */
    private Long processNode7StartTime;

    /**
     * 节点结束时间
     */
    private Long processNode7EndTime;

    /**
     * 节点开始时间
     */
    private Long processNode8StartTime;

    /**
     * 节点结束时间
     */
    private Long processNode8EndTime;

    /**
     * 节点开始时间
     */
    private Long processNode9StartTime;

    /**
     * 节点结束时间
     */
    private Long processNode9EndTime;

    /**
     * 节点开始时间
     */
    private Long processNode10StartTime;

    /**
     * 节点结束时间
     */
    private Long processNode10EndTime;

    /**
     * 节点开始时间
     */
    private Long processNode11StartTime;

    /**
     * 节点结束时间
     */
    private Long processNode11EndTime;

    /**
     * 节点开始时间
     */
    private Long processNode12StartTime;

    /**
     * 节点结束时间
     */
    private Long processNode12EndTime;

    /**
     * 节点开始时间
     */
    private Long processNode13StartTime;

    /**
     * 节点结束时间
     */
    private Long processNode13EndTime;

    /**
     * 节点开始时间
     */
    private Long processNode14StartTime;

    /**
     * 节点结束时间
     */
    private Long processNode14EndTime;

    /**
     * 节点开始时间
     */
    private Long processNode15StartTime;

    /**
     * 节点结束时间
     */
    private Long processNode15EndTime;

    /**
     * 节点开始时间
     */
    private Long processNode16StartTime;

    /**
     * 节点结束时间
     */
    private Long processNode16EndTime;

    /**
     * 节点开始时间
     */
    private Long processNode17StartTime;

    /**
     * 节点结束时间
     */
    private Long processNode17EndTime;

    /**
     * 节点开始时间
     */
    private Long processNode18StartTime;

    /**
     * 节点结束时间
     */
    private Long processNode18EndTime;

    /**
     * 节点开始时间
     */
    private Long processNode19StartTime;

    /**
     * 节点结束时间
     */
    private Long processNode19EndTime;

    /**
     * 节点开始时间
     */
    private Long processNode20StartTime;

    /**
     * 节点结束时间
     */
    private Long processNode20EndTime;

    /**
     * 节点开始时间
     */
    private Long processNode21StartTime;

    /**
     * 节点结束时间
     */
    private Long processNode21EndTime;

    /**
     * 节点开始时间
     */
    private Long processNode22StartTime;

    /**
     * 节点结束时间
     */
    private Long processNode22EndTime;

    /**
     * 节点开始时间
     */
    private Long processNode23StartTime;

    /**
     * 节点结束时间
     */
    private Long processNode23EndTime;

    /**
     * 节点开始时间
     */
    private Long processNode24StartTime;

    /**
     * 节点结束时间
     */
    private Long processNode24EndTime;

    /**
     * 节点开始时间
     */
    private Long processNode25StartTime;

    /**
     * 节点结束时间
     */
    private Long processNode25EndTime;

    /**
     * 节点开始时间
     */
    private Long processNode26StartTime;

    /**
     * 节点结束时间
     */
    private Long processNode26EndTime;

    /**
     * 节点开始时间
     */
    private Long processNode27StartTime;

    /**
     * 节点结束时间
     */
    private Long processNode27EndTime;

    /**
     * 节点开始时间
     */
    private Long processNode28StartTime;

    /**
     * 节点结束时间
     */
    private Long processNode28EndTime;

    /**
     * 节点开始时间
     */
    private Long processNode29StartTime;

    /**
     * 节点结束时间
     */
    private Long processNode29EndTime;

    /**
     * 节点开始时间
     */
    private Long processNode30StartTime;

    /**
     * 节点结束时间
     */
    private Long processNode30EndTime;

    /**
     * 流程节点 1:1,2:1 格式 冒号前表示环节。冒号后表示当前环境状态
     */
    private String processNode;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 更新人
     */
    private String updatedBy;

    /**
     * 更新时间
     */
    private Date updatedAt;

    /**
     * 是否删除标示
     */
    private Byte isDeleted;

    /**
     * 车型ID
     */
    private Integer chexingId;

    /**
     * 交车时间
     */
    private Date performanceStatusUpdatedAt;

    /**
     * 订单状态改变时间
     */
    private Date orderStatusUpdatedAt;

    /**
     * pk
     * @return id pk
     */
    public Long getId() {
        return id;
    }

    /**
     * pk
     * @param id pk
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 订单id
     * @return order_id 订单id
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 订单id
     * @param orderId 订单id
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 客户姓名
     * @return customer_name 客户姓名
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * 客户姓名
     * @param customerName 客户姓名
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    /**
     * 订单城市ID
     * @return city_id 订单城市ID
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * 订单城市ID
     * @param cityId 订单城市ID
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     * 品牌ID
     * @return brand_id 品牌ID
     */
    public Integer getBrandId() {
        return brandId;
    }

    /**
     * 品牌ID
     * @param brandId 品牌ID
     */
    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    /**
     * 车系Id
     * @return chexi_id 车系Id
     */
    public Integer getChexiId() {
        return chexiId;
    }

    /**
     * 车系Id
     * @param chexiId 车系Id
     */
    public void setChexiId(Integer chexiId) {
        this.chexiId = chexiId;
    }

    /**
     * sku_id
     * @return sku_id sku_id
     */
    public Integer getSkuId() {
        return skuId;
    }

    /**
     * sku_id
     * @param skuId sku_id
     */
    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    /**
     * 车辆vin码
     * @return vin 车辆vin码
     */
    public String getVin() {
        return vin;
    }

    /**
     * 车辆vin码
     * @param vin 车辆vin码
     */
    public void setVin(String vin) {
        this.vin = vin == null ? null : vin.trim();
    }

    /**
     * 车辆上牌城市ID
     * @return boarding_city_id 车辆上牌城市ID
     */
    public Integer getBoardingCityId() {
        return boardingCityId;
    }

    /**
     * 车辆上牌城市ID
     * @param boardingCityId 车辆上牌城市ID
     */
    public void setBoardingCityId(Integer boardingCityId) {
        this.boardingCityId = boardingCityId;
    }

    /**
     * 交车城市
     * @return delivery_city_id 交车城市
     */
    public Integer getDeliveryCityId() {
        return deliveryCityId;
    }

    /**
     * 交车城市
     * @param deliveryCityId 交车城市
     */
    public void setDeliveryCityId(Integer deliveryCityId) {
        this.deliveryCityId = deliveryCityId;
    }

    /**
     * 开票城市id
     * @return billing_city_id 开票城市id
     */
    public Integer getBillingCityId() {
        return billingCityId;
    }

    /**
     * 开票城市id
     * @param billingCityId 开票城市id
     */
    public void setBillingCityId(Integer billingCityId) {
        this.billingCityId = billingCityId;
    }

    /**
     * 车辆id
     * @return car_id 车辆id
     */
    public Integer getCarId() {
        return carId;
    }

    /**
     * 车辆id
     * @param carId 车辆id
     */
    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    /**
     * 配车类型 1 现车 2非现车
     * @return supply_car_type 配车类型 1 现车 2非现车
     */
    public Byte getSupplyCarType() {
        return supplyCarType;
    }

    /**
     * 配车类型 1 现车 2非现车
     * @param supplyCarType 配车类型 1 现车 2非现车
     */
    public void setSupplyCarType(Byte supplyCarType) {
        this.supplyCarType = supplyCarType;
    }

    /**
     * 首付时间
     * @return down_payment_time 首付时间
     */
    public Long getDownPaymentTime() {
        return downPaymentTime;
    }

    /**
     * 首付时间
     * @param downPaymentTime 首付时间
     */
    public void setDownPaymentTime(Long downPaymentTime) {
        this.downPaymentTime = downPaymentTime;
    }

    /**
     * 首付状态0未完成1已完成
     * @return down_payment_status 首付状态0未完成1已完成
     */
    public Byte getDownPaymentStatus() {
        return downPaymentStatus;
    }

    /**
     * 首付状态0未完成1已完成
     * @param downPaymentStatus 首付状态0未完成1已完成
     */
    public void setDownPaymentStatus(Byte downPaymentStatus) {
        this.downPaymentStatus = downPaymentStatus;
    }

    /**
     * 订单状态
     * @return order_status 订单状态
     */
    public Byte getOrderStatus() {
        return orderStatus;
    }

    /**
     * 订单状态
     * @param orderStatus 订单状态
     */
    public void setOrderStatus(Byte orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 履约状态 0未交车 1已交车
     * @return performance_status 履约状态 0未交车 1已交车
     */
    public Byte getPerformanceStatus() {
        return performanceStatus;
    }

    /**
     * 履约状态 0未交车 1已交车
     * @param performanceStatus 履约状态 0未交车 1已交车
     */
    public void setPerformanceStatus(Byte performanceStatus) {
        this.performanceStatus = performanceStatus;
    }

    /**
     * 节点开始时间
     * @return process_node1_start_time 节点开始时间
     */
    public Long getProcessNode1StartTime() {
        return processNode1StartTime;
    }

    /**
     * 节点开始时间
     * @param processNode1StartTime 节点开始时间
     */
    public void setProcessNode1StartTime(Long processNode1StartTime) {
        this.processNode1StartTime = processNode1StartTime;
    }

    /**
     * 节点结束时间
     * @return process_node1_end_time 节点结束时间
     */
    public Long getProcessNode1EndTime() {
        return processNode1EndTime;
    }

    /**
     * 节点结束时间
     * @param processNode1EndTime 节点结束时间
     */
    public void setProcessNode1EndTime(Long processNode1EndTime) {
        this.processNode1EndTime = processNode1EndTime;
    }

    /**
     * 节点开始时间
     * @return process_node2_start_time 节点开始时间
     */
    public Long getProcessNode2StartTime() {
        return processNode2StartTime;
    }

    /**
     * 节点开始时间
     * @param processNode2StartTime 节点开始时间
     */
    public void setProcessNode2StartTime(Long processNode2StartTime) {
        this.processNode2StartTime = processNode2StartTime;
    }

    /**
     * 节点结束时间
     * @return process_node2_end_time 节点结束时间
     */
    public Long getProcessNode2EndTime() {
        return processNode2EndTime;
    }

    /**
     * 节点结束时间
     * @param processNode2EndTime 节点结束时间
     */
    public void setProcessNode2EndTime(Long processNode2EndTime) {
        this.processNode2EndTime = processNode2EndTime;
    }

    /**
     * 节点开始时间
     * @return process_node3_start_time 节点开始时间
     */
    public Long getProcessNode3StartTime() {
        return processNode3StartTime;
    }

    /**
     * 节点开始时间
     * @param processNode3StartTime 节点开始时间
     */
    public void setProcessNode3StartTime(Long processNode3StartTime) {
        this.processNode3StartTime = processNode3StartTime;
    }

    /**
     * 节点结束时间
     * @return process_node3_end_time 节点结束时间
     */
    public Long getProcessNode3EndTime() {
        return processNode3EndTime;
    }

    /**
     * 节点结束时间
     * @param processNode3EndTime 节点结束时间
     */
    public void setProcessNode3EndTime(Long processNode3EndTime) {
        this.processNode3EndTime = processNode3EndTime;
    }

    /**
     * 节点开始时间
     * @return process_node4_start_time 节点开始时间
     */
    public Long getProcessNode4StartTime() {
        return processNode4StartTime;
    }

    /**
     * 节点开始时间
     * @param processNode4StartTime 节点开始时间
     */
    public void setProcessNode4StartTime(Long processNode4StartTime) {
        this.processNode4StartTime = processNode4StartTime;
    }

    /**
     * 节点结束时间
     * @return process_node4_end_time 节点结束时间
     */
    public Long getProcessNode4EndTime() {
        return processNode4EndTime;
    }

    /**
     * 节点结束时间
     * @param processNode4EndTime 节点结束时间
     */
    public void setProcessNode4EndTime(Long processNode4EndTime) {
        this.processNode4EndTime = processNode4EndTime;
    }

    /**
     * 节点开始时间
     * @return process_node5_start_time 节点开始时间
     */
    public Long getProcessNode5StartTime() {
        return processNode5StartTime;
    }

    /**
     * 节点开始时间
     * @param processNode5StartTime 节点开始时间
     */
    public void setProcessNode5StartTime(Long processNode5StartTime) {
        this.processNode5StartTime = processNode5StartTime;
    }

    /**
     * 节点结束时间
     * @return process_node5_end_time 节点结束时间
     */
    public Long getProcessNode5EndTime() {
        return processNode5EndTime;
    }

    /**
     * 节点结束时间
     * @param processNode5EndTime 节点结束时间
     */
    public void setProcessNode5EndTime(Long processNode5EndTime) {
        this.processNode5EndTime = processNode5EndTime;
    }

    /**
     * 节点开始时间
     * @return process_node6_start_time 节点开始时间
     */
    public Long getProcessNode6StartTime() {
        return processNode6StartTime;
    }

    /**
     * 节点开始时间
     * @param processNode6StartTime 节点开始时间
     */
    public void setProcessNode6StartTime(Long processNode6StartTime) {
        this.processNode6StartTime = processNode6StartTime;
    }

    /**
     * 节点结束时间
     * @return process_node6_end_time 节点结束时间
     */
    public Long getProcessNode6EndTime() {
        return processNode6EndTime;
    }

    /**
     * 节点结束时间
     * @param processNode6EndTime 节点结束时间
     */
    public void setProcessNode6EndTime(Long processNode6EndTime) {
        this.processNode6EndTime = processNode6EndTime;
    }

    /**
     * 节点开始时间
     * @return process_node7_start_time 节点开始时间
     */
    public Long getProcessNode7StartTime() {
        return processNode7StartTime;
    }

    /**
     * 节点开始时间
     * @param processNode7StartTime 节点开始时间
     */
    public void setProcessNode7StartTime(Long processNode7StartTime) {
        this.processNode7StartTime = processNode7StartTime;
    }

    /**
     * 节点结束时间
     * @return process_node7_end_time 节点结束时间
     */
    public Long getProcessNode7EndTime() {
        return processNode7EndTime;
    }

    /**
     * 节点结束时间
     * @param processNode7EndTime 节点结束时间
     */
    public void setProcessNode7EndTime(Long processNode7EndTime) {
        this.processNode7EndTime = processNode7EndTime;
    }

    /**
     * 节点开始时间
     * @return process_node8_start_time 节点开始时间
     */
    public Long getProcessNode8StartTime() {
        return processNode8StartTime;
    }

    /**
     * 节点开始时间
     * @param processNode8StartTime 节点开始时间
     */
    public void setProcessNode8StartTime(Long processNode8StartTime) {
        this.processNode8StartTime = processNode8StartTime;
    }

    /**
     * 节点结束时间
     * @return process_node8_end_time 节点结束时间
     */
    public Long getProcessNode8EndTime() {
        return processNode8EndTime;
    }

    /**
     * 节点结束时间
     * @param processNode8EndTime 节点结束时间
     */
    public void setProcessNode8EndTime(Long processNode8EndTime) {
        this.processNode8EndTime = processNode8EndTime;
    }

    /**
     * 节点开始时间
     * @return process_node9_start_time 节点开始时间
     */
    public Long getProcessNode9StartTime() {
        return processNode9StartTime;
    }

    /**
     * 节点开始时间
     * @param processNode9StartTime 节点开始时间
     */
    public void setProcessNode9StartTime(Long processNode9StartTime) {
        this.processNode9StartTime = processNode9StartTime;
    }

    /**
     * 节点结束时间
     * @return process_node9_end_time 节点结束时间
     */
    public Long getProcessNode9EndTime() {
        return processNode9EndTime;
    }

    /**
     * 节点结束时间
     * @param processNode9EndTime 节点结束时间
     */
    public void setProcessNode9EndTime(Long processNode9EndTime) {
        this.processNode9EndTime = processNode9EndTime;
    }

    /**
     * 节点开始时间
     * @return process_node10_start_time 节点开始时间
     */
    public Long getProcessNode10StartTime() {
        return processNode10StartTime;
    }

    /**
     * 节点开始时间
     * @param processNode10StartTime 节点开始时间
     */
    public void setProcessNode10StartTime(Long processNode10StartTime) {
        this.processNode10StartTime = processNode10StartTime;
    }

    /**
     * 节点结束时间
     * @return process_node10_end_time 节点结束时间
     */
    public Long getProcessNode10EndTime() {
        return processNode10EndTime;
    }

    /**
     * 节点结束时间
     * @param processNode10EndTime 节点结束时间
     */
    public void setProcessNode10EndTime(Long processNode10EndTime) {
        this.processNode10EndTime = processNode10EndTime;
    }

    /**
     * 节点开始时间
     * @return process_node11_start_time 节点开始时间
     */
    public Long getProcessNode11StartTime() {
        return processNode11StartTime;
    }

    /**
     * 节点开始时间
     * @param processNode11StartTime 节点开始时间
     */
    public void setProcessNode11StartTime(Long processNode11StartTime) {
        this.processNode11StartTime = processNode11StartTime;
    }

    /**
     * 节点结束时间
     * @return process_node11_end_time 节点结束时间
     */
    public Long getProcessNode11EndTime() {
        return processNode11EndTime;
    }

    /**
     * 节点结束时间
     * @param processNode11EndTime 节点结束时间
     */
    public void setProcessNode11EndTime(Long processNode11EndTime) {
        this.processNode11EndTime = processNode11EndTime;
    }

    /**
     * 节点开始时间
     * @return process_node12_start_time 节点开始时间
     */
    public Long getProcessNode12StartTime() {
        return processNode12StartTime;
    }

    /**
     * 节点开始时间
     * @param processNode12StartTime 节点开始时间
     */
    public void setProcessNode12StartTime(Long processNode12StartTime) {
        this.processNode12StartTime = processNode12StartTime;
    }

    /**
     * 节点结束时间
     * @return process_node12_end_time 节点结束时间
     */
    public Long getProcessNode12EndTime() {
        return processNode12EndTime;
    }

    /**
     * 节点结束时间
     * @param processNode12EndTime 节点结束时间
     */
    public void setProcessNode12EndTime(Long processNode12EndTime) {
        this.processNode12EndTime = processNode12EndTime;
    }

    /**
     * 节点开始时间
     * @return process_node13_start_time 节点开始时间
     */
    public Long getProcessNode13StartTime() {
        return processNode13StartTime;
    }

    /**
     * 节点开始时间
     * @param processNode13StartTime 节点开始时间
     */
    public void setProcessNode13StartTime(Long processNode13StartTime) {
        this.processNode13StartTime = processNode13StartTime;
    }

    /**
     * 节点结束时间
     * @return process_node13_end_time 节点结束时间
     */
    public Long getProcessNode13EndTime() {
        return processNode13EndTime;
    }

    /**
     * 节点结束时间
     * @param processNode13EndTime 节点结束时间
     */
    public void setProcessNode13EndTime(Long processNode13EndTime) {
        this.processNode13EndTime = processNode13EndTime;
    }

    /**
     * 节点开始时间
     * @return process_node14_start_time 节点开始时间
     */
    public Long getProcessNode14StartTime() {
        return processNode14StartTime;
    }

    /**
     * 节点开始时间
     * @param processNode14StartTime 节点开始时间
     */
    public void setProcessNode14StartTime(Long processNode14StartTime) {
        this.processNode14StartTime = processNode14StartTime;
    }

    /**
     * 节点结束时间
     * @return process_node14_end_time 节点结束时间
     */
    public Long getProcessNode14EndTime() {
        return processNode14EndTime;
    }

    /**
     * 节点结束时间
     * @param processNode14EndTime 节点结束时间
     */
    public void setProcessNode14EndTime(Long processNode14EndTime) {
        this.processNode14EndTime = processNode14EndTime;
    }

    /**
     * 节点开始时间
     * @return process_node15_start_time 节点开始时间
     */
    public Long getProcessNode15StartTime() {
        return processNode15StartTime;
    }

    /**
     * 节点开始时间
     * @param processNode15StartTime 节点开始时间
     */
    public void setProcessNode15StartTime(Long processNode15StartTime) {
        this.processNode15StartTime = processNode15StartTime;
    }

    /**
     * 节点结束时间
     * @return process_node15_end_time 节点结束时间
     */
    public Long getProcessNode15EndTime() {
        return processNode15EndTime;
    }

    /**
     * 节点结束时间
     * @param processNode15EndTime 节点结束时间
     */
    public void setProcessNode15EndTime(Long processNode15EndTime) {
        this.processNode15EndTime = processNode15EndTime;
    }

    /**
     * 节点开始时间
     * @return process_node16_start_time 节点开始时间
     */
    public Long getProcessNode16StartTime() {
        return processNode16StartTime;
    }

    /**
     * 节点开始时间
     * @param processNode16StartTime 节点开始时间
     */
    public void setProcessNode16StartTime(Long processNode16StartTime) {
        this.processNode16StartTime = processNode16StartTime;
    }

    /**
     * 节点结束时间
     * @return process_node16_end_time 节点结束时间
     */
    public Long getProcessNode16EndTime() {
        return processNode16EndTime;
    }

    /**
     * 节点结束时间
     * @param processNode16EndTime 节点结束时间
     */
    public void setProcessNode16EndTime(Long processNode16EndTime) {
        this.processNode16EndTime = processNode16EndTime;
    }

    /**
     * 节点开始时间
     * @return process_node17_start_time 节点开始时间
     */
    public Long getProcessNode17StartTime() {
        return processNode17StartTime;
    }

    /**
     * 节点开始时间
     * @param processNode17StartTime 节点开始时间
     */
    public void setProcessNode17StartTime(Long processNode17StartTime) {
        this.processNode17StartTime = processNode17StartTime;
    }

    /**
     * 节点结束时间
     * @return process_node17_end_time 节点结束时间
     */
    public Long getProcessNode17EndTime() {
        return processNode17EndTime;
    }

    /**
     * 节点结束时间
     * @param processNode17EndTime 节点结束时间
     */
    public void setProcessNode17EndTime(Long processNode17EndTime) {
        this.processNode17EndTime = processNode17EndTime;
    }

    /**
     * 节点开始时间
     * @return process_node18_start_time 节点开始时间
     */
    public Long getProcessNode18StartTime() {
        return processNode18StartTime;
    }

    /**
     * 节点开始时间
     * @param processNode18StartTime 节点开始时间
     */
    public void setProcessNode18StartTime(Long processNode18StartTime) {
        this.processNode18StartTime = processNode18StartTime;
    }

    /**
     * 节点结束时间
     * @return process_node18_end_time 节点结束时间
     */
    public Long getProcessNode18EndTime() {
        return processNode18EndTime;
    }

    /**
     * 节点结束时间
     * @param processNode18EndTime 节点结束时间
     */
    public void setProcessNode18EndTime(Long processNode18EndTime) {
        this.processNode18EndTime = processNode18EndTime;
    }

    /**
     * 节点开始时间
     * @return process_node19_start_time 节点开始时间
     */
    public Long getProcessNode19StartTime() {
        return processNode19StartTime;
    }

    /**
     * 节点开始时间
     * @param processNode19StartTime 节点开始时间
     */
    public void setProcessNode19StartTime(Long processNode19StartTime) {
        this.processNode19StartTime = processNode19StartTime;
    }

    /**
     * 节点结束时间
     * @return process_node19_end_time 节点结束时间
     */
    public Long getProcessNode19EndTime() {
        return processNode19EndTime;
    }

    /**
     * 节点结束时间
     * @param processNode19EndTime 节点结束时间
     */
    public void setProcessNode19EndTime(Long processNode19EndTime) {
        this.processNode19EndTime = processNode19EndTime;
    }

    /**
     * 节点开始时间
     * @return process_node20_start_time 节点开始时间
     */
    public Long getProcessNode20StartTime() {
        return processNode20StartTime;
    }

    /**
     * 节点开始时间
     * @param processNode20StartTime 节点开始时间
     */
    public void setProcessNode20StartTime(Long processNode20StartTime) {
        this.processNode20StartTime = processNode20StartTime;
    }

    /**
     * 节点结束时间
     * @return process_node20_end_time 节点结束时间
     */
    public Long getProcessNode20EndTime() {
        return processNode20EndTime;
    }

    /**
     * 节点结束时间
     * @param processNode20EndTime 节点结束时间
     */
    public void setProcessNode20EndTime(Long processNode20EndTime) {
        this.processNode20EndTime = processNode20EndTime;
    }

    /**
     * 节点开始时间
     * @return process_node21_start_time 节点开始时间
     */
    public Long getProcessNode21StartTime() {
        return processNode21StartTime;
    }

    /**
     * 节点开始时间
     * @param processNode21StartTime 节点开始时间
     */
    public void setProcessNode21StartTime(Long processNode21StartTime) {
        this.processNode21StartTime = processNode21StartTime;
    }

    /**
     * 节点结束时间
     * @return process_node21_end_time 节点结束时间
     */
    public Long getProcessNode21EndTime() {
        return processNode21EndTime;
    }

    /**
     * 节点结束时间
     * @param processNode21EndTime 节点结束时间
     */
    public void setProcessNode21EndTime(Long processNode21EndTime) {
        this.processNode21EndTime = processNode21EndTime;
    }

    /**
     * 节点开始时间
     * @return process_node22_start_time 节点开始时间
     */
    public Long getProcessNode22StartTime() {
        return processNode22StartTime;
    }

    /**
     * 节点开始时间
     * @param processNode22StartTime 节点开始时间
     */
    public void setProcessNode22StartTime(Long processNode22StartTime) {
        this.processNode22StartTime = processNode22StartTime;
    }

    /**
     * 节点结束时间
     * @return process_node22_end_time 节点结束时间
     */
    public Long getProcessNode22EndTime() {
        return processNode22EndTime;
    }

    /**
     * 节点结束时间
     * @param processNode22EndTime 节点结束时间
     */
    public void setProcessNode22EndTime(Long processNode22EndTime) {
        this.processNode22EndTime = processNode22EndTime;
    }

    /**
     * 节点开始时间
     * @return process_node23_start_time 节点开始时间
     */
    public Long getProcessNode23StartTime() {
        return processNode23StartTime;
    }

    /**
     * 节点开始时间
     * @param processNode23StartTime 节点开始时间
     */
    public void setProcessNode23StartTime(Long processNode23StartTime) {
        this.processNode23StartTime = processNode23StartTime;
    }

    /**
     * 节点结束时间
     * @return process_node23_end_time 节点结束时间
     */
    public Long getProcessNode23EndTime() {
        return processNode23EndTime;
    }

    /**
     * 节点结束时间
     * @param processNode23EndTime 节点结束时间
     */
    public void setProcessNode23EndTime(Long processNode23EndTime) {
        this.processNode23EndTime = processNode23EndTime;
    }

    /**
     * 节点开始时间
     * @return process_node24_start_time 节点开始时间
     */
    public Long getProcessNode24StartTime() {
        return processNode24StartTime;
    }

    /**
     * 节点开始时间
     * @param processNode24StartTime 节点开始时间
     */
    public void setProcessNode24StartTime(Long processNode24StartTime) {
        this.processNode24StartTime = processNode24StartTime;
    }

    /**
     * 节点结束时间
     * @return process_node24_end_time 节点结束时间
     */
    public Long getProcessNode24EndTime() {
        return processNode24EndTime;
    }

    /**
     * 节点结束时间
     * @param processNode24EndTime 节点结束时间
     */
    public void setProcessNode24EndTime(Long processNode24EndTime) {
        this.processNode24EndTime = processNode24EndTime;
    }

    /**
     * 节点开始时间
     * @return process_node25_start_time 节点开始时间
     */
    public Long getProcessNode25StartTime() {
        return processNode25StartTime;
    }

    /**
     * 节点开始时间
     * @param processNode25StartTime 节点开始时间
     */
    public void setProcessNode25StartTime(Long processNode25StartTime) {
        this.processNode25StartTime = processNode25StartTime;
    }

    /**
     * 节点结束时间
     * @return process_node25_end_time 节点结束时间
     */
    public Long getProcessNode25EndTime() {
        return processNode25EndTime;
    }

    /**
     * 节点结束时间
     * @param processNode25EndTime 节点结束时间
     */
    public void setProcessNode25EndTime(Long processNode25EndTime) {
        this.processNode25EndTime = processNode25EndTime;
    }

    /**
     * 节点开始时间
     * @return process_node26_start_time 节点开始时间
     */
    public Long getProcessNode26StartTime() {
        return processNode26StartTime;
    }

    /**
     * 节点开始时间
     * @param processNode26StartTime 节点开始时间
     */
    public void setProcessNode26StartTime(Long processNode26StartTime) {
        this.processNode26StartTime = processNode26StartTime;
    }

    /**
     * 节点结束时间
     * @return process_node26_end_time 节点结束时间
     */
    public Long getProcessNode26EndTime() {
        return processNode26EndTime;
    }

    /**
     * 节点结束时间
     * @param processNode26EndTime 节点结束时间
     */
    public void setProcessNode26EndTime(Long processNode26EndTime) {
        this.processNode26EndTime = processNode26EndTime;
    }

    /**
     * 节点开始时间
     * @return process_node27_start_time 节点开始时间
     */
    public Long getProcessNode27StartTime() {
        return processNode27StartTime;
    }

    /**
     * 节点开始时间
     * @param processNode27StartTime 节点开始时间
     */
    public void setProcessNode27StartTime(Long processNode27StartTime) {
        this.processNode27StartTime = processNode27StartTime;
    }

    /**
     * 节点结束时间
     * @return process_node27_end_time 节点结束时间
     */
    public Long getProcessNode27EndTime() {
        return processNode27EndTime;
    }

    /**
     * 节点结束时间
     * @param processNode27EndTime 节点结束时间
     */
    public void setProcessNode27EndTime(Long processNode27EndTime) {
        this.processNode27EndTime = processNode27EndTime;
    }

    /**
     * 节点开始时间
     * @return process_node28_start_time 节点开始时间
     */
    public Long getProcessNode28StartTime() {
        return processNode28StartTime;
    }

    /**
     * 节点开始时间
     * @param processNode28StartTime 节点开始时间
     */
    public void setProcessNode28StartTime(Long processNode28StartTime) {
        this.processNode28StartTime = processNode28StartTime;
    }

    /**
     * 节点结束时间
     * @return process_node28_end_time 节点结束时间
     */
    public Long getProcessNode28EndTime() {
        return processNode28EndTime;
    }

    /**
     * 节点结束时间
     * @param processNode28EndTime 节点结束时间
     */
    public void setProcessNode28EndTime(Long processNode28EndTime) {
        this.processNode28EndTime = processNode28EndTime;
    }

    /**
     * 节点开始时间
     * @return process_node29_start_time 节点开始时间
     */
    public Long getProcessNode29StartTime() {
        return processNode29StartTime;
    }

    /**
     * 节点开始时间
     * @param processNode29StartTime 节点开始时间
     */
    public void setProcessNode29StartTime(Long processNode29StartTime) {
        this.processNode29StartTime = processNode29StartTime;
    }

    /**
     * 节点结束时间
     * @return process_node29_end_time 节点结束时间
     */
    public Long getProcessNode29EndTime() {
        return processNode29EndTime;
    }

    /**
     * 节点结束时间
     * @param processNode29EndTime 节点结束时间
     */
    public void setProcessNode29EndTime(Long processNode29EndTime) {
        this.processNode29EndTime = processNode29EndTime;
    }

    /**
     * 节点开始时间
     * @return process_node30_start_time 节点开始时间
     */
    public Long getProcessNode30StartTime() {
        return processNode30StartTime;
    }

    /**
     * 节点开始时间
     * @param processNode30StartTime 节点开始时间
     */
    public void setProcessNode30StartTime(Long processNode30StartTime) {
        this.processNode30StartTime = processNode30StartTime;
    }

    /**
     * 节点结束时间
     * @return process_node30_end_time 节点结束时间
     */
    public Long getProcessNode30EndTime() {
        return processNode30EndTime;
    }

    /**
     * 节点结束时间
     * @param processNode30EndTime 节点结束时间
     */
    public void setProcessNode30EndTime(Long processNode30EndTime) {
        this.processNode30EndTime = processNode30EndTime;
    }

    /**
     * 流程节点 1:1,2:1 格式 冒号前表示环节。冒号后表示当前环境状态
     * @return process_node 流程节点 1:1,2:1 格式 冒号前表示环节。冒号后表示当前环境状态
     */
    public String getProcessNode() {
        return processNode;
    }

    /**
     * 流程节点 1:1,2:1 格式 冒号前表示环节。冒号后表示当前环境状态
     * @param processNode 流程节点 1:1,2:1 格式 冒号前表示环节。冒号后表示当前环境状态
     */
    public void setProcessNode(String processNode) {
        this.processNode = processNode == null ? null : processNode.trim();
    }

    /**
     * 创建时间
     * @return created_at 创建时间
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * 创建时间
     * @param createdAt 创建时间
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 创建人
     * @return created_by 创建人
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 创建人
     * @param createdBy 创建人
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * 更新人
     * @return updated_by 更新人
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * 更新人
     * @param updatedBy 更新人
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    /**
     * 更新时间
     * @return updated_at 更新时间
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 更新时间
     * @param updatedAt 更新时间
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 是否删除标示
     * @return is_deleted 是否删除标示
     */
    public Byte getIsDeleted() {
        return isDeleted;
    }

    /**
     * 是否删除标示
     * @param isDeleted 是否删除标示
     */
    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * 车型ID
     * @return chexing_id 车型ID
     */
    public Integer getChexingId() {
        return chexingId;
    }

    /**
     * 车型ID
     * @param chexingId 车型ID
     */
    public void setChexingId(Integer chexingId) {
        this.chexingId = chexingId;
    }

    /**
     * 交车时间
     * @return performance_status_updated_at 交车时间
     */
    public Date getPerformanceStatusUpdatedAt() {
        return performanceStatusUpdatedAt;
    }

    /**
     * 交车时间
     * @param performanceStatusUpdatedAt 交车时间
     */
    public void setPerformanceStatusUpdatedAt(Date performanceStatusUpdatedAt) {
        this.performanceStatusUpdatedAt = performanceStatusUpdatedAt;
    }

    /**
     * 订单状态改变时间
     * @return order_status_updated_at 订单状态改变时间
     */
    public Date getOrderStatusUpdatedAt() {
        return orderStatusUpdatedAt;
    }

    /**
     * 订单状态改变时间
     * @param orderStatusUpdatedAt 订单状态改变时间
     */
    public void setOrderStatusUpdatedAt(Date orderStatusUpdatedAt) {
        this.orderStatusUpdatedAt = orderStatusUpdatedAt;
    }

    /**
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", customerName=").append(customerName);
        sb.append(", cityId=").append(cityId);
        sb.append(", brandId=").append(brandId);
        sb.append(", chexiId=").append(chexiId);
        sb.append(", skuId=").append(skuId);
        sb.append(", vin=").append(vin);
        sb.append(", boardingCityId=").append(boardingCityId);
        sb.append(", deliveryCityId=").append(deliveryCityId);
        sb.append(", billingCityId=").append(billingCityId);
        sb.append(", carId=").append(carId);
        sb.append(", supplyCarType=").append(supplyCarType);
        sb.append(", downPaymentTime=").append(downPaymentTime);
        sb.append(", downPaymentStatus=").append(downPaymentStatus);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", performanceStatus=").append(performanceStatus);
        sb.append(", processNode1StartTime=").append(processNode1StartTime);
        sb.append(", processNode1EndTime=").append(processNode1EndTime);
        sb.append(", processNode2StartTime=").append(processNode2StartTime);
        sb.append(", processNode2EndTime=").append(processNode2EndTime);
        sb.append(", processNode3StartTime=").append(processNode3StartTime);
        sb.append(", processNode3EndTime=").append(processNode3EndTime);
        sb.append(", processNode4StartTime=").append(processNode4StartTime);
        sb.append(", processNode4EndTime=").append(processNode4EndTime);
        sb.append(", processNode5StartTime=").append(processNode5StartTime);
        sb.append(", processNode5EndTime=").append(processNode5EndTime);
        sb.append(", processNode6StartTime=").append(processNode6StartTime);
        sb.append(", processNode6EndTime=").append(processNode6EndTime);
        sb.append(", processNode7StartTime=").append(processNode7StartTime);
        sb.append(", processNode7EndTime=").append(processNode7EndTime);
        sb.append(", processNode8StartTime=").append(processNode8StartTime);
        sb.append(", processNode8EndTime=").append(processNode8EndTime);
        sb.append(", processNode9StartTime=").append(processNode9StartTime);
        sb.append(", processNode9EndTime=").append(processNode9EndTime);
        sb.append(", processNode10StartTime=").append(processNode10StartTime);
        sb.append(", processNode10EndTime=").append(processNode10EndTime);
        sb.append(", processNode11StartTime=").append(processNode11StartTime);
        sb.append(", processNode11EndTime=").append(processNode11EndTime);
        sb.append(", processNode12StartTime=").append(processNode12StartTime);
        sb.append(", processNode12EndTime=").append(processNode12EndTime);
        sb.append(", processNode13StartTime=").append(processNode13StartTime);
        sb.append(", processNode13EndTime=").append(processNode13EndTime);
        sb.append(", processNode14StartTime=").append(processNode14StartTime);
        sb.append(", processNode14EndTime=").append(processNode14EndTime);
        sb.append(", processNode15StartTime=").append(processNode15StartTime);
        sb.append(", processNode15EndTime=").append(processNode15EndTime);
        sb.append(", processNode16StartTime=").append(processNode16StartTime);
        sb.append(", processNode16EndTime=").append(processNode16EndTime);
        sb.append(", processNode17StartTime=").append(processNode17StartTime);
        sb.append(", processNode17EndTime=").append(processNode17EndTime);
        sb.append(", processNode18StartTime=").append(processNode18StartTime);
        sb.append(", processNode18EndTime=").append(processNode18EndTime);
        sb.append(", processNode19StartTime=").append(processNode19StartTime);
        sb.append(", processNode19EndTime=").append(processNode19EndTime);
        sb.append(", processNode20StartTime=").append(processNode20StartTime);
        sb.append(", processNode20EndTime=").append(processNode20EndTime);
        sb.append(", processNode21StartTime=").append(processNode21StartTime);
        sb.append(", processNode21EndTime=").append(processNode21EndTime);
        sb.append(", processNode22StartTime=").append(processNode22StartTime);
        sb.append(", processNode22EndTime=").append(processNode22EndTime);
        sb.append(", processNode23StartTime=").append(processNode23StartTime);
        sb.append(", processNode23EndTime=").append(processNode23EndTime);
        sb.append(", processNode24StartTime=").append(processNode24StartTime);
        sb.append(", processNode24EndTime=").append(processNode24EndTime);
        sb.append(", processNode25StartTime=").append(processNode25StartTime);
        sb.append(", processNode25EndTime=").append(processNode25EndTime);
        sb.append(", processNode26StartTime=").append(processNode26StartTime);
        sb.append(", processNode26EndTime=").append(processNode26EndTime);
        sb.append(", processNode27StartTime=").append(processNode27StartTime);
        sb.append(", processNode27EndTime=").append(processNode27EndTime);
        sb.append(", processNode28StartTime=").append(processNode28StartTime);
        sb.append(", processNode28EndTime=").append(processNode28EndTime);
        sb.append(", processNode29StartTime=").append(processNode29StartTime);
        sb.append(", processNode29EndTime=").append(processNode29EndTime);
        sb.append(", processNode30StartTime=").append(processNode30StartTime);
        sb.append(", processNode30EndTime=").append(processNode30EndTime);
        sb.append(", processNode=").append(processNode);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", updatedBy=").append(updatedBy);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", chexingId=").append(chexingId);
        sb.append(", performanceStatusUpdatedAt=").append(performanceStatusUpdatedAt);
        sb.append(", orderStatusUpdatedAt=").append(orderStatusUpdatedAt);
        sb.append("]");
        return sb.toString();
    }
}