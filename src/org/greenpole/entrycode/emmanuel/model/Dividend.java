/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entrycode.emmanuel.model;

import java.io.Serializable;
import java.util.List;
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
@XmlType(propOrder = {"id","clientCompanyId","dividendDeclaredId","dividendIssueTypeId","holderCompanyAccountId","warrantNumber","clientCompName","issueType",
    "issueDate","divNumber","yearType","yearEnding","SHolderMailingAddr","rate","compAccHoldings","withldingTaxRate","grossAmount","tax","payableAmount",
    "payableDate","issued","issuedDate","reIssued","reIssuedDate","paid","paidDate","paymentMethod","unclaimed","unclaimedDate","cancelled","canelledDate","dividenAnnotation"})
public class Dividend implements Serializable {
  @XmlElement
     private int id;
  @XmlElement
     private int clientCompanyId;
  @XmlElement
     private int dividendDeclaredId;
  @XmlElement
     private int dividendIssueTypeId;
  @XmlElement
     private int holderCompanyAccountId;
  @XmlElement
     private long warrantNumber;
  @XmlElement
     private String clientCompName;
  @XmlElement
     private String issueType;
  @XmlElement
     private String issueDate;
  @XmlElement
     private int divNumber;
  @XmlElement
     private String yearType;
  @XmlElement
     private String yearEnding;
  @XmlElement
     private String SHolderMailingAddr;
  @XmlElement
     private double rate;
  @XmlElement
     private int compAccHoldings;
  @XmlElement
     private double withldingTaxRate;
  @XmlElement
     private double grossAmount;
  @XmlElement
     private double tax;
  @XmlElement
     private double payableAmount;
  @XmlElement
     private String payableDate;
  @XmlElement
     private boolean issued;
  @XmlElement
     private String issuedDate;
  @XmlElement
     private boolean reIssued;
  @XmlElement
     private String reIssuedDate;
  @XmlElement
     private boolean paid;
  @XmlElement
     private String paidDate;
  @XmlElement
     private String paymentMethod;
  @XmlElement
     private boolean unclaimed;
  @XmlElement
     private String unclaimedDate;
  @XmlElement
     private boolean cancelled;
  @XmlElement
     private String canelledDate; 
  @XmlElementWrapper(name = "dividenAnnotation ")
     private List<DividenAnnotation> dividenAnnotation;

