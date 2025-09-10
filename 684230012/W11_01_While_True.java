import java.util.Scanner;

public class W11_01_While_True {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
    
        while (true) { 
    // // NO. 1 เขียนโปรแกรมรับตัวเลขจากคีย์บอร์ดไปเรื่อยๆ จนกระทั่งกดเบอร์ 9 จึงจะหยุด       
    //         // รับค่าไปเรื่อยๆ
    //         System.out.print("Enter Number : ");
    //         int num = kb.nextInt();
    //         // ออกจากลูป
    //         if (num == 9) { // คำสั่งที่ใช้ตรวจสอบการออกจากลูป
    //             break; // คำสั่งที่ใช้ในการออกจากลูป
    //         }
            
    // NO. 2 เขียนโปรแกรมรับตัวอักษรจากคีย์บอร์ดไปเรื่อยๆ จนกระทั่งกดตัวอักษร 'e' จึงจะหยุด
            System.out.print("Enter Alphabet : ");
            String alphabet = kb.next();
            if(alphabet.equals("e")) {
                break;
            }

        }



    }
}
