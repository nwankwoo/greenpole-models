/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.tags;

/**
 *
 * @author Akin
 */
public enum TransferTypeTag {
    /**
     * The share tag for transfers involving shares.
     */
    share ("For transfers involving shares"),
    
    /**
     * The bond tag for transfers involving bonds.
     */
    bond ("For transfers involving bonds");
    
    private final String description;

    private TransferTypeTag(String description) {
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
