package Arrays;
import java.util.Scanner;

public class W15_02_sumNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double a [] = new double[5];
        
        // input number from keyboard
        for (int i=0 ; i< a.length ;i++ ) {
            System.out.print("Enter number "   + (i+1) + " : ");    
            a[i] = kb.nextDouble();
        }
        
        double sumAll = 0; // sum all number
        double sumOdd = 0; // sum odd number
        double sumEven = 0; // sum even number
        double average = 0; // average number
        double max = a[0]; // max number
        double min = a[0]; // min number
        
        System.out.println("=========================================");
        
        // show all number
        System.out.println("Show all number : " );
        for (int i=0 ; i< a.length ;i++ ) {
            System.out.println("index [" + i +"] value = " + a[i]);    
            sumAll += a[i];

            if (a[i] % 2 !=0){
                sumOdd += a[i];
            } else {
                sumEven += a[i];
            } 


            // find max number
            if(a[i] > max) {
                max = a[i];
            }
            
            // find min number
            if(a[i] > max) {
                min = a[i];
            }
        }
        
        System.out.println("=========================================");
        System.out.println("Sum of all numbers : " + sumAll);
        System.out.println("Sum of odd numbers : " + sumOdd);
        System.out.println("Sum of odd numbers : " + sumEven);
        System.out.println("=========================================");
        System.out.println("Max nubers : " + max);
        System.out.println("Min nubers : " + min);
        
        System.out.println("=========================================");
        average = sumAll / a.length;
        System.out.println("Average of all nubers = " + average);


        kb.close();
    }
}
