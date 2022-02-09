package day_30_31_01;

public class C5Expections {
    public static void main(String[] args) {



        try {
            System.out.println("hello");
            Thread.sleep(1000);
            System.out.println("Hi");
        }
        catch(Exception e){
            System.out.println("This is the catch block");
        }

        System.out.println("slaw");


    }
}
