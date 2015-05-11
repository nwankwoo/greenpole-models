/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model;

/**
 *
 * @author Akin
 */
public enum AddressTag {
    residential ("for residential primary address"),
    postal ("for postal primary address");
    
    private final String description;

    private AddressTag(String description) {
        this.description = description;
    }
    
    /**
     * Gets the description of the defined notification message tag.
     * @return the description of transfer type tag
     */
    public String getDescription() {
        return description;
    }
}
