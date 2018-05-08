package builder;

import library.Person;

public class PersonBuilder {
	
	Person person;
	HentBuilder hB;
	
	public PersonBuilder(HentBuilder hB) {
		this.hB = hB;
		this.person = new Person();
	}
	
	public PersonBuilder nome(String name) {
		person.setNome(name);
		return this;
	}
	
	public HentBuilder cpf(String cpf) {
		person.setCpf(cpf);
		return hB;
	}
}