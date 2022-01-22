package assignments;

public class HeliJava {
    public static void main(String[] args) {
      /*  int x =7; boolean z= false;
        for (int i =2; i<=x; i++){
            if (x%i==0) System.out.println("prime number" );
            else System.out.println("not a prime");

        }
        int x =15;
        for(int i= 1; i<=x; i++){
            System.out.println(i + "/" + (i+1));
        } */
        int x =5;
        for(int i = 5; i<=x; i--) {
            for (int j=5; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println(i);
        }
    }
}
