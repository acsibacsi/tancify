package hu.elte.tancify.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class User extends BaseEntity implements Serializable {

    @Column(nullable = false, length = 256, unique = true)
    private String email;

    @Column(nullable = false, length = 256)
    private String name;

    @Column(nullable = false, length = 256, unique = true)
    private String userName;

    @Column(nullable = false, length = 64)
    private String password;

    @Column
    @Enumerated(EnumType.STRING)
    private Role role;

    public enum Role {
        ROLE_GUEST, ROLE_USER, ROLE_ADMIN
    }

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Subject> subjects;
}