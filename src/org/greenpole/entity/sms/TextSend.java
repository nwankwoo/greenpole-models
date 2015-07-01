/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.sms;

import java.io.Serializable;
import java.util.Map;

/**
 *
 * @author Akinwale Agbaje
 * Used to send text messages to the text message queue.
 */
public class TextSend implements Serializable {
    private String sender;
    private String text;
    private String phoneNumber;
    private String message_id;
    private String purpose;
    private Map<String, String> numbersAndIds;
    private boolean isFlash;
    private boolean isBulk;
    private boolean allowText;
    private boolean withDbInfo;
    private int holderId;

    public TextSend() {
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMessage_id() {
        return message_id;
    }

    public void setMessage_id(String message_id) {
        this.message_id = message_id;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public Map<String, String> getNumbersAndIds() {
        return numbersAndIds;
    }

    public void setNumbersAndIds(Map<String, String> numbersAndIds) {
        this.numbersAndIds = numbersAndIds;
    }

    public boolean isIsFlash() {
        return isFlash;
    }

    public void setIsFlash(boolean isFlash) {
        this.isFlash = isFlash;
    }

    public boolean isIsBulk() {
        return isBulk;
    }

    public void setIsBulk(boolean isBulk) {
        this.isBulk = isBulk;
    }

    public boolean isAllowText() {
        return allowText;
    }

    public void setAllowText(boolean allowText) {
        this.allowText = allowText;
    }

    public boolean isWithDbInfo() {
        return withDbInfo;
    }

    public void setWithDbInfo(boolean withDbInfo) {
        this.withDbInfo = withDbInfo;
    }

    public int getHolderId() {
        return holderId;
    }

    public void setHolderId(int holderId) {
        this.holderId = holderId;
    }
}
