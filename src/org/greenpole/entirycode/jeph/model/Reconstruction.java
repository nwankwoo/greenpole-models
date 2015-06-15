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
import javax.xml.bind.annotation.XmlType;
import org.greenpole.entity.model.holder.HolderCompanyAccount;

/**
 *
 * @author Jephthah Sadare
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"id", "clientCompanyId", "reconstructionType", "shareRatio",
    "increaseOrDecrease", "shareVolumeBefore", "unitPriceBefore",
    "shareVolumeAfter", "unitPriceAfter", "holders"})

public class Reconstruction implements Serializable {

    @XmlElement
    private int id;
    @XmlElement
    private int clientCompanyId;
    @XmlElement
    private int reconstructionTypeId;
    @XmlElement
    private int qualifyShareUnit;
    @XmlElement
    private int actionShareUnit;
    @XmlElement
    private String increaseOrDecrease;
    @XmlElement
    private String shareVolumeBefore;
    @XmlElement
    private String unitPriceBefore;
    @XmlElement
    private String shareVolumeAfter;
    @XmlElement
    private String unitPriceAfter;
    @XmlElementWrapper(name = "holderCompanyAccount")
    private List<HolderCompanyAccount> holderCompanyAccount;

    public Reconstruction() {
    }

    /**
     *
     * @param id
     * @param clientCompanyId
     * @param reconstructionTypeId
     * @param qualifyShareUnit
     * @param actionShareUnit
     * @param increaseOrDecrease
     * @param shareVolumeBefore
     * @param unitPriceBefore
     * @param shareVolumeAfter
     * @param unitPriceAfter
     * @param holderCompanyAccount
     */
    public Reconstruction(int id, int clientCompanyId, int reconstructionTypeId, int qualifyShareUnit, int actionShareUnit, String increaseOrDecrease, String shareVolumeBefore, String unitPriceBefore, String shareVolumeAfter, String unitPriceAfter, List<HolderCompanyAccount> holderCompanyAccount) {
        this.id = id;
        this.clientCompanyId = clientCompanyId;
        this.reconstructionTypeId = reconstructionTypeId;
        this.qualifyShareUnit = qualifyShareUnit;
        this.actionShareUnit = actionShareUnit;
        this.increaseOrDecrease = increaseOrDecrease;
        this.shareVolumeBefore = shareVolumeBefore;
        this.unitPriceBefore = unitPriceBefore;
        this.shareVolumeAfter = shareVolumeAfter;
        this.unitPriceAfter = unitPriceAfter;
        this.holderCompanyAccount = holderCompanyAccount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClientCompanyId() {
        return clientCompanyId;
    }

    public void setClientCompanyId(int clientCompanyId) {
        this.clientCompanyId = clientCompanyId;
    }

    public int getReconstructionTypeId() {
        return reconstructionTypeId;
    }

    public void setReconstructionTypeId(int reconstructionTypeId) {
        this.reconstructionTypeId = reconstructionTypeId;
    }

    public int getQualifyShareUnit() {
        return qualifyShareUnit;
    }

    public void setQualifyShareUnit(int qualifyShareUnit) {
        this.qualifyShareUnit = qualifyShareUnit;
    }

    public int getActionShareUnit() {
        return actionShareUnit;
    }

    public void setActionShareUnit(int actionShareUnit) {
        this.actionShareUnit = actionShareUnit;
    }

    public String getIncreaseOrDecrease() {
        return increaseOrDecrease;
    }

    public void setIncreaseOrDecrease(String increaseOrDecrease) {
        this.increaseOrDecrease = increaseOrDecrease;
    }

    public String getShareVolumeBefore() {
        return shareVolumeBefore;
    }

    public void setShareVolumeBefore(String shareVolumeBefore) {
        this.shareVolumeBefore = shareVolumeBefore;
    }

    public String getUnitPriceBefore() {
        return unitPriceBefore;
    }

    public void setUnitPriceBefore(String unitPriceBefore) {
        this.unitPriceBefore = unitPriceBefore;
    }

    public String getShareVolumeAfter() {
        return shareVolumeAfter;
    }

    public void setShareVolumeAfter(String shareVolumeAfter) {
        this.shareVolumeAfter = shareVolumeAfter;
    }

    public String getUnitPriceAfter() {
        return unitPriceAfter;
    }

    public void setUnitPriceAfter(String unitPriceAfter) {
        this.unitPriceAfter = unitPriceAfter;
    }

    public List<HolderCompanyAccount> getHolderCompanyAccount() {
        return holderCompanyAccount;
    }

    public void setHolderCompanyAccount(List<HolderCompanyAccount> holderCompanyAccount) {
        this.holderCompanyAccount = holderCompanyAccount;
    }

}
