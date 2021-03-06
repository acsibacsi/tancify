package hu.elte.tancify.model;

import java.util.Date;

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
public class Lesson  extends BaseEntity {

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