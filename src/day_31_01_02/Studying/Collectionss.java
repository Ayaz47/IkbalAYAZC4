package day_31_01_02.Studying;

import java.util.ArrayList;
import java.util.Collection;


public class Collectionss {
    public static void main(String[] args) {
         Collection c = new ArrayList();
        ArrayList <String>al = new ArrayList();
        c.add("hello");
        System.out.println(c);
        al.add("ogun");
        al.add("ogun");
        al.add("ikbal");
        al.add("ikbal");
        al.add("kadir");
        al.add(null);
      //  al.add(45.2);
        al.add("java is fun");
        System.out.println(al);
        al.remove(al.indexOf("kadir"));
        System.out.println(al);
        al.remove("ogun");
        System.out.println(al);
        System.out.println(al.contains("kadir"));
        System.out.println(al.size());

        for(int i = 0; i< al.size(); i++){
            System.out.println(al.get(i));
        }
    }
}
