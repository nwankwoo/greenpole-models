/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model.holder;

import org.greenpole.entity.model.jeph.models.payment.Dividend;
import org.greenpole.entity.model.jeph.models.payment.Coupon;
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
@XmlType(propOrder = {"holderId", "clientCompanyId", "shareUnits", "esop",
    "nubanAccount", "bank", "merged", "holderCompAccPrimary"})
public class HolderCompanyAccount {
    @XmlElement
    private int holderId;
    @XmlElement
    private int clientCompanyId;
    @XmlElement
    private String clientCompanyName;
    @XmlElement
    private int shareUnits;
    @XmlElement
    private boolean esop;
    @XmlElement
    private String nubanAccount;
    @XmlElement
    private Bank bank;
    @XmlElement
    private boolean merged;
    @XmlElement
    private boolean holderCompAccPrimary;
    
    @XmlTransient
    private List<Dividend> dividends;
    
    @XmlTransient
    private int secHolderId;
    @XmlTransient
    private int secClientCompanyId;

    public HolderCompanyAccount() {
    }

    public HolderCompanyAccount(int holderId, int clientCompanyId, int shareUnits, boolean esop, String nubanAccount, Bank bank, boolean merged, boolean holderCompAccPrimary) {
        this.holderId = holderId;
        this.clientCompanyId = clientCompanyId;
        this.shareUnits = shareUnits;
        this.esop = esop;
        this.nubanAccount = nubanAccount;
        this.bank = bank;
        this.merged = merged;
        this.holderCompAccPrimary = holderCompAccPrimary;
    }

    public HolderCompanyAccount(int holderId, int clientCompanyId, boolean merged, boolean holderCompAccPrimary, int secHolderId, int secClientCompanyId) {
        this.holderId = holderId;
        this.clientCompanyId = clientCompanyId;
        this.merged = merged;
        this.holderCompAccPrimary = holderCompAccPrimary;
        this.secHolderId = secHolderId;
        this.secClientCompanyId = secClientCompanyId;
    }

    public int getClientCompanyId() {
        return clientCompanyId;
    }

    public void setClientCompanyId(int clientCompanyId) {
        this.clientCompanyId = clientCompanyId;
    }

    public int getHolderId() {
        return holderId;
    }

    public void setHolderId(int holderId) {
        this.holderId = holderId;
    }

    public int getShareUnits() {
        return shareUnits;
    }

    public void setShareUnits(int shareUnits) {
        this.shareUnits = shareUnits;
    }

    public boolean isEsop() {
        return esop;
    }

    public void setEsop(boolean esop) {
        this.esop = esop;
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

    public boolean isHolderCompAccPrimary() {
        return holderCompAccPrimary;
    }

    public void setHolderCompAccPrimary(boolean holderCompAccPrimary) {
        this.holderCompAccPrimary = holderCompAccPrimary;
    }    

    public List<Dividend> getDividends() {
        return dividends;
    }

    public void setDividends(List<Dividend> dividends) {
        this.dividends = dividends;
    }

    public int getSecHolderId() {
        return secHolderId;
    }

    public void setSecHolderId(int secHolderId) {
        this.secHolderId = secHolderId;
    }

    public int getSecClientCompanyId() {
        return secClientCompanyId;
    }

    public void setSecClientCompanyId(int secClientCompanyId) {
        this.secClientCompanyId = secClientCompanyId;
    }

    /**
     * @return the clientCompanyName
     */
    public String getClientCompanyName() {
        return clientCompanyName;
    }

    /**
     * @param clientCompanyName the clientCompanyName to set
     */
    public void setClientCompanyName(String clientCompanyName) {
        this.clientCompanyName = clientCompanyName;
    }
}
