package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
// http://localhost:8080/lms
	@Autowired
	BookDB bookdb;//object creation without  new keyword its called bean.
	@GetMapping("lms")
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		return mv;
		
	}
	@GetMapping( "AddBook")
  
	public ModelAndView addindex() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addindex.jsp");
		return mv;
	}
	@GetMapping( "AddBookDetails")
		  public ModelAndView add(Book bk)
	  {
	  ModelAndView mv = new ModelAndView(); 
	  bookdb.save(bk);                 
	  mv.addObject("Books", bk);
	  mv.setViewName("added.jsp");
	  return mv; 
	  }
	//update
	@GetMapping( "UpdateBook")
	  
	public ModelAndView updateindex() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("updateindex.jsp");
		return mv;
	}
	@GetMapping( "UpdateBookDetails")
		  public ModelAndView update(Book bk)
	  {
	  ModelAndView mv = new ModelAndView(); 
//	  bookdb.updateBook(bk.getAname(),bk.getIsbn()); 
	 bookdb.save(bk); 
	  mv.addObject("Books", bk);
	  mv.setViewName("updated.jsp");
	  return mv; 
	  }
	
	  

	//get
	@GetMapping( "GetBook")
	  
	public ModelAndView Getindex() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("getindex.jsp");
		return mv;
	}
	@GetMapping( "GetBookDetails")
		  public ModelAndView get(Book bk)
	  {
	  ModelAndView mv = new ModelAndView(); 
	   Optional<Book> op = bookdb.findById(bk.getIsbn());
	  Book bks  =     op.get();                
	  mv.addObject("Books", bks);
	  mv.setViewName("viewed.jsp");
	  return mv; 
	  }
//delete
	@GetMapping( "DeleteBook")
	  
	public ModelAndView deleteindex() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("deleteindex.jsp");
		return mv;
	}
	@GetMapping( "DeleteBookDetails")
		  public ModelAndView delete(Book bk)
	  {
	  ModelAndView mv = new ModelAndView(); 
	  bookdb.delete(bk);               
	  mv.addObject("Books", bk);
	  mv.setViewName("deleted.jsp");
	  return mv; 
	  }

		

	
}