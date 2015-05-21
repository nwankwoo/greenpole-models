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
import org.greenpole.entity.model.stockbroker.Stockbroker;

/**
 *
 * @author Jephthah Sadare
 */
@XmlRootElement
@XmlSeeAlso({HolderBondAccount.class, HolderCompanyAccount.class, EmailAddress.class, PhoneNumber.class, Address.class})
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"holderAcctNumber", "chn", "firstName", "middleName", "lastName",
    "typeId", "gender", "dob", "taxExempted", "merged", "pryHolder", "pryAddress", "phoneNumbers",
    "emailAddresses", "residentialAddresses", "postalAddresses", "companyAccounts",
    "bondAccounts", "administrators"})
public class Holder implements Serializable {

    @XmlTransient
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
    private boolean taxExempted;
    @XmlElement
    private boolean merged;
    @XmlElement
    private boolean pryHolder;
    @XmlElement
    private String pryAddress;
    
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
    
    @XmlTransient
    private Stockbroker holderStockbroker;
    @XmlTransient
    private List<HolderChanges> changes;
    
    @XmlTransient
    private List<Address> deletedPostalAddresses;
    @XmlTransient
    private List<Address> deletedResidentialAddresses;
    @XmlTransient
    private List<EmailAddress> deletedEmailAddresses;
    @XmlTransient
    private List<PhoneNumber> deletedPhoneNumbers;
    
    public Holder(){}

    public Holder(String chn, String firstName, String middleName, String lastName, int typeId, String gender, String dob, boolean taxExempted, String pryAddress, List<PhoneNumber> holderPhoneNumbers, List<EmailAddress> holderEmailAddresses, List<Address> holderResidentialAddresses, List<Address> holderPostalAddresses) {
        this.chn = chn;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.typeId = typeId;
        this.gender = gender;
        this.dob = dob;
        this.taxExempted = taxExempted;
        this.pryAddress = pryAddress;
        this.phoneNumbers = holderPhoneNumbers;
        this.emailAddresses = holderEmailAddresses;
        this.residentialAddresses = holderResidentialAddresses;
        this.postalAddresses = holderPostalAddresses;
    }

    public Holder(int holderId, String chn, String firstName, String middleName, String lastName, int typeId, String gender, String dob, boolean taxExempted, String pryAddress, List<PhoneNumber> holderPhoneNumbers, List<EmailAddress> holderEmailAddresses, List<Address> holderResidentialAddresses, List<Address> holderPostalAddresses, List<HolderChanges> changes) {
        this.holderId = holderId;
        this.chn = chn;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.typeId = typeId;
        this.gender = gender;
        this.dob = dob;
        this.taxExempted = taxExempted;
        this.pryAddress = pryAddress;
        this.phoneNumbers = holderPhoneNumbers;
        this.emailAddresses = holderEmailAddresses;
        this.residentialAddresses = holderResidentialAddresses;
        this.postalAddresses = holderPostalAddresses;
        this.changes = changes;
    }
        
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
}
