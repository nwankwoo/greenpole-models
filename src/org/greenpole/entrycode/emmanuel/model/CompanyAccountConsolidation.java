/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entrycode.emmanuel.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author user
 */
@XmlRootElement
@XmlSeeAlso({AccountConsolidation.class})
@XmlAccessorType(XmlAccessType.NONE)
public class CompanyAccountConsolidation {

    @XmlElement
    private int id;
    @XmlElement
    private AccountConsolidation accountConsolidation;
    @XmlElement
    private int accountConsolidationId;
    @XmlElement
    private int forCompanyId;
    @XmlElement
    private int tiedToInitialHolderId;
    @XmlElement
    private int tiedToCurrentHolderId;
    @XmlElement
    private String initialChn;
    @XmlElement
    private String currentChn;
    @XmlElement
    private int bondShareUnit;
    @XmlElement
    private boolean transfer;
    @XmlElement
    private int receiverUnitState;
    @XmlElement
    private int receiverStartUnit;
    @XmlElement
    private int unitAfterTransfer;
    @XmlElement
    private String mergeDate;

    public CompanyAccountConsolidation() {
    }

    public CompanyAccountConsolidation(int id, AccountConsolidation accountConsolidation, int accountConsolidationId, int forCompanyId, int tiedToInitialHolderId, int tiedToCurrentHolderId, String initialChn, String currentChn, int bondShareUnit, boolean transfer, int receiverUnitState, int receiverStartUnit, int unitAfterTransfer, String mergeDate) {
        this.id = id;
        this.accountConsolidation = accountConsolidation;
        this.accountConsolidationId = accountConsolidationId;
        this.forCompanyId = forCompanyId;
        this.tiedToInitialHolderId = tiedToInitialHolderId;
        this.tiedToCurrentHolderId = tiedToCurrentHolderId;
        this.initialChn = initialChn;
        this.currentChn = currentChn;
        this.bondShareUnit = bondShareUnit;
        this.transfer = transfer;
        this.receiverUnitState = receiverUnitState;
        this.receiverStartUnit = receiverStartUnit;
        this.unitAfterTransfer = unitAfterTransfer;
        this.mergeDate = mergeDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AccountConsolidation getAccountConsolidation() {
        return accountConsolidation;
    }

    public void setAccountConsolidation(AccountConsolidation accountConsolidation) {
        this.accountConsolidation = accountConsolidation;
    }

    public int getAccountConsolidationId() {
        return accountConsolidationId;
    }

    public void setAccountConsolidationId(int accountConsolidationId) {
        this.accountConsolidationId = accountConsolidationId;
    }

    public int getForCompanyId() {
        return forCompanyId;
    }

    public void setForCompanyId(int forCompanyId) {
        this.forCompanyId = forCompanyId;
    }

    public int getTiedToInitialHolderId() {
        return tiedToInitialHolderId;
    }

    public void setTiedToInitialHolderId(int tiedToInitialHolderId) {
        this.tiedToInitialHolderId = tiedToInitialHolderId;
    }

    public int getTiedToCurrentHolderId() {
        return tiedToCurrentHolderId;
    }

    public void setTiedToCurrentHolderId(int tiedToCurrentHolderId) {
        this.tiedToCurrentHolderId = tiedToCurrentHolderId;
    }

    public String getInitialChn() {
        return initialChn;
    }

    public void setInitialChn(String initialChn) {
        this.initialChn = initialChn;
    }

    public String getCurrentChn() {
        return currentChn;
    }

    public void setCurrentChn(String currentChn) {
        this.currentChn = currentChn;
    }

    public int getBondShareUnit() {
        return bondShareUnit;
    }

    public void setBondShareUnit(int bondShareUnit) {
        this.bondShareUnit = bondShareUnit;
    }

    public boolean isTransfer() {
        return transfer;
    }

    public void setTransfer(boolean transfer) {
        this.transfer = transfer;
    }

    public int getReceiverUnitState() {
        return receiverUnitState;
    }

    public void setReceiverUnitState(int receiverUnitState) {
        this.receiverUnitState = receiverUnitState;
    }

    public int getReceiverStartUnit() {
        return receiverStartUnit;
    }

    public void setReceiverStartUnit(int receiverStartUnit) {
        this.receiverStartUnit = receiverStartUnit;
    }

    public int getUnitAfterTransfer() {
        return unitAfterTransfer;
    }

    public void setUnitAfterTransfer(int unitAfterTransfer) {
        this.unitAfterTransfer = unitAfterTransfer;
    }

    public String getMergeDate() {
        return mergeDate;
    }

    public void setMergeDate(String mergeDate) {
        this.mergeDate = mergeDate;
    }

    
}
