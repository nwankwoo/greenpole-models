/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entirycode.jeph.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Jephthah Sadare
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"id", "stockbroker", "emailAddress", "isPrimary"})

public class StockbrokerEmailAddress implements Serializable {

    @XmlElement
    private int id;
    @XmlElement
    private int stockbrokerId;
    @XmlElement
    private String emailAddress;
    @XmlElement
    private boolean isPrimary;

    public StockbrokerEmailAddress() {
    }

    public StockbrokerEmailAddress(int id, int stockbrokerId, String emailAddress, boolean isPrimary) {
        this.id = id;
        this.stockbrokerId = stockbrokerId;
        this.emailAddress = emailAddress;
        this.isPrimary = isPrimary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStockbrokerId() {
        return stockbrokerId;
    }

    public void setStockbrokerId(int stockbrokerId) {
        this.stockbrokerId = stockbrokerId;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public boolean isIsPrimary() {
        return isPrimary;
    }

    public void setIsPrimary(boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

}
