/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model.clientcompany;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Akinwale Agbaje
 * The client company model, utilised by the front-end and middle-tier in
 * storing and retrieving client company information.
 */
@XmlRootElement
@XmlSeeAlso({ClientCompanyAddress.class,ClientCompanyEmailAddress.class,ClientCompanyPhoneNumber.class})
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"name","code","nseSector","ceo","secretary","addresses","emailAddresses","phoneNumbers","depositoryId","depositoryName","valid"})
public class ClientCompany implements Serializable {
    @XmlElement
    private String name;
    @XmlElement
    private String code;
    @XmlElement
    private String nseSector;
    @XmlElement
    private String ceo;
    @XmlElement
    private String secretary;
    @XmlElementWrapper(name = "addresses")
    private List <ClientCompanyAddress> addresses ;
    @XmlElement
    private String depositoryName;
    @XmlElement
    private int depositoryId;
    @XmlElement
    private boolean valid;
    @XmlElementWrapper(name = "emailAddresses")
    private List <ClientCompanyEmailAddress> emailAddresses ;
    @XmlElementWrapper(name = "phoneNumbers")
    private List <ClientCompanyPhoneNumber> phoneNumbers ;

    /**
     * Initialises client company object.
     */
   public ClientCompany() {
    }

    /**
     * Collects all values for the client company.
     * @param name the company's name
     * @param code the company's code
     * @param nseSector the NSE Sector the company belongs to
     * @param ceo the company's CEO
     * @param secretary the company's secretary
     * @param addresses the company's addresses
     * @param emailAddresses the company's email addresses
     * @param phoneNumbers the company's phone numbers
     * @param depositoryName the company's depository
     * @param depositoryId the depository's unique identification
     * @param valid the company's valid status
     */
    public ClientCompany(String name, String code, String nseSector, String ceo, String secretary, List addresses, List emailAddresses, List phoneNumbers, String depositoryName, int depositoryId, boolean valid) {
        this.name = name;
        this.code = code;
        this.nseSector = nseSector;
        this.ceo = ceo;
        this.secretary = secretary;
        this.addresses = addresses;
        this.emailAddresses = emailAddresses;
        this.phoneNumbers = phoneNumbers;
        this.depositoryName = depositoryName;
        this.depositoryId = depositoryId;
        this.valid = valid;
    }

  
    @Override
    public String toString() {
        return "ClientCompany{" + "name=" + getName() + ", code=" + getCode() + ", nseSector=" + getNseSector() + ", ceo=" + getCeo() + ", secretary=" + getSecretary() + ", address=" + getAddresses() + ", depositoryName=" + getDepositoryName() + ", depositoryId=" + getDepositoryId() + ", valid=" + isValid() + '}';
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the nseSector
     */
    public String getNseSector() {
        return nseSector;
    }

    /**
     * @param nseSector the nseSector to set
     */
    public void setNseSector(String nseSector) {
        this.nseSector = nseSector;
    }

    /**
     * @return the ceo
     */
    public String getCeo() {
        return ceo;
    }

    /**
     * @param ceo the ceo to set
     */
    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    /**
     * @return the secretary
     */
    public String getSecretary() {
        return secretary;
    }

    /**
     * @param secretary the secretary to set
     */
    public void setSecretary(String secretary) {
        this.secretary = secretary;
    }

    /**
     * @return the addresses
     */
    public List <ClientCompanyAddress> getAddresses() {
        return addresses;
    }

    /**
     * @param addresses the addresses to set
     */
    public void setAddresses(List <ClientCompanyAddress> addresses) {
        this.addresses = addresses;
    }

    /**
     * @return the depositoryName
     */
    public String getDepositoryName() {
        return depositoryName;
    }

    /**
     * @param depositoryName the depositoryName to set
     */
    public void setDepositoryName(String depositoryName) {
        this.depositoryName = depositoryName;
    }

    /**
     * @return the depositoryId
     */
    public int getDepositoryId() {
        return depositoryId;
    }

    /**
     * @param depositoryId the depositoryId to set
     */
    public void setDepositoryId(int depositoryId) {
        this.depositoryId = depositoryId;
    }

    /**
     * @return the valid
     */
    public boolean isValid() {
        return valid;
    }

    /**
     * @param valid the valid to set
     */
    public void setValid(boolean valid) {
        this.valid = valid;
    }

    /**
     * @return the emailAddresses
     */
    public List <ClientCompanyEmailAddress> getEmailAddresses() {
        return emailAddresses;
    }

    /**
     * @param emailAddresses the emailAddresses to set
     */
    public void setEmailAddresses(List <ClientCompanyEmailAddress> emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    /**
     * @return the phoneNumbers
     */
    public List <ClientCompanyPhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    /**
     * @param phoneNumbers the phoneNumbers to set
     */
    public void setPhoneNumbers(List <ClientCompanyPhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    
}
