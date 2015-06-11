/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entrycode.emmanuel.model;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author user
 */
@XmlRootElement
public class ClientCompanyMerger {
 @XmlElement
 private ClientCompany primaryClientCompany;   
 @XmlElementWrapper(name = "secondaryClientCompany")
 private List<ClientCompany> secondaryClientCompany;

    public ClientCompanyMerger() {
    }

    public ClientCompanyMerger(ClientCompany primaryClientCompany, List<ClientCompany> secondaryClientCompany) {
        this.primaryClientCompany = primaryClientCompany;
        this.secondaryClientCompany = secondaryClientCompany;
    }

    /**
     * @return the primaryClientCompany
     */
    public ClientCompany getPrimaryClientCompany() {
        return primaryClientCompany;
    }

    /**
     * @param primaryClientCompany the primaryClientCompany to set
     */
    public void setPrimaryClientCompany(ClientCompany primaryClientCompany) {
        this.primaryClientCompany = primaryClientCompany;
    }

    /**
     * @return the secondaryClientCompany
     */
    public List<ClientCompany> getSecondaryClientCompany() {
        return secondaryClientCompany;
    }

    /**
     * @param secondaryClientCompany the secondaryClientCompany to set
     */
    public void setSecondaryClientCompany(List<ClientCompany> secondaryClientCompany) {
        this.secondaryClientCompany = secondaryClientCompany;
    }
 
}
