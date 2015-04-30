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
    //descriptor must be (default value) = holder:none;shareUnits:none;totalHoldings:none
    //possible values = holder:none / holder:exact
    //possible values = shareUnits:none / shareUnits:exact / shareUnits:range
    //possible values = totalHoldings:none / totalHoldings:exact / totalHoldings:range
    private String descriptor;
    private Holder holder;
    private Map<String, Integer> shareUnits; //should be "start" and "end" keys for range, and "start" for exact
    private Map<String, Integer> totalHoldings; //should be "start" and "end" keys for range, and "start" for exact

    public QueryHolder() {
    }

    public QueryHolder(String descriptor, Holder holder, Map<String, Integer> shareUnits, Map<String, Integer> totalHoldings) {
        this.descriptor = descriptor;
        this.holder = holder;
        this.shareUnits = shareUnits;
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

    public Map<String, Integer> getShareUnits() {
        return shareUnits;
    }

    public void setShareUnits(Map<String, Integer> shareUnits) {
        this.shareUnits = shareUnits;
    }

    public Map<String, Integer> getTotalHoldings() {
        return totalHoldings;
    }

    public void setTotalHoldings(Map<String, Integer> totalHoldings) {
        this.totalHoldings = totalHoldings;
    }
}
