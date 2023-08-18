package com.books.BookReposiratory;

import org.springframework.data.repository.CrudRepository;

import com.books.bean.Books;

public interface Bookreposiratory extends CrudRepository<Books, Integer> {

}
