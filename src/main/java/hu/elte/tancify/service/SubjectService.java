package hu.elte.tancify.repository.service;

import hello.model.Subject;
import hello.repository.SubjectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository studentRepository;

}