package session5;

import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Input Pertama: ");
        int x = sc.nextInt();
        System.out.print("Masukkan Input Kedua: ");
        double y = sc.nextDouble();
        System.out.print("Masukkan Input Ketiga: ");
        String kata = sc.next();
        
        System.out.println(x);
        System.out.println(y);
        System.out.println(kata);
        //Find and print the sum of three integers entered by the user
        System.out.print("Masukkan Angka Pertama : ");
        int bil1 = sc.nextInt();
        System.out.print("Masukkan Angka Kedua : ");
        int bil2 = sc.nextInt();
        System.out.print("Masukkan Angka Ketiga : ");
        int bil3 = sc.nextInt();
        
        System.out.println("Hasil Penjumlahan : "+(bil1+bil2+bil3));
        
        
        //Remember to close the Scanner
        
    }
}
