package day_15_23_12;

public class C7CompareToDemo {
    public static void main(String[] args) {
        /*
        The compareTo() method compares two string lexicographically ( in the dictionary order OR lexical order)
        The comparis3on is based on unicode value of each character in the strings*/


        System.out.println("Apple".compareTo("Apply"));
        /*compareTo returns
        1) +ve number: This string comes after the specified string
                           is greater than the specified string
        2) -ve number: This string comes before the specified string
                          is smaller than the specified string
        3)  0          This string is equal to the specified sting
           if the characters of the shorter string are same as those corresponding to the longer string,
           difference in the number of characters in returned
         */
    }
}
