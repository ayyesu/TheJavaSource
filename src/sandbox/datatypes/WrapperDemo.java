package src.sandbox.datatypes;

public class WrapperDemo {
    public static void main(String[] args) {
        System.out.println("-----------Upper interval boundary for int----------------");
        Integer max = Integer.MAX_VALUE; // output -> 2147483647
        System.out.println(max);
        System.out.println("-----Unboxing------");
        int pmax = max;
        System.out.println(pmax); // output -> 2147483647
        System.out.println("-----Boxing------");
        Integer io = 10;
        System.out.println(io); // output -> 10
        System.out.println("------Creating primitive utility method-----");
        // An exception is thrown when string is not a number
        Integer i1 = Integer.parseInt("20");
        System.out.println(i1); // output -> 20
        System.out.println("------Constructor deprecated in java 9-----");
        // An exception is thrown when string is not a number
//        Integer i2 = new Integer("30");
        System.out.println("Implementation commented in code");
        System.out.println("------Convert integer to string-----");
        // An exception is thrown when int is not of type int
        // parse Integer.toString() into function valueOf
        Integer i4 = Integer.valueOf(Integer.toString(100));
        System.out.println(i4); // output -> 100 of type string
        System.out.println("------Converting to float-----");
        // An exception is thrown when string is not a number
        float f1 = Integer.valueOf(20).floatValue();
        System.out.println(f1); // output -> 20.0
        System.out.println("-----creating string with binary representation of number 9 (1001)---------");
        String s1 = Integer.toBinaryString(9);
        System.out.println(s1); // output -> 1001
        System.out.println("----introduced in Java 1.8-----");
        Integer i6 = Integer.parseUnsignedInt("+15");
        System.out.println(i6); // output -> 15
        System.out.println("-----method to add to integers------");
        int sum = Integer.sum(2, 3);
        System.out.println(sum); // output -> 5
        System.out.println("------method to get the bigger value-----");
        int maximum = Integer.max(2, 7);
        System.out.println(maximum); // output -> 7
    }
}
