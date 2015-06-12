/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entirycode.jeph.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Jephthah Sadare
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"id", "dividendId", "annotation"})
public class DividendAnnotation {

    @XmlElement
    private int id;
    @XmlElement
    private int dividendId;
    @XmlElement
    private String annotation;

    public DividendAnnotation() {
    }

    /**
     * 
     * @param id
     * @param dividendId
     * @param annotation 
     */
    public DividendAnnotation(int id, int dividendId, String annotation) {
        this.id = id;
        this.dividendId = dividendId;
        this.annotation = annotation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDividendId() {
        return dividendId;
    }

    public void setDividendId(int dividendId) {
        this.dividendId = dividendId;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

}
