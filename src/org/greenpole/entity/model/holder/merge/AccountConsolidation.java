/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model.holder.merge;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * @author Akin
 * Carries information on account consolidations.
 */
@XmlRootElement
@XmlSeeAlso({CompanyAccountConsolidation.class})
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"holderId","holderName","mergedToHolderId","mergedToHolderName",
    "mergeDate","demerge","additionalChanges","demergeDate","companyAccountConsolidation"})
public class AccountConsolidation implements Serializable {
    @XmlTransient
    private int id;
    @XmlElement
    private int holderId;
    @XmlElement
    private String holderName;
    @XmlElement
    private int mergedToHolderId;
    @XmlElement
    private String mergedToHolderName;
    @XmlElement
    private String mergeDate;
    @XmlElement
    private boolean demerge;
    @XmlElement
    private String additionalChanges;
    @XmlElement
    private String demergeDate;
    @XmlElementWrapper(name = "comnpanyAccountConsolidation")
    private List<CompanyAccountConsolidation> companyAccountConsolidation;

    public AccountConsolidation() {
    }

    /**
     * Used to query / edit an existing account consolidation.
     * Parameters are self-explanatory.
     * @param id
     * @param holderId
     * @param holderName
     * @param mergedToHolderId
     * @param mergedToHolderName
     * @param mergeDate
     * @param demerge
     * @param additionalChanges
     * @param demergeDate
     * @param comnpanyAccountConsolidation 
     */
    public AccountConsolidation(int id, int holderId, String holderName, int mergedToHolderId, String mergedToHolderName, String mergeDate, boolean demerge, String additionalChanges, String demergeDate, List<CompanyAccountConsolidation> comnpanyAccountConsolidation) {
        this.id = id;
        this.holderId = holderId;
        this.holderName = holderName;
        this.mergedToHolderId = mergedToHolderId;
        this.mergedToHolderName = mergedToHolderName;
        this.mergeDate = mergeDate;
        this.demerge = demerge;
        this.additionalChanges = additionalChanges;
        this.demergeDate = demergeDate;
        this.companyAccountConsolidation = comnpanyAccountConsolidation;
    }

    /**
     * Used to create a new account consolidation.
     * Parameters are self-explanatory.
     * @param holderId
     * @param holderName
     * @param mergedToHolderId
     * @param mergedToHolderName
     * @param mergeDate
     * @param demerge
     * @param additionalChanges
     * @param demergeDate
     * @param comnpanyAccountConsolidation 
     */
    public AccountConsolidation(int holderId, String holderName, int mergedToHolderId, String mergedToHolderName, String mergeDate, boolean demerge, String additionalChanges, String demergeDate, List<CompanyAccountConsolidation> comnpanyAccountConsolidation) {
        this.holderId = holderId;
        this.holderName = holderName;
        this.mergedToHolderId = mergedToHolderId;
        this.mergedToHolderName = mergedToHolderName;
        this.mergeDate = mergeDate;
        this.demerge = demerge;
        this.additionalChanges = additionalChanges;
        this.demergeDate = demergeDate;
        this.companyAccountConsolidation = comnpanyAccountConsolidation;
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
     * @return the holderId
     */
    public int getHolderId() {
        return holderId;
    }

    /**
     * @param holderId
     */
    public void setHolderId(int holderId) {
        this.holderId = holderId;
    }

    /**
     * @return the holderName
     */
    public String getHolderName() {
        return holderName;
    }

    /**
     * @param holderName the holderName to set
     */
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    /**
     * @return the mergedToHolderId
     */
    public int getMergedToHolderId() {
        return mergedToHolderId;
    }

    /**
     * @param mergedToHolderId the mergedToHolderId to set
     */
    public void setMergedToHolderId(int mergedToHolderId) {
        this.mergedToHolderId = mergedToHolderId;
    }

    /**
     * @return the mergedToHolderName
     */
    public String getMergedToHolderName() {
        return mergedToHolderName;
    }

    /**
     * @param mergedToHolderName the mergedToHolderName to set
     */
    public void setMergedToHolderName(String mergedToHolderName) {
        this.mergedToHolderName = mergedToHolderName;
    }

    /**
     * @return the mergeDate
     */
    public String getMergeDate() {
        return mergeDate;
    }

    /**
     * @param mergeDate the mergeDate to set
     */
    public void setMergeDate(String mergeDate) {
        this.mergeDate = mergeDate;
    }

    /**
     * @return the demerge
     */
    public boolean isDemerge() {
        return demerge;
    }

    /**
     * @param demerge the demerge to set
     */
    public void setDemerge(boolean demerge) {
        this.demerge = demerge;
    }

    /**
     * @return the additionalChanges
     */
    public String getAdditionalChanges() {
        return additionalChanges;
    }

    /**
     * @param additionalChanges the additionalChanges to set
     */
    public void setAdditionalChanges(String additionalChanges) {
        this.additionalChanges = additionalChanges;
    }

    /**
     * @return the demergeDate
     */
    public String getDemergeDate() {
        return demergeDate;
    }

    /**
     * @param demergeDate the demergeDate to set
     */
    public void setDemergeDate(String demergeDate) {
        this.demergeDate = demergeDate;
    }

    /**
     * @return the companyAccountConsolidation
     */
    public List<CompanyAccountConsolidation> getCompanyAccountConsolidation() {
        return companyAccountConsolidation;
    }

    /**
     * @param companyAccountConsolidation the companyAccountConsolidation to
 set
     */
    public void setCompanyAccountConsolidation(List<CompanyAccountConsolidation> companyAccountConsolidation) {
        this.companyAccountConsolidation = companyAccountConsolidation;
    }

}
