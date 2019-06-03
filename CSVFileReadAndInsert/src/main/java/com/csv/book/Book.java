package com.csv.book;

public class Book {
	
	private Integer bookId;
	private String bookName;
	private String authorName;
	
	public Book(Integer bookId, String bookName, String authorName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName + "]";
	}
	
	
	

}
