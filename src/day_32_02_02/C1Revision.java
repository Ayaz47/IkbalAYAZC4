package day_32_02_02;

import java.util.ArrayList;
import java.util.Iterator;

public class C1Revision {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Using For Loop");
        for( Integer i : list)
            System.out.println(i);



        System.out.println("\nUsing Loop");
        for (int j = 0; j<list.size(); j++){
            System.out.println(list.get(j));}

        System.out.println(list);

            // Iterator is a way to scroll through or access or traverse or Iterate throughall
            //the element of the List
        // An Iterator object like a cursor for collection elements
        System.out.println("\nUsing Iterator");


        Iterator<Integer> i = list.iterator();
        while (i.hasNext()){
            Integer element = i.next();
            System.out.println(element);
        }
        System.out.println("Iterator comes first");
     i = list.iterator();
        while (i.hasNext()){
            Integer element = i.next();
            System.out.println(element);
        }
    }
}
