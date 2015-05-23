/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
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
 * @author Akin
 * On the web service end, JAXB does not handle list parameters, so all lists must
 * be carried in this carrier and then unwrapped.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"carriedList"})
@XmlSeeAlso({Address.class, EmailAddress.class, PhoneNumber.class, Bank.class, BondOffer.class,
    BondOfferPaymentPlan.class, BondType.class, ClientCompany.class, InitialPublicOffer.class,
    PrivatePlacement.class, QueryClientCompany.class, ShareQuotation.class, UnitTransfer.class,
    Administrator.class, Holder.class, HolderBondAccount.class, HolderChanges.class,
    HolderCompanyAccount.class, HolderMerger.class, HolderSignature.class, PowerOfAttorney.class,
    QueryHolder.class, QueryHolderChanges.class, QueryHolderConsolidation.class, AccountConsolidation.class,
    CompanyAccountConsolidation.class, Stockbroker.class, Department.class, Unit.class, User.class,
    Group.class, Login.class, Requirement.class, RequirementFunction.class, SystemCredentials.class,
    UserProfile.class})
public class Carrier implements Serializable {
    @XmlElementWrapper(name = "carries")
    private List<?> carriedList;

    public Carrier() {
    }

    public Carrier(List<?> carriedList) {
        this.carriedList = carriedList;
    }

    public List<?> getCarriedList() {
        return carriedList;
    }

    public void setCarriedList(List<?> carriedList) {
        this.carriedList = carriedList;
    }
}
