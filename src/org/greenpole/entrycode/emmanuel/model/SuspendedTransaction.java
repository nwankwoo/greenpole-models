/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entrycode.emmanuel.model;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author user
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"id","clientCompanyId","cscsTransactionId","transactionDate","suspensionDate","suspensionReason","reconciled","companyName","suspendedTransactionHolder"})
public class SuspendedTransaction {
  @XmlElement
    private int id;
  @XmlElement
  private int clientCompanyId;
  @XmlElement
  private int cscsTransactionId;
  @XmlElement
     private String transactionDate;
  @XmlElement
     private String suspensionDate;
  @XmlElement
     private String suspensionReason;
  @XmlElement
     private boolean reconciled;
  @XmlElement
     private String companyName;
  @XmlElementWrapper(name = "suspendedTransactionHolder")
     private List<SuspendedTransactionHolder> suspendedTransactionHolder;

    public SuspendedTransaction() {
    }

    public SuspendedTransaction(int id, int clientCompanyId, int cscsTransactionId, String transactionDate, String suspensionDate, String suspensionReason, boolean reconciled, String companyName, List<SuspendedTransactionHolder> suspendedTransactionHolder) {
        this.id = id;
        this.clientCompanyId = clientCompanyId;
        this.cscsTransactionId = cscsTransactionId;
        this.transactionDate = transactionDate;
        this.suspensionDate = suspensionDate;
        this.suspensionReason = suspensionReason;
        this.reconciled = reconciled;
        this.companyName = companyName;
        this.suspendedTransactionHolder = suspendedTransactionHolder;
    }

    public SuspendedTransaction(int clientCompanyId, int cscsTransactionId, String transactionDate, String suspensionDate, String suspensionReason, boolean reconciled, String companyName, List<SuspendedTransactionHolder> suspendedTransactionHolder) {
        this.clientCompanyId = clientCompanyId;
        this.cscsTransactionId = cscsTransactionId;
        this.transactionDate = transactionDate;
        this.suspensionDate = suspensionDate;
        this.suspensionReason = suspensionReason;
        this.reconciled = reconciled;
        this.companyName = companyName;
        this.suspendedTransactionHolder = suspendedTransactionHolder;
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
     * @return the clientCompanyId
     */
    public int getClientCompanyId() {
        return clientCompanyId;
    }

    /**
     * @param clientCompanyId the clientCompanyId to set
     */
    public void setClientCompanyId(int clientCompanyId) {
        this.clientCompanyId = clientCompanyId;
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
     * @return the transactionDate
     */
    public String getTransactionDate() {
        return transactionDate;
    }

    /**
     * @param transactionDate the transactionDate to set
     */
    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    /**
     * @return the suspensionDate
     */
    public String getSuspensionDate() {
        return suspensionDate;
    }

    /**
     * @param suspensionDate the suspensionDate to set
     */
    public void setSuspensionDate(String suspensionDate) {
        this.suspensionDate = suspensionDate;
    }

    /**
     * @return the suspensionReason
     */
    public String getSuspensionReason() {
        return suspensionReason;
    }

    /**
     * @param suspensionReason the suspensionReason to set
     */
    public void setSuspensionReason(String suspensionReason) {
        this.suspensionReason = suspensionReason;
    }

    /**
     * @return the reconciled
     */
    public boolean isReconciled() {
        return reconciled;
    }

    /**
     * @param reconciled the reconciled to set
     */
    public void setReconciled(boolean reconciled) {
        this.reconciled = reconciled;
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
     * @return the suspendedTransactionHolder
     */
    public List<SuspendedTransactionHolder> getSuspendedTransactionHolder() {
        return suspendedTransactionHolder;
    }

    /**
     * @param suspendedTransactionHolder the suspendedTransactionHolder to set
     */
    public void setSuspendedTransactionHolder(List<SuspendedTransactionHolder> suspendedTransactionHolder) {
        this.suspendedTransactionHolder = suspendedTransactionHolder;
    }
  
}
