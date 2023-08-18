package com.books.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.books.BookReposiratory.Bookreposiratory;
import com.books.bean.Books;

@Component
public class BooksDaoImpl implements BooksDao {

	@Autowired
	Bookreposiratory br;



	@Override
	public void addbookinDB(Books book) {

		System.out.println(br.save(book));

	}

	@Override
	public void deltebookinDB(int bookid) {

		br.deleteById(bookid);
		System.out.println("Book deleted of id number == " + bookid);

	}

	@Override
	public void updatebookinDB(Books book) {
		// TODO Auto-generated method stub
		System.out.println(br.save(book));
	}

	@Override
	public List<Books> getAllBooks() {
		// TODO Auto-generated method stub

		List<Books> books = (List<Books>) br.findAll();

		ListIterator<Books> itr = books.listIterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());

		}

		return books;
	}

}
