package hu.elte.tancify;

import javax.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subject {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable=false, length=200, unique = true)
    private String name;
    
    @Column(name="public", nullable=false, length=100)
    private boolean isPublic;
    
    @Column(nullable=false, length=100, unique = true)
    private String owner;
}