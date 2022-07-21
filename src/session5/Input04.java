package session5;

import java.util.Scanner;

public class Input04 {
    public static void main(String[] args){
        //Edit these lines to advance the scanner
        try (Scanner sc = new Scanner(Input04.class.getResourceAsStream("input04text.txt"))) {
            //Edit these lines to advance the scanner
            sc.nextLine();
            sc.nextLine();
            sc.nextLine();
            
            //Does this line contain "BlueBumper"?
            System.out.println(sc.findInLine("BlueBumper"));
            //Store the next two numbers as xPosition and yPosition
            //Print these positions
            
            //jika menggunakan findInLine
//        System.out.println("X: "+sc.findInLine("90")+", Y: "+sc.findInLine("120"));
//        sc.close();

//          jika menggunakan nextInt
            int xPos = sc.nextInt();
            int yPos = sc.nextInt();

            System.out.println("X: "+xPos+", Y: "+yPos);
        }
    }    
}
