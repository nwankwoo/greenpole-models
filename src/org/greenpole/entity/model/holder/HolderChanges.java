/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model.holder;

/**
 *
 * @author Akin
 * Utilised in carrying holder changes between the front-end and the back-end.
 */
public class HolderChanges {
    private int id;
    private String initialForm;
    private String currentForm;
    private int changeTypeId;
    private String changeDate;
    private Holder holder;

    public HolderChanges() {
    }

    public HolderChanges(String initialForm, String currentForm, int changeTypeId, String changeDate, Holder holder) {
        this.initialForm = initialForm;
        this.currentForm = currentForm;
        this.changeTypeId = changeTypeId;
        this.changeDate = changeDate;
        this.holder = holder;
    }

    public HolderChanges(int id, String initialForm, String currentForm, int changeTypeId, String changeDate, Holder holder) {
        this.id = id;
        this.initialForm = initialForm;
        this.currentForm = currentForm;
        this.changeTypeId = changeTypeId;
        this.changeDate = changeDate;
        this.holder = holder;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInitialForm() {
        return initialForm;
    }

    public void setInitialForm(String initialForm) {
        this.initialForm = initialForm;
    }

    public String getCurrentForm() {
        return currentForm;
    }

    public void setCurrentForm(String currentForm) {
        this.currentForm = currentForm;
    }

    public int getChangeTypeId() {
        return changeTypeId;
    }

    public void setChangeTypeId(int changeTypeId) {
        this.changeTypeId = changeTypeId;
    }

    public String getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(String changeDate) {
        this.changeDate = changeDate;
    }

    public Holder getHolder() {
        return holder;
    }

    public void setHolder(Holder holder) {
        this.holder = holder;
    }
}
