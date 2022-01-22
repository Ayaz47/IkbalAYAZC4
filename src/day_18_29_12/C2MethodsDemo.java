package day_18_29_12;

public class C2MethodsDemo {
    public static void main(String[] args) {
        //Using a method means calling or invoking a method
        // below statement calls the show method so show is the called method
        //and main is the calling method as show is being called from the main method
        show();
        play();
        show();

    }
    static void show(){
        System.out.println("This is show new method");
        play();
    }
    static void play(){
        System.out.println("Play method");
    }
}
