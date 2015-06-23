/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entirycode.jeph.model;

import java.io.Serializable;
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
 * @author Jephthah Sadare
 */
@XmlRootElement
@XmlSeeAlso({CertificateVerification.class})
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"id", "certificateLodgementId", "clientCompanyId",
    "holderId", "initialPublicOfferId", "privatePlacementId", "rightsIssueId",
    "shareBonusId", "certificateNumber", "shareVolume", "bondHolding",
    "holderName", "holderAddress", "issuingCompName", "issueDate",
    "certNarration", "cancelled", "claimed", "immobStatus", "certificateVerifications"})

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
    private int shareBonusId;
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
    @XmlElementWrapper(name = " certificateVerifications")
    private List<CertificateVerification> certificateVerifications;

    public Certificate() {
    }

    public Certificate(int id, int certificateLodgementId, int clientCompany, int holderId, int initialPublicOfferId, int privatePlacementId, int rightsIssueId, int shareBonusId, int certificateNumber, int shareVolume, int bondHolding, String holderName, String holderAddress, String issuingCompName, String issueDate, String certNarration, boolean cancelled, boolean claimed, boolean immobStatus, List<CertificateVerification> certificateVerifications) {
        this.id = id;
        this.certificateLodgementId = certificateLodgementId;
        this.clientCompanyId = clientCompany;
        this.holderId = holderId;
        this.initialPublicOfferId = initialPublicOfferId;
        this.privatePlacementId = privatePlacementId;
        this.rightsIssueId = rightsIssueId;
        this.shareBonusId = shareBonusId;
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
        this.certificateVerifications = certificateVerifications;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCertificateLodgementId() {
        return certificateLodgementId;
    }

    public void setCertificateLodgementId(int certificateLodgementId) {
        this.certificateLodgementId = certificateLodgementId;
    }

    public int getClientCompanyId() {
        return clientCompanyId;
    }

    public void setClientCompanyId(int clientCompanyId) {
        this.clientCompanyId = clientCompanyId;
    }

    public int getHolderId() {
        return holderId;
    }

    public void setHolderId(int holderId) {
        this.holderId = holderId;
    }

    public int getInitialPublicOfferId() {
        return initialPublicOfferId;
    }

    public void setInitialPublicOfferId(int initialPublicOfferId) {
        this.initialPublicOfferId = initialPublicOfferId;
    }

    public int getPrivatePlacementId() {
        return privatePlacementId;
    }

    public void setPrivatePlacementId(int privatePlacementId) {
        this.privatePlacementId = privatePlacementId;
    }

    public int getRightsIssueId() {
        return rightsIssueId;
    }

    public void setRightsIssueId(int rightsIssueId) {
        this.rightsIssueId = rightsIssueId;
    }

    public int getShareBonusId() {
        return shareBonusId;
    }

    public void setShareBonusId(int shareBonusId) {
        this.shareBonusId = shareBonusId;
    }

    public int getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(int certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public int getShareVolume() {
        return shareVolume;
    }

    public void setShareVolume(int shareVolume) {
        this.shareVolume = shareVolume;
    }

    public int getBondHolding() {
        return bondHolding;
    }

    public void setBondHolding(int bondHolding) {
        this.bondHolding = bondHolding;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getHolderAddress() {
        return holderAddress;
    }

    public void setHolderAddress(String holderAddress) {
        this.holderAddress = holderAddress;
    }

    public String getIssuingCompName() {
        return issuingCompName;
    }

    public void setIssuingCompName(String issuingCompName) {
        this.issuingCompName = issuingCompName;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getCertNarration() {
        return certNarration;
    }

    public void setCertNarration(String certNarration) {
        this.certNarration = certNarration;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public boolean isClaimed() {
        return claimed;
    }

    public void setClaimed(boolean claimed) {
        this.claimed = claimed;
    }

    public boolean isImmobStatus() {
        return immobStatus;
    }

    public void setImmobStatus(boolean immobStatus) {
        this.immobStatus = immobStatus;
    }

    public List<CertificateVerification> getCertificateVerifications() {
        return certificateVerifications;
    }

    public void setCertificateVerifications(List<CertificateVerification> certificateVerifications) {
        this.certificateVerifications = certificateVerifications;
    }

}
