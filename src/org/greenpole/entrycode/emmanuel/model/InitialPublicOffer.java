/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entrycode.emmanuel.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Idoko Emmanuel The Initial Public Offer model, utilized by the
 * front-end and middle-tier in storing and retrieving Initial Public Offer
 * information.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"totalSharesOnOffer", "methodOnOffer", "startingMinSub", "contMinSub", 
    "offerPrice", "offerSize", "openingDate", "closingDate", " ipoClosed"})
public class InitialPublicOffer implements Serializable {

    @XmlTransient
    private int id;
    @XmlTransient
    private int clientCompanyId;
    @XmlElement
    private int totalSharesOnOffer;
    @XmlElement
    private String methodOnOffer;
    @XmlElement
    private int startingMinSub;
    @XmlElement
    private int contMinSub;
    @XmlElement
    private double offerPrice;
    @XmlElement
    private int offerSize;
    @XmlElement
    private String openingDate;
    @XmlElement
    private String closingDate;
    @XmlElement
    private boolean ipoClosed;

    public InitialPublicOffer() {
    }

    public InitialPublicOffer(int clientCompanyId, int totalSharesOnOffer, String methodOnOffer, int startingMinSub, int contMinSub, double offerPrice, int offerSize, String openingDate, String closingDate) {
        this.clientCompanyId = clientCompanyId;
        this.totalSharesOnOffer = totalSharesOnOffer;
        this.methodOnOffer = methodOnOffer;
        this.startingMinSub = startingMinSub;
        this.contMinSub = contMinSub;
        this.offerPrice = offerPrice;
        this.offerSize = offerSize;
        this.openingDate = openingDate;
        this.closingDate = closingDate;
    }

    public InitialPublicOffer(int id, int clientCompanyId, int totalSharesOnOffer, String methodOnOffer, int startingMinSub, int contMinSub, double offerPrice, int offerSize, String openingDate, String closingDate) {
        this.id = id;
        this.clientCompanyId = clientCompanyId;
        this.totalSharesOnOffer = totalSharesOnOffer;
        this.methodOnOffer = methodOnOffer;
        this.startingMinSub = startingMinSub;
        this.contMinSub = contMinSub;
        this.offerPrice = offerPrice;
        this.offerSize = offerSize;
        this.openingDate = openingDate;
        this.closingDate = closingDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClientCompanyId() {
        return clientCompanyId;
    }

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
     * @return the methodOnOffer
     */
    public String getMethodOnOffer() {
        return methodOnOffer;
    }

    /**
     * @param methodOnOffer the methodOnOffer to set
     */
    public void setMethodOnOffer(String methodOnOffer) {
        this.methodOnOffer = methodOnOffer;
    }

    /**
     * @return the startingMinSub
     */
    public int getStartingMinSub() {
        return startingMinSub;
    }

    /**
     * @param startingMinSub the startingMinSub to set
     */
    public void setStartingMinSub(int startingMinSub) {
        this.startingMinSub = startingMinSub;
    }

    /**
     * @return the contMinSub
     */
    public int getContMinSub() {
        return contMinSub;
    }

    /**
     * @param contMinSub the contMinSub to set
     */
    public void setContMinSub(int contMinSub) {
        this.contMinSub = contMinSub;
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
    public int getOfferSize() {
        return offerSize;
    }

    /**
     * @param offerSize the offerSize to set
     */
    public void setOfferSize(int offerSize) {
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

    public boolean isIpoClosed() {
        return ipoClosed;
    }

    public void setIpoClosed(boolean ipoClosed) {
        this.ipoClosed = ipoClosed;
    }
}
