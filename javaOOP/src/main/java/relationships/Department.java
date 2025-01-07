/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relationships;

/**
 *
 * @author User
 */
public class Department {
    
    private int deprtId;
    private String daprtName;

    public int getDeprtId() {
        return deprtId;
    }

    public void setDeprtId(int deprtId) {
        this.deprtId = deprtId;
    }

    public String getDaprtName() {
        return daprtName;
    }

    public void setDaprtName(String daprtName) {
        this.daprtName = daprtName;
    }

    public Department(int deprtId, String daprtName) {
        this.deprtId = deprtId;
        this.daprtName = daprtName;
    }

    public Department() {
    }

    @Override
    public String toString() {
        return "Department{" + "deprtId=" + deprtId + ", daprtName=" + daprtName + '}';
    }
    
    
    
    
}
