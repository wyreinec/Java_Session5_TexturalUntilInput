package session5;

public class Casting01 {
    public static void main(String[] args) {
        //Declare and initialize a byte with a value of 128
        //Observe NetBeans' complaint
//        byte val = 128;
        
        //Declare and initialize a short with a value of 128
        //Create a print statement that casts this short to a byte
        short value = 128;
        System.out.println(value);
        
        byte val1 = (byte) value;
        System.out.println(val1);
        
        
        //Declare and initialize a byte with a value of 127
        //Add 1 to this variable and print it
        //Add 1 to this variable again and print it again
        byte val3 = 127;
        val3++;
        System.out.println(val3);
        val3++;
        System.out.println(val3);
        
        byte bil = 127;
        System.out.println(Integer.toBinaryString(bil));
        bil++;
        System.out.println(Integer.toBinaryString(bil).substring(24));
        
        
    }    
}
