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
import org.greenpole.entirycode.jeph.model.DividendDeclared;
import org.greenpole.entirycode.jeph.model.DividendSettlement;
import org.greenpole.entity.model.holder.HolderCompanyAccount;

/**
 *
 * @author user
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"divdendDeclared","dividendSettlement","paidShareholders","unpaidShareholders"})
public class CorporateActionReport implements Serializable {

    @XmlElement
    private DividendDeclared divdendDeclared;
    @XmlElementWrapper(name = "dividendSettlement")
    private List<DividendSettlement> dividendSettlement;
    @XmlElementWrapper(name = "paidShareholders")
    private List<HolderCompanyAccount> paidShareholders;
    @XmlElementWrapper(name = "unpaidShareholders")
    private List<HolderCompanyAccount> unpaidShareholders;

    public CorporateActionReport() {
    }

    public CorporateActionReport(DividendDeclared divdendDeclared, List<DividendSettlement> dividendSettlement, List<HolderCompanyAccount> paidShareholders, List<HolderCompanyAccount> unpaidShareholders) {
        this.divdendDeclared = divdendDeclared;
        this.dividendSettlement = dividendSettlement;
        this.paidShareholders = paidShareholders;
        this.unpaidShareholders = unpaidShareholders;
    }

    public CorporateActionReport(List<DividendSettlement> dividendSettlement, List<HolderCompanyAccount> paidShareholders, List<HolderCompanyAccount> unpaidShareholders) {
        this.dividendSettlement = dividendSettlement;
        this.paidShareholders = paidShareholders;
        this.unpaidShareholders = unpaidShareholders;
    }

    /**
     * @return the divdendDeclared
     */
    public DividendDeclared getDivdendDeclared() {
        return divdendDeclared;
    }

    /**
     * @param divdendDeclared the divdendDeclared to set
     */
    public void setDivdendDeclared(DividendDeclared divdendDeclared) {
        this.divdendDeclared = divdendDeclared;
    }

    /**
     * @return the dividendSettlement
     */
    public List<DividendSettlement> getDividendSettlement() {
        return dividendSettlement;
    }

    /**
     * @param dividendSettlement the dividendSettlement to set
     */
    public void setDividendSettlement(List<DividendSettlement> dividendSettlement) {
        this.dividendSettlement = dividendSettlement;
    }

    /**
     * @return the paidShareholders
     */
    public List<HolderCompanyAccount> getPaidShareholders() {
        return paidShareholders;
    }

    /**
     * @param paidShareholders the paidShareholders to set
     */
    public void setPaidShareholders(List<HolderCompanyAccount> paidShareholders) {
        this.paidShareholders = paidShareholders;
    }

    /**
     * @return the unpaidShareholders
     */
    public List<HolderCompanyAccount> getUnpaidShareholders() {
        return unpaidShareholders;
    }

    /**
     * @param unpaidShareholders the unpaidShareholders to set
     */
    public void setUnpaidShareholders(List<HolderCompanyAccount> unpaidShareholders) {
        this.unpaidShareholders = unpaidShareholders;
    }

    }
