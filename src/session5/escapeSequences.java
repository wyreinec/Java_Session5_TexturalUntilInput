/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session5;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class escapeSequences {
    public static void main(String[] args) {
        //tab [UMUM]
        System.out.println("Hello\t World");
        //backspace = ngurangin satu karakter sebelumnya
        System.out.println("Hello\b World");
        //newline [UMUM] 
        System.out.print("Hello");
        System.out.print("World\n");
        // \r
        System.out.println("Hello World\r FGA Java");
        // \f
        System.out.println("Hello World\f FGA Java");
        //single quotation [UMUM]
        System.out.println("Hello World \'Java\'");
        //double quotation [UMUM]
        System.out.println("Hello World \"Java\"");
        //backslash
        System.out.println("Hello \\World\\ Java");
        
        Scanner sc = new Scanner(System.in);
//        System.out.print("Masukkan Kata : ");
//        String kata = sc.next();
//        System.out.println(kata);
//        System.out.println("Masukkan Kalimat : ");
//        String kalimat = sc.nextLine();
//        System.out.println(kalimat);
//        sc.close();
        
        System.out.println("");
        int panjang, lebar, luas;
        
        System.out.print("Masukkan nilai panjang : ");
        panjang = sc.nextInt();
        System.out.print("Masukkan nilai lebar : ");
        lebar = sc.nextInt();
        
        luas = panjang * lebar;
        System.out.print("Luar Persegi Panjang adalah " + luas);
    }
    
}
