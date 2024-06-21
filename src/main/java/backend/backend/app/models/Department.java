package backend.backend.app.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int departmentID;

    @Column(nullable = false)
    private String departmentName;

    @OneToOne
    @JoinColumn(name = "departmentHeadID", referencedColumnName = "employeeID")
    private DepartmentHead departmentHead;



}