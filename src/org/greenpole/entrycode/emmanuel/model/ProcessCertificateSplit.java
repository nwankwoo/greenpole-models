/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entrycode.emmanuel.model;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *processes certificates split
 * @author user
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"originalCertificate","createdCetificates"})
public class ProcessCertificateSplit implements Serializable {
@XmlElement
private Certificate originalCertificate;
@XmlElementWrapper (name = "createdCetificates")
private List<Certificate> createdCetificates;

    public ProcessCertificateSplit() {
    }

    public ProcessCertificateSplit(Certificate originalCertificate, List<Certificate> createdCetificates) {
        this.originalCertificate = originalCertificate;
        this.createdCetificates = createdCetificates;
    }

    /**
     * @return the originalCertificate
     */
    public Certificate getOriginalCertificate() {
        return originalCertificate;
    }

    /**
     * @param originalCertificate the originalCertificate to set
     */
    public void setOriginalCertificate(Certificate originalCertificate) {
        this.originalCertificate = originalCertificate;
    }

    /**
     * @return the createdCetificates
     */
    public List<Certificate> getCreatedCetificates() {
        return createdCetificates;
    }

    /**
     * @param createdCetificates the createdCetificates to set
     */
    public void setCreatedCetificates(List<Certificate> createdCetificates) {
        this.createdCetificates = createdCetificates;
    }

}
