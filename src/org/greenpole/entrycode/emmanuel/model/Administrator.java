/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entrycode.emmanuel.model;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author user
 */
@XmlRootElement
@XmlSeeAlso({AdministratorEmailAddress.class,AdministratorPhoneNumber.class,AdministratorResidentialAddress.class})
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"firstName","middleName","lastName","emailAddress","phoneNumber","residentialAddress","holder"})
public class Administrator implements Serializable {
    @XmlElement
    private int id;
    @XmlElement
     private String firstName;
    @XmlElement
     private String middleName;
    @XmlElement
     private String lastName;
    @XmlElementWrapper(name = "emailAddress")
    private List <AdministratorEmailAddress> emailAddress;
    @XmlElementWrapper(name = "phoneNumber")
    private List <AdministratorPhoneNumber> phoneNumber;
    @XmlElementWrapper(name = "residentialAddress")
    private List <AdministratorResidentialAddress> residentialAddress;
    @XmlElementWrapper(name = "holder")
    private List <Holder> holder;
    public Administrator(){}
    public Administrator(int id, String firstName, String middleName, String lastName, List<AdministratorEmailAddress> emailAddress, List<AdministratorPhoneNumber> phoneNumber, List<AdministratorResidentialAddress> residentialAddress, List<Holder> holder) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.residentialAddress = residentialAddress;
        this.holder = holder;
    }

    public Administrator(String firstName, String middleName, String lastName, List<AdministratorEmailAddress> emailAddress, List<AdministratorPhoneNumber> phoneNumber, List<AdministratorResidentialAddress> residentialAddress, List<Holder> holder) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.residentialAddress = residentialAddress;
        this.holder = holder;
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

    public List <AdministratorEmailAddress> getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(List <AdministratorEmailAddress> emailAddress) {
        this.emailAddress = emailAddress;
    }

    public List <AdministratorPhoneNumber> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(List <AdministratorPhoneNumber> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List <AdministratorResidentialAddress> getResidentialAddress() {
        return residentialAddress;
    }

    public void setResidentialAddress(List <AdministratorResidentialAddress> residentialAddress) {
        this.residentialAddress = residentialAddress;
    }

    /**
     * @return the holder
     */
    public List <Holder> getHolder() {
        return holder;
    }

    /**
     * @param holder the holder to set
     */
    public void setHolder(List <Holder> holder) {
        this.holder = holder;
    }
    
}
