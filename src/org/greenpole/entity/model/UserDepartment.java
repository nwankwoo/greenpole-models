package org.greenpole.entity.model;



import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Yusuf Samsudeen Babashola 
 */
public class UserDepartment {
    private int departmentID;
    private String departmentName;
    private Set units = new HashSet(0);

    public UserDepartment(int departmentID, String departmentName, Set units) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
        this.units = units;
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
    
    
}
