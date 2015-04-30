/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entrycode.emmanuel.model;

import java.util.Date;
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
public CompanyAccountConsolidation(){}
    public CompanyAccountConsolidation(int id, AccountConsolidation accountConsolidation, int forCompanyId, int tiedToInitialHolderId, int tiedToCurrentHolderId, String initialChn, String currentChn, int bondShareUnit, boolean transfer, int receiverUnitState, int receiverStartUnit, int unitAfterTransfer, String mergeDate) {
        this.id = id;
        this.accountConsolidation = accountConsolidation;
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

    public CompanyAccountConsolidation(AccountConsolidation accountConsolidation, int forCompanyId, int tiedToInitialHolderId, int tiedToCurrentHolderId, String initialChn, String currentChn, int bondShareUnit, boolean transfer, int receiverUnitState, int receiverStartUnit, int unitAfterTransfer, String mergeDate) {
        this.accountConsolidation = accountConsolidation;
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

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the accountConsolidation
     */
    public AccountConsolidation getAccountConsolidation() {
        return accountConsolidation;
    }

    /**
     * @param accountConsolidation the accountConsolidation to set
     */
    public void setAccountConsolidation(AccountConsolidation accountConsolidation) {
        this.accountConsolidation = accountConsolidation;
    }

    /**
     * @return the forCompanyId
     */
    public int getForCompanyId() {
        return forCompanyId;
    }

    /**
     * @param forCompanyId the forCompanyId to set
     */
    public void setForCompanyId(int forCompanyId) {
        this.forCompanyId = forCompanyId;
    }

    /**
     * @return the tiedToInitialHolderId
     */
    public int getTiedToInitialHolderId() {
        return tiedToInitialHolderId;
    }

    /**
     * @param tiedToInitialHolderId the tiedToInitialHolderId to set
     */
    public void setTiedToInitialHolderId(int tiedToInitialHolderId) {
        this.tiedToInitialHolderId = tiedToInitialHolderId;
    }

    /**
     * @return the tiedToCurrentHolderId
     */
    public int getTiedToCurrentHolderId() {
        return tiedToCurrentHolderId;
    }

    /**
     * @param tiedToCurrentHolderId the tiedToCurrentHolderId to set
     */
    public void setTiedToCurrentHolderId(int tiedToCurrentHolderId) {
        this.tiedToCurrentHolderId = tiedToCurrentHolderId;
    }

    /**
     * @return the initialChn
     */
    public String getInitialChn() {
        return initialChn;
    }

    /**
     * @param initialChn the initialChn to set
     */
    public void setInitialChn(String initialChn) {
        this.initialChn = initialChn;
    }

    /**
     * @return the currentChn
     */
    public String getCurrentChn() {
        return currentChn;
    }

    /**
     * @param currentChn the currentChn to set
     */
    public void setCurrentChn(String currentChn) {
        this.currentChn = currentChn;
    }

    /**
     * @return the bondShareUnit
     */
    public int getBondShareUnit() {
        return bondShareUnit;
    }

    /**
     * @param bondShareUnit the bondShareUnit to set
     */
    public void setBondShareUnit(int bondShareUnit) {
        this.bondShareUnit = bondShareUnit;
    }

    /**
     * @return the transfer
     */
    public boolean isTransfer() {
        return transfer;
    }

    /**
     * @param transfer the transfer to set
     */
    public void setTransfer(boolean transfer) {
        this.transfer = transfer;
    }

    /**
     * @return the receiverUnitState
     */
    public int getReceiverUnitState() {
        return receiverUnitState;
    }

    /**
     * @param receiverUnitState the receiverUnitState to set
     */
    public void setReceiverUnitState(int receiverUnitState) {
        this.receiverUnitState = receiverUnitState;
    }

    /**
     * @return the receiverStartUnit
     */
    public int getReceiverStartUnit() {
        return receiverStartUnit;
    }

    /**
     * @param receiverStartUnit the receiverStartUnit to set
     */
    public void setReceiverStartUnit(int receiverStartUnit) {
        this.receiverStartUnit = receiverStartUnit;
    }

    /**
     * @return the unitAfterTransfer
     */
    public int getUnitAfterTransfer() {
        return unitAfterTransfer;
    }

    /**
     * @param unitAfterTransfer the unitAfterTransfer to set
     */
    public void setUnitAfterTransfer(int unitAfterTransfer) {
        this.unitAfterTransfer = unitAfterTransfer;
    }

    /**
     * @return the mergeDate
     */
    public String getMergeDate() {
        return mergeDate;
    }

    /**
     * @param mergeDate the mergeDate to set
     */
    public void setMergeDate(String mergeDate) {
        this.mergeDate = mergeDate;
    }
    
}
