package studyhallday_14_01;

public class Study1 {
    private String  breed;
    private String name;
    private byte age;
    private double weight;

    public Study1(String breed, String name, byte age, double weight) {
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public byte getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public boolean barking(){
        if (age >2);
        System.out.println(this.name + " is barking");

        return true;
    }

    @Override
    public String toString() {
        return "Study1{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
