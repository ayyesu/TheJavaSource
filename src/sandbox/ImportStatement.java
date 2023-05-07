package src.sandbox;

/*
* When we import a module with the "Static keyword" we can directly access variables and
* methods without calling the class
*
* We can also compact the import statement so then only one import statement will be needed
* eg; import static java.lang.Math.*
* Here we can access all methods and properties within the Math class
*/
import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

public class ImportStatement {
    public static void main(String[] args){
        System.out.println("PI value = " + PI);
        double result = sqrt(5.0);
        System.out.println("sqrt value = " + result);
    }
}
