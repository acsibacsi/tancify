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
public class Learn extends BaseEntity{
/* * /
    @Column(name = "user_id", nullable=false)
    private long userID;

    @Column(name = "flashcard_id", nullable=false)
    private long flashcardID;
/* */
    @JoinColumn
    @ManyToOne(targetEntity = User.class)
    private User user;

    @JoinColumn
    @ManyToOne(targetEntity = Flashcard.class)
    private Flashcard flashcard;

    @Column(name = "learned", nullable=false)
    private boolean isLearned;
}