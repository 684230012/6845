import java.util.Scanner;

public class W16_01_Exam_012 { 
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int start;
        int end;

        // รับค่าจนกว่าถูก
        do {
            System.out.print("Enter Start Number : ");
            start = kb.nextInt();

            System.out.print("Enter End Number : ");
            end = kb.nextInt();

            if (start <= end) {
                System.out.println("----------------------Result----------------------------------");
                break;
            }else{
                System.out.println("---------------------------warning-----------------------------");
                System.out.println("Start number must be less than end number. Please enter again!");
                System.out.println("---------------------------------------------------------------");
            }
                
        } while (true);
        
        int sumEven = 0;
        int sumOdd = 0;
        int countNum = 0;  
        while (start <= end)
        for (int i = start; i <= end; i++) {
            System.out.print("Show All Number : " + countNum);
            if (i % 2 == 0) {
                sumEven++;
            } else {
                sumOdd++;
            }
            countNum++;
        }
        
        System.out.println("Amount of Even Number = " + sumEven);
        System.out.println("Amount of Odd Number = " + sumOdd);

        kb.close();

    }
}