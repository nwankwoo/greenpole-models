package org.greenpole.entity.model.user;



import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Yusuf Samsudeen Babashola 
 * Carries information on a department.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"departmentName","units","users"})
@XmlSeeAlso({User.class,Unit.class})
public class Department implements Serializable {
    @XmlTransient
    private int departmentID;
    @XmlElement
    private String departmentName;
    @XmlElementWrapper(name = "units")
    private List<Unit> units;
    @XmlElementWrapper(name = "users")
    private List<User> users;

    /**
     * Initialises the department object.
     */
    public Department() {}

    /**
     * Used to query / edit an existing department.
     * Parameters are self-explanatory.
     * @param departmentID
     * @param departmentName
     * @param units
     * @param users 
     */
    public Department(int departmentID, String departmentName, List<Unit> units, List<User> users) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
        this.units = units;
        this.users = users;
    }

    /**
     * Used to create a new department.
     * Parameters are self-explanatory.
     * @param departmentName
     * @param units
     * @param users 
     */
    public Department(String departmentName, List<Unit> units, List<User> users) {
        this.departmentName = departmentName;
        this.units = units;
        this.users = users;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Unit> getUnits() {
        return units;
    }

    public void setUnits(List<Unit> units) {
        this.units = units;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
