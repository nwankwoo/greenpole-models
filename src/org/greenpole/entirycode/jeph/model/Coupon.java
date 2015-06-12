/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entirycode.jeph.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Jephthah Sadare
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"id", "holderBondAccountId", "clientCompanyId",
    "clientCompanyName", "issueDate", "couponNumber", "bondType",
    "redemptionAmt", "couponAmt", "bondholderMailingAddress", "redemptnDate",
    "totalPymtsToBMade", "totalPaymtsMade", "paid", "paidDate"})

public class Coupon implements Serializable {

    @XmlElement
    private int id;
    @XmlElement
    private int holderBondAccountId;
    @XmlElement
    private int clientCompanyId;
    @XmlElement
    private String clientCompanyName;
    @XmlElement
    private String issueDate;
    @XmlElement
    private int couponNumber;
    @XmlElement
    private String bondType;
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
    
    /**
     * 
     * @param id
     * @param holderBondAccountId
     * @param clientCompanyId
     * @param clientCompanyName
     * @param issueDate
     * @param couponNumber
     * @param bondType
     * @param redemptionAmt
     * @param couponAmt
     * @param bondholderMailingAddress
     * @param redemptnDate
     * @param totalPymtsToBMade
     * @param totalPaymtsMade
     * @param paid
     * @param paidDate 
     */
    public Coupon(int id, int holderBondAccountId, int clientCompanyId, String clientCompanyName, String issueDate, int couponNumber, String bondType, double redemptionAmt, double couponAmt, String bondholderMailingAddress, String redemptnDate, double totalPymtsToBMade, double totalPaymtsMade, boolean paid, String paidDate) {
        this.id = id;
        this.holderBondAccountId = holderBondAccountId;
        this.clientCompanyId = clientCompanyId;
        this.clientCompanyName = clientCompanyName;
        this.issueDate = issueDate;
        this.couponNumber = couponNumber;
        this.bondType = bondType;
        this.redemptionAmt = redemptionAmt;
        this.couponAmt = couponAmt;
        this.bondholderMailingAddress = bondholderMailingAddress;
        this.redemptnDate = redemptnDate;
        this.totalPymtsToBMade = totalPymtsToBMade;
        this.totalPaymtsMade = totalPaymtsMade;
        this.paid = paid;
        this.paidDate = paidDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHolderBondAccountId() {
        return holderBondAccountId;
    }

    public void setHolderBondAccountId(int holderBondAccountId) {
        this.holderBondAccountId = holderBondAccountId;
    }

    public int getClientCompanyId() {
        return clientCompanyId;
    }

    public void setClientCompanyId(int clientCompanyId) {
        this.clientCompanyId = clientCompanyId;
    }

    public String getClientCompanyName() {
        return clientCompanyName;
    }

    public void setClientCompanyName(String clientCompanyName) {
        this.clientCompanyName = clientCompanyName;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public int getCouponNumber() {
        return couponNumber;
    }

    public void setCouponNumber(int couponNumber) {
        this.couponNumber = couponNumber;
    }

    public String getBondType() {
        return bondType;
    }

    public void setBondType(String bondType) {
        this.bondType = bondType;
    }

    public double getRedemptionAmt() {
        return redemptionAmt;
    }

    public void setRedemptionAmt(double redemptionAmt) {
        this.redemptionAmt = redemptionAmt;
    }

    public double getCouponAmt() {
        return couponAmt;
    }

    public void setCouponAmt(double couponAmt) {
        this.couponAmt = couponAmt;
    }

    public String getBondholderMailingAddress() {
        return bondholderMailingAddress;
    }

    public void setBondholderMailingAddress(String bondholderMailingAddress) {
        this.bondholderMailingAddress = bondholderMailingAddress;
    }

    public String getRedemptnDate() {
        return redemptnDate;
    }

    public void setRedemptnDate(String redemptnDate) {
        this.redemptnDate = redemptnDate;
    }

    public double getTotalPymtsToBMade() {
        return totalPymtsToBMade;
    }

    public void setTotalPymtsToBMade(double totalPymtsToBMade) {
        this.totalPymtsToBMade = totalPymtsToBMade;
    }

    public double getTotalPaymtsMade() {
        return totalPaymtsMade;
    }

    public void setTotalPaymtsMade(double totalPaymtsMade) {
        this.totalPaymtsMade = totalPaymtsMade;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public String getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(String paidDate) {
        this.paidDate = paidDate;
    }

}
