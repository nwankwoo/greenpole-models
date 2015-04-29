/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model.holder;

/**
 *
 * @author Akin
 * Utilised in querying changes made to holder accounts, like change of name, change of address, etc
 */
public class QueryHolderChanges {
    //descriptor must be date:none / date:exact / date:between / date:before / date:after
    private String descriptor;
    private HolderChanges holderChanges;
    private String start_date;
    private String end_date;

    public QueryHolderChanges() {
    }

    public QueryHolderChanges(String descriptor, HolderChanges holderChanges, String start_date, String end_date) {
        this.descriptor = descriptor;
        this.holderChanges = holderChanges;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    public HolderChanges getHolderChanges() {
        return holderChanges;
    }

    public void setHolderChanges(HolderChanges holderChanges) {
        this.holderChanges = holderChanges;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }
}
