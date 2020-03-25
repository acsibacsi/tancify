package hu.elte.tancify.repository.service;

import hello.model.Test;
import hello.repository.TestRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestRepository studentRepository;

}