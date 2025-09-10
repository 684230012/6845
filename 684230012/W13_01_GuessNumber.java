
import java.util.Random;
import java.util.Scanner;

public class W13_01_GuessNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        Random rand = new Random();

        int answer = rand.nextInt(10) + 1 ; // Random number between 1 and 10
        //System.out.println("Random number is generated : " + answer);

        int countGuess = 0;
        boolean win = false;
        
        // เข้าลูปจนกระทั่งจะตอบถูก
        while (countGuess < 3) {
            System.out.print("Enter your guess number : ");
            int guess = kb.nextInt();
            
            if (answer == guess) {
                System.out.println("Correct! You've guess the number.");
                win = true;
                System.out.println("=============WIN=============");
                break;
            } else {
                System.out.println( "Incorrect guess. Try again.");
                System.out.println("=============LOSE============");
            }
            countGuess++;
        }
        
        if (win == false)
        System.out.println("Game over! Thecorrect number was : " + answer );
        
        kb.close();
    }
}
