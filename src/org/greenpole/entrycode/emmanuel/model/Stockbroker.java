/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entrycode.emmanuel.model;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author user
 */
public class Stockbroker {
    @XmlTransient
    private int id;
    @XmlElement
    private String name;
    @XmlElement
    private String cscsAccNo;
    @XmlElement
    private boolean active;
    @XmlElement
    private boolean valid;
    @XmlElement(name = "holder")
    private Holder holder;

    public Stockbroker() {
    }

    public Stockbroker(int id, String name, String cscsAccNo, boolean active, boolean valid, Holder holder) {
        this.id = id;
        this.name = name;
        this.cscsAccNo = cscsAccNo;
        this.active = active;
        this.valid = valid;
        this.holder = holder;
    }

    public Stockbroker(String name, String cscsAccNo, boolean active, boolean valid, Holder holder) {
        this.name = name;
        this.cscsAccNo = cscsAccNo;
        this.active = active;
        this.valid = valid;
        this.holder = holder;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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

    /**
     * @return the cscsAccNo
     */
    public String getCscsAccNo() {
        return cscsAccNo;
    }

    /**
     * @param cscsAccNo the cscsAccNo to set
     */
    public void setCscsAccNo(String cscsAccNo) {
        this.cscsAccNo = cscsAccNo;
    }

    /**
     * @return the active
     */
    public boolean isActive() {
        return active;
    }

    /**
     * @param active the active to set
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * @return the valid
     */
    public boolean isValid() {
        return valid;
    }

    /**
     * @param valid the valid to set
     */
    public void setValid(boolean valid) {
        this.valid = valid;
    }

    /**
     * @return the holder
     */
    public Holder getHolder() {
        return holder;
    }

    /**
     * @param holder the holder to set
     */
    public void setHolder(Holder holder) {
        this.holder = holder;
    }

    
}
