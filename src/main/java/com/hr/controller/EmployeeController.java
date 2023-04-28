package com.hr.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hr.model.Employees;
import com.hr.service.EmployeesService;
import org.hibernate.query.criteria.JpaCriteriaUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeesService employeesService;
    @GetMapping("/getAllEmp")
    public List<Employees> getAllEmployee() {
       return employeesService.getAllEmployees();
    }
    @GetMapping("/getById")
    public Employees getSpecific(@RequestParam long id){
        return employeesService.getSpecific(id);
    }
    @GetMapping("/getByFirstName")
    public List<Employees>getEmpByFirstName(@RequestParam String firstName){
        return employeesService.getEmpByFirstName(firstName);
    }
    @PostMapping("/addEmp")
    public String addEmp(@RequestBody Employees employee){
        employeesService.addEmp(employee);
        return "Success";
    }
    @PutMapping("/updataEmp")
    public String upDataEmp(@RequestBody Employees employee){
        employeesService.upDataEmp(employee);
        return "Success";
    }
    @DeleteMapping("/deleteEmp")
    public String deleteEmp(@RequestParam long id){
        employeesService.deleteEmp(id);
        return "deleted Successfully";
    }
}
