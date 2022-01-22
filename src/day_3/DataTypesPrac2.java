package day_3;

public class DataTypesPrac2 {
    public static void main (String[]arg) {
        /* PRIMITVE DATA TYOES IN JAVA
        Types---Size
        --------------
        Byte = 1 byte  (8 bits)          -128 to 127
        Short = 2 byte  (16 bits)         -32,768 to 32,767
        in = 4 bytes     (32 bits)        -2,147,483,648 to 2,147,483,647
        long = 8 bytes   (64 bits)         -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        float 4 bytes ( 32 bits)
        double = 8 bytes (64 bits)
        char = 2 bytes (16 bits)
         */
        byte b = 20 ;
        System.out.println(b);
        b = 120 ;
        System.out.println(b);
        // any constant value in vaja is called LITERAL
        //By defult value all integral values within the range of int are treated as int literal
        short s = 200 ;
        System.out.println(s);
        int salary = 56546 ;
        //
        //to specify a long literal we use the suffix L
        long phone_number = 434235254343L ;
        // any constant value in java is valled literal
        // by default all integral winhin a range of int are treated as in literals
        // if we use a literal within a range of int, so soffic L is not required

    }
}
