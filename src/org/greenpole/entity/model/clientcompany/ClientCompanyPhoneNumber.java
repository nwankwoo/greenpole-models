/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model.clientcompany;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Yusuf Samsudeen Babashola (Algorithm) 
 * Carries information on the client company's phone numbers.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"primaryPhoneNumber","emailAddress"})
public class ClientCompanyPhoneNumber {
    @XmlElement
    private String phoneNumber;
    @XmlAttribute
    private boolean primaryPhoneNumber;

    /**
     * Initialises the client company phone number object.
     */
    public ClientCompanyPhoneNumber() {
    }

    /**
     * Collects all values for the client company phone number.
     * @param phoneNumber the company's phone number
     * @param primaryEmail the phone number's primary status
     */
    public ClientCompanyPhoneNumber(String phoneNumber, boolean primaryEmail) {
        this.phoneNumber = phoneNumber;
        this.primaryPhoneNumber = primaryEmail;
    }
    
    /**
     * Gets the client company's phone number.
     * @return the phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the client company's phone number
     * @param phoneNumber the client company's phone number
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Gets the primary status of the client company's phone number.
     * @return the primary status of the client company's phone number
     */
    public boolean isPrimaryPhoneNumber() {
        return primaryPhoneNumber;
    }

    /**
     * Sets the primary status of the client company's phone number.
     * @param primaryPhoneNumber the primary status of the client company's phone number
     */
    public void setPrimaryPhoneNumber(boolean primaryPhoneNumber) {
        this.primaryPhoneNumber = primaryPhoneNumber;
    }
    
}