package day_7_09_12;

public class C2Revision {
    public static void main(String[]arf){
        int i =5;
        i = --i + i-- + ++i ;
        System.out.println(i);

        //You're a tour manager and need a program that will identify small countries.
     //A country is considered small if its population is under 10000 and its area is under 10000 hectares.
     //The given program takes population and area as input.
      //Task
       //Complete the program to output "small country" if both conditions are met.
        // Don't output anything otherwise.
        int populattion = 9846, area = 8745;
        if(populattion<10000){

            if(area<10000){
                System.out.println("its a small country");
            }
            else
                System.out.println("popullation is less than 10000  ut area is greater then 10000");
        }
    }
}
