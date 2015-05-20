
package org.greenpole.entity.model.clientcompany;

import java.io.Serializable;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Yusuf Samsudeen Babashola (Algorithm) 
 * This class encapsulate all the necessary search parameters that
 * can be used to query a client company
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"descriptor","shareUnit","numberOfShareholders",
    "numberOfBondholders","clientCompany"})
public class QueryClientCompany implements Serializable {
    /**
     * Default representation of descriptor=clientCompany:none;shareUnit:none;numberOfShareholders:none;numberOfBondholders:none
     * and this is only set when user is performing a range search
     */
    @XmlElement
    private String descriptor;
    @XmlElementWrapper(name = "shareUnit")
    private Map<String, Double> shareUnit;
    @XmlElementWrapper(name = "numberOfShareholders")
    private Map<String, Integer> numberOfShareholders;
    @XmlElementWrapper(name = "numberOfBondholders")
    private Map<String, Integer> numberOfBondholders;
    @XmlElement
    private ClientCompany clientCompany;

    public QueryClientCompany() {
    }

    public QueryClientCompany(String descriptor, Map<String, Double> shareUnit, Map<String, Integer> numberOfShareholders, Map<String, Integer> numberOfBondholders, ClientCompany clientCompany) {
        this.descriptor = descriptor;
        this.shareUnit = shareUnit;
        this.numberOfShareholders = numberOfShareholders;
        this.numberOfBondholders = numberOfBondholders;
        this.clientCompany = clientCompany;
    }

    /**
     * @return the shareUnit
     */
    public Map<String,Double> getShareUnit() {
        return shareUnit;
    }

    /**
     * @param shareUnit the shareUnit to set
     */
    public void setShareUnit(Map<String,Double> shareUnit) {
        this.shareUnit = shareUnit;
    }

    /**
     * @return the numberOfShareholders
     */
    public Map<String,Integer> getNumberOfShareholders() {
        return numberOfShareholders;
    }

    /**
     * @param numberOfShareholders the numberOfShareholders to set
     */
    public void setNumberOfShareholders(Map<String,Integer> numberOfShareholders) {
        this.numberOfShareholders = numberOfShareholders;
    }

    /**
     * @return the startNumberOfBondholders
     */
    public Map<String,Integer> getNumberOfBondholders() {
        return numberOfBondholders;
    }

    /**
     * @param numberOfBondholders the startNumberOfBondholders to set
     */
    public void setNumberOfBondholders(Map<String,Integer> numberOfBondholders) {
        this.numberOfBondholders = numberOfBondholders;
    }

    /**
     * @return the clientCompany
     */
    public ClientCompany getClientCompany() {
        return clientCompany;
    }

    /**
     * @param clientCompany the clientCompany to set
     */
    public void setClientCompany(ClientCompany clientCompany) {
        this.clientCompany = clientCompany;
    }

    /**
     * @return the descriptor
     */
    public String getDescriptor() {
        return descriptor;
    }

    /**
     * @param descriptor the descriptor to set
     */
    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }
}
