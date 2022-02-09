package day_25_14_01;

public class C5Inheritence {
    public static void main(String[] args) {
        //Multiple inheritance is not allowed in Java
        B c = new C();  c.show() ;
    }

}
class Baba {

}
class A extends Baba{
    void show(){  System.out.println("Hello"); }
}

class B extends A{
    void show(){ System.out.println("Hi");}
}

class C extends B{
    void show(){  System.out.println("slaw"); }
}

        //class Child1 extends A, B, C{}

