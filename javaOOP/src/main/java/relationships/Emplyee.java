/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relationships;

/**
 *
 * @author User
 */
public class Emplyee {
    private  int id ;
    private float salary;
    private PersonalInformation personalInfo;  // refrance var that point to PersonalInformation class 
    private Department deprt;                  // refrance var that point to Department class  
    
    
    // ths constractor of emplyee we set it to accept tha atributes of this class and atributes of personalinfo class and instance of depart class 

    public Emplyee(int id, float salary,String fN,String mN,String LastName,String bloodGroup,String acountNum,String nationalty,int yearOfBirth, Department deprt) {
        this.id = id;
        this.salary = salary;
        
        this.deprt = deprt;   // this is asign the instasce of departn class and the reation ship betwen emplyee and depart class is aggregation
        // here we declass instancr for personalInfoClass  and he end 
        
        this.personalInfo=new PersonalInformation(fN,mN,LastName,bloodGroup,acountNum,nationalty,yearOfBirth);
        
    }

    public Emplyee() {
    }

    @Override
    public String toString() {
        return "Emplyee{" + "id=" + id + ", salary=" + salary + ", personalInfo=" + personalInfo + ", deprt=" + deprt + '}';

    }




}
