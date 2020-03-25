package hu.elte.tancify.model;

import javax.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Learn {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "user_id", nullable=false)
    private long userID;

    @Column(name = "flashcard_id", nullable=false)
    private long flashcardID;

    @Column(name = "learned", nullable=false)
    private boolean isLearned;
}