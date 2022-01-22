package day_19_30_12;

public class C11AnonymousArrayPrac {
    public static void main(String[] args) {

        printArray(new int[]{10,20,30}
        );
        int arr[]={1,2,3,4,5};
        printArray(arr);
    }

    static void printArray(int arr[]){
        for(int i = 0; i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
