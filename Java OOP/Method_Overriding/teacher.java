/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Method_Overriding;

/**
 *
 * @author hp
 */
public class teacher extends person {
    String gender;
    
    @Override
    void display(){
        System.out.println(""+name);
        System.out.println(""+age);
        System.out.println(""+gender);
   
    }
}
