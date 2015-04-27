/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model.clientcompany;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Yusuf Samsudeen Babashola (Algorithm) 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"clientCompany","unitPrice"})
public class ShareQuotation {
    private int id;
    @XmlElement
    private ClientCompany clientCompany;
    @XmlElement
    private double unitPrice;

    public ShareQuotation() {
    }

    /**
     * 
     * @param clientCompany
     * @param unitPrice 
     */
    public ShareQuotation(ClientCompany clientCompany, double unitPrice) {
        this.clientCompany = clientCompany;
        this.unitPrice = unitPrice;
    }

    /**
     * 
     * @return the share quotation id
     */
    public int getId() {
        return id;
    }

    /**
     * 
     * @param id the share quotation id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the clientCompany
     */
    public ClientCompany getClientCompany() {
        return clientCompany;
    }

    /**
     * @param clientCompany the clientCompany to set
     */
    public void setClientCompany(ClientCompany clientCompany) {
        this.clientCompany = clientCompany;
    }

    /**
     * @return the unitPrice
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    
}
