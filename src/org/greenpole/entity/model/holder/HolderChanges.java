/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model.holder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Akin
 * Utilised in carrying holder changes between the front-end and the back-end.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"initialForm", "currentForm", "changeTypeId", "changeDate", "lastName"})
public class HolderChanges {
    @XmlTransient
    private int id;
    @XmlElement
    private String initialForm;
    @XmlElement
    private String currentForm;
    @XmlElement
    private int changeTypeId;
    @XmlElement
    private String changeDate;
    @XmlTransient
    private int holderId;

    public HolderChanges() {
    }

    public HolderChanges(String initialForm, String currentForm, int changeTypeId, String changeDate, int holderId) {
        this.initialForm = initialForm;
        this.currentForm = currentForm;
        this.changeTypeId = changeTypeId;
        this.changeDate = changeDate;
        this.holderId = holderId;
    }

    public HolderChanges(int id, String initialForm, String currentForm, int changeTypeId, String changeDate, int holderId) {
        this.id = id;
        this.initialForm = initialForm;
        this.currentForm = currentForm;
        this.changeTypeId = changeTypeId;
        this.changeDate = changeDate;
        this.holderId = holderId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInitialForm() {
        return initialForm;
    }

    public void setInitialForm(String initialForm) {
        this.initialForm = initialForm;
    }

    public String getCurrentForm() {
        return currentForm;
    }

    public void setCurrentForm(String currentForm) {
        this.currentForm = currentForm;
    }

    public int getChangeTypeId() {
        return changeTypeId;
    }

    public void setChangeTypeId(int changeTypeId) {
        this.changeTypeId = changeTypeId;
    }

    public String getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(String changeDate) {
        this.changeDate = changeDate;
    }

    public int getHolderId() {
        return holderId;
    }

    public void setHolderId(int holderId) {
        this.holderId = holderId;
    }
}
