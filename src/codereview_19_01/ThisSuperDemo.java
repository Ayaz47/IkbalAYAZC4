package codereview_19_01;

public class ThisSuperDemo {
    public static void main(String[] args) {
        new Child();
    }
}
class Base {
    Base(){
        this(10);
        System.out.println("hello");
    }
    Base(int a){System.out.println(a);}
}
class Child extends Base {
    Child(){
        System.out.println("Hi");
    }
}
