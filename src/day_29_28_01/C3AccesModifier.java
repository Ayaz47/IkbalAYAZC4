package day_29_28_01;

public class C3AccesModifier {
    public static void main(String[] args) {
        Test.play();
        System.out.println(Test.j);
        // Test.show() ;
        //System.out.println(Test.i);
    }
}

class Test{
    static  private void show(){
        System.out.println("Hello");
    }

    static   void play(){
        System.out.println("chao");
    }

    static private int i=  10   ;
    static  int j=  10   ;
}
