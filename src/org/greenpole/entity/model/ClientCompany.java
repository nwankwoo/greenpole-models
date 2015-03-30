/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model;

/**
 *
 * @author Akinwale Agbaje
 * The client company model, utilised by the front-end and middle-tier in
 * storing and retrieving client company information.
 */
public class ClientCompany {
    
    private String name;
    private String code;
    private String nseSector;
    private String ceo;
    private String secretary;
    private String address;
    private String depositoryName;
    private int depositoryId;
    private boolean valid;

    public ClientCompany() {
    }

    public ClientCompany(String name, String code, String nseSector, String ceo, String secretary, String address, String depositoryName, int depositoryId, boolean valid) {
        this.name = name;
        this.code = code;
        this.nseSector = nseSector;
        this.ceo = ceo;
        this.secretary = secretary;
        this.address = address;
        this.depositoryName = depositoryName;
        this.depositoryId = depositoryId;
        this.valid = valid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNseSector() {
        return nseSector;
    }

    public void setNseSector(String nseSector) {
        this.nseSector = nseSector;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public String getSecretary() {
        return secretary;
    }

    public void setSecretary(String secretary) {
        this.secretary = secretary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepositoryName() {
        return depositoryName;
    }

    public void setDepositoryName(String depositoryName) {
        this.depositoryName = depositoryName;
    }

    public int getDepositoryId() {
        return depositoryId;
    }

    public void setDepositoryId(int depositoryId) {
        this.depositoryId = depositoryId;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    @Override
    public String toString() {
        return "ClientCompany{" + "name=" + name + ", code=" + code + ", nseSector=" + nseSector + ", ceo=" + ceo + ", secretary=" + secretary + ", address=" + address + ", depositoryName=" + depositoryName + ", depositoryId=" + depositoryId + ", valid=" + valid + '}';
    }
    
}
