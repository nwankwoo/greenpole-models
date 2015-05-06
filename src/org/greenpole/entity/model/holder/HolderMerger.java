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
@XmlType(propOrder = {"primaryHolder","pryHolderChanges","secondaryHolders"})
public class HolderMerger {
    @XmlElement
    private Holder primaryHolder;
    //used to store changes made to the primary holder account as a result of the merge. Form should be:
    //form should be: type:value;gender:value;dob:value;phone:value;email:value
    //where "value" could be "none" or the previous value of the variable before its change, NOT the current value the variable holds
    @XmlElement
    private String pryHolderChanges;
    @XmlElementWrapper(name = "secondaryHolders")
    private List<Holder> secondaryHolders;

    public HolderMerger() {
    }

    public HolderMerger(Holder primaryHolder, String pryHolderChanges, List<Holder> secondaryHolders) {
        this.primaryHolder = primaryHolder;
        this.pryHolderChanges = pryHolderChanges;
        this.secondaryHolders = secondaryHolders;
    }

    public Holder getPrimaryHolder() {
        return primaryHolder;
    }

    public void setPrimaryHolder(Holder primaryHolder) {
        this.primaryHolder = primaryHolder;
    }

    public String getPryHolderChanges() {
        return pryHolderChanges;
    }

    public void setPryHolderChanges(String pryHolderChanges) {
        this.pryHolderChanges = pryHolderChanges;
    }

    public List<Holder> getSecondaryHolders() {
        return secondaryHolders;
    }

    public void setSecondaryHolders(List<Holder> secondaryHolders) {
        this.secondaryHolders = secondaryHolders;
    }
}
