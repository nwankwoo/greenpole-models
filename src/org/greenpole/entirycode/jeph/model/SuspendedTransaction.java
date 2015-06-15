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
@XmlSeeAlso({ClientCompany.class, SuspendedTransactionHolder.class})
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"id", "clientCompanyId", "cscsTransactionId",
    "transactionDate", "suspensionDate", "suspensionReason", "reconciled",
    "companyName", "suspendedTransactionHolders", "clientCompany"})

public class SuspendedTransaction implements Serializable {

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
    @XmlElementWrapper(name = "suspendedTransactionHolders")
    private List<SuspendedTransactionHolder> suspendedTransactionHolders;
    @XmlElement
    private ClientCompany clientCompany;

    public SuspendedTransaction() {
    }

    public SuspendedTransaction(int id, int clientCompanyId, int cscsTransactionId, String transactionDate, String suspensionDate, String suspensionReason, boolean reconciled, String companyName, List<SuspendedTransactionHolder> suspendedTransactionHolders, ClientCompany clientCompany) {
        this.id = id;
        this.clientCompanyId = clientCompanyId;
        this.cscsTransactionId = cscsTransactionId;
        this.transactionDate = transactionDate;
        this.suspensionDate = suspensionDate;
        this.suspensionReason = suspensionReason;
        this.reconciled = reconciled;
        this.companyName = companyName;
        this.suspendedTransactionHolders = suspendedTransactionHolders;
        this.clientCompany = clientCompany;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClientCompanyId() {
        return clientCompanyId;
    }

    public void setClientCompanyId(int clientCompanyId) {
        this.clientCompanyId = clientCompanyId;
    }

    public int getCscsTransactionId() {
        return cscsTransactionId;
    }

    public void setCscsTransactionId(int cscsTransactionId) {
        this.cscsTransactionId = cscsTransactionId;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getSuspensionDate() {
        return suspensionDate;
    }

    public void setSuspensionDate(String suspensionDate) {
        this.suspensionDate = suspensionDate;
    }

    public String getSuspensionReason() {
        return suspensionReason;
    }

    public void setSuspensionReason(String suspensionReason) {
        this.suspensionReason = suspensionReason;
    }

    public boolean isReconciled() {
        return reconciled;
    }

    public void setReconciled(boolean reconciled) {
        this.reconciled = reconciled;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<SuspendedTransactionHolder> getSuspendedTransactionHolders() {
        return suspendedTransactionHolders;
    }

    public void setSuspendedTransactionHolders(List<SuspendedTransactionHolder> suspendedTransactionHolders) {
        this.suspendedTransactionHolders = suspendedTransactionHolders;
    }

    public ClientCompany getClientCompany() {
        return clientCompany;
    }

    public void setClientCompany(ClientCompany clientCompany) {
        this.clientCompany = clientCompany;
    }

}
