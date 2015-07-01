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
import javax.xml.bind.annotation.XmlType;
import org.greenpole.entity.model.Address;
import org.greenpole.entity.model.EmailAddress;
import org.greenpole.entity.model.PhoneNumber;
import org.greenpole.entity.model.stockbroker.Stockbroker;

/**
 *
 * @author Jephthah Sadare
 */
@XmlRootElement
@XmlSeeAlso({HolderBondAccount.class, HolderCompanyAccount.class, EmailAddress.class, PhoneNumber.class, Address.class})
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"holderId","holderAcctNumber", "chn", "firstName", "middleName", "lastName",
    "typeId", "gender", "maritalStatus", "occupation", "religion", "stateOfOrigin", "lga", 
    "dob", "taxExempted", "merged", "pryHolder", "pryAddress", "addressPrimary",
    "phoneNumbers", "emailAddresses", "residentialAddresses", "postalAddresses", "companyAccounts",
    "bondAccounts", "administrators","holderStockbroker","changes","deletedPostalAddresses",
    "deletedResidentialAddresses","deletedEmailAddresses","deletedPhoneNumbers"})
public class Holder implements Serializable {

    @XmlElement(name = "id")
    private int holderId;
    @XmlElement
    private int holderAcctNumber;
    @XmlElement
    private String chn;
    @XmlElement
    private String firstName;
    @XmlElement
    private String middleName;
    @XmlElement
    private String lastName;
    @XmlElement
    private int typeId;
    @XmlElement
    private String gender;
    @XmlElement
    private String dob;
    @XmlElement
    private String maritalStatus;
    @XmlElement
    private String occupation;
    @XmlElement
    private String religion;
    @XmlElement
    private String stateOfOrigin;
    @XmlElement
    private String lga;
    @XmlElement
    private boolean taxExempted;
    @XmlElement
    private boolean merged;
    @XmlElement
    private boolean pryHolder;
    @XmlElement
    private String pryAddress;
    @XmlElement
    private Address addressPrimary;
    
    @XmlElementWrapper(name = "phoneNumbers")
    private List<PhoneNumber> phoneNumbers;
    @XmlElementWrapper(name = "emailAddresses")
    private List<EmailAddress> emailAddresses;
    @XmlElementWrapper(name = "residentialAddresses")
    private List<Address> residentialAddresses;
    @XmlElementWrapper(name = "postalAddresses")
    private List<Address> postalAddresses;
    @XmlElementWrapper(name = "companyAccounts")
    private List<HolderCompanyAccount> companyAccounts;
    @XmlElementWrapper(name = "bondAccounts")
    private List<HolderBondAccount> bondAccounts;
    @XmlElementWrapper(name = "administrators")
    private List<Administrator> administrators;
    
    @XmlElement
    private Stockbroker holderStockbroker;
    @XmlElementWrapper(name = "changes")
    private List<HolderChanges> changes;
    
    @XmlElementWrapper(name = "deletedPostalAddresses")
    private List<Address> deletedPostalAddresses;
    @XmlElementWrapper(name = "deletedResidentialAddresses")
    private List<Address> deletedResidentialAddresses;
    @XmlElementWrapper(name = "deletedEmailAddresses")
    private List<EmailAddress> deletedEmailAddresses;
    @XmlElementWrapper(name = "deletedPhoneNumbers")
    private List<PhoneNumber> deletedPhoneNumbers;
    
    public Holder(){}
        
    public int getHolderId() {
        return holderId;
    }

    public void setHolderId(int holderId) {
        this.holderId = holderId;
    }

    public int getHolderAcctNumber() {
        return holderAcctNumber;
    }

    public void setHolderAcctNumber(int holderAcctNumber) {
        this.holderAcctNumber = holderAcctNumber;
    }

    public String getChn() {
        return chn;
    }

    public void setChn(String chn) {
        this.chn = chn;
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

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getStateOfOrigin() {
        return stateOfOrigin;
    }

    public void setStateOfOrigin(String stateOfOrigin) {
        this.stateOfOrigin = stateOfOrigin;
    }

    public String getLga() {
        return lga;
    }

    public void setLga(String lga) {
        this.lga = lga;
    }

    public boolean isTaxExempted() {
        return taxExempted;
    }

    public void setTaxExempted(boolean taxExempted) {
        this.taxExempted = taxExempted;
    }

    public boolean isMerged() {
        return merged;
    }

    public void setMerged(boolean merged) {
        this.merged = merged;
    }

    public boolean isPryHolder() {
        return pryHolder;
    }

    public void setPryHolder(boolean pryHolder) {
        this.pryHolder = pryHolder;
    }

    public String getPryAddress() {
        return pryAddress;
    }

    public void setPryAddress(String pryAddress) {
        this.pryAddress = pryAddress;
    }
    
    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public List<Address> getResidentialAddresses() {
        return residentialAddresses;
    }

    public void setResidentialAddresses(List<Address> residentialAddresses) {
        this.residentialAddresses = residentialAddresses;
    }

    public List<HolderCompanyAccount> getCompanyAccounts() {
        return companyAccounts;
    }

    public void setCompanyAccounts(List<HolderCompanyAccount> companyAccounts) {
        this.companyAccounts = companyAccounts;
    }

    public List<HolderBondAccount> getBondAccounts() {
        return bondAccounts;
    }

    public void setBondAccounts(List<HolderBondAccount> bondAccounts) {
        this.bondAccounts = bondAccounts;
    }

    public List<Address> getPostalAddresses() {
        return postalAddresses;
    }

    public void setPostalAddresses(List<Address> postalAddresses) {
        this.postalAddresses = postalAddresses;
    }

    public List<EmailAddress> getEmailAddresses() {
        return emailAddresses;
    }

    public void setEmailAddresses(List<EmailAddress> emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    /**
     * @return the holderStockbroker
     */
    public Stockbroker getHolderStockbroker() {
        return holderStockbroker;
    }

    /**
     * @param holderStockbroker the holderStockbroker to set
     */
    public void setHolderStockbroker(Stockbroker holderStockbroker) {
        this.holderStockbroker = holderStockbroker;
    }

    /**
     * @return the administrators
     */
    public List<Administrator> getAdministrators() {
        return administrators;
    }

    /**
     * @param administrators the administrators to set
     */
    public void setAdministrators(List<Administrator> administrators) {
        this.administrators = administrators;
    }

    public List<Address> getDeletedPostalAddresses() {
        return deletedPostalAddresses;
    }

    public void setDeletedPostalAddresses(List<Address> deletedPostalAddresses) {
        this.deletedPostalAddresses = deletedPostalAddresses;
    }

    public List<Address> getDeletedResidentialAddresses() {
        return deletedResidentialAddresses;
    }

    public void setDeletedResidentialAddresses(List<Address> deletedResidentialAddresses) {
        this.deletedResidentialAddresses = deletedResidentialAddresses;
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

    public List<HolderChanges> getChanges() {
        return changes;
    }

    public void setChanges(List<HolderChanges> changes) {
        this.changes = changes;
    }

    public Address getAddressPrimary() {
        return addressPrimary;
    }

    public void setAddressPrimary(Address addressPrimary) {
        this.addressPrimary = addressPrimary;
    }
}
