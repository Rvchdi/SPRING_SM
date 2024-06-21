package backend.backend.app.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int noteID;

    @Column(nullable = false)
    private String noteTitle;

    @Column(nullable = false)
    private String noteContent;

    @Column(nullable = false)
    private Date creationDate;

    @Column(nullable = false)
    private Date publishedDate;

    @Column(nullable = false)
    private Date modificationDate;

    @ManyToOne
    @JoinColumn(name = "departmentID", referencedColumnName = "departmentID", nullable = false)
    private Department department;
}