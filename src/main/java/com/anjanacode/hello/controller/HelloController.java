package com.anjanacode.hello.controller;

import org.springframework.web.bind.annotation.RestController;
import com.anjanacode.hello.bean.Employee;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class HelloController {
      
      //  @Autowired
        //private PatterFormation pf;
  
   @RequestMapping("/hello")
    public String hello()
    {  Employee emp=new Employee();
        emp.setName("Anjana");
        emp.setAge(10);
        return "Name:"+emp.getName()+" Age:"+emp.getAge();
    }
  @RequestMapping("/myemp")
    public String emp()
    { 
       List<Employee> employees = new ArrayList<>();

        // Add employees using constructor
        employees.add(new Employee("Alice", 25));
        employees.add(new Employee("Bob", 30));
        employees.add(new Employee("Charlie", 28));
        StringBuilder result = new StringBuilder("Employee List:\n");
        // Print employee names and ages using getters
        
        for (Employee e : employees) {
            System.out.println(e.getName() + " - Age: " + e.getAge());
              result.append(e.getName()).append(" - Age: ").append(e.getAge()).append("\n");
        }
        return result.toString();
    }
   /*  @RequestMapping("/patt")
    public String pattern() throws IOException
    {  
       String res=pf.PatterFormation(int num)
        return res.toString();
    } */

}
