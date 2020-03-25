package hu.elte.tancify.repository;

import hu.elte.tancify.model.Lesson;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface LessonRepository extends CrudRepository<Lesson, Long> {}