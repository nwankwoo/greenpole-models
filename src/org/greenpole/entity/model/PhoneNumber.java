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
@XmlType(propOrder = {"entityId","primaryPhoneNumber","phoneNumber"})
public class PhoneNumber implements Serializable {
    @XmlElement(name = "id")
    private int entityId;
    @XmlElement
    private String phoneNumber;
    @XmlAttribute
    private boolean primaryPhoneNumber;

    /**
     * Initialises the client entity phone number object.
     */
    public PhoneNumber() {
    }

    /**
     * Collects all values for the client entity phone number.
     * @param phoneNumber the entity's phone number
     * @param primaryPhoneNumber the phone number's primary status
     */
    public PhoneNumber(String phoneNumber, boolean primaryPhoneNumber) {
        this.phoneNumber = phoneNumber;
        this.primaryPhoneNumber = primaryPhoneNumber;
    }

    /**
     * Collects all values for the client entity phone number.
     * This constructor should be used when trying to submit a client entity phone number for
     * editing, as it includes the {@link #entityId} variable, which is not used when
     * creating a client entity phone number.
     * @param entityId the entity's id
     * @param phoneNumber the entity's phone number
     * @param primaryPhoneNumber the phone number's primary status
     */
    public PhoneNumber(int entityId, String phoneNumber, boolean primaryPhoneNumber) {
        this.entityId = entityId;
        this.phoneNumber = phoneNumber;
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
    
}