/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entrycode.emmanuel.model;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import org.greenpole.entity.model.Address;
import org.greenpole.entity.model.EmailAddress;
import org.greenpole.entity.model.PhoneNumber;

/**
 *
 * @author user
 */
public class ClientCompany {
  @XmlTransient
    private int id;
    @XmlElement
    private String name;
    @XmlElement
    private String code;
    @XmlElement
    private int nseSectorId;
    @XmlElement
    private String ceo;
    @XmlElement
    private String secretary;
    @XmlElementWrapper(name = "addresses")
    private List <Address> addresses;
    @XmlElement
    private int depositoryId;
    @XmlElement
    private boolean valid;
    @XmlElement
    private boolean merged;
    @XmlElement
    private boolean clientCompanyPrimary;
    @XmlElementWrapper(name = "emailAddresses")
    private List <EmailAddress> emailAddresses ;
    @XmlElementWrapper(name = "phoneNumbers")
    private List <PhoneNumber> phoneNumbers ;

    public ClientCompany() {
    }

    public ClientCompany(int id, String name, String code, int nseSectorId, String ceo, String secretary, List<Address> addresses, int depositoryId, boolean valid, boolean merged, boolean clientCompanyPrimary, List<EmailAddress> emailAddresses, List<PhoneNumber> phoneNumbers) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.nseSectorId = nseSectorId;
        this.ceo = ceo;
        this.secretary = secretary;
        this.addresses = addresses;
        this.depositoryId = depositoryId;
        this.valid = valid;
        this.merged = merged;
        this.clientCompanyPrimary = clientCompanyPrimary;
        this.emailAddresses = emailAddresses;
        this.phoneNumbers = phoneNumbers;
    }

    public ClientCompany(String name, String code, int nseSectorId, String ceo, String secretary, List<Address> addresses, int depositoryId, boolean valid, boolean merged, boolean clientCompanyPrimary, List<EmailAddress> emailAddresses, List<PhoneNumber> phoneNumbers) {
        this.name = name;
        this.code = code;
        this.nseSectorId = nseSectorId;
        this.ceo = ceo;
        this.secretary = secretary;
        this.addresses = addresses;
        this.depositoryId = depositoryId;
        this.valid = valid;
        this.merged = merged;
        this.clientCompanyPrimary = clientCompanyPrimary;
        this.emailAddresses = emailAddresses;
        this.phoneNumbers = phoneNumbers;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the nseSectorId
     */
    public int getNseSectorId() {
        return nseSectorId;
    }

    /**
     * @param nseSectorId the nseSectorId to set
     */
    public void setNseSectorId(int nseSectorId) {
        this.nseSectorId = nseSectorId;
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
    public List <Address> getAddresses() {
        return addresses;
    }

    /**
     * @param addresses the addresses to set
     */
    public void setAddresses(List <Address> addresses) {
        this.addresses = addresses;
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
     * @return the merged
     */
    public boolean isMerged() {
        return merged;
    }

    /**
     * @param merged the merged to set
     */
    public void setMerged(boolean merged) {
        this.merged = merged;
    }

    /**
     * @return the clientCompanyPrimary
     */
    public boolean isClientCompanyPrimary() {
        return clientCompanyPrimary;
    }

    /**
     * @param clientCompanyPrimary the clientCompanyPrimary to set
     */
    public void setClientCompanyPrimary(boolean clientCompanyPrimary) {
        this.clientCompanyPrimary = clientCompanyPrimary;
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
    
}
