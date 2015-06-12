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
 *
 * @author user
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"clientCompanyId","totalSharesOnIssue","methodOnOffer","issuePrice",
    "issueSize","qualifyShareUnit","alottedUnitPerQualifyUnit","openingDate","closingDate","rightsClosed","rightsIssueApplication",
    "totalSharesDistributed","totalSharesRem","totalSharesOverSub","totalSharesPaidForAfterClose","totalSharesHolderOverSub"})
public class RightsIssue implements Serializable {
    @XmlElement
    private int id;
    @XmlElement
     private int clientCompanyId;
    @XmlElement
     private int totalSharesOnIssue;
    @XmlElement
     private String methodOnOffer;
    @XmlElement
     private double issuePrice;
    @XmlElement
     private int issueSize;
    @XmlElement
     private int qualifyShareUnit;
    @XmlElement
     private int alottedUnitPerQualifyUnit;
    @XmlElement
     private String qualifyDate;
    @XmlElement
     private String openingDate;
    @XmlElement
     private String closingDate;
    @XmlElement
     private boolean rightsClosed;
    @XmlElementWrapper(name = "rightsIssueApplication")
    private List<RightsIssueApplication> rightsIssueApplication;
    @XmlElement
    private int totalSharesDistributed;//shares distributed
    @XmlElement
    private int totalSharesRem;
    @XmlElement
    private int totalSharesOverSub;
    @XmlElement
    private int totalSharesPaidForAfterClose;
    @XmlElement
    private int totalSharesHolderOverSub;
    public RightsIssue() {
    }

    public RightsIssue(int id, int clientCompanyId, int totalSharesOnIssue, String methodOnOffer, double issuePrice, int issueSize, int qualifyShareUnit, int alottedUnitPerQualifyUnit, String qualifyDate, String openingDate, String closingDate, boolean rightsClosed) {
        this.id = id;
        this.clientCompanyId = clientCompanyId;
        this.totalSharesOnIssue = totalSharesOnIssue;
        this.methodOnOffer = methodOnOffer;
        this.issuePrice = issuePrice;
        this.issueSize = issueSize;
        this.qualifyShareUnit = qualifyShareUnit;
        this.alottedUnitPerQualifyUnit = alottedUnitPerQualifyUnit;
        this.qualifyDate = qualifyDate;
        this.openingDate = openingDate;
        this.closingDate = closingDate;
        this.rightsClosed = rightsClosed;
    }

    public RightsIssue(int clientCompanyId, int totalSharesOnIssue, String methodOnOffer, double issuePrice, int issueSize, int qualifyShareUnit, int alottedUnitPerQualifyUnit, String qualifyDate, String openingDate, String closingDate, boolean rightsClosed) {
        this.clientCompanyId = clientCompanyId;
        this.totalSharesOnIssue = totalSharesOnIssue;
        this.methodOnOffer = methodOnOffer;
        this.issuePrice = issuePrice;
        this.issueSize = issueSize;
        this.qualifyShareUnit = qualifyShareUnit;
        this.alottedUnitPerQualifyUnit = alottedUnitPerQualifyUnit;
        this.qualifyDate = qualifyDate;
        this.openingDate = openingDate;
        this.closingDate = closingDate;
        this.rightsClosed = rightsClosed;
    }

    public RightsIssue(int id, int clientCompanyId, int totalSharesOnIssue, String methodOnOffer, double issuePrice, int issueSize, int qualifyShareUnit, int alottedUnitPerQualifyUnit, String qualifyDate, String openingDate, String closingDate, boolean rightsClosed, List<RightsIssueApplication> rightsIssueApplication, int totalSharesSub, int totalSharesRem, int totalSharesOverSub) {
        this.id = id;
        this.clientCompanyId = clientCompanyId;
        this.totalSharesOnIssue = totalSharesOnIssue;
        this.methodOnOffer = methodOnOffer;
        this.issuePrice = issuePrice;
        this.issueSize = issueSize;
        this.qualifyShareUnit = qualifyShareUnit;
        this.alottedUnitPerQualifyUnit = alottedUnitPerQualifyUnit;
        this.qualifyDate = qualifyDate;
        this.openingDate = openingDate;
        this.closingDate = closingDate;
        this.rightsClosed = rightsClosed;
        this.rightsIssueApplication = rightsIssueApplication;
        this.totalSharesDistributed = totalSharesSub;
        this.totalSharesRem = totalSharesRem;
        this.totalSharesOverSub = totalSharesOverSub;
    }

