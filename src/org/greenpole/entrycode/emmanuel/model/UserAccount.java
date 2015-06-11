/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entrycode.emmanuel.model;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author Jephthah Sadare
 */
public class UserAccount {
    
    @XmlElement
    private int id;
    // private long versionId;
    // private AprDepartment aprDepartment;
    // private AprUnit aprUnit;
    @XmlElement
    private String firstName;
    @XmlElement
    private String middleName;
    @XmlElement
    private String lastName;
    // private Date dob;
    @XmlElement
    private String gender;
    @XmlElement
    private String position;
    // private List<Groups> groups;
    // private List<RequirementFunction> requirementFunctions;
    // private List<UserAccess> userAccesses;
    // private List<Requirement> requirements;  

    public UserAccount(int id, String firstName, String middleName, String lastName, String gender, String position) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    
    
}
