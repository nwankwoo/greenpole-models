/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.security;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Akinwale Agbaje
 * The requirement functions the user has under their profile.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"name","description"})
public class RequirementFunction implements Serializable {
    @XmlTransient
    private int id;
    @XmlElement
    private String name;
    @XmlElement
    private String description;

    public RequirementFunction() {
    }

    /**
     * Used to query / edit an existing requirement function.
     * Parameters are self-explanatory.
     * @param id
     * @param name
     * @param description 
     */
    public RequirementFunction(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * Used to create a new requirement function.
     * Parameters are self-explanatory.
     * @param name
     * @param description 
     */
    public RequirementFunction(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public RequirementFunction(int id) {
        this.id = id;
    }

    /**
     * Gets the requirement function's unique identification.
     * @return the requirement function's unique identification
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the requirement function's unique identification.
     * @param id the requirement function's unique identification
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the requirement function's name.
     * @return the requirement function's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the requirement function's name.
     * @param name the requirement function's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the requirement function's description.
     * @return the requirement function's description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the requirement function's description.
     * @param description the requirement function's description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "RequirementFunction{" + "id=" + id + ", name=" + name + ", description=" + description + '}';
    }
}
