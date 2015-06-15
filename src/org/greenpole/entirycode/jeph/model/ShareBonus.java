/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entirycode.jeph.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Jephthah Sadare
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"id", "clientCompanyId", "title", "qualifyDate",
    "qualifyShareUnit", "bonusUnitPerQualifyUnit"})

public class ShareBonus implements Serializable {

    @XmlElement
    private int id;
    @XmlElement
    private int clientCompanyId;
    @XmlElement
    private String title;
    @XmlElement
    private String qualifyDate;
    @XmlElement
    private int qualifyShareUnit;
    @XmlElement
    private int bonusUnitPerQualifyUnit;

    public ShareBonus() {
    }

    /**
     *
     * @param id
     * @param clientCompanyId
     * @param title
     * @param qualifyDate
     * @param qualifyShareUnit
     * @param bonusUnitPerQualifyUnit
     */
    public ShareBonus(int id, int clientCompanyId, String title, String qualifyDate, int qualifyShareUnit, int bonusUnitPerQualifyUnit) {
        this.id = id;
        this.clientCompanyId = clientCompanyId;
        this.title = title;
        this.qualifyDate = qualifyDate;
        this.qualifyShareUnit = qualifyShareUnit;
        this.bonusUnitPerQualifyUnit = bonusUnitPerQualifyUnit;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQualifyDate() {
        return qualifyDate;
    }

    public void setQualifyDate(String qualifyDate) {
        this.qualifyDate = qualifyDate;
    }

    public int getQualifyShareUnit() {
        return qualifyShareUnit;
    }

    public void setQualifyShareUnit(int qualifyShareUnit) {
        this.qualifyShareUnit = qualifyShareUnit;
    }

    public int getBonusUnitPerQualifyUnit() {
        return bonusUnitPerQualifyUnit;
    }

    public void setBonusUnitPerQualifyUnit(int bonusUnitPerQualifyUnit) {
        this.bonusUnitPerQualifyUnit = bonusUnitPerQualifyUnit;
    }

}
