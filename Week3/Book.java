package Week3;

public class Book {
    String title;
    String author;

    double price;
    //Parameterized Constructor
    Book(String title,String author, double price){
         this.title = title;
         this.author = author;
         this.price = price;
    }
    //Non-Parameterized Constructor

    Book(){
        title = "Harry Potter";
        author = "J.K.Rowling";
        price = 500.0;
    }
    void displayBookDetails(){
        System.out.println("Title of the Book::"+title);
        System.out.println("Author of the Book::"+author);
        System.out.println("Price::"+price);

    }

    public static void main(String[] args) {
        Book bk = new Book();
        bk.displayBookDetails();

        Book bkp = new Book("Jungle Book","Rudyard Kipling",550.0);
        bkp.displayBookDetails();

    }
}
