/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entrycode.emmanuel.model;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author user
 */
public class QueryCautionedHolder {
   //descriptor must be date:none / date:exact / date:between / date:before / date:after
    @XmlElement
    private String descriptor;
    @XmlElement
    private Caution caution;
    @XmlElement
    private String start_date;
    @XmlElement
    private String end_date; 

    public QueryCautionedHolder() {
    }

    public QueryCautionedHolder(String descriptor, Caution caution, String start_date, String end_date) {
        this.descriptor = descriptor;
        this.caution = caution;
        this.start_date = start_date;
        this.end_date = end_date;
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
     * @return the caution
     */
    public Caution getCaution() {
        return caution;
    }

    /**
     * @param caution the caution to set
     */
    public void setCaution(Caution caution) {
        this.caution = caution;
    }

    /**
     * @return the start_date
     */
    public String getStart_date() {
        return start_date;
    }

    /**
     * @param start_date the start_date to set
     */
    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    /**
     * @return the end_date
     */
    public String getEnd_date() {
        return end_date;
    }

    /**
     * @param end_date the end_date to set
     */
    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }
    
}
