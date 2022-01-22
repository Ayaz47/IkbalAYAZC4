package day_11_16_12;

public class C2RevisonNestedLoop {
    public static void main(String[] args) {
        /*
        * 54321
        * 5432
        * 543
        * 54
        * 5*/
        int x =5;
        for(int i=1; i<=x; i++){
            for(int j =5; j>=i; j--) System.out.print(j);
            System.out.println();
        }
    }
}
