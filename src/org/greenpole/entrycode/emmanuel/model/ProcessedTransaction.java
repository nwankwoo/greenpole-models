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
import org.greenpole.entity.model.clientcompany.ClientCompany;
/**
 *
 * @author user
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"id", "clientCompanyId", "cscsTransactionId", "companyName", "transactionTypeId", "processedTransactionHolder"})
public class ProcessedTransaction implements Serializable {

    @XmlElement
    private int id;
    @XmlElement
    private ClientCompany clientCompany;
    @XmlElement
    private int cscsTransactionId;
    @XmlElement
    private String companyName;
    @XmlElement
    private int transactionTypeId;
    @XmlElementWrapper(name = "processedTransactionHolder")
    private List<ProcessedTransactionHolder> processedTransactionHolder;

    public ProcessedTransaction() {
    }
    public ProcessedTransaction(int id, ClientCompany clientCompany, int cscsTransactionId, String companyName, int transactionTypeId, List<ProcessedTransactionHolder> processedTransactionHolder) {
        this.id = id;
        this.clientCompany = clientCompany;
        this.cscsTransactionId = cscsTransactionId;
        this.companyName = companyName;
        this.transactionTypeId = transactionTypeId;
        this.processedTransactionHolder = processedTransactionHolder;
    }
    public ProcessedTransaction(ClientCompany clientCompany, int cscsTransactionId, String companyName, int transactionTypeId, List<ProcessedTransactionHolder> processedTransactionHolder) {
        this.clientCompany = clientCompany;
        this.cscsTransactionId = cscsTransactionId;
        this.companyName = companyName;
        this.transactionTypeId = transactionTypeId;
        this.processedTransactionHolder = processedTransactionHolder;
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
     * @return the clientCompany
     */
    public ClientCompany getClientCompany() {
        return clientCompany;
    }

    /**
     * @param clientCompany the clientCompany to set
     */
    public void setClientCompany(ClientCompany clientCompany) {
        this.clientCompany = clientCompany;
    }

    /**
     * @return the cscsTransactionId
     */
    public int getCscsTransactionId() {
        return cscsTransactionId;
    }

    /**
     * @param cscsTransactionId the cscsTransactionId to set
     */
    public void setCscsTransactionId(int cscsTransactionId) {
        this.cscsTransactionId = cscsTransactionId;
    }

    /**
     * @return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName the companyName to set
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * @return the transactionTypeId
     */
    public int getTransactionTypeId() {
        return transactionTypeId;
    }

    /**
     * @param transactionTypeId the transactionTypeId to set
     */
    public void setTransactionTypeId(int transactionTypeId) {
        this.transactionTypeId = transactionTypeId;
    }

    /**
     * @return the processedTransactionHolder
     */
    public List<ProcessedTransactionHolder> getProcessedTransactionHolder() {
        return processedTransactionHolder;
    }

    /**
     * @param processedTransactionHolder the processedTransactionHolder to set
     */
    public void setProcessedTransactionHolder(List<ProcessedTransactionHolder> processedTransactionHolder) {
        this.processedTransactionHolder = processedTransactionHolder;
    }

    
}
