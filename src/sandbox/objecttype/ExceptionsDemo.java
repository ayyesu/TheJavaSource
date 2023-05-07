package src.sandbox.objecttype;

public class ExceptionsDemo {
    public static int rec(int i){
        return rec(i*i);
    }

    public static void main(String[] args){
        //Bad code -> Never catch a throwable!!!
//        try {
//            ExceptionsDemo.rec(2);
//        } catch (Throwable r){
//            System.out.println("An Error occurred");
//        }

        /*
        * StackOverFlowError is a subclass of Error, and is caused by the defective recursive
        * method that was called. Sure, we could modify the code, treat this exceptional situation,
        * and execute whatever has to be executed next.
        *
        */

        // Smart Developers do this!!

        try{
//            Performer p = PerformerGenerator.get("Daniel");
//            System.out.println("TTL: " + p.getTimeToLive());
        }catch (Exception e){
            System.out.println("Cannot use an empty performer...");
        }finally {
            System.out.println("Everything worked as expected");
        }

    }
}
