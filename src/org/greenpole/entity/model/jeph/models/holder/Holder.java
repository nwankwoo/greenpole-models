/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model.jeph.models.holder;

import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.greenpole.entity.model.clientcompany.PrivatePlacementApplication;

/**
 *
 * @author Jephthah Sadare
 */

@XmlRootElement
@XmlSeeAlso({HolderBondAccount.class, HolderCompanyAccount.class, HolderEmailAddress.class, HolderPostalAddress.class, HolderPhoneNumber.class, HolderResidentialAddress.class})
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"holderAcctNumber", "chn", "firstName", "middleName", "lastName",
    "type", "gender", "dob", "taxExempted", "merged", "pryHolder", "pryAddress",
    "holderSignatures", "holderPhoneNumbers", "holderResidentialAddress", "holderCompanyAccounts",
    "holderBondAccounts", "holderPostalAddress"})

public class Holder {

    @XmlElement
    private int holderId;
    @XmlElement
    private Holder holder;
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
    private Date dob;
    @XmlElement
    private boolean taxExempted;
    @XmlElement
    private boolean merged;
    @XmlElement
    private boolean pryHolder;
    @XmlElement
    private String pryAddress;
    private List<PrivatePlacementApplication> privatePlacementApplications;
    private List<Holder> holders;
    private List<HolderPhoneNumber> holderPhoneNumbers;
    private List<HolderResidentialAddress> holderResidentialAddresses;
    private List<HolderCompanyAccount> holderCompanyAccounts;
    private List<HolderBondAccount> holderBondAccounts;
    private List<HolderPostalAddress> holderPostalAddresses;
    private List<HolderEmailAddress> holderEmailAddresses;

    public Holder(int holderId, Holder holder, int holderAcctNumber, String chn, String firstName, String middleName, String lastName, String type, String gender, Date dob, boolean taxExempted, boolean merged, boolean pryHolder, String pryAddress, List<PrivatePlacementApplication> privatePlacementApplications, List<Holder> holders, List<HolderPhoneNumber> holderPhoneNumbers, List<HolderResidentialAddress> holderResidentialAddresses, List<HolderCompanyAccount> holderCompanyAccounts, List<HolderBondAccount> holderBondAccounts, List<HolderPostalAddress> holderPostalAddresses, List<HolderEmailAddress> holderEmailAddresses) {
        this.holderId = holderId;
        this.holder = holder;
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
        this.privatePlacementApplications = privatePlacementApplications;
        this.holders = holders;
        this.holderPhoneNumbers = holderPhoneNumbers;
        this.holderResidentialAddresses = holderResidentialAddresses;
        this.holderCompanyAccounts = holderCompanyAccounts;
        this.holderBondAccounts = holderBondAccounts;
        this.holderPostalAddresses = holderPostalAddresses;
        this.holderEmailAddresses = holderEmailAddresses;
    }

    public int getHolderId() {
        return holderId;
    }

    public void setHolderId(int holderId) {
        this.holderId = holderId;
    }

    public Holder getHolder() {
        return holder;
    }

    public void setHolder(Holder holder) {
        this.holder = holder;
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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
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

    public List<PrivatePlacementApplication> getPrivatePlacementApplications() {
        return privatePlacementApplications;
    }

    public void setPrivatePlacementApplications(List<PrivatePlacementApplication> privatePlacementApplications) {
        this.privatePlacementApplications = privatePlacementApplications;
    }

    public List<Holder> getHolders() {
        return holders;
    }

    public void setHolders(List<Holder> holders) {
        this.holders = holders;
    }

    public List<HolderPhoneNumber> getHolderPhoneNumbers() {
        return holderPhoneNumbers;
    }

    public void setHolderPhoneNumbers(List<HolderPhoneNumber> holderPhoneNumbers) {
        this.holderPhoneNumbers = holderPhoneNumbers;
    }

    public List<HolderResidentialAddress> getHolderResidentialAddresses() {
        return holderResidentialAddresses;
    }

    public void setHolderResidentialAddresses(List<HolderResidentialAddress> holderResidentialAddresses) {
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

    public List<HolderPostalAddress> getHolderPostalAddresses() {
        return holderPostalAddresses;
    }

    public void setHolderPostalAddresses(List<HolderPostalAddress> holderPostalAddresses) {
        this.holderPostalAddresses = holderPostalAddresses;
    }

    public List<HolderEmailAddress> getHolderEmailAddresses() {
        return holderEmailAddresses;
    }

    public void setHolderEmailAddresses(List<HolderEmailAddress> holderEmailAddresses) {
        this.holderEmailAddresses = holderEmailAddresses;
    }
    
    
}
