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
public class PhoneNumber {
    
    private String phoneNumber;

    public PhoneNumber() {
    }

    
    
    public PhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
    
    
}
