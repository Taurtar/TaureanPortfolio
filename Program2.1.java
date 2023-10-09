import java.util.*;
class Main{
    public static void main(String[] args){
        //Write a program that can convert any decimal integers to binary format.
        Scanner console = new Scanner(System.in);
        String conversion = null;
        System.out.println("Enter a decimal integer: ");
        int decimal = console.nextInt();
        
        conversion  = Integer.toBinaryString(decimal);
        System.out.print(conversion);
       
        console.close();
    }
}
