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
public class Test {

    @Column(name = "user_id", nullable=false)
    private long userID;

    @Column(name = "subject_id", nullable=false)
    private long subjectID;

    @Column(nullable=false)
    private Date date;
}