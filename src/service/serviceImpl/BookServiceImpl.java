package service.serviceImpl;

import model.Book;
import service.BookService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookServiceImpl implements BookService {
    private final List<Book> book_list = new ArrayList<>();

    @Override
    public List<Book> createBooks(List<Book> books) {
        this.book_list.addAll(books);
        return this.book_list;
    }

    @Override
    public List<Book> getAllBooks() {
        return this.book_list;
    }

    @Override
    public List<Book> getBooksByGenre(String genre) {
        return this.book_list.stream().filter(book -> book.getGenre().name().equals(genre)).toList();
    }

    @Override
    public Book removeBookById(Long id) {
        for (Book book : book_list) {
            if (book.getId().equals(id)){
                book_list.remove(book);
                return book;
            }
        }
        return null;
    }

    @Override
    public List<Book> sortBooksByPriceInDescendingOrder() {
        return book_list.stream().sorted(Comparator.comparing(Book::getPrice).reversed()).toList();
    }

    @Override
    public List<Book> filterBooksByPublishedYear() {
       return this.book_list.stream()
               .filter(book -> LocalDate.now().getYear()-book.getPublishedYear().getYear()<10)
               .toList();

    }
}
