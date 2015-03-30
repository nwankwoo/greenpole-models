/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.security;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Akinwale Agbaje
 * The user profile model, utilised by the front-end and middle-tier in
 * storing and retrieving user profile information.
 */
public class UserProfile {
    private int id;
    private String firstName;
    private String lastName;
    private int maxIndividualShareHolding;
    private int maxTotalShareHolding;
    private Set<Group> groups = new HashSet<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMaxIndividualShareHolding() {
        return maxIndividualShareHolding;
    }

    public void setMaxIndividualShareHolding(int maxIndividualShareHolding) {
        this.maxIndividualShareHolding = maxIndividualShareHolding;
    }

    public int getMaxTotalShareHolding() {
        return maxTotalShareHolding;
    }

    public void setMaxTotalShareHolding(int maxTotalShareHolding) {
        this.maxTotalShareHolding = maxTotalShareHolding;
    }
    
    public Set<Group> getGroups() {
        return groups;
    }

    public void setGroups(Set<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "UserProfile{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", maxIndividualShareHolding=" + maxIndividualShareHolding + ", maxTotalShareHolding=" + maxTotalShareHolding + '}';
    }

}
