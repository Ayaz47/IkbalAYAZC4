package assignments;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
//        int x= 1000; int number= 0; int count= 0;
//        for(int y = 1; y<=x; y++) {
//            if (y%5==0 && y%3==0)
//            System.out.println(y);
//
//
//
//        }


        int a=6;
        int sum=0;
        for (int i=1; i<a; i++){
            if (a%i==0){
                sum+=i;
            }
        }
        if (sum==a){
            System.out.println("number "+a+" is a perfect number");
        }else{
            System.out.println("number "+a+" is not a perfect number");
        }






        /* int a =50; int number= 0;
        for(int b =1; b<=a; b++) {
            number= b + number;

            System.out.println("sum all number =" + number); } */











       /* int sum=0, count=0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
            System.out.println(i);
            sum= sum+i;
            count++;}
            if (count == 5) break;

        }
            System.out.println(sum);*/
    }
}
