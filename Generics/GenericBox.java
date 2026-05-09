class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

public class GenericBox {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>();
        b1.set(10);

        Box<String> b2 = new Box<>();
        b2.set("Hello");

        System.out.println(b1.get());
        System.out.println(b2.get());
    }
}