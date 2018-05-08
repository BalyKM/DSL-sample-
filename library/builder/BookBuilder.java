package builder;

import library.Book;

public class BookBuilder {
	
	Book book;
    HentBuilder hB;
	
	public BookBuilder(HentBuilder hB) {
		this.hB = hB;
		this.book = new Book();
	}
	
	public BookBuilder nam(String name) {
		book.setName(name);
		return this;
	}
	
	public HentBuilder author(String author) {
		book.setAuthor(author);
		return hB;
	}
}