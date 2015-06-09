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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.greenpole.entity.model.Address;
import org.greenpole.entity.model.EmailAddress;
import org.greenpole.entity.model.PhoneNumber;
import org.greenpole.entity.model.clientcompany.Bank;
import org.greenpole.entity.model.clientcompany.BondOffer;
import org.greenpole.entity.model.clientcompany.BondOfferPaymentPlan;
import org.greenpole.entity.model.clientcompany.BondType;
import org.greenpole.entity.model.clientcompany.ClientCompany;
import org.greenpole.entity.model.clientcompany.InitialPublicOffer;
import org.greenpole.entity.model.clientcompany.PrivatePlacement;
import org.greenpole.entity.model.clientcompany.QueryClientCompany;
import org.greenpole.entity.model.clientcompany.ShareQuotation;
import org.greenpole.entity.model.clientcompany.UnitTransfer;
import org.greenpole.entity.model.holder.Administrator;
import org.greenpole.entity.model.holder.Holder;
import org.greenpole.entity.model.holder.HolderBondAccount;
import org.greenpole.entity.model.holder.HolderChanges;
import org.greenpole.entity.model.holder.HolderCompanyAccount;
import org.greenpole.entity.model.holder.HolderMerger;
import org.greenpole.entity.model.holder.HolderSignature;
import org.greenpole.entity.model.holder.PowerOfAttorney;
import org.greenpole.entity.model.holder.QueryHolder;
import org.greenpole.entity.model.holder.QueryHolderChanges;
import org.greenpole.entity.model.holder.QueryHolderConsolidation;
import org.greenpole.entity.model.holder.merge.AccountConsolidation;
import org.greenpole.entity.model.holder.merge.CompanyAccountConsolidation;
import org.greenpole.entity.model.stockbroker.Stockbroker;
import org.greenpole.entity.model.user.Department;
import org.greenpole.entity.model.user.Unit;
import org.greenpole.entity.model.user.User;
import org.greenpole.entity.security.Group;
import org.greenpole.entity.security.Login;
import org.greenpole.entity.security.Requirement;
import org.greenpole.entity.security.RequirementFunction;
import org.greenpole.entity.security.SystemCredentials;
import org.greenpole.entity.security.UserProfile;

