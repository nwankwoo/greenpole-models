
package org.greenpole.entity.model.clientcompany;

import java.util.List;

/**
 *
 * @author Yusuf Samsudeen Babashola (Algorithm) 
 * This class encapsulate all the necessary search parameters that
 * can be used to query a client company
 */
public class QueryClientCompany {
    
    private List<Double> startShareUnit;
    private List<Double> endShareUnit;
    
    private List<Integer> startNumberOfShareholders;
    private List<Integer> endNumberOfShareholders;
    
    private List<Integer> startNumberOfBondholders;
    private List<Integer> endNumberOfBondholders;
    
    private List<ClientCompany> clientCompany;

    /**
     * @return the startShareUnit
     */
    public List<Double> getStartShareUnit() {
        return startShareUnit;
    }

    /**
     * @param startShareUnit the startShareUnit to set
     */
    public void setStartShareUnit(List<Double> startShareUnit) {
        this.startShareUnit = startShareUnit;
    }

    /**
     * @return the endShareUnit
     */
    public List<Double> getEndShareUnit() {
        return endShareUnit;
    }

    /**
     * @param endShareUnit the endShareUnit to set
     */
    public void setEndShareUnit(List<Double> endShareUnit) {
        this.endShareUnit = endShareUnit;
    }

    /**
     * @return the startNumberOfShareholders
     */
    public List<Integer> getStartNumberOfShareholders() {
        return startNumberOfShareholders;
    }

    /**
     * @param startNumberOfShareholders the startNumberOfShareholders to set
     */
    public void setStartNumberOfShareholders(List<Integer> startNumberOfShareholders) {
        this.startNumberOfShareholders = startNumberOfShareholders;
    }

    /**
     * @return the endNumberOfShareholders
     */
    public List<Integer> getEndNumberOfShareholders() {
        return endNumberOfShareholders;
    }

    /**
     * @param endNumberOfShareholders the endNumberOfShareholders to set
     */
    public void setEndNumberOfShareholders(List<Integer> endNumberOfShareholders) {
        this.endNumberOfShareholders = endNumberOfShareholders;
    }

    /**
     * @return the startNumberOfBondholders
     */
    public List<Integer> getStartNumberOfBondholders() {
        return startNumberOfBondholders;
    }

    /**
     * @param startNumberOfBondholders the startNumberOfBondholders to set
     */
    public void setStartNumberOfBondholders(List<Integer> startNumberOfBondholders) {
        this.startNumberOfBondholders = startNumberOfBondholders;
    }

    /**
     * @return the endNumberOfBondholders
     */
    public List<Integer> getEndNumberOfBondholders() {
        return endNumberOfBondholders;
    }

    /**
     * @param endNumberOfBondholders the endNumberOfBondholders to set
     */
    public void setEndNumberOfBondholders(List<Integer> endNumberOfBondholders) {
        this.endNumberOfBondholders = endNumberOfBondholders;
    }

    /**
     * @return the clientCompany
     */
    public List<ClientCompany> getClientCompany() {
        return clientCompany;
    }

    /**
     * @param clientCompany the clientCompany to set
     */
    public void setClientCompany(List<ClientCompany> clientCompany) {
        this.clientCompany = clientCompany;
    }
    
    
    
}
