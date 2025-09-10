package Arrays;

public class W13_02_basicArray {
    public static void main(String[] args) {
        // การประกาศตัวแปร  Array แบบที่ 1 ระบุสมาชิกในวงเล็กปีกกา
        String animal[] = {"Dog", "Cat", "Lion"};
        int dice[] = {1, 2, 3, 4, 5, 6};
        float avgScore[] = {2.00f, 4.00f, 3.55f};

        // หาขนาดของ Array 
        System.out.println("Size of animal array : " + animal.length);
        
        // การเข้าถึงสมาชิกใน Array
        System.out.println("Animal at index 0 : " + animal[0]);
        System.out.println("Animal at index 2 : " + animal[2]);

        // วนลูปแสดงสมาชิกใน Array avgScore
        System.out.println("Show all average score : ");
        for(int i=0; i< avgScore.length; i++){
            System.out.println(avgScore[i]);
        }
        
        // =========================================================================
        
        // ประกาศตัวแปรแบบ Array แบบที่ 2 ระบุขนาด Array
        String colors[] = new String[4];
        colors[2] = "Red";
        colors[0] = "Green";
        colors[3] = "Blue";
        
        System.out.println("Show all color : ");
        // int j = 1;
        for(int i=0; i< colors.length; i++){
            System.out.println("Block " + (i+1) + " : " + colors[i]);
            // System.out.println("Block " + j + " : " + colors[i]); 
            // j++;
        }
        
        System.out.println("Size of color array : " + colors.length);
        
        System.out.println("Color at index 0 : " + colors[0]);
        System.out.println("Color at index 2 : " + colors[2]);
        

    // ========================================================================
        int score[] = new int[5];
        score[0] = 50;

        System.out.println("Score at index 4 : " + score[4]);

    }
}
