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
    "typeId", "gender", "dob", "taxExempted", "merged", "pryHolder", "pryAddress", "holderPhoneNumbers",
    "holderEmailAddresses", "holderResidentialAddresses", "holderPostalAddress", "holderCompanyAccounts",
    "holderBondAccounts"})
public class Holder {

    @XmlElement
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
    @XmlTransient
    private String type;//deprecated
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
    private String primaryAddress;
    
    @XmlElementWrapper(name = "holderPhoneNumbers")
    private List<PhoneNumber> holderPhoneNumbers;
    @XmlElementWrapper(name = "holderEmailAddresses")
    private List<EmailAddress> holderEmailAddresses;
    @XmlElementWrapper(name = "holderResidentialAddresses")
    private List<Address> holderResidentialAddresses;
    @XmlElementWrapper(name = "holderPostalAddresses")
    private List<Address> holderPostalAddresses;
    @XmlElementWrapper(name = "holderCompanyAccounts")
    private List<HolderCompanyAccount> holderCompanyAccounts;
    @XmlElementWrapper(name = "holderBondAccounts")
    private List<HolderBondAccount> holderBondAccounts;
    @XmlElementWrapper(name = "administrators")
    private List<Administrator> administrators;
    
    @XmlTransient
    private Stockbroker holderStockbroker;
    @XmlTransient
    private List<HolderChanges> changes;
    
    @XmlTransient
    private List<Address> deletedAddresses;
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
        this.primaryAddress = pryAddress;
        this.holderPhoneNumbers = holderPhoneNumbers;
        this.holderEmailAddresses = holderEmailAddresses;
        this.holderResidentialAddresses = holderResidentialAddresses;
        this.holderPostalAddresses = holderPostalAddresses;
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
        this.primaryAddress = pryAddress;
        this.holderPhoneNumbers = holderPhoneNumbers;
        this.holderEmailAddresses = holderEmailAddresses;
        this.holderResidentialAddresses = holderResidentialAddresses;
        this.holderPostalAddresses = holderPostalAddresses;
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

    /**
     * @deprecated typeId should be used instead
     * @return 
     */
    public String getType() {
        return type;
    }

    /**
     * @deprecated typeId should be used instead
     * @param type 
     */
    public void setType(String type) {
        this.type = type;
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

    public String getPrimaryAddress() {
        return primaryAddress;
    }

    public void setPrimaryAddress(String primaryAddress) {
        this.primaryAddress = primaryAddress;
    }
    
    public List<PhoneNumber> getHolderPhoneNumbers() {
        return holderPhoneNumbers;
    }

    public void setHolderPhoneNumbers(List<PhoneNumber> holderPhoneNumbers) {
        this.holderPhoneNumbers = holderPhoneNumbers;
    }

    public List<Address> getHolderResidentialAddresses() {
        return holderResidentialAddresses;
    }

    public void setHolderResidentialAddresses(List<Address> holderResidentialAddresses) {
        this.holderResidentialAddresses = holderResidentialAddresses;
    }

    public List<HolderCompanyAccount> getHolderCompanyAccounts() {
        return holderCompanyAccounts;
    }

    public void setHolderCompanyAccounts(List<HolderCompanyAccount> holderCompanyAccounts) {
        this.holderCompanyAccounts = holderCompanyAccounts;
    }

    public List<HolderBondAccount> getHolderBondAccounts() {
        return holderBondAccounts;
    }

    public void setHolderBondAccounts(List<HolderBondAccount> holderBondAccounts) {
        this.holderBondAccounts = holderBondAccounts;
    }

    public List<Address> getHolderPostalAddresses() {
        return holderPostalAddresses;
    }

    public void setHolderPostalAddresses(List<Address> holderPostalAddresses) {
        this.holderPostalAddresses = holderPostalAddresses;
    }

    public List<EmailAddress> getHolderEmailAddresses() {
        return holderEmailAddresses;
    }

    public void setHolderEmailAddresses(List<EmailAddress> holderEmailAddresses) {
        this.holderEmailAddresses = holderEmailAddresses;
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

    public List<HolderChanges> getChanges() {
        return changes;
    }

    public void setChanges(List<HolderChanges> changes) {
        this.changes = changes;
    }
}
