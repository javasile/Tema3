package collections.Task2;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        Author author1 = new Author("John", "Smith", 'M');
        Author author2 = new Author("Jessica", "Albana", 'F');
        Author author3 = new Author("Roger", "Moore", 'M');
        Author author4 = new Author("Catherin", "Nadie", 'F');

        Book1 book1 = new Book1("Book 1", 34, 2000, Arrays.asList(author1), Genre.FANTESY);
        Book1 book2 = new Book1("Book 1", 56, 1999,
                Arrays.asList(author2, author3, author4), Genre.ACTION);
        BookService bookService = new BookService();
        bookService.add(book1);
        bookService.add(book2);
        System.out.println(bookService.findByAuthor(author2));
        System.out.println(bookService.getAll());
        System.out.println(bookService.findMostExpensiveBook());
        System.out.println(bookService.sortByTitleAsc());
        System.out.println(bookService.sortByTitleDsc());

    }
}

class Book1 implements Comparable<Book1>{

    private String title;
    private float price;
    private int yearOfRelease;
    private List<Author> authors;
    private Genre genre;

    public Book1(String title, float price, int yearOfRelease, List<Author> authors, Genre genre) {
        this.title = title;
        this.price = price;
        this.yearOfRelease = yearOfRelease;
        this.authors = authors;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book1 book = (Book1) o;
        return Float.compare(book.price, price) == 0 &&
                yearOfRelease == book.yearOfRelease &&
                Objects.equals(title, book.title) &&
                Objects.equals(authors, book.authors) &&
                genre == book.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, yearOfRelease, authors, genre);
    }

    @Override
    public int compareTo(Book1 o) {
        return o.getTitle().compareTo(title);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", yearOfRelease=" + yearOfRelease +
                ", authors=" + authors +
                ", genre=" + genre +
                '}';
    }
}

public class Author{
    private String name;
    private String lastName;
    private char gender;

    public Author(String name, String lastName, char gender) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass() ) return  false;
        Author author = (Author) o;
        return gender == author.gender && Objects.equals(name, author.name) && Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, gender);
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                '}';
    }
}
public enum Genre{
    ACTION, FANTESY, CRIME;

}
class BookService{
    private List<Book1> books = new ArrayList<>();

    public void add(Book1 book){
        books.add(book);
    }
    public void remove(Book1 book){
        books.remove(book);
    }
    public List<Book1> getAll(){
        return books;
    }
    public List<Book1> findByGenre(Genre genre){
        List<Book1>results = new ArrayList<>();
        for (Book1 book : books){
            if (book.getGenre() == genre){
                results.add(book);
            }
        }
        return results;
    }
    public List<Book1> findByYear (int yearOfRelease){
        List<Book1>result = new ArrayList<>();
        for (Book1 book : books){
            if (book.getYearOfRelease() < yearOfRelease){
                result.add(book);
            }
        }
        return result;
    }
    public Book1 findMostExpensiveBook(){
        Book1 result = null;
        for (Book1 book : books){
            if (result == null || result.getPrice() < book.getPrice()){
                result = book;
            }
        }
        return result;
    }
    public Book1 findChepestBook(){
        Book1 result = null;
        for (Book1 book :books){
            if (result == null || result.getPrice() > book.getPrice()){
                result = book;
            }
        }
        return result;
    }
    public List<Book1> findByNumberOfAuthors(int numberOfAuthors){
        List<Book1> results = new ArrayList<>();
        for (Book1 book : books){
            if (book.getAuthors().size() == numberOfAuthors){
                results.add(book);
            }
        }
        return results;
    }
    public List<Book1> sortByTitleAsc(){
        Collections.sort(books);
        return books;
    }
    public List<Book1> sortByTitleDsc(){
        Collections.reverse(books);
        return books;
    }
    public boolean isBookInRepo(Book1 book){
        return books.contains(book);
    }
    public List<Book1> findByAuthor(Author author){
        List<Book1> results = new ArrayList<>();
        for (Book1 book : books){
            if (book.getAuthors(). contains(author)){
                results.add(book);
            }
        }
        return results;
    }

}

