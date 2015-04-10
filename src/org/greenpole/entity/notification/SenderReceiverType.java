/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.notification;

/**
 *
 * @author Akinwale Agbaje
 * The acceptable list of sender / receiver types.
 */
public enum SenderReceiverType {

    /**
     * The sender / receiver type for internal users of the system.
     */
    Internal ("For senders / receivers who are users of the system"),

    /**
     * The sender / receiver type for external users of the system.
     */
    External ("For senders / receivers who are not users of the system");
    
    private final String description;

    private SenderReceiverType(String description) {
        this.description = description;
    }

    /**
     * Gets the description of the sender / receiver type.
     * @return the description of the sender / receiver type
     */
    public String getDescription() {
        return description;
    }
}
