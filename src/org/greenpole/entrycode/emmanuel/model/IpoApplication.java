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
import javax.xml.bind.annotation.XmlType;
import org.greenpole.entity.model.clientcompany.InitialPublicOffer;

/**
 *
 * @author user
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"id","clearingHouseId","clearingHouseName",
    "clearingHouseBrokerage","initialPublicOffer","issuer",
    "sharesSubscribed","amountPaid","issuingHouse","sharesSubscribedValue","returnMoney","cancelled","clientCompanyId"})
public class IpoApplication implements Serializable {
   @XmlElement
   private int id;
   @XmlElement
   private int clearingHouseId;
   @XmlElement
   private String clearingHouseName;
   @XmlElement
   private double clearingHouseBrokerage;
   @XmlElement
   private InitialPublicOffer initialPublicOffer;
   @XmlElement
   private String issuer;
   @XmlElement
   private int sharesSubscribed;
   @XmlElement
   private double amountPaid;
   @XmlElement
   private String issuingHouse;
   @XmlElement
   private double sharesSubscribedValue;
   @XmlElement
   private double returnMoney;
   @XmlElement
   private boolean cancelled;
   @XmlElement
   private int clientCompanyId;
   
    public IpoApplication() {
    }

    public IpoApplication(int id, int clearingHouseId, String clearingHouseName, double clearingHouseBrokerage, InitialPublicOffer initialPublicOffer, String issuer, int sharesSubscribed, double amountPaid, String issuingHouse, double sharesSubscribedValue, double returnMoney, boolean cancelled, int clientCompanyId) {
        this.id = id;
        this.clearingHouseId = clearingHouseId;
        this.clearingHouseName = clearingHouseName;
        this.clearingHouseBrokerage = clearingHouseBrokerage;
        this.initialPublicOffer = initialPublicOffer;
        this.issuer = issuer;
        this.sharesSubscribed = sharesSubscribed;
        this.amountPaid = amountPaid;
        this.issuingHouse = issuingHouse;
        this.sharesSubscribedValue = sharesSubscribedValue;
        this.returnMoney = returnMoney;
        this.cancelled = cancelled;
        this.clientCompanyId = clientCompanyId;
    }

    public IpoApplication(int clearingHouseId, String clearingHouseName, double clearingHouseBrokerage, InitialPublicOffer initialPublicOffer, String issuer, int sharesSubscribed, double amountPaid, String issuingHouse, double sharesSubscribedValue, double returnMoney, boolean cancelled, int clientCompanyId) {
        this.clearingHouseId = clearingHouseId;
        this.clearingHouseName = clearingHouseName;
        this.clearingHouseBrokerage = clearingHouseBrokerage;
        this.initialPublicOffer = initialPublicOffer;
        this.issuer = issuer;
        this.sharesSubscribed = sharesSubscribed;
        this.amountPaid = amountPaid;
        this.issuingHouse = issuingHouse;
        this.sharesSubscribedValue = sharesSubscribedValue;
        this.returnMoney = returnMoney;
        this.cancelled = cancelled;
        this.clientCompanyId = clientCompanyId;
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
     * @return the clearingHouseId
     */
    public int getClearingHouseId() {
        return clearingHouseId;
    }

    /**
     * @param clearingHouseId the clearingHouseId to set
     */
    public void setClearingHouseId(int clearingHouseId) {
        this.clearingHouseId = clearingHouseId;
    }

    /**
     * @return the clearingHouseName
     */
    public String getClearingHouseName() {
        return clearingHouseName;
    }

    /**
     * @param clearingHouseName the clearingHouseName to set
     */
    public void setClearingHouseName(String clearingHouseName) {
        this.clearingHouseName = clearingHouseName;
    }

    /**
     * @return the clearingHouseBrokerage
     */
    public double getClearingHouseBrokerage() {
        return clearingHouseBrokerage;
    }

    /**
     * @param clearingHouseBrokerage the clearingHouseBrokerage to set
     */
    public void setClearingHouseBrokerage(double clearingHouseBrokerage) {
        this.clearingHouseBrokerage = clearingHouseBrokerage;
    }

    /**
     * @return the initialPublicOffer
     */
    public InitialPublicOffer getInitialPublicOffer() {
        return initialPublicOffer;
    }

    /**
     * @param initialPublicOffer the initialPublicOffer to set
     */
    public void setInitialPublicOffer(InitialPublicOffer initialPublicOffer) {
        this.initialPublicOffer = initialPublicOffer;
    }

    /**
     * @return the issuer
     */
    public String getIssuer() {
        return issuer;
    }

    /**
     * @param issuer the issuer to set
     */
    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    /**
     * @return the sharesSubscribed
     */
    public int getSharesSubscribed() {
        return sharesSubscribed;
    }

    /**
     * @param sharesSubscribed the sharesSubscribed to set
     */
    public void setSharesSubscribed(int sharesSubscribed) {
        this.sharesSubscribed = sharesSubscribed;
    }

    /**
     * @return the amountPaid
     */
    public double getAmountPaid() {
        return amountPaid;
    }

    /**
     * @param amountPaid the amountPaid to set
     */
    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    /**
     * @return the issuingHouse
     */
    public String getIssuingHouse() {
        return issuingHouse;
    }

    /**
     * @param issuingHouse the issuingHouse to set
     */
    public void setIssuingHouse(String issuingHouse) {
        this.issuingHouse = issuingHouse;
    }

    /**
     * @return the sharesSubscribedValue
     */
    public double getSharesSubscribedValue() {
        return sharesSubscribedValue;
    }

    /**
     * @param sharesSubscribedValue the sharesSubscribedValue to set
     */
    public void setSharesSubscribedValue(double sharesSubscribedValue) {
        this.sharesSubscribedValue = sharesSubscribedValue;
    }

    /**
     * @return the returnMoney
     */
    public double getReturnMoney() {
        return returnMoney;
    }

    /**
     * @param returnMoney the returnMoney to set
     */
    public void setReturnMoney(double returnMoney) {
        this.returnMoney = returnMoney;
    }

    /**
     * @return the cancelled
     */
    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * @param cancelled the cancelled to set
     */
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
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

   }
