package backend.backend.app.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDepartment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "employeeID", referencedColumnName = "employeeID", nullable = false)
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "departmentID", referencedColumnName = "departmentID", nullable = false)
    private Department department;
}