/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model.holder;

import java.util.Map;

/**
 *
 * @author Jephthah Sadare
 * Utilised in querying holder accounts
 */
public class QueryHolder {
    //descriptor must be (default value) = holder:none;units:none;totalHoldings:none
    //possible values = holder:none / holder:exact
    //possible values = units:none / units:exact / units:range - note, units is tied to bond or share, so holderType must be set
    //possible values = totalHoldings:none / totalHoldings:exact / totalHoldings:range
    private String descriptor;
    private Holder holder;
    private Map<String, Integer> units; //should be "start" and "end" keys for range, and "start" for exact
    private Map<String, Integer> totalHoldings; //should be "start" and "end" keys for range, and "start" for exact

    public QueryHolder() {
    }

    public QueryHolder(String descriptor, Holder holder, Map<String, Integer> units, Map<String, Integer> totalHoldings) {
        this.descriptor = descriptor;
        this.holder = holder;
        this.units = units;
        this.totalHoldings = totalHoldings;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    public Holder getHolder() {
        return holder;
    }

    public void setHolder(Holder holder) {
        this.holder = holder;
    }

    public Map<String, Integer> getUnits() {
        return units;
    }

    public void setUnits(Map<String, Integer> units) {
        this.units = units;
    }

    public Map<String, Integer> getTotalHoldings() {
        return totalHoldings;
    }

    public void setTotalHoldings(Map<String, Integer> totalHoldings) {
        this.totalHoldings = totalHoldings;
    }
}
