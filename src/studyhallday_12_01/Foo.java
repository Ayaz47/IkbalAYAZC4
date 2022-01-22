package studyhallday_12_01;

public class Foo {
    {
        System.out.println("Hello");
    }
    static double d=10;

    static {
        integer();
        new Foo();
        System.out.println("Hi");
    }
    static int i=5;
    static String s="kadir";
    static void integer(){
        System.out.println(i);
        System.out.println(d);
        System.out.println(s);
    }
    Foo(){
        System.out.println("Bye");
    }
}
