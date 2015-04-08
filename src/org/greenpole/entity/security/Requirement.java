/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.security;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Akinwale Agbaje
 * The requirements the user has under their profile.
 */
public class Requirement implements Serializable {
    private int id;
    private String name;
    private String description;
    private String viewType;
    private String model;
    private String screen;
    private Map<String, RequirementFunction> requirementFunctions = new HashMap<>();

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
