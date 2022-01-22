package assignments;

public class Assignment_12_12_2 {
    public static void main(String[]arg){
       // Question) Consider the marks of following five subjects  and print the Percentage and result based on that percentage.
            //    Georgian, English, Maths, Science, Computers. Marks should be out of 100.
         //Percentage=(Total Marks of all 5 subjects/500)*100.
        int georgian = 40, english=70, maths=50, science=50, computer=40;
        double lessons = georgian + maths + science + computer + english;
        double x =(lessons/500)*100;

        if(x<40 && x>0)System.out.println("FAIL!");
        else if(x>=40 && x<50) System.out.println("THIRD");
        else if(x>=50 && x<60) System.out.println("SECOND");
        else if(x>=60 && x<75) System.out.println("FIRST");
        else if(x>=75 && x<=100) System.out.println(" FIRST WITH DISTINCTION");
        else System.out.println("ERROR");


    }
}
