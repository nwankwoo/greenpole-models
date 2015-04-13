/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Akinwale Agbaje
 * The client company model, utilised by the front-end and middle-tier in
 * storing and retrieving client company information.
 * @deprecated this is an old version. Use {@link org.greenpole.entity.model.clientcompany.ClientCompany}
 */
@Deprecated
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"name","code","nseSector","ceo","secretary","address","depositoryId","depositoryName","valid"})
public class ClientCompany implements Serializable {
    @XmlElement
    private String name;
    @XmlElement
    private String code;
    @XmlElement
    private String nseSector;
    @XmlElement
    private String ceo;
    @XmlElement
    private String secretary;
    @XmlElement
    private String address;
    @XmlElement
    private String depositoryName;
    @XmlElement
    private int depositoryId;
    @XmlElement
    private boolean valid;

    public ClientCompany() {
    }

    /**
     * Collects all values for the client company.
     * @param name the company's name
     * @param code the company's code
     * @param nseSector the NSE Sector the company belongs to
     * @param ceo the company's CEO
     * @param secretary the company's secretary
     * @param address the company's address
     * @param depositoryName the company's depository
     * @param depositoryId the depository's unique identification
     * @param valid the company's valid status
     */
    public ClientCompany(String name, String code, String nseSector, String ceo, String secretary, String address, String depositoryName, int depositoryId, boolean valid) {
        this.name = name;
        this.code = code;
        this.nseSector = nseSector;
        this.ceo = ceo;
        this.secretary = secretary;
        this.address = address;
        this.depositoryName = depositoryName;
        this.depositoryId = depositoryId;
        this.valid = valid;
    }

    /**
     * Gets the company's name.
     * @return the company's name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the company's name.
     * @param name the company's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the company's code.
     * @return the company's code
     */
    public String getCode() {
        return code;
    }

    /**
     * Gets the company's code.
     * @param code the company's code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Gets the company's NSE sector.
     * @return the company's NSE sector
     */
    public String getNseSector() {
        return nseSector;
    }

    /**
     * Gets the company's NSE sector.
     * @param nseSector the company's NSE sector
     */
    public void setNseSector(String nseSector) {
        this.nseSector = nseSector;
    }

    /**
     * Gets the name of the company's CEO.
     * @return the name of the company's CEO
     */
    public String getCeo() {
        return ceo;
    }

    /**
     * Gets the name of the company's CEO.
     * @param ceo the name of the company's CEO
     */
    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    /**
     * Gets the name of the company's secretary.
     * @return the name of the company's secretary
     */
    public String getSecretary() {
        return secretary;
    }

    /**
     * Gets the name of the company's secretary.
     * @param secretary the name of the company's secretary
     */
    public void setSecretary(String secretary) {
        this.secretary = secretary;
    }

    /**
     * Gets the company's address.
     * @return the company's address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Gets the company's address.
     * @param address the company's address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets the name of the company's depository.
     * @return the company's depository
     */
    public String getDepositoryName() {
        return depositoryName;
    }

    /**
     * Gets the name of the company's depository.
     * @param depositoryName the company's depository
     */
    public void setDepositoryName(String depositoryName) {
        this.depositoryName = depositoryName;
    }

    /**
     * Gets the depository's unique identification.
     * @return the depository's unique identification
     */
    public int getDepositoryId() {
        return depositoryId;
    }

    /**
     * Gets the depository's unique identification.
     * @param depositoryId the depository's unique identification
     */
    public void setDepositoryId(int depositoryId) {
        this.depositoryId = depositoryId;
    }

    /**
     * Gets the company's valid status.
     * @return the company's valid status
     */
    public boolean isValid() {
        return valid;
    }

    /**
     * Sets the company's valid status.
     * @param valid the company's valid status
     */
    public void setValid(boolean valid) {
        this.valid = valid;
    }

    @Override
    public String toString() {
        return "ClientCompany{" + "name=" + name + ", code=" + code + ", nseSector=" + nseSector + ", ceo=" + ceo + ", secretary=" + secretary + ", address=" + address + ", depositoryName=" + depositoryName + ", depositoryId=" + depositoryId + ", valid=" + valid + '}';
    }
    
}
