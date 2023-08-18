package com.books.HomeController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.books.BookReposiratory.Bookreposiratory;
import com.books.Service.BooksDaoImpl;
import com.books.bean.Books;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BooksController {

	@Autowired
	BooksDaoImpl bk;
	@Autowired
	Bookreposiratory br;

	public BooksController() {
		System.out.println("in bookcontrolleer CONSTRUCTOR");
	}

	// Add book in DB
	// @RequestMapping(value = "/addbook", method = RequestMethod.GET)

	
	@PostMapping(value = "/addbook")
	public int addbooks( @RequestBody  Books book) {

		bk.addbookinDB(book);

		return book.getBookid();
	}

	// delete book by id in DB
	@DeleteMapping(value = "/deletebook/{bookid}")
	public void deletebook(@PathVariable("bookid") int bookid) {

		bk.deltebookinDB(bookid);

	}

	// update book
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping(value = "/updatebooks")
	public void updatebook( @RequestBody Books book) {

		bk.updatebookinDB(book);
	}

	// display all bookss
	@GetMapping(value = "/showallbooks")
	public List<Books> showbook() {

		return bk.getAllBooks();

	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value="/book/{bookid}")
	public Books getbookByID(@PathVariable ("bookid") int bookid) {
		
	
		return br.findById(bookid).get();
		
	}

}
