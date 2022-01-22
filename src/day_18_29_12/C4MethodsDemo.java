package day_18_29_12;

public class C4MethodsDemo {

    // public static are modifier
    //public= access modifier
    //static= non-access modifier
    //void = return type
    // main= name if method
    //String[] = argument or parameter type ; args is a variable of String[] type
    // {} body of method or method definition
     public static void main(String[] args) {

    }
    // a method can be declaring a method
    // below method only have return type and method name
    void display () {
         return; //returning statement without a returning value  >>OPTIONAL
    }

    // modifier is static, return type is int. method name is getSalary
    // one int parameter
    static int getSalary(int days_worked) {
         return 1000000; //returning statement
    }

}
