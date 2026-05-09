import java.util.*;

public class InventoryManagement {
    public static void main(String[] args) {
        Map<String, Integer> stock = new HashMap<>();

        stock.put("Laptop", 10);
        stock.put("Mouse", 5);

        stock.put("Laptop", stock.get("Laptop") - 2);

        stock.put("Mouse", stock.get("Mouse") + 10);

        System.out.println(stock);
    }
}