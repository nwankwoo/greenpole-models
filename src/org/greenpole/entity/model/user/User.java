/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Samsudeen.Yusuf
 * The user model, utilised to convey user information between the database and 
 * the front end.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"firstName","middleName","lastName","username",
    "password","userType","deptId","unitId","maximumIndividualShareHoldings",
    "maximumTotalShareHoldings"})
public class User {
    @XmlElement
    private String firstName;
    @XmlElement
    private String middleName;
    @XmlElement
    private String lastName;
    @XmlElement
    private String username;
    @XmlElement
    private String password;
    @XmlElement
    private String userType;
    @XmlElement
    private int deptId;
    @XmlElement
    private int unitId;
    @XmlElement
    private int maximumIndividualShareHoldings;
    @XmlElement
    private int maximumTotalShareHoldings;
    
    /**
     *
     */
    public User() {
    }

    public User(String firstName, String middleName, String lastName, String username, int deptId, int unitId) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.username = username;
        this.deptId = deptId;
        this.unitId = unitId;
    }
    
    /**
     * Collects all values of the user.
     * @param firstName the user's first name
     * @param middleName the user's middle name
     * @param lastName the user's last name
     * @param username the user's username
     * @param password the user's password
     * @param userType the user's account type
     * @param deptId the user's department id
     * @param unitId  the user's department unit id
     * @param maximumIndividualShareHoldings the maximum share holding the user 
     * can view for a holder's company account
     * @param maximumTotalShareHoldings the maximum share holding the user
     * can view for a holder's total company accounts
     */
    
    
    public User(String firstName, String middleName, String lastName, String username, String password, String userType, int deptId, int unitId, int maximumIndividualShareHoldings, int maximumTotalShareHoldings) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.userType = userType;
        this.deptId = deptId;
        this.unitId = unitId;
        this.maximumIndividualShareHoldings = maximumIndividualShareHoldings;
        this.maximumTotalShareHoldings = maximumTotalShareHoldings;
    }

    /**
     * Gets the user's first name.
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the user's first name.
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the user's middle name.
     * @return the middle name
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the user's middle name.
     * @param middleName the middle name
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * Gets the user's last name.
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the user's last name.
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the user's username.
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the user's username
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets the user's password.
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the user's password.
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets the user type.
     * @return the user type
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Sets the user type.
     * @param userType the userType to set
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * Gets the user's department id.
     * @return the deptId the department id
     */
    public int getDeptId() {
        return deptId;
    }

    /**
     * Sets the user's department id.
     * @param deptId the department id
     */
    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    /**
     * Gets the user's department unit.
     * @return the unit
     */
    public int getUnitId() {
        return unitId;
    }

    /**
     * Sets the user's department unit.
     * @param unitId the unit
     */
    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }

    /**
     * Gets the maximum share holdings the user can view for a particular holder's 
     * company account.
     * @return the maximumIndividualShareHoldings the maximum share holdings
     */
    public int getMaximumIndividualShareHoldings() {
        return maximumIndividualShareHoldings;
    }

    /**
     * Sets the maximum share holdings the user can view for a particular holder's 
     * company account.
     * @param maximumIndividualShareHoldings the maximum share holdings
     */
    public void setMaximumIndividualShareHoldings(int maximumIndividualShareHoldings) {
        this.maximumIndividualShareHoldings = maximumIndividualShareHoldings;
    }

    /**
     * Gets the maximum share holdings the user can view for a holder's 
     * total company accounts.
     * @return the maximum share holdings
     */
    public int getMaximumTotalShareHoldings() {
        return maximumTotalShareHoldings;
    }

    /**
     * Sets the maximum share holdings the user can view for a holder's 
     * total company accounts.
     * @param maximumTotalShareHoldings the maximum share holdings
     */
    public void setMaximumTotalShareHoldings(int maximumTotalShareHoldings) {
        this.maximumTotalShareHoldings = maximumTotalShareHoldings;
    }
}
