package backend.backend.app.controllers;

import backend.backend.app.models.Employee;
import backend.backend.app.request.LoginRequest;
import backend.backend.app.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }
    @PostMapping("/test")
    public void ConsoleMessage(){
        System.out.println("Une requête API a été reçue.");
    }
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.saveOrUpdateEmployee(employee);
    }
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
        Employee existingEmployee = employeeService.getEmployeeById(id);
        if (existingEmployee != null) {
            existingEmployee.setEmployeeName(employee.getEmployeeName());
            existingEmployee.setEmployeeEmail(employee.getEmployeeEmail());
            existingEmployee.setEmployeePhone(employee.getEmployeePhone());
            existingEmployee.setEmployeeRole(employee.getEmployeeRole());
            existingEmployee.setEmployeeStatus(employee.getEmployeeStatus());
            existingEmployee.setEmployeeHireDate(employee.getEmployeeHireDate());
            return employeeService.saveOrUpdateEmployee(existingEmployee);
        } else {
            return null;
        }
    }
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable int id) {
        employeeService.deleteEmployee(id);
    }
}
