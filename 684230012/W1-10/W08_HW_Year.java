import java.time.Year;
import java.util.Scanner;

public class W08_HW_Year {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter 9-digit Student ID : ");
        int id = kb.nextInt();
        
        // ตรวจสอบความยาวของรหัสนักศึกษา
        if (String.valueOf(id).length() !=9) {
            System.out.println("Invalid Student ID");
            return; 
        }

        int id_student = id/10000000;

        int studyYear = 2500 + id_student;

        // ดึง คศ. ปัจจุบัน
        int ad_Year = Year.now().getValue(); 

        // แปลงเป็น พศ.
        int be_Year = ad_Year + 543;

        int CalculateYear = be_Year - studyYear + 1 ;
        System.out.print("Degrees : " + CalculateYear );
        
        if ( CalculateYear > 4 ) {
            System.out.print(" ( Beyond 4 years )");
        } else if ( CalculateYear == 4 ) {
            System.out.print(" ( Senior )");
        } else if ( CalculateYear == 3 ) {
            System.out.print(" ( Junior )");
        } else if ( CalculateYear == 2 ) {
            System.out.print(" ( Sophomore )");
        } else {
            System.out.print(" ( Freshmen )");
        }
    
        kb.close();
    
    }
}