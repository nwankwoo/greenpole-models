/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entrycode.emmanuel.model;

import javax.xml.bind.annotation.XmlElement;
import org.greenpole.entity.model.clientcompany.InitialPublicOffer;
import org.greenpole.entity.model.clientcompany.PrivatePlacement;

/**
 *
 * @author user
 */
public class QueryIPORightsIssuePrivatePlacement {
  //descriptor must be date:none / date:exact / date:between
    @XmlElement
    private String descriptor;
    @XmlElement
    private InitialPublicOffer initialPublicOffer;
    @XmlElement
    private RightsIssue rightsIssue;
    @XmlElement
    private PrivatePlacement privatePlacement;
    @XmlElement
    private String start_date;
    @XmlElement
    private String end_date;
    @XmlElement
    private String date_format; 

    public QueryIPORightsIssuePrivatePlacement() {
    }

    public QueryIPORightsIssuePrivatePlacement(String descriptor, InitialPublicOffer initialPublicOffer, String start_date, String end_date, String date_format) {
        this.descriptor = descriptor;
        this.initialPublicOffer = initialPublicOffer;
        this.start_date = start_date;
        this.end_date = end_date;
        this.date_format = date_format;
    }

    public QueryIPORightsIssuePrivatePlacement(String descriptor, RightsIssue rightsIssue, String start_date, String end_date, String date_format) {
        this.descriptor = descriptor;
        this.rightsIssue = rightsIssue;
        this.start_date = start_date;
        this.end_date = end_date;
        this.date_format = date_format;
    }

    public QueryIPORightsIssuePrivatePlacement(String descriptor, PrivatePlacement privatePlacement, String start_date, String end_date, String date_format) {
        this.descriptor = descriptor;
        this.privatePlacement = privatePlacement;
        this.start_date = start_date;
        this.end_date = end_date;
        this.date_format = date_format;
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
     * @return the initialPublicOffer
     */
    public InitialPublicOffer getInitialPublicOffer() {
        return initialPublicOffer;
    }

    /**
     * @param initialPublicOffer the initialPublicOffer to set
     */
    public void setInitialPublicOffer(InitialPublicOffer initialPublicOffer) {
        this.initialPublicOffer = initialPublicOffer;
    }

    /**
     * @return the rightsIssue
     */
    public RightsIssue getRightsIssue() {
        return rightsIssue;
    }

    /**
     * @param rightsIssue the rightsIssue to set
     */
    public void setRightsIssue(RightsIssue rightsIssue) {
        this.rightsIssue = rightsIssue;
    }

    /**
     * @return the privatePlacement
     */
    public PrivatePlacement getPrivatePlacement() {
        return privatePlacement;
    }

    /**
     * @param privatePlacement the privatePlacement to set
     */
    public void setPrivatePlacement(PrivatePlacement privatePlacement) {
        this.privatePlacement = privatePlacement;
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

    /**
     * @return the date_format
     */
    public String getDate_format() {
        return date_format;
    }

    /**
     * @param date_format the date_format to set
     */
    public void setDate_format(String date_format) {
        this.date_format = date_format;
    }

    }
