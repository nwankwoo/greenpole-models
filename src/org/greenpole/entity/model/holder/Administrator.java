/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model.holder;

import java.util.List;
import org.greenpole.entity.model.Address;
import org.greenpole.entity.model.EmailAddress;
import org.greenpole.entity.model.PhoneNumber;

/**
 *
 * @author Yusuf Samsudeen Babashola (Algorithm)
 */
public class Administrator {
    private String firstName;
    private String middleName;
    private String lastName;
    private String dob;
    private String primaryAddress;
    private List <EmailAddress> emailAddress;
    private List <PhoneNumber> phoneNumbers;
    private Address residentialAddress;
    private Address postalAddress;

    public Administrator() {
    }

    public Administrator(String firstName, String middleName, String lastName, String dob, String primaryAddress, List<EmailAddress> emailAddress, List<PhoneNumber> phoneNumbers, Address residentialAddress, Address postalAddress) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dob = dob;
        this.primaryAddress = primaryAddress;
        this.emailAddress = emailAddress;
        this.phoneNumbers = phoneNumbers;
        this.residentialAddress = residentialAddress;
        this.postalAddress = postalAddress;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the middleName
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * @param middleName the middleName to set
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the primary address
     */
    public String getPrimaryAddress() {
        return primaryAddress;
    }

    /**
     * @param primaryAddress the primary address to set
     */
    public void setPrimaryAddress(String primaryAddress) {
        this.primaryAddress = primaryAddress;
    }

    /**
     * @return the emailAddress
     */
    public List <EmailAddress> getEmailAddress() {
        return emailAddress;
    }

    /**
     * @param emailAddress the emailAddress to set
     */
    public void setEmailAddress(List <EmailAddress> emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * @return the phoneNumbers
     */
    public List <PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    /**
     * @param phoneNumbers the phoneNumbers to set
     */
    public void setPhoneNumbers(List <PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    /**
     * @return the residentialAddress
     */
    public Address getResidentialAddress() {
        return residentialAddress;
    }

    /**
     * @param residentialAddress the residentialAddress to set
     */
    public void setResidentialAddress(Address residentialAddress) {
        this.residentialAddress = residentialAddress;
    }

    /**
     * @return the postalAddress
     */
    public Address getPostalAddress() {
        return postalAddress;
    }

    /**
     * @param postalAddress the postalAddress to set
     */
    public void setPostalAddress(Address postalAddress) {
        this.postalAddress = postalAddress;
    }
    
    
    
}
