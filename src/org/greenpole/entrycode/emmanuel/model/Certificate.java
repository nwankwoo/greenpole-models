/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entrycode.emmanuel.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.greenpole.entity.model.clientcompany.InitialPublicOffer;
import org.greenpole.entity.model.clientcompany.PrivatePlacement;

/**
 *
 * @author user
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"id","certificateLodgement","clientCompany",
    "holder","initialPublicOffer","privatePlacement",
    "rightsIssue","certificateNumber","shareVolume","bondHolding","holderName",
    "holderAddress","issuingCompName","issueDate","certNarration","cancelled","claimed","immobStatus"})
public class Certificate {
    @XmlElement
     private int id;
    @XmlElement
    private CertificateLodgement certificateLodgement;
    @XmlElement
     private ClientCompany clientCompany;
    @XmlElement
     private Holder holder;
    @XmlElement
     private InitialPublicOffer initialPublicOffer;
    @XmlElement
     private PrivatePlacement privatePlacement;
    @XmlElement
     private RightsIssue rightsIssue;
    @XmlElement
     private int certificateNumber;
    @XmlElement
     private int shareVolume;
    @XmlElement
     private int bondHolding;
    @XmlElement
     private String holderName;
    @XmlElement
     private String holderAddress;
    @XmlElement
     private String issuingCompName;
    @XmlElement
     private String issueDate;
    @XmlElement
     private String certNarration;
    @XmlElement
     private boolean cancelled;
    @XmlElement
     private boolean claimed;
    @XmlElement
     private boolean immobStatus;

    public Certificate() {
    }

    public Certificate(int id, CertificateLodgement certificateLodgement, ClientCompany clientCompany, Holder holder, InitialPublicOffer initialPublicOffer, PrivatePlacement privatePlacement, RightsIssue rightsIssue, int certificateNumber, int shareVolume, int bondHolding, String holderName, String holderAddress, String issuingCompName, String issueDate, String certNarration, boolean cancelled, boolean claimed, boolean immobStatus) {
        this.id = id;
        this.certificateLodgement = certificateLodgement;
        this.clientCompany = clientCompany;
        this.holder = holder;
        this.initialPublicOffer = initialPublicOffer;
        this.privatePlacement = privatePlacement;
        this.rightsIssue = rightsIssue;
        this.certificateNumber = certificateNumber;
        this.shareVolume = shareVolume;
        this.bondHolding = bondHolding;
        this.holderName = holderName;
        this.holderAddress = holderAddress;
        this.issuingCompName = issuingCompName;
        this.issueDate = issueDate;
        this.certNarration = certNarration;
        this.cancelled = cancelled;
        this.claimed = claimed;
        this.immobStatus = immobStatus;
    }

    public Certificate(CertificateLodgement certificateLodgement, ClientCompany clientCompany, Holder holder, InitialPublicOffer initialPublicOffer, PrivatePlacement privatePlacement, RightsIssue rightsIssue, int certificateNumber, int shareVolume, int bondHolding, String holderName, String holderAddress, String issuingCompName, String issueDate, String certNarration, boolean cancelled, boolean claimed, boolean immobStatus) {
        this.certificateLodgement = certificateLodgement;
        this.clientCompany = clientCompany;
        this.holder = holder;
        this.initialPublicOffer = initialPublicOffer;
        this.privatePlacement = privatePlacement;
        this.rightsIssue = rightsIssue;
        this.certificateNumber = certificateNumber;
        this.shareVolume = shareVolume;
        this.bondHolding = bondHolding;
        this.holderName = holderName;
        this.holderAddress = holderAddress;
        this.issuingCompName = issuingCompName;
        this.issueDate = issueDate;
        this.certNarration = certNarration;
        this.cancelled = cancelled;
        this.claimed = claimed;
        this.immobStatus = immobStatus;
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
     * @return the certificateLodgement
     */
    public CertificateLodgement getCertificateLodgement() {
        return certificateLodgement;
    }

    /**
     * @param certificateLodgement the certificateLodgement to set
     */
    public void setCertificateLodgement(CertificateLodgement certificateLodgement) {
        this.certificateLodgement = certificateLodgement;
    }

    /**
     * @return the clientCompany
     */
    public ClientCompany getClientCompany() {
        return clientCompany;
    }

    /**
     * @param clientCompany the clientCompany to set
     */
    public void setClientCompany(ClientCompany clientCompany) {
        this.clientCompany = clientCompany;
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
     * @return the initialPublicOffer
     */
    public InitialPublicOffer getInitialPublicOffer() {
        return initialPublicOffer;
    }

    /**
     * @param initialPublicOffer the initialPublicOffer to set
     */
    public void setInitialPublicOffer(InitialPublicOffer initialPublicOffer) {
        this.initialPublicOffer = initialPublicOffer;
    }

    /**
     * @return the privatePlacement
     */
    public PrivatePlacement getPrivatePlacement() {
        return privatePlacement;
    }

    /**
     * @param privatePlacement the privatePlacement to set
     */
    public void setPrivatePlacement(PrivatePlacement privatePlacement) {
        this.privatePlacement = privatePlacement;
    }

    /**
     * @return the rightsIssue
     */
    public RightsIssue getRightsIssue() {
        return rightsIssue;
    }

    /**
     * @param rightsIssue the rightsIssue to set
     */
    public void setRightsIssue(RightsIssue rightsIssue) {
        this.rightsIssue = rightsIssue;
    }

    /**
     * @return the certificateNumber
     */
    public int getCertificateNumber() {
        return certificateNumber;
    }

    /**
     * @param certificateNumber the certificateNumber to set
     */
    public void setCertificateNumber(int certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    /**
     * @return the shareVolume
     */
    public int getShareVolume() {
        return shareVolume;
    }

    /**
     * @param shareVolume the shareVolume to set
     */
    public void setShareVolume(int shareVolume) {
        this.shareVolume = shareVolume;
    }

    /**
     * @return the bondHolding
     */
    public int getBondHolding() {
        return bondHolding;
    }

    /**
     * @param bondHolding the bondHolding to set
     */
    public void setBondHolding(int bondHolding) {
        this.bondHolding = bondHolding;
    }

    /**
     * @return the holderName
     */
    public String getHolderName() {
        return holderName;
    }

    /**
     * @param holderName the holderName to set
     */
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    /**
     * @return the holderAddress
     */
    public String getHolderAddress() {
        return holderAddress;
    }

    /**
     * @param holderAddress the holderAddress to set
     */
    public void setHolderAddress(String holderAddress) {
        this.holderAddress = holderAddress;
    }

    /**
     * @return the issuingCompName
     */
    public String getIssuingCompName() {
        return issuingCompName;
    }

    /**
     * @param issuingCompName the issuingCompName to set
     */
    public void setIssuingCompName(String issuingCompName) {
        this.issuingCompName = issuingCompName;
    }

    /**
     * @return the issueDate
     */
    public String getIssueDate() {
        return issueDate;
    }

    /**
     * @param issueDate the issueDate to set
     */
    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    /**
     * @return the certNarration
     */
    public String getCertNarration() {
        return certNarration;
    }

    /**
     * @param certNarration the certNarration to set
     */
    public void setCertNarration(String certNarration) {
        this.certNarration = certNarration;
    }

    /**
     * @return the cancelled
     */
    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * @param cancelled the cancelled to set
     */
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    /**
     * @return the claimed
     */
    public boolean isClaimed() {
        return claimed;
    }

    /**
     * @param claimed the claimed to set
     */
    public void setClaimed(boolean claimed) {
        this.claimed = claimed;
    }

    /**
     * @return the immobStatus
     */
    public boolean isImmobStatus() {
        return immobStatus;
    }

    /**
     * @param immobStatus the immobStatus to set
     */
    public void setImmobStatus(boolean immobStatus) {
        this.immobStatus = immobStatus;
    }
    
}
