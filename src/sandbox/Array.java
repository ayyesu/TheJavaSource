package src.sandbox;

public class Array {
    public static void main(String[] args) {
        int a[] = {3, 5, 3, 1, 5, 6};
        String arr[] = {"Foo", "Bar", "Shop"};
        int num = a.length;
        System.out.println("Array Length " +num);
        // For each loop to print array elements
        for (String s: arr){
            System.out.println("Array element " + s);
        }
        System.out.println("----------------------");
        for (int i=0; i<a.length; i++){
            System.out.println("index " + i + " is " + a[i]);
        }
    }
}
