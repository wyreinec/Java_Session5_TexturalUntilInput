package session5;

import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.
//        String input = JOptionPane.showInputDialog("Masukkan angka");
//        System.out.println(input);
//        
//        //Parse the input as an int.
//        //Print its value +1
//        int value = Integer.parseInt(input);
//        System.out.println(++value);
        
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.
        int value2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Angka"))+1;
        System.out.println(value2);
    }
}
