/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entirycode.jeph.model;

import java.io.Serializable;
import java.util.Map;
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
@XmlType(propOrder = {"descriptor", "numberOfLodgedCertificates",
    "numberOfShareholders", "numberOfBondholders", "stockbroker"})

public class QueryStockbroker implements Serializable {

    /**
     * Default representation of
     * descriptor=stockbroker:none;numberOfLodgedCertificates:none;numberOfShareholders:none;numberOfBondholders:none
     * and this is only set when user is performing a range search
     */
    @XmlElement
    private String descriptor;
    @XmlElementWrapper(name = "shareUnit")
    private Map<String, Double> numberOfLodgedCertificates;
    @XmlElementWrapper(name = "numberOfShareholders")
    private Map<String, Integer> numberOfShareholders;
    @XmlElementWrapper(name = "numberOfBondholders")
    private Map<String, Integer> numberOfBondholders;
    @XmlElement
    private Stockbroker stockbroker;

    public QueryStockbroker() {
    }

    public QueryStockbroker(String descriptor, Map<String, Double> numberOfLodgedCertificates, Map<String, Integer> numberOfShareholders, Map<String, Integer> numberOfBondholders, Stockbroker stockbroker) {
        this.descriptor = descriptor;
        this.numberOfLodgedCertificates = numberOfLodgedCertificates;
        this.numberOfShareholders = numberOfShareholders;
        this.numberOfBondholders = numberOfBondholders;
        this.stockbroker = stockbroker;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    public Map<String, Double> getNumberOfLodgedCertificates() {
        return numberOfLodgedCertificates;
    }

    public void setNumberOfLodgedCertificates(Map<String, Double> numberOfLodgedCertificates) {
        this.numberOfLodgedCertificates = numberOfLodgedCertificates;
    }

    public Map<String, Integer> getNumberOfShareholders() {
        return numberOfShareholders;
    }

    public void setNumberOfShareholders(Map<String, Integer> numberOfShareholders) {
        this.numberOfShareholders = numberOfShareholders;
    }

    public Map<String, Integer> getNumberOfBondholders() {
        return numberOfBondholders;
    }

    public void setNumberOfBondholders(Map<String, Integer> numberOfBondholders) {
        this.numberOfBondholders = numberOfBondholders;
    }

    public Stockbroker getStockbroker() {
        return stockbroker;
    }

    public void setStockbroker(Stockbroker stockbroker) {
        this.stockbroker = stockbroker;
    }

}
