/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.security;

import java.io.Serializable;

/**
 *
 * @author Akinwale Agbaje
 * The requirement functions the user has under their profile.
 */
public class RequirementFunction implements Serializable {
    private int id;
    private String name;
    private String description;

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
