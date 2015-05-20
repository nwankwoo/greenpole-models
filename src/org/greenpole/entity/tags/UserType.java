/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.tags;

/**
 *
 * @author Akinwale Agbaje
 * The acceptable list of user types.
 */
public enum UserType {
    /**
     * The user type for normal users.
     */
    Normal ("For normal users"),
    
    /**
     * The user type for users who authorise creations and changes.
     */
    Authoriser ("For users who authorise creations and changes"),
    
    /**
     * The user type for system caretakers.
     */
    Administrator ("For system caretakers");
    
    private final String description;

    private UserType(String description) {
        this.description = description;
    }
    
    /**
     * Gets the description of the defined notification message tag.
     * @return the notification message tag
     */
    public String getDescription() {
        return description;
    }
}
