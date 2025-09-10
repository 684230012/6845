import java.util.Scanner ;
public class W07_03_OddEven {
        public static void main(String[] args){
        Scanner kb = new Scanner(System.in) ;
    
        // Input Number
        System.out.print("Enter a number : "); // รับค่าตัวเลขจากคีย์บอร์ด
        int n = kb.nextInt() ; // ตัวแปรสำหรับเก็บค่าจากจำนวนเต็มที่ป้อนเข้ามา
    
        // process : สูตรคำนวณเลขคู่และเลขคี่
        int remain = n%2 ; // นำตัวแปรที่รับมาไปหาร
    
        // Output : แสดงผลลัพธ์
        if (remain == 0) {
        System.out.println("Number " + n + " is even number") ; // ถ้าเศษที่ได้จากการหารเป็น 0 แสดงว่าเป็นเลขคู่
        } else {
        System.out.println("Number " + n + " is odd ") ; // ถ้าเศษที่ได้จากการหารไม่เป็น 0 แสดงว่าเป็นเลขคี่
        }

    }
}