/**
 *
 * @author Akinwale.Agbaje
 * The Notification wrapper to contain notifications to the stored and forwarded 
 * to the front-end.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"id","code","messageTag","notificationType","from","to",
    "description","model","fromType","toType","attendedTo"})
@XmlSeeAlso({Address.class, EmailAddress.class, PhoneNumber.class, Bank.class, BondOffer.class,
    BondOfferPaymentPlan.class, BondType.class, ClientCompany.class, InitialPublicOffer.class,
    PrivatePlacement.class, QueryClientCompany.class, ShareQuotation.class, UnitTransfer.class,
    Administrator.class, Holder.class, HolderBondAccount.class, HolderChanges.class,
    HolderCompanyAccount.class, HolderMerger.class, HolderSignature.class, PowerOfAttorney.class,
    QueryHolder.class, QueryHolderChanges.class, QueryHolderConsolidation.class, AccountConsolidation.class,
    CompanyAccountConsolidation.class, Stockbroker.class, Department.class, Unit.class, User.class,
    Group.class, Login.class, Requirement.class, RequirementFunction.class, SystemCredentials.class,
    UserProfile.class})
public class NotificationWrapper implements Serializable {
    @XmlElement
    private int id;
    @XmlElement
    private String code;
    @XmlElement
    private String description;
    @XmlElement
    private String from;
    @XmlElement
    private String to;
    @XmlElementWrapper(name = "wrapper")
    private List<?> model;
    @XmlElement
    private String messageTag;
    @XmlElement
    private String notificationType;
    @XmlElement
    private String fromType;
    @XmlElement
    private String toType;
    @XmlElement
    private boolean attendedTo;

    public NotificationWrapper() {
    }

    /**
     * Used to query / edit existing notification wrapper.
     * Parameters are self-explanatory.
     * @param id
     * @param code
     * @param description
     * @param from
     * @param to
     * @param model
     * @param messageTag
     * @param fromType
     * @param toType
     * @param attendedTo 
     */
    public NotificationWrapper(int id, String code, String description, String from, String to, List<?> model, String messageTag, String notificationType, String fromType, String toType, boolean attendedTo) {
        this.id = id;
        this.code = code;
        this.description = description;
        this.from = from;
        this.to = to;
        this.model = model;
        this.messageTag = messageTag;
        this.notificationType = notificationType;
        this.fromType = fromType;
        this.toType = toType;
        this.attendedTo = attendedTo;
    }

    /**
     * Used to create a new notification wrapper.
     * Parameters are self-explanatory.
     * @param code
     * @param description
     * @param from
     * @param to
     * @param model
     * @param messageTag
     * @param notificationType
     * @param fromType
     * @param toType
     * @param attendedTo 
     */
    public NotificationWrapper(String code, String description, String from, String to, List<?> model, String messageTag, String notificationType, String fromType, String toType, boolean attendedTo) {
        this.code = code;
        this.description = description;
        this.from = from;
        this.to = to;
        this.model = model;
        this.messageTag = messageTag;
        this.notificationType = notificationType;
        this.fromType = fromType;
        this.toType = toType;
        this.attendedTo = attendedTo;
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
     * Gets the notification code.
     * @return the notification code
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the notification code.
     * The notification code will serve as the notification's unique identifier,
     * as well as the notification's file name.
     * @param code the notification code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Gets the notificaton's description.
     * @return the notification's description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the notification's description.
     * @param description the notification's description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the sender of the notification.
     * @return the notification's sender
     */
    public String getFrom() {
        return from;
    }

    /**
     * Sets the name of the notification's initiator.
     * @param from the notification's sender
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Gets the receiver of the notification.
     * @return notification's receiver
     */
    public String getTo() {
        return to;
    }

    /**
     * Sets the name of the notification's receiver.
     * @param to the name of the notification's receiver
     */
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * Gets the notification's tag.
     * @return the notification's tag
     */
    public String getMessageTag() {
        return messageTag;
    }

    /**
     * Sets the notification's tag.
     * The notification's tag help distinguishes the different types of notification
     * the system utilises.
     * @param messageTag
     */
    public void setMessageTag(String messageTag) {
        this.messageTag = messageTag;
    }

    public String getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    /**
     * Gets the list of model(s) attached to the notification.
     * @return the list of model(s)
     */
    public List<?> getModel() {
        return model;
    }

    /**
     * Sets the list of model(s) attached to the notification.
     * Some notifications - like authorisation request notifications - may
     * come with entities to the added to the database. These entities are stored
     * in the model list.
     * @param model the list of model(s)
     */
    public void setModel(List<?> model) {
        this.model = model;
    }

    /**
     * Gets the notification's from-type.
     * @return the notification's from-type
     */
    public String getFromType() {
        return fromType;
    }

    /**
     * Sets the notification's from-type.
     * The from-type denotes the type of user the notification is coming from.
     * It could be an internal user (a user of the system) or an external user
     * (like a Holder).
     * @param fromType the notification's from-type
     */
    public void setFromType(String fromType) {
        this.fromType = fromType;
    }

    /**
     * Gets the notification's to-type.
     * @return the notification's to-type
     */
    public String getToType() {
        return toType;
    }

    /**
     * Sets the notification's to-type.
     * The to-type denotes the type of user the notification is going to.
     * It could be an internal user (a user of the system) or an external user
     * (like a Holder).
     * @param toType
     */
    public void setToType(String toType) {
        this.toType = toType;
    }

    /**
     * Gets the notification's attended-to status.
     * @return the notification's attended-to status
     */
    public boolean isAttendedTo() {
        return attendedTo;
    }

    /**
     * Sets the notification's attended-to status.
     * This denotes whether the notification has been attended to by the receiving
     * user. In some cases - especially if the to-type is external - the attended-to
     * is automatically set to true.
     * @param attendedTo the notification's attended-to status
     */
    public void setAttendedTo(boolean attendedTo) {
        this.attendedTo = attendedTo;
    }
}
