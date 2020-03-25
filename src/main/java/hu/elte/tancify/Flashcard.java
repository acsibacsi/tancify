package hu.elte.tancify;

import javax.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Flashcard {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable=false)
    private int number;

    @Column(nullable=false, length=1000)
    private String question;

    @Column(nullable=false, length=1000)
    private String answer;

    @Column(name = "subjct_id", nullable=false)
    private long subjectID;
}