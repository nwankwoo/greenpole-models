/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entirycode.jeph.model;

import java.io.Serializable;
import java.security.Signature;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.greenpole.entity.model.Address;
import org.greenpole.entity.model.EmailAddress;
import org.greenpole.entity.model.PhoneNumber;
import org.greenpole.entity.model.holder.Holder;

/**
 *
 * @author Jephthah Sadare
 */
@XmlRootElement
@XmlSeeAlso({Address.class, PhoneNumber.class, Holder.class,
    StockbrokerAgent.class, Signature.class, EmailAddress.class})
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"id", "name", "cscsAccNo", "active", "valid",
    "stockbrokerAddresses", "stockbrokerPhoneNumbers", "holders",
    "stockbrokerAgents", "stockbrokerSignatures", "stockbrokerEmailAddresses"})

public class Stockbroker implements Serializable {

    @XmlElement
    private int id;
    @XmlElement
    private String name;
    @XmlElement
    private String cscsAccNo;
    @XmlElement
    private boolean active;
    @XmlElement
    private boolean valid;
    @XmlElementWrapper(name = "stockbrokerAddresses")
    private List<Address> stockbrokerAddresses;
    @XmlElementWrapper(name = "stockbrokerPhoneNumbers")
    private List<PhoneNumber> stockbrokerPhoneNumbers;
    @XmlElementWrapper(name = "holders")
    private List<Holder> holders;
    @XmlElementWrapper(name = "stockbrokerAgents")
    private List<StockbrokerAgent> stockbrokerAgents;
    @XmlElementWrapper(name = "stockbrokerSignatures")
    private List<Signature> stockbrokerSignatures;
    @XmlElementWrapper(name = "stockbrokerEmailAddresses")
    private List<EmailAddress> stockbrokerEmailAddresses;

    @XmlElement
    private int noOfShareholders;
    @XmlElement
    private int noOfBondholders;
    @XmlElement
    private int noOfLodgedCertificates;

    public Stockbroker() {
    }

    /**
     *
     * @param id
     * @param name
     * @param cscsAccNo
     * @param active
     * @param valid
     * @param stockbrokerAddresses
     * @param stockbrokerPhoneNumbers
     * @param holders
     * @param stockbrokerAgents
     * @param stockbrokerSignatures
     * @param stockbrokerEmailAddresses
     */
    public Stockbroker(int id, String name, String cscsAccNo, boolean active, boolean valid, List<Address> stockbrokerAddresses, List<PhoneNumber> stockbrokerPhoneNumbers, List<Holder> holders, List<StockbrokerAgent> stockbrokerAgents, List<Signature> stockbrokerSignatures, List<EmailAddress> stockbrokerEmailAddresses) {
        this.id = id;
        this.name = name;
        this.cscsAccNo = cscsAccNo;
        this.active = active;
        this.valid = valid;
        this.stockbrokerAddresses = stockbrokerAddresses;
        this.stockbrokerPhoneNumbers = stockbrokerPhoneNumbers;
        this.holders = holders;
        this.stockbrokerAgents = stockbrokerAgents;
        this.stockbrokerSignatures = stockbrokerSignatures;
        this.stockbrokerEmailAddresses = stockbrokerEmailAddresses;
    }

    public Stockbroker(int id, String name, String cscsAccNo, boolean active, boolean valid, List<Address> stockbrokerAddresses, List<PhoneNumber> stockbrokerPhoneNumbers, List<Holder> holders, List<StockbrokerAgent> stockbrokerAgents, List<Signature> stockbrokerSignatures, List<EmailAddress> stockbrokerEmailAddresses, int noOfShareholders, int noOfBondholders, int noOfLodgedCertificates) {
        this.id = id;
        this.name = name;
        this.cscsAccNo = cscsAccNo;
        this.active = active;
        this.valid = valid;
        this.stockbrokerAddresses = stockbrokerAddresses;
        this.stockbrokerPhoneNumbers = stockbrokerPhoneNumbers;
        this.holders = holders;
        this.stockbrokerAgents = stockbrokerAgents;
        this.stockbrokerSignatures = stockbrokerSignatures;
        this.stockbrokerEmailAddresses = stockbrokerEmailAddresses;
        this.noOfShareholders = noOfShareholders;
        this.noOfBondholders = noOfBondholders;
        this.noOfLodgedCertificates = noOfLodgedCertificates;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCscsAccNo() {
        return cscsAccNo;
    }

    public void setCscsAccNo(String cscsAccNo) {
        this.cscsAccNo = cscsAccNo;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public List<Address> getStockbrokerAddresses() {
        return stockbrokerAddresses;
    }

    public void setStockbrokerAddresses(List<Address> stockbrokerAddresses) {
        this.stockbrokerAddresses = stockbrokerAddresses;
    }

    public List<PhoneNumber> getStockbrokerPhoneNumbers() {
        return stockbrokerPhoneNumbers;
    }

    public void setStockbrokerPhoneNumbers(List<PhoneNumber> stockbrokerPhoneNumbers) {
        this.stockbrokerPhoneNumbers = stockbrokerPhoneNumbers;
    }

    public List<Holder> getHolders() {
        return holders;
    }

    public void setHolders(List<Holder> holders) {
        this.holders = holders;
    }

    public List<StockbrokerAgent> getStockbrokerAgents() {
        return stockbrokerAgents;
    }

    public void setStockbrokerAgents(List<StockbrokerAgent> stockbrokerAgents) {
        this.stockbrokerAgents = stockbrokerAgents;
    }

    public List<Signature> getStockbrokerSignatures() {
        return stockbrokerSignatures;
    }

    public void setStockbrokerSignatures(List<Signature> stockbrokerSignatures) {
        this.stockbrokerSignatures = stockbrokerSignatures;
    }

    public List<EmailAddress> getStockbrokerEmailAddresses() {
        return stockbrokerEmailAddresses;
    }

    public void setStockbrokerEmailAddresses(List<EmailAddress> stockbrokerEmailAddresses) {
        this.stockbrokerEmailAddresses = stockbrokerEmailAddresses;
    }

    public int getNoOfShareholders() {
        return noOfShareholders;
    }

    public void setNoOfShareholders(int noOfShareholders) {
        this.noOfShareholders = noOfShareholders;
    }

    public int getNoOfBondholders() {
        return noOfBondholders;
    }

    public void setNoOfBondholders(int noOfBondholders) {
        this.noOfBondholders = noOfBondholders;
    }

    public int getNoOfLodgedCertificates() {
        return noOfLodgedCertificates;
    }

    public void setNoOfLodgedCertificates(int noOfLodgedCertificates) {
        this.noOfLodgedCertificates = noOfLodgedCertificates;
    }

}
