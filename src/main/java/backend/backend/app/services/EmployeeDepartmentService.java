package backend.backend.app.services;

import backend.backend.app.models.EmployeeDepartment;
import backend.backend.app.repositories.EmployeeDepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeDepartmentService {

    @Autowired
    private EmployeeDepartmentRepository employeeDepartmentRepository;

    public List<EmployeeDepartment> getAllEmployeeDepartments() {
        return employeeDepartmentRepository.findAll();
    }

    public EmployeeDepartment getEmployeeDepartmentById(int id) {
        return employeeDepartmentRepository.findById(id).orElse(null);
    }

    public EmployeeDepartment saveOrUpdateEmployeeDepartment(EmployeeDepartment employeeDepartment) {
        return employeeDepartmentRepository.save(employeeDepartment);
    }

    public void deleteEmployeeDepartment(int id) {
        employeeDepartmentRepository.deleteById(id);
    }
}