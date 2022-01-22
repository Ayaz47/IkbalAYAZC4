package Studying;

public class Account {
   private String name;
    private int accountNum;
    private double balance;
    //Acount constructor
    public Account(String intName, int intId, double intbalance  ){
        name = intName;
        accountNum = intId;
        balance = intbalance;


    }
  public void deposit(double amount){
        balance = balance + amount;
  }
  public void withdraw(double amount , double fee){
        balance = balance- amount - fee;

  }
  public double getBalance(){
        return balance;
  }

  }


    /*  public double getBalance(){
        return balance;
    }
    public int getName(){
        return accountNum;
    }
    public String  name(){
        return name;

    }*/



