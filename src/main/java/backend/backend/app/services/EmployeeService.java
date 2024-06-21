package backend.backend.app.services;

import backend.backend.app.models.Department;
import backend.backend.app.models.DepartmentHead;
import backend.backend.app.models.Employee;
import backend.backend.app.models.HRDepartmentHead;
import backend.backend.app.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee saveOrUpdateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }
    public boolean isHRDepartmentHead(Employee employee) {
        Department hrDepartment = DepartmentService.getDepartmentByName("RH");
        return hrDepartment != null && hrDepartment.getDepartmentHead() instanceof HRDepartmentHead && hrDepartment.getDepartmentHead().getEmployeeID() == employee.getEmployeeID();
    }
    public boolean canManageEmployee(Employee manager, Employee employee) {
        return isHRDepartmentHead(manager) || (manager instanceof DepartmentHead && ((DepartmentHead) manager).getDepartment().getDepartmentID() == employee.getDepartment().getDepartmentID());
    }
}
