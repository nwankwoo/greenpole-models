/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entrycode.emmanuel;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
/**
 *
 * @author user
 */
@XmlRootElement
@XmlSeeAlso({ShareQuotation.class})
@XmlAccessorType(XmlAccessType.NONE)
public class ShareQuotation implements Serializable {
@XmlElement
private int id;
@XmlElement
private String code;
@XmlElement
private Double unitPrice; 
    @Override
    public String toString() {
        return "ShareQuotation{" + "id=" + id + ", code=" + code + ", unitPrice=" + unitPrice + '}';
    }

    public ShareQuotation(){}
    public ShareQuotation(int id, String code, Double unitPrice) {
        this.id = id;
        this.code = code;
        this.unitPrice = unitPrice;
    }
    public ShareQuotation(String code, Double unitPrice) {
        this.code = code;
        this.unitPrice = unitPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

}
