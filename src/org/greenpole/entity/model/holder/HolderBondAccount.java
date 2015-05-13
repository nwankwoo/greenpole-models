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
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import org.greenpole.entity.model.clientcompany.Bank;

/**
 *
 * @author Jephthah Sadare
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"holderId", "bondOffer", "bondUnits", "startingPrincipalValue", "remainingPrincipalValue",
    "nubanAccount", "bank", "merged", "holderBondAccPrimary"})
public class HolderBondAccount {

    @XmlElement
    private int holderId;
    @XmlElement
    private int bondOfferId;
    @XmlElement
    private int bondUnits;
    @XmlElement
    private double startingPrincipalValue;
    @XmlElement
    private double remainingPrincipalValue;
    @XmlElement
    private String nubanAccount;
    @XmlElement
    private Bank bank;
    @XmlElement
    private boolean merged;
    @XmlElement
    private boolean holderBondAccPrimary;
    
    @XmlTransient
    private List<Coupon> coupons;
    
    @XmlTransient
    private int secHolderId;
    @XmlTransient
    private int secBondOfferId;

    public HolderBondAccount() {
    }

    public HolderBondAccount(int holderId, int bondOfferId, int bondUnits, double startingPrincipalValue, double remainingPrincipalValue, String nubanAccount, Bank bank, boolean merged, boolean holderBondAccPrimary) {
        this.holderId = holderId;
        this.bondOfferId = bondOfferId;
        this.bondUnits = bondUnits;
        this.startingPrincipalValue = startingPrincipalValue;
        this.remainingPrincipalValue = remainingPrincipalValue;
        this.nubanAccount = nubanAccount;
        this.bank = bank;
        this.merged = merged;
        this.holderBondAccPrimary = holderBondAccPrimary;
    }

    public HolderBondAccount(int holderId, int bondOfferId, boolean merged, boolean holderBondAccPrimary, int secHolderId, int secBondOfferId) {
        this.holderId = holderId;
        this.bondOfferId = bondOfferId;
        this.merged = merged;
        this.holderBondAccPrimary = holderBondAccPrimary;
        this.secHolderId = secHolderId;
        this.secBondOfferId = secBondOfferId;
    }

    public int getHolderId() {
        return holderId;
    }

    public void setHolderId(int holderId) {
        this.holderId = holderId;
    }

    public int getBondOfferId() {
        return bondOfferId;
    }

    public void setBondOffer(int bondOfferId) {
        this.bondOfferId = bondOfferId;
    }

    public int getBondUnits() {
        return bondUnits;
    }

    public void setBondUnits(int bondUnits) {
        this.bondUnits = bondUnits;
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

    public String getNubanAccount() {
        return nubanAccount;
    }

    public void setNubanAccount(String nubanAccount) {
        this.nubanAccount = nubanAccount;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
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

    public int getSecHolderId() {
        return secHolderId;
    }

    public void setSecHolderId(int secHolderId) {
        this.secHolderId = secHolderId;
    }

    public int getSecBondOfferId() {
        return secBondOfferId;
    }

    public void setSecBondOfferId(int secBondOfferId) {
        this.secBondOfferId = secBondOfferId;
    }
}
