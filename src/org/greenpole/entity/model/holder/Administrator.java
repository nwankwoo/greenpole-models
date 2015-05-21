/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model.holder;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import org.greenpole.entity.model.Address;
import org.greenpole.entity.model.EmailAddress;
import org.greenpole.entity.model.PhoneNumber;

/**
 *
 * @author Yusuf Samsudeen Babashola (Algorithm)
 */
@XmlRootElement
@XmlSeeAlso({EmailAddress.class, PhoneNumber.class})
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"firstName", "middleName", "lastName", "dob", "pryAddress",
    "residentialAddress", "postalAddress", "emailAddresses", "phoneNumbers"})
public class Administrator implements Serializable {
    @XmlTransient
    private int id;
    @XmlElement
    private String firstName;
    @XmlElement
    private String middleName;
    @XmlElement
    private String lastName;
    @XmlElement
    private String dob;
    @XmlElement
    private String pryAddress;
    @XmlElement
    private Address residentialAddress;
    @XmlElement
    private Address postalAddress;
    @XmlElementWrapper(name = "emailAddresses")
    private List <EmailAddress> emailAddresses;
    @XmlElementWrapper(name = "phoneNumbers")
    private List <PhoneNumber> phoneNumbers;

    public Administrator() {
    }

    /**
     * For creation of new Administrator.
     * Parameters are self-explanatory.
     * @param firstName
     * @param middleName
     * @param lastName
     * @param dob
     * @param primaryAddress
     * @param residentialAddress
     * @param postalAddress
     * @param emailAddresses
     * @param phoneNumbers 
     */
    public Administrator(String firstName, String middleName, String lastName, String dob, String primaryAddress, Address residentialAddress, Address postalAddress, List<EmailAddress> emailAddresses, List<PhoneNumber> phoneNumbers) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dob = dob;
        this.pryAddress = primaryAddress;
        this.residentialAddress = residentialAddress;
        this.postalAddress = postalAddress;
        this.emailAddresses = emailAddresses;
        this.phoneNumbers = phoneNumbers;
    }

    /**
     * For query or editing existing Administrator.
     * Parameters are self-explanatory.
     * @param id
     * @param firstName
     * @param middleName
     * @param lastName
     * @param dob
     * @param primaryAddress
     * @param residentialAddress
     * @param postalAddress
     * @param emailAddresses
     * @param phoneNumbers 
     */
    public Administrator(int id, String firstName, String middleName, String lastName, String dob, String primaryAddress, Address residentialAddress, Address postalAddress, List<EmailAddress> emailAddresses, List<PhoneNumber> phoneNumbers) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dob = dob;
        this.pryAddress = primaryAddress;
        this.residentialAddress = residentialAddress;
        this.postalAddress = postalAddress;
        this.emailAddresses = emailAddresses;
        this.phoneNumbers = phoneNumbers;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /*
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
    public String getPryAddress() {
        return pryAddress;
    }

    /**
     * @param pryAddress the primary address to set
     */
    public void setPryAddress(String pryAddress) {
        this.pryAddress = pryAddress;
    }

    /**
     * @return the emailAddresses
     */
    public List <EmailAddress> getEmailAddresses() {
        return emailAddresses;
    }

    /**
     * @param emailAddresses the emailAddresses to set
     */
    public void setEmailAddresses(List <EmailAddress> emailAddresses) {
        this.emailAddresses = emailAddresses;
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
