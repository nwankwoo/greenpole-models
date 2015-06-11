/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entrycode.emmanuel.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.greenpole.entity.model.holder.Holder;

/**
 *
 * @author user
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"id","holderId","holder","processedTransactionId","holderName","holderChn","units","unitType","fromTo","processedTransaction"})
public class ProcessedTransactionHolder implements Serializable {
  @XmlElement
    private int id;
  @XmlElement
    private int holderId;
   @XmlElement
    private Holder holder;
   @XmlElement
   private int processedTransactionId;
   @XmlElement
   private String holderName;
   @XmlElement
   private String holderChn;
   @XmlElement
   private int units;
   @XmlElement
     private String unitType;
   @XmlElement
     private String fromTo;
   @XmlElement
   private ProcessedTransaction processedTransaction;

    public ProcessedTransactionHolder() {
    }

    public ProcessedTransactionHolder(int id, int holderId, Holder holder, int processedTransactionId, String holderName, String holderChn, int units, String unitType, String fromTo) {
        this.id = id;
        this.holderId = holderId;
        this.holder = holder;
        this.processedTransactionId = processedTransactionId;
        this.holderName = holderName;
        this.holderChn = holderChn;
        this.units = units;
        this.unitType = unitType;
        this.fromTo = fromTo;
    }

    public ProcessedTransactionHolder(int holderId, Holder holder, int processedTransactionId, String holderName, String holderChn, int units, String unitType, String fromTo) {
        this.holderId = holderId;
        this.holder = holder;
        this.processedTransactionId = processedTransactionId;
        this.holderName = holderName;
        this.holderChn = holderChn;
        this.units = units;
        this.unitType = unitType;
        this.fromTo = fromTo;
    }

    public ProcessedTransactionHolder(int id, int holderId, Holder holder, int processedTransactionId, String holderName, String holderChn, int units, String unitType, String fromTo, ProcessedTransaction processedTransaction) {
        this.id = id;
        this.holderId = holderId;
        this.holder = holder;
        this.processedTransactionId = processedTransactionId;
        this.holderName = holderName;
        this.holderChn = holderChn;
        this.units = units;
        this.unitType = unitType;
        this.fromTo = fromTo;
        this.processedTransaction = processedTransaction;
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
     * @return the holderId
     */
    public int getHolderId() {
        return holderId;
    }

    /**
     * @param holderId the holderId to set
     */
    public void setHolderId(int holderId) {
        this.holderId = holderId;
    }

    /**
     * @return the holder
     */
    public Holder getHolder() {
        return holder;
    }

    /**
     * @param holder the holder to set
     */
    public void setHolder(Holder holder) {
        this.holder = holder;
    }

    /**
     * @return the processedTransactionId
     */
    public int getProcessedTransactionId() {
        return processedTransactionId;
    }

    /**
     * @param processedTransactionId the processedTransactionId to set
     */
    public void setProcessedTransactionId(int processedTransactionId) {
        this.processedTransactionId = processedTransactionId;
    }

    /**
     * @return the holderName
     */
    public String getHolderName() {
        return holderName;
    }

    /**
     * @param holderName the holderName to set
     */
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    /**
     * @return the holderChn
     */
    public String getHolderChn() {
        return holderChn;
    }

    /**
     * @param holderChn the holderChn to set
     */
    public void setHolderChn(String holderChn) {
        this.holderChn = holderChn;
    }

    /**
     * @return the units
     */
    public int getUnits() {
        return units;
    }

    /**
     * @param units the units to set
     */
    public void setUnits(int units) {
        this.units = units;
    }

    /**
     * @return the unitType
     */
    public String getUnitType() {
        return unitType;
    }

    /**
     * @param unitType the unitType to set
     */
    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    /**
     * @return the fromTo
     */
    public String getFromTo() {
        return fromTo;
    }

    /**
     * @param fromTo the fromTo to set
     */
    public void setFromTo(String fromTo) {
        this.fromTo = fromTo;
    }

    /**
     * @return the processedTransaction
     */
    public ProcessedTransaction getProcessedTransaction() {
        return processedTransaction;
    }

    /**
     * @param processedTransaction the processedTransaction to set
     */
    public void setProcessedTransaction(ProcessedTransaction processedTransaction) {
        this.processedTransaction = processedTransaction;
    }

    
}
