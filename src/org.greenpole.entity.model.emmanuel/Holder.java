/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entrycode.emmanuel.model;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author user
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Holder implements Serializable {

    @XmlElement
    private int id;
    @XmlElement
    private int holderAcctNumber;
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

    public Holder() {
    }

    public Holder(int id, int holderAcctNumber, String firstName, String middleName, String lastName, String type, String gender, Date dob) {
        this.id = id;
        this.holderAcctNumber = holderAcctNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.type = type;
        this.gender = gender;
        this.dob = dob;
    }

    public Holder(int holderAcctNumber, String firstName, String middleName, String lastName, String type, String gender, Date dob) {
        this.holderAcctNumber = holderAcctNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.type = type;
        this.gender = gender;
        this.dob = dob;
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
    public Date getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(Date dob) {
        this.dob = dob;
    }

}
