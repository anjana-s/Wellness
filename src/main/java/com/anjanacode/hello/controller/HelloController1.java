package com.anjanacode.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
    
@Controller
public class HelloController1 {
    @GetMapping("/home")
    public String test() 
    {
    return "PatternLimit";
    }
   /*@GetMapping("/home")
   public String patternLimit()
   {
       return "Home";
   }*/
}
    

