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
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"primaryEmail","emailAddress"})
public class ClientCompanyEmailAddress {
    private int clientCompanyId;
    @XmlElement
    private String emailAddress;
    @XmlAttribute
    private boolean primaryEmail;

    /**
     * Initialises the client company email address object.
     */
    public ClientCompanyEmailAddress() {
    }
    
    /**
     * Sets all data for the client company email address.
     * @param emailAddress the company's email address
     * @param primaryEmail the primary status of the company's email address
     */
    public ClientCompanyEmailAddress(String emailAddress, boolean primaryEmail) {
        this.emailAddress = emailAddress;
        this.primaryEmail = primaryEmail;
    }

    /**
     * Sets all data for the client company email address.
     * This constructor should be used when trying to submit a client company email address for
     * editing, as it includes the {@link #clientCompanyId} variable, which is not used when
     * creating a client company email address.
     * @param clientCompanyId the company's id
     * @param emailAddress the company's email address
     * @param primaryEmail the primary status of the company's email address
     */
    public ClientCompanyEmailAddress(int clientCompanyId, String emailAddress, boolean primaryEmail) {
        this.clientCompanyId = clientCompanyId;
        this.emailAddress = emailAddress;
        this.primaryEmail = primaryEmail;
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
     * Gets the company's email address.
     * @return the company's email address
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the company's email address.
     * @param emailAddress the company's email address
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Gets the primary status of the company's email address.
     * @return the primary status of the company's email address
     */
    public boolean isPrimaryEmail() {
        return primaryEmail;
    }

    /**
     * Sets the primary status of the company's email address.
     * @param primaryEmail the primary status of the company's email address
     */
    public void setPrimaryEmail(boolean primaryEmail) {
        this.primaryEmail = primaryEmail;
    }
}