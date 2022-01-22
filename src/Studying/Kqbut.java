package Studying;
public class Kqbut {

        //folding knives
        public static void main(String[] args) {
         Kqbut knife = new Kqbut("Knife type", "knife category",30,40);
         System.out.println(knife);
    }
    String type, category;
        double length, weight;
        public  Kqbut(String type, String category, double length, double weight){
            this.type=type;
            this.category=category;
            this.length= length;
            this.weight= weight;
        }
        public String getType(){
            return type;
        }
        public String getCategory(){
            return category;
        }
        public double getLength(){
            return length;
        }
        public double getWeight(){
            return weight;
        }
        public String toString(){
            return getCategory()+getType()+getLength()+getWeight();
        }

}
