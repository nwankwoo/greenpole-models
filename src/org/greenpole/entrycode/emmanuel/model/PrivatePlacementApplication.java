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
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import org.greenpole.entity.model.clientcompany.PrivatePlacement;

/**
 *
 * @author user
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"holderId","clearingHouseId","clearingHouseName",
    "clearingHouseBrokerage","privatePlacement","issuer",
    "sharesSubscribed","amountPaid","issuingHouse","sharesSubscribedValue","sharesAdjusted",
    "returnMoney","processingPayment","approved","canceled","dateApplied"})
public class PrivatePlacementApplication {
  @XmlElement
 private int id;
 @XmlElement
     private int holderId;
 @XmlElement
 private int clearingHouseId;
   @XmlElement
   private String clearingHouseName;
   @XmlElement
   private double clearingHouseBrokerage;
   @XmlElement
   private PrivatePlacement privatePlacement;
   @XmlElement
   private String issuer;
   @XmlElement
     private int sharesSubscribed;
   @XmlElement
     private double amountPaid;
   @XmlElement
     private String issuingHouse;
   @XmlElement
     private double sharesSubscribedValue;
   @XmlElement
     private int sharesAdjusted;
   @XmlElement
     private double returnMoney;
   @XmlElement
     private boolean processingPayment;
   @XmlElement
     private boolean approved;
   @XmlElement
     private boolean canceled;
   @XmlElement
     private String dateApplied;

    public PrivatePlacementApplication() {
    }

    public PrivatePlacementApplication(int id, int holderId, int clearingHouseId, String clearingHouseName, double clearingHouseBrokerage, PrivatePlacement privatePlacement, String issuer, int sharesSubscribed, double amountPaid, String issuingHouse, double sharesSubscribedValue, int sharesAdjusted, double returnMoney, boolean processingPayment, boolean approved, boolean canceled, String dateApplied) {
        this.id = id;
        this.holderId = holderId;
        this.clearingHouseId = clearingHouseId;
        this.clearingHouseName = clearingHouseName;
        this.clearingHouseBrokerage = clearingHouseBrokerage;
        this.privatePlacement = privatePlacement;
        this.issuer = issuer;
        this.sharesSubscribed = sharesSubscribed;
        this.amountPaid = amountPaid;
        this.issuingHouse = issuingHouse;
        this.sharesSubscribedValue = sharesSubscribedValue;
        this.sharesAdjusted = sharesAdjusted;
        this.returnMoney = returnMoney;
        this.processingPayment = processingPayment;
        this.approved = approved;
        this.canceled = canceled;
        this.dateApplied = dateApplied;
    }

    public PrivatePlacementApplication(int holderId, int clearingHouseId, String clearingHouseName, double clearingHouseBrokerage, PrivatePlacement privatePlacement, String issuer, int sharesSubscribed, double amountPaid, String issuingHouse, double sharesSubscribedValue, int sharesAdjusted, double returnMoney, boolean processingPayment, boolean approved, boolean canceled, String dateApplied) {
        this.holderId = holderId;
        this.clearingHouseId = clearingHouseId;
        this.clearingHouseName = clearingHouseName;
        this.clearingHouseBrokerage = clearingHouseBrokerage;
        this.privatePlacement = privatePlacement;
        this.issuer = issuer;
        this.sharesSubscribed = sharesSubscribed;
        this.amountPaid = amountPaid;
        this.issuingHouse = issuingHouse;
        this.sharesSubscribedValue = sharesSubscribedValue;
        this.sharesAdjusted = sharesAdjusted;
        this.returnMoney = returnMoney;
        this.processingPayment = processingPayment;
        this.approved = approved;
        this.canceled = canceled;
        this.dateApplied = dateApplied;
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
     * @return the holderId
     */
    public int getHolderId() {
        return holderId;
    }

    /**
     * @param holderId the holderId to set
     */
    public void setHolderId(int holderId) {
        this.holderId = holderId;
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
     * @return the privatePlacement
     */
    public PrivatePlacement getPrivatePlacement() {
        return privatePlacement;
    }

    /**
     * @param privatePlacement the privatePlacement to set
     */
    public void setPrivatePlacement(PrivatePlacement privatePlacement) {
        this.privatePlacement = privatePlacement;
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
     * @return the sharesAdjusted
     */
    public int getSharesAdjusted() {
        return sharesAdjusted;
    }

    /**
     * @param sharesAdjusted the sharesAdjusted to set
     */
    public void setSharesAdjusted(int sharesAdjusted) {
        this.sharesAdjusted = sharesAdjusted;
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
     * @return the canceled
     */
    public boolean isCanceled() {
        return canceled;
    }

    /**
     * @param canceled the canceled to set
     */
    public void setCanceled(boolean canceled) {
        this.canceled = canceled;
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

}
