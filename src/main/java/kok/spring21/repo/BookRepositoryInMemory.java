package kok.spring21.repo;

import kok.spring21.models.Book;

import java.util.Set;
import java.util.HashSet;

public class BookRepositoryInMemory implements BookRepository{
    Set<Book> s=new HashSet<Book>(); 

    @Override
    public void save(Book book){
        s.add(book);
    }
}