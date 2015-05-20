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
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Akinwale Agbaje
 * The login model to contain user login details for authentication.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"userId","password"})
public class Login implements Serializable {
    @XmlElement
    private String userId;
    @XmlElement
    private String password;

    public Login() {
    }

    /**
     * Used to create / query a new / existing user.
     * Parameters are self-explanatory.
     * @param userId
     * @param password 
     */
    public Login(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    /**
     * Gets the user's unique identification - their email address.
     * @return the user's email
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the user's unique identification - their email address.
     * @param userId the user's email
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Gets the user's password.
     * @return the user's password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the user's password.
     * @param password the user's password
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
