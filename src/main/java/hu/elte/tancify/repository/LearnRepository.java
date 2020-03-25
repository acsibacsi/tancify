package hu.elte.tancify.repository;

import hu.elte.tancify.model.Learn;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface LearnRepository extends CrudRepository<Learn, Long> {}