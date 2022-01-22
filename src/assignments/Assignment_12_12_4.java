package assignments;

public class Assignment_12_12_4 {

    public static void main(String[]arg){
        // two number of swapping
        int a = 7; int b = 8, c;
        c = a;
        a = b;
        b = c;

        System.out.println("new a = " + a);
        System.out.println("new b = " + b);
        System.out.println("-----------------------------------------------------");
        // a number of swapping
        int x = 10, y;
        y=x+20;
        x=y-10;
        System.out.println("now y = " + y);
        System.out.println("now x = " + x);
        System.out.println("----------------------------------------------------------- ");
        /// Reversing
        int number= 9876, first= number%10, second = (number/10)%10,
                third=(number/100)%10, fourth=(number/1000)%10;

    System.out.println("reversed number is "+(first*1000 + second*100 + third* 10 +fourth*1));

    }
}
