package assignments;

public class PracticeMultiplicationTable {
    public static void main(String[] args) {
        /*  MULTIPLICATION TABLE //
        int x = 10;
        for (int y = 1; y<=10; y++){
            for(int z= 1 ; z<=10; z++)
                System.out.print( (y*z) +" ");
            System.out.println();
        }   */
        for(int x=1; x<=5; x++ ) {
            for (int y = 1; y <= x; y++){
            System.out.print("*");

        }
        System.out.println(); }
    }
}
