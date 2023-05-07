package src.sandbox.objecttype;

public class Sample{
    public static void main(String[] args){
        System.out.println("Male: " + Gender.MALE.comment());
        System.out.println("Female: " + Gender.FEMALE.comment());
        System.out.println("Undefined: " + Gender.UNDEFINED.comment());
    }
}
