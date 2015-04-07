/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.security;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Akinwale Agbaje
 * The user profile model, utilised by the front-end and middle-tier in
 * storing and retrieving user profile information.
 */
public class UserProfile implements Serializable {
    private int id;
    private String firstName;
    private String lastName;
    private int maxIndividualShareHolding;
    private int maxTotalShareHolding;
    private Map<String, Group> groups = new HashMap<>(0);

    /**
     * Gets the user's unique identification.
     * @return the user's id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the user's unique identification.
     * @param id the user's id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the user's first name.
     * @return the user's first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the user's first name.
     * @param firstName the user's first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the user's last name.
     * @return the user's last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Gets the user's last name.
     * @param lastName the user's last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the maximum individual share holding.
     * @return the maximum individual share holding
     */
    public int getMaxIndividualShareHolding() {
        return maxIndividualShareHolding;
    }

    /**
     * Sets the maximum individual share holding.
     * The max individual share holding is the maximum share holding viewable
     * by the logged in user for an individual holder account.
     * @param maxIndividualShareHolding the maximum individual share holding
     */
    public void setMaxIndividualShareHolding(int maxIndividualShareHolding) {
        this.maxIndividualShareHolding = maxIndividualShareHolding;
    }

    /**
     * Gets the maximum total share holding.
     * @return the maximum total share holding
     */
    public int getMaxTotalShareHolding() {
        return maxTotalShareHolding;
    }

    /**
     * Sets the maximum total share holding.
     * The max total share holding is the maximum share holding viewable
     * by the logged in user for the totality of a holder's company accounts.
     * @param maxTotalShareHolding the max total share holding
     */
    public void setMaxTotalShareHolding(int maxTotalShareHolding) {
        this.maxTotalShareHolding = maxTotalShareHolding;
    }
    
    /**
     * Gets the user's assigned groups.
     * @return the user's assigned groups
     */
    public Map<String, Group> getGroups() {
        return groups;
    }

    /**
     * Sets the user's assigned groups.
     * @param groups the user's assigned groups
     */
    public void setGroups(Map<String, Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "UserProfile{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", maxIndividualShareHolding=" + maxIndividualShareHolding + ", maxTotalShareHolding=" + maxTotalShareHolding + '}';
    }

}
