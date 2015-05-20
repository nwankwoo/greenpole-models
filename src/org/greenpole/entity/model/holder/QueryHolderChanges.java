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
@XmlType(propOrder = {"descriptor", "holderChanges", "start_date", "end_date"})
public class QueryHolderChanges implements Serializable {
    //descriptor must be date:none / date:exact / date:between / date:before / date:after
    @XmlElement
    private String descriptor;
    @XmlElement
    private HolderChanges holderChanges;
    @XmlElement
    private String start_date;
    @XmlElement
    private String end_date;

    public QueryHolderChanges() {
    }

    public QueryHolderChanges(String descriptor, HolderChanges holderChanges, String start_date, String end_date) {
        this.descriptor = descriptor;
        this.holderChanges = holderChanges;
        this.start_date = start_date;
        this.end_date = end_date;
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

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }
}
