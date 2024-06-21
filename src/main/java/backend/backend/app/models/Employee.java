package backend.backend.app.models;

import backend.backend.app.services.DepartmentService;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "employee_type", discriminatorType = DiscriminatorType.STRING)
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeID;

    @Column(nullable = false)
    private String employeeName;

    @Column(nullable = false)
    private String employeeEmail;

    private String employeePhone;
    private String employeeRole;
    private String employeeStatus;
    private Date employeeHireDate;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    private Department department;
}