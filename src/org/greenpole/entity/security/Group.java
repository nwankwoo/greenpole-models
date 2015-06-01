/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.security;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Akinwale Agbaje
 * The groups the user has under their profile.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"id","name","description","requirements"})
public class Group implements Serializable {
    @XmlElement
    private int id;
    @XmlElement
    private String name;
    @XmlElement
    private String description;
    @XmlElementWrapper(name = "requirements")
    private Map<String, Requirement> requirements = new HashMap<>(0);

    /**
     * Gets the group's unique identification.
     * @return the group's unique identification
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the group's unique identification.
     * @param id the group's unique identification
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the group's name.
     * @return the group's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the group's name.
     * @param name the group's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the group's description.
     * @return the group's description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the group's description.
     * @param description the group's description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the user's assigned requirements.
     * @return the user's assigned requirements
     */
    public Map<String, Requirement> getRequirements() {
        return requirements;
    }

    /**
     * Sets the user's assigned requirements.
     * @param requirements the user's assigned requirements
     */
    public void setRequirements(Map<String, Requirement> requirements) {
        this.requirements = requirements;
    }

    @Override
    public String toString() {
        return "Group{" + "id=" + id + ", name=" + name + ", description=" + description + '}';
    }
}
