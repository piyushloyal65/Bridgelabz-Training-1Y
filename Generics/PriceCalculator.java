import java.util.*;

class Product {
    double price;

    Product(double price) {
        this.price = price;
    }

    double getPrice() {
        return price;
    }
}

class Mobile extends Product {
    Mobile(double price) {
        super(price);
    }
}

public class PriceCalculator {

    public static double calculateTotal(List<? extends Product> items) {
        double total = 0;

        for(Product p : items) {
            total += p.getPrice();
        }

        return total;
    }

    public static void main(String[] args) {
        List<Mobile> list = Arrays.asList(
                new Mobile(20000),
                new Mobile(15000)
        );

        System.out.println(calculateTotal(list));
    }
}