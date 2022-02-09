package day_31_01_02;

import java.util.ArrayList;
import java.util.List;

public class C4CollectionGeneric {
    public static void main(String[] args) {
       //Arraylist
        //-Dublicated are allowed in Arraylist
        // null insertion is possible in an Arraylist
        // insertion order is preserved in the Arraylist

        //as the generic mentioned is String type
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("hi");
        list.add("hi");
        list.add("hi");
        list.add("hi");
        list.add("slav");
        list.add(null);
        //list.add(2.5); it gives error because specified by only <String>
        System.out.println(list);

    }
}
