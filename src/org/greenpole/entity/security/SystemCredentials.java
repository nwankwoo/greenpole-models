/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.security;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Akinwale Agbaje
 * The system credentials model to contain system login details for authentication.
 * A system is any front end that intends to connect to greenpole's middle-tier.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"password"})
public class SystemCredentials implements Serializable {
    @XmlTransient
    private int systemId;
    @XmlElement
    private int password;

    /**
     * Used to query / edit an existing system credentials.
     * Parameters are self-explanatory.
     * @param systemId
     * @param password 
     */
    public SystemCredentials(int systemId, int password) {
        this.systemId = systemId;
        this.password = password;
    }

    /**
     * Used to create new system credentials.
     * Parameter is self-explanatory.
     * @param password 
     */
    public SystemCredentials(int password) {
        this.password = password;
    }

    /**
     * Gets the system's unique identification.
     * @return the system's unique identification
     */
    public int getSystemId() {
        return systemId;
    }

    /**
     * Sets the system's unique identification.
     * @param systemId the system's unique identification
     */
    public void setSystemId(int systemId) {
        this.systemId = systemId;
    }

    /**
     * Gets the system's password.
     * @return the system's password
     */
    public int getPassword() {
        return password;
    }

    /**
     * Sets the system's password.
     * @param password the system's password
     */
    public void setPassword(int password) {
        this.password = password;
    }
}
