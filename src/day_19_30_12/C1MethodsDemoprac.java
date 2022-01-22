package day_19_30_12;

public class C1MethodsDemoprac {
    public static void main(String[] args) {
        show("Tom", 75);
        alfabet('y');
        show("hello Kurdistan",500000);
        show();
        kurdish("welcome to kurdistan");

    }
    static void show(String name, int salary){
        System.out.println(name + "\t"+ salary);

    }
    static void show(){
        System.out.println("nothng inside");
    }
    static void kurdish(String hello){
        System.out.println(hello);
    }
    static void alfabet(char c){
        System.out.println(c);
    }
}
