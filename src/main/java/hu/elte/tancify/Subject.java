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
public class Subject extends BaseEntity {

    @Column(nullable=false, length=512, unique = true)
    private String name;

/* * /
    @Column(nullable=false, length=100, unique = true)
    private String owner;
/* */

    @JoinColumn
    @ManyToOne(targetEntity = User.class)
    private User owner;

    @Column(name="public", nullable=false)
    private boolean isPublic;
}