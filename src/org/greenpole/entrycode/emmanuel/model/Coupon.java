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

/**
 *
 * @author user
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"id","holderBondAccountId","clientCompanyName","issueDate","couponNumber","bondTypeId","redemptionAmt","couponAmt","bondholderMailingAddress",
    "redemptnDate","totalPymtsToBMade","totalPaymtsMade","paid","paidDate"})
public class Coupon implements Serializable {
    @XmlElement
     private int id;
    @XmlElement
     private int holderBondAccountId;
    @XmlElement
     private String clientCompanyName;
    @XmlElement
     private String issueDate;
    @XmlElement
     private int couponNumber;
    @XmlElement
     private int bondTypeId;
    @XmlElement
     private double redemptionAmt;
    @XmlElement
     private double couponAmt;
     @XmlElement
     private String bondholderMailingAddress;
     @XmlElement
     private String redemptnDate;
     @XmlElement
     private double totalPymtsToBMade;
     @XmlElement
     private double totalPaymtsMade;
     @XmlElement
     private boolean paid;
     @XmlElement
     private String paidDate;

    public Coupon() {
    }
    public Coupon(int id, int holderBondAccountId, String clientCompanyName, String issueDate, int couponNumber, int bondTypeId, double redemptionAmt, double couponAmt, String bondholderMailingAddress, String redemptnDate, double totalPymtsToBMade, double totalPaymtsMade, boolean paid, String paidDate) {
        this.id = id;
        this.holderBondAccountId = holderBondAccountId;
        this.clientCompanyName = clientCompanyName;
        this.issueDate = issueDate;
        this.couponNumber = couponNumber;
        this.bondTypeId = bondTypeId;
        this.redemptionAmt = redemptionAmt;
        this.couponAmt = couponAmt;
        this.bondholderMailingAddress = bondholderMailingAddress;
        this.redemptnDate = redemptnDate;
        this.totalPymtsToBMade = totalPymtsToBMade;
        this.totalPaymtsMade = totalPaymtsMade;
        this.paid = paid;
        this.paidDate = paidDate;
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
     * @return the holderBondAccountId
     */
    public int getHolderBondAccountId() {
        return holderBondAccountId;
    }

    /**
     * @param holderBondAccountId the holderBondAccountId to set
     */
    public void setHolderBondAccountId(int holderBondAccountId) {
        this.holderBondAccountId = holderBondAccountId;
    }

    /**
     * @return the clientCompanyName
     */
    public String getClientCompanyName() {
        return clientCompanyName;
    }

    /**
     * @param clientCompanyName the clientCompanyName to set
     */
    public void setClientCompanyName(String clientCompanyName) {
        this.clientCompanyName = clientCompanyName;
    }

    /**
     * @return the issueDate
     */
    public String getIssueDate() {
        return issueDate;
    }

    /**
     * @param issueDate the issueDate to set
     */
    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    /**
     * @return the couponNumber
     */
    public int getCouponNumber() {
        return couponNumber;
    }

    /**
     * @param couponNumber the couponNumber to set
     */
    public void setCouponNumber(int couponNumber) {
        this.couponNumber = couponNumber;
    }

    /**
     * @return the bondTypeId
     */
    public int getBondTypeId() {
        return bondTypeId;
    }

    /**
     * @param bondTypeId the bondTypeId to set
     */
    public void setBondTypeId(int bondTypeId) {
        this.bondTypeId = bondTypeId;
    }

    /**
     * @return the redemptionAmt
     */
    public double getRedemptionAmt() {
        return redemptionAmt;
    }

    /**
     * @param redemptionAmt the redemptionAmt to set
     */
    public void setRedemptionAmt(double redemptionAmt) {
        this.redemptionAmt = redemptionAmt;
    }

    /**
     * @return the couponAmt
     */
    public double getCouponAmt() {
        return couponAmt;
    }

    /**
     * @param couponAmt the couponAmt to set
     */
    public void setCouponAmt(double couponAmt) {
        this.couponAmt = couponAmt;
    }

    /**
     * @return the bondholderMailingAddress
     */
    public String getBondholderMailingAddress() {
        return bondholderMailingAddress;
    }

    /**
     * @param bondholderMailingAddress the bondholderMailingAddress to set
     */
    public void setBondholderMailingAddress(String bondholderMailingAddress) {
        this.bondholderMailingAddress = bondholderMailingAddress;
    }

    /**
     * @return the redemptnDate
     */
    public String getRedemptnDate() {
        return redemptnDate;
    }

    /**
     * @param redemptnDate the redemptnDate to set
     */
    public void setRedemptnDate(String redemptnDate) {
        this.redemptnDate = redemptnDate;
    }

    /**
     * @return the totalPymtsToBMade
     */
    public double getTotalPymtsToBMade() {
        return totalPymtsToBMade;
    }

    /**
     * @param totalPymtsToBMade the totalPymtsToBMade to set
     */
    public void setTotalPymtsToBMade(double totalPymtsToBMade) {
        this.totalPymtsToBMade = totalPymtsToBMade;
    }

    /**
     * @return the totalPaymtsMade
     */
    public double getTotalPaymtsMade() {
        return totalPaymtsMade;
    }

    /**
     * @param totalPaymtsMade the totalPaymtsMade to set
     */
    public void setTotalPaymtsMade(double totalPaymtsMade) {
        this.totalPaymtsMade = totalPaymtsMade;
    }

    /**
     * @return the paid
     */
    public boolean isPaid() {
        return paid;
    }

    /**
     * @param paid the paid to set
     */
    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    /**
     * @return the paidDate
     */
    public String getPaidDate() {
        return paidDate;
    }

    /**
     * @param paidDate the paidDate to set
     */
    public void setPaidDate(String paidDate) {
        this.paidDate = paidDate;
    }

    }
