/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entrycode.emmanuel.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author user
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"primaryAddress","addressLine1", "addressLine2", "addressLine3", "addressLine4", "state","city", "country","postCode"})
public class AdministratorResidentialAddress {

    @XmlElement
    private int administratorId;
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
    private boolean primaryAddress;
    @XmlElement
    private String state;
    @XmlElement
    private String country;

    public AdministratorResidentialAddress() {
    }

    public AdministratorResidentialAddress(int administratorId, String addressLine1, String state, String country) {
        this.administratorId = administratorId;
        this.addressLine1 = addressLine1;
        this.state = state;
        this.country = country;
    }

    public AdministratorResidentialAddress(String addressLine1, String state, String country) {
        this.addressLine1 = addressLine1;
        this.state = state;
        this.country = country;
    }

    public AdministratorResidentialAddress(int administratorId, String addressLine1, String addressLine2, String addressLine3, String addressLine4, String postCode, String city, boolean primaryAddress, String state, String country) {
        this.administratorId = administratorId;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
        this.addressLine4 = addressLine4;
        this.postCode = postCode;
        this.city = city;
        this.primaryAddress = primaryAddress;
        this.state = state;
        this.country = country;
    }

    public AdministratorResidentialAddress(String addressLine1, String addressLine2, String addressLine3, String addressLine4, String postCode, String city, boolean primaryAddress, String state, String country) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
        this.addressLine4 = addressLine4;
        this.postCode = postCode;
        this.city = city;
        this.primaryAddress = primaryAddress;
        this.state = state;
        this.country = country;
    }

    

    /**
     * @return the administratorId
     */
    public int getAdministratorId() {
        return administratorId;
    }

    /**
     * @param administratorId the administratorId to set
     */
    public void setAdministratorId(int administratorId) {
        this.administratorId = administratorId;
    }

    /**
     * @return the addressLine1
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * @param addressLine1 the addressLine1 to set
     */
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the addressLine2
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * @param addressLine2 the addressLine2 to set
     */
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    /**
     * @return the addressLine3
     */
    public String getAddressLine3() {
        return addressLine3;
    }

    /**
     * @param addressLine3 the addressLine3 to set
     */
    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    /**
     * @return the addressLine4
     */
    public String getAddressLine4() {
        return addressLine4;
    }

    /**
     * @param addressLine4 the addressLine4 to set
     */
    public void setAddressLine4(String addressLine4) {
        this.addressLine4 = addressLine4;
    }

    /**
     * @return the postCode
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * @param postCode the postCode to set
     */
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the primaryAddress
     */
    public boolean isPrimaryAddress() {
        return primaryAddress;
    }

    /**
     * @param primaryAddress the primaryAddress to set
     */
    public void setPrimaryAddress(boolean primaryAddress) {
        this.primaryAddress = primaryAddress;
    }

}