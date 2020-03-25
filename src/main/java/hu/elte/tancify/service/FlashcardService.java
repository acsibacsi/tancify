package hu.elte.tancify.repository.service;

import hello.model.Flashcard;
import hello.repository.FlashcardRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlashcardService {

    @Autowired
    private FlashcardRepository studentRepository;

}