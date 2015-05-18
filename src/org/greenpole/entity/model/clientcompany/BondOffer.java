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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import org.greenpole.entity.model.Address;
import org.greenpole.entity.model.EmailAddress;
import org.greenpole.entity.model.PhoneNumber;

/**
 *
 * @author Yusuf Samsudeen Babashola (Algorithm)
 */
@XmlRootElement
@XmlSeeAlso({Address.class,EmailAddress.class,PhoneNumber.class})
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"clientCompanyId","title","unitPrice","bondMaturity",
    "bondTypeId","interestRate","paymentPlanId"})
public class BondOffer implements Serializable {
    
    @XmlTransient
    private int id;
    @XmlElement
    private int clientCompanyId;
    @XmlElement
    private String title;
    @XmlElement
    private double unitPrice;
    @XmlElement
    private String bondMaturity;
    @XmlTransient
    private String bondType;
    @XmlElement
    private int bondTypeId;
    @XmlElement
    private double interestRate;
    @XmlTransient
    private String paymentPlan;
    @XmlElement
    private int paymentPlanId;

    /**
     * For new bond offer creation.
     * @param clientCompanyId
     * @param title
     * @param unitPrice
     * @param bondMaturity
     * @param bondTypeId
     * @param interestRate
     * @param paymentPlanId 
     */
    public BondOffer(int clientCompanyId, String title, double unitPrice, String bondMaturity, int bondTypeId, double interestRate, int paymentPlanId) {
        this.clientCompanyId = clientCompanyId;
        this.title = title;
        this.unitPrice = unitPrice;
        this.bondMaturity = bondMaturity;
        this.bondTypeId = bondTypeId;
        this.interestRate = interestRate;
        this.paymentPlanId = paymentPlanId;
    }

    /**
     * For editing or query existing bond offer.
     * @param id
     * @param clientCompanyId
     * @param title
     * @param unitPrice
     * @param bondMaturity
     * @param bondTypeId
     * @param interestRate
     * @param paymentPlanId 
     */
    public BondOffer(int id, int clientCompanyId, String title, double unitPrice, String bondMaturity, int bondTypeId, double interestRate, int paymentPlanId) {
        this.id = id;
        this.clientCompanyId = clientCompanyId;
        this.title = title;
        this.unitPrice = unitPrice;
        this.bondMaturity = bondMaturity;
        this.bondTypeId = bondTypeId;
        this.interestRate = interestRate;
        this.paymentPlanId = paymentPlanId;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /*
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the clientCompanyId
     */
    public int getClientCompanyId() {
        return clientCompanyId;
    }

    /**
     * @param clientCompanyId the clientCompanyId to set
     */
    public void setClientCompanyId(int clientCompanyId) {
        this.clientCompanyId = clientCompanyId;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
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

    /**
     * @return the bondMaturity
     */
    public String getBondMaturity() {
        return bondMaturity;
    }

    /**
     * @param bondMaturity the bondMaturity to set
     */
    public void setBondMaturity(String bondMaturity) {
        this.bondMaturity = bondMaturity;
    }

    /**
     * @deprecated use bondTypeId
     * @return the bondType
     */
    public String getBondType() {
        return bondType;
    }

    /**
     * @deprecated use bondTypeId
     * @param bondType the bondType to set
     */
    public void setBondType(String bondType) {
        this.bondType = bondType;
    }

    public int getBondTypeId() {
        return bondTypeId;
    }

    public void setBondTypeId(int bondTypeId) {
        this.bondTypeId = bondTypeId;
    }

    /**
     * @return the interestRate
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * @param interestRate the interestRate to set
     */
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    /**
     * @deprecated use paymentPlanId
     * @return the paymentPlan
     */
    public String getPaymentPlan() {
        return paymentPlan;
    }

    /**
     * @deprecated use playmentPlanId
     * @param paymentPlan the paymentPlan to set
     */
    public void setPaymentPlan(String paymentPlan) {
        this.paymentPlan = paymentPlan;
    }

    /**
     * @return the payment plan id
     */
    public int getPaymentPlanId() {
        return paymentPlanId;
    }

    /**
     * @param paymentPlanId the payment plan id to set
     */
    public void setPaymentPlanId(int paymentPlanId) {
        this.paymentPlanId = paymentPlanId;
    }
        
}
