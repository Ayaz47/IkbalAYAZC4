package day_27_24_01;

public class Demo {
    public static void main(String[] args) {
        B b = new B();
        b.setA(56);
        System.out.println(b.getA());
        b.Show();

    }
}
    class A{
    int a;
    void Show(){
        System.out.println("Hello");
    }
    int getA(){return this.a; }
        void setA(int a){ this. a =a;}
    }

    class B extends A {
    void Show1(){
        System.out.println("hi");
    }
    }

