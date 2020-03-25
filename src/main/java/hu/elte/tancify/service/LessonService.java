package hu.elte.tancify.repository.service;

import hello.model.Lesson;
import hello.repository.LessonRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonService {

    @Autowired
    private LessonRepository studentRepository;

}