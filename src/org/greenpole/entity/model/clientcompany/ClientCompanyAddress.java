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
import javax.xml.bind.annotation.XmlSeeAlso;
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

    public ClientCompanyAddress() {
    }

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

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine3() {
        return addressLine3;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public String getAddressLine4() {
        return addressLine4;
    }

    public void setAddressLine4(String addressLine4) {
        this.addressLine4 = addressLine4;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isPrimaryAddress() {
        return primaryAddress;
    }

    public void setPrimaryAddress(boolean primaryAddress) {
        this.primaryAddress = primaryAddress;
    }
}
