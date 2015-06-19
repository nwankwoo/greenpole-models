/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entrycode.emmanuel.model;

import java.io.Serializable;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * use for querying certificate
 *
 * @author user
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"descriptor", "certificate", "shareVolume",
    "startDate", "endDate"})
public class QueryCertificate implements Serializable {
//descriptor must be (default value) certificate:none; shareVolume:none; date:none
//possible values = certificate:none / certificate: certificate number / certificate: holder APR account number / certificate:holder address / certificate:issuing company name
//possible values = date:none/ date:exact/ date:before/ date:range /
    @XmlElement
    private String descriptor;
    @XmlElement
    private Certificate certificate;
    @XmlElementWrapper(name = "shareVolume")
    private Map<String, Integer> shareVolume;
    @XmlElement
    private String startDate;
    @XmlElement
    private String endDate;

    public QueryCertificate() {
    }

    public QueryCertificate(String descriptor, Certificate certificate, Map<String, Integer> shareVolume, String startDate, String endDate) {
        this.descriptor = descriptor;
        this.certificate = certificate;
        this.shareVolume = shareVolume;
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
     * @return the certificate
     */
    public Certificate getCertificate() {
        return certificate;
    }

    /**
     * @param certificate the certificate to set
     */
    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    /**
     * @return the shareVolume
     */
    public Map<String, Integer> getShareVolume() {
        return shareVolume;
    }

    /**
     * @param shareVolume the shareVolume to set
     */
    public void setShareVolume(Map<String, Integer> shareVolume) {
        this.shareVolume = shareVolume;
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
