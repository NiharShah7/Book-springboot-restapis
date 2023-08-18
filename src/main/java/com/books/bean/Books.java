package com.books.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Book_Details")
public class Books {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookid;
	private String bookname;
	private int bookprice;
	private String bookauthor;

	public Books(int bookid, String bookname, int bookprice, String bookauthor) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.bookprice = bookprice;
		this.bookauthor = bookauthor;
	}

	public Books() {
		super();
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public int getBookprice() {
		return bookprice;
	}

	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}

	public String getBookauthor() {
		return bookauthor;
	}

	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}

	@Override
	public String toString() {
		return "Books [bookid=" + bookid + ", bookname=" + bookname + ", bookprice=" + bookprice + ", bookauthor="
				+ bookauthor + "]";
	}

}
