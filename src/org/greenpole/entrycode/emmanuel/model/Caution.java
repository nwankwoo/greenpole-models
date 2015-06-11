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
import org.greenpole.entity.model.holder.Holder;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author user
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"holder","holderId","title","description","type","active","cautionDate","uncautionDate"})
public class Caution implements Serializable {
    @XmlTransient
    private int id;
    @XmlElement
     private int holderId;
    @XmlElement
     private String title;
    @XmlElement
     private String description;
    @XmlElement
     private String type;
    @XmlElement
     private boolean active;
    @XmlElement
     private String cautionDate;
    @XmlElement
     private String uncautionDate;

    public Caution() {
    }

    public Caution(int id, int holderId, String title, String description, String type, boolean active, String cautionDate, String uncautionDate) {
        this.id = id;
        this.holderId = holderId;
        this.title = title;
        this.description = description;
        this.type = type;
        this.active = active;
        this.cautionDate = cautionDate;
        this.uncautionDate = uncautionDate;
    }

    public Caution(int holderId, String title, String description, String type, boolean active, String cautionDate, String uncautionDate) {
        this.holderId = holderId;
        this.title = title;
        this.description = description;
        this.type = type;
        this.active = active;
        this.cautionDate = cautionDate;
        this.uncautionDate = uncautionDate;
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
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
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
     * @return the active
     */
    public boolean isActive() {
        return active;
    }

    /**
     * @param active the active to set
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * @return the cautionDate
     */
    public String getCautionDate() {
        return cautionDate;
    }

    /**
     * @param cautionDate the cautionDate to set
     */
    public void setCautionDate(String cautionDate) {
        this.cautionDate = cautionDate;
    }

    /**
     * @return the uncautionDate
     */
    public String getUncautionDate() {
        return uncautionDate;
    }

    /**
     * @param uncautionDate the uncautionDate to set
     */
    public void setUncautionDate(String uncautionDate) {
        this.uncautionDate = uncautionDate;
    }

    }
