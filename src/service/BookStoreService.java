package service;

import enums.Role;
import model.Book;
import model.BookStore;

import java.util.List;

public interface BookStoreService {

    void createBookStore(BookStore  bookStore);


    String updateBookStore(Long id,BookStore bookStore);

    List<Book> addBooksToStore(List<Book>books, String userName);

    Integer getQuantityOfBooksInStore(List<Book>books);




}
