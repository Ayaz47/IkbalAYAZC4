package day_31_01_02;

public class C6WrapperParsing {
    public static void main(String[] args) {
        String s = "10.56";

        //parsing a sting  Value to the double
        double d = Double.parseDouble(s);
        double sum = d + 20;
        System.out.println(sum);

        int i = Integer.parseInt("606");
        int h = i +10;
        System.out.println(h);

        String o = "66";
        int w = Integer.parseInt(o);
        System.out.println(o);

        String k= "66.5";
        System.out.println(k+"xx" +10);
        double q = Double.parseDouble(k);
        System.out.println(q+10);










    }
}
