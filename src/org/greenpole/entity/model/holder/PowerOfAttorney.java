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
import javax.xml.bind.annotation.XmlType;
import org.greenpole.entity.model.Address;

/**
 *
 * @author Akin Agbaje
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"id","holderId", "holderFirstName", "holderMiddleName",
    "holderLastName", "holderAddress", "title", "filePath", "type", "startDate",
    "endDate", "primaryPowerOfAttorney", "fileContents"})
public class PowerOfAttorney implements Serializable {

    @XmlElement
    private int id;
    @XmlElement
    private int holderId;
    @XmlElement
    private int holderFirstName;
    @XmlElement
    private int holderMiddleName;
    @XmlElement
    private int holderLastName;
    @XmlElement
    private Address holderAddress;
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
    @XmlElement
    private String fileContents;
    
    public PowerOfAttorney() {
    }

    /**
     * Used in creating new power of attorney.
     * Parameters are self-explanatory.
     * @param holderId
     * @param title
     * @param filePath
     * @param type
     * @param startDate
     * @param endDate
     * @param primaryPowerOfAttorney
     * @param fileContents 
     */
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

    /**
     * Used in querying / editing existing power of attorney.
     * Parameters are self-explanatory.
     * @param id
     * @param holderId
     * @param title
     * @param filePath
     * @param type
     * @param startDate
     * @param endDate
     * @param primaryPowerOfAttorney 
     */
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

    public int getHolderFirstName() {
        return holderFirstName;
    }

    public void setHolderFirstName(int holderFirstName) {
        this.holderFirstName = holderFirstName;
    }

    public int getHolderMiddleName() {
        return holderMiddleName;
    }

    public void setHolderMiddleName(int holderMiddleName) {
        this.holderMiddleName = holderMiddleName;
    }

    public int getHolderLastName() {
        return holderLastName;
    }

    public void setHolderLastName(int holderLastName) {
        this.holderLastName = holderLastName;
    }

    public Address getHolderAddress() {
        return holderAddress;
    }

    public void setHolderAddress(Address holderAddress) {
        this.holderAddress = holderAddress;
    }

}
