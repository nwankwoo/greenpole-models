/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entirycode.jeph.model;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Jephthah Sadare
 */
@XmlRootElement
@XmlSeeAlso({Certificate.class})
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"descriptor", "certificates", "startDate", "endDate"})

public class QueryMergedCertificate implements Serializable {

    @XmlElement
    private String descriptor;
    @XmlElementWrapper(name = "certificates")
    private List<Certificate> certificates;
    @XmlElement
    private String startDate;
    @XmlElement
    private String endDate;

    public QueryMergedCertificate() {
    }
    
    /**
     * 
     * @param descriptor
     * @param certificates
     * @param startDate
     * @param endDate 
     */
    public QueryMergedCertificate(String descriptor, List<Certificate> certificates, String startDate, String endDate) {
        this.descriptor = descriptor;
        this.certificates = certificates;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    public List<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certificate> certificates) {
        this.certificates = certificates;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

}
