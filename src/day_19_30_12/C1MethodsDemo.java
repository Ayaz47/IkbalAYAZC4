package day_19_30_12;

public class C1MethodsDemo {
    public static void main(String[] args) {


            show("Tom", 65 ) ;

            show() ;
            show("Jerry", 75) ;
        }

    /*
    When two or more methods have the same name, this is called method overloading
     */
        static void   show(  String name, int salary  )
        {
            System.out.println(name + "\t" + salary);
        }


        static void show(  ){
            System.out.println("no-args show method");
        }

    }

