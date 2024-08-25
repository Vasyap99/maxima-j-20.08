package kok.spring21.repo;

import kok.spring21.models.Book;


public interface BookRepository{
    void save(Book book);
}