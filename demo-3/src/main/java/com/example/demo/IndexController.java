package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
//http://localhost:8080/mu
	@Autowired
	  StudentDB studentDB;
	
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
	//  System.out.println(  stud.getRollNo()); 
	//  System.out.println(stud.getStudentName());
	  ModelAndView mv = new ModelAndView(); 
	  studentDB.save(stud);
	  mv.addObject("studentDetails", stud);
	  mv.setViewName("added.jsp");
	  return mv; 
	  }
	@RequestMapping("deleteStudent")
	  public ModelAndView delete(Student stud)
	  {
//	    v.checkPassword(stud.getStudentName());
	  System.out.println(  " ** * " + stud.getRollNo()); 
	  System.out.println(stud.getStudentName());
	  ModelAndView mv = new ModelAndView(); 
	  
	  studentDB.deleteById(stud.getRollNo());
	  mv.addObject("studentDetails", stud);
	  mv.setViewName("deleted.jsp");
	  return mv; 
	  }
	
	
	@GetMapping("updateStudent")
	  public ModelAndView update(Student stud)
	  {
	  ModelAndView mv = new ModelAndView(); 
	  studentDB.updateStudent(stud.getStudentName(), stud.getRollNo());
	  mv.addObject("studentDetails", stud);
	  mv.setViewName("updated.jsp");
	  return mv; 
	  }
	
	
	@GetMapping("viewStudent")
	  public ModelAndView display(Student stud)
	  {
	  Optional<Student> op = studentDB.findById(stud.getRollNo());
	  Student student  =     op.get();
	  
	  ModelAndView mv = new ModelAndView(); 
	  mv.addObject("studentDetails", student);
	  mv.setViewName("display.jsp");
	  return mv; 
	    
	  }
	
	
	
	
	}