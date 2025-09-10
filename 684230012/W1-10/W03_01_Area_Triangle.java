import java.util.Scanner;
public class W03_01_Area_Triangle {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in); //create object for scanner

        //input height and base of triangle
        System.out.print("Enter height = "); // แสดงข้อความให้ผู้ใช้ป้อนความสูงของรูปสามเหลี่ยม 
        int height = kb.nextInt(); // รับค่าความสูงจากผู้ใช้ที่กรอกผ่านคีย์บอร์ดเป็นตัวเลขจำนวนเต็ม
        System.out.print("Enter base = ");
        int base = kb.nextInt();
        
        // Calculate area of triangle
        double area = 0.5* height* base; // float or double 
        
        System.out.print("Area of Triangle = " + area); // output area of triangle
        kb.close(); // close object scanner (ป้องกันการรั่วไหลของทรัพยากร)
    }
}