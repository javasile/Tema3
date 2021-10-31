package exceptions.task2;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) throws NoBookFoundException{

    BookRepository bookRepository = new BookRepository();
    bookRepository.add(new Book("Ion", "I.S.", 1965));
    bookRepository.add(new Book("Harry Potter part2", "J.K. Rowling", 2006));
    List<Book>book = bookRepository.findByName("Ion");
    Book book1 = bookRepository.findByyearOfRelease(200);
    bookRepository.delete(2006);

    }
}
class NoBookFoundException extends Exception{
    public NoBookFoundException(String message){
        super(message);
    }
}
class BookRepository{
private List<Book> books = new ArrayList<>();
public void add(Book book){
    this.books.add(book);
}
public void delete(int yearOfRelease) throws NoBookFoundException{
    for (Book book: books){
        if (book.getId()==yearOfRelease){
            books.remove(book);
            return;
        }
    }
    throw new NoBookFoundException("Can't delete the book with yearOfRelease: " + yearOfRelease);
}
public Book findByyearOfRelease (int yearOfRelease) throws  NoBookFoundException{
    for (Book book : books){
        if (book.getId()==yearOfRelease){
            return book;
        }
    }
    throw new NoBookFoundException("Can't find the book with yearOfRelease: " +yearOfRelease);
}
public List<Book> findByName(String name) throws NoBookFoundException{

    List<Book> booksByName = new ArrayList<>();
    for (Book book : books){
        if (book.getTitle().equals(name)){
            booksByName.add(book);
        }
    }
    if (booksByName.isEmpty()){
        throw new NoBookFoundException("Can't find book with name: " + name);
    }
    return booksByName;
}
}

class Book{


    private String title;
    private String author;
    private int id;

    public Book(String title, String author, int yearOfRelease) {

        this.title = title;
        this.author = author;
        this.id = yearOfRelease;
    }


    public String getTitle() {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Book{" +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfRelease=" + id +
                '}';
    }
}
