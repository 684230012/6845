import java.util.Scanner;

public class W08_01_CalculateGrade {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter your score : ");
        Byte score = kb.nextByte();

        // ตรวจสอบคะแนนว่าอยู่ในช่วง 0-100
        if (score >= 0 && score <= 100 ) {
            // เปรียบเทียบคะแนนและแสดงเกรด
            if (score >= 80) {
                System.out.println("Grade = A");
            } else if (score >= 70) {
                System.out.println("Grade = B");
            } else if (score >= 60) {
                System.out.println("Grade = C");
            } else if (score >= 50) {
                System.out.println("Grade = D");
            } else {
                System.out.println("Grade = F");
            }
        } else {
            System.out.print(" คะแนนไม่อยู่ในช่วง 0-100 ");
        }
        
        kb.close(); // ปิดการใช้งานคีย์บอร์ด

    }
}