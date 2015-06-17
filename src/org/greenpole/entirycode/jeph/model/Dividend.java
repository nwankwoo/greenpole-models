/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entirycode.jeph.model;

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
 * @author Jephthah Sadare
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"id", "clientCompanyId", "dividendDeclaredId","dividendIssueTypeId", 
    "holderCompanyAccountId", "warrantNumber", "clientCompName","issueType", "issueDate", 
    "divNumber", "yearType", "yearEnding","SHolderMailingAddr", "rate", 
    "compAccHoldings", "withldingTaxRate", "grossAmount","tax", "payableAmount", 
    "payableDate", "issued", "issuedDate","reIssued", "reIssuedDate", 
    "paid", "paidDate", "paymentMethod","unclaimed", "unclaimedDate", 
    "cancelled", "canelledDate", "dividenAnnotations"})

public class Dividend implements Serializable {

    @XmlElement
    private int id;
    @XmlElement
    private int clientCompanyId;//
    @XmlElement
    private int dividendDeclaredId;//
    @XmlElement
    private int dividendIssueTypeId;//
    @XmlElement
    private int holderCompanyAccountId;
    @XmlElement
    private int warrantNumber;
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
    private String yearEnding;//
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
    private boolean issued;//
    @XmlElement
    private String issuedDate;//
    @XmlElement
    private boolean reIssued;//
    @XmlElement
    private String reIssuedDate;//
    @XmlElement
    private boolean paid;//
    @XmlElement
    private String paidDate;//
    @XmlElement
    private String paymentMethod;//
    @XmlElement
    private boolean unclaimed;//
    @XmlElement
    private String unclaimedDate;//
    @XmlElement
    private boolean cancelled;//
    @XmlElement
    private String canelledDate;//
    @XmlElementWrapper(name = "dividenAnnotations")
    private List<DividendAnnotation> dividenAnnotations;//

    public Dividend() {
    }

