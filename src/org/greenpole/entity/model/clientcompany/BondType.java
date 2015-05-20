/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model.clientcompany;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Akin
 * Used to convey bond type information between the front-end and the middle-tier.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"type","description"})
public class BondType implements Serializable {
    
    @XmlTransient
    private int id;
    @XmlElement
    private String type;
    @XmlElement
    private String description;

    public BondType() {
    }

    /**
     * Use to create new bond type.
     * @param type the bond type name
     * @param description the bond type description
     */
    public BondType(String type, String description) {
        this.type = type;
        this.description = description;
    }

    /**
     * Use to query / edit existing bond type
     * @param id the bond type id
     * @param type the bond type name
     * @param description the bond type description
     */
    public BondType(int id, String type, String description) {
        this.id = id;
        this.type = type;
        this.description = description;
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
    
}
