/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern;

import java.util.Scanner;

/**
 *
 * @author ABO AMER
 */
public class Pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        System.out.println("enter member ");
      //  double s = input.nextInt();
        //double b = input.nextInt();
        String name = input.nextLine();
        Memberfactory mem = new Memberfactory();
        Staff s =mem.getinfo(name);
        s.show();
         System.out.println("salary is ");
        s.getsalary();
        System.out.println("salary and bonus is ");
        s.calculatesalary(250);
    }
    
}
