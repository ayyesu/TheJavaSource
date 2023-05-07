package src.sandbox.datatypes;

import java.util.HashMap;
import java.util.Map;

public class CollectionsDemo {
    public static void main(String[] args) {
        Map<String, Integer> stringMap = new HashMap<String, Integer>();
        stringMap.put("one", 1);
        stringMap.put("two", 2);
        stringMap.put("three", 3);

        for (Map.Entry<String, Integer> entry : stringMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

