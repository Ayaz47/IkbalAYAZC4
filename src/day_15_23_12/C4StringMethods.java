package day_15_23_12;

import java.util.Locale;

public class C4StringMethods {
    public static void main(String[] args) {
        String str = "HumptyDumpty";
        boolean b = str.contains("mpty");
        System.out.println(b);

        System.out.println("HelloFelloRello".contains("Fell"));

        //trim() trims the saces at the beginning and end of String
        String s2 = "     hello guys        !      !        ";
        System.out.println(s2.trim());

        System.out.println("Slavchao$NAMESTE".toLowerCase());
        System.out.println("Slavchao$NAMESTE".toUpperCase());

    }
}
