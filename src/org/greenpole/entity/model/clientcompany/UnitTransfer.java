/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model.clientcompany;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Jephthah Sadare
 * Used to send share / bond unit transfer information to the middle tier.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"cscsTransactionId","holderIdFrom","chnFrom","holderIdTo",
    "chnTo","clientCompanyId","clientCompanyName","bondOfferId","units","unitPrice",
    "unitType","transferTypeId","transactionDate","startingPrincipalValue",
    "remainingPrincipalValue"})
public class UnitTransfer implements Serializable {
    @XmlElement
    private int cscsTransactionId;
    @XmlElement
    private int holderIdFrom;
    @XmlElement
    private String chnFrom;
    @XmlElement
    private int holderIdTo;
    @XmlElement
    private String chnTo;
    @XmlElement
    private int clientCompanyId;
    @XmlElement
    private String clientCompanyName;
    @XmlElement
    private int bondOfferId;
    @XmlElement
    private int units;
    @XmlElement
    private double unitPrice;
    @XmlElement
    private String unitType;
    @XmlElement
    private int transferTypeId;
    @XmlElement
    private String transactionDate;
    @XmlElement
    private double startingPrincipalValue;
    @XmlElement
    private double remainingPrincipalValue;

    public UnitTransfer() {
    }

    /**
     * Collects share transfer details.
     * @param holderIdFrom the sending holder's id
     * @param chnFrom the sender's chn
     * @param holderIdTo the receiving holding's id
     * @param chnTo the receiver's chn
     * @param clientCompanyId the client company, for which the transaction concerns
     * @param units the share units
     * @param unitPrice the price per share unit
     * @param transferTypeId the type of transfer
     */
    public UnitTransfer(int holderIdFrom, String chnFrom, int holderIdTo, String chnTo, int clientCompanyId, int units, double unitPrice, int transferTypeId) {
        this.holderIdFrom = holderIdFrom;
        this.chnFrom = chnFrom;
        this.holderIdTo = holderIdTo;
        this.chnTo = chnTo;
        this.clientCompanyId = clientCompanyId;
        this.units = units;
        this.unitPrice = unitPrice;
        this.transferTypeId = transferTypeId;
    }

    /**
     * Collects bond transfer details.
     * @param holderIdFrom the sending holder's id
     * @param chnFrom the sender's chn
     * @param holderIdTo the receiving holding's id
     * @param chnTo the receiver's chn
     * @param bondOfferId the bond offer's id, for which the transaction concerns
     * @param units the bond units
     * @param unitPrice the price per bond unit
     * @param transferTypeId the type of transfer
     * @param startingPrincipalValue the starting principal value (value of the bond units)
     * @param remainingPrincipalValue the remaining principal value (value of the bond units left to be redeemed)
     */
    public UnitTransfer(int holderIdFrom, String chnFrom, int holderIdTo, String chnTo, int bondOfferId, int units, double unitPrice, int transferTypeId, double startingPrincipalValue, double remainingPrincipalValue) {
        this.holderIdFrom = holderIdFrom;
        this.chnFrom = chnFrom;
        this.holderIdTo = holderIdTo;
        this.chnTo = chnTo;
        this.bondOfferId = bondOfferId;
        this.units = units;
        this.unitPrice = unitPrice;
        this.transferTypeId = transferTypeId;
        this.startingPrincipalValue = startingPrincipalValue;
        this.remainingPrincipalValue = remainingPrincipalValue;
    }

    public UnitTransfer(int cscsTransactionId, int holderIdFrom, String chnFrom, int holderIdTo, String chnTo, int clientCompanyId, String clientCompanyName, int bondOfferId, int units, double unitPrice, String unitType, int transferTypeId, String transactionDate, double startingPrincipalValue, double remainingPrincipalValue) {
        this.cscsTransactionId = cscsTransactionId;
        this.holderIdFrom = holderIdFrom;
        this.chnFrom = chnFrom;
        this.holderIdTo = holderIdTo;
        this.chnTo = chnTo;
        this.clientCompanyId = clientCompanyId;
        this.clientCompanyName = clientCompanyName;
        this.bondOfferId = bondOfferId;
        this.units = units;
        this.unitPrice = unitPrice;
        this.unitType = unitType;
        this.transferTypeId = transferTypeId;
        this.transactionDate = transactionDate;
        this.startingPrincipalValue = startingPrincipalValue;
        this.remainingPrincipalValue = remainingPrincipalValue;
    }

    public int getHolderIdFrom() {
        return holderIdFrom;
    }

    public void setHolderIdFrom(int holderIdFrom) {
        this.holderIdFrom = holderIdFrom;
    }

    public int getHolderIdTo() {
        return holderIdTo;
    }

    public void setHolderIdTo(int holderIdTo) {
        this.holderIdTo = holderIdTo;
    }

    public String getChnFrom() {
        return chnFrom;
    }

    public void setChnFrom(String chnFrom) {
        this.chnFrom = chnFrom;
    }

    public String getChnTo() {
        return chnTo;
    }

    public void setChnTo(String chnTo) {
        this.chnTo = chnTo;
    }

    public int getClientCompanyId() {
        return clientCompanyId;
    }

    public void setClientCompanyId(int clientCompanyId) {
        this.clientCompanyId = clientCompanyId;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public double getStartingPrincipalValue() {
        return startingPrincipalValue;
    }

    public void setStartingPrincipalValue(double startingPrincipalValue) {
        this.startingPrincipalValue = startingPrincipalValue;
    }

    public double getRemainingPrincipalValue() {
        return remainingPrincipalValue;
    }

    public void setRemainingPrincipalValue(double remainingPrincipalValue) {
        this.remainingPrincipalValue = remainingPrincipalValue;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getTransferTypeId() {
        return transferTypeId;
    }

    public void setTransferTypeId(int transferTypeId) {
        this.transferTypeId = transferTypeId;
    }

    public int getBondOfferId() {
        return bondOfferId;
    }

    public void setBondOfferId(int bondOfferId) {
        this.bondOfferId = bondOfferId;
    }

    public int getCscsTransactionId() {
        return cscsTransactionId;
    }

    public void setCscsTransactionId(int cscsTransactionId) {
        this.cscsTransactionId = cscsTransactionId;
    }

    public String getClientCompanyName() {
        return clientCompanyName;
    }

    public void setClientCompanyName(String clientCompanyName) {
        this.clientCompanyName = clientCompanyName;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }
}
