/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model.jeph.models.payment;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author Jephthah Sadare
 */
public class UnitTransfer {

    @XmlElement
    private int id;
    @XmlElement
    private int holderIdFrom;
    @XmlElement
    private int holderIdTo;
    @XmlElement
    private int chn;
    @XmlElement
    private int clientCompanyId;
    @XmlElement
    private int units;
    @XmlElement
    private double startingPrincipalValue;
    @XmlElement
    private double remainingPrincipalValue;
    @XmlElement
    private double unitPrice;
    @XmlElement
    private String transferType;
    @XmlElement
    private int bondOfferId;

    public UnitTransfer(int id, int holderIdFrom, int holderIdTo, int chn, int clientCompanyId, int units, double startingPrincipalValue, double remainingPrincipalValue, double unitPrice, String transferType, int bondOfferId) {
        this.id = id;
        this.holderIdFrom = holderIdFrom;
        this.holderIdTo = holderIdTo;
        this.chn = chn;
        this.clientCompanyId = clientCompanyId;
        this.units = units;
        this.startingPrincipalValue = startingPrincipalValue;
        this.remainingPrincipalValue = remainingPrincipalValue;
        this.unitPrice = unitPrice;
        this.transferType = transferType;
        this.bondOfferId = bondOfferId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getChn() {
        return chn;
    }

    public void setChn(int chn) {
        this.chn = chn;
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

    public String getTransferType() {
        return transferType;
    }

    public void setTransferType(String transferType) {
        this.transferType = transferType;
    }

    public int getBondOfferId() {
        return bondOfferId;
    }

    public void setBondOfferId(int bondOfferId) {
        this.bondOfferId = bondOfferId;
    }

    
    
}
