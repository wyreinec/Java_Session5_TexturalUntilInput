/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session5;

/**
 *
 * @author Administrator
 */
public class ShoppingCart01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare and initialize String variables.  Do not initialize message yet.
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = " wants to purchase a ";
        
        char huruf = 'a';
        char hurufUnik = '\u0097';
        
        // Assign the message variable 
        System.out.println(custName + message + itemDesc);
        
        // Print and run the code
        System.out.println(hurufUnik);
        
    }
    
}
