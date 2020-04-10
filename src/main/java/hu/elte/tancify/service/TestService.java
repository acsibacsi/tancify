package hu.elte.tancify.service;

import hu.elte.tancify.model.Test;
import hu.elte.tancify.repository.TestRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestRepository studentRepository;

}