package src.sandbox.datatypes;

import java.util.Arrays;
public class ArrayDemo {
//    int arr[];

    public static void main(String[] args) {
//        ArrayDemo array = new ArrayDemo();
//        if (array.arr == null){
//            System.out.println("Array is usable...");
//        }
        int [] array = new int[2];
        // putting values in our array
        array[0]=2;
        array[1]=8;
        Arrays.stream(array).forEach(b -> System.out.println(b));
        Arrays.sort(array);
        for (int i=0;i<array.length; i++){
            System.out.println("Array of index ["+ i + "] "+ "has value " + array[i] );
        }
    }
}