    public RightsIssue(int clientCompanyId, int totalSharesOnIssue, String methodOnOffer, double issuePrice, int issueSize, int qualifyShareUnit, int alottedUnitPerQualifyUnit, String qualifyDate, String openingDate, String closingDate, boolean rightsClosed, List<RightsIssueApplication> rightsIssueApplication, int totalSharesSub, int totalSharesRem, int totalSharesOverSub) {
        this.clientCompanyId = clientCompanyId;
        this.totalSharesOnIssue = totalSharesOnIssue;
        this.methodOnOffer = methodOnOffer;
        this.issuePrice = issuePrice;
        this.issueSize = issueSize;
        this.qualifyShareUnit = qualifyShareUnit;
        this.alottedUnitPerQualifyUnit = alottedUnitPerQualifyUnit;
        this.qualifyDate = qualifyDate;
        this.openingDate = openingDate;
        this.closingDate = closingDate;
        this.rightsClosed = rightsClosed;
        this.rightsIssueApplication = rightsIssueApplication;
        this.totalSharesDistributed = totalSharesSub;
        this.totalSharesRem = totalSharesRem;
        this.totalSharesOverSub = totalSharesOverSub;
    }

    public RightsIssue(int id, int clientCompanyId, int totalSharesOnIssue, String methodOnOffer, double issuePrice, int issueSize, int qualifyShareUnit, int alottedUnitPerQualifyUnit, String qualifyDate, String openingDate, String closingDate, boolean rightsClosed, List<RightsIssueApplication> rightsIssueApplication, int totalSharesSub, int totalSharesRem, int totalSharesOverSub, int totalSharesPaidForAfterClose, int totalSharesHolderOverSub) {
        this.id = id;
        this.clientCompanyId = clientCompanyId;
        this.totalSharesOnIssue = totalSharesOnIssue;
        this.methodOnOffer = methodOnOffer;
        this.issuePrice = issuePrice;
        this.issueSize = issueSize;
        this.qualifyShareUnit = qualifyShareUnit;
        this.alottedUnitPerQualifyUnit = alottedUnitPerQualifyUnit;
        this.qualifyDate = qualifyDate;
        this.openingDate = openingDate;
        this.closingDate = closingDate;
        this.rightsClosed = rightsClosed;
        this.rightsIssueApplication = rightsIssueApplication;
        this.totalSharesDistributed = totalSharesSub;
        this.totalSharesRem = totalSharesRem;
        this.totalSharesOverSub = totalSharesOverSub;
        this.totalSharesPaidForAfterClose = totalSharesPaidForAfterClose;
        this.totalSharesHolderOverSub = totalSharesHolderOverSub;
    }

