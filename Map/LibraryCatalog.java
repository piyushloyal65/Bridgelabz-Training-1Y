import java.util.*;

public class LibraryCatalog {
    public static void main(String[] args) {
        Map<String, String> books = new TreeMap<>();

        books.put("101", "Java");
        books.put("102", "Python");

        System.out.println(books.get("101"));

        books.remove("102");

        System.out.println(books);
    }
}