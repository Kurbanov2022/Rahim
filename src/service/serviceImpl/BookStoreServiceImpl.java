package service.serviceImpl;

import model.Book;
import model.BookStore;
import service.BookStoreService;

import java.util.ArrayList;
import java.util.List;

public class BookStoreServiceImpl implements BookStoreService {
    private final List<BookStore> bookStores = new ArrayList<>();

    @Override
    public void createBookStore(BookStore bookStore) {
        this.bookStores.add(bookStore);
    }

    @Override
    public String updateBookStore(Long id, BookStore bookStore) {
        for (BookStore store : bookStores) {
            if (store.getId().equals(id)){
                store.setId(bookStore.getId());
                store.setName(bookStore.getName());
                store.setAddress(bookStore.getAddress());
                
            }
        }
        return null;
    }

    @Override
    public List<Book> addBooksToStore(List<Book> books, String userName) {
        return null;
    }


    @Override
    public Integer getQuantityOfBooksInStore(List<Book> books) {
        return null;
    }
}
