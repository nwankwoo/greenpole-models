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
import org.greenpole.entity.model.clientcompany.ClientCompany;

/**
 *
 * @author Jephthah Sadare
 */
@XmlRootElement
@XmlSeeAlso({ClientCompany.class, ProcessedTransactionHolder.class})
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"id", "transactionTypeId", "cscsTransactionId", 
    "companyName", "processedTransactionHolders", "clientCompany"})

public class ProcessedTransaction implements Serializable {

    @XmlElement
    private int id;
    @XmlElement
    private int transactionTypeId;
    @XmlElement
    private int cscsTransactionId;
    @XmlElement
    private String companyName;
    @XmlElementWrapper(name = "processedTransactionHolders")
    private List<ProcessedTransactionHolder> processedTransactionHolders;
    @XmlElement
    private ClientCompany clientCompany;

    public ProcessedTransaction() {
    }

    /**
     * 
     * @param id
     * @param transactionTypeId
     * @param cscsTransactionId
     * @param companyName
     * @param processedTransactionHolders
     * @param clientCompany 
     */
    public ProcessedTransaction(int id, int transactionTypeId, int cscsTransactionId, String companyName, List<ProcessedTransactionHolder> processedTransactionHolders, ClientCompany clientCompany) {
        this.id = id;
        this.transactionTypeId = transactionTypeId;
        this.cscsTransactionId = cscsTransactionId;
        this.companyName = companyName;
        this.processedTransactionHolders = processedTransactionHolders;
        this.clientCompany = clientCompany;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTransactionTypeId() {
        return transactionTypeId;
    }

    public void setTransactionTypeId(int transactionTypeId) {
        this.transactionTypeId = transactionTypeId;
    }

    public int getCscsTransactionId() {
        return cscsTransactionId;
    }

    public void setCscsTransactionId(int cscsTransactionId) {
        this.cscsTransactionId = cscsTransactionId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<ProcessedTransactionHolder> getProcessedTransactionHolders() {
        return processedTransactionHolders;
    }

    public void setProcessedTransactionHolders(List<ProcessedTransactionHolder> processedTransactionHolders) {
        this.processedTransactionHolders = processedTransactionHolders;
    }

    public ClientCompany getClientCompany() {
        return clientCompany;
    }

    public void setClientCompany(ClientCompany clientCompany) {
        this.clientCompany = clientCompany;
    }

}
