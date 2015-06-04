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
 * Carries information on the client entity's phone numbers.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"id","primaryPhoneNumber","phoneNumber","entityId"})
public class PhoneNumber implements Serializable {
    @XmlElement
    private int id;
    @XmlElement
    private String phoneNumber;
    @XmlAttribute
    private boolean primaryPhoneNumber;
    @XmlElement
    private int entityId;
    
    /**
     * Initialises the client entity phone number object.
     */
    public PhoneNumber() {
    }

    /**
     * Collects all values for the entity phone number.
     * @param phoneNumber the entity's phone number
     * @param primaryPhoneNumber the phone number's primary status
     * @param entityId the entity id
     */
    public PhoneNumber(String phoneNumber, boolean primaryPhoneNumber, int entityId) {
        this.phoneNumber = phoneNumber;
        this.primaryPhoneNumber = primaryPhoneNumber;
        this.entityId = entityId;
    }

    /**
     * Collects all values for the client entity phone number.
     * This constructor should be used when trying to submit a client entity phone number for
     * editing, as it includes the {@link #entityId} variable, which is not used when
     * creating a client entity phone number.
     * @param id the id
     * @param phoneNumber the entity's phone number
     * @param primaryPhoneNumber the phone number's primary status
     * @param entityId the entity's id
     */
    public PhoneNumber(int id, String phoneNumber, boolean primaryPhoneNumber, int entityId) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.primaryPhoneNumber = primaryPhoneNumber;
        this.entityId = entityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * Gets the client entity's phone number.
     * @return the phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the client entity's phone number
     * @param phoneNumber the client entity's phone number
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Gets the primary status of the client entity's phone number.
     * @return the primary status of the client entity's phone number
     */
    public boolean isPrimaryPhoneNumber() {
        return primaryPhoneNumber;
    }

    /**
     * Sets the primary status of the client entity's phone number.
     * @param primaryPhoneNumber the primary status of the client entity's phone number
     */
    public void setPrimaryPhoneNumber(boolean primaryPhoneNumber) {
        this.primaryPhoneNumber = primaryPhoneNumber;
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
}