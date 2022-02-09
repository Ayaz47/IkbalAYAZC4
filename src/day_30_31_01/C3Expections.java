package day_30_31_01;

public class C3Expections {
    static int i;
    public static void main(String[] args) {


        show() ;

    }

    private static void show() {
        System.out.println(i++);
        show();
    }
}
