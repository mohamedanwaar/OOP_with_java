/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relationships;

/**
 *
 * @author User
 */
public class PersonalInformation {
    private String  firstName;
    private String  midlleName;
    private String  lastName;
    private String  bloodGroup;
    private String  acountNumber;
    private String  nationality;
    private int  yearOfBirth;

    public PersonalInformation()
    {
        
    }

    
    
    
    public PersonalInformation(String firstName, String midlleName, String lastName, String bloodGroup, String acountNumber, String nationality, int yearOfBirth) {
        this.firstName = firstName;
        this.midlleName = midlleName;
        this.lastName = lastName;
        this.bloodGroup = bloodGroup;
        this.acountNumber = acountNumber;
        this.nationality = nationality;
        this.yearOfBirth = yearOfBirth;
    }




    @Override
    public String toString() {
        return "PersonalInformation{" + "firstName=" + firstName + ", midlleName=" + midlleName + ", lastName=" + lastName + ", bloodGroup=" + bloodGroup + ", acountNumber=" + acountNumber + ", nationality=" + nationality + ", yearOfBirth=" + yearOfBirth + '}';
    }
    
    
    
    


        




    
}
