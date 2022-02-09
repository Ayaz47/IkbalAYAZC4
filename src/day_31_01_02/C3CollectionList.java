package day_31_01_02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class C3CollectionList {
    /*a collection is a group of objects represented as a single entity
    */
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();

        Collection c  = new ArrayList();

        List  list = new ArrayList();//upcasting
        list.add("hello");
        list.add("hi");
        list.add("slav");
        list.add(2.2);
        list.add(null);
        list.add(5);
        c.add("ogun");
        System.out.println(c);
        System.out.println(list);
        list.remove("slav");
        System.out.println(list);
       System.out.println( list.contains("hello"));
     //  list.clear();
       System.out.println(list);
       String s = (String) list.get(3);
       System.out.println(list);




    }
}