    public Dividend() {
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
     * @return the dividendDeclaredId
     */
    public int getDividendDeclaredId() {
        return dividendDeclaredId;
    }

    /**
     * @param dividendDeclaredId the dividendDeclaredId to set
     */
    public void setDividendDeclaredId(int dividendDeclaredId) {
        this.dividendDeclaredId = dividendDeclaredId;
    }

    /**
     * @return the dividendIssueTypeId
     */
    public int getDividendIssueTypeId() {
        return dividendIssueTypeId;
    }

    /**
     * @param dividendIssueTypeId the dividendIssueTypeId to set
     */
    public void setDividendIssueTypeId(int dividendIssueTypeId) {
        this.dividendIssueTypeId = dividendIssueTypeId;
    }

    /**
     * @return the holderCompanyAccount
     */
    public int getHolderCompanyAccountId() {
        return holderCompanyAccountId;
    }

    /**
     * @param holderCompanyAccountId
     */
    public void setHolderCompanyAccountId(int holderCompanyAccountId) {
        this.holderCompanyAccountId = holderCompanyAccountId;
    }

    /**
     * @return the warrantNumber
     */
    public long getWarrantNumber() {
        return warrantNumber;
    }

    /**
     * @param warrantNumber the warrantNumber to set
     */
    public void setWarrantNumber(long warrantNumber) {
        this.warrantNumber = warrantNumber;
    }

    /**
     * @return the clientCompName
     */
    public String getClientCompName() {
        return clientCompName;
    }

    /**
     * @param clientCompName the clientCompName to set
     */
    public void setClientCompName(String clientCompName) {
        this.clientCompName = clientCompName;
    }

    /**
     * @return the issueType
     */
    public String getIssueType() {
        return issueType;
    }

    /**
     * @param issueType the issueType to set
     */
    public void setIssueType(String issueType) {
        this.issueType = issueType;
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
     * @return the divNumber
     */
    public int getDivNumber() {
        return divNumber;
    }

    /**
     * @param divNumber the divNumber to set
     */
    public void setDivNumber(int divNumber) {
        this.divNumber = divNumber;
    }

    /**
     * @return the yearType
     */
    public String getYearType() {
        return yearType;
    }

    /**
     * @param yearType the yearType to set
     */
    public void setYearType(String yearType) {
        this.yearType = yearType;
    }

    /**
     * @return the yearEnding
     */
    public String getYearEnding() {
        return yearEnding;
    }

    /**
     * @param yearEnding the yearEnding to set
     */
    public void setYearEnding(String yearEnding) {
        this.yearEnding = yearEnding;
    }

    /**
     * @return the SHolderMailingAddr
     */
    public String getSHolderMailingAddr() {
        return SHolderMailingAddr;
    }

    /**
     * @param SHolderMailingAddr the SHolderMailingAddr to set
     */
    public void setSHolderMailingAddr(String SHolderMailingAddr) {
        this.SHolderMailingAddr = SHolderMailingAddr;
    }

    /**
     * @return the rate
     */
    public double getRate() {
        return rate;
    }

    /**
     * @param rate the rate to set
     */
    public void setRate(double rate) {
        this.rate = rate;
    }

    /**
     * @return the compAccHoldings
     */
    public int getCompAccHoldings() {
        return compAccHoldings;
    }

    /**
     * @param compAccHoldings the compAccHoldings to set
     */
    public void setCompAccHoldings(int compAccHoldings) {
        this.compAccHoldings = compAccHoldings;
    }

    /**
     * @return the withldingTaxRate
     */
    public double getWithldingTaxRate() {
        return withldingTaxRate;
    }

    /**
     * @param withldingTaxRate the withldingTaxRate to set
     */
    public void setWithldingTaxRate(double withldingTaxRate) {
        this.withldingTaxRate = withldingTaxRate;
    }

    /**
     * @return the grossAmount
     */
    public double getGrossAmount() {
        return grossAmount;
    }

    /**
     * @param grossAmount the grossAmount to set
     */
    public void setGrossAmount(double grossAmount) {
        this.grossAmount = grossAmount;
    }

    /**
     * @return the tax
     */
    public double getTax() {
        return tax;
    }

    /**
     * @param tax the tax to set
     */
    public void setTax(double tax) {
        this.tax = tax;
    }

    /**
     * @return the payableAmount
     */
    public double getPayableAmount() {
        return payableAmount;
    }

    /**
     * @param payableAmount the payableAmount to set
     */
    public void setPayableAmount(double payableAmount) {
        this.payableAmount = payableAmount;
    }

    /**
     * @return the payableDate
     */
    public String getPayableDate() {
        return payableDate;
    }

    /**
     * @param payableDate the payableDate to set
     */
    public void setPayableDate(String payableDate) {
        this.payableDate = payableDate;
    }

    /**
     * @return the issued
     */
    public boolean isIssued() {
        return issued;
    }

    /**
     * @param issued the issued to set
     */
    public void setIssued(boolean issued) {
        this.issued = issued;
    }

    /**
     * @return the issuedDate
     */
    public String getIssuedDate() {
        return issuedDate;
    }

    /**
     * @param issuedDate the issuedDate to set
     */
    public void setIssuedDate(String issuedDate) {
        this.issuedDate = issuedDate;
    }

    /**
     * @return the reIssued
     */
    public boolean isReIssued() {
        return reIssued;
    }

    /**
     * @param reIssued the reIssued to set
     */
    public void setReIssued(boolean reIssued) {
        this.reIssued = reIssued;
    }

    /**
     * @return the reIssuedDate
     */
    public String getReIssuedDate() {
        return reIssuedDate;
    }

    /**
     * @param reIssuedDate the reIssuedDate to set
     */
    public void setReIssuedDate(String reIssuedDate) {
        this.reIssuedDate = reIssuedDate;
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

    /**
     * @return the paymentMethod
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * @param paymentMethod the paymentMethod to set
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * @return the unclaimed
     */
    public boolean isUnclaimed() {
        return unclaimed;
    }

    /**
     * @param unclaimed the unclaimed to set
     */
    public void setUnclaimed(boolean unclaimed) {
        this.unclaimed = unclaimed;
    }

    /**
     * @return the unclaimedDate
     */
    public String getUnclaimedDate() {
        return unclaimedDate;
    }

    /**
     * @param unclaimedDate the unclaimedDate to set
     */
    public void setUnclaimedDate(String unclaimedDate) {
        this.unclaimedDate = unclaimedDate;
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
     * @return the canelledDate
     */
    public String getCanelledDate() {
        return canelledDate;
    }

    /**
     * @param canelledDate the canelledDate to set
     */
    public void setCanelledDate(String canelledDate) {
        this.canelledDate = canelledDate;
    }

    /**
     * @return the dividenAnnotation
     */
    public List<DividenAnnotation> getDividenAnnotation() {
        return dividenAnnotation;
    }

    /**
     * @param dividenAnnotation the dividenAnnotation to set
     */
    public void setDividenAnnotation(List<DividenAnnotation> dividenAnnotation) {
        this.dividenAnnotation = dividenAnnotation;
    }

     
}
