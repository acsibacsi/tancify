package hu.elte.tancify.repository.service;

import hello.model.Learn;
import hello.repository.LearnRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LearnService {

    @Autowired
    private LearnRepository studentRepository;

}