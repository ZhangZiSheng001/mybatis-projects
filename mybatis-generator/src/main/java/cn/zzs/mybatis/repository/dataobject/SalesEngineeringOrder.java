package cn.zzs.mybatis.repository.dataobject;

import java.math.BigDecimal;
import java.util.Date;

public class SalesEngineeringOrder {
    private String id;

    private String orderContractNo;

    private String orderNo;

    private String brand;

    private String category;

    private String orgId;

    private String orderCategory;

    private String orderType;

    private String productCategory;

    private String designSource;

    private String status;

    private Date firstSyncDt;

    private String firstPrincipalId;

    private String firstPrincipal;

    private Date syncDt;

    private String principal;

    private String principalId;

    private Boolean syncStatus;

    private Boolean exemptAudit;

    private Boolean repeatOrder;

    private Boolean repeatSync;

    private Boolean isGroup;

    private Boolean hide;

    private Boolean old;

    private Boolean decideFirst;

    private Boolean deleted;

    private String franchiserCode;

    private String shopCode;

    private Date expectDeliveryDt;

    private Date planDeliveryDt;

    private String basinInstallMode;

    private String designer;

    private String designerId;

    private String designerTel;

    private String productRequirement;

    private String activityType;

    private String receiverId;

    private String receiver;

    private String receiverTel;

    private String receiveAddress;

    private BigDecimal amount;

    private String amountItemFile;

    private String progressName;

    private Integer quantity;

    private String remark;

    private String applyCode;

    private String signApplyId;

    private String creator;

    private String creatorId;

    private Date createDt;

    private String lastUpdator;

    private String lastUpdatorId;

    private Date lastUpdateDt;

    private String customerId;

    private String shopId;

    private String repeatBatchNo;

    private String serviceOrderId;

    private Byte isReplaceTransmit;

    private Byte transmitTryTimes;

    private String productChannel;

    private Byte specialButton;

    private Boolean orderRecycle;

    private String batchImportNo;

    public SalesEngineeringOrder(String id, String orderContractNo, String orderNo, String brand, String category, String orgId, String orderCategory, String orderType, String productCategory, String designSource, String status, Date firstSyncDt, String firstPrincipalId, String firstPrincipal, Date syncDt, String principal, String principalId, Boolean syncStatus, Boolean exemptAudit, Boolean repeatOrder, Boolean repeatSync, Boolean isGroup, Boolean hide, Boolean old, Boolean decideFirst, Boolean deleted, String franchiserCode, String shopCode, Date expectDeliveryDt, Date planDeliveryDt, String basinInstallMode, String designer, String designerId, String designerTel, String productRequirement, String activityType, String receiverId, String receiver, String receiverTel, String receiveAddress, BigDecimal amount, String amountItemFile, String progressName, Integer quantity, String remark, String applyCode, String signApplyId, String creator, String creatorId, Date createDt, String lastUpdator, String lastUpdatorId, Date lastUpdateDt, String customerId, String shopId, String repeatBatchNo, String serviceOrderId, Byte isReplaceTransmit, Byte transmitTryTimes, String productChannel, Byte specialButton, Boolean orderRecycle, String batchImportNo) {
        this.id = id;
        this.orderContractNo = orderContractNo;
        this.orderNo = orderNo;
        this.brand = brand;
        this.category = category;
        this.orgId = orgId;
        this.orderCategory = orderCategory;
        this.orderType = orderType;
        this.productCategory = productCategory;
        this.designSource = designSource;
        this.status = status;
        this.firstSyncDt = firstSyncDt;
        this.firstPrincipalId = firstPrincipalId;
        this.firstPrincipal = firstPrincipal;
        this.syncDt = syncDt;
        this.principal = principal;
        this.principalId = principalId;
        this.syncStatus = syncStatus;
        this.exemptAudit = exemptAudit;
        this.repeatOrder = repeatOrder;
        this.repeatSync = repeatSync;
        this.isGroup = isGroup;
        this.hide = hide;
        this.old = old;
        this.decideFirst = decideFirst;
        this.deleted = deleted;
        this.franchiserCode = franchiserCode;
        this.shopCode = shopCode;
        this.expectDeliveryDt = expectDeliveryDt;
        this.planDeliveryDt = planDeliveryDt;
        this.basinInstallMode = basinInstallMode;
        this.designer = designer;
        this.designerId = designerId;
        this.designerTel = designerTel;
        this.productRequirement = productRequirement;
        this.activityType = activityType;
        this.receiverId = receiverId;
        this.receiver = receiver;
        this.receiverTel = receiverTel;
        this.receiveAddress = receiveAddress;
        this.amount = amount;
        this.amountItemFile = amountItemFile;
        this.progressName = progressName;
        this.quantity = quantity;
        this.remark = remark;
        this.applyCode = applyCode;
        this.signApplyId = signApplyId;
        this.creator = creator;
        this.creatorId = creatorId;
        this.createDt = createDt;
        this.lastUpdator = lastUpdator;
        this.lastUpdatorId = lastUpdatorId;
        this.lastUpdateDt = lastUpdateDt;
        this.customerId = customerId;
        this.shopId = shopId;
        this.repeatBatchNo = repeatBatchNo;
        this.serviceOrderId = serviceOrderId;
        this.isReplaceTransmit = isReplaceTransmit;
        this.transmitTryTimes = transmitTryTimes;
        this.productChannel = productChannel;
        this.specialButton = specialButton;
        this.orderRecycle = orderRecycle;
        this.batchImportNo = batchImportNo;
    }

