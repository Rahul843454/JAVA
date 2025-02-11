package Challenge80;

class LibraryItem {
    @SuppressWarnings("unused")
    private int itemId;
    @SuppressWarnings("unused")
    private String title;
    @SuppressWarnings("unused")
    private String author;


    public void checkout(){
        System.out.println("Checkout done");
    }

    public void returnItem(){
        System.out.println("Returned successfully");
    }

   
}
