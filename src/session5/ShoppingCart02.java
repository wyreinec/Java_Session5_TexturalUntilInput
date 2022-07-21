package session5;

public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName+" wants to purchase a "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        double price = 15, tax = 0.7, totalPrice = 0;
        int quantity = 2;
        message = custName + " wants to purchase " + quantity + " " + itemDesc; 
        // Declare and assign a calculated totalPrice
        totalPrice = (price * quantity) + (price * quantity * tax);
        
        // Modify message to include quantity 
        
        System.out.println(message);
        System.out.println("Total Cost with Tax is : $ " + totalPrice);
        
        // Print another message with the total cost
        
    }    
}
