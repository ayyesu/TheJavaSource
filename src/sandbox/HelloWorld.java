package src.sandbox;

import java.util.List;
import java.util.function.Consumer;

public class HelloWorld {
    public static void main(String[] args){
//        List<String> items = List.of("1", "a", "b", "a", "a", "c");
//        items.forEach(item -> {
//            if (item.equals("a")){
//                System.out.println("A");
//            }else {
//                System.out.println("Not A");
//            }
//        });

        List<String> items = List.of("a", "b", "1", "a", "a");
        items.forEach(new Consumer<String>() {
            @Override
            public void accept(String item) {
                if (item.equals("a")){
                    System.out.println("A");
                }else{
                    System.out.println("Not A");
                }
            }
        });
    }
}
