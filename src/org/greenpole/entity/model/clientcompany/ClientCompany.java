/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model.clientcompany;

import org.greenpole.entity.model.Address;
import org.greenpole.entity.model.PhoneNumber;
import org.greenpole.entity.model.EmailAddress;
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
 * @author Akinwale Agbaje
 * The client company model, utilised by the front-end and middle-tier in
 * storing and retrieving client company information.
 */
@XmlRootElement
@XmlSeeAlso({Address.class,EmailAddress.class,PhoneNumber.class})
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"id","name","code","ceo","secretary","dateIncorp","addresses","emailAddresses",
    "phoneNumbers","nseSectorId","nseSectorName","depositoryId","depositoryName","valid",
    "clientCompanyPrimary","merged","shareUnitPrice","noShareholders","noBondholders",
    "deletedAddresses","deletedEmailAddresses","deletedPhoneNumbers"})
public class ClientCompany implements Serializable {
    
    @XmlElement
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
    @XmlElement
    private String dateIncorp;
    @XmlElementWrapper(name = "addresses")
    private List <Address> addresses;
    @XmlElementWrapper(name = "emailAddresses")
    private List <EmailAddress> emailAddresses ;
    @XmlElementWrapper(name = "phoneNumbers")
    private List <PhoneNumber> phoneNumbers;
    @XmlElement
    private int depositoryId;
    @XmlElement
    private boolean valid;
    
    @XmlElement
    private String nseSectorName;
    @XmlElement
    private String depositoryName;
    
    @XmlElement
    private int noShareholders;
    @XmlElement
    private int noBondholders;
    @XmlElement
    private double shareUnitPrice;
    
    @XmlElement
    private List<Address> deletedAddresses;
    @XmlElement
    private List<EmailAddress> deletedEmailAddresses;
    @XmlElement
    private List<PhoneNumber> deletedPhoneNumbers;
    //added by emma
    @XmlElement
    private boolean clientCompanyPrimary;
    @XmlElement
    private boolean merged;

    /**
     * Initialises client company object.
     */
    public ClientCompany() {
    }
    
    /**
     * Collects all values for the client company.
     * This constructor should be used when trying to search for a client company (in conjunction with query client company class).
     * @param name the company's name
     * @param code the company's code
     * @param nseSectorName  the NSE Sector the company belongs to
     * @param ceo the company's CEO
     * @param dateIncorp date the company was incorporated
     * @param secretary the company's secretary
     * @param addresses the company's addresses
     * @param emailAddresses the company's email addresses
     * @param phoneNumbers the company's phone numbers
     * @param depositoryName the company's depository
     * @param valid the company's valid status
     */
    public ClientCompany(String name, String code, String ceo, String secretary, String dateIncorp, List<Address> addresses, boolean valid, List<EmailAddress> emailAddresses, List<PhoneNumber> phoneNumbers, String nseSectorName, String depositoryName) {
        this.name = name;
        this.code = code;
        this.ceo = ceo;
        this.secretary = secretary;
        this.dateIncorp = dateIncorp;
        this.addresses = addresses;
        this.valid = valid;
        this.emailAddresses = emailAddresses;
        this.phoneNumbers = phoneNumbers;
        this.nseSectorName = nseSectorName;
        this.depositoryName = depositoryName;
    }

    /**
     * Collects all values for the client company.
     * This constructor should be used when trying to create a new client company.
     * @param name the company's name
     * @param code the company's code
     * @param nseSectorId the NSE Sector the company belongs to
     * @param ceo the company's CEO
     * @param secretary the company's secretary
     * @param dateIncorp date the company was incorporated
     * @param addresses the company's addresses
     * @param depositoryId the depository's unique identification
     * @param valid the company's valid status
     * @param emailAddresses the company's email addresses
     * @param phoneNumbers the company's phone numbers 
     */
    public ClientCompany(String name, String code, int nseSectorId, String ceo, String secretary, String dateIncorp, List<Address> addresses, int depositoryId, boolean valid, List<EmailAddress> emailAddresses, List<PhoneNumber> phoneNumbers) {
        this.name = name;
        this.code = code;
        this.nseSectorId = nseSectorId;
        this.ceo = ceo;
        this.secretary = secretary;
        this.dateIncorp = dateIncorp;
        this.addresses = addresses;
        this.depositoryId = depositoryId;
        this.valid = valid;
        this.emailAddresses = emailAddresses;
        this.phoneNumbers = phoneNumbers;
    }