    public SalesEngineeringOrder() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrderContractNo() {
        return orderContractNo;
    }

    public void setOrderContractNo(String orderContractNo) {
        this.orderContractNo = orderContractNo == null ? null : orderContractNo.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
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

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getOrderCategory() {
        return orderCategory;
    }

    public void setOrderCategory(String orderCategory) {
        this.orderCategory = orderCategory == null ? null : orderCategory.trim();
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory == null ? null : productCategory.trim();
    }

    public String getDesignSource() {
        return designSource;
    }

    public void setDesignSource(String designSource) {
        this.designSource = designSource == null ? null : designSource.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getFirstSyncDt() {
        return firstSyncDt;
    }

    public void setFirstSyncDt(Date firstSyncDt) {
        this.firstSyncDt = firstSyncDt;
    }

    public String getFirstPrincipalId() {
        return firstPrincipalId;
    }

    public void setFirstPrincipalId(String firstPrincipalId) {
        this.firstPrincipalId = firstPrincipalId == null ? null : firstPrincipalId.trim();
    }

    public String getFirstPrincipal() {
        return firstPrincipal;
    }

    public void setFirstPrincipal(String firstPrincipal) {
        this.firstPrincipal = firstPrincipal == null ? null : firstPrincipal.trim();
    }

    public Date getSyncDt() {
        return syncDt;
    }

    public void setSyncDt(Date syncDt) {
        this.syncDt = syncDt;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal == null ? null : principal.trim();
    }

    public String getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(String principalId) {
        this.principalId = principalId == null ? null : principalId.trim();
    }

    public Boolean getSyncStatus() {
        return syncStatus;
    }

    public void setSyncStatus(Boolean syncStatus) {
        this.syncStatus = syncStatus;
    }

    public Boolean getExemptAudit() {
        return exemptAudit;
    }

    public void setExemptAudit(Boolean exemptAudit) {
        this.exemptAudit = exemptAudit;
    }

    public Boolean getRepeatOrder() {
        return repeatOrder;
    }

    public void setRepeatOrder(Boolean repeatOrder) {
        this.repeatOrder = repeatOrder;
    }

    public Boolean getRepeatSync() {
        return repeatSync;
    }

    public void setRepeatSync(Boolean repeatSync) {
        this.repeatSync = repeatSync;
    }

    public Boolean getIsGroup() {
        return isGroup;
    }

    public void setIsGroup(Boolean isGroup) {
        this.isGroup = isGroup;
    }

    public Boolean getHide() {
        return hide;
    }

    public void setHide(Boolean hide) {
        this.hide = hide;
    }

    public Boolean getOld() {
        return old;
    }

    public void setOld(Boolean old) {
        this.old = old;
    }

    public Boolean getDecideFirst() {
        return decideFirst;
    }

    public void setDecideFirst(Boolean decideFirst) {
        this.decideFirst = decideFirst;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getFranchiserCode() {
        return franchiserCode;
    }

    public void setFranchiserCode(String franchiserCode) {
        this.franchiserCode = franchiserCode == null ? null : franchiserCode.trim();
    }

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode == null ? null : shopCode.trim();
    }

    public Date getExpectDeliveryDt() {
        return expectDeliveryDt;
    }

    public void setExpectDeliveryDt(Date expectDeliveryDt) {
        this.expectDeliveryDt = expectDeliveryDt;
    }

    public Date getPlanDeliveryDt() {
        return planDeliveryDt;
    }

    public void setPlanDeliveryDt(Date planDeliveryDt) {
        this.planDeliveryDt = planDeliveryDt;
    }

    public String getBasinInstallMode() {
        return basinInstallMode;
    }

    public void setBasinInstallMode(String basinInstallMode) {
        this.basinInstallMode = basinInstallMode == null ? null : basinInstallMode.trim();
    }

    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer == null ? null : designer.trim();
    }

    public String getDesignerId() {
        return designerId;
    }

    public void setDesignerId(String designerId) {
        this.designerId = designerId == null ? null : designerId.trim();
    }

    public String getDesignerTel() {
        return designerTel;
    }

    public void setDesignerTel(String designerTel) {
        this.designerTel = designerTel == null ? null : designerTel.trim();
    }

    public String getProductRequirement() {
        return productRequirement;
    }

    public void setProductRequirement(String productRequirement) {
        this.productRequirement = productRequirement == null ? null : productRequirement.trim();
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType == null ? null : activityType.trim();
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId == null ? null : receiverId.trim();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }

    public String getReceiverTel() {
        return receiverTel;
    }

    public void setReceiverTel(String receiverTel) {
        this.receiverTel = receiverTel == null ? null : receiverTel.trim();
    }

    public String getReceiveAddress() {
        return receiveAddress;
    }

    public void setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress == null ? null : receiveAddress.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getAmountItemFile() {
        return amountItemFile;
    }

    public void setAmountItemFile(String amountItemFile) {
        this.amountItemFile = amountItemFile == null ? null : amountItemFile.trim();
    }

    public String getProgressName() {
        return progressName;
    }

    public void setProgressName(String progressName) {
        this.progressName = progressName == null ? null : progressName.trim();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getApplyCode() {
        return applyCode;
    }

    public void setApplyCode(String applyCode) {
        this.applyCode = applyCode == null ? null : applyCode.trim();
    }

    public String getSignApplyId() {
        return signApplyId;
    }

    public void setSignApplyId(String signApplyId) {
        this.signApplyId = signApplyId == null ? null : signApplyId.trim();
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

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId == null ? null : shopId.trim();
    }

    public String getRepeatBatchNo() {
        return repeatBatchNo;
    }

    public void setRepeatBatchNo(String repeatBatchNo) {
        this.repeatBatchNo = repeatBatchNo == null ? null : repeatBatchNo.trim();
    }

    public String getServiceOrderId() {
        return serviceOrderId;
    }

    public void setServiceOrderId(String serviceOrderId) {
        this.serviceOrderId = serviceOrderId == null ? null : serviceOrderId.trim();
    }

    public Byte getIsReplaceTransmit() {
        return isReplaceTransmit;
    }

    public void setIsReplaceTransmit(Byte isReplaceTransmit) {
        this.isReplaceTransmit = isReplaceTransmit;
    }

    public Byte getTransmitTryTimes() {
        return transmitTryTimes;
    }

    public void setTransmitTryTimes(Byte transmitTryTimes) {
        this.transmitTryTimes = transmitTryTimes;
    }

    public String getProductChannel() {
        return productChannel;
    }

    public void setProductChannel(String productChannel) {
        this.productChannel = productChannel == null ? null : productChannel.trim();
    }

    public Byte getSpecialButton() {
        return specialButton;
    }

    public void setSpecialButton(Byte specialButton) {
        this.specialButton = specialButton;
    }

    public Boolean getOrderRecycle() {
        return orderRecycle;
    }

    public void setOrderRecycle(Boolean orderRecycle) {
        this.orderRecycle = orderRecycle;
    }

    public String getBatchImportNo() {
        return batchImportNo;
    }

    public void setBatchImportNo(String batchImportNo) {
        this.batchImportNo = batchImportNo == null ? null : batchImportNo.trim();
    }
}