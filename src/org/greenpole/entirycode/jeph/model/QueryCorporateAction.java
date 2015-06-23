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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Jephthah Sadare
 */
@XmlRootElement
@XmlSeeAlso({Dividend.class, DividendDeclared.class, ShareBonus.class})
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"descriptor", "dividend", "dividendDeclared", "shareBonus", "startDate", "endDate"})

public class QueryCorporateAction implements Serializable {

    @XmlElement
    private String descriptor;
    @XmlElementWrapper(name = "dividend")
    private List<Dividend> dividend;
    @XmlElementWrapper(name = "dividendDeclared")
    private List<DividendDeclared> dividendDeclared;
    @XmlElementWrapper(name = "shareBonus")
    private List<ShareBonus> shareBonus;
    @XmlElement
    private String startDate;
    @XmlElement
    private String endDate;

    public QueryCorporateAction() {
    }

    public QueryCorporateAction(String descriptor, List<Dividend> dividend, List<DividendDeclared> dividendDeclared, List<ShareBonus> shareBonus, String startDate, String endDate) {
        this.descriptor = descriptor;
        this.dividend = dividend;
        this.dividendDeclared = dividendDeclared;
        this.shareBonus = shareBonus;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    public List<Dividend> getDividend() {
        return dividend;
    }

    public void setDividend(List<Dividend> dividend) {
        this.dividend = dividend;
    }

    public List<DividendDeclared> getDividendDeclared() {
        return dividendDeclared;
    }

    public void setDividendDeclared(List<DividendDeclared> dividendDeclared) {
        this.dividendDeclared = dividendDeclared;
    }

    public List<ShareBonus> getShareBonus() {
        return shareBonus;
    }

    public void setShareBonus(List<ShareBonus> shareBonus) {
        this.shareBonus = shareBonus;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

}
