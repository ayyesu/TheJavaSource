package src.sandbox.datatypes;

public class StringDemo {
    public static void main(String... args) {
        // Ways to call String constructors
        System.out.println("----------------Initialising String----------------------");
         String text1 = null;

         String text21 = "two";
         String text22 = "two";
         String text23 = new String ("two");

         String piece1 = "t";
         String piece2 = "wo";
         String text20 = piece1 + piece2;

         char[] twoCh = {'t', 'w', 'o'};
         String text28 = new String(twoCh);
        System.out.println("----------------Normal String-------------------");
        String text24 = "two";
        String text25 = "two";
        if (text24 == text25) {
            System.out.println("Equal References");
        } else {
            System.out.println("Different References");
        }
        if (text24.equals(text25)) {
            System.out.println("Equal Objects");
        } else {
            System.out.println("Different Objects");
        }

        System.out.println("----------------New keyword on strings----------------------");
        /*
        * Initializing a string with the new keyword and comparing
        * */
        String text32 = "two";
        String text33 = new String ("two");// 'new' Creates a new memory to store string value
        if (text32 == text33) {
            System.out.println("Equal References");
        } else {
            System.out.println("Different References");
        }
        if (text32.equals(text33)) {
            System.out.println("Equal Objects");
        } else {
            System.out.println("Different Objects");
        }
        System.out.println("-------------Escaping Characters--------------------");
        // Escaping Characters
        /*
        * \t - used for creating tabs
        * \n - used for inserting a newline
        */
        String memo = "The name of the characters are: \n" +
                "\t -Daniel Kissiedu \n\t -Josephine Boateng ";
        System.out.println(memo);
    }
}



