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
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author user
 */
@XmlRootElement
@XmlSeeAlso({CompanyAccountConsolidation.class})
@XmlAccessorType(XmlAccessType.NONE)
public class AccountConsolidation {

    @XmlElement
    private int id;
    @XmlElement
    private int holderId;
    @XmlElement
    private Holder holder;
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
    private List<CompanyAccountConsolidation> comnpanyAccountConsolidation;

    public AccountConsolidation() {
    }

    public AccountConsolidation(int id, int holderId, Holder holder, String holderName, int mergedToHolderId, String mergedToHolderName, String mergeDate, boolean demerge, String additionalChanges, String demergeDate, List<CompanyAccountConsolidation> comnpanyAccountConsolidation) {
        this.id = id;
        this.holderId = holderId;
        this.holder = holder;
        this.holderName = holderName;
        this.mergedToHolderId = mergedToHolderId;
        this.mergedToHolderName = mergedToHolderName;
        this.mergeDate = mergeDate;
        this.demerge = demerge;
        this.additionalChanges = additionalChanges;
        this.demergeDate = demergeDate;
        this.comnpanyAccountConsolidation = comnpanyAccountConsolidation;
    }

    public AccountConsolidation(Holder holder, String holderName, int mergedToHolderId, String mergedToHolderName, String mergeDate, boolean demerge, String additionalChanges, String demergeDate, List<CompanyAccountConsolidation> comnpanyAccountConsolidation) {
        this.holder = holder;
        this.holderName = holderName;
        this.mergedToHolderId = mergedToHolderId;
        this.mergedToHolderName = mergedToHolderName;
        this.mergeDate = mergeDate;
        this.demerge = demerge;
        this.additionalChanges = additionalChanges;
        this.demergeDate = demergeDate;
        this.comnpanyAccountConsolidation = comnpanyAccountConsolidation;
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
     * @return the holder
     */
    public Holder getHolder() {
        return holder;
    }

    /**
     * @param holder the holder to set
     */
    public void setHolder(Holder holder) {
        this.holder = holder;
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
     * @return the comnpanyAccountConsolidation
     */
    public List<CompanyAccountConsolidation> getComnpanyAccountConsolidation() {
        return comnpanyAccountConsolidation;
    }

    /**
     * @param comnpanyAccountConsolidation the comnpanyAccountConsolidation to
     * set
     */
    public void setComnpanyAccountConsolidation(List<CompanyAccountConsolidation> comnpanyAccountConsolidation) {
        this.comnpanyAccountConsolidation = comnpanyAccountConsolidation;
    }

}
