/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model.jeph.models.holder;

import java.util.List;
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
@XmlType(propOrder = {"holderId","holder","isPrimary"})

public class HolderPhoneNumber {
    
    @XmlElement
    private int holderId;
    @XmlElement
    private List<Holder> holder;
    @XmlElement
    private boolean isPrimary;

    public HolderPhoneNumber(int holderId, List<Holder> holder, boolean isPrimary) {
        this.holderId = holderId;
        this.holder = holder;
        this.isPrimary = isPrimary;
    }

    public int getHolderId() {
        return holderId;
    }

    public void setHolderId(int holderId) {
        this.holderId = holderId;
    }

    public List<Holder> getHolder() {
        return holder;
    }

    public void setHolder(List<Holder> holder) {
        this.holder = holder;
    }

    public boolean isIsPrimary() {
        return isPrimary;
    }

    public void setIsPrimary(boolean isPrimary) {
        this.isPrimary = isPrimary;
    }
    
    
    
}
