package kok.spring21.service;

import kok.spring21.repo.*;
import kok.spring21.models.*;
import lombok.AllArgsConstructor;

import java.util.List;


@AllArgsConstructor
public class BookService{
    BookRepository bookRepository;

    public void save(Book book){
        bookRepository.save(book);
    }

    public List<Book> getBooks() {
        return bookRepository.getAllBooks();
    }

    public Book getBookById(int id) {
        return bookRepository.findById(id);
    }

    public void deleteBook(int id) {
        bookRepository.delete(id);
    }

    public Book updateBook(Book book) {
       return bookRepository.update(book);
    }

    public String toString(){
        return bookRepository.toString();
    }
}