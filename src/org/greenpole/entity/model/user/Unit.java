package org.greenpole.entity.model.user;

import java.util.HashSet;
import java.util.Set;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.greenpole.entity.model.clientcompany.ClientCompany;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Yusuf Samsudeen Babashola (Algorithm)
 * Carries information on a department's unit.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"unitID","name","users"})
@XmlSeeAlso(User.class)
public class Unit {
    @XmlElement
    private int unitID;
    @XmlElement
    private String name;
    @XmlElementWrapper(name = "users")
    private Set users = new HashSet(0);
    
    /**
     * Initialises the unit object.
     */
    public Unit() {}
    
    /**
     * Collects all values for the unit object.
     * @param unitID the unit's id
     * @param name the unit's name
     */
    public Unit(int unitID, String name) {
        this.unitID = unitID;
        this.name = name;
    }

    /**
     * Gets the unit's id.
     * @return the unitID the unit's id
     */
    public int getUnitID() {
        return unitID;
    }

    /**
     * Sets the unit's id.
     * @param unitID the unit's id
     */
    public void setUnitID(int unitID) {
        this.unitID = unitID;
    }

    /**
     * Gets the unit's name.
     * @return the unit's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the unit's name.
     * @param name the unit's name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Gets all employees (system users) of a unit.
     * @return the unit employees
     */
    public Set getUsers() {
        return users;
    }

    /**
     * Sets all employees (system users) to a unit.
     * @param users the unit employees
     */
    public void setUsers(Set users) {
        this.users = users;
    }
}
