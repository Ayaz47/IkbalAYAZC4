package day_4_06_12;

public class Operators {
    public static void main(String[]args){


    /*
                       * 3 type of operators:
    * 1) unary operators :operators that act on one operand
    * 2)binary operators :operators that act on two operands
    * 3) ternary or tertiary operators:  operators that act on three operands*/

     /*ARITHMETIC OPERATORS/*
    -   Subtraction
    +   Addition
    *   multiplication
    /   Division
    %   Modulus o get reminders
     */
        /*
    Sequence of Arithmetic Operations
            B	Brackets , paranthesis in programming ()
            E  	Exponents
            MD	Multiplication and Division , left to right associativity
            AS	Addition and Subtraction +-, left to right associativity
   */
        int id = 10-2*5/5+3 ;
        //i = 10 - 10 / 5 + 3
        //i = 10 - 2 + 3
        //i = 8 + 3
        //i = 11
        System.out.println(id);


        System.out.println(10/5);
        System.out.println(10%2);
        System.out.println("11/2=" + (11/2));
        System.out.println("11%2=" + (11%2));

        System.out.println(11.0/10);
        System.out.println(11.0/2);
        System.out.println(1.0/2.0);
        System.out.println(1.0/2);
        System.out.println(1/2.0);





    int i =4;
    System.out.println(i + "*1 = " + (i*1));
    System.out.println(i + "*2 = " + (i*2));
    System.out.println(i + "*3 = " + (i+3));
    System.out.println(i + "*4 = " + (i+4));
    System.out.println(i + "*5 = " + (i*5));

    }
}
