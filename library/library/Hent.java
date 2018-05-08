package library;

import java.util.ArrayList;
import java.util.List;

public class Hent {
	private List<Book>books;
	private List<Person>persons;
	
	public Hent () {
		books = new ArrayList<>();
		persons = new ArrayList<>();
	}
	public void addBook(final Book book) {
		getBooks().add(book);
	}
	public void addPerson(final Person person) {
		getPersons().add(person);
	}
	public List<Person> getPersons(){
		return persons;
	}
	public List<Book> getBooks(){
		return books;
	}
	public static void printHent(Hent h) {
		System.out.println("aluguel: ");
		System.out.println("alugado por: ");
		for (Person p: h.getPersons()) {
			System.out.println(p);
		}
		System.out.println("nome do livro: ");
		for (Book b : h.getBooks()) {
			System.out.println(b);
		}
		
	}
}
