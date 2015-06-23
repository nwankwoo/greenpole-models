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

/**
 *
 * @author emmanuel.idoko
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"id", "certificateNumber", "splitStatus", "mergeStatus", "eventDate"})
public class CertificateEvent implements Serializable {
    @XmlElement
    private int id;
    @XmlElement
    private int certificateNumber;
    @XmlElement
    private boolean splitStatus;
    @XmlElement
    private boolean mergeStatus;
    @XmlElement
    private String eventDate;

    public CertificateEvent() {
    }

    public CertificateEvent(int id, int certificateNumber, boolean splitStatus, boolean mergeStatus, String eventDate) {
        this.id = id;
        this.certificateNumber = certificateNumber;
        this.splitStatus = splitStatus;
        this.mergeStatus = mergeStatus;
        this.eventDate = eventDate;
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
     * @return the certificateNumber
     */
    public int getCertificateNumber() {
        return certificateNumber;
    }

    /**
     * @param certificateNumber the certificateNumber to set
     */
    public void setCertificateNumber(int certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    /**
     * @return the splitStatus
     */
    public boolean isSplitStatus() {
        return splitStatus;
    }

    /**
     * @param splitStatus the splitStatus to set
     */
    public void setSplitStatus(boolean splitStatus) {
        this.splitStatus = splitStatus;
    }

    /**
     * @return the mergeStatus
     */
    public boolean isMergeStatus() {
        return mergeStatus;
    }

    /**
     * @param mergeStatus the mergeStatus to set
     */
    public void setMergeStatus(boolean mergeStatus) {
        this.mergeStatus = mergeStatus;
    }

    /**
     * @return the eventDate
     */
    public String getEventDate() {
        return eventDate;
    }

    /**
     * @param eventDate the eventDate to set
     */
    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }
    
}
