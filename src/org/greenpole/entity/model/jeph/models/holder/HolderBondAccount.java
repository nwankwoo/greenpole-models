/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model.jeph.models.holder;

import org.greenpole.entity.model.jeph.models.payment.Coupon;
import org.greenpole.entity.model.jeph.models.payment.BondOffer;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Jephthah Sadare
 */

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlSeeAlso({BondOffer.class, Coupon.class})
@XmlType(propOrder = {"primaryAddress","addressLine","addressLine",
    "addressLine","addressLine","postCode","city","state","country"})


public class HolderBondAccount {
    
    @XmlElement
    private int id;
    @XmlElement
    private int bank;
    @XmlElementWrapper(name = "bondOffer")
    private List<BondOffer> bondOffer;
    @XmlElementWrapper(name = "holderBondAccount")
    private List<HolderBondAccount> holderBondAccount;
    @XmlElement
    private String chn;
    @XmlElement
    private Double bondUnits;
    @XmlElement
    private String nubanAccount;
    @XmlElement
    private boolean merged;
    @XmlElement
    private boolean holderBondAccPrimary;
    @XmlElementWrapper(name = "coupons")
    private List<Coupon> coupons;

    public HolderBondAccount(int id, int bank, List<BondOffer> bondOffer, List<HolderBondAccount> holderBondAccount, String chn, Double bondUnits, String nubanAccount, boolean merged, boolean holderBondAccPrimary, List<Coupon> coupons) {
        this.id = id;
        this.bank = bank;
        this.bondOffer = bondOffer;
        this.holderBondAccount = holderBondAccount;
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

    public int getBank() {
        return bank;
    }

    public void setBank(int bank) {
        this.bank = bank;
    }

    public List<BondOffer> getBondOffer() {
        return bondOffer;
    }

    public void setBondOffer(List<BondOffer> bondOffer) {
        this.bondOffer = bondOffer;
    }

    public List<HolderBondAccount> getHolderBondAccount() {
        return holderBondAccount;
    }

    public void setHolderBondAccount(List<HolderBondAccount> holderBondAccount) {
        this.holderBondAccount = holderBondAccount;
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

    
}
