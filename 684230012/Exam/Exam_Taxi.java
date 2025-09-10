import java.util.Scanner;

public class Exam_Taxi {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        // input
        System.out.println("--------------------Input--------------------------");
        System.out.print("Customer Name : ");
        String name = kb.nextLine();
        System.out.print("Distance (km) : ");
        double km = kb.nextDouble();
        System.out.print("Rate per km (Baht) : ");
        double rate = kb.nextDouble();
        // output
        System.out.println("--------------------Output----------------------------");
        System.out.println("Customer Name : " + name);
        double baht = km * rate;
        System.out.println("KM x Rate : " + km + " x " + rate + " = " + baht + " Baht");

        System.out.println("Base Fare : 35 Baht");

        System.out.println("-----------------------------------------------------");
        double total = 35 + (rate * km);
        System.out.println("TOTAL FARE : " + total + " Baht");
        System.out.println("-----------------------------------------------------");
    }
}