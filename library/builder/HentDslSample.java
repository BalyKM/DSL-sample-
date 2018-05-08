package builder;

import static builder.BookBuilder.*;
import static builder.PersonBuilder.*;
import static builder.HentBuilder.*;
import library.Hent.*;
import library.Person.*;
import library.Book.*;
import java.util.Scanner;

public class HentDslSample {
	 
	public static void main(String[]args) {
		Hent()
		  .person()
		  	.nome("Kelvin")
		  	.cpf("7897978")
		  .book()
		    .nam("the paradox")
		    .author("K.M.V")
		   .printHent();
		
		Hent()
		  .person()
		  	.nome("Kelvin")
		  	.cpf("87678586")
		  .book()
		    .nam("the paradox")
		    .author("K.M.V")
		   .printHent();
		    
		  
	}
	
}
