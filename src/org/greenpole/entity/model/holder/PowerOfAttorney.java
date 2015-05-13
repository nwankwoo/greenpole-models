/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model.holder;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import org.greenpole.entrycode.emmanuel.model.Holder;

/**
 *
 * @author Akin Agbaje
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"holderAcctNumber", "chn", "firstName", "middleName", "lastName",
    "type", "gender", "dob", "taxExempted", "merged", "pryHolder", "pryAddress", "holderPhoneNumbers",
    "holderEmailAddresses", "holderResidentialAddresses", "holderPostalAddress", "holderCompanyAccounts",
    "holderBondAccounts"})
public class PowerOfAttorney implements Serializable {

    @XmlTransient
    private int id;
    @XmlElement
    private int holderId;
    @XmlElement
    private String title;
    @XmlElement
    private String filePath;
    @XmlElement
    private String type;
    @XmlElement
    private String startDate;
    @XmlElement
    private String endDate;
    @XmlElement
    private boolean primaryPowerOfAttorney;
    @XmlTransient
    private String fileContents;
    
    public PowerOfAttorney() {
    }

    public PowerOfAttorney(int holderId, String title, String filePath, String type, String startDate, String endDate, boolean primaryPowerOfAttorney, String fileContents) {
        this.holderId = holderId;
        this.title = title;
        this.filePath = filePath;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.primaryPowerOfAttorney = primaryPowerOfAttorney;
        this.fileContents = fileContents;
    }

    public PowerOfAttorney(int id, int holderId, String title, String filePath, String type, String startDate, String endDate, boolean primaryPowerOfAttorney) {
        this.id = id;
        this.holderId = holderId;
        this.title = title;
        this.filePath = filePath;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.primaryPowerOfAttorney = primaryPowerOfAttorney;
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
     * @param holderId the holderId to set
     */
    public void setHolderId(int holderId) {
        this.holderId = holderId;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the filePath
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * @param filePath the filePath to set
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
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
     * @return the primaryPowerOfAttorney
     */
    public boolean isPrimaryPowerOfAttorney() {
        return primaryPowerOfAttorney;
    }

    /**
     * @param primaryPowerOfAttorney the primaryPowerOfAttorney to set
     */
    public void setPrimaryPowerOfAttorney(boolean primaryPowerOfAttorney) {
        this.primaryPowerOfAttorney = primaryPowerOfAttorney;
    }

    public String getFileContents() {
        return fileContents;
    }

    public void setFileContents(String fileContents) {
        this.fileContents = fileContents;
    }

}
