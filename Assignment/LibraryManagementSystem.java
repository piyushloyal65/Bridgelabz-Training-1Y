abstract class LibraryItem {
    private int itemId;
    private String title;

    public LibraryItem(int itemId, String title) {
        this.itemId = itemId;
        this.title = title;
    }

    abstract int getLoanDuration();
}

interface Reservable {
    void reserveItem();
}

class Book extends LibraryItem implements Reservable {
    public Book(int id, String title) {
        super(id, title);
    }

    int getLoanDuration() {
        return 14;
    }

    public void reserveItem() {
        System.out.println("Book Reserved");
    }
}