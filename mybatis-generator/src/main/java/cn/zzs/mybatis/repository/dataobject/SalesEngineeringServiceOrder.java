package cn.zzs.mybatis.repository.dataobject;

import java.util.Date;

public class SalesEngineeringServiceOrder {
    private String id;

    private String serviceOrderNo;

    private String brand;

    private String category;

    private String projectAbbreviation;

    private String companyAbbreviation;

    private String estateAbbreviation;

    private String contractNumber;

    private String signApplyId;

    private String applyCode;

    private String houseType;

    private String planNo;

    private String batchInfo;

    private Integer quantity;

    private String orgId;

    private String shopId;

    private String shopNo;

    private String customerId;

    private String source;

    private String remark;

    private String creator;

    private String creatorId;

    private Date createDt;

    private String lastUpdator;

    private String lastUpdatorId;

    private Date lastUpdateDt;

    private Boolean deleted;

    private Integer status;

    private Boolean onkeyCreateOrder;

    private Boolean repeatOrder;

    private Integer excelContractNoTotal;

    private String orgNo;

    public SalesEngineeringServiceOrder(String id, String serviceOrderNo, String brand, String category, String projectAbbreviation, String companyAbbreviation, String estateAbbreviation, String contractNumber, String signApplyId, String applyCode, String houseType, String planNo, String batchInfo, Integer quantity, String orgId, String shopId, String shopNo, String customerId, String source, String remark, String creator, String creatorId, Date createDt, String lastUpdator, String lastUpdatorId, Date lastUpdateDt, Boolean deleted, Integer status, Boolean onkeyCreateOrder, Boolean repeatOrder, Integer excelContractNoTotal, String orgNo) {
        this.id = id;
        this.serviceOrderNo = serviceOrderNo;
        this.brand = brand;
        this.category = category;
        this.projectAbbreviation = projectAbbreviation;
        this.companyAbbreviation = companyAbbreviation;
        this.estateAbbreviation = estateAbbreviation;
        this.contractNumber = contractNumber;
        this.signApplyId = signApplyId;
        this.applyCode = applyCode;
        this.houseType = houseType;
        this.planNo = planNo;
        this.batchInfo = batchInfo;
        this.quantity = quantity;
        this.orgId = orgId;
        this.shopId = shopId;
        this.shopNo = shopNo;
        this.customerId = customerId;
        this.source = source;
        this.remark = remark;
        this.creator = creator;
        this.creatorId = creatorId;
        this.createDt = createDt;
        this.lastUpdator = lastUpdator;
        this.lastUpdatorId = lastUpdatorId;
        this.lastUpdateDt = lastUpdateDt;
        this.deleted = deleted;
        this.status = status;
        this.onkeyCreateOrder = onkeyCreateOrder;
        this.repeatOrder = repeatOrder;
        this.excelContractNoTotal = excelContractNoTotal;
        this.orgNo = orgNo;
    }

    public SalesEngineeringServiceOrder() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getServiceOrderNo() {
        return serviceOrderNo;
    }

    public void setServiceOrderNo(String serviceOrderNo) {
        this.serviceOrderNo = serviceOrderNo == null ? null : serviceOrderNo.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getProjectAbbreviation() {
        return projectAbbreviation;
    }

    public void setProjectAbbreviation(String projectAbbreviation) {
        this.projectAbbreviation = projectAbbreviation == null ? null : projectAbbreviation.trim();
    }

    public String getCompanyAbbreviation() {
        return companyAbbreviation;
    }

    public void setCompanyAbbreviation(String companyAbbreviation) {
        this.companyAbbreviation = companyAbbreviation == null ? null : companyAbbreviation.trim();
    }

    public String getEstateAbbreviation() {
        return estateAbbreviation;
    }

    public void setEstateAbbreviation(String estateAbbreviation) {
        this.estateAbbreviation = estateAbbreviation == null ? null : estateAbbreviation.trim();
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber == null ? null : contractNumber.trim();
    }

    public String getSignApplyId() {
        return signApplyId;
    }

    public void setSignApplyId(String signApplyId) {
        this.signApplyId = signApplyId == null ? null : signApplyId.trim();
    }

    public String getApplyCode() {
        return applyCode;
    }

    public void setApplyCode(String applyCode) {
        this.applyCode = applyCode == null ? null : applyCode.trim();
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType == null ? null : houseType.trim();
    }

    public String getPlanNo() {
        return planNo;
    }

    public void setPlanNo(String planNo) {
        this.planNo = planNo == null ? null : planNo.trim();
    }

    public String getBatchInfo() {
        return batchInfo;
    }

    public void setBatchInfo(String batchInfo) {
        this.batchInfo = batchInfo == null ? null : batchInfo.trim();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId == null ? null : shopId.trim();
    }

    public String getShopNo() {
        return shopNo;
    }

    public void setShopNo(String shopNo) {
        this.shopNo = shopNo == null ? null : shopNo.trim();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId == null ? null : creatorId.trim();
    }

    public Date getCreateDt() {
        return createDt;
    }

    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    public String getLastUpdator() {
        return lastUpdator;
    }

    public void setLastUpdator(String lastUpdator) {
        this.lastUpdator = lastUpdator == null ? null : lastUpdator.trim();
    }

    public String getLastUpdatorId() {
        return lastUpdatorId;
    }

    public void setLastUpdatorId(String lastUpdatorId) {
        this.lastUpdatorId = lastUpdatorId == null ? null : lastUpdatorId.trim();
    }

    public Date getLastUpdateDt() {
        return lastUpdateDt;
    }

    public void setLastUpdateDt(Date lastUpdateDt) {
        this.lastUpdateDt = lastUpdateDt;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getOnkeyCreateOrder() {
        return onkeyCreateOrder;
    }

    public void setOnkeyCreateOrder(Boolean onkeyCreateOrder) {
        this.onkeyCreateOrder = onkeyCreateOrder;
    }

    public Boolean getRepeatOrder() {
        return repeatOrder;
    }

    public void setRepeatOrder(Boolean repeatOrder) {
        this.repeatOrder = repeatOrder;
    }

    public Integer getExcelContractNoTotal() {
        return excelContractNoTotal;
    }

    public void setExcelContractNoTotal(Integer excelContractNoTotal) {
        this.excelContractNoTotal = excelContractNoTotal;
    }

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo == null ? null : orgNo.trim();
    }
}