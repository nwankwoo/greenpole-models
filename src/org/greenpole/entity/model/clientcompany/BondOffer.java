/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model.clientcompany;

/**
 *
 * @author Yusuf Samsudeen Babashola (Algorithm)
 */
public class BondOffer {
    
    private int clientCompanyId;
    private String title;
    private double unitPrice;
    private String bondMaturity;
    private String bondType;
    private double interestRate;
    private String paymentPlan;

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
     * @return the bondType
     */
    public String getBondType() {
        return bondType;
    }

    /**
     * @param bondType the bondType to set
     */
    public void setBondType(String bondType) {
        this.bondType = bondType;
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
     * @return the paymentPlan
     */
    public String getPaymentPlan() {
        return paymentPlan;
    }

    /**
     * @param paymentPlan the paymentPlan to set
     */
    public void setPaymentPlan(String paymentPlan) {
        this.paymentPlan = paymentPlan;
    }
        
}
