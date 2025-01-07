/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaoop;

/**
 *
 * @author Rashed
 */
public class Developar extends employee{
    
    private String projectName;
    private float bounes ;

    public float getBounes() {
        return bounes;
    }

    public void setBounes(float bounes) {
        this.bounes = bounes;
    }
    

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    
    public Developar(int id )
    {
        super(id);
        System.out.println("the no parameter constractor for subClass ");
    }
    // we generate parameter constractor for this claass and we we the parameter constractor in super class to intit this attributes 

    public Developar(String name, float salary,float  bounes, String emailAdress, String phone, String departemet, String address,final int id , int data_of_birth ,String projectName) {
        super(name, salary, emailAdress, phone, departemet, address, data_of_birth,id);
        this.projectName=projectName;
        this.bounes=bounes;
        
    }
  
    
    @Override     // we overide ths calcSarly fun in super class (employee)
    float calcSarly()
    {
        return this.getSalary()+ bounes;
        
    }

   // @Override   // here we cant use this method because we set it as a final method in suber class
 /*   public String toString() {
        return "Developar{" +
                "projectName='" + projectName + '\'' +
                ", bounes=" + bounes +
                '}';
    }*/
}
