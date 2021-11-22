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
public class TeachingAssistant implements Staff {
     private int salary;


    public void get_yearswork() {
    }

    @Override
    public void show()
    {
        System.out.println(" this is TA");
    }

    public void get_salary()
    {
        salary=3000;
         System.out.println("salary is  " + salary);
    }

    public void calculate_salary(int Bonus)
    {
        throw new UnsupportedOperationException("Not supported yet"); 
    }

    /**
     *
     * @param bonus
     */
    public void calculate_salary(int bonus)
{
         
       System.out.println(salary+bonus);
}
}