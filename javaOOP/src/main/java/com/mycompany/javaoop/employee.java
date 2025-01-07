/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaoop;

/**
 *
 * @author User
 */
public class employee {
   
    
    private String name;
    private String emailAdress;
    private String phone ;
    private String departemet;
    private String address;
    private int data_of_birth;
    private float salary;
    private final int id ;  // we intit thst in constracto and every emplyee has as id that is not changer 
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDepartemet() {
        return departemet;
    }

    public void setDepartemet(String departemet) {
        this.departemet = departemet;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;

    }

    public int getData_of_birth() {
        return data_of_birth;

    }

    public void setData_of_birth(int data_of_birth) {
        this.data_of_birth = data_of_birth;
    }

    public employee(String name,float salary, String emailAdress, String phone, String departemet, String address, int data_of_birth,final  int id) {
        this.id=id; 
        this.name = name;
        this.emailAdress = emailAdress;
        this.salary=salary;
        this.phone = phone;
        this.departemet = departemet;
        this.address = address;
        this.data_of_birth = data_of_birth;
        
       
        //for every emplyee has a id that is not changent
        //id =0 ; we cant do this because the id parameter is final parameter 
        
    }
    
    public  employee(int id)
    {
        System.out.println("no parameter constractor for the super class ");
        this.id = id;
        
    }
    
    
    float calcSarly()
    {
        return salary;// this fun for the emplyee in generl (for the developer slary we override this fun to clac the dev saray
         
    }

    int get_id()
    {
        return id;
              
    }
    
    public float getSalary() {

        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    // if we want for spesiific method to dosent overide this method in subclass for the sumber class we use final method


    @Override    // overrided form object class
    // this is fianal method we cant override this method in any subclass from this class
    final  public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", emailAdress='" + emailAdress + '\'' +
                ", phone='" + phone + '\'' +
                ", departemet='" + departemet + '\'' +
                ", address='" + address + '\'' +
                ", data_of_birth=" + data_of_birth +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}
