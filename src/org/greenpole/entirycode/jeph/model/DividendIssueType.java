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
@XmlType(propOrder = {"id", "dividendType", "description", "dividends"})

public class DividendIssueType implements Serializable {

    @XmlElement
    private int id;
    @XmlElement
    private String dividendType;
    @XmlElement
    private String description;
    @XmlElementWrapper(name = "dividends")
    private List<Dividend> dividends;

    public DividendIssueType() {
    }

    public DividendIssueType(int id, String dividendType, String description, List<Dividend> dividends) {
        this.id = id;
        this.dividendType = dividendType;
        this.description = description;
        this.dividends = dividends;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDividendType() {
        return dividendType;
    }

    public void setDividendType(String dividendType) {
        this.dividendType = dividendType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Dividend> getDividends() {
        return dividends;
    }

    public void setDividends(List<Dividend> dividends) {
        this.dividends = dividends;
    }

}
