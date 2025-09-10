import java.util.Scanner;
public class W08_02_BMI {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter your weight (kg): ");
        double weight = kb.nextDouble();
        System.out.print("Enter your height (cm): ");
        double height  = kb.nextDouble();

        double bmi = weight / ((height / 100) * (height / 100));
        System.out.print("BMI is : " + String.format("%.2f",bmi ));

        if ( bmi > 40) {
            System.out.print(" \nBMI = โรคอ้วน ระดับ 3");
        } else if ( bmi >= 35) {
            System.out.print(" \nBMI = โรคอ้วน ระดับ 2");
        } else if ( bmi >= 30) {
            System.out.print(" \nBMI = โรคอ้วน ระดับ 1");
        } else if ( bmi >= 25) {
            System.out.print(" \nBMI = น้ำหนักเกิน");
        } else if ( bmi >= 18.5) {
            System.out.print(" \nBMI = น้ำหนักปกติ");
        } else {
            System.out.println(" \nBMI = น้ำหนักต่ำกว่าเกณฑ์(ผอม)");
        }

        kb.close();
    }
}
