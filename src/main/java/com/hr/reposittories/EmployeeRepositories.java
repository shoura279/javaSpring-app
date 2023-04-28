package com.hr.reposittories;

import com.hr.model.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepositories extends JpaRepository<Employees,Long> {
    public List<Employees>findByFirstName(String firstName);

}
