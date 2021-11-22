/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern;

/**
 *
 * @author ABO AMER
 */
public class Doctor implements Staff {
     
     private int Salary;


     
    public void get_yearswork() {

    }


   public void print()
   {
       System.out.println(" the total salary of doctor "+Salary+Bonus);
    }

    
    public void show() {
        System.out.println(" this is doctor");
    }

    
     public void get_salary() {
        Salary = 6000;
         System.out.println("salary is " + Salary);
    }

    
    public void calculat_salary(int bonus) {
         {
       System.out.println(Salary+bonus);
   }
    }
}
