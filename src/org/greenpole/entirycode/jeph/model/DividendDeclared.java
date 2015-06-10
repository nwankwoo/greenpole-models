/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entirycode.jeph.model;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

/**
 *
 * @author Jephthah Sadare
 */
public class DividendDeclared implements Serializable {

    @XmlElement
    private int id;
    @XmlElement
    private int clientCompanyId;
    @XmlElement
    private String yearType;// interim or final
    @XmlElement
    private String issueType;
    @XmlElement
    private String qualifyDate;
    @XmlElement
    private double withholdingTaxRateInd;
    @XmlElement
    private double withholdingTaxRateCorp;
    @XmlElement
    private int yearEnding;
    @XmlElement
    private String datePayable;
    @XmlElement
    private double rate;
    @XmlElementWrapper
    private List<Dividend> dividends;
    @XmlElementWrapper
    private List<DividendSettlement> dividendSettlements;

    public DividendDeclared() {
    }

    /**
     * 
     * @param id
     * @param clientCompanyId
     * @param yearType
     * @param issueType
     * @param qualifyDate
     * @param withholdingTaxRateInd
     * @param withholdingTaxRateCorp
     * @param yearEnding
     * @param datePayable
     * @param rate
     * @param dividends
     * @param dividendSettlements 
     */
    public DividendDeclared(int id, int clientCompanyId, String yearType, String issueType, String qualifyDate, double withholdingTaxRateInd, double withholdingTaxRateCorp, int yearEnding, String datePayable, double rate, List<Dividend> dividends, List<DividendSettlement> dividendSettlements) {
        this.id = id;
        this.clientCompanyId = clientCompanyId;
        this.yearType = yearType;
        this.issueType = issueType;
        this.qualifyDate = qualifyDate;
        this.withholdingTaxRateInd = withholdingTaxRateInd;
        this.withholdingTaxRateCorp = withholdingTaxRateCorp;
        this.yearEnding = yearEnding;
        this.datePayable = datePayable;
        this.rate = rate;
        this.dividends = dividends;
        this.dividendSettlements = dividendSettlements;
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

    public String getYearType() {
        return yearType;
    }

    public void setYearType(String yearType) {
        this.yearType = yearType;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    public String getQualifyDate() {
        return qualifyDate;
    }

    public void setQualifyDate(String qualifyDate) {
        this.qualifyDate = qualifyDate;
    }

    public double getWithholdingTaxRateInd() {
        return withholdingTaxRateInd;
    }

    public void setWithholdingTaxRateInd(double withholdingTaxRateInd) {
        this.withholdingTaxRateInd = withholdingTaxRateInd;
    }

    public double getWithholdingTaxRateCorp() {
        return withholdingTaxRateCorp;
    }

    public void setWithholdingTaxRateCorp(double withholdingTaxRateCorp) {
        this.withholdingTaxRateCorp = withholdingTaxRateCorp;
    }

    public int getYearEnding() {
        return yearEnding;
    }

    public void setYearEnding(int yearEnding) {
        this.yearEnding = yearEnding;
    }

    public String getDatePayable() {
        return datePayable;
    }

    public void setDatePayable(String datePayable) {
        this.datePayable = datePayable;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public List<Dividend> getDividends() {
        return dividends;
    }

    public void setDividends(List<Dividend> dividends) {
        this.dividends = dividends;
    }

    public List<DividendSettlement> getDividendSettlements() {
        return dividendSettlements;
    }

    public void setDividendSettlements(List<DividendSettlement> dividendSettlements) {
        this.dividendSettlements = dividendSettlements;
    }

}
