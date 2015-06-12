/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entrycode.emmanuel.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author user
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"id","dividendType","description"})
public class DividendIssueType implements Serializable {
   @XmlElement
  private int id; 
   @XmlElement
  private String dividendType;
   @XmlElement
  private String description; 

    public DividendIssueType() {
    }

    public DividendIssueType(int id, String dividendType, String description) {
        this.id = id;
        this.dividendType = dividendType;
        this.description = description;
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
     * @return the dividendType
     */
    public String getDividendType() {
        return dividendType;
    }

    /**
     * @param dividendType the dividendType to set
     */
    public void setDividendType(String dividendType) {
        this.dividendType = dividendType;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
   
}
