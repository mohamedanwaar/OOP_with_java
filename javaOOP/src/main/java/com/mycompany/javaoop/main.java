/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaoop;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


import relationships.*;     // we ipmort all clsses in package to run it here
import Abstract_examble.*;


/**
 *
 * @author User
 */
public class main {

    public static void main(String[] args) {
   
        /*
        
        
        Car c1=new Car();
        c1.insert_items("kia",230, 120000, 2022);
        System.out.println(c1.toString());;
        System.out.println();
        c1.set_mode(2024);
        
        */
       
        // take the second object of car class 
        /*
        
        
        Car c2=new Car("BME",260,3000000f,2023,"Black");
        System.out.println(c2.toString());
        //////////////////////////
        Car c3=new Car();
        System.out.println(c3.toString());;
        */
        //----------------------------------------------------------------------------
        /*
        Car car1=new Car("BME",260,3000000f,2023,"Black");
        // if we want to copy this object values we do this 
        Car car2=new Car(car1);  
        car2.toString();
        */
        
        // 
                
//------------------------------------------------------------------------------------------------------
//                       object of atm class
/*


AcountAtm a1=new AcountAtm();  
a1.insert("ahmed", 111,1000);
a1.check_balance();
a1.deposit(10000);
a1.check_balance();
a1.withdraw(200);
a1.check_balance();
a1.display();

*/
//------------------------------------------------------------------------------------------------------
//                      object of student class 

/*


System.out.println("------------------add new student----------------- ");
System.out.println("enter name and pass for student ");
String  name;
Scanner in=new Scanner (System.in);
name=in.next();
String passw;
passw=in.next();
Student a=new Student(name, passw);
System.out.println("student added to system succefuly ");
System.out.println("-------------------login-----------------------------");
System.out.println("enter your  name and pass ");
String Logpass;
int logid;
logid=in.nextInt();
Logpass=in.next();
if(a.login(logid, Logpass))
{
    System.out.println("Loged in succufel ");
    a.display();
}
else 
{
    System.out.println("the pass or id is not correct ");
}

            
        


//a.display();
System.out.println("");

 
/////////////////////////////////////////////////////////////////////////////////
/*
String arr[]=new String[5];

//arr[0]="rashed";
arr[0]=new String("rasehd "); // arr[0] refrance to string object (rashed )

System.out.println(arr[0]);

*/
/////////////////////////////////////////////////////////////////////////////////       


//----------------------------------------------------------------------------------------------------------------
//                          employee class and subclasses 

//Developar d1=new Developar();
//d1.setName("rasehd ");
//System.out.println(d1.getName());
//-------------------------------------

/*
final employee e1=new employee("ahmed", 10000f, "moahemd@gmail.com", "1003134243", "it", "menof",2007,123);
//e1=new employee(112); // we cant do this because we set the e1 refrance as a fianl refrance

Developar d1=new Developar("rashed ",10000f,500f,"moahemd@gmail.com","+201098984200","it","sh3sha",1223,2004,"Empoyee mangmernt system ");
d1=new Developar(223);  //her we can change tha id var (is final ) to avoid this problem we set the reference var as final var same in above

System.out.println(e1.calcSarly());    /// 10000
System.out.println(d1.calcSarly());   //10000 +500 ==10500
System.out.println(e1.get_id());
       */


  //--------------------------------------------------------------------------------------------------------      
// take object of emplyee class that is in relationships package        

/*


// take object from departmernt class to pass for the emplyee constractor 
Department d=new Department(1, "ai");
//public Emplyee(int id, float salary,String fN,String mN,String LastName,String bloodGroup,String acountNum,String nationalty,int yearOfBirth, Department deprt) {

Emplyee e1=new Emplyee(11,10000f,"mohame","anwar","rashed","a-","ad123123223","egypt",2004,d);       
System.out.println(e1);
*/
//---------------------------------------array list ----------------------------------------------------------------------


       /*
       ArrayList <Integer> mylist =new ArrayList();
        mylist.add(100);
        mylist.add(20);
        mylist.add(23);
        mylist.add(2);
        System.out.println(mylist);

// another way to print elements in array

//
//        System.out.println("---------------------------");
//        for (int i=0;i< mylist.size();++i)
//        {
//            System.out.println(mylist.get(i));
//        }
//        System.out.println("---------------------------");
//        // another way
//        for (int num:mylist)
//        {
//            System.out.println(num);
//        }


        // if we want to add in specific index
        mylist.add(1,200);
        System.out.println(mylist);

        // IF WE WANT TO ADD ANOTHER LIST ( WE USE ADDALL FUN ACCEPT COLLECTIONS AS A PARAMETER )

        ArrayList <Integer> mylist2=new ArrayList();

        mylist2.add(10);
        mylist2.add(13);
        mylist2.add(111);

        mylist2.addAll(mylist); // here we add the list1 to list 2

        System.out.println(mylist2);

        // here we can crate arraylist that tackes parametner
        ArrayList <Integer> mylist3=new ArrayList(Arrays.asList(10,12,11)); // this is constructor that takes collections as parameter
        mylist3.set(0,100);  // change value of index 0 from 10 to 100
        // mylist3.remove(2);    // remove 11 from my list       // this to remove by index

        // if we want to remove by value we use same overloading fun tant accept object
        mylist3.remove((Integer)12);   // we should do type casting for 12 to become as an object integer
        System.out.println(mylist3);

         */
        //-----------------------------------------------------------------------------
        /*


        ArrayList <String > stringList=new ArrayList(Arrays.asList("A","B","E","A","r","A","A"));

        stringList.remove("A");  // her we remove  the frist A only  output---->["B","E","A","r"]
        System.out.println(stringList);

        // if we want to remove multiple elements we use this
        stringList.removeAll(List.of("A"));   // here we remove every A in the list
        stringList.removeAll(List.of("r","B"));

        System.out.println(stringList);

 */

        SUV c1=new SUV(1.5f,3.5f,10);
        c1.autopilot();








        
        
        
        
        
        
    }

}
