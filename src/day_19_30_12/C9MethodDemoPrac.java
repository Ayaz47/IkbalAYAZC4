package day_19_30_12;

public class C9MethodDemoPrac {
    public static void main(String[] args) {
        int arr[] = {20,30,40,50};
        printArray(arr);
        int arr2[]= {10,40,30,20};
        printArray(arr2);
        int arr3[]= {5,6,7,8};
        printArray(arr3);
        printArray(new int[]{9,8,7,6,5,4,3,2});

    }
    static void printArray(int[]arr){
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }

    }

}
