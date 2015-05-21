/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model.holder;

import java.io.Serializable;
import org.greenpole.entity.model.holder.merge.AccountConsolidation;
import org.greenpole.entity.model.holder.merge.CompanyAccountConsolidation;
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
 * @author Akin Agbaje
 * Utilised in querying holder consolidation - holder account merge details
 */
@XmlRootElement
@XmlSeeAlso({CompanyAccountConsolidation.class,AccountConsolidation.class})
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"descriptor", "accountConsolidation", "companyAccountConsolidation",
    "startDate", "endDate"})
public class QueryHolderConsolidation implements Serializable {
    //descriptor must be date:none / date:exact / date:between / date:before / date:after
    @XmlElement
    private String descriptor;
    @XmlElementWrapper(name = "companyAccountConsolidation")
    private List<CompanyAccountConsolidation> companyAccountConsolidation;
    @XmlElementWrapper(name = "accountConsolidation")
    private List<AccountConsolidation> accountConsolidation;
    @XmlElement
    private String startDate;
    @XmlElement
    private String endDate;

    public QueryHolderConsolidation() {
    }

    public QueryHolderConsolidation(String descriptor, List<CompanyAccountConsolidation> companyAccountConsolidation, List<AccountConsolidation> accountConsolidation, String startDate, String endDate) {
        this.descriptor = descriptor;
        this.companyAccountConsolidation = companyAccountConsolidation;
        this.accountConsolidation = accountConsolidation;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    public List<CompanyAccountConsolidation> getCompanyAccountConsolidation() {
        return companyAccountConsolidation;
    }

    public void setCompanyAccountConsolidation(List<CompanyAccountConsolidation> companyAccountConsolidation) {
        this.companyAccountConsolidation = companyAccountConsolidation;
    }

    public List<AccountConsolidation> getAccountConsolidation() {
        return accountConsolidation;
    }

    public void setAccountConsolidation(List<AccountConsolidation> accountConsolidation) {
        this.accountConsolidation = accountConsolidation;
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
