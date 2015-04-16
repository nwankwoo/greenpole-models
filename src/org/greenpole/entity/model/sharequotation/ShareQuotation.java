/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model.sharequotation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Akinwale.Agbaje
 * The share quotation model, utilised by the front-end and middle-tier in
 * storing and retrieving share quotation information.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"clientCompanyId","code","unitPrice"})
public class ShareQuotation {
    private int id;
    @XmlElement
    private int clientCompanyId;
    @XmlElement
    private String code;
    @XmlElement
    private Double unitPrice;

    /**
     * Initialises share quotation object.
     */
    public ShareQuotation() {
    }

    /**
     * Collects all values for the share quotation.
     * @param clientCompanyId the client company id the quotation belongs to
     * @param code the client company code
     * @param unitPrice the company's share unit price
     */
    public ShareQuotation(int clientCompanyId, String code, Double unitPrice) {
        this.clientCompanyId = clientCompanyId;
        this.code = code;
        this.unitPrice = unitPrice;
    }

    /**
     * Collects all values for the share quotation.
     * This constructor should be used when trying to submit a share quotation for
     * editing, as it includes the {@link #id} variable, which is not used when
     * creating a share quotation.
     * @param id the share quotation id
     * @param clientCompanyId the client company id the quotation belongs to
     * @param code the client company code
     * @param unitPrice the company's share unit price
     */
    public ShareQuotation(int id, int clientCompanyId, String code, Double unitPrice) {
        this.id = id;
        this.clientCompanyId = clientCompanyId;
        this.code = code;
        this.unitPrice = unitPrice;
    }

    /**
     *
     * @return the share quotation id
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id the share quotation id to be set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return the client company id
     */
    public int getClientCompanyId() {
        return clientCompanyId;
    }

    /**
     *
     * @param clientCompanyId the client company id to be set
     */
    public void setClientCompanyId(int clientCompanyId) {
        this.clientCompanyId = clientCompanyId;
    }

    /**
     *
     * @return the client company code
     */
    public String getCode() {
        return code;
    }

    /**
     *
     * @param code the client company code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     *
     * @return the client company's share unit price
     */
    public Double getUnitPrice() {
        return unitPrice;
    }

    /**
     *
     * @param unitPrice the client company's share unit price to set
     */
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
