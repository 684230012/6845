import java.util.Scanner; 

public class W06_01_Time { 
   public static void main(String[] args) {
      Scanner kb = new Scanner(System.in); 
      
      System.out.print("Input Time 1\n"); 
      System.out.print("Hours : "); 
      int hours1 = kb.nextInt() ; 
      System.out.print("Minutes : ") ; 
      int minutes1 = kb.nextInt() ; 
      System.out.print("Seconds : ") ;
      int seconds1 = kb.nextInt() ; 
   
      System.out.print("Input Time 2\n"); 
      System.out.print("Hours : ") ; 
      int hours2 = kb.nextInt() ; 
      System.out.print("Minutes : ") ; 
      int minutes2 = kb.nextInt() ; 
      System.out.print("Seconds : ") ;
      int seconds2 = kb.nextInt() ; 
      
      int totalSeconds1 = hours1 * 3600 + minutes1 * 60 + seconds1 ;
      int totalSeconds2 = hours2 * 3600 + minutes2 * 60 + seconds2 ; 

      int total = totalSeconds1 + totalSeconds2 ;


      int sumhours = total / 3600 ; 
      int summinutes = (total % 3600) / 60 ;
      int sumseconds = total % 60 ; //
      
      System.out.print("\nSUM = "+ sumhours + " Hours " + summinutes + " Minutes " + sumseconds + " Seconds " );
      kb.close();
   }
}
