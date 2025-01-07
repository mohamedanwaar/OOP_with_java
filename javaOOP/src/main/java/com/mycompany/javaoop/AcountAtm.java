/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaoop;

import org.w3c.dom.ls.LSOutput;

/**
 *
 * @author User
 */
public class AcountAtm 
{
    
    private int acount_number;  // WE use this private fieds in this class only  
    protected String name;
    private float amount ;
    
    
    public void insert(String n,int id,float amo)
    {
        name=n;
        acount_number=id;
        amount=amo;
    }
    
    public void  deposit(float amt)
    {  
        amount+=amt;
        System.out.println(amt+" deposit");
    }
    
    public void withdraw(float amt)
    {
        if (amt<amount)
        {
            System.out.println("Insufficient Balance");
        }
        else 
        {
            amount=amount-amt;  
            System.out.println(amt+" withdrawn");  

        }
    }
  //method to display the values of an object  
    public void display()
    {
        System.out.println(acount_number+" "+name+" "+amount);
    }  
    
    public void check_balance()
    {
        System.out.println("your balance is  "+amount );
    }
    

    
    
          
    
    
}
