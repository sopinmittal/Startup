package com.tutorialspoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

@Controller
@RequestMapping("/helloController")
public class HelloController{
 
   @RequestMapping(value="/hello", method = RequestMethod.GET)
   public String printHello(ModelMap model) {
      model.addAttribute("message", "Hello Spring MVC Framework!");

      return "hello";
   }

   @RequestMapping(value="/hi", method = RequestMethod.GET)
   public String print(ModelMap model) {
      model.addAttribute("message", "Hi Spring MVC Framework!");

      return "hello";
   }
}


