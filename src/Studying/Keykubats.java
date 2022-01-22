package Studying;

public class Keykubats {

    public static void main(String[] args) {
        Knife kk = new Knife();
        kk.length= 55;
        System.out.println(kk.length);
    }
}
class Knife {
    String type, category;
    double length;

    void setType(String type){this.type=type;}
    String getType(){return this.type;}
    void setCategory(String category){this.category=category;}
    String getCategory(){return this.category;}
    void setLength(double length){this.length=length;}
    double getLength(){return this.length;}
}

//folding knives
      /*  public static void main(String[] args) {
            knife f1 = new knife();
            f1.setType("Camping_knife");
            //System.out.println(f1.setType());
        }
    }
    class knife{
        private String type, category;
        private double length;

        void String getType(String type){
            //this.type=type;
            return this.type;
        }
        public String getCategory(String category){
            this.category=category;
            return this.category;
        }
        public double getLength(double length){
            this.length=length;
            return this.length;
        }
        public void setType(String type){this.type=type;}
        //knife(){}
        public knife(String type, String category, double length){
            System.out.println("bura constructor");
            this.type=type;
            this.category=category;
            this.length=length;
        }
        public String toString(){return(getType()+getCategory()+getLength())}
*/

