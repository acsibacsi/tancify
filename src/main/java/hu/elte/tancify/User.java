package hu.elte.tancify;

import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author Ágoston Tamás <a.tamas7@gmail.com>
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class User extends BaseEntity {

    @Column(nullable=false, length=256, unique = true)
    private String email;
    
    @Column(nullable=false, length=256)
    private String name;
    
    @Column(nullable=false, length=256, unique = true)
    private String username;
    
    @Column(nullable=false, length=64)
    private String password;
}