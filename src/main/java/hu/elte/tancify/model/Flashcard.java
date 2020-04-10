package hu.elte.tancify.model;

import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Flashcard extends BaseEntity {

    @Column(nullable=false)
    private int number;

    @Column(nullable=false, length=2048)
    private String question;

    @Column(nullable=false, length=4096)
    private String answer;

    @JoinColumn
    @ManyToOne(targetEntity = Subject.class)
    private Subject subject;

/* * /    
    @Column(name = "subjct_id", nullable=false)
    private long subjectID;
/* */
}