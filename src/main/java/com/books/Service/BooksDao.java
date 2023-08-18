package com.books.Service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.books.bean.Books;

public interface BooksDao {

	public void addbookinDB(Books book);
	public void deltebookinDB(int bookid);
	
	public void updatebookinDB(Books book);
	
	public List<Books> getAllBooks();
}
