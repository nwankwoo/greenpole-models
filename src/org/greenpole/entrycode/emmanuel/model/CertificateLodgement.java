/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entrycode.emmanuel.model;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
/**
 *
 * @author user
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {""})
public class CertificateLodgement {
    @XmlElement
     private int id;
    @XmlElement
     private int controlNumber;
    @XmlElement
     private String title;
    @XmlElement
     private String date;
    @XmlElement
     private String certificateNumber;
    @XmlElement
     private int holdings;
    @XmlElement
     private String shareholderName;
    @XmlElement
     private String chn;
    @XmlElement
     private String status;
    @XmlElement
     private boolean processed;
    @XmlElement
     private List<Certificate> certificate;

    public CertificateLodgement() {
    }

    public CertificateLodgement(int id, int controlNumber, String title, String date, String certificateNumber, int holdings, String shareholderName, String chn, String status, boolean processed, List<Certificate> certificate) {
        this.id = id;
        this.controlNumber = controlNumber;
        this.title = title;
        this.date = date;
        this.certificateNumber = certificateNumber;
        this.holdings = holdings;
        this.shareholderName = shareholderName;
        this.chn = chn;
        this.status = status;
        this.processed = processed;
        this.certificate = certificate;
    }

    public CertificateLodgement(int controlNumber, String title, String date, String certificateNumber, int holdings, String shareholderName, String chn, String status, boolean processed, List<Certificate> certificate) {
        this.controlNumber = controlNumber;
        this.title = title;
        this.date = date;
        this.certificateNumber = certificateNumber;
        this.holdings = holdings;
        this.shareholderName = shareholderName;
        this.chn = chn;
        this.status = status;
        this.processed = processed;
        this.certificate = certificate;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the controlNumber
     */
    public int getControlNumber() {
        return controlNumber;
    }

    /**
     * @param controlNumber the controlNumber to set
     */
    public void setControlNumber(int controlNumber) {
        this.controlNumber = controlNumber;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the certificateNumber
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /**
     * @param certificateNumber the certificateNumber to set
     */
    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    /**
     * @return the holdings
     */
    public int getHoldings() {
        return holdings;
    }

    /**
     * @param holdings the holdings to set
     */
    public void setHoldings(int holdings) {
        this.holdings = holdings;
    }

    /**
     * @return the shareholderName
     */
    public String getShareholderName() {
        return shareholderName;
    }

    /**
     * @param shareholderName the shareholderName to set
     */
    public void setShareholderName(String shareholderName) {
        this.shareholderName = shareholderName;
    }

    /**
     * @return the chn
     */
    public String getChn() {
        return chn;
    }

    /**
     * @param chn the chn to set
     */
    public void setChn(String chn) {
        this.chn = chn;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the processed
     */
    public boolean isProcessed() {
        return processed;
    }

    /**
     * @param processed the processed to set
     */
    public void setProcessed(boolean processed) {
        this.processed = processed;
    }

    /**
     * @return the certificate
     */
    public List<Certificate> getCertificate() {
        return certificate;
    }

    /**
     * @param certificate the certificate to set
     */
    public void setCertificate(List<Certificate> certificate) {
        this.certificate = certificate;
    }
    
}
