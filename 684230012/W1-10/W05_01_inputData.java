/*import java.util.Scanner;
public class W05_01_inputData {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        // แสดงผลหน้าจอ Enter a :
        System.out.print("Enter a : ");
        int a = kb.nextInt();

        // แสดงผลหน้าจอ Enter b :
        System.out.print("Enter b : ");
        int b = kb.nextInt();

        // สลับค่า a กับ b โดยใช้ตัวแปรชั่วคราว
        int temp = a ; // เก็บค่า a ไว้ในตัวแปร temp
        a = b ; // เอาค่า b ใส่ใน a
        b = temp ; // เอาค่าเดิมของ a ที่อยู่ใน temp ใส่ใน b

        // แสดงผลลัพธ์หลังสลับค่า
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
    }
}*/
public class W05_01_inputData {
    public static void main(String[] args) {
        double a = 1.6 ; a += 5.1 ;
        System.out.println(a % 4);

    }
}