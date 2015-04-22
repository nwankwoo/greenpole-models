/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model.holder;

import org.greenpole.entity.model.jeph.models.payment.Coupon;
import org.greenpole.entity.model.clientcompany.BondOffer;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.greenpole.entity.model.clientcompany.Bank;

/**
 *
 * @author Jephthah Sadare
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlSeeAlso({BondOffer.class, Coupon.class, Bank.class})
@XmlType(propOrder = {"holderId", "bank", "bondOffer", "holderBondAccount", "chn", "bondUnits", "nubanAccount",
    "merged", "holderBondAccPrimary", "coupons"})

public class HolderBondAccount {

    @XmlElement
    private int id;
    @XmlElement
    private int holderId;
    @XmlElement
    private List<Bank> bank;
    @XmlElementWrapper(name = "bondOffer")
    private BondOffer bondOffer;
    @XmlElementWrapper(name = "holderBondAccount")
    @XmlElement
    private String chn;
    @XmlElement
    private double bondUnits;
    @XmlElement
    private double principalValue;
    @XmlElement
    private String nubanAccount;
    @XmlElement
    private boolean merged;
    @XmlElement
    private boolean holderBondAccPrimary;
    @XmlElementWrapper(name = "coupons")
    private List<Coupon> coupons;

    public HolderBondAccount() {
    }
    
    

    public HolderBondAccount(int id, int holderId, List<Bank> bank, BondOffer bondOffer, String chn, double bondUnits, String nubanAccount, boolean merged, boolean holderBondAccPrimary, List<Coupon> coupons) {
        this.id = id;
        this.holderId = holderId;
        this.bank = bank;
        this.bondOffer = bondOffer;
        this.chn = chn;
        this.bondUnits = bondUnits;
        this.nubanAccount = nubanAccount;
        this.merged = merged;
        this.holderBondAccPrimary = holderBondAccPrimary;
        this.coupons = coupons;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHolderId() {
        return holderId;
    }

    public void setHolderId(int holderId) {
        this.holderId = holderId;
    }

    public List<Bank> getBank() {
        return bank;
    }

    public void setBank(List<Bank> bank) {
        this.bank = bank;
    }

    public BondOffer getBondOffer() {
        return bondOffer;
    }

    public void setBondOffer(BondOffer bondOffer) {
        this.bondOffer = bondOffer;
    }


    public String getChn() {
        return chn;
    }

    public void setChn(String chn) {
        this.chn = chn;
    }

    public Double getBondUnits() {
        return bondUnits;
    }

    public void setBondUnits(Double bondUnits) {
        this.bondUnits = bondUnits;
    }

    public String getNubanAccount() {
        return nubanAccount;
    }

    public void setNubanAccount(String nubanAccount) {
        this.nubanAccount = nubanAccount;
    }

    public boolean isMerged() {
        return merged;
    }

    public void setMerged(boolean merged) {
        this.merged = merged;
    }

    public boolean isHolderBondAccPrimary() {
        return holderBondAccPrimary;
    }

    public void setHolderBondAccPrimary(boolean holderBondAccPrimary) {
        this.holderBondAccPrimary = holderBondAccPrimary;
    }

    public List<Coupon> getCoupons() {
        return coupons;
    }

    public void setCoupons(List<Coupon> coupons) {
        this.coupons = coupons;
    }

    /**
     * @return the principalValue
     */
    public double getPrincipalValue() {
        return principalValue;
    }

    /**
     * @param principalValue the principalValue to set
     */
    public void setPrincipalValue(double principalValue) {
        this.principalValue = principalValue;
    }
    
    
}
