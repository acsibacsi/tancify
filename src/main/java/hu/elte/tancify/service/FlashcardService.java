package hu.elte.tancify.service;

import hu.elte.tancify.model.Flashcard;
import hu.elte.tancify.repository.FlashcardRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlashcardService {

    @Autowired
    private FlashcardRepository studentRepository;

}