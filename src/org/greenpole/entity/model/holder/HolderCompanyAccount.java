/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model.holder;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.greenpole.entity.model.clientcompany.Bank;

/**
 *
 * @author Jephthah Sadare
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"holderId", "clientCompanyId", "clientCompanyName", "shareUnits", "esop",
    "nubanAccount", "bank", "holderCompAccPrimary", "merged","pryHolderId",
    "pryClientCompanyId"})
public class HolderCompanyAccount implements Serializable {
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
    private boolean holderCompAccPrimary;
    @XmlElement
    private boolean merged;
    
    @XmlElement
    private int pryHolderId;
    @XmlElement
    private int pryClientCompanyId;

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

    public HolderCompanyAccount(int holderId, int clientCompanyId, boolean merged, boolean holderCompAccPrimary, int pryHolderId, int pryClientCompanyId) {
        this.holderId = holderId;
        this.clientCompanyId = clientCompanyId;
        this.merged = merged;
        this.holderCompAccPrimary = holderCompAccPrimary;
        this.pryHolderId = pryHolderId;
        this.pryClientCompanyId = pryClientCompanyId;
    }

    public int getClientCompanyId() {
        return clientCompanyId;
    }

    public void setClientCompanyId(int clientCompanyId) {
        this.clientCompanyId = clientCompanyId;
    }

    public String getClientCompanyName() {
        return clientCompanyName;
    }

    public void setClientCompanyName(String clientCompanyName) {
        this.clientCompanyName = clientCompanyName;
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

    public int getPryHolderId() {
        return pryHolderId;
    }

    public void setPryHolderId(int pryHolderId) {
        this.pryHolderId = pryHolderId;
    }

    public int getPryClientCompanyId() {
        return pryClientCompanyId;
    }

    public void setPryClientCompanyId(int pryClientCompanyId) {
        this.pryClientCompanyId = pryClientCompanyId;
    }
}
