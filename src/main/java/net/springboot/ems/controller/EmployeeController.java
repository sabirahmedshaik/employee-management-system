package net.springboot.ems.controller;

import lombok.AllArgsConstructor;
import net.springboot.ems.dto.EmployeeDto;
import net.springboot.ems.entity.Employee;
import net.springboot.ems.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    // Build Add Employee REST API
    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto savedEmployee = employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    //Build Get Employee REST API
    @GetMapping("{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable("id") Long employeeId){
        EmployeeDto getEmployee = employeeService.getEmployeeById(employeeId);
        return ResponseEntity.ok(getEmployee);
    }

    //Build Get All Employees REST API
    @GetMapping
    public ResponseEntity<List<EmployeeDto>> getAllEmployees(){
        List<EmployeeDto> employees = employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }
}
