package src.sandbox.objecttype;

public class OperationDemo {
    public static void main(String[] args){
        Addition addition = new Addition();
        float result = addition.execute(4, 2);
        System.out.println("Results: " + result);

        // Functional Interface allows us to call the interface rather than the class
        Operation addition2 = (a, b) -> a + b;
        float outcome = addition2.execute(5, 2);
        System.out.println("Functional Interface Results: "+ outcome);
    }
}
