package Week4;

class Book{
    String title;
    String author;
    double price;


    Book(String title,String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void displayDetails(){
        System.out.println("Author::"+author+"<<>>"+"Title::"+title+"<<>>"+"Price::"+price);
    }

}

class TextBook extends Book{

    private int noOfPages;
    TextBook(String title,String author,double price, int noOfPages){
        super(title,author,price);
        this.noOfPages = noOfPages;
    }
    @Override
    void displayDetails(){
        System.out.println("Author::"+author+"<<>> Title::"+title+"<<>> Price::"+price+"<<>> Pages:"+noOfPages);
    }

}

class Magazine extends Book{
    private int noOfPages ;

    Magazine(String title,String author, double price, int noOfPages){
        super(title,author,price);
        this.noOfPages = noOfPages;

    }
    @Override
    void displayDetails(){
        System.out.println("Author::"+author+"<<>> Title::"+title+"<<>> Price::"+price+"<<>> Pages:"+noOfPages);
    }
}

class LibraryDemo{
    public static void main(String[] args) {
        Book textBook = new TextBook("The Midnight Library","Matt Haig",200.0,150);
        textBook.displayDetails();

        Book magazine = new Magazine("The Power of Consistently","Long Weldon",250.0,200);
        magazine.displayDetails();

    }
}