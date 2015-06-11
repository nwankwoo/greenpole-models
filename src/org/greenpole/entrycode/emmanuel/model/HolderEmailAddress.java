/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entrycode.emmanuel.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author user
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"emailAddress","primaryEmailAddress"})
public class HolderEmailAddress {
  @XmlTransient
  private int id;
  @XmlElement
  private String emailAddress;
  @XmlElement
  private boolean primaryEmailAddress;

    public HolderEmailAddress() {
    }

    public HolderEmailAddress(int id, String emailAddress, boolean primaryEmailAddress) {
        this.id = id;
        this.emailAddress = emailAddress;
        this.primaryEmailAddress = primaryEmailAddress;
    }

    public HolderEmailAddress(String emailAddress, boolean primaryEmailAddress) {
        this.emailAddress = emailAddress;
        this.primaryEmailAddress = primaryEmailAddress;
    }
    

    /**
     * @return the holderEmailAddressId
     */
    public int getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * @param emailAddress the emailAddress to set
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * @return the primaryEmailAddress
     */
    public boolean isPrimaryEmailAddress() {
        return primaryEmailAddress;
    }

    /**
     * @param primaryEmailAddress the primaryEmailAddress to set
     */
    public void setPrimaryEmailAddress(boolean primaryEmailAddress) {
        this.primaryEmailAddress = primaryEmailAddress;
    }
  
}
