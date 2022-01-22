package studyhallday_14_01;

class Main {
    public static void main(String[] args) {
        SalesPerson kefo=new SalesPerson("Kefo",38,50000,.50);
        tester Ogun=new tester("Ogun",28,90000);
        System.out.println(kefo.toString());
        System.out.println();
        kefo.raiseCommission();
        System.out.println(kefo.toString());
        System.out.println("He got comission Percentage " + kefo.getCommissionPercentage());

        System.out.println(Ogun.toString());
        System.out.println();
        Ogun.raiseSalary();
        Ogun.getAnnualBonus();
        System.out.println(Ogun.toString());

    }
}
