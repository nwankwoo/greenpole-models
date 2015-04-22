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
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Jephthah Sadare
 */
@XmlRootElement
@XmlSeeAlso({Coupon.class, Dividend.class})
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"bankId", "clientCompanyId", "holderId", "chn", "shareUnits", 
    "esop", "taxExempted", "nubanAccount", "merged", "holderCompAccPrimary"})

public class HolderCompanyAccount {
    
    @XmlElement
    private int id;
    @XmlElement
    private  int bankId;
    @XmlElement
    private int clientCompanyId;
    @XmlElement
    private int holderId;
    @XmlElement
    private String chn;
    @XmlElement
    private double shareUnits;
    @XmlElement
    private boolean esop;
    @XmlElement
    private boolean taxExempted;
    @XmlElement
    private String nubanAccount;
    @XmlElement
    private boolean merged;
    @XmlElement
    private boolean holderCompAccPrimary;

    public HolderCompanyAccount() {
    }

    
    public HolderCompanyAccount(int id, int bankId, int clientCompanyId, int holderId, String chn, double shareUnits, boolean esop, boolean taxExempted, String nubanAccount, boolean merged, boolean holderCompAccPrimary, List<HolderCompanyAccount> holderCompanyAccounts) {
        this.id = id;
        this.bankId = bankId;
        this.clientCompanyId = clientCompanyId;
        this.holderId = holderId;
        this.chn = chn;
        this.shareUnits = shareUnits;
        this.esop = esop;
        this.taxExempted = taxExempted;
        this.nubanAccount = nubanAccount;
        this.merged = merged;
        this.holderCompAccPrimary = holderCompAccPrimary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
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

    public String getChn() {
        return chn;
    }

    public void setChn(String chn) {
        this.chn = chn;
    }

    public double getShareUnits() {
        return shareUnits;
    }

    public void setShareUnits(double shareUnits) {
        this.shareUnits = shareUnits;
    }

    public boolean isEsop() {
        return esop;
    }

    public void setEsop(boolean esop) {
        this.esop = esop;
    }

    public boolean isTaxExempted() {
        return taxExempted;
    }

    public void setTaxExempted(boolean taxExempted) {
        this.taxExempted = taxExempted;
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

    public boolean isHolderCompAccPrimary() {
        return holderCompAccPrimary;
    }

    public void setHolderCompAccPrimary(boolean holderCompAccPrimary) {
        this.holderCompAccPrimary = holderCompAccPrimary;
    }

  
    
}
