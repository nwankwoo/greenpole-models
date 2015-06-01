/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Yusuf Samsudeen Babashola (Algorithm)
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"entityId","primaryEmail","emailAddress"})
public class EmailAddress implements Serializable {
    @XmlElement(name = "id")
    private int entityId;
    @XmlElement
    private String emailAddress;
    @XmlAttribute
    private boolean primaryEmail;

    /**
     * Initialises the client entity email address object.
     */
    public EmailAddress() {
    }
    
    /**
     * Sets all data for the client entity email address.
     * @param emailAddress the entity's email address
     * @param primaryEmail the primary status of the entity's email address
     */
    public EmailAddress(String emailAddress, boolean primaryEmail) {
        this.emailAddress = emailAddress;
        this.primaryEmail = primaryEmail;
    }

    /**
     * Sets all data for the client entity email address.
     * This constructor should be used when trying to submit a client entity email address for
     * editing, as it includes the {@link #entityId} variable, which is not used when
     * creating a client entity email address.
     * @param entityId the entity's id
     * @param emailAddress the entity's email address
     * @param primaryEmail the primary status of the entity's email address
     */
    public EmailAddress(int entityId, String emailAddress, boolean primaryEmail) {
        this.entityId = entityId;
        this.emailAddress = emailAddress;
        this.primaryEmail = primaryEmail;
    }

    /**
     * @return the client entity id
     */
    public int getEntityId() {
        return entityId;
    }

    /**
     * @param entityId the client entity id to set
     */
    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }

    /**
     * Gets the entity's email address.
     * @return the entity's email address
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the entity's email address.
     * @param emailAddress the entity's email address
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Gets the primary status of the entity's email address.
     * @return the primary status of the entity's email address
     */
    public boolean isPrimaryEmail() {
        return primaryEmail;
    }

    /**
     * Sets the primary status of the entity's email address.
     * @param primaryEmail the primary status of the entity's email address
     */
    public void setPrimaryEmail(boolean primaryEmail) {
        this.primaryEmail = primaryEmail;
    }
}