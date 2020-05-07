package com.springbootsteps.springboot_in_10Steps;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//The uri : http://localhost:8080/books

@RestController    //to mark the class as request handler
public class BooksController {
	
	@GetMapping("/books") //handle get request for that specified uri
	public List<Book> getallbooks(){ 			//method returns a list of Books
		
		List<Book> arraylist=new ArrayList<>();
		arraylist.add(new Book(1,"Bloodline","Sydney Sheldon"));
		arraylist.add(new Book(2,"Body in the Library","Agasta Cristae"));
		arraylist.add(new Book(3,"The Guide","R K Narayan"));
		
		return arraylist; //response body is generated from this handler method , it also converts into a JSON response 
		
		/* if a client is expecting JSON then Dispatcher Servlet will use the MappingJacksonHttpMessageConverter 
		 or MappingJackson2HttpMessageConverter (depending upon whether Jackson 1 or Jackson 2 is available in Classpath) 
		 to convert the response returned  into a JSON string.*/
		
				
		
	}
	
	

}
