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
@XmlType(propOrder = {"id","holder","suspendedTransactionId","units","unitType","fromTo"})
public class SuspendedTransactionHolder implements Serializable {
    @XmlElement
    private int id;
    @XmlElement
    private Holder holder;
    @XmlElement
    private int suspendedTransactionId;
    @XmlElement
    private int units;
    @XmlElement
     private String unitType;
    @XmlElement
     private String fromTo;

    public SuspendedTransactionHolder() {
    }

    public SuspendedTransactionHolder(int id, Holder holder, int suspendedTransactionId, int units, String unitType, String fromTo) {
        this.id = id;
        this.holder = holder;
        this.suspendedTransactionId = suspendedTransactionId;
        this.units = units;
        this.unitType = unitType;
        this.fromTo = fromTo;
    }

    public SuspendedTransactionHolder(Holder holder, int suspendedTransactionId, int units, String unitType, String fromTo) {
        this.holder = holder;
        this.suspendedTransactionId = suspendedTransactionId;
        this.units = units;
        this.unitType = unitType;
        this.fromTo = fromTo;
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
     * @return the suspendedTransactionId
     */
    public int getSuspendedTransactionId() {
        return suspendedTransactionId;
    }

    /**
     * @param suspendedTransactionId the suspendedTransactionId to set
     */
    public void setSuspendedTransactionId(int suspendedTransactionId) {
        this.suspendedTransactionId = suspendedTransactionId;
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
    
}
