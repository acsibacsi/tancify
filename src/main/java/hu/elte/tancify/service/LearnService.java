package hu.elte.tancify.repository.service;

import hu.elte.tancify.model.Learn;
import hu.elte.tancify.repository.LearnRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LearnService {

    @Autowired
    private LearnRepository studentRepository;

}