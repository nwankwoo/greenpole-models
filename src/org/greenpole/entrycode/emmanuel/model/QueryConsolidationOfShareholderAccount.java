/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entrycode.emmanuel.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author user
 */
@XmlRootElement
@XmlSeeAlso({})
@XmlAccessorType(XmlAccessType.NONE)
public class QueryConsolidationOfShareholderAccount {

    @XmlElement
    private String descriptor;
    @XmlElement
    private CompanyAccountConsolidation companyAccountConsolidation;
    @XmlElement
    private AccountConsolidation AccountConsolidation;
    @XmlElement
    private String start_date;
    @XmlElement
    private String end_date;

    public QueryConsolidationOfShareholderAccount() {
    }

    public QueryConsolidationOfShareholderAccount(String descriptor, CompanyAccountConsolidation companyAccountConsolidation, AccountConsolidation AccountConsolidation, String start_date, String end_date) {
        this.descriptor = descriptor;
        this.companyAccountConsolidation = companyAccountConsolidation;
        this.AccountConsolidation = AccountConsolidation;
        this.start_date = start_date;
        this.end_date = end_date;
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
     * @return the companyAccountConsolidation
     */
    public CompanyAccountConsolidation getCompanyAccountConsolidation() {
        return companyAccountConsolidation;
    }

    /**
     * @param companyAccountConsolidation the companyAccountConsolidation to set
     */
    public void setCompanyAccountConsolidation(CompanyAccountConsolidation companyAccountConsolidation) {
        this.companyAccountConsolidation = companyAccountConsolidation;
    }

    /**
     * @return the AccountConsolidation
     */
    public AccountConsolidation getAccountConsolidation() {
        return AccountConsolidation;
    }

    /**
     * @param AccountConsolidation the AccountConsolidation to set
     */
    public void setAccountConsolidation(AccountConsolidation AccountConsolidation) {
        this.AccountConsolidation = AccountConsolidation;
    }

    /**
     * @return the start_date
     */
    public String getStart_date() {
        return start_date;
    }

    /**
     * @param start_date the start_date to set
     */
    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    /**
     * @return the end_date
     */
    public String getEnd_date() {
        return end_date;
    }

    /**
     * @param end_date the end_date to set
     */
    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

}
