package kok.spring21.repo;

import kok.spring21.models.Book;
import java.util.List;

public interface BookRepository{
    void save(Book book);

    List<Book> getAllBooks();

    void delete(int id);

    Book update(Book book);
}