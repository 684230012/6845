import java.util.Scanner;
public class W11_04_doWhile_True_ChooseMenu_SwitchCase {
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
    
        // แสดงเมนูเพื่อรับ choice
        System.out.println("=============================");
        System.out.println("Menu : ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Exit");
        System.out.println("=============================");

        int choice;

        do { 
            // รับค่า
            System.out.println("-----------------------------");
            System.out.print("Enter your choice : ");
            choice = kb.nextInt();
                
                // ตรวจสอบการเลือกเมนู
            switch (choice) {
                case 1 : 
                // แสดงข้อความรับตัวเลข 2 จำนวน
                    System.out.print("Enter Number 1 : ");
                    int num1 = kb.nextInt();
                    System.out.print("Enter Number 2 : ");
                    int num2 = kb.nextInt();

                    int result = num1 + num2;   
                    System.out.println("Addition Result : " + result );
                    break; // ออกจาก Switch case
                    
                case 2 : 
                    System.out.print("Enter Number 1 : ");
                    num1 = kb.nextInt();
                    System.out.print("Enter Number 2 : ");
                    num2 = kb.nextInt();
                        
                    System.out.println("Subtraction Result : " + (num1 - num2));
                    break; // ออกจาก Switch case

                case 3 : 
                    System.out.println("Exiting the program. Goodbye!");
                    break; // ออกจาก Switch case
                    
                default : // อื่นๆ ไม่ได้กด 1 2 3 
                    System.out.println("Invalid choice. Please try again!");
            }
        } while (choice !=3 );

        kb.close();
    }
}
