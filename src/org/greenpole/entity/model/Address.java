/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Yusuf Samsudeen Babashola (Algorithm)
 * Carries the client entity address.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"primaryAddress","addressLine","addressLine",
    "addressLine","addressLine","postCode","city","state","country"})
public class Address {
    private int entityId;
    @XmlElement
    private String addressLine1;
    @XmlElement
    private String addressLine2;
    @XmlElement
    private String addressLine3;
    @XmlElement
    private String addressLine4;
    @XmlElement
    private String postCode;
    @XmlElement
    private String city;
    @XmlElement
    private String state;
    @XmlElement
    private String country;
    @XmlElement
    private boolean primaryAddress;

    /**
     * Initialises client entity address object.
     */
    public Address() {
    }

    /**
     * Collects all data for client entity address object.
     * @param addressLine1 the first address line
     * @param addressLine2 the second address line
     * @param addressLine3 the third address line
     * @param addressLine4 the fourth address line
     * @param postCode the the entity's post code
     * @param city the the entity's resident city
     * @param state the the entity's resident state
     * @param country the the entity's resident country
     * @param primaryAddress the primary status of the entity's address
     */
    public Address(String addressLine1, String addressLine2, String addressLine3, 
            String addressLine4, String postCode, String city, String state, String country, boolean primaryAddress) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
        this.addressLine4 = addressLine4;
        this.postCode = postCode;
        this.city = city;
        this.state = state;
        this.country = country;
        this.primaryAddress = primaryAddress;
    }

    /**
     * Collects all data for client entity address object.
     * This constructor should be used when trying to submit a client entity address for
     * editing, as it includes the {@link #entityId} variable, which is not used when
     * creating a client entity address.
     * @param entityId the client entity id
     * @param addressLine1 the first address line
     * @param addressLine2 the second address line
     * @param addressLine3 the third address line
     * @param addressLine4 the fourth address line
     * @param postCode the the entity's post code
     * @param city the the entity's resident city
     * @param state the the entity's resident state
     * @param country the the entity's resident country
     * @param primaryAddress the primary status of the entity's address
     */
    public Address(int entityId, String addressLine1, String addressLine2, String addressLine3, String addressLine4, String postCode, String city, String state, String country, boolean primaryAddress) {
        this.entityId = entityId;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
        this.addressLine4 = addressLine4;
        this.postCode = postCode;
        this.city = city;
        this.state = state;
        this.country = country;
        this.primaryAddress = primaryAddress;
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
     * Gets the first address line.
     * @return the first address line
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the first address line.
     * @param addressLine1 the first address line
     */
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    /**
     * Gets the second address line.
     * @return the second address line
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Sets the second address line.
     * @param addressLine2 the second address line
     */
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    /**
     * Gets the third address line.
     * @return the third address line
     */
    public String getAddressLine3() {
        return addressLine3;
    }

    /**
     * Sets the third address line.
     * @param addressLine3 the third address line
     */
    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    /**
     * Gets the fourth address line.
     * @return the fourth address line
     */
    public String getAddressLine4() {
        return addressLine4;
    }

    /**
     * Sets the fourth address line.
     * @param addressLine4 the fourth address line
     */
    public void setAddressLine4(String addressLine4) {
        this.addressLine4 = addressLine4;
    }

    /**
     * Gets the entity's post code.
     * @return the entity's post code
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the entity's post code.
     * @param postCode the entity's post code
     */
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    /**
     * Gets the entity's resident city.
     * @return the entity's resident city
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the entity's resident city.
     * @param city the entity's resident city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets the entity's resident state.
     * @return the entity's resident state
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the entity's resident state.
     * @param state the entity's resident state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Gets the entity's resident country.
     * @return the entity's resident country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the entity's resident entity.
     * @param country the entity's resident entity
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Gets the entity's primary address status.
     * @return the entity's primary address status
     */
    public boolean isPrimaryAddress() {
        return primaryAddress;
    }

    /**
     * Sets the entity's primary address status.
     * @param primaryAddress the entity's primary address status
     */
    public void setPrimaryAddress(boolean primaryAddress) {
        this.primaryAddress = primaryAddress;
    }
}
