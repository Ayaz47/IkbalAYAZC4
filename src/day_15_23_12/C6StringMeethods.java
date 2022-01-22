package day_15_23_12;

public class C6StringMeethods {
    public static void main(String[] args) {
        String s1= "Hello-slav";
        String s2= "Hello-slav";
        s2= new String(s2);

        System.out.println(s1.contentEquals(s2));
        System.out.println(s1==s2); // chekcs the equality of the references.
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
