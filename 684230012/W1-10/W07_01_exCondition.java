public class W07_01_exCondition {
    public static void main(String[] args) {
        System.out.println("Condition Statements") ;
        byte point = 60 ;

        if(point >= 50){
        System.out.println("Pass") ;
        } else {
        System.out.println("Fail") ;
        }

        System.out.println("End of program") ;

        short n = 49 ;
        if(n<50){
        System.out.println("2"+n) ;
        System.err.println("n++") ;
        }
        
    }
}