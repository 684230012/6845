import java.util.Scanner;

public class W11_03_While_True_ChooseMenu_SwitchCase {
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
    
        
        switch(choice) {
            case 1 : 
                int result = num1 + num2;   
                System.out.println("Addition Result : " + result );
                break; // ออกจาก Switch case
            case 2 : 
                System.out.println("Subtraction Result : " + (num1 - num2));
                break; // ออกจาก Switch case
            case 3 : 
                System.out.println("Exiting the program. Goodbye!");
                break; // ออกจาก Switch case
            // default :
                // System.out.println("Invalid choice. Please try again!");
        }

            if(choice == 1) {
                break;
            } else if (choice == 2) {
                break;
            } else if(choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again!");
            }
        System.out.println("-----------------------------");

        }
    }
}
