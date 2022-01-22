package day_6_08_12;

public class C6IfScopeOfVariable {
    public static void main(String[]args){

     System.out.println("This is before the block of code");

      //if(false)

        {
            System.out.println("This is inside a Block of coe");
            int i = 10;
            System.out.println(i);
        }
        int i = 20;
        System.out.println(i);
        if('a' != 'b')
     System.out.println("This is after the block of code");
    }
}
