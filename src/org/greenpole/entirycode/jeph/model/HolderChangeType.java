/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entirycode.jeph.model;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.greenpole.entity.model.holder.HolderChanges;

/**
 *
 * @author Jephthah Sadare
 * @version 1.0 Used by the middle-tier to capture type of holder change details
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"id", "changeType", "description", "holderChangesId",
    "holderChanges"})

public class HolderChangeType {
    
    @XmlElement
    private int id;
    @XmlElement
    private String changeType;
    @XmlElement
    private String description;
    @XmlElement
    private int holderChangesId;
    @XmlElementWrapper(name = "holderChanges")
    private List<HolderChanges> holderChanges;

    public HolderChangeType() {
    }

    /**
     * 
     * @param id 
     * @param changeType type of change which could be correction or change
     * @param description describes the change in detail
     * @param holderChangesId holder changes id
     * @param holderChanges  list of holder changes
     */
    public HolderChangeType(int id, String changeType, String description, int holderChangesId, List<HolderChanges> holderChanges) {
        this.id = id;
        this.changeType = changeType;
        this.description = description;
        this.holderChangesId = holderChangesId;
        this.holderChanges = holderChanges;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHolderChangesId() {
        return holderChangesId;
    }

    public void setHolderChangesId(int holderChangesId) {
        this.holderChangesId = holderChangesId;
    }

    public List<HolderChanges> getHolderChanges() {
        return holderChanges;
    }

    public void setHolderChanges(List<HolderChanges> holderChanges) {
        this.holderChanges = holderChanges;
    }
    
    
}
