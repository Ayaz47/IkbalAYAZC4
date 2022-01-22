package Studying;

public class KadirChalenge {
    public static void main(String[] args) {

        employee number1 = new employee("ikbal ayaz", "Mardin", (byte) 26, 100000);
        employee number2 = new employee("sirin aksoy", "istanbul", (byte) 26, 22000);

        System.out.println(number1.ChangeLocation("Kerboran"));
        System.out.println(number1 +"\n"+ number2);

    }
}
     class    employee {
        String name;
        String location;
        byte age;
        int salary;
         public employee(String name, String location, byte age, int salary){
             this.name= name;
             this.location = location;
             this.age= age;
             this.salary = salary;
         }
         public String getName(){return name;}
        public String getLocation(){return location;}
        public byte getAge(){return age;}
        public int getSalary(){return salary;}


         public String ChangeLocation(String newLocation){ location= newLocation;
         return newLocation;}

    public int raiseSalary(int amount){
        salary = salary + amount;
        return salary;
    }
   public String toString (){
        return   "Name : "   +getName() +
             "\nLocation : "   +getLocation() +
                  "\nAge : "   +getAge() +
               "\nSalary : "   +getSalary();

}  }
