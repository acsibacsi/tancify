package hu.elte.tancify;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Ágoston Tamás <a.tamas7@gmail.com>
 */
@Data
@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Version
    private int version;
}