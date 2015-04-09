/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model;

/**
 *
 * @author Samsudeen.Yusuf
 */
public class User {
    
    private String firstName;
    private String middleName;
    private String lastName;
    private String username;
    private String password;
    private String userType;
    private String department;
    private String unit;
    private boolean grantAuthorisationRole;
    private int maximumIndividualShareHoldings;
    private int maximumTotalShareHoldings;
    
    public User() {
    }
    
    

    public User(String firstName, String middleName, String lastName, String username, String department, String unit) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.username = username;
        this.department = department;
        this.unit = unit;
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
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the userType
     */
    public String getUserType() {
        return userType;
    }

    /**
     * @param userType the userType to set
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return the unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * @param unit the unit to set
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * @return the grantAuthorisationRole
     */
    public boolean isGrantAuthorisationRole() {
        return grantAuthorisationRole;
    }

    /**
     * @param grantAuthorisationRole the grantAuthorisationRole to set
     */
    public void setGrantAuthorisationRole(boolean grantAuthorisationRole) {
        this.grantAuthorisationRole = grantAuthorisationRole;
    }

    /**
     * @return the maximumIndividualShareHoldings
     */
    public int getMaximumIndividualShareHoldings() {
        return maximumIndividualShareHoldings;
    }

    /**
     * @param maximumIndividualShareHoldings the maximumIndividualShareHoldings to set
     */
    public void setMaximumIndividualShareHoldings(int maximumIndividualShareHoldings) {
        this.maximumIndividualShareHoldings = maximumIndividualShareHoldings;
    }

    /**
     * @return the maximumTotalShareHoldings
     */
    public int getMaximumTotalShareHoldings() {
        return maximumTotalShareHoldings;
    }

    /**
     * @param maximumTotalShareHoldings the maximumTotalShareHoldings to set
     */
    public void setMaximumTotalShareHoldings(int maximumTotalShareHoldings) {
        this.maximumTotalShareHoldings = maximumTotalShareHoldings;
    }

    
    
    
}
