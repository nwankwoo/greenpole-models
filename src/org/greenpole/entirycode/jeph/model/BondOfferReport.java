/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entirycode.jeph.model;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.greenpole.entity.model.holder.Holder;
import org.greenpole.entity.model.holder.HolderBondAccount;

/**
 *
 * @author Jephthah Sadare
 */
@XmlRootElement
@XmlSeeAlso({HolderBondAccount.class, Holder.class})
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"id", "clientCompanyId", "title",
    "bondUnitPrice", "bondMaturity", "bondTypeId", "interestRate",
    "valid", "bondOfferPaymentPlanId", "holderBondAccounts", "holder"})

public class BondOfferReport implements Serializable {

    @XmlElement
    private int id;
    @XmlElement
    private int clientCompanyId;
    @XmlElement
    private String title;
    @XmlElement
    private double bondUnitPrice;
    @XmlElement
    private String bondMaturity;
    @XmlElement
    private int bondTypeId;
    @XmlElement
    private double interestRate;
    @XmlElement
    private boolean valid;
    @XmlElement
    private int bondOfferPaymentPlanId;
    @XmlElementWrapper(name = "holderBondAccounts")
    private List<HolderBondAccount> holderBondAccounts;
    @XmlElementWrapper(name = "holder")
    private List<Holder> holder;

    public BondOfferReport() {
    }

    /**
     *
     * @param id
     * @param clientCompanyId
     * @param title
     * @param bondUnitPrice
     * @param bondMaturity
     * @param bondTypeId
     * @param interestRate
     * @param valid
     * @param bondOfferPaymentPlanId
     * @param holderBondAccounts
     * @param holder
     */
    public BondOfferReport(int id, int clientCompanyId, String title, double bondUnitPrice, String bondMaturity, int bondTypeId, double interestRate, boolean valid, int bondOfferPaymentPlanId, List<HolderBondAccount> holderBondAccounts, List<Holder> holder) {
        this.id = id;
        this.clientCompanyId = clientCompanyId;
        this.title = title;
        this.bondUnitPrice = bondUnitPrice;
        this.bondMaturity = bondMaturity;
        this.bondTypeId = bondTypeId;
        this.interestRate = interestRate;
        this.valid = valid;
        this.bondOfferPaymentPlanId = bondOfferPaymentPlanId;
        this.holderBondAccounts = holderBondAccounts;
        this.holder = holder;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClientCompanyId() {
        return clientCompanyId;
    }

    public void setClientCompanyId(int clientCompanyId) {
        this.clientCompanyId = clientCompanyId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getBondUnitPrice() {
        return bondUnitPrice;
    }

    public void setBondUnitPrice(double bondUnitPrice) {
        this.bondUnitPrice = bondUnitPrice;
    }

    public String getBondMaturity() {
        return bondMaturity;
    }

    public void setBondMaturity(String bondMaturity) {
        this.bondMaturity = bondMaturity;
    }

    public int getBondTypeId() {
        return bondTypeId;
    }

    public void setBondTypeId(int bondTypeId) {
        this.bondTypeId = bondTypeId;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public int getBondOfferPaymentPlanId() {
        return bondOfferPaymentPlanId;
    }

    public void setBondOfferPaymentPlanId(int bondOfferPaymentPlanId) {
        this.bondOfferPaymentPlanId = bondOfferPaymentPlanId;
    }

    public List<HolderBondAccount> getHolderBondAccounts() {
        return holderBondAccounts;
    }

    public void setHolderBondAccounts(List<HolderBondAccount> holderBondAccounts) {
        this.holderBondAccounts = holderBondAccounts;
    }

    public List<Holder> getHolder() {
        return holder;
    }

    public void setHolder(List<Holder> holder) {
        this.holder = holder;
    }

}
