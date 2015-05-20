/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model.clientcompany;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * @author Akin
 * Used to convey information on bond payment plans between the front-end and the middle-tier.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"paymentPlan","description"})
public class BondOfferPaymentPlan implements Serializable {
    
    @XmlTransient
    private int id;
    @XmlElement
    private String paymentPlan;
    @XmlElement
    private String description;

    public BondOfferPaymentPlan() {
    }

    /**
     * Use to create new payment plan.
     * @param paymentPlan the plan name
     * @param description the plan description
     */
    public BondOfferPaymentPlan(String paymentPlan, String description) {
        this.paymentPlan = paymentPlan;
        this.description = description;
    }

    /**
     * Use to query / edit existing payment plan.
     * @param id the plan's id
     * @param paymentPlan the plan name
     * @param description the plan description
     */
    public BondOfferPaymentPlan(int id, String paymentPlan, String description) {
        this.id = id;
        this.paymentPlan = paymentPlan;
        this.description = description;
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
     * @return the payment plan
     */
    public String getPaymentPlan() {
        return paymentPlan;
    }

    /**
     * @param paymentPlan the payment plan to set
     */
    public void setPaymentPlan(String paymentPlan) {
        this.paymentPlan = paymentPlan;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
}
