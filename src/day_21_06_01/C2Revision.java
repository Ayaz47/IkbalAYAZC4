package day_21_06_01;

public class C2Revision {
    public static void main(String[] args) {

        String s =null;
        System.out.println(s);
        show();
    }
    static void show() {
        deer(
                add(5,6)
        ) ;
        System.out.println("Show");
    }
    static int add(int a, int b){

        return a+b;
    }
    static void deer(int n) {
        System.out.println(n);
    }
}
