package day_6_08_12;

public class C8IfElse {
    public static void main(String[]arg){

        int i=0, j=5;

        if(j<40) i++;

        if(j>=50) i = 6+i;
        if(j==50){
            ++i;
            j=j+i;
        }

        System.out.println(j);
        System.out.println(i);

    }
}
