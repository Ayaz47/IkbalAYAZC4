package day_15_23_12;

public class C2SubstringDemo {
    public static void main(String[] args) {
        String str = "we the people of this world";
        String s = str.substring(5+5/1);
        System.out.println(s);
        System.out.println(str.substring(0));
System.out.println("-----------------------------");
        //below statement gives us substring starting from
        //index 7 to ndec 11 i.e. 12-1
        String s1 = str.substring(7,12);
        System.out.println(s1);

        System.out.println();

    }
}
