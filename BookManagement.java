class BookManagement {
    private String title;
    private String author;
    private double price;

     public BookManagement(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
 void displayBookdetails(){
         System.out.println("********* BOOK MANAGEMENT  ***********");
         System.out.println("Book title is:"+title);
         System.out.println("Book author  is :"+author);
         System.out.println("Book price is :"+price);
 }
    public static void main(String[] args){
        BookManagement BM = new BookManagement("C programing", "Mohan", 566.0);
        BookManagement BM1 = new BookManagement("Java Notes", "Ansh", 665.0);
        BookManagement BM2 = new BookManagement("Python", "Ram", 543);
        BM.displayBookdetails();
        BM1.displayBookdetails();
        BM2.displayBookdetails();
    }
}
