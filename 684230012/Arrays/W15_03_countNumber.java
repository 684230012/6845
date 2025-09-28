import java.util.Scanner;

public class W15_03_countNumber {
    public static void main(String[] args) {
        
        int x[] = { 7, 9, -1, 4, 12, 9, 3, 2, -7, 2, 1 , 9, -15, 24, 11, 13 };
        System.out.println("Show all numbers : 7, 9, -1, 4, 12, 9, 3, 2, -7, 2, 1 , 9, -15, 24, 11, 13");

        int countOdd = 0; 
        int countEven = 0;
        
        for (int i=0 ; i< x.length ;i++ ) { 
            if (x[i] % 2 == 0){
                countOdd++;
            } else {
                countEven++;
            } 
        }

        System.out.println("=========================================");
        System.out.println("Number all count odd : " + countOdd);
        System.out.println("Number all count even : " + countEven);
        System.out.println("=========================================");
    }
}
