package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EBController {
@RequestMapping("EBC")
public ModelAndView index()
{
  ModelAndView mv = new ModelAndView(); 
  mv.setViewName("Ebcalc.jsp");
  return mv;  

}
@RequestMapping("uc")
public ModelAndView add(EB_Unit test)
{
System.out.println(test.getUnit()); 
ModelAndView mv = new ModelAndView(); 
mv.addObject("uc", test);
mv.setViewName("calc.jsp");
return mv; 
}
	
}
