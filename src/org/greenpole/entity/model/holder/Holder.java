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
    "type", "gender", "dob", "taxExempted", "merged", "pryHolder", "pryAddress", "holderPhoneNumbers",
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
    @XmlElement
    private String type;
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
    
    @XmlElementWrapper(name = "holderPhoneNumbers")
    private List<PhoneNumber> holderPhoneNumbers;
    @XmlElementWrapper(name = "holderEmailAddresses")
    private List<EmailAddress> holderEmailAddresses;
    @XmlElementWrapper(name = "holderResidentialAddresses")
    private List<Address> holderResidentialAddresses;
    @XmlElementWrapper(name = "holderPostalAddresses")
    private List<Address> holderPostalAddresses;
    
    @XmlTransient
    private Stockbroker holderStockbroker;
    
    @XmlElementWrapper(name = "holderCompanyAccounts")
    private List<HolderCompanyAccount> holderCompanyAccounts;
    @XmlElementWrapper(name = "holderBondAccounts")
    private List<HolderBondAccount> holderBondAccounts;

    @XmlElementWrapper(name = "administrators")
    private List<Administrator> administrators;
    
    public Holder(){}
    
    public Holder(int holderId, int holderAcctNumber, String chn, String firstName, String middleName, String lastName, String type, String gender, String dob, boolean taxExempted, boolean merged, boolean pryHolder, String pryAddress, List<PhoneNumber> holderPhoneNumbers, List<Address> holderResidentialAddresses, List<HolderCompanyAccount> holderCompanyAccounts, List<HolderBondAccount> holderBondAccounts, List<Address> holderPostalAddresses, List<EmailAddress> holderEmailAddresses, Stockbroker holderStockbroker) {
        this.holderId = holderId;
        this.holderAcctNumber = holderAcctNumber;
        this.chn = chn;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.type = type;
        this.gender = gender;
        this.dob = dob;
        this.taxExempted = taxExempted;
        this.merged = merged;
        this.pryHolder = pryHolder;
        this.pryAddress = pryAddress;
        this.holderPhoneNumbers = holderPhoneNumbers;
        this.holderResidentialAddresses = holderResidentialAddresses;
        this.holderCompanyAccounts = holderCompanyAccounts;
        this.holderBondAccounts = holderBondAccounts;
        this.holderPostalAddresses = holderPostalAddresses;
        this.holderEmailAddresses = holderEmailAddresses;
        this.holderStockbroker = holderStockbroker;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    
    
    
}
