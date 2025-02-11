package Challenge80;

public class TestLibraryItem {
    public static void main(String[] args) {
        Book b1 = new Book();
        Magazine m1 = new Magazine();
        DVD d1 = new DVD();

        d1.checkout();
        d1.returnItem();

        b1.checkout();
        b1.returnItem();

        m1.checkout();
        m1.returnItem();
    }
}
