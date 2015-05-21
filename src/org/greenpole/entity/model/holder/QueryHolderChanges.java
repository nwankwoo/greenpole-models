/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model.holder;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Akin
 * Utilised in querying changes made to holder accounts, like change of name, change of address, etc
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"descriptor", "holderChanges", "startDate", "endDate"})
public class QueryHolderChanges implements Serializable {
    //descriptor must be date:none / date:exact / date:between / date:before / date:after
    @XmlElement
    private String descriptor;
    @XmlElement
    private HolderChanges holderChanges;
    @XmlElement
    private String startDate;
    @XmlElement
    private String endDate;

    public QueryHolderChanges() {
    }

    public QueryHolderChanges(String descriptor, HolderChanges holderChanges, String startDate, String endDate) {
        this.descriptor = descriptor;
        this.holderChanges = holderChanges;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    public HolderChanges getHolderChanges() {
        return holderChanges;
    }

    public void setHolderChanges(HolderChanges holderChanges) {
        this.holderChanges = holderChanges;
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
