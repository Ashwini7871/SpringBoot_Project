package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
//http://localhost:8080/api_demo
	@GetMapping("api_demo")
	  public ResponseEntity<Book> display(@RequestBody Book book)
	  {
		System.out.println(book.getAuthorName());
		System.out.println(book.getPages());
		if(book.getPages()>=100)
	    return new ResponseEntity("book lend",HttpStatus.ACCEPTED);
		else
	    return new ResponseEntity<Book>(HttpStatus.NOT_FOUND);
  }
}
