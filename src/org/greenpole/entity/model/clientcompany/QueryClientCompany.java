
package org.greenpole.entity.model.clientcompany;

import java.util.Map;

/**
 *
 * @author Yusuf Samsudeen Babashola (Algorithm) 
 * This class encapsulate all the necessary search parameters that
 * can be used to query a client company
 */
public class QueryClientCompany {
    /**
     * Default representation of descriptor=clientCompany:none;shareUnit:none;numberOfShareholders:none;numberOfBondholders:none
     * and this is only set when user is performing a range search
     */
    private String descriptor;
    private Map<String,Double> shareUnit;
    private Map<String,Integer> numberOfShareholders;
    private Map<String,Integer> numberOfBondholders;
    private ClientCompany clientCompany;

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
