package backend.backend.app.repositories;

import backend.backend.app.models.EmployeeDepartment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDepartmentRepository extends JpaRepository<EmployeeDepartment, Integer> {
}
