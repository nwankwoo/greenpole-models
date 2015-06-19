/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entrycode.emmanuel.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author user
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"id", "certificateId", "status",
    "note"})
public class CertificateVerification implements Serializable {

    private int id;
    private int certificateId;
    private String status;
    private String note;

    public CertificateVerification() {
    }

    public CertificateVerification(int id, int certificateId, String status, String note) {
        this.id = id;
        this.certificateId = certificateId;
        this.status = status;
        this.note = note;
    }

    public CertificateVerification(int certificateId, String status, String note) {
        this.certificateId = certificateId;
        this.status = status;
        this.note = note;
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
     * @return the certificateId
     */
    public int getCertificateId() {
        return certificateId;
    }

    /**
     * @param certificateId the certificateId to set
     */
    public void setCertificateId(int certificateId) {
        this.certificateId = certificateId;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the note
     */
    public String getNote() {
        return note;
    }

    /**
     * @param note the note to set
     */
    public void setNote(String note) {
        this.note = note;
    }
    
}
