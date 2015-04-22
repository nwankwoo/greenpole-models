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
@XmlType(propOrder = {"primaryEmail","emailAddress"})
public class AdministratorEmailAddress implements Serializable {
 @XmlElement
 private int administratorId;
 @XmlElement
 private String emailAddress;
 @XmlElement
 private boolean primaryEmail;
 public AdministratorEmailAddress(){}

    public AdministratorEmailAddress(int administratorId, String emailAddress, boolean primaryEmail) {
        this.administratorId = administratorId;
        this.emailAddress = emailAddress;
        this.primaryEmail = primaryEmail;
    }

    public AdministratorEmailAddress(String emailAddress, boolean primaryEmail) {
        this.emailAddress = emailAddress;
        this.primaryEmail = primaryEmail;
    }

    public int getAdministratorId() {
        return administratorId;
    }

    public void setAdministratorId(int administratorId) {
        this.administratorId = administratorId;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public boolean isPrimaryEmail() {
        return primaryEmail;
    }

    public void setPrimaryEmail(boolean primaryEmail) {
        this.primaryEmail = primaryEmail;
    }
 
    
}
