package com.hr.service;

import com.hr.model.Employees;
import com.hr.reposittories.EmployeeRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class EmployeesService {
    @Autowired
    private EmployeeRepositories employeeRepositories;
    public List<Employees> getAllEmployees(){
       return employeeRepositories.findAll();
    }

    public Employees getSpecific(long id){
        return employeeRepositories.findById(id).orElseThrow(null);
    }
    public List<Employees>getEmpByFirstName(String firstName){
        return employeeRepositories.findByFirstName(firstName);
    }
    public void addEmp(Employees employee){
        employeeRepositories.save(employee);
    }
    public void upDataEmp(Employees employee){
        employeeRepositories.save(employee);
    }
    public void deleteEmp(long id){
        employeeRepositories.deleteById(id);
    }
}
