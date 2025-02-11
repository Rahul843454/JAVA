public class C51Book {

    static  int totalNoOfBooks;

    String title;
    String author;
    int isbn;
    boolean isBorrowed;

    static{
        totalNoOfBooks = 0;
    }

    {
        totalNoOfBooks++;
    }

    C51Book(int isbn, String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    C51Book(int isbn){
        this(isbn, "unknown", "unknown");
    }


    static void getTotalNoOfBooks(){
        System.out.println(totalNoOfBooks);
    }

    void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already borrowed");
        } else{
            this.isBorrowed = true;
            System.out.println("Enjoy the Book");
        }
    }

    void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Successfully Returned, hope you Enjoyed Book!!!!");
        }else{
            System.out.println("Book is already in Library");
        }
    }

    public static void main(String[] args) {
        C51Book b1 = new C51Book(1, "book1", "sahil");
        C51Book b2 = new C51Book(2);
        C51Book b3 = new C51Book(3);
        getTotalNoOfBooks();
        b1.borrowBook();
        b1.borrowBook();
        b2.returnBook();
        b3.returnBook();

    }
}
