/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaoop;

/**
 *
 * @author User
 */
public class Student
{
    private int id;
    private String name;
    private String password;
    private boolean logedin;
    private static int count =1;
    private static String colage="AI";
    
    public Student (String name ,String password)
    {
        this.name=name;
        this.password=this.password;
        this.id=count;
        count++;
       
        
    }
    
    // static fun to change static collage atribute 
    static void changeCollage()
    {
       colage="CS";
       
    }
    
    
    public  boolean login(int enteredID,String enterdPass )
    {
        if( enteredID==id && enterdPass.equals(password) )   
        {
            logedin=true;
            return true ;
            
        }
        else 
            return false;
    }
    
    void display ()
    {
        System.out.println("tha name of student is " +name +"and id number is "+id);
    }
    
    
    
    
    
    
    
    
    
    
}
