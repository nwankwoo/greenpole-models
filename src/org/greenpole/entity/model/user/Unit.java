package org.greenpole.entity.model.user;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

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
@XmlType(propOrder = {"unitId","name","users"})
@XmlSeeAlso(User.class)
public class Unit implements Serializable {
    @XmlElement(name = "id")
    private int unitId;
    @XmlElement
    private String name;
    @XmlElementWrapper(name = "users")
    private List<User> users;
    
    /**
     * Initialises the unit object.
     */
    public Unit() {}

    /**
     * Used to create a new unit.
     * Parameter is self-explanatory.
     * @param name 
     */
    public Unit(String name) {
        this.name = name;
    }
    
    /**
     * Used to query / edit an existing unit.
     * Parameters are self-explanatory.
     * @param unitID
     * @param name 
     */
    public Unit(int unitID, String name) {
        this.unitId = unitID;
        this.name = name;
    }

    public int getUnitId() {
        return unitId;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
