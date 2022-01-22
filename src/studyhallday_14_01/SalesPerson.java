package studyhallday_14_01;

public class SalesPerson {
    private double commissionPercentage;

    public SalesPerson(String name, int age, double salary, double commissionPercentage) {
        this.commissionPercentage = commissionPercentage;
    }

    public double getCommissionPercentage() {
        return commissionPercentage;
    }
    public void raiseCommission(){
        if (this.commissionPercentage < .30){
            this.commissionPercentage=commissionPercentage*.04;
        }

    }

}
