/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.security;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Akinwale Agbaje
 * The system credentials model to contain system login details for authentication.
 * A system is any front end that intends to connect to greenpole's middle-tier.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"systemId","password"})
public class SystemCredentials implements Serializable {
    
    private int systemId;
    private int password;

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
