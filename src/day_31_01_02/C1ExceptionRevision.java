package day_31_01_02;

public class C1ExceptionRevision {
    public static void main(String[] args) {
show(0);
    }
    static void show(int i){
       System.out.println("Hello");
       play(i);
    }
    static void play(int i){
        System.out.println("Hi");
        m1(i);
        System.out.println("Chao");
    }
    private static void m1(int i){
        try {
            System.out.println(5 / i);
        }catch (ArithmeticException e){
            System.out.println(e);
        }

    }

}
