package day_27_24_01;

public class CarTester {
    public static void main(String[] args) {
        //Car c = new Car();
        Tesla t = new Tesla();
        t.moveForward();
        t.moveBack();
        t.Spendgas();
        t.Hello();

        BMW b = new BMW();
        b.moveForward();
        b.moveBack();
        b.Spendgas();
        b.Hello();


    }
}

//abstract classes can never be instantiated.
//We can never create the object of an abstract class
abstract class Car{

    //an abstract method just tells the behaviour or functionality of the object.
    //It does not specify the actual implementation details
    //An abstract method must be overridden by the first concrete chils class in the inheritance hierarchy
    abstract void moveForward() ;//overridden method
   abstract void moveBack();
   abstract void Spendgas();
    void Hello(){System.out.println("HELLO method");}
}

//Abstract classes can be used via inheritance
//Tesla "is-a" Car    ; Inheritance "is-a" relationship
//A concrete or regular class cannot have an abstract method.
//A concrete must override all the abstract methods which it inherits
  class Tesla extends Car{
    int i =10;
    void moveForward(){//overriding method OR override
        System.out.println("Tesla is moving forward automatically.."+ i);
    }

    @Override
    void moveBack() {
        System.out.println("Tesla Move back");

}
    void Spendgas (){System.out.println("The car also Spend gas");

    }
}

class BMW extends Car{
    void moveForward(){
        System.out.println("BMW is moving forward..");
    }
    void moveBack(){System.out.println("BMW move Back");

    }
    void Spendgas (){System.out.println("The car also Spend gas");}


    }


