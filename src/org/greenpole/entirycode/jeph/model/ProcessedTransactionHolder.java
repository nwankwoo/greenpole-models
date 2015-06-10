/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entirycode.jeph.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.greenpole.entity.model.holder.Holder;

/**
 *
 * @author Jephthah Sadare
 */
@XmlRootElement
@XmlSeeAlso({Holder.class})
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"processedTransactionHolderId", "holderId",
    "processedTransactionId", "holderName", "holderChn", "units",
    "unitType", "fromTo", "holder"})

public class ProcessedTransactionHolder implements Serializable {
    
    @XmlElement
    private int id;
    @XmlElement
    private int holderId;
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
    private Holder holder;

    public ProcessedTransactionHolder() {
    }
    
    /**
     * 
     * @param id
     * @param holderId
     * @param processedTransactionId
     * @param holderName
     * @param holderChn
     * @param units
     * @param unitType
     * @param fromTo
     * @param holder 
     */
    public ProcessedTransactionHolder(int id, int holderId, int processedTransactionId, String holderName, String holderChn, int units, String unitType, String fromTo, Holder holder) {
        this.id = id;
        this.holderId = holderId;
        this.processedTransactionId = processedTransactionId;
        this.holderName = holderName;
        this.holderChn = holderChn;
        this.units = units;
        this.unitType = unitType;
        this.fromTo = fromTo;
        this.holder = holder;
    }

    public int getId() {
        return id;
    }

    public void setId(int Id) {
        this.id = Id;
    }

    public int getHolderId() {
        return holderId;
    }

    public void setHolderId(int holderId) {
        this.holderId = holderId;
    }

    public int getProcessedTransactionId() {
        return processedTransactionId;
    }

    public void setProcessedTransactionId(int processedTransactionId) {
        this.processedTransactionId = processedTransactionId;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getHolderChn() {
        return holderChn;
    }

    public void setHolderChn(String holderChn) {
        this.holderChn = holderChn;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public String getFromTo() {
        return fromTo;
    }

    public void setFromTo(String fromTo) {
        this.fromTo = fromTo;
    }

    public Holder getHolder() {
        return holder;
    }

    public void setHolder(Holder holder) {
        this.holder = holder;
    }

}
