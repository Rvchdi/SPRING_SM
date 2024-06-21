package backend.backend.app.services;

import backend.backend.app.models.Department;
import backend.backend.app.models.Employee;
import backend.backend.app.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private static DepartmentRepository departmentRepository;

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public Department getDepartmentById(int id) {
        return departmentRepository.findById(id).orElse(null);
    }

    public Department saveOrUpdateDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public void deleteDepartment(int id) {
        departmentRepository.deleteById(id);
    }

    public static Department getDepartmentByName(String departmentName) {
        return departmentRepository.findByDepartmentName(departmentName);
    }

}