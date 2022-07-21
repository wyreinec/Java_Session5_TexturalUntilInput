package session5;

public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice = "15";
        String taxRate = "0.05";
        String gibberish = "asdasdasd";
       
        //Parse shirtPrice and taxRate, and print the total tax
        double totalTax;
        totalTax = Integer.parseInt(shirtPrice) * Double.parseDouble(taxRate);
        System.out.println(totalTax);
        
        //Try to parse taxRate as an int
        int tax = Integer.parseInt(taxRate);
        
        //Try to parse gibberish as an int
        int gibber = Integer.parseInt(gibberish);
        
    }
    
}
