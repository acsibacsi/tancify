package hu.elte.tancify;

import javax.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Learn {

    @Column(name = "user_id", nullable=false)
    private long userID;

    @Column(name = "flashcard_id", nullable=false)
    private long flashcardID;

    @Column(name = "learned", nullable=false)
    private boolean isLearned;
}