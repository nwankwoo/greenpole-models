/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model.clientcompany;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Yusuf Samsudeen Babashola (Algorithm)
 * Carries the client company address.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"primaryAddress","addressLine","addressLine",
    "addressLine","addressLine","postCode","city","state","country"})
public class ClientCompanyAddress {
    private int clientCompanyId;
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
     * Initialises client company address object.
     */
    public ClientCompanyAddress() {
    }

    /**
     * Collects all data for client company address object.
     * @param addressLine1 the first address line
     * @param addressLine2 the second address line
     * @param addressLine3 the third address line
     * @param addressLine4 the fourth address line
     * @param postCode the the company's post code
     * @param city the the company's resident city
     * @param state the the company's resident state
     * @param country the the company's resident country
     * @param primaryAddress the primary status of the company's address
     */
    public ClientCompanyAddress(String addressLine1, String addressLine2, String addressLine3, 
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
     * Collects all data for client company address object.
     * This constructor should be used when trying to submit a client company address for
     * editing, as it includes the {@link #clientCompanyId} variable, which is not used when
     * creating a client company address.
     * @param clientCompanyId the client company id
     * @param addressLine1 the first address line
     * @param addressLine2 the second address line
     * @param addressLine3 the third address line
     * @param addressLine4 the fourth address line
     * @param postCode the the company's post code
     * @param city the the company's resident city
     * @param state the the company's resident state
     * @param country the the company's resident country
     * @param primaryAddress the primary status of the company's address
     */
    public ClientCompanyAddress(int clientCompanyId, String addressLine1, String addressLine2, String addressLine3, String addressLine4, String postCode, String city, String state, String country, boolean primaryAddress) {
        this.clientCompanyId = clientCompanyId;
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
     * @return the client company id
     */
    public int getClientCompanyId() {
        return clientCompanyId;
    }

    /**
     * @param clientCompanyId the client company id to set
     */
    public void setClientCompanyId(int clientCompanyId) {
        this.clientCompanyId = clientCompanyId;
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
     * Gets the company's post code.
     * @return the company's post code
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the company's post code.
     * @param postCode the company's post code
     */
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    /**
     * Gets the company's resident city.
     * @return the company's resident city
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the company's resident city.
     * @param city the company's resident city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets the company's resident state.
     * @return the company's resident state
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the company's resident state.
     * @param state the company's resident state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Gets the company's resident country.
     * @return the company's resident country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the company's resident company.
     * @param country the company's resident company
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Gets the company's primary address status.
     * @return the company's primary address status
     */
    public boolean isPrimaryAddress() {
        return primaryAddress;
    }

    /**
     * Sets the company's primary address status.
     * @param primaryAddress the company's primary address status
     */
    public void setPrimaryAddress(boolean primaryAddress) {
        this.primaryAddress = primaryAddress;
    }
}
