package ge.sdsu.session20240430;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class BookService {

    private List<Book> books;

    public BookService(List<Book> books){
        this.books = books;
    }

    public List<Book> sortByTitleForAuthor(String author){
        List<Book> booksByAuthor = new LinkedList<>();
        for (Book book: books){
            if (book.getAuthor().equals(author)){
                booksByAuthor.add(book);
            }
        }
        Comparator<Book> comparator = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        };

        Comparator<Book> comparatorWithLambda =
                (Book b1, Book b2) -> b1.getTitle().compareTo(b2.getTitle());

//        Collections.sort(booksByAuthor, Comparator.comparing(Book::getTitle));
//        Collections.sort(booksByAuthor, comparatorWithLambda);
        Collections.sort(booksByAuthor);
        return booksByAuthor;
    }

}