    /**
     * Collects all values for the client company.
     * This constructor should be used when trying to submit a client company for
     * editing while wanting to delete addresses, email addresses and phone numbers at the same time, 
     * as it includes the {@link #id} variable, which is not used when creating a client company.
     * @param id the company's id
     * @param name the company's name
     * @param code the company's code
     * @param nseSectorId the NSE Sector the company belongs to
     * @param ceo the company's CEO
     * @param secretary the company's secretary
     * @param dateIncorp date the company was incorporated
     * @param addresses the company's addresses
     * @param depositoryId the depository's unique identification
     * @param valid the company's valid status
     * @param emailAddresses the company's email addresses
     * @param phoneNumbers the company's phone numbers 
     * @param deletedAddresses the company's addresses to delete
     * @param deletedEmailAddresses the company's email addresses to delete
     * @param deletedPhoneNumbers the company's phone numbers to delete
     */
    public ClientCompany(int id, String name, String code, int nseSectorId, String ceo, String secretary, String dateIncorp, List<Address> addresses, int depositoryId, boolean valid, List<EmailAddress> emailAddresses, List<PhoneNumber> phoneNumbers, List<Address> deletedAddresses, List<EmailAddress> deletedEmailAddresses, List<PhoneNumber> deletedPhoneNumbers) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.nseSectorId = nseSectorId;
        this.ceo = ceo;
        this.secretary = secretary;
        this.dateIncorp = dateIncorp;
        this.addresses = addresses;
        this.depositoryId = depositoryId;
        this.valid = valid;
        this.emailAddresses = emailAddresses;
        this.phoneNumbers = phoneNumbers;
        this.deletedAddresses = deletedAddresses;
        this.deletedEmailAddresses = deletedEmailAddresses;
        this.deletedPhoneNumbers = deletedPhoneNumbers;
    }
    
    /**
     * Basic Constructor For Client Company Used on ShareQuotation
     * and other Views
     * @param id the company's id
     * @param name the company's name
     * @param code the company's code
     * @param nseSectorName the company's NSE sector
     * @param depositoryName  the company's depository
     */
    public ClientCompany(int id, String name, String code, String nseSectorName, String depositoryName) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.nseSectorName = nseSectorName;
        this.depositoryName = depositoryName;
    }

    public ClientCompany(int id, String name, String code, int nseSectorId, String ceo, String secretary, String dateIncorp, List<Address> addresses, List<EmailAddress> emailAddresses, List<PhoneNumber> phoneNumbers, int depositoryId, boolean valid, String nseSectorName, String depositoryName, int noShareholders, int noBondholders, double shareUnitPrice, List<Address> deletedAddresses, List<EmailAddress> deletedEmailAddresses, List<PhoneNumber> deletedPhoneNumbers, boolean clientCompanyPrimary, boolean merged) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.nseSectorId = nseSectorId;
        this.ceo = ceo;
        this.secretary = secretary;
        this.dateIncorp = dateIncorp;
        this.addresses = addresses;
        this.emailAddresses = emailAddresses;
        this.phoneNumbers = phoneNumbers;
        this.depositoryId = depositoryId;
        this.valid = valid;
        this.nseSectorName = nseSectorName;
        this.depositoryName = depositoryName;
        this.noShareholders = noShareholders;
        this.noBondholders = noBondholders;
        this.shareUnitPrice = shareUnitPrice;
        this.deletedAddresses = deletedAddresses;
        this.deletedEmailAddresses = deletedEmailAddresses;
        this.deletedPhoneNumbers = deletedPhoneNumbers;
        this.clientCompanyPrimary = clientCompanyPrimary;
        this.merged = merged;
    }

   
    /**
     * Constructor for setting client company for share unit quotation upload
     * @param code the company's code
     */
    public ClientCompany(String code) {
        this.code = code;
    }

    /**
     * Constructor for editing a client company code only.
     * @param id the company's id
     * @param code the company's code
     */
    public ClientCompany(int id, String code) {
        this.id = id;
        this.code = code;
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
     * @return the nseSectorName
     */
    public String getNseSectorName() {
        return nseSectorName;
    }

    /**
     * @param nseSectorName the nseSectorName to set
     */
    public void setNseSectorName(String nseSectorName) {
        this.nseSectorName = nseSectorName;
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

    public String getDateIncorp() {
        return dateIncorp;
    }

    public void setDateIncorp(String dateIncorp) {
        this.dateIncorp = dateIncorp;
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

    public int getNseSectorId() {
        return nseSectorId;
    }

    public void setNseSectorId(int nseSectorId) {
        this.nseSectorId = nseSectorId;
    }

    public List<Address> getDeletedAddresses() {
        return deletedAddresses;
    }

    public void setDeletedAddresses(List<Address> deletedAddresses) {
        this.deletedAddresses = deletedAddresses;
    }

    public List<EmailAddress> getDeletedEmailAddresses() {
        return deletedEmailAddresses;
    }

    public void setDeletedEmailAddresses(List<EmailAddress> deletedEmailAddresses) {
        this.deletedEmailAddresses = deletedEmailAddresses;
    }

    public List<PhoneNumber> getDeletedPhoneNumbers() {
        return deletedPhoneNumbers;
    }

    public void setDeletedPhoneNumbers(List<PhoneNumber> deletedPhoneNumbers) {
        this.deletedPhoneNumbers = deletedPhoneNumbers;
    }

    public int getNoShareholders() {
        return noShareholders;
    }

    public void setNoShareholders(int noShareholders) {
        this.noShareholders = noShareholders;
    }

    public int getNoBondholders() {
        return noBondholders;
    }

    public void setNoBondholders(int noBondholders) {
        this.noBondholders = noBondholders;
    }

    public double getShareUnitPrice() {
        return shareUnitPrice;
    }

    public void setShareUnitPrice(double shareUnitPrice) {
        this.shareUnitPrice = shareUnitPrice;
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
    
}
