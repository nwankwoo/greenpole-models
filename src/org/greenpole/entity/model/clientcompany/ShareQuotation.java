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
public class ShareQuotation {
    private int clientCompanyId;
    private ClientCompany clientCompany;
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
