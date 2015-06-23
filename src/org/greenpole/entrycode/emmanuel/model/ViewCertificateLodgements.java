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
@XmlType(propOrder = {"descriptor","certificateLodgement","startDate","endDate"})
public class ViewCertificateLodgements implements Serializable {
    //descriptor must be date:none / date:exact / date:between / date:before / date:after
 @XmlElement
    private String descriptor;
    @XmlElement
    private CertificateLodgement certificateLodgement;
    @XmlElement
    private String startDate;
    @XmlElement
    private String endDate; 

    public ViewCertificateLodgements() {
    }

    public ViewCertificateLodgements(String descriptor, CertificateLodgement certificateLodgement, String startDate, String endDate) {
        this.descriptor = descriptor;
        this.certificateLodgement = certificateLodgement;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public ViewCertificateLodgements(String descriptor, String startDate, String endDate) {
        this.descriptor = descriptor;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    /**
     * @return the descriptor
     */
    public String getDescriptor() {
        return descriptor;
    }

    /**
     * @param descriptor the descriptor to set
     */
    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    /**
     * @return the certificateLodgement
     */
    public CertificateLodgement getCertificateLodgement() {
        return certificateLodgement;
    }

    /**
     * @param certificateLodgement the certificateLodgement to set
     */
    public void setCertificateLodgement(CertificateLodgement certificateLodgement) {
        this.certificateLodgement = certificateLodgement;
    }

    /**
     * @return the startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    
}
