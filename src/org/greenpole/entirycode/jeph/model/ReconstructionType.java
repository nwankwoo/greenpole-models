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
@XmlType(propOrder = {"id", "type", "description", "reconstructions"})

public class ReconstructionType implements Serializable {

    @XmlElement
    private int id;
    @XmlElement
    private String type;
    @XmlElement
    private String description;
    @XmlElementWrapper(name = "reconstructions")
    private List<Reconstruction> reconstructions;

    public ReconstructionType() {
    }
    
    /**
     * 
     * @param id
     * @param type
     * @param description
     * @param reconstructions 
     */    
    public ReconstructionType(int id, String type, String description, List<Reconstruction> reconstructions) {
        this.id = id;
        this.type = type;
        this.description = description;
        this.reconstructions = reconstructions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Reconstruction> getReconstructions() {
        return reconstructions;
    }

    public void setReconstructions(List<Reconstruction> reconstructions) {
        this.reconstructions = reconstructions;
    }

}
