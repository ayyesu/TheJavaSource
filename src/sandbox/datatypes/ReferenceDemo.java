package src.sandbox.datatypes;

public class ReferenceDemo {
    public static void main(String[] args){
        IntContainer i = new IntContainer(41);
        IntContainer k = new IntContainer(44);

        swap(i,k);

        System.out.println("i = " +  i.getValue());
        System.out.println("k = " + k.getValue());
    }

    static void swap(IntContainer a, IntContainer b){
        IntContainer temp = new IntContainer(a.getValue());
        a.setValue(b.getValue());
        b.setValue(temp.getValue());
    }
}
