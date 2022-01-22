package day_16_27_12;

public class C1ArrayDemo {
    public static void main(String[] args) {
        int i; // declaration
        i = 10; // initialization
        String name1 = "zelal";
        String name2 = "mihrican";
        String name3 = "kkqbud";
        String name4 = "ruken";

        String names[]; // declaration
             names   = new String[50]; // initialization
        System.out.println(names.length);

        names[0] = "Kefo" ;
        names[5] = "Esther";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);
        System.out.println(names[5]);
        names[5] = "volkan";
        System.out.println(names[5]);


    }
}
