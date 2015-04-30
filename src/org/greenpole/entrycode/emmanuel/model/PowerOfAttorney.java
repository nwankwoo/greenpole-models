/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entrycode.emmanuel.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author user
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class PowerOfAttorney implements Serializable {

    @XmlElement
    private int id;
    @XmlElement
    private Holder holder;
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
    private byte[] signatureFile;
    public PowerOfAttorney() {
    }

    public PowerOfAttorney(int id, Holder holder, String title, String filePath, String type, String startDate, String endDate, byte[] signatureFile, boolean primaryPowerOfAttorney) {
        this.id = id;
        this.holder = holder;
        this.title = title;
        this.filePath = filePath;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.signatureFile = signatureFile;
        this.primaryPowerOfAttorney = primaryPowerOfAttorney;
    }

    public PowerOfAttorney(Holder holder, String title, String filePath, String type, String startDate, String endDate, byte[] signatureFile, boolean primaryPowerOfAttorney) {
        this.holder = holder;
        this.title = title;
        this.filePath = filePath;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.signatureFile = signatureFile;
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

    public byte[] getSignatureFile() {
        return signatureFile;
    }

    public void setSignatureFile(byte[] signatureFile) {
        this.signatureFile = signatureFile;
    }

}
