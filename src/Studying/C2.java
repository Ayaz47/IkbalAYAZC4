package Studying;

public class C2 {
    public static void main(String[] args) {

      C2 book = new C2("title of book", "outhor", "renk", 550, 50);
      System.out.println(book.toString());
    }
    String title;
    String outhor;
    String colour;
    int page;
    double price;
    public C2 ( String title, String outhor, String colour, int page, double price ){
      this.title= title;
      this.outhor= outhor;
      this.colour= colour;
      this.page = page;
      this.price = price;
    }
    public String getTitle() {
        return title;
    }

    public String getOuthor() {
        return outhor;
    }

    public String getColour() {
        return colour;
    }

    public int getPage() {
        return page;
    }

    public double getPrice() {
        return price;
    }
    public String toString(){
        return ("Hi,\nThe title of book " + this.getTitle()+
                "\nThe outhor of book : " + this.getOuthor() +
                "\nThe colour of book: " + this.getColour() +
                "\nThe number of page : " + this.getPage()+
                "\nThe price of book = " + this.getPrice());
    }


}
