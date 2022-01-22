package day_8_10_12;

public class C3TernaryOperator {
    public static void main(String[]args){

        int i = 20, j;
        // Ternary Operator is like a short hand of of else blocked
        if(i<9)
            j=1;
        else
            j = 0;
        System.out.println(j);

        j=      i>9    ?     1 : 0;
        System.out.println(j);
    }
}
