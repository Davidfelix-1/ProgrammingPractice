package ProgrammingPractice;

import java.util.ArrayList;

public class Book {

    private String title;
    private String author;
    private String ISBN;
    private static ArrayList < Book > bookCollection = new ArrayList < Book >();
    public Book(String title, String author, String ISBN) {
        this.ISBN= ISBN;
        this.title = title;
        this.author = author;
    }
    public Book(){

    }
    public  String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public static void addBook(Book book){
        bookCollection.add(book);
    }
    public static void removeBook(Book book){
        bookCollection.remove(book);
    }

    public static ArrayList<Book> getBookCollection() {
        return bookCollection;
    }

    public static void main(String[] args) {

        Book book1 = new Book("legend of perfidy", "solomon payne","9467339182");
        Book book2 = new Book("intro to python ", "van guido","7643889111");

        Book.addBook(book1);
        Book.addBook(book2);

        ArrayList <Book> bookCollection = Book.getBookCollection();
        System.out.println("List of Book ");
        for(Book book:bookCollection){
            System.out.println(book.getTitle()+ " by " +book.getAuthor() + " ISBN "+ book.getISBN());
        }
        Book.removeBook(book1);
        System.out.println("\n After removing a book"+book1.getTitle()+":");
        System.out.println("List of Book");
        for (Book book : bookCollection) {
            System.out.println(book.getTitle()+ " by " +book.getAuthor() + " ISBN "+ book.getISBN());

        }

    }
}
