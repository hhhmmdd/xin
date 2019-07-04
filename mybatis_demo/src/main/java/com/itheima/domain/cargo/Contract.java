package com.itheima.domain.cargo;

import java.math.BigDecimal;
import java.util.Date;

public class Contract {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_contract.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_contract.offeror
     *
     * @mbg.generated
     */
    private String offeror;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_contract.contract_no
     *
     * @mbg.generated
     */
    private String contractNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_contract.signing_date
     *
     * @mbg.generated
     */
    private Date signingDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_contract.input_by
     *
     * @mbg.generated
     */
    private String inputBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_contract.check_by
     *
     * @mbg.generated
     */
    private String checkBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_contract.inspector
     *
     * @mbg.generated
     */
    private String inspector;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_contract.total_amount
     *
     * @mbg.generated
     */
    private BigDecimal totalAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_contract.crequest
     *
     * @mbg.generated
     */
    private String crequest;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_contract.custom_name
     *
     * @mbg.generated
     */
    private String customName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_contract.ship_time
     *
     * @mbg.generated
     */
    private Date shipTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_contract.import_num
     *
     * @mbg.generated
     */
    private Long importNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_contract.delivery_period
     *
     * @mbg.generated
     */
    private Date deliveryPeriod;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_contract.old_state
     *
     * @mbg.generated
     */
    private Integer oldState;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_contract.out_state
     *
     * @mbg.generated
     */
    private Integer outState;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_contract.trade_terms
     *
     * @mbg.generated
     */
    private String tradeTerms;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_contract.print_style
     *
     * @mbg.generated
     */
    private String printStyle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_contract.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_contract.state
     *
     * @mbg.generated
     */
    private Integer state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_contract.pro_num
     *
     * @mbg.generated
     */
    private Integer proNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_contract.ext_num
     *
     * @mbg.generated
     */
    private Integer extNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_contract.create_by
     *
     * @mbg.generated
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_contract.create_dept
     *
     * @mbg.generated
     */
    private String createDept;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_contract.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_contract.update_by
     *
     * @mbg.generated
     */
    private String updateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_contract.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_contract.company_id
     *
     * @mbg.generated
     */
    private String companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column co_contract.company_name
     *
     * @mbg.generated
     */
    private String companyName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_contract.id
     *
     * @return the value of co_contract.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_contract.id
     *
     * @param id the value for co_contract.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_contract.offeror
     *
     * @return the value of co_contract.offeror
     *
     * @mbg.generated
     */
    public String getOfferor() {
        return offeror;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_contract.offeror
     *
     * @param offeror the value for co_contract.offeror
     *
     * @mbg.generated
     */
    public void setOfferor(String offeror) {
        this.offeror = offeror == null ? null : offeror.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_contract.contract_no
     *
     * @return the value of co_contract.contract_no
     *
     * @mbg.generated
     */
    public String getContractNo() {
        return contractNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_contract.contract_no
     *
     * @param contractNo the value for co_contract.contract_no
     *
     * @mbg.generated
     */
    public void setContractNo(String contractNo) {
        this.contractNo = contractNo == null ? null : contractNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_contract.signing_date
     *
     * @return the value of co_contract.signing_date
     *
     * @mbg.generated
     */
    public Date getSigningDate() {
        return signingDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_contract.signing_date
     *
     * @param signingDate the value for co_contract.signing_date
     *
     * @mbg.generated
     */
    public void setSigningDate(Date signingDate) {
        this.signingDate = signingDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_contract.input_by
     *
     * @return the value of co_contract.input_by
     *
     * @mbg.generated
     */
    public String getInputBy() {
        return inputBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_contract.input_by
     *
     * @param inputBy the value for co_contract.input_by
     *
     * @mbg.generated
     */
    public void setInputBy(String inputBy) {
        this.inputBy = inputBy == null ? null : inputBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_contract.check_by
     *
     * @return the value of co_contract.check_by
     *
     * @mbg.generated
     */
    public String getCheckBy() {
        return checkBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_contract.check_by
     *
     * @param checkBy the value for co_contract.check_by
     *
     * @mbg.generated
     */
    public void setCheckBy(String checkBy) {
        this.checkBy = checkBy == null ? null : checkBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_contract.inspector
     *
     * @return the value of co_contract.inspector
     *
     * @mbg.generated
     */
    public String getInspector() {
        return inspector;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_contract.inspector
     *
     * @param inspector the value for co_contract.inspector
     *
     * @mbg.generated
     */
    public void setInspector(String inspector) {
        this.inspector = inspector == null ? null : inspector.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_contract.total_amount
     *
     * @return the value of co_contract.total_amount
     *
     * @mbg.generated
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_contract.total_amount
     *
     * @param totalAmount the value for co_contract.total_amount
     *
     * @mbg.generated
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_contract.crequest
     *
     * @return the value of co_contract.crequest
     *
     * @mbg.generated
     */
    public String getCrequest() {
        return crequest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_contract.crequest
     *
     * @param crequest the value for co_contract.crequest
     *
     * @mbg.generated
     */
    public void setCrequest(String crequest) {
        this.crequest = crequest == null ? null : crequest.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_contract.custom_name
     *
     * @return the value of co_contract.custom_name
     *
     * @mbg.generated
     */
    public String getCustomName() {
        return customName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_contract.custom_name
     *
     * @param customName the value for co_contract.custom_name
     *
     * @mbg.generated
     */
    public void setCustomName(String customName) {
        this.customName = customName == null ? null : customName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_contract.ship_time
     *
     * @return the value of co_contract.ship_time
     *
     * @mbg.generated
     */
    public Date getShipTime() {
        return shipTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_contract.ship_time
     *
     * @param shipTime the value for co_contract.ship_time
     *
     * @mbg.generated
     */
    public void setShipTime(Date shipTime) {
        this.shipTime = shipTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_contract.import_num
     *
     * @return the value of co_contract.import_num
     *
     * @mbg.generated
     */
    public Long getImportNum() {
        return importNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_contract.import_num
     *
     * @param importNum the value for co_contract.import_num
     *
     * @mbg.generated
     */
    public void setImportNum(Long importNum) {
        this.importNum = importNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_contract.delivery_period
     *
     * @return the value of co_contract.delivery_period
     *
     * @mbg.generated
     */
    public Date getDeliveryPeriod() {
        return deliveryPeriod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_contract.delivery_period
     *
     * @param deliveryPeriod the value for co_contract.delivery_period
     *
     * @mbg.generated
     */
    public void setDeliveryPeriod(Date deliveryPeriod) {
        this.deliveryPeriod = deliveryPeriod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_contract.old_state
     *
     * @return the value of co_contract.old_state
     *
     * @mbg.generated
     */
    public Integer getOldState() {
        return oldState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_contract.old_state
     *
     * @param oldState the value for co_contract.old_state
     *
     * @mbg.generated
     */
    public void setOldState(Integer oldState) {
        this.oldState = oldState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_contract.out_state
     *
     * @return the value of co_contract.out_state
     *
     * @mbg.generated
     */
    public Integer getOutState() {
        return outState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_contract.out_state
     *
     * @param outState the value for co_contract.out_state
     *
     * @mbg.generated
     */
    public void setOutState(Integer outState) {
        this.outState = outState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_contract.trade_terms
     *
     * @return the value of co_contract.trade_terms
     *
     * @mbg.generated
     */
    public String getTradeTerms() {
        return tradeTerms;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_contract.trade_terms
     *
     * @param tradeTerms the value for co_contract.trade_terms
     *
     * @mbg.generated
     */
    public void setTradeTerms(String tradeTerms) {
        this.tradeTerms = tradeTerms == null ? null : tradeTerms.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_contract.print_style
     *
     * @return the value of co_contract.print_style
     *
     * @mbg.generated
     */
    public String getPrintStyle() {
        return printStyle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_contract.print_style
     *
     * @param printStyle the value for co_contract.print_style
     *
     * @mbg.generated
     */
    public void setPrintStyle(String printStyle) {
        this.printStyle = printStyle == null ? null : printStyle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_contract.remark
     *
     * @return the value of co_contract.remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_contract.remark
     *
     * @param remark the value for co_contract.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_contract.state
     *
     * @return the value of co_contract.state
     *
     * @mbg.generated
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_contract.state
     *
     * @param state the value for co_contract.state
     *
     * @mbg.generated
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_contract.pro_num
     *
     * @return the value of co_contract.pro_num
     *
     * @mbg.generated
     */
    public Integer getProNum() {
        return proNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_contract.pro_num
     *
     * @param proNum the value for co_contract.pro_num
     *
     * @mbg.generated
     */
    public void setProNum(Integer proNum) {
        this.proNum = proNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_contract.ext_num
     *
     * @return the value of co_contract.ext_num
     *
     * @mbg.generated
     */
    public Integer getExtNum() {
        return extNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_contract.ext_num
     *
     * @param extNum the value for co_contract.ext_num
     *
     * @mbg.generated
     */
    public void setExtNum(Integer extNum) {
        this.extNum = extNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_contract.create_by
     *
     * @return the value of co_contract.create_by
     *
     * @mbg.generated
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_contract.create_by
     *
     * @param createBy the value for co_contract.create_by
     *
     * @mbg.generated
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_contract.create_dept
     *
     * @return the value of co_contract.create_dept
     *
     * @mbg.generated
     */
    public String getCreateDept() {
        return createDept;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_contract.create_dept
     *
     * @param createDept the value for co_contract.create_dept
     *
     * @mbg.generated
     */
    public void setCreateDept(String createDept) {
        this.createDept = createDept == null ? null : createDept.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_contract.create_time
     *
     * @return the value of co_contract.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_contract.create_time
     *
     * @param createTime the value for co_contract.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_contract.update_by
     *
     * @return the value of co_contract.update_by
     *
     * @mbg.generated
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_contract.update_by
     *
     * @param updateBy the value for co_contract.update_by
     *
     * @mbg.generated
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_contract.update_time
     *
     * @return the value of co_contract.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_contract.update_time
     *
     * @param updateTime the value for co_contract.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_contract.company_id
     *
     * @return the value of co_contract.company_id
     *
     * @mbg.generated
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_contract.company_id
     *
     * @param companyId the value for co_contract.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column co_contract.company_name
     *
     * @return the value of co_contract.company_name
     *
     * @mbg.generated
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column co_contract.company_name
     *
     * @param companyName the value for co_contract.company_name
     *
     * @mbg.generated
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }
}