    /**
     * 
     * @param id
     * @param clientCompanyId
     * @param dividendDeclaredId
     * @param dividendIssueTypeId
     * @param holderCompanyAccountId
     * @param warrantNumber
     * @param clientCompName
     * @param issueType
     * @param issueDate
     * @param divNumber
     * @param yearType
     * @param yearEnding
     * @param SHolderMailingAddr
     * @param rate
     * @param compAccHoldings
     * @param withldingTaxRate
     * @param grossAmount
     * @param tax
     * @param payableAmount
     * @param payableDate
     * @param issued
     * @param issuedDate
     * @param reIssued
     * @param reIssuedDate
     * @param paid
     * @param paidDate
     * @param paymentMethod
     * @param unclaimed
     * @param unclaimedDate
     * @param cancelled
     * @param canelledDate
     * @param dividenAnnotations 
     */
    public Dividend(int id, int clientCompanyId, int dividendDeclaredId, int dividendIssueTypeId, int holderCompanyAccountId, int warrantNumber, String clientCompName, String issueType, String issueDate, int divNumber, String yearType, String yearEnding, String SHolderMailingAddr, double rate, int compAccHoldings, double withldingTaxRate, double grossAmount, double tax, double payableAmount, String payableDate, boolean issued, String issuedDate, boolean reIssued, String reIssuedDate, Boolean paid, String paidDate, String paymentMethod, boolean unclaimed, String unclaimedDate, boolean cancelled, String canelledDate, List<DividendAnnotation> dividenAnnotations) {
        this.id = id;
        this.clientCompanyId = clientCompanyId;
        this.dividendDeclaredId = dividendDeclaredId;
        this.dividendIssueTypeId = dividendIssueTypeId;
        this.holderCompanyAccountId = holderCompanyAccountId;
        this.warrantNumber = warrantNumber;
        this.clientCompName = clientCompName;
        this.issueType = issueType;
        this.issueDate = issueDate;
        this.divNumber = divNumber;
        this.yearType = yearType;
        this.yearEnding = yearEnding;
        this.SHolderMailingAddr = SHolderMailingAddr;
        this.rate = rate;
        this.compAccHoldings = compAccHoldings;
        this.withldingTaxRate = withldingTaxRate;
        this.grossAmount = grossAmount;
        this.tax = tax;
        this.payableAmount = payableAmount;
        this.payableDate = payableDate;
        this.issued = issued;
        this.issuedDate = issuedDate;
        this.reIssued = reIssued;
        this.reIssuedDate = reIssuedDate;
        this.paid = paid;
        this.paidDate = paidDate;
        this.paymentMethod = paymentMethod;
        this.unclaimed = unclaimed;
        this.unclaimedDate = unclaimedDate;
        this.cancelled = cancelled;
        this.canelledDate = canelledDate;
        this.dividenAnnotations = dividenAnnotations;
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

    public int getDividendDeclaredId() {
        return dividendDeclaredId;
    }

    public void setDividendDeclaredId(int dividendDeclaredId) {
        this.dividendDeclaredId = dividendDeclaredId;
    }

    public int getDividendIssueTypeId() {
        return dividendIssueTypeId;
    }

    public void setDividendIssueTypeId(int dividendIssueTypeId) {
        this.dividendIssueTypeId = dividendIssueTypeId;
    }

    public int getHolderCompanyAccountId() {
        return holderCompanyAccountId;
    }

    public void setHolderCompanyAccountId(int holderCompanyAccountId) {
        this.holderCompanyAccountId = holderCompanyAccountId;
    }

    public int getWarrantNumber() {
        return warrantNumber;
    }

    public void setWarrantNumber(int warrantNumber) {
        this.warrantNumber = warrantNumber;
    }

    public String getClientCompName() {
        return clientCompName;
    }

    public void setClientCompName(String clientCompName) {
        this.clientCompName = clientCompName;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public int getDivNumber() {
        return divNumber;
    }

    public void setDivNumber(int divNumber) {
        this.divNumber = divNumber;
    }

    public String getYearType() {
        return yearType;
    }

    public void setYearType(String yearType) {
        this.yearType = yearType;
    }

    public String getYearEnding() {
        return yearEnding;
    }

    public void setYearEnding(String yearEnding) {
        this.yearEnding = yearEnding;
    }

    public String getSHolderMailingAddr() {
        return SHolderMailingAddr;
    }

    public void setSHolderMailingAddr(String SHolderMailingAddr) {
        this.SHolderMailingAddr = SHolderMailingAddr;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getCompAccHoldings() {
        return compAccHoldings;
    }

    public void setCompAccHoldings(int compAccHoldings) {
        this.compAccHoldings = compAccHoldings;
    }

    public double getWithldingTaxRate() {
        return withldingTaxRate;
    }

    public void setWithldingTaxRate(double withldingTaxRate) {
        this.withldingTaxRate = withldingTaxRate;
    }

    public double getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(double grossAmount) {
        this.grossAmount = grossAmount;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getPayableAmount() {
        return payableAmount;
    }

    public void setPayableAmount(double payableAmount) {
        this.payableAmount = payableAmount;
    }

    public String getPayableDate() {
        return payableDate;
    }

    public void setPayableDate(String payableDate) {
        this.payableDate = payableDate;
    }

    public boolean isIssued() {
        return issued;
    }

    public void setIssued(boolean issued) {
        this.issued = issued;
    }

    public String getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(String issuedDate) {
        this.issuedDate = issuedDate;
    }

    public boolean isReIssued() {
        return reIssued;
    }

    public void setReIssued(boolean reIssued) {
        this.reIssued = reIssued;
    }

    public String getReIssuedDate() {
        return reIssuedDate;
    }

    public void setReIssuedDate(String reIssuedDate) {
        this.reIssuedDate = reIssuedDate;
    }

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

    public String getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(String paidDate) {
        this.paidDate = paidDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public boolean isUnclaimed() {
        return unclaimed;
    }

    public void setUnclaimed(boolean unclaimed) {
        this.unclaimed = unclaimed;
    }

    public String getUnclaimedDate() {
        return unclaimedDate;
    }

    public void setUnclaimedDate(String unclaimedDate) {
        this.unclaimedDate = unclaimedDate;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public String getCanelledDate() {
        return canelledDate;
    }

    public void setCanelledDate(String canelledDate) {
        this.canelledDate = canelledDate;
    }

    public List<DividendAnnotation> getDividenAnnotations() {
        return dividenAnnotations;
    }

    public void setDividenAnnotations(List<DividendAnnotation> dividenAnnotations) {
        this.dividenAnnotations = dividenAnnotations;
    }

}
