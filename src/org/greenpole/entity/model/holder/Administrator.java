/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model.holder;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.greenpole.entity.model.Address;
import org.greenpole.entity.model.EmailAddress;
import org.greenpole.entity.model.PhoneNumber;

/**
 *
 * @author Jephthah Sadare
 */
@XmlRootElement
@XmlSeeAlso({HolderBondAccount.class, HolderCompanyAccount.class, EmailAddress.class, PhoneNumber.class, Address.class})
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"firstName", "middleName", "lastName", "administratorPhoneNumbers",
    "administratorResidentialAddresses", "holders", "administratorEmailAddresses", "administratorPostalAddresses"})

public class Administrator {
    
    @XmlElement
    private int id;
    @XmlElement
    private String firstName;
    @XmlElement
    private String middleName;
    @XmlElement
    private String lastName;
    @XmlElementWrapper(name = "administratorPhoneNumbers")
    private List<PhoneNumber> administratorPhoneNumbers;
    @XmlElement
    private Address administratorResidentialAddress;
    @XmlElementWrapper(name = "holders")
    private List<Holder> holders;
    @XmlElementWrapper(name = "administratorEmailAddresses")
    private List<EmailAddress> administratorEmailAddresses;
    @XmlElement
    private Address administratorPostalAddress;

    public Administrator(int id, String firstName, String middleName, String lastName, List<PhoneNumber> administratorPhoneNumbers, Address administratorResidentialAddress, List<Holder> holders, List<EmailAddress> administratorEmailAddresses, Address administratorPostalAddress) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.administratorPhoneNumbers = administratorPhoneNumbers;
        this.administratorResidentialAddress = administratorResidentialAddress;
        this.holders = holders;
        this.administratorEmailAddresses = administratorEmailAddresses;
        this.administratorPostalAddress = administratorPostalAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<PhoneNumber> getAdministratorPhoneNumbers() {
        return administratorPhoneNumbers;
    }

    public void setAdministratorPhoneNumbers(List<PhoneNumber> administratorPhoneNumbers) {
        this.administratorPhoneNumbers = administratorPhoneNumbers;
    }

    public Address getAdministratorResidentialAddress() {
        return administratorResidentialAddress;
    }

    public void setAdministratorResidentialAddress(Address administratorResidentialAddress) {
        this.administratorResidentialAddress = administratorResidentialAddress;
    }

    public List<Holder> getHolders() {
        return holders;
    }

    public void setHolders(List<Holder> holders) {
        this.holders = holders;
    }

    public List<EmailAddress> getAdministratorEmailAddresses() {
        return administratorEmailAddresses;
    }

    public void setAdministratorEmailAddresses(List<EmailAddress> administratorEmailAddresses) {
        this.administratorEmailAddresses = administratorEmailAddresses;
    }

    public Address getAdministratorPostalAddress() {
        return administratorPostalAddress;
    }

    public void setAdministratorPostalAddress(Address administratorPostalAddress) {
        this.administratorPostalAddress = administratorPostalAddress;
    }

    
}
