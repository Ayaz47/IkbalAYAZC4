package day_19_30_12;

public class C3MethodDemoPrac {
    int show (int a){
        int b = a*a;
        return a+b;

    }
    static String m1(int b){
        return "hello" + b;
    }

    public static void main(String[] args) {
        m1(50);
        String str = m1(60);
        System.out.println(str);
        System.out.println(m1(60));
    }
}
