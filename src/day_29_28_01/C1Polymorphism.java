package day_29_28_01;

public class C1Polymorphism {
//Static Binding OR Early Binding OR Compile time polymorphism
    //is achieved vis method overloading


    /*
    Static VS Dynamic Binding:
    When a method call is resolved at compilation time, it's called Static Binding while
    when a method call is resolved at runtime (in case of method overriding) it's called Dynamic Binding
     */
    public static void main(String[] args) {
        C1Polymorphism.show() ;
    }

    static void show(){
        System.out.println("Hello");
    }
}
