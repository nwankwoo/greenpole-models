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
import org.greenpole.entity.model.clientcompany.UnitTransfer;

/**
 *
 * @author user
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"descriptor", "processedTransaction", "startDate", "endDate", "unitTransfer","shareUnitSold","shareUnitBought","bondUnitSold","bondUnitBought"})
public class QueryTransaction implements Serializable {

    @XmlElement
    private String descriptor;
    @XmlElement
    private ProcessedTransaction processedTransaction;
    @XmlElement
    private String startDate;
    @XmlElement
    private String endDate;
    @XmlElement
    private UnitTransfer unitTransfer;
    @XmlElementWrapper(name = "shareUnitSold")
    private Map<String, Integer> shareUnitSold;
    @XmlElementWrapper(name = "shareUnitBought")
    private Map<String, Integer> shareUnitBought;
    @XmlElementWrapper(name = "bondUnitSold")
    private Map<String, Integer> bondUnitSold;
    @XmlElementWrapper(name = "bondUnitBought")
    private Map<String, Integer> bondUnitBought;

    public QueryTransaction() {
    }

    public QueryTransaction(String descriptor, ProcessedTransaction processedTransaction, String startDate, String endDate, UnitTransfer unitTransfer) {
        this.descriptor = descriptor;
        this.processedTransaction = processedTransaction;
        this.startDate = startDate;
        this.endDate = endDate;
        this.unitTransfer = unitTransfer;
    }

    public QueryTransaction(String descriptor, ProcessedTransaction processedTransaction, String startDate, String endDate, UnitTransfer unitTransfer, Map<String, Integer> shareUnitSold, Map<String, Integer> shareUnitBought, Map<String, Integer> bondUnitSold, Map<String, Integer> bondUnitBought) {
        this.descriptor = descriptor;
        this.processedTransaction = processedTransaction;
        this.startDate = startDate;
        this.endDate = endDate;
        this.unitTransfer = unitTransfer;
        this.shareUnitSold = shareUnitSold;
        this.shareUnitBought = shareUnitBought;
        this.bondUnitSold = bondUnitSold;
        this.bondUnitBought = bondUnitBought;
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
     * @return the processedTransaction
     */
    public ProcessedTransaction getProcessedTransaction() {
        return processedTransaction;
    }

    /**
     * @param processedTransaction the processedTransaction to set
     */
    public void setProcessedTransaction(ProcessedTransaction processedTransaction) {
        this.processedTransaction = processedTransaction;
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

    /**
     * @return the unitTransfer
     */
    public UnitTransfer getUnitTransfer() {
        return unitTransfer;
    }

    /**
     * @param unitTransfer the unitTransfer to set
     */
    public void setUnitTransfer(UnitTransfer unitTransfer) {
        this.unitTransfer = unitTransfer;
    }

    /**
     * @return the shareUnitSold
     */
    public Map<String, Integer> getShareUnitSold() {
        return shareUnitSold;
    }

    /**
     * @param shareUnitSold the shareUnitSold to set
     */
    public void setShareUnitSold(Map<String, Integer> shareUnitSold) {
        this.shareUnitSold = shareUnitSold;
    }

    /**
     * @return the shareUnitBought
     */
    public Map<String, Integer> getShareUnitBought() {
        return shareUnitBought;
    }

    /**
     * @param shareUnitBought the shareUnitBought to set
     */
    public void setShareUnitBought(Map<String, Integer> shareUnitBought) {
        this.shareUnitBought = shareUnitBought;
    }

    /**
     * @return the bondUnitSold
     */
    public Map<String, Integer> getBondUnitSold() {
        return bondUnitSold;
    }

    /**
     * @param bondUnitSold the bondUnitSold to set
     */
    public void setBondUnitSold(Map<String, Integer> bondUnitSold) {
        this.bondUnitSold = bondUnitSold;
    }

    /**
     * @return the bondUnitBought
     */
    public Map<String, Integer> getBondUnitBought() {
        return bondUnitBought;
    }

    /**
     * @param bondUnitBought the bondUnitBought to set
     */
    public void setBondUnitBought(Map<String, Integer> bondUnitBought) {
        this.bondUnitBought = bondUnitBought;
    }

}
