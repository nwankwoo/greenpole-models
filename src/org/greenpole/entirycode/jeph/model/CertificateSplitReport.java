
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
@XmlSeeAlso({ProcessedCertificateSplit.class})
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"descriptor", "companyAccountConsolidation",
    "accountConsolidation", "startDate", "endDate"})

public class CertificateSplitReport implements Serializable {

    @XmlElement
    private String descriptor;
    @XmlElementWrapper(name = "processedTransactions")
    private List<ProcessedCertificateSplit> processedCertificateSplit;
    @XmlElement
    private String startDate;
    @XmlElement
    private String endDate;

    public CertificateSplitReport() {
    }

    public CertificateSplitReport(String descriptor, List<ProcessedCertificateSplit> processedCertificateSplit, String startDate, String endDate) {
        this.descriptor = descriptor;
        this.processedCertificateSplit = processedCertificateSplit;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    public List<ProcessedCertificateSplit> getProcessedCertificateSplit() {
        return processedCertificateSplit;
    }

    public void setProcessedCertificateSplit(List<ProcessedCertificateSplit> processedCertificateSplit) {
        this.processedCertificateSplit = processedCertificateSplit;
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
