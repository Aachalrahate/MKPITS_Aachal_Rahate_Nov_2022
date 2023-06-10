package com.mkpitsspringBoot.ProjectEmployee.service;

import com.mkpitsspringBoot.ProjectEmployee.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmployeeService {
    List<Employee> getAllEmployees();
void saveEmployee(Employee employee);
Employee getEmployeeById(long id);
void deleteEmployeeById(long id);
}
