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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getViewType() {
        return viewType;
    }

    public void setViewType(String viewType) {
        this.viewType = viewType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }
    
    public Map<String, RequirementFunction> getRequirementFunctions() {
        return requirementFunctions;
    }

    public void setRequirementFunctions(Map<String, RequirementFunction> requirementFunctions) {
        this.requirementFunctions = requirementFunctions;
    }

    @Override
    public String toString() {
        return "Requirement{" + "id=" + id + ", name=" + name + ", description=" + description + ", screen=" + screen + '}';
    }
}
