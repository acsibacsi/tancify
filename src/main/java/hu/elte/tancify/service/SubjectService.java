package hu.elte.tancify.repository.service;

import hu.elte.tancify.model.Subject;
import hu.elte.tancify.repository.SubjectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository studentRepository;

}