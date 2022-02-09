package day_31_01_02;

public class C5Wrapper {
    /*
    Corresponding to all type primitive types in java,
    there are inbuilt classes called Wrapper classes
    Primitive type               Wrapper class
    byte                          byte
    short                         short
    int                           integer
    long                          long
    float                         float
    double                         double
    char
    boolean                    boolean
                                   Void (practically never used)
    */
    public static void main(String[] args) {
        int i = 10;
        //Boxing or Wrapping
        Integer j = new Integer(10);

        //Unboxing or Unwrapping
        int k = j.intValue();

        //Auto Boxing or Auto Wrapping
        Integer p = 20;
        //auto Unboxing or Unwrapping
        int d = 5;
        //Unboxing
         double r = 3.5;

         boolean x = true;

         }


    }


