/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entirycode.jeph.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import org.greenpole.entity.model.clientcompany.Bank;
import org.greenpole.entity.model.holder.Holder;

/**
 *
 * @author Jephthah Sadare
 */
public class HolderBondAccount implements Serializable {

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
    private boolean holderBondAccPrimary;
    @XmlElement
    private boolean merged;
    @XmlElement
    private Holder holder;

    @XmlElement
    private int secHolderId;
    @XmlElement
    private int secBondOfferId;

    public HolderBondAccount() {
    }

    public HolderBondAccount(int holderId, int bondOfferId, int bondUnits, double startingPrincipalValue, double remainingPrincipalValue, String nubanAccount, Bank bank, boolean holderBondAccPrimary, boolean merged, Holder holder, int secHolderId, int secBondOfferId) {
        this.holderId = holderId;
        this.bondOfferId = bondOfferId;
        this.bondUnits = bondUnits;
        this.startingPrincipalValue = startingPrincipalValue;
        this.remainingPrincipalValue = remainingPrincipalValue;
        this.nubanAccount = nubanAccount;
        this.bank = bank;
        this.holderBondAccPrimary = holderBondAccPrimary;
        this.merged = merged;
        this.holder = holder;
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

    public void setBondOfferId(int bondOfferId) {
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

    public boolean isHolderBondAccPrimary() {
        return holderBondAccPrimary;
    }

    public void setHolderBondAccPrimary(boolean holderBondAccPrimary) {
        this.holderBondAccPrimary = holderBondAccPrimary;
    }

    public boolean isMerged() {
        return merged;
    }

    public void setMerged(boolean merged) {
        this.merged = merged;
    }

    public Holder getHolder() {
        return holder;
    }

    public void setHolder(Holder holder) {
        this.holder = holder;
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
