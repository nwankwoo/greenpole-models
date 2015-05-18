/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model.holder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Jephthah Sadare
 * Used by the middle-tier to capture holder signature
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"holderId", "title", "signaturePath", "holderSignaturePrimary"})

public class HolderSignature {

    @XmlTransient
    private int id;
    @XmlElement
    private int holderId;
    @XmlElement
    private String title;
    @XmlElement
    private String signaturePath;
    @XmlElement
    private boolean primarySignature;
    @XmlTransient
    private String signatureContent;

    public HolderSignature() {
    }

    /**
     * 
     * @param id
     * @param holderId
     * @param title
     * @param signaturePath
     * @param primarySignature 
     */
    public HolderSignature(int id, int holderId, String title, String signaturePath, boolean primarySignature) {
        this.id = id;
        this.holderId = holderId;
        this.title = title;
        this.signaturePath = signaturePath;
        this.primarySignature = primarySignature;
    }

    /**
     * 
     * @param holderId holder id
     * @param title signature title
     * @param signaturePath path of uploaded signature image
     * @param primarySignature indicates primary signature
     * @param signatureContent the byte content of the signature
     */
    public HolderSignature(int holderId, String title, String signaturePath, boolean primarySignature, String signatureContent) {
        this.holderId = holderId;
        this.title = title;
        this.signaturePath = signaturePath;
        this.primarySignature = primarySignature;
        this.signatureContent = signatureContent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHolderId() {
        return holderId;
    }

    public void setHolderId(int holderId) {
        this.holderId = holderId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSignaturePath() {
        return signaturePath;
    }

    public void setSignaturePath(String signaturePath) {
        this.signaturePath = signaturePath;
    }

    public boolean isPrimarySignature() {
        return primarySignature;
    }

    public void setPrimarySignature(boolean primarySignature) {
        this.primarySignature = primarySignature;
    }
    
    public String getSignatureContent() {
        return signatureContent;
    }

    public void setSignatureContent(String signatureContent) {
        this.signatureContent = signatureContent;
    }

}
