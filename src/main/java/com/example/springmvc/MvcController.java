package com.example.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MvcController {

  @GetMapping("/greeting")
  public String greeting(@RequestParam(name="name", required = false, defaultValue = "World") String name, Model model){
    model.addAttribute("name", name);
    return  "greeting";
  }

  @GetMapping("/employee")
  public String employeeData(Model model){
    model.addAttribute("employee", new Employee());
    return "employee";
  }

  @PostMapping("/employee")
  public String collectEmployeeData(@ModelAttribute Employee employee, Model model){
    model.addAttribute("employee", employee);
    return "result";
  }

}
