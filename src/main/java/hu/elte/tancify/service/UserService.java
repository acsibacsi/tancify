package hu.elte.tancify.service;

import hu.elte.tancify.model.User;
import hu.elte.tancify.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository studentRepository;

}