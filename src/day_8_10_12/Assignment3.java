package day_8_10_12;

public class Assignment3 {
    public static void main(String[]apo){
         /*int x = 2;  String s;
         switch (x) {
             case 1: System.out.println("hello"); break;
             case 2: System.out.println("SLAW"); break;
             case 3: System.out.println(" kag delo"); break;
             case 4: System.out.println(" java"); break;
             default: System.out.println("ERROR"); break;
         } */
        double a=10, b=20;
        System.out.println("Numbers are a=" +a +"\tb=" +b);

        System.out.println("Give an option \n1 for addition\n2 for subtraction\n3 for Multiplication" +
                "\n4 for Division\n5 for modulus");
        int option = 3;
        switch (option) {
            case 1: System.out.print("a+b =/"+ (a+b)); System.out.println("\tcase 1");
            break;
            case 2: System.out.print("a-b ="+ (a-b)); System.out.println("\tcase 2 ");
                break;
            case 3 :System.out.print("a-b ="+ (a*b)); System.out.println("\tcase 3");
                break;
            case 4: System.out.print("a/b ="+ (a/b)); System.out.println("\tcase 4");
                break;
            case 5: System.out.print("a%b ="+ (a%b)); System.out.println("\tcase 5");
                break;
            default: System.out.println("ERROR");
        }
    }

}
