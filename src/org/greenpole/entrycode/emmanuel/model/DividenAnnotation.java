/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entrycode.emmanuel.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author user
 */
public class DividenAnnotation implements Serializable {
    @XmlElement
    private int id;
    @XmlElement
     private int dividendId;
    @XmlElement
     private String annotation;

    public DividenAnnotation() {
    }

    public DividenAnnotation(int id, int dividendId, String annotation) {
        this.id = id;
        this.dividendId = dividendId;
        this.annotation = annotation;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the dividendId
     */
    public int getDividendId() {
        return dividendId;
    }

    /**
     * @param dividendId the dividendId to set
     */
    public void setDividendId(int dividendId) {
        this.dividendId = dividendId;
    }

    /**
     * @return the annotation
     */
    public String getAnnotation() {
        return annotation;
    }

    /**
     * @param annotation the annotation to set
     */
    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }
    
}
