package hu.elte.tancify.model;

import javax.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable=false, length=100, unique = true)
    private String email;
    
    @Column(nullable=false, length=100)
    private String name;
    
    @Column(nullable=false, length=100, unique = true)
    private String username;
    
    @Column(nullable=false, length=100)
    private String password;
}