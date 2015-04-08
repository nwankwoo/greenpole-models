package org.greenpole.entity.model;



import java.util.List;

/**
 *
 * @author Yusuf Samsudeen Babashola 
 */
public class Department {
    private int departmentID;
    private String departmentName;
    private List <Unit> units ;

    public Department(int departmentID, String departmentName, List<Unit> units) {
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
    public List <Unit> getUnits() {
        return units;
    }

    /**
     * @param units the units to set
     */
    public void setUnits(List <Unit> units) {
        this.units = units;
    }
    
    
}
