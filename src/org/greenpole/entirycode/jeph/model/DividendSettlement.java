/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entirycode.jeph.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author Jephthah Sadare
 */
public class DividendSettlement implements Serializable {

    @XmlElement
    private int id;
    @XmlElement
    private int dividendDeclaredId;
    @XmlElement
    private double totalDivAmtDec;
    @XmlElement
    private double totalDivAmtPaid;
    @XmlElement
    private double totalDivAmtUnpaid;
    @XmlElement
    private double totalDivAmtLeft;
    @XmlElement
    private int shareholdersPaid;
    @XmlElement
    private int shareholdersUnpaid;

    public DividendSettlement() {
    }

    /**
     * 
     * @param id
     * @param dividendDeclaredId
     * @param totalDivAmtDec
     * @param totalDivAmtPaid
     * @param totalDivAmtUnpaid
     * @param totalDivAmtLeft
     * @param shareholdersPaid
     * @param shareholdersUnpaid 
     */
    public DividendSettlement(int id, int dividendDeclaredId, double totalDivAmtDec, double totalDivAmtPaid, double totalDivAmtUnpaid, double totalDivAmtLeft, int shareholdersPaid, int shareholdersUnpaid) {
        this.id = id;
        this.dividendDeclaredId = dividendDeclaredId;
        this.totalDivAmtDec = totalDivAmtDec;
        this.totalDivAmtPaid = totalDivAmtPaid;
        this.totalDivAmtUnpaid = totalDivAmtUnpaid;
        this.totalDivAmtLeft = totalDivAmtLeft;
        this.shareholdersPaid = shareholdersPaid;
        this.shareholdersUnpaid = shareholdersUnpaid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDividendDeclaredId() {
        return dividendDeclaredId;
    }

    public void setDividendDeclaredId(int dividendDeclaredId) {
        this.dividendDeclaredId = dividendDeclaredId;
    }

    public double getTotalDivAmtDec() {
        return totalDivAmtDec;
    }

    public void setTotalDivAmtDec(double totalDivAmtDec) {
        this.totalDivAmtDec = totalDivAmtDec;
    }

    public double getTotalDivAmtPaid() {
        return totalDivAmtPaid;
    }

    public void setTotalDivAmtPaid(double totalDivAmtPaid) {
        this.totalDivAmtPaid = totalDivAmtPaid;
    }

    public double getTotalDivAmtUnpaid() {
        return totalDivAmtUnpaid;
    }

    public void setTotalDivAmtUnpaid(double totalDivAmtUnpaid) {
        this.totalDivAmtUnpaid = totalDivAmtUnpaid;
    }

    public double getTotalDivAmtLeft() {
        return totalDivAmtLeft;
    }

    public void setTotalDivAmtLeft(double totalDivAmtLeft) {
        this.totalDivAmtLeft = totalDivAmtLeft;
    }

    public int getShareholdersPaid() {
        return shareholdersPaid;
    }

    public void setShareholdersPaid(int shareholdersPaid) {
        this.shareholdersPaid = shareholdersPaid;
    }

    public int getShareholdersUnpaid() {
        return shareholdersUnpaid;
    }

    public void setShareholdersUnpaid(int shareholdersUnpaid) {
        this.shareholdersUnpaid = shareholdersUnpaid;
    }

}
