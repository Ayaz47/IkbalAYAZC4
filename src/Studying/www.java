package Studying;

public class www {
    public static void main(String[] args) {
        kopek it= new kopek("akita",3,"HACIKHO","ORANGE");
        System.out.println(it.getAge());
        System.out.println(it.getBreed());
        System.out.println(it.getName());
        System.out.println(it.getColour());
        System.out.println(it.toString());


    }
}


class kopek {
    private String breed;
    private int age;
    private String name;
    private String colour;



    public kopek (String breed, int age, String name, String colour){
        this.age=age;
        this.breed=breed;
        this.colour=colour;
        this.name=name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return
                "\nbreed =" + breed +
                        "\nage =" + age +
                        "\nname =" + name  +
                        "\ncolour='" + colour ;
    }
}