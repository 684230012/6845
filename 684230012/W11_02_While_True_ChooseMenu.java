import java.util.Scanner;

public class W11_02_While_True_ChooseMenu {
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);

// ============================================================= 
// แสดงข้อความรับตัวเลข 2 จำนวน
        System.out.println("-----------------------------");
        System.out.print("Enter Number 1 : ");
        int num1 = kb.nextInt();
        System.out.print("Enter Number 2 : ");
        int num2 = kb.nextInt();

        
// แสดงเมนูเพื่อรับ choice
        System.out.println("=============================");
        System.out.println("Menu : ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Exit");
        System.out.println("=============================");

        while (true) {
            System.out.print("\nEnter your choice : ");
            int choice = kb.nextInt();
            System.out.println("-----------------------------");
            if (choice == 1) { 
                System.out.println("Addition Result : " + (num1 + num2));
                break; // ออกจากลูป
            } else if (choice == 2) { 
                System.out.println("Subtraction Result : " + (num1 - num2));
                break; // ออกจากลูป
            } else if (choice == 3) { 
                System.out.println("Exiting the program. Goodbye!");
                break; // ออกจากลูป
            } else {
                System.out.print("No have number! \nTry again!!");
                // break; // ออกจากลูป
            }
            System.out.println("-----------------------------");
        }


    }
}
