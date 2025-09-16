import java.util.Scanner;

public class W14_01_CountScore {
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);

        // กำหนดตัวแปรเริ่มต้นให้เท่ากับ 0
        int pass = 0;
        int fail = 0;

        // รับค่าจำนวนนักเรียน
        System.out.print("Enter number of students: ");
        int numStudent = kb.nextInt();

        System.out.println("==================================================");

        int countStudent = 1; // ตัวนับสำหรับ while loop
        while (countStudent <= numStudent) {
            System.out.print("Enter score for student " + countStudent + ": ");
            int score = kb.nextInt();

            if (score >= 50) {
                System.out.println("Student " + countStudent + " : Passed");
                pass++;
            } else {
                System.out.println("Student " + countStudent + " : Failed");
                fail++;
            }

            System.out.println("==================================================");
            countStudent++; // เพิ่มตัวนับ
        }

        System.out.println("Number of students passed = " + pass + " persons");
        System.out.println("Number of students failed = " + fail + " persons");

        kb.close();
    }
}