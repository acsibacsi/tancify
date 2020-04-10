package hu.elte.tancify.service;

import hu.elte.tancify.model.Lesson;
import hu.elte.tancify.repository.LessonRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonService {

    @Autowired
    private LessonRepository studentRepository;

}