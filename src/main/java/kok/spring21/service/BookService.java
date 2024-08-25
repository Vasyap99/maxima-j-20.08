package kok.spring21.service;

import kok.spring21.repo.*;
import kok.spring21.models.*;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BookService{
    BookRepository bookRepository;

    public void save(Book book){
        bookRepository.save(book);
    }

    public String toString(){
        return bookRepository.toString();
    }
}