package com.mkpitsspringBoot.ProjectEmployee.repositary;

import com.mkpitsspringBoot.ProjectEmployee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
