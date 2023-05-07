package src.sandbox.datatypes;

public class primitiveDemo {
    public static void main(String[] args){
        int i = 5;
        int k = 4;
        swap(i, k);
        System.out.println("i = " + i);
        System.out.println("k = " + k);
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
