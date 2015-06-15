/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entrycode.emmanuel.model;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.greenpole.entity.model.holder.Holder;

/**
 *
 * @author user
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"id","holder", "rightsIssueId", "issuer", "totalHoldings",
    "allottedRights", "sharesSubscribed", "additionalSharesSubscribed",
    "amountPaid", "issuingHouse", "sharesSubscribedValue", "additionalSharesSubValue", "additionalSharesGivenValue", "totalValue",
    "totalSharesRenounced", "returnMoney", "cancelled", "clientCompanyId", "additionalSharesAwaitingSub", "valueOfAdditionalShares", "dateApplied",
    "clearingHouseId","clearingHouseName","clearingHouseBrokerage","rate","percentageValueForDistri","taxRate","applicationType","totalRightsAvailable",
    "totalSharesSubscribed","valueOfTotalSharesSubscribed","HolderAPRAccountNo"})
public class RightsIssueApplication {

    @XmlElement
    private int id;
    @XmlElement
    private int clearingHouseId;
    @XmlElement
    private Holder holder;
    @XmlElement
    private int rightsIssueId;
    @XmlElement
    private String issuer;
    @XmlElement
    private int totalHoldings;
    @XmlElement
    private int allottedRights;
    @XmlElement
    private int sharesSubscribed;
    @XmlElement
    private int additionalSharesSubscribed;
    @XmlElement
    private double amountPaid;
    @XmlElement
    private String issuingHouse;
    @XmlElement
    private double sharesSubscribedValue;
    @XmlElement
    private double additionalSharesSubValue;
    @XmlElement
    private double additionalSharesGivenValue;
    @XmlElement
    private double totalValue;
    @XmlElement
    private int totalSharesRenounced;
    @XmlElement
    private double returnMoney;
    @XmlElement
    private boolean processingPayment;
    @XmlElement
    private boolean approved;
    @XmlElement
    private boolean cancelled;
    @XmlElement
    private String dateApplied;
    @XmlElement
    //for report
    private int clientCompanyId;
    @XmlElement
    private long additionalSharesAwaitingSub;
    @XmlElement
    private double valueOfAdditionalShares;
    @XmlElement
    private String clearingHouseName;
    @XmlElement
    private double clearingHouseBrokerage;
    @XmlElement
    private int rate;
    @XmlElement
    private int percentageValueForDistri;
    @XmlElement
    private int taxRate;
    @XmlElement
    private String applicationType;
    @XmlElement
    private long totalRightsAvailable;
     @XmlElement
    private int totalSharesSubscribed;
    @XmlElement
    private int HolderAPRAccountNo; 
    public RightsIssueApplication() {
    }

    public RightsIssueApplication(int id, int clearingHouseId, Holder holder, int rightsIssueId, String issuer, int totalHoldings, int allottedRights, int sharesSubscribed, int additionalSharesSubscribed, double amountPaid, String issuingHouse, double sharesSubscribedValue, double additionalSharesSubValue, double additionalSharesGivenValue, double totalValue, int totalSharesRenounced, double returnMoney, boolean processingPayment, boolean approved, boolean cancelled, String dateApplied) {
        this.id = id;
        this.clearingHouseId = clearingHouseId;
        this.holder = holder;
        this.rightsIssueId = rightsIssueId;
        this.issuer = issuer;
        this.totalHoldings = totalHoldings;
        this.allottedRights = allottedRights;
        this.sharesSubscribed = sharesSubscribed;
        this.additionalSharesSubscribed = additionalSharesSubscribed;
        this.amountPaid = amountPaid;
        this.issuingHouse = issuingHouse;
        this.sharesSubscribedValue = sharesSubscribedValue;
        this.additionalSharesSubValue = additionalSharesSubValue;
        this.additionalSharesGivenValue = additionalSharesGivenValue;
        this.totalValue = totalValue;
        this.totalSharesRenounced = totalSharesRenounced;
        this.returnMoney = returnMoney;
        this.processingPayment = processingPayment;
        this.approved = approved;
        this.cancelled = cancelled;
        this.dateApplied = dateApplied;
    }

    public RightsIssueApplication(int clientCompanyId, long additionalSharesAwaitingSub, double valueOfAdditionalShares, String clearingHouseName, double clearingHouseBrokerage, int rate, int percentageValueForDistri, int taxRate, String applicationType, int totalRightsAvailable, int totalSharesSubscribed, int HolderAPRAccountNo) {
        this.clientCompanyId = clientCompanyId;
        this.additionalSharesAwaitingSub = additionalSharesAwaitingSub;
        this.valueOfAdditionalShares = valueOfAdditionalShares;
        this.clearingHouseName = clearingHouseName;
        this.clearingHouseBrokerage = clearingHouseBrokerage;
        this.rate = rate;
        this.percentageValueForDistri = percentageValueForDistri;
        this.taxRate = taxRate;
        this.applicationType = applicationType;
        this.totalRightsAvailable = totalRightsAvailable;
        this.totalSharesSubscribed = totalSharesSubscribed;
        this.HolderAPRAccountNo = HolderAPRAccountNo;
    }

    public RightsIssueApplication(int id, int clearingHouseId, Holder holder, int rightsIssueId, String issuer, int totalHoldings, int allottedRights, int sharesSubscribed, int additionalSharesSubscribed, double amountPaid, String issuingHouse, double sharesSubscribedValue, double additionalSharesSubValue, double additionalSharesGivenValue, double totalValue, int totalSharesRenounced, double returnMoney, boolean processingPayment, boolean approved, boolean cancelled, String dateApplied, int clientCompanyId, long additionalSharesAwaitingSub, double valueOfAdditionalShares, String clearingHouseName, double clearingHouseBrokerage, int rate, int percentageValueForDistri, int taxRate, String applicationType, int totalRightsAvailable, int totalSharesSubscribed, int HolderAPRAccountNo) {
        this.id = id;
        this.clearingHouseId = clearingHouseId;
        this.holder = holder;
        this.rightsIssueId = rightsIssueId;
        this.issuer = issuer;
        this.totalHoldings = totalHoldings;
        this.allottedRights = allottedRights;
        this.sharesSubscribed = sharesSubscribed;
        this.additionalSharesSubscribed = additionalSharesSubscribed;
        this.amountPaid = amountPaid;
        this.issuingHouse = issuingHouse;
        this.sharesSubscribedValue = sharesSubscribedValue;
        this.additionalSharesSubValue = additionalSharesSubValue;
        this.additionalSharesGivenValue = additionalSharesGivenValue;
        this.totalValue = totalValue;
        this.totalSharesRenounced = totalSharesRenounced;
        this.returnMoney = returnMoney;
        this.processingPayment = processingPayment;
        this.approved = approved;
        this.cancelled = cancelled;
        this.dateApplied = dateApplied;
        this.clientCompanyId = clientCompanyId;
        this.additionalSharesAwaitingSub = additionalSharesAwaitingSub;
        this.valueOfAdditionalShares = valueOfAdditionalShares;
        this.clearingHouseName = clearingHouseName;
        this.clearingHouseBrokerage = clearingHouseBrokerage;
        this.rate = rate;
        this.percentageValueForDistri = percentageValueForDistri;
        this.taxRate = taxRate;
        this.applicationType = applicationType;
        this.totalRightsAvailable = totalRightsAvailable;
        this.totalSharesSubscribed = totalSharesSubscribed;
        this.HolderAPRAccountNo = HolderAPRAccountNo;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the clearingHouseId
     */
    public int getClearingHouseId() {
        return clearingHouseId;
    }

    /**
     * @param clearingHouseId the clearingHouseId to set
     */
    public void setClearingHouseId(int clearingHouseId) {
        this.clearingHouseId = clearingHouseId;
    }

    /**
     * @return the holder
     */
    public Holder getHolder() {
        return holder;
    }

    /**
     * @param holder the holder to set
     */
    public void setHolder(Holder holder) {
        this.holder = holder;
    }

    /**
     * @return the rightsIssueId
     */
    public int getRightsIssueId() {
        return rightsIssueId;
    }

    /**
     * @param rightsIssueId the rightsIssueId to set
     */
    public void setRightsIssueId(int rightsIssueId) {
        this.rightsIssueId = rightsIssueId;
    }

    /**
     * @return the issuer
     */
    public String getIssuer() {
        return issuer;
    }

    /**
     * @param issuer the issuer to set
     */
    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    /**
     * @return the totalHoldings
     */
    public int getTotalHoldings() {
        return totalHoldings;
    }

    /**
     * @param totalHoldings the totalHoldings to set
     */
    public void setTotalHoldings(int totalHoldings) {
        this.totalHoldings = totalHoldings;
    }

    /**
     * @return the allottedRights
     */
    public int getAllottedRights() {
        return allottedRights;
    }

    /**
     * @param allottedRights the allottedRights to set
     */
    public void setAllottedRights(int allottedRights) {
        this.allottedRights = allottedRights;
    }

    /**
     * @return the sharesSubscribed
     */
    public int getSharesSubscribed() {
        return sharesSubscribed;
    }

    /**
     * @param sharesSubscribed the sharesSubscribed to set
     */
    public void setSharesSubscribed(int sharesSubscribed) {
        this.sharesSubscribed = sharesSubscribed;
    }

    /**
     * @return the additionalSharesSubscribed
     */
    public int getAdditionalSharesSubscribed() {
        return additionalSharesSubscribed;
    }

    /**
     * @param additionalSharesSubscribed the additionalSharesSubscribed to set
     */
    public void setAdditionalSharesSubscribed(int additionalSharesSubscribed) {
        this.additionalSharesSubscribed = additionalSharesSubscribed;
    }

    /**
     * @return the amountPaid
     */
    public double getAmountPaid() {
        return amountPaid;
    }

    /**
     * @param amountPaid the amountPaid to set
     */
    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    /**
     * @return the issuingHouse
     */
    public String getIssuingHouse() {
        return issuingHouse;
    }

    /**
     * @param issuingHouse the issuingHouse to set
     */
    public void setIssuingHouse(String issuingHouse) {
        this.issuingHouse = issuingHouse;
    }

    /**
     * @return the sharesSubscribedValue
     */
    public double getSharesSubscribedValue() {
        return sharesSubscribedValue;
    }

    /**
     * @param sharesSubscribedValue the sharesSubscribedValue to set
     */
    public void setSharesSubscribedValue(double sharesSubscribedValue) {
        this.sharesSubscribedValue = sharesSubscribedValue;
    }

    /**
     * @return the additionalSharesSubValue
     */
    public double getAdditionalSharesSubValue() {
        return additionalSharesSubValue;
    }

    /**
     * @param additionalSharesSubValue the additionalSharesSubValue to set
     */
    public void setAdditionalSharesSubValue(double additionalSharesSubValue) {
        this.additionalSharesSubValue = additionalSharesSubValue;
    }

    /**
     * @return the additionalSharesGivenValue
     */
    public double getAdditionalSharesGivenValue() {
        return additionalSharesGivenValue;
    }

    /**
     * @param additionalSharesGivenValue the additionalSharesGivenValue to set
     */
    public void setAdditionalSharesGivenValue(double additionalSharesGivenValue) {
        this.additionalSharesGivenValue = additionalSharesGivenValue;
    }

    /**
     * @return the totalValue
     */
    public double getTotalValue() {
        return totalValue;
    }

    /**
     * @param totalValue the totalValue to set
     */
    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    /**
     * @return the totalSharesRenounced
     */
    public int getTotalSharesRenounced() {
        return totalSharesRenounced;
    }

    /**
     * @param totalSharesRenounced the totalSharesRenounced to set
     */
    public void setTotalSharesRenounced(int totalSharesRenounced) {
        this.totalSharesRenounced = totalSharesRenounced;
    }

    /**
     * @return the returnMoney
     */
    public double getReturnMoney() {
        return returnMoney;
    }

    /**
     * @param returnMoney the returnMoney to set
     */
    public void setReturnMoney(double returnMoney) {
        this.returnMoney = returnMoney;
    }

    /**
     * @return the processingPayment
     */
    public boolean isProcessingPayment() {
        return processingPayment;
    }

    /**
     * @param processingPayment the processingPayment to set
     */
    public void setProcessingPayment(boolean processingPayment) {
        this.processingPayment = processingPayment;
    }

    /**
     * @return the approved
     */
    public boolean isApproved() {
        return approved;
    }

    /**
     * @param approved the approved to set
     */
    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    /**
     * @return the cancelled
     */
    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * @param cancelled the cancelled to set
     */
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    /**
     * @return the dateApplied
     */
    public String getDateApplied() {
        return dateApplied;
    }

    /**
     * @param dateApplied the dateApplied to set
     */
    public void setDateApplied(String dateApplied) {
        this.dateApplied = dateApplied;
    }

    /**
     * @return the clientCompanyId
     */
    public int getClientCompanyId() {
        return clientCompanyId;
    }

    /**
     * @param clientCompanyId the clientCompanyId to set
     */
    public void setClientCompanyId(int clientCompanyId) {
        this.clientCompanyId = clientCompanyId;
    }

    /**
     * @return the additionalSharesAwaitingSub
     */
    public long getAdditionalSharesAwaitingSub() {
        return additionalSharesAwaitingSub;
    }

    /**
     * @param additionalSharesAwaitingSub the additionalSharesAwaitingSub to set
     */
    public void setAdditionalSharesAwaitingSub(long additionalSharesAwaitingSub) {
        this.additionalSharesAwaitingSub = additionalSharesAwaitingSub;
    }

    /**
     * @return the valueOfAdditionalShares
     */
    public double getValueOfAdditionalShares() {
        return valueOfAdditionalShares;
    }

    /**
     * @param valueOfAdditionalShares the valueOfAdditionalShares to set
     */
    public void setValueOfAdditionalShares(double valueOfAdditionalShares) {
        this.valueOfAdditionalShares = valueOfAdditionalShares;
    }

    /**
     * @return the clearingHouseName
     */
    public String getClearingHouseName() {
        return clearingHouseName;
    }

    /**
     * @param clearingHouseName the clearingHouseName to set
     */
    public void setClearingHouseName(String clearingHouseName) {
        this.clearingHouseName = clearingHouseName;
    }

    /**
     * @return the clearingHouseBrokerage
     */
    public double getClearingHouseBrokerage() {
        return clearingHouseBrokerage;
    }

    /**
     * @param clearingHouseBrokerage the clearingHouseBrokerage to set
     */
    public void setClearingHouseBrokerage(double clearingHouseBrokerage) {
        this.clearingHouseBrokerage = clearingHouseBrokerage;
    }

    /**
     * @return the rate
     */
    public int getRate() {
        return rate;
    }

    /**
     * @param rate the rate to set
     */
    public void setRate(int rate) {
        this.rate = rate;
    }

    /**
     * @return the percentageValueForDistri
     */
    public int getPercentageValueForDistri() {
        return percentageValueForDistri;
    }

    /**
     * @param percentageValueForDistri the percentageValueForDistri to set
     */
    public void setPercentageValueForDistri(int percentageValueForDistri) {
        this.percentageValueForDistri = percentageValueForDistri;
    }

    /**
     * @return the taxRate
     */
    public int getTaxRate() {
        return taxRate;
    }

    /**
     * @param taxRate the taxRate to set
     */
    public void setTaxRate(int taxRate) {
        this.taxRate = taxRate;
    }

    /**
     * @return the applicationType
     */
    public String getApplicationType() {
        return applicationType;
    }

    /**
     * @param applicationType the applicationType to set
     */
    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }

    /**
     * @return the totalRightsAvailable
     */
    public long getTotalRightsAvailable() {
        return totalRightsAvailable;
    }

    /**
     * @param totalRightsAvailable the totalRightsAvailable to set
     */
    public void setTotalRightsAvailable(long totalRightsAvailable) {
        this.totalRightsAvailable = totalRightsAvailable;
    }

    /**
     * @return the totalSharesSubscribed
     */
    public int getTotalSharesSubscribed() {
        return totalSharesSubscribed;
    }

    /**
     * @param totalSharesSubscribed the totalSharesSubscribed to set
     */
    public void setTotalSharesSubscribed(int totalSharesSubscribed) {
        this.totalSharesSubscribed = totalSharesSubscribed;
    }

    /**
     * @return the HolderAPRAccountNo
     */
    public int getHolderAPRAccountNo() {
        return HolderAPRAccountNo;
    }

    /**
     * @param HolderAPRAccountNo the HolderAPRAccountNo to set
     */
    public void setHolderAPRAccountNo(int HolderAPRAccountNo) {
        this.HolderAPRAccountNo = HolderAPRAccountNo;
    }
    
        }
