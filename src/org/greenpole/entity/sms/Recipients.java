/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.sms;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Akinwale Agbaje
 */
@XmlRootElement
@XmlSeeAlso({Gsm.class})
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"gsm"})
public class Recipients {
    @XmlElement
    private List<Gsm> gsm;

    public List<Gsm> getGsm() {
        return gsm;
    }

    public void setGsm(List<Gsm> gsm) {
        this.gsm = gsm;
    }

    @Override
    public String toString() {
        return "ClassPojo [gsm = " + gsm + "]";
    }
}
