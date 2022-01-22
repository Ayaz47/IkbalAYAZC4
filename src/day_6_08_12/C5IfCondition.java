package day_6_08_12;

public class C5IfCondition {
    public static void main(String[]args){
        if("hello" == "hello") {
            System.out.println("Shakira");
        }
        if("hello" == "chalo")  // no need to put semicolon
            System.out.println("Beyonce");

        if('s' == 's'); System.out.println("salman khan");
         //   []bracket
        //  () parantheses
        // {}  Brace
        int i = 10;
        if(i == ++i) {
            System.out.println( "Hello");
            System.out.println("Chao");
            System.out.println("Slavu Rez");
        }
        System.out.println();
        i = 10;
        if(i == ++i)     //condition is false
            System.out.println( "Hello");
            System.out.println("Chao");
            System.out.println("Slavu Rez");
            /* Anything written within an opening ang a closing brace is called a
            block of code OR compound statement or a block*/


    }
}
