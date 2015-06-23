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
import org.greenpole.entity.model.holder.HolderCompanyAccount;

/**
 *processes certificate split confirmation
 * @author emmanuel.idoko
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"certificateShareVolume","holderCompanyAccount"})
public class CertificateSplitConfirm implements Serializable {
 @XmlElement
     private int certificateShareVolume; 
 @XmlElementWrapper (name = "holderCompanyAccount")
private List<HolderCompanyAccount> holderCompanyAccount;

    public CertificateSplitConfirm() {
    }

    public CertificateSplitConfirm(int certificateShareVolume, List<HolderCompanyAccount> holderCompanyAccount) {
        this.certificateShareVolume = certificateShareVolume;
        this.holderCompanyAccount = holderCompanyAccount;
    }

    /**
     * @return the certificateShareVolume
     */
    public int getCertificateShareVolume() {
        return certificateShareVolume;
    }

    /**
     * @param certificateShareVolume the certificateShareVolume to set
     */
    public void setCertificateShareVolume(int certificateShareVolume) {
        this.certificateShareVolume = certificateShareVolume;
    }

    /**
     * @return the holderCompanyAccount
     */
    public List<HolderCompanyAccount> getHolderCompanyAccount() {
        return holderCompanyAccount;
    }

    /**
     * @param holderCompanyAccount the holderCompanyAccount to set
     */
    public void setHolderCompanyAccount(List<HolderCompanyAccount> holderCompanyAccount) {
        this.holderCompanyAccount = holderCompanyAccount;
    }
 
}
