package org.greenpole.entity.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Yusuf Samsudeen Babashola (Algorithm)
 */
public class Unit {
    private int unitID;
    private String name;
    
    public Unit(int unitID, String name) {
        this.unitID = unitID;
        this.name = name;
    }

    /**
     * @return the unitID
     */
    public int getUnitID() {
        return unitID;
    }

    /**
     * @param unitID the unitID to set
     */
    public void setUnitID(int unitID) {
        this.unitID = unitID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
}
