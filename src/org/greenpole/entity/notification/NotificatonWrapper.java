/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.notification;

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
 * @author Akinwale.Agbaje
 * The Notification wrapper to contain notifications to the stored and forwarded 
 * to the front-end.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"from","to","description","model"})
public class NotificatonWrapper implements Serializable {
    @XmlElement
    private String description;
    @XmlElement
    private String from;
    @XmlElement
    private String to;
    @XmlElementWrapper(name = "wrapper")
    private List<?> model;

    public NotificatonWrapper() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public List<?> getModel() {
        return model;
    }

    public void setModel(List<?> model) {
        this.model = model;
    }
}
