package Week5;

import java.util.Scanner;

public class Library {
    public class Book{
        String title;
        String author;

        double price;

        Book(String title,String author,double price){
            this.title =title;
            this.author = author;
            this.price = price;
        }

        void displayBookDetails(){
            System.out.println("DISPLAY BOOK DETAILS");
            System.out.println("********************");
            System.out.println("TITLE::"+title);
            System.out.println("AUTHOR::"+author);
            System.out.println("PRICE::"+price);

        }
    }
    void addBook(){
        Scanner input = new Scanner(System.in);
        System.out.println("TITLE OF THE BOOK::");
        String atitle = input.nextLine();
        System.out.println("AUTHOR OF THE BOOK::");
        String aAuthor = input.nextLine();
        System.out.println("PRICE OF THE BOOK::");
        double price = input.nextDouble();

        Book book = new Book(atitle,aAuthor,price);
        book.displayBookDetails();
    }

    public static void main(String[] args) {
        Library user1 = new Library();
        user1.addBook();

        Library user2 = new Library();
        user2.addBook();

    }
}
