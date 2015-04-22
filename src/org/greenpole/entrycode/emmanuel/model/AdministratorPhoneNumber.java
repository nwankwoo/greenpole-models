/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entrycode.emmanuel.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author user
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"primaryPhoneNumber"})
public class AdministratorPhoneNumber implements Serializable {
@XmlElement
private int administratorId;
@XmlElement
private String phoneNumber;
@XmlElement
private boolean primaryPhoneNumber;
public AdministratorPhoneNumber(){}

    public AdministratorPhoneNumber(int administratorId, String phoneNumber, boolean primaryPhoneNumber) {
        this.administratorId = administratorId;
        this.phoneNumber = phoneNumber;
        this.primaryPhoneNumber = primaryPhoneNumber;
    }

    public AdministratorPhoneNumber(String phoneNumber, boolean primaryPhoneNumber) {
        this.phoneNumber = phoneNumber;
        this.primaryPhoneNumber = primaryPhoneNumber;
    }

    /**
     * @return the administratorId
     */
    public int getAdministratorId() {
        return administratorId;
    }

    /**
     * @param administratorId the administratorId to set
     */
    public void setAdministratorId(int administratorId) {
        this.administratorId = administratorId;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the primaryPhoneNumber
     */
    public boolean isPrimaryPhoneNumber() {
        return primaryPhoneNumber;
    }

    /**
     * @param primaryPhoneNumber the primaryPhoneNumber to set
     */
    public void setPrimaryPhoneNumber(boolean primaryPhoneNumber) {
        this.primaryPhoneNumber = primaryPhoneNumber;
    }

}
