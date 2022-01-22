package day_13_20_12;

import java.util.Scanner;

public class C1Revision {
    public static void main(String[] args) {
        /*
WAP to enter marks in 5 subjects out of 100. If marks in any subject
is less than 33 then it's a faliure. Your program should output the no. of
 subjects the person is failing in else it should print PASS.
	50
	60
	98
	58
	81
 */
       Scanner sc= new Scanner(System.in);
        System.out.println("Enter mark for each of them below");

        Double math,science,computer,kurdish, turkish; byte count =0;
    System.out.println("Enter your math note"); math =sc.nextDouble();
        System.out.print("Enter your science note"); science =sc.nextDouble();
        System.out.print("Enter your computer note"); computer =sc.nextDouble();
        System.out.print("Enter your kurdish note"); kurdish =sc.nextDouble();
        System.out.print("Enter your turkish note"); turkish =sc.nextDouble();
        double avarage=math+science+computer+kurdish+ turkish;
        if   (math<33);
            if (science<33)  count++ ;
            if (computer<33) count++ ;
            if (kurdish<33)  count++ ;
            if (turkish<33)  count++ ;
            System.out.println("failed " +count +" of lesson" );















          /*  float english, maths, science, history, computers ;
            Scanner scan = new Scanner(System.in);
            char option;
            do {

                System.out.println("Enter marks out of 100 for the following sujects");
                System.out.print("English: ");
                english = scan.nextFloat();
                System.out.print("Maths: ");
                maths = scan.nextFloat();
                System.out.print("Science: ");
                science = scan.nextFloat();
                System.out.print("history: ");
                history = scan.nextFloat();
                System.out.print("computers: ");
                computers = scan.nextFloat();

                byte count = 0;
                if (english < 33) count++;
                if (maths < 33) count++;
                if (science < 33) count++;
                if (history < 33) count++;
                if (computers < 33) count++;

                if (count >= 1) {
                    System.out.println("The student is failing in " + count + " subjects");
                } else
                    System.out.println("PASS");

                System.out.println("Press y to continue or any other key to stop!");
                option = scan.next() . charAt(0);
            }while ( option=='y' || option=='Y' );

            System.out.println("Thanks for using!"); */
        }
    }