    public RightsIssue(int clientCompanyId, int totalSharesOnIssue, String methodOnOffer, double issuePrice, int issueSize, int qualifyShareUnit, int alottedUnitPerQualifyUnit, String qualifyDate, String openingDate, String closingDate, boolean rightsClosed, List<RightsIssueApplication> rightsIssueApplication, int totalSharesSub, int totalSharesRem, int totalSharesOverSub, int totalSharesPaidForAfterClose, int totalSharesHolderOverSub) {
        this.clientCompanyId = clientCompanyId;
        this.totalSharesOnIssue = totalSharesOnIssue;
        this.methodOnOffer = methodOnOffer;
        this.issuePrice = issuePrice;
        this.issueSize = issueSize;
        this.qualifyShareUnit = qualifyShareUnit;
        this.alottedUnitPerQualifyUnit = alottedUnitPerQualifyUnit;
        this.qualifyDate = qualifyDate;
        this.openingDate = openingDate;
        this.closingDate = closingDate;
        this.rightsClosed = rightsClosed;
        this.rightsIssueApplication = rightsIssueApplication;
        this.totalSharesDistributed = totalSharesSub;
        this.totalSharesRem = totalSharesRem;
        this.totalSharesOverSub = totalSharesOverSub;
        this.totalSharesPaidForAfterClose = totalSharesPaidForAfterClose;
        this.totalSharesHolderOverSub = totalSharesHolderOverSub;
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
     * @return the totalSharesOnIssue
     */
    public int getTotalSharesOnIssue() {
        return totalSharesOnIssue;
    }

    /**
     * @param totalSharesOnIssue the totalSharesOnIssue to set
     */
    public void setTotalSharesOnIssue(int totalSharesOnIssue) {
        this.totalSharesOnIssue = totalSharesOnIssue;
    }

    /**
     * @return the methodOnOffer
     */
    public String getMethodOnOffer() {
        return methodOnOffer;
    }

    /**
     * @param methodOnOffer the methodOnOffer to set
     */
    public void setMethodOnOffer(String methodOnOffer) {
        this.methodOnOffer = methodOnOffer;
    }

    /**
     * @return the issuePrice
     */
    public double getIssuePrice() {
        return issuePrice;
    }

    /**
     * @param issuePrice the issuePrice to set
     */
    public void setIssuePrice(double issuePrice) {
        this.issuePrice = issuePrice;
    }

    /**
     * @return the issueSize
     */
    public int getIssueSize() {
        return issueSize;
    }

    /**
     * @param issueSize the issueSize to set
     */
    public void setIssueSize(int issueSize) {
        this.issueSize = issueSize;
    }

    /**
     * @return the qualifyShareUnit
     */
    public int getQualifyShareUnit() {
        return qualifyShareUnit;
    }

    /**
     * @param qualifyShareUnit the qualifyShareUnit to set
     */
    public void setQualifyShareUnit(int qualifyShareUnit) {
        this.qualifyShareUnit = qualifyShareUnit;
    }

    /**
     * @return the alottedUnitPerQualifyUnit
     */
    public int getAlottedUnitPerQualifyUnit() {
        return alottedUnitPerQualifyUnit;
    }

    /**
     * @param alottedUnitPerQualifyUnit the alottedUnitPerQualifyUnit to set
     */
    public void setAlottedUnitPerQualifyUnit(int alottedUnitPerQualifyUnit) {
        this.alottedUnitPerQualifyUnit = alottedUnitPerQualifyUnit;
    }

    /**
     * @return the qualifyDate
     */
    public String getQualifyDate() {
        return qualifyDate;
    }

    /**
     * @param qualifyDate the qualifyDate to set
     */
    public void setQualifyDate(String qualifyDate) {
        this.qualifyDate = qualifyDate;
    }

    /**
     * @return the openingDate
     */
    public String getOpeningDate() {
        return openingDate;
    }

    /**
     * @param openingDate the openingDate to set
     */
    public void setOpeningDate(String openingDate) {
        this.openingDate = openingDate;
    }

    /**
     * @return the closingDate
     */
    public String getClosingDate() {
        return closingDate;
    }

    /**
     * @param closingDate the closingDate to set
     */
    public void setClosingDate(String closingDate) {
        this.closingDate = closingDate;
    }

    /**
     * @return the rightsClosed
     */
    public boolean isRightsClosed() {
        return rightsClosed;
    }

    /**
     * @param rightsClosed the rightsClosed to set
     */
    public void setRightsClosed(boolean rightsClosed) {
        this.rightsClosed = rightsClosed;
    }

    /**
     * @return the rightsIssueApplication
     */
    public List<RightsIssueApplication> getRightsIssueApplication() {
        return rightsIssueApplication;
    }

    /**
     * @param rightsIssueApplication the rightsIssueApplication to set
     */
    public void setRightsIssueApplication(List<RightsIssueApplication> rightsIssueApplication) {
        this.rightsIssueApplication = rightsIssueApplication;
    }

    /**
     * @return the totalSharesDistributed
     */
    public int getTotalSharesDistributed() {
        return totalSharesDistributed;
    }

    /**
     * @param totalSharesDistributed the totalSharesDistributed to set
     */
    public void setTotalSharesDistributed(int totalSharesDistributed) {
        this.totalSharesDistributed = totalSharesDistributed;
    }

    /**
     * @return the totalSharesRem
     */
    public int getTotalSharesRem() {
        return totalSharesRem;
    }

    /**
     * @param totalSharesRem the totalSharesRem to set
     */
    public void setTotalSharesRem(int totalSharesRem) {
        this.totalSharesRem = totalSharesRem;
    }

    /**
     * @return the totalSharesOverSub
     */
    public int getTotalSharesOverSub() {
        return totalSharesOverSub;
    }

    /**
     * @param totalSharesOverSub the totalSharesOverSub to set
     */
    public void setTotalSharesOverSub(int totalSharesOverSub) {
        this.totalSharesOverSub = totalSharesOverSub;
    }

    /**
     * @return the totalSharesPaidForAfterClose
     */
    public int getTotalSharesPaidForAfterClose() {
        return totalSharesPaidForAfterClose;
    }

    /**
     * @param totalSharesPaidForAfterClose the totalSharesPaidForAfterClose to set
     */
    public void setTotalSharesPaidForAfterClose(int totalSharesPaidForAfterClose) {
        this.totalSharesPaidForAfterClose = totalSharesPaidForAfterClose;
    }

    /**
     * @return the totalSharesHolderOverSub
     */
    public int getTotalSharesHolderOverSub() {
        return totalSharesHolderOverSub;
    }

    /**
     * @param totalSharesHolderOverSub the totalSharesHolderOverSub to set
     */
    public void setTotalSharesHolderOverSub(int totalSharesHolderOverSub) {
        this.totalSharesHolderOverSub = totalSharesHolderOverSub;
    }
    
}
