package com.mkpitsspringBoot.ProjectEmployee.controller;

import com.mkpitsspringBoot.ProjectEmployee.model.Employee;
import com.mkpitsspringBoot.ProjectEmployee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    //dispay list of employees
@GetMapping("/")
    public String viewHomePage(Model model){
model.addAttribute("listEmployees",employeeService.getAllEmployees());
return "index";
    }
    @GetMapping("/showNewEmployeeForm")
    public String showNewEmployeeForm(Model model){
        Employee employee = new Employee();
    model.addAttribute("employee",employee);
    return "new_employee";
    }
    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
    employeeService.saveEmployee(employee);
    return "redirect:/";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable (value = "id")long id ,Model model){
    Employee employee = employeeService.getEmployeeById(id);
    model.addAttribute("employee", employee);
    return "update_employee";
    }
    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable (value = "id")long id){

    //call delete employee method
     this.employeeService.deleteEmployeeById(id);
        return "redirect:/";

    }
}
