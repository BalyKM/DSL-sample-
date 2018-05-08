package builder;

import library.Hent;

public class HentBuilder {
	private Hent hent;
	
	public HentBuilder() {
		hent = new Hent();
	}
	public static HentBuilder Hent() {
		return new HentBuilder();
	}
	
	public PersonBuilder person() {
		PersonBuilder person = new PersonBuilder(this);
		getHent().addPerson(person.person);
		return person;
	}
	
	public BookBuilder book() {
		BookBuilder book = new BookBuilder(this);
		getHent().addBook(book.book);
		return book;
	}

	
	public Hent getHent() {
		return hent;
	}
	
	public void printHent() {
		Hent.printHent(hent);
	}
	public HentBuilder nome(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

