/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaoop;

/**
 *
 * @author User
 */
public class Car {
    //defining fields 
    private String name; //field or data member or instance variable
    private int maxspead;
    private float price;
    private int model;
    private String coler;   // this is new attribute 
    
    void insert_items(String n,int maxS,float p,int m)
    {
        name=n;
        maxspead=maxS;
        price=p;
        model=m;
    }
    
    
    //constractotr with parameters 
    Car (String name,int maxspead,float price ,int model )
    {
        
        this.name=name;
        this.price=price;
        this.model=model;
        this.maxspead=maxspead;
        
    }
    
    // this is constractor overloading (constractor no parameters)
    Car ()
    {
        
        name="null";
        price=0;
        model=0;
        maxspead=0;
        
    }
    
    // constractor to intitaa the new attribute (coler)
    Car (String name,int maxspead,float price ,int model,String coler )
    {
        this (name,maxspead,price,model);   // here we use the prevous constracto to inial the old attributes
        this.coler=coler;
        
    }
    // Java Copy Constructor 
    // 
    Car (Car obj)
    {
        this.name=obj.name;
        this.maxspead=obj.maxspead;
        this.coler=obj.coler;
        this.model=obj.model;
        this.price=obj.price;
        
        
    }

   
    
    
    public String toString()
    {
        return "Car{" + "name=" + name + ", maxspead=" + maxspead + ", price=" + price + ", model=" + model + ", coler=" + coler + '}';
    }
    

    
    void set_name(String n)
    {
        name=n;
    }
    String get_name()
    {
        return name;
        
    }
    void set_mode(int m)
    {
        model =m;
        
    }
    int get_model()
    {
        return model;
             
    }
    void set_price(float p)
    {
        price = p ;
        
        
    }
    float get_price ()
    {
        return price;
    }
            
        
    
}
           