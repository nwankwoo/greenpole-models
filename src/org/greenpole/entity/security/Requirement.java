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
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Akinwale Agbaje
 * The requirements the user has under their profile.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"name","description","viewType","model",
    "screen","requirementFunctions"})
public class Requirement implements Serializable {
    @XmlTransient
    private int id;
    @XmlElement
    private String name;
    @XmlElement
    private String description;
    @XmlElement
    private String viewType;
    @XmlElement
    private String model;
    @XmlElement
    private String screen;
    @XmlElementWrapper(name = "requirementFunctions")
    private Map<String, RequirementFunction> requirementFunctions = new HashMap<>();

    public Requirement() {
    }

    /**
     * Used to edit / query an existing requirement.
     * Parameters are self-explanatory.
     * @param id
     * @param name
     * @param description
     * @param viewType
     * @param model
     * @param screen 
     */
    public Requirement(int id, String name, String description, String viewType, String model, String screen) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.viewType = viewType;
        this.model = model;
        this.screen = screen;
    }

    /**
     * Used to create a new requirement.
     * Parameters are self-explanatory.
     * @param name
     * @param description
     * @param viewType
     * @param model
     * @param screen 
     */
    public Requirement(String name, String description, String viewType, String model, String screen) {
        this.name = name;
        this.description = description;
        this.viewType = viewType;
        this.model = model;
        this.screen = screen;
    }

    /**
     * Gets the requirement's unique identification.
     * @return the requirement's unique identification
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the requirement's unique identification.
     * @param id the requirement's unique identification
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the requirement's name.
     * @return the requirement's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the requirement's name.
     * @param name the requirement's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the requirement's description.
     * @return the requirement's description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the requirement's description.
     * @param description the requirement's description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the requirement's view type.
     * @return the requirement's view type
     */
    public String getViewType() {
        return viewType;
    }

    /**
     * Sets the requirement's view type.
     * @param viewType the requirement's view type
     */
    public void setViewType(String viewType) {
        this.viewType = viewType;
    }

    /**
     * Gets the requirement's model.
     * @return the requirement's model
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the requirement's model.
     * The requirement's model is a full path of the java pojo attached to the
     * requirement.
     * @param model the requirement's model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Gets the requirement's screen.
     * @return the requirement's screen
     */
    public String getScreen() {
        return screen;
    }

    /**
     * Gets the requirement's screen.
     * The requirement's screen is the name of the view attached to the requirement.
     * @param screen the requirement's screen
     */
    public void setScreen(String screen) {
        this.screen = screen;
    }
    
    /**
     * Gets the requirement's functions.
     * @return the requirement's functions
     */
    public Map<String, RequirementFunction> getRequirementFunctions() {
        return requirementFunctions;
    }

    /**
     * Sets the requirement's functions.
     * @param requirementFunctions the requirement's functions.
     */
    public void setRequirementFunctions(Map<String, RequirementFunction> requirementFunctions) {
        this.requirementFunctions = requirementFunctions;
    }

    @Override
    public String toString() {
        return "Requirement{" + "id=" + id + ", name=" + name + ", description=" + description + ", screen=" + screen + '}';
    }
}
