package day_7_09_12;

public class Assignment1 {
    public static void main(String[]arg){


        //question1
        int wheather = -1;
        if(wheather<0) System.out.println("Negative");
        else if(wheather==0) System.out.println("0");
        else if (wheather>0) System.out.println("Positive");

        //question2
        int number = 3;
        if(number%2==0)System.out.println("Number is even");
        else System.out.println("Number is odd");



        //Question3
        int mark= 100; {
        if(mark<40) System.out.println("Grade = " + "E");
        if(mark>=40 && mark<60) System.out.println("Grade = " + "D");
        if(mark>=60 && mark<75) System.out.println("Grade = " + "C");
        if(mark>=75 && mark<90) System.out.println("Grade = " + "B");
        if(mark>=90 && mark<100) System.out.println("Grade = " + "A");
        if(mark==100) System.out.println("Grade = " + "O"); }

        //question4
        int salary = 100001;
        if(salary<1000) System.out.println("Not an SalesPerson");
        if(salary>=1000 && salary <= 10000) System.out.println("Software Tester");
        if(salary<=10000 && salary <=25000) System.out.println("Software Devoloper");
        if(salary>=25000 && salary <=50000) System.out.println(" Project Manager");
        if(salary>=50000 && salary <=100000) System.out.println(" Team Leader");
        else if(salary>100000) System.out.println("HR Manager");
          System.out.println();


          int purchase= 17000; {
          if(purchase<15000) System.out.println("you could'nt  win a GIFT CART");
          if(purchase>=15000 && purchase<=30000) System.out.println(" you won a GIFT CART");
          if(purchase>30000) System.out.println("you won 2 GIFT CART");}

    }
}
