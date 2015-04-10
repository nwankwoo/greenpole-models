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

    public Department() {}
    
    public Department(int departmentID, String departmentName, Set units, Set users) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
        this.units = units;
        this.users = users;
    }
    
    /**
     * @return the departmentID
     */
    public int getDepartmentID() {
        return departmentID;
    }

    /**
     * @param departmentID the departmentID to set
     */
    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    /**
     * @return the departmentName
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * @param departmentName the departmentName to set
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    /**
     * @return the units
     */
    public Set getUnits() {
        return units;
    }

    /**
     * @param units the units to set
     */
    public void setUnits(Set units) {
        this.units = units;
    }

    /**
     * 
     * @return 
     */
    public Set getUsers() {
        return users;
    }

    /**
     * 
     * @param users 
     */
    public void setUsers(Set users) {
        this.users = users;
    }
}
