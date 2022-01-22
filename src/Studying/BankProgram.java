package Studying;

public class BankProgram {
    public static void main(String[] args) {
        // instantiate objects
        Account acct1 = new Account("ikbalayaz ", 434254243, 450 );

        Account acct2 = new Account("sirin ", 342352334, 4342 );
        acct1.deposit(500);
        System.out.println(acct1.getBalance());
    }

}
