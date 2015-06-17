/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.sms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Akinwale Agbaje
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"sender","text","flash","type","wapurl","binary","datacoding",
    "esmclass","srcton","srcnpi","destton","destnpi","sendDateTime","ValidityPeriod",
    "appid","pushurl","nopush","recipients"})
public class Message {
    @XmlElement
    private String flash;
    @XmlElement
    private String destton;
    @XmlElement
    private String text;
    @XmlElement
    private String binary;
    @XmlElement
    private String srcton;
    @XmlElement
    private Recipients recipients;
    @XmlElement
    private String sendDateTime;
    @XmlElement
    private String appid;
    @XmlElement
    private String type;
    @XmlElement
    private String ValidityPeriod;
    @XmlElement
    private String sender;
    @XmlElement
    private String pushurl;
    @XmlElement
    private String srcnpi;
    @XmlElement
    private String nopush;
    @XmlElement
    private String esmclass;
    @XmlElement
    private String wapurl;
    @XmlElement
    private String datacoding;
    @XmlElement
    private String destnpi;

    public String getFlash() {
        return flash;
    }

    public void setFlash(String flash) {
        this.flash = flash;
    }

    public String getDestton() {
        return destton;
    }

    public void setDestton(String destton) {
        this.destton = destton;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getBinary() {
        return binary;
    }

    public void setBinary(String binary) {
        this.binary = binary;
    }

    public String getSrcton() {
        return srcton;
    }

    public void setSrcton(String srcton) {
        this.srcton = srcton;
    }

    public Recipients getRecipients() {
        return recipients;
    }

    public void setRecipients(Recipients recipients) {
        this.recipients = recipients;
    }

    public String getSendDateTime() {
        return sendDateTime;
    }

    public void setSendDateTime(String sendDateTime) {
        this.sendDateTime = sendDateTime;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValidityPeriod() {
        return ValidityPeriod;
    }

    public void setValidityPeriod(String ValidityPeriod) {
        this.ValidityPeriod = ValidityPeriod;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getPushurl() {
        return pushurl;
    }

    public void setPushurl(String pushurl) {
        this.pushurl = pushurl;
    }

    public String getSrcnpi() {
        return srcnpi;
    }

    public void setSrcnpi(String srcnpi) {
        this.srcnpi = srcnpi;
    }

    public String getNopush() {
        return nopush;
    }

    public void setNopush(String nopush) {
        this.nopush = nopush;
    }

    public String getEsmclass() {
        return esmclass;
    }

    public void setEsmclass(String esmclass) {
        this.esmclass = esmclass;
    }

    public String getWapurl() {
        return wapurl;
    }

    public void setWapurl(String wapurl) {
        this.wapurl = wapurl;
    }

    public String getDatacoding() {
        return datacoding;
    }

    public void setDatacoding(String datacoding) {
        this.datacoding = datacoding;
    }

    public String getDestnpi() {
        return destnpi;
    }

    public void setDestnpi(String destnpi) {
        this.destnpi = destnpi;
    }

    @Override
    public String toString() {
        return "ClassPojo [flash = " + flash + ", destton = " + destton + ", text = " + text + ", binary = " + binary + ", srcton = " + srcton + ", recipients = " + recipients + ", sendDateTime = " + sendDateTime + ", appid = " + appid + ", type = " + type + ", ValidityPeriod = " + ValidityPeriod + ", sender = " + sender + ", pushurl = " + pushurl + ", srcnpi = " + srcnpi + ", nopush = " + nopush + ", esmclass = " + esmclass + ", wapurl = " + wapurl + ", datacoding = " + datacoding + ", destnpi = " + destnpi + "]";
    }
}
