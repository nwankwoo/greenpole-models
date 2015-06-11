/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entrycode.emmanuel.model;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.greenpole.entity.model.holder.Holder;
/**
 *
 * @author user
 */
@XmlRootElement
@XmlSeeAlso({Holder.class})
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"descriptor","clientCompanyId","holderList","holder"})
public class QueryShareholders implements Serializable {
  @XmlElement
  private String descriptor;
  @XmlElement
  private int clientCompanyId;
  @XmlElementWrapper(name = "holderList")
    private List <Holder> holderList;
  @XmlElement
  private Holder holder;
  @XmlElement
  private int startAge;
  @XmlElement
  private int endAge;
    public QueryShareholders() {
    }

    public QueryShareholders(String descriptor, int clientCompanyId, List<Holder> holderList, Holder holder) {
        this.descriptor = descriptor;
        this.clientCompanyId = clientCompanyId;
        this.holderList = holderList;
        this.holder = holder;
    }

    public QueryShareholders(String descriptor, int clientCompanyId, List<Holder> holderList, int startAge, int endAge) {
        this.descriptor = descriptor;
        this.clientCompanyId = clientCompanyId;
        this.holderList = holderList;
        this.startAge = startAge;
        this.endAge = endAge;
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
     * @return the clientCompanyId
     */
    public int getClientCompanyId() {
        return clientCompanyId;
    }

    /**
     * @param clientCompanyId the clientCompanyId to set
     */
    public void setClientCompanyId(int clientCompanyId) {
        this.clientCompanyId = clientCompanyId;
    }

    /**
     * @return the holderList
     */
    public List <Holder> getHolderList() {
        return holderList;
    }

    /**
     * @param holderList the holderList to set
     */
    public void setHolderList(List <Holder> holderList) {
        this.holderList = holderList;
    }

    /**
     * @return the holder
     */
    public Holder getHolder() {
        return holder;
    }

    /**
     * @param holder the holder to set
     */
    public void setHolder(Holder holder) {
        this.holder = holder;
    }

    /**
     * @return the startAge
     */
    public int getStartAge() {
        return startAge;
    }

    /**
     * @param startAge the startAge to set
     */
    public void setStartAge(int startAge) {
        this.startAge = startAge;
    }

    /**
     * @return the endAge
     */
    public int getEndAge() {
        return endAge;
    }

    /**
     * @param endAge the endAge to set
     */
    public void setEndAge(int endAge) {
        this.endAge = endAge;
    }

      
}
