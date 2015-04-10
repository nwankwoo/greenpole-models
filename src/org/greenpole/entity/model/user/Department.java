package org.greenpole.entity.model.user;



import java.util.HashSet;
import java.util.Set;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.greenpole.entity.model.clientcompany.ClientCompany;

/**
 *
 * @author Yusuf Samsudeen Babashola 
 * Carries information on a department.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"departmentID","departmentName","units","users"})
@XmlSeeAlso({User.class,Unit.class})
public class Department {
    @XmlElement
    private int departmentID;
    @XmlElement
    private String departmentName;
    @XmlElementWrapper(name = "units")
    private Set units = new HashSet(0);
    @XmlElementWrapper(name = "users")
    private Set users = new HashSet(0);

    /**
     * Initialises the department object.
     */
    public Department() {}
    
    /**
     * Collects all values of the department object.
     * @param departmentID the department's id
     * @param departmentName the department's name
     * @param units the department's units
     * @param users the department's employees (system users)
     */
    public Department(int departmentID, String departmentName, Set units, Set users) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
        this.units = units;
        this.users = users;
    }
    
    /**
     * Gets the department's id.
     * @return the department's id
     */
    public int getDepartmentID() {
        return departmentID;
    }

    /**
     * Sets the department's id.
     * @param departmentID the department's id
     */
    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    /**
     * Gets the department's name.
     * @return the department's name
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * Sets the department's name.
     * @param departmentName the department's name
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    /**
     * Gets the department's units.
     * @return the department's units
     */
    public Set getUnits() {
        return units;
    }

    /**
     * Sets the department's units.
     * @param units the department's units
     */
    public void setUnits(Set units) {
        this.units = units;
    }

    /**
     * Gets the department's employees (system users).
     * @return the department's employees
     */
    public Set getUsers() {
        return users;
    }

    /**
     * Sets the department's employees (system users).
     * @param users the department's employees
     */
    public void setUsers(Set users) {
        this.users = users;
    }
}
