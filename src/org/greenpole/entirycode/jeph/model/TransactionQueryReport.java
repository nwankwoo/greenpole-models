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
@XmlSeeAlso({ProcessedTransaction.class, ProcessedTransactionHolder.class})
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"descriptor", "companyAccountConsolidation",
    "accountConsolidation", "startDate", "endDate"})

public class TransactionQueryReport implements Serializable {

    @XmlElement
    private String descriptor;
    @XmlElementWrapper(name = "processedTransactions")
    private List<ProcessedTransaction> processedTransactions;
    @XmlElementWrapper(name = "processedTransactionHolders")
    private List<ProcessedTransactionHolder> processedTransactionHolders;
    @XmlElement
    private String startDate;
    @XmlElement
    private String endDate;

    public TransactionQueryReport() {
    }

    /**
     * 
     * @param descriptor
     * @param processedTransactions
     * @param processedTransactionHolders
     * @param startDate
     * @param endDate 
     */
    public TransactionQueryReport(String descriptor, List<ProcessedTransaction> processedTransactions, List<ProcessedTransactionHolder> processedTransactionHolders, String startDate, String endDate) {
        this.descriptor = descriptor;
        this.processedTransactions = processedTransactions;
        this.processedTransactionHolders = processedTransactionHolders;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    public List<ProcessedTransaction> getProcessedTransactions() {
        return processedTransactions;
    }

    public void setProcessedTransactions(List<ProcessedTransaction> processedTransactions) {
        this.processedTransactions = processedTransactions;
    }

    public List<ProcessedTransactionHolder> getProcessedTransactionHolders() {
        return processedTransactionHolders;
    }

    public void setProcessedTransactionHolders(List<ProcessedTransactionHolder> processedTransactionHolders) {
        this.processedTransactionHolders = processedTransactionHolders;
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
