/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model.holder;

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
 * @author Akin
 * Used by the front-end to convey information to the middle-tier on merge to carry out.
 */
@XmlRootElement
@XmlSeeAlso({Holder.class})
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"primaryHolder", "secondaryHolders"})
public class HolderMerger {
    @XmlElement
    private Holder primaryHolder;
    @XmlElementWrapper(name = "secondaryHolders")
    private List<Holder> secondaryHolders;

    public HolderMerger() {
    }

    public HolderMerger(Holder primaryHolder, List<Holder> secondaryHolders) {
        this.primaryHolder = primaryHolder;
        this.secondaryHolders = secondaryHolders;
    }

    public Holder getPrimaryHolder() {
        return primaryHolder;
    }

    public void setPrimaryHolder(Holder primaryHolder) {
        this.primaryHolder = primaryHolder;
    }

    public List<Holder> getSecondaryHolders() {
        return secondaryHolders;
    }

    public void setSecondaryHolders(List<Holder> secondaryHolders) {
        this.secondaryHolders = secondaryHolders;
    }
}
