package hu.elte.tancify.repository.service;

import hello.model.User;
import hello.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository studentRepository;

}