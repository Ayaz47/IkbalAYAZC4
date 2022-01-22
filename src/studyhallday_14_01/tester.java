package studyhallday_14_01;

public class tester extends Employee{
    public tester(String name, int age, double salary) {
        super(name, age, salary);
    }


    public void getAnnualBonus(){
        this.salary=this.salary*.05;
        System.out.println("He got bonus " + salary);
    }

}