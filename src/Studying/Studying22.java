package Studying;

public class Studying22 {
    public static void main(String args[]) {
        Animal a = new Dog();
        a.eat();
        Animal b = new Animal();
        b.eat();
    }
}
    class Animal{
      void eat(){System.out.println("animal is eating...");}
    }

    class Dog extends Animal {
    void eat() {
            System.out.println("dog is eating...");
        }
    }


