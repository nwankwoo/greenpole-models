/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entrycode.emmanuel.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author user
 */
@XmlRootElement
@XmlSeeAlso({Administrator.class})
@XmlAccessorType(XmlAccessType.NONE)
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
    private String type;
    @XmlElement
    private String gender;
    @XmlElement
    private String dob;
    @XmlElement
    private boolean merged;
    @XmlElement
    private boolean pryHolder;
    @XmlElementWrapper(name = "administrator")
    private List<Administrator> administrator;
    @XmlElementWrapper(name = "caution")
    private List<Caution> caution;
    @XmlElementWrapper(name = "rightsIssueApplication")
    private List<RightsIssueApplication> rightsIssueApplication;
    public Holder() {
    }

    public Holder(int holderId, int holderAcctNumber, String chn, String firstName, String middleName, String lastName, String type, String gender, String dob, boolean merged, boolean pryHolder, List<Administrator> administrator, List<Caution> caution) {
        this.holderId = holderId;
        this.holderAcctNumber = holderAcctNumber;
        this.chn = chn;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.type = type;
        this.gender = gender;
        this.dob = dob;
        this.merged = merged;
        this.pryHolder = pryHolder;
        this.administrator = administrator;
        this.caution = caution;
    }

    public Holder(int holderAcctNumber, String chn, String firstName, String middleName, String lastName, String type, String gender, String dob, boolean merged, boolean pryHolder, List<Administrator> administrator, List<Caution> caution) {
        this.holderAcctNumber = holderAcctNumber;
        this.chn = chn;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.type = type;
        this.gender = gender;
        this.dob = dob;
        this.merged = merged;
        this.pryHolder = pryHolder;
        this.administrator = administrator;
        this.caution = caution;
    }

    public Holder(int holderId, int holderAcctNumber, String chn, String firstName, String middleName, String lastName, String type, String gender, String dob, boolean merged, boolean pryHolder, List<Administrator> administrator, List<Caution> caution, List<RightsIssueApplication> rightsIssueApplication) {
        this.holderId = holderId;
        this.holderAcctNumber = holderAcctNumber;
        this.chn = chn;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.type = type;
        this.gender = gender;
        this.dob = dob;
        this.merged = merged;
        this.pryHolder = pryHolder;
        this.administrator = administrator;
        this.caution = caution;
        this.rightsIssueApplication = rightsIssueApplication;
    }

    /**
     * @return the holderId
     */
    public int getHolderId() {
        return holderId;
    }

    /**
     * @param holderId the holderId to set
     */
    public void setHolderId(int holderId) {
        this.holderId = holderId;
    }

    /**
     * @return the holderAcctNumber
     */
    public int getHolderAcctNumber() {
        return holderAcctNumber;
    }

    /**
     * @param holderAcctNumber the holderAcctNumber to set
     */
    public void setHolderAcctNumber(int holderAcctNumber) {
        this.holderAcctNumber = holderAcctNumber;
    }

    /**
     * @return the chn
     */
    public String getChn() {
        return chn;
    }

    /**
     * @param chn the chn to set
     */
    public void setChn(String chn) {
        this.chn = chn;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the middleName
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * @param middleName the middleName to set
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
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
     * @return the pryHolder
     */
    public boolean isPryHolder() {
        return pryHolder;
    }

    /**
     * @param pryHolder the pryHolder to set
     */
    public void setPryHolder(boolean pryHolder) {
        this.pryHolder = pryHolder;
    }

    /**
     * @return the administrator
     */
    public List<Administrator> getAdministrator() {
        return administrator;
    }

    /**
     * @param administrator the administrator to set
     */
    public void setAdministrator(List<Administrator> administrator) {
        this.administrator = administrator;
    }

    /**
     * @return the caution
     */
    public List<Caution> getCaution() {
        return caution;
    }

    /**
     * @param caution the caution to set
     */
    public void setCaution(List<Caution> caution) {
        this.caution = caution;
    }

    /**
     * @return the rightsIssueApplication
     */
    public List<RightsIssueApplication> getRightsIssueApplication() {
        return rightsIssueApplication;
    }

    /**
     * @param rightsIssueApplication the rightsIssueApplication to set
     */
    public void setRightsIssueApplication(List<RightsIssueApplication> rightsIssueApplication) {
        this.rightsIssueApplication = rightsIssueApplication;
    }

    

    

    
}
