/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entrycode.emmanuel.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author user
 */
@XmlRootElement
@XmlSeeAlso({})
@XmlAccessorType(XmlAccessType.NONE)
public class HolderChanges {

    @XmlElement
    private int id;
    @XmlElement
    private String initialForm;
    @XmlElement
    private String currentForm;
    @XmlElement
    private String changeType;
    @XmlElement
    private String changeDate;
    @XmlElement
    private Holder holder;

    @Override
    public String toString() {
        return "HolderChanges{" + "id=" + id + ", initialForm=" + initialForm + ", currentForm=" + currentForm + ", changeType=" + changeType + ", changeDate=" + changeDate + ", holder=" + holder + '}';
    }

    public HolderChanges(int id, String initialForm, String currentForm, String changeType, String changeDate, Holder holder) {
        this.id = id;
        this.initialForm = initialForm;
        this.currentForm = currentForm;
        this.changeType = changeType;
        this.changeDate = changeDate;
        this.holder = holder;
    }

    public HolderChanges(String initialForm, String currentForm, String changeType, String changeDate, Holder holder) {
        this.initialForm = initialForm;
        this.currentForm = currentForm;
        this.changeType = changeType;
        this.changeDate = changeDate;
        this.holder = holder;
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
     * @return the initialForm
     */
    public String getInitialForm() {
        return initialForm;
    }

    /**
     * @param initialForm the initialForm to set
     */
    public void setInitialForm(String initialForm) {
        this.initialForm = initialForm;
    }

    /**
     * @return the currentForm
     */
    public String getCurrentForm() {
        return currentForm;
    }

    /**
     * @param currentForm the currentForm to set
     */
    public void setCurrentForm(String currentForm) {
        this.currentForm = currentForm;
    }

    /**
     * @return the changeType
     */
    public String getChangeType() {
        return changeType;
    }

    /**
     * @param changeType the changeType to set
     */
    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    /**
     * @return the changeDate
     */
    public String getChangeDate() {
        return changeDate;
    }

    /**
     * @param changeDate the changeDate to set
     */
    public void setChangeDate(String changeDate) {
        this.changeDate = changeDate;
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
    
}
