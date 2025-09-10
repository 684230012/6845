import java.util.Scanner;
public class W03_02_NameAndAge {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter your Name = ");
        String name = kb.next();
        System.out.print("Enter your Age =");
        int age = kb.nextInt();

        System.out.print("Data ="+ "NAME " + name +" AGE "+ age +" yers ");
        kb.close();
    }
}
