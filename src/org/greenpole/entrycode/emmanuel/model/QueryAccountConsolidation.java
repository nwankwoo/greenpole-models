/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entrycode.emmanuel.model;

import org.greenpole.entity.model.holder.QueryHolderConsolidation;
import org.greenpole.entity.model.holder.merge.AccountConsolidation;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author user
 */
@XmlRootElement
@XmlSeeAlso({})
@XmlAccessorType(XmlAccessType.NONE)
public class QueryAccountConsolidation {

    @XmlElement
    private QueryHolderConsolidation queryConsolidationOfShareholderAccount;
    @XmlElementWrapper(name = "accountConsolidation")
    private List<AccountConsolidation> accountConsolidation;

    public QueryAccountConsolidation() {
    }

    public QueryAccountConsolidation(QueryHolderConsolidation queryConsolidationOfShareholderAccount, List<AccountConsolidation> accountConsolidation) {
        this.queryConsolidationOfShareholderAccount = queryConsolidationOfShareholderAccount;
        this.accountConsolidation = accountConsolidation;
    }

    /**
     * @return the queryConsolidationOfShareholderAccount
     */
    public QueryHolderConsolidation getQueryConsolidationOfShareholderAccount() {
        return queryConsolidationOfShareholderAccount;
    }

    /**
     * @param queryConsolidationOfShareholderAccount the queryConsolidationOfShareholderAccount to set
     */
    public void setQueryConsolidationOfShareholderAccount(QueryHolderConsolidation queryConsolidationOfShareholderAccount) {
        this.queryConsolidationOfShareholderAccount = queryConsolidationOfShareholderAccount;
    }

    /**
     * @return the accountConsolidation
     */
    public List<AccountConsolidation> getAccountConsolidation() {
        return accountConsolidation;
    }

    /**
     * @param accountConsolidation the accountConsolidation to set
     */
    public void setAccountConsolidation(List<AccountConsolidation> accountConsolidation) {
        this.accountConsolidation = accountConsolidation;
    }

    
}
