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
    private int chnFrom;
    @XmlElement
    private int chnTo;
    @XmlElement
    private int holderAcctIdFrom;
    @XmlElement
    private int holderAcctIdTo;
    @XmlElement
    private int clientCompanyIdFrom;
    @XmlElement
    private int clieintCompanyIdTo;
    @XmlElement
    private int units;
    @XmlElement
    private double startingPrincipalValue;
    @XmlElement
    private double remainingPrincipalValue;
    @XmlElement
    private double unitPrice;
    @XmlElement
    private String type;
    @XmlElement
    private int bondOfferId;

    public UnitTransfer(int id, int holderIdFrom, int holderIdTo, int chnFrom, int chnTo, int holderAcctIdFrom, int holderAcctIdTo, int clientCompanyIdFrom, int clieintCompanyIdTo, int units, double startingPrincipalValue, double remainingPrincipalValue, double unitPrice, String type, int bondOfferId) {
        this.id = id;
        this.holderIdFrom = holderIdFrom;
        this.holderIdTo = holderIdTo;
        this.chnFrom = chnFrom;
        this.chnTo = chnTo;
        this.holderAcctIdFrom = holderAcctIdFrom;
        this.holderAcctIdTo = holderAcctIdTo;
        this.clientCompanyIdFrom = clientCompanyIdFrom;
        this.clieintCompanyIdTo = clieintCompanyIdTo;
        this.units = units;
        this.startingPrincipalValue = startingPrincipalValue;
        this.remainingPrincipalValue = remainingPrincipalValue;
        this.unitPrice = unitPrice;
        this.type = type;
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

    public int getChnFrom() {
        return chnFrom;
    }

    public void setChnFrom(int chnFrom) {
        this.chnFrom = chnFrom;
    }

    public int getChnTo() {
        return chnTo;
    }

    public void setChnTo(int chnTo) {
        this.chnTo = chnTo;
    }

    public int getHolderAcctIdFrom() {
        return holderAcctIdFrom;
    }

    public void setHolderAcctIdFrom(int holderAcctIdFrom) {
        this.holderAcctIdFrom = holderAcctIdFrom;
    }

    public int getHolderAcctIdTo() {
        return holderAcctIdTo;
    }

    public void setHolderAcctIdTo(int holderAcctIdTo) {
        this.holderAcctIdTo = holderAcctIdTo;
    }

    public int getClientCompanyIdFrom() {
        return clientCompanyIdFrom;
    }

    public void setClientCompanyIdFrom(int clientCompanyIdFrom) {
        this.clientCompanyIdFrom = clientCompanyIdFrom;
    }

    public int getClieintCompanyIdTo() {
        return clieintCompanyIdTo;
    }

    public void setClieintCompanyIdTo(int clieintCompanyIdTo) {
        this.clieintCompanyIdTo = clieintCompanyIdTo;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBondOfferId() {
        return bondOfferId;
    }

    public void setBondOfferId(int bondOfferId) {
        this.bondOfferId = bondOfferId;
    }
    
    
}
