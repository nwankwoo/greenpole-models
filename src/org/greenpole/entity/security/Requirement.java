/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.security;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Akinwale Agbaje
 * The requirements the user has under their profile.
 */
public class Requirement {
    private int id;
    private String name;
    private String description;
    private String screen;
    private Set<RequirementFunction> requirementFunctions = new HashSet<>();

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

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public Set<RequirementFunction> getRequirementFunctions() {
        return requirementFunctions;
    }

    public void setRequirementFunctions(Set<RequirementFunction> requirementFunctions) {
        this.requirementFunctions = requirementFunctions;
    }

    @Override
    public String toString() {
        return "Requirement{" + "id=" + id + ", name=" + name + ", description=" + description + ", screen=" + screen + '}';
    }
}
