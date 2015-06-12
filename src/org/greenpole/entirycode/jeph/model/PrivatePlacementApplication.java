/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entirycode.jeph.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.greenpole.entity.model.holder.Holder;

/**
 *
 * @author Jephthah Sadare
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"id", "clearingHouseId", "holderId", "privatePlacementId",
    "issuer", "sharesSubscribed", "amountPaid", "issuingHouse",
    "sharesSubscribedValue", "sharesAdjusted", "returnMoney", "processingPayment",
    "approved", "canceled", "dateApplied", "holder"})
public class PrivatePlacementApplication {

    @XmlElement
    private int id;
    @XmlElement
    private int clearingHouseId;
    @XmlElement
    private int holderId;
    @XmlElement
    private int privatePlacementId;
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
    @XmlElement
    private Holder holder;

    public PrivatePlacementApplication() {
    }

    public PrivatePlacementApplication(int id, int clearingHouseId, int holderId, int privatePlacementId, String issuer, int sharesSubscribed, double amountPaid, String issuingHouse, double sharesSubscribedValue, int sharesAdjusted, double returnMoney, boolean processingPayment, boolean approved, boolean canceled, String dateApplied, Holder holder) {
        this.id = id;
        this.clearingHouseId = clearingHouseId;
        this.holderId = holderId;
        this.privatePlacementId = privatePlacementId;
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
        this.holder = holder;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClearingHouseId() {
        return clearingHouseId;
    }

    public void setClearingHouseId(int clearingHouseId) {
        this.clearingHouseId = clearingHouseId;
    }

    public int getHolderId() {
        return holderId;
    }

    public void setHolderId(int holderId) {
        this.holderId = holderId;
    }

    public int getPrivatePlacementId() {
        return privatePlacementId;
    }

    public void setPrivatePlacementId(int privatePlacementId) {
        this.privatePlacementId = privatePlacementId;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public int getSharesSubscribed() {
        return sharesSubscribed;
    }

    public void setSharesSubscribed(int sharesSubscribed) {
        this.sharesSubscribed = sharesSubscribed;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getIssuingHouse() {
        return issuingHouse;
    }

    public void setIssuingHouse(String issuingHouse) {
        this.issuingHouse = issuingHouse;
    }

    public double getSharesSubscribedValue() {
        return sharesSubscribedValue;
    }

    public void setSharesSubscribedValue(double sharesSubscribedValue) {
        this.sharesSubscribedValue = sharesSubscribedValue;
    }

    public int getSharesAdjusted() {
        return sharesAdjusted;
    }

    public void setSharesAdjusted(int sharesAdjusted) {
        this.sharesAdjusted = sharesAdjusted;
    }

    public double getReturnMoney() {
        return returnMoney;
    }

    public void setReturnMoney(double returnMoney) {
        this.returnMoney = returnMoney;
    }

    public boolean isProcessingPayment() {
        return processingPayment;
    }

    public void setProcessingPayment(boolean processingPayment) {
        this.processingPayment = processingPayment;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public boolean isCanceled() {
        return canceled;
    }

    public void setCanceled(boolean canceled) {
        this.canceled = canceled;
    }

    public String getDateApplied() {
        return dateApplied;
    }

    public void setDateApplied(String dateApplied) {
        this.dateApplied = dateApplied;
    }

    public Holder getHolder() {
        return holder;
    }

    public void setHolder(Holder holder) {
        this.holder = holder;
    }

}
