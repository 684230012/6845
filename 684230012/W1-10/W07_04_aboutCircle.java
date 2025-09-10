import java.util.Scanner ;
public class W07_04_aboutCircle {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in) ;
        
        // รับค่ารัศมีจากผู้ใช้
        System.out.print("Enter Radius : ") ;
        double radius = kb.nextDouble() ;
        
        // รับตัวเลือกจากผู้ใช้ (1 = Area, 2 = Circumference)
        System.out.print("Enter Choice : 1 = Area, 2 = Circumference : ") ;
        int choice = kb.nextInt() ;
        
        // คำนวณตามตัวเลือกที่ผู้ใช้เลือก
        double result ;
        if (choice == 1) {
            // คำนวณพื้นที่วงกลม
            result = Math.PI * radius * radius ;
            System.out.println("Area of Circle = " + result) ;
        } else if (choice == 2) {
            // คำนวณเส้นรอบวง
            result = 2 * Math.PI * radius ;
            System.out.println("Circumference of Circle = " + result) ;
        } else {
            System.out.println("Invalid choice!") ;
        }
        
        kb.close();

    }
}
