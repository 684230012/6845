import java.util.Scanner ;
public class W07_02_square_root {
    public static void main(String[] args){
    Scanner kb = new Scanner(System.in) ;
    
    // Input: prompt the user for number 
    System.out.print("Enter a number : ") ;
    double number = kb.nextDouble() ;
    
        if (number > 0) {
        // Process: calculate the square root of the number
        double squareRoot = Math.sqrt(number) ; // Output the squaye root of the number
        System.out.println("Square of " + number + " is " + squareRoot) ;
        } else {
        System.out.println("Eror : the number must be positive.") ;
        }
    
    }
}