package backend.backend.app.models;


import lombok.*;
import jakarta.persistence.*;


@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@DiscriminatorValue("HR_DEPARTMENT_HEAD")
public class HRDepartmentHead extends DepartmentHead {
    
}