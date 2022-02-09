package day_31_01_02;

import java.util.Arrays;

public class C8ForEach {
    public static void main(String[] args) {
        double []arr = {10.5,5.2,2.2,4.5,5.6,6.1,8.2};
        Arrays.sort(arr);
        System.out.println(arr);
        for (double d : arr){
            System.out.println(d);
        }
        System.out.println(Arrays.toString(arr));
    }
}
