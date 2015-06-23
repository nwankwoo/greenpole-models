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
import javax.xml.bind.annotation.XmlType;

/**
 *use for processing holders certificate
 * @author user
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"id","certificateLodgementId","clientCompanyId",
    "holderId","initialPublicOfferId","privatePlacementId",
    "rightsIssueId","certificateNumber","shareVolume","bondHolding","holderName",
    "holderAddress","issuingCompName","issueDate","certNarration","cancelled","claimed","immobStatus","certificateVerification","isShareholder",
    "newHolderId","newHolderClientCompanyId","certificateLodgement"})
public class Certificate implements Serializable {
    @XmlElement
     private int id;
    @XmlElement
    private int certificateLodgementId;
    @XmlElement
     private int clientCompanyId;
    @XmlElement
     private int holderId;
    @XmlElement
     private int initialPublicOfferId;
    @XmlElement
     private int privatePlacementId;
    @XmlElement
     private int rightsIssueId;
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
    @XmlElement
     private boolean isShareholder;//true for shareholder but false for bondholder
    @XmlElementWrapper (name = "certificateVerification")
    private List<CertificateVerification> certificateVerification;
    //the fields below is for transfer of certificate ownership
    @XmlElement
    private int newHolderId;
    @XmlElement
    private int newHolderClientCompanyId;
    @XmlElement
    private CertificateLodgement certificateLodgement;

    public Certificate() {
    }

    public Certificate(int id, int certificateLodgementId, int clientCompanyId, int holderId, int initialPublicOfferId, int privatePlacementId, int rightsIssueId, int certificateNumber, int shareVolume, int bondHolding, String holderName, String holderAddress, String issuingCompName, String issueDate, String certNarration, boolean cancelled, boolean claimed, boolean immobStatus, boolean isShareholder, List<CertificateVerification> certificateVerification, int newHolderId, int newHolderClientCompanyId, CertificateLodgement certificateLodgement) {
        this.id = id;
        this.certificateLodgementId = certificateLodgementId;
        this.clientCompanyId = clientCompanyId;
        this.holderId = holderId;
        this.initialPublicOfferId = initialPublicOfferId;
        this.privatePlacementId = privatePlacementId;
        this.rightsIssueId = rightsIssueId;
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
        this.isShareholder = isShareholder;
        this.certificateVerification = certificateVerification;
        this.newHolderId = newHolderId;
        this.newHolderClientCompanyId = newHolderClientCompanyId;
        this.certificateLodgement = certificateLodgement;
    }

    public Certificate(int certificateLodgementId, int clientCompanyId, int holderId, int initialPublicOfferId, int privatePlacementId, int rightsIssueId, int certificateNumber, int shareVolume, int bondHolding, String holderName, String holderAddress, String issuingCompName, String issueDate, String certNarration, boolean cancelled, boolean claimed, boolean immobStatus, boolean isShareholder, List<CertificateVerification> certificateVerification, int newHolderId, int newHolderClientCompanyId, CertificateLodgement certificateLodgement) {
        this.certificateLodgementId = certificateLodgementId;
        this.clientCompanyId = clientCompanyId;
        this.holderId = holderId;
        this.initialPublicOfferId = initialPublicOfferId;
        this.privatePlacementId = privatePlacementId;
        this.rightsIssueId = rightsIssueId;
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
        this.isShareholder = isShareholder;
        this.certificateVerification = certificateVerification;
        this.newHolderId = newHolderId;
        this.newHolderClientCompanyId = newHolderClientCompanyId;
        this.certificateLodgement = certificateLodgement;
    }

    

    public Certificate(int newHolderId, int newHolderClientCompanyId) {
        this.newHolderId = newHolderId;
        this.newHolderClientCompanyId = newHolderClientCompanyId;
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
     * @return the certificateLodgementId
     */
    public int getCertificateLodgementId() {
        return certificateLodgementId;
    }

    /**
     * @param certificateLodgementId the certificateLodgementId to set
     */
    public void setCertificateLodgementId(int certificateLodgementId) {
        this.certificateLodgementId = certificateLodgementId;
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
     * @return the holderId
     */
    public int getHolderId() {
        return holderId;
    }

    /**
     * @param holderId the holderId to set
     */
    public void setHolderId(int holderId) {
        this.holderId = holderId;
    }

    /**
     * @return the initialPublicOfferId
     */
    public int getInitialPublicOfferId() {
        return initialPublicOfferId;
    }

    /**
     * @param initialPublicOfferId the initialPublicOfferId to set
     */
    public void setInitialPublicOfferId(int initialPublicOfferId) {
        this.initialPublicOfferId = initialPublicOfferId;
    }

    /**
     * @return the privatePlacementId
     */
    public int getPrivatePlacementId() {
        return privatePlacementId;
    }

    /**
     * @param privatePlacementId the privatePlacementId to set
     */
    public void setPrivatePlacementId(int privatePlacementId) {
        this.privatePlacementId = privatePlacementId;
    }

    /**
     * @return the rightsIssueId
     */
    public int getRightsIssueId() {
        return rightsIssueId;
    }

    /**
     * @param rightsIssueId the rightsIssueId to set
     */
    public void setRightsIssueId(int rightsIssueId) {
        this.rightsIssueId = rightsIssueId;
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

    /**
     * @return the certificateVerification
     */
    public List<CertificateVerification> getCertificateVerification() {
        return certificateVerification;
    }

    /**
     * @param certificateVerification the certificateVerification to set
     */
    public void setCertificateVerification(List<CertificateVerification> certificateVerification) {
        this.certificateVerification = certificateVerification;
    }

    /**
     * @return the isShareholder
     */
    public boolean isIsShareholder() {
        return isShareholder;
    }

    /**
     * @param isShareholder the isShareholder to set
     */
    public void setIsShareholder(boolean isShareholder) {
        this.isShareholder = isShareholder;
    }

    /**
     * @return the newHolderId
     */
    public int getNewHolderId() {
        return newHolderId;
    }

    /**
     * @param newHolderId the newHolderId to set
     */
    public void setNewHolderId(int newHolderId) {
        this.newHolderId = newHolderId;
    }

    /**
     * @return the newHolderClientCompanyId
     */
    public int getNewHolderClientCompanyId() {
        return newHolderClientCompanyId;
    }

    /**
     * @param newHolderClientCompanyId the newHolderClientCompanyId to set
     */
    public void setNewHolderClientCompanyId(int newHolderClientCompanyId) {
        this.newHolderClientCompanyId = newHolderClientCompanyId;
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

    }
