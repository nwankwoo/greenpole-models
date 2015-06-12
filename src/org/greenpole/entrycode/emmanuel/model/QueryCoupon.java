/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entrycode.emmanuel.model;

import java.io.Serializable;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author user
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"descriptor","coupon","redemptionAmount","couponAmount"})
public class QueryCoupon implements Serializable {
    @XmlElement
     private String descriptor;
    @XmlElement
    private Coupon coupon;
    @XmlElementWrapper(name = "redemptionAmount")
    private Map<String, Double> redemptionAmount;
    @XmlElementWrapper(name = "couponAmount")
    private Map<String, Double> couponAmount;

    public QueryCoupon() {
    }

    public QueryCoupon(String descriptor, Coupon coupon, Map<String, Double> redemptionAmount, Map<String, Double> couponAmount) {
        this.descriptor = descriptor;
        this.coupon = coupon;
        this.redemptionAmount = redemptionAmount;
        this.couponAmount = couponAmount;
    }

    /**
     * @return the descriptor
     */
    public String getDescriptor() {
        return descriptor;
    }

    /**
     * @param descriptor the descriptor to set
     */
    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    /**
     * @return the coupon
     */
    public Coupon getCoupon() {
        return coupon;
    }

    /**
     * @param coupon the coupon to set
     */
    public void setCoupon(Coupon coupon) {
        this.coupon = coupon;
    }

    /**
     * @return the redemptionAmount
     */
    public Map<String, Double> getRedemptionAmount() {
        return redemptionAmount;
    }

    /**
     * @param redemptionAmount the redemptionAmount to set
     */
    public void setRedemptionAmount(Map<String, Double> redemptionAmount) {
        this.redemptionAmount = redemptionAmount;
    }

    /**
     * @return the couponAmount
     */
    public Map<String, Double> getCouponAmount() {
        return couponAmount;
    }

    /**
     * @param couponAmount the couponAmount to set
     */
    public void setCouponAmount(Map<String, Double> couponAmount) {
        this.couponAmount = couponAmount;
    }
    
}
