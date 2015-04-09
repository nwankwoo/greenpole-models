/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model;

/**
 *
 * @author Yusuf Samsudeen Babashola (Algorithm)
 */
public class EmailAddress {
    private String emailAddress;

    public EmailAddress() {
    }

    
    
    public EmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
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
    
}
