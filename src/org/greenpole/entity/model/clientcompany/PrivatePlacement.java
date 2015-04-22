/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model.clientcompany;

import java.math.BigDecimal;

/**
 *
 * @author Yusuf Samsudeen Babashola (Algorithm) 
 * 
 * 
 * This class represents a Private Placement
 */
public class PrivatePlacement {
   private int clientCompanyId;
    private int totalSharesOnOffer;
    private String methodOfOffer;
    private int startingMinimumSubscription;
    private int continuingMinimumSubscription;
    private double offerPrice;
    private BigDecimal offerSize;
    private String openingDate;
    private String closingDate;

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
     * @return the totalSharesOnOffer
     */
    public int getTotalSharesOnOffer() {
        return totalSharesOnOffer;
    }

    /**
     * @param totalSharesOnOffer the totalSharesOnOffer to set
     */
    public void setTotalSharesOnOffer(int totalSharesOnOffer) {
        this.totalSharesOnOffer = totalSharesOnOffer;
    }

    /**
     * @return the methodOfOffer
     */
    public String getMethodOfOffer() {
        return methodOfOffer;
    }

    /**
     * @param methodOfOffer the methodOfOffer to set
     */
    public void setMethodOfOffer(String methodOfOffer) {
        this.methodOfOffer = methodOfOffer;
    }

    /**
     * @return the startingMinimumSubscription
     */
    public int getStartingMinimumSubscription() {
        return startingMinimumSubscription;
    }

    /**
     * @param startingMinimumSubscription the startingMinimumSubscription to set
     */
    public void setStartingMinimumSubscription(int startingMinimumSubscription) {
        this.startingMinimumSubscription = startingMinimumSubscription;
    }

    /**
     * @return the continuingMinimumSubscription
     */
    public int getContinuingMinimumSubscription() {
        return continuingMinimumSubscription;
    }

    /**
     * @param continuingMinimumSubscription the continuingMinimumSubscription to set
     */
    public void setContinuingMinimumSubscription(int continuingMinimumSubscription) {
        this.continuingMinimumSubscription = continuingMinimumSubscription;
    }

    /**
     * @return the offerPrice
     */
    public double getOfferPrice() {
        return offerPrice;
    }

    /**
     * @param offerPrice the offerPrice to set
     */
    public void setOfferPrice(double offerPrice) {
        this.offerPrice = offerPrice;
    }

    /**
     * @return the offerSize
     */
    public BigDecimal getOfferSize() {
        return offerSize;
    }

    /**
     * @param offerSize the offerSize to set
     */
    public void setOfferSize(BigDecimal offerSize) {
        this.offerSize = offerSize;
    }

    /**
     * @return the openingDate
     */
    public String getOpeningDate() {
        return openingDate;
    }

    /**
     * @param openingDate the openingDate to set
     */
    public void setOpeningDate(String openingDate) {
        this.openingDate = openingDate;
    }

    /**
     * @return the closingDate
     */
    public String getClosingDate() {
        return closingDate;
    }

    /**
     * @param closingDate the closingDate to set
     */
    public void setClosingDate(String closingDate) {
        this.closingDate = closingDate;
    }
    
     
}
