package Studying;

import java.util.Scanner;

public class RoomDimens {
    public static void main(String[] args) {

        System.out.println("Enter the Size of room");
       new RoomDimens(10,10);
    }
   private double length;
   private double width;

   public RoomDimens(double length, double width){
       this.length=length;
       this.width= width;
   }
   public double getLength(){return length;}
    public double getWidth(){return width;}

   public double area(){
       return  width*length;
    }
    public String toString(){
       return "area of the room" + area();
    }




}
