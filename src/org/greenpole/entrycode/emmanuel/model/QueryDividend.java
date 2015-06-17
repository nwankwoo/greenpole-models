/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entrycode.emmanuel.model;
import java.io.Serializable;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**utilized in querying and viewing dividend records
 *
 * @author user
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"descriptor","dividend","startDate","endDate","grossAmount","tax","payableAmount"})
public class QueryDividend implements Serializable {
    //descriptor must be date:none / date:exact / date:between / date:before / date:after
    @XmlElement
     private String descriptor;
    @XmlElement
    private Dividend dividend;
    @XmlElement
    private String startDate;
    @XmlElement
    private String endDate;
    @XmlElementWrapper(name = "grossAmount")
    private Map<String, Double> grossAmount;
    @XmlElementWrapper(name = "tax")
    private Map<String, Double> tax;
    @XmlElementWrapper(name = "payableAmount")
    private Map<String, Double> payableAmount;
    public QueryDividend() {
    }

    public QueryDividend(String descriptor, Dividend dividend, Map<String, Double> grossAmount, Map<String, Double> tax, Map<String, Double> payableAmount) {
        this.descriptor = descriptor;
        this.dividend = dividend;
        this.grossAmount = grossAmount;
        this.tax = tax;
        this.payableAmount = payableAmount;
    }
    public QueryDividend(String descriptor, String startDate, String endDate) {
        this.descriptor = descriptor;
        this.startDate = startDate;
        this.endDate = endDate;
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
     * @return the dividend
     */
    public Dividend getDividend() {
        return dividend;
    }

    /**
     * @param dividend the dividend to set
     */
    public void setDividend(Dividend dividend) {
        this.dividend = dividend;
    }

    /**
     * @return the startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the grossAmount
     */
    public Map<String, Double> getGrossAmount() {
        return grossAmount;
    }

    /**
     * @param grossAmount the grossAmount to set
     */
    public void setGrossAmount(Map<String, Double> grossAmount) {
        this.grossAmount = grossAmount;
    }

    /**
     * @return the tax
     */
    public Map<String, Double> getTax() {
        return tax;
    }

    /**
     * @param tax the tax to set
     */
    public void setTax(Map<String, Double> tax) {
        this.tax = tax;
    }

    /**
     * @return the payableAmount
     */
    public Map<String, Double> getPayableAmount() {
        return payableAmount;
    }

    /**
     * @param payableAmount the payableAmount to set
     */
    public void setPayableAmount(Map<String, Double> payableAmount) {
        this.payableAmount = payableAmount;
    }

}
