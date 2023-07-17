package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
//http://localhost:8080/mu
	
	
	@RequestMapping("mu")
//	  public ModelAndView index(@RequestParam("name") String st)
	public ModelAndView index()
	  {
	    ModelAndView mv = new ModelAndView(); 
//	    mv.addObject("username", st);
	    mv.setViewName("Mukilan.jsp");
	    return mv; 
//	    System.out.println("*** "+ st + " *** ");
//	    return "mukilan.jsp";
	  }
	@RequestMapping("addStudent")
	  public ModelAndView add(Student stud)
	  {
	  System.out.println(  stud.getRollNo()); 
	  System.out.println(stud.getStudentName());
	  ModelAndView mv = new ModelAndView(); 
	  mv.addObject("studentDetails", stud);
	  mv.setViewName("added.jsp");
	  return mv; 
	  }
	
	}
