package backend.backend.app.models;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue("DEPARTMENT_HEAD")
public class DepartmentHead extends Employee {

    @OneToOne(mappedBy = "departmentHead")
    private Department department;
}