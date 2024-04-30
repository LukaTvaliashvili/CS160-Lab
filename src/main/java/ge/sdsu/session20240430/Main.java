package ge.sdsu.session20240430;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Devils", "Fyodor Dostoevsky"));
        books.add(new Book("Brothers Karamazov", "Fyodor Dostoevsky"));
        books.add(new Book("Crime and Punishment", "Fyodor Dostoevsky"));
        BookService bookService = new BookService(books);
        List<Book> booksByAuthor = bookService.sortByTitleForAuthor("Fyodor Dostoevsky");
        System.out.println(booksByAuthor);

    }
}
