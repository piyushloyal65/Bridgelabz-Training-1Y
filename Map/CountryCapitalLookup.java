import java.util.*;

public class CountryCapitalLookup {
    public static void main(String[] args) {
        Map<String, String> capitals = new TreeMap<>();

        capitals.put("India", "New Delhi");
        capitals.put("Japan", "Tokyo");

        System.out.println(capitals.get("India"));

        for(Map.Entry<String, String> entry : capitals.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}