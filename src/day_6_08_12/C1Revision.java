package day_6_08_12;

public class C1Revision {
    public static void main(String[]apo){
        int i = 1;
             //i=1   i=0   i=1   i=
        int r = --i + i++ + i++ - i-- - ++i; //0+0+1-1
        System.out.println(r);
        System.out.println(i);

        int x =1;
        int y = ++x + x-- - x++ + --x;
        System.out.println(x); //=1
        System.out.println(y); //=2
    }
}
