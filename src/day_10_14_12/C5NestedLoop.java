package day_10_14_12;

public class C5NestedLoop {
    public static void main(String[] args) {
        /*
         *
         **
         ***
         ****
         */


            for(int r=1; r<=4; r++){

                for(int c=1; c<=r; c++){

                    System.out.print("*");
                }
                System.out.println();
            }
        }
}
