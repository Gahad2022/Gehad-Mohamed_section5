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
public class Memberfactory {
    public Staff getinfo(String member_info)
    {
    String s = member_info.toLowerCase();
        switch (s)
        {
          case "Doctor" :
                    return (Staff) new Doctor();
          case "ASS" :
                    return  ass();
          default:
                    return null;
        
        }
    
    }
}
