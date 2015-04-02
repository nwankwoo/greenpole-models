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
 * The groups the user has under their profile.
 */
public class Group implements Serializable {
    private int id;
    private String name;
    private String description;
    private Map<String, Requirement> requirements = new HashMap<>(0);

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

    public Map<String, Requirement> getRequirements() {
        return requirements;
    }

    public void setRequirements(Map<String, Requirement> requirements) {
        this.requirements = requirements;
    }

    @Override
    public String toString() {
        return "Group{" + "id=" + id + ", name=" + name + ", description=" + description + '}';
    }
}
