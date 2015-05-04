/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model.clientcompany;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Yusuf Samsudeen Babashola (Algorithm)
 * 
 * Used to transfer IPO information between the front end and the middle tier.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"clientCompanyId","totalSharesOnOffer","methodOfOffer","startingMinimumSubscription",
    "continuingMinimumSubscription","offerPrice","offerSize","openingDate","closingDate"})
public class InitialPublicOffer {
    @XmlElement
    private int clientCompanyId;
    @XmlElement
    private int totalSharesOnOffer;
    @XmlElement
    private String methodOfOffer;
    @XmlElement
    private int startingMinimumSubscription;
    @XmlElement
    private int continuingMinimumSubscription;
    @XmlElement
    private double offerPrice;
    @XmlElement
    private BigDecimal offerSize;
    @XmlElement
    private String openingDate;
    @XmlElement
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
