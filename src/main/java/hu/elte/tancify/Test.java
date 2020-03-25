package hu.elte.tancify;

import java.util.Date;

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
public class Test extends BaseEntity {

/*  * /
    @Column(name = "user_id", nullable=false)
    private long userID;

    @Column(name = "subject_id", nullable=false)
    private long subjectID;
/* */

    @JoinColumn
    @ManyToOne(targetEntity = User.class)
    private User user;

    @JoinColumn
    @ManyToOne(targetEntity = Subject.class)
    private Subject subject;

    @Column(nullable=false)
    private Date date;
}