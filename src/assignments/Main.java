package assignments;

public class Main {
    public static void main(String[] args) {
       System.out.println("Hello");
        Z1.num(5,8);

       Z1.number(5,8);
       Z1.sayHi();

       String name1= Z1.sayHi("Kadir");
        System.out.println(name1);

       int x=5;
       Z1.increment(x);
        System.out.println(x);

        System.out.println("Enter your name and age ");
        System.out.println("My name is " + Z1.myName() + "\n" + "My age is " + Z1.myAge());

    }
}
