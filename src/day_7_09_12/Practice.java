package day_7_09_12;

public class Practice {
    public static void main(String[]arg){
       int i = 9999;
       if(i<10000) System.out.println("go to park");
       else if(i<50000) System.out.println("go to California");
       else if(i<90000) System.out.println("go to Europa");
       else if (i>100000) System.out.println("Go to world tour");

       int y = 80;
       if(y<40) System.out.println("E");
       else if(y<59) System.out.println("D");
       else if(y<74) System.out.println("C");
       else if(y<90) System.out.println("B");
       else if (y<100) System.out.println("A");


       int z = 100;
       if (z<5) System.out.println("Get Loved");
       else if(z<=10) System.out.println("Play");
       else if(z<=20) System.out.println("STudy");
       else if(z<=60) System.out.println("WORK");
       else if(z>60) System.out.println("Retire And Pray to God");

       int w = 15;
       if(w>50 && w<60) System.out.println("Mango");
       if(w>60 && w<98) System.out.println(" Orange");
       if (w>10 && w<40) System.out.println("Red");
       System.out.println();
       int a =1, b = 2;
       if(a<10000 && b<10000) System.out.println("Small country");



    }
}

