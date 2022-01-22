package Studying;

public class kadir {
    public static void main(String[] args) {
        kadir cs = new kadir("kopek", 34,"blue","large");
        System.out.println(cs);
    }
    //intance variable
    //class is blueprint,template,protype (icindekiler)
    String breed;
    String size;
    int age;
    String color;
    //Constructor Declaration of Class
    public  kadir(String breed, int age , String color, String size){
        this.breed=breed;
        this.size=size;
        this.age=age;
        this.color=color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return ("Hi, The dog breed is " + this.getBreed()+
                "\nThe dog age is : " + this.getAge() +
                "\nThe dog color is: " + this.getColor() +
                "\nThe dog Size is : " + this.getSize());

    }
}
