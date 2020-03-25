package hu.elte.tancify;

import java.util.Date;

import javax.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lesson {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "user_id", nullable=false)
    private long userID;

    @Column(name = "subjct_id", nullable=false)
    private long subjectID;

    @Column(nullable=false)
    private int numberOfFlashcards;
    
    @Column(nullable=false)
    private Date date;
    
    @Column(nullable=false)
    private boolean isCompleted;
}