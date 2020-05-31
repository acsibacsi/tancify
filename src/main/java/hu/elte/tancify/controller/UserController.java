package hu.elte.tancify.controller;

import hu.elte.tancify.model.User;
import hu.elte.tancify.repository.FlashcardRepository;
import hu.elte.tancify.repository.SubjectRepository;
import hu.elte.tancify.repository.UserRepository;
import hu.elte.tancify.service.AuthenticatedUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Objects;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private SubjectRepository subjectRepository;
    @Autowired
    private FlashcardRepository flashcardRepository;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    @Autowired
    private AuthenticatedUser authenticatedUser;

    @GetMapping("")
    @Secured({"ROLE_ADMIN"})
    public ResponseEntity<Iterable<User>> getAll() {
        Iterable<User> users = userRepository.findAll();
        return ResponseEntity.ok(users);
    }

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody String username) {
        Optional<User> oUser = userRepository.findByUserName(username);
        if (!oUser.isPresent()) {
            return ResponseEntity.status(401).build();
        }
        return ResponseEntity.ok(oUser.get());
    }

    @PostMapping("/register")
    public ResponseEntity<User> post(@RequestBody User user) {
        Optional<User> oUser = userRepository.findByUserName(user.getUserName());
        if (oUser.isPresent()) {
            return ResponseEntity.badRequest().build();
        }
        user.setId(null);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(User.Role.ROLE_USER);
        return ResponseEntity.ok(userRepository.save(user));
    }

    @GetMapping("/{id}")
    @Secured({"ROLE_ADMIN", "ROLE_USER"})
    public ResponseEntity<User> get(@PathVariable Integer id) {
        User requestUser = authenticatedUser.getUser();
        if (User.Role.ROLE_ADMIN.equals(requestUser.getRole())) {
            Optional<User> oUser = userRepository.findById(id);
            if (!oUser.isPresent()) {
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.ok(oUser.get());
        } else {
            if (Objects.equals(requestUser.getId(), id)) {
                return ResponseEntity.ok(requestUser);
            }
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("/{id}")
    @Secured({"ROLE_ADMIN"})
    public ResponseEntity delete(@PathVariable Integer id) {
        Optional<User> oUser = userRepository.findById(id);
        if (!oUser.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        userRepository.delete(oUser.get());
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    @Secured({"ROLE_ADMIN", "ROLE_USER"})
    public ResponseEntity<User> put(@PathVariable Long id, @RequestBody User user) {
        User requestUser = authenticatedUser.getUser();
        if (User.Role.ROLE_ADMIN.equals(requestUser.getRole())) {
            Optional<User> oUser = userRepository.findById(id.intValue());
            if (!oUser.isPresent()) {
                return ResponseEntity.notFound().build();
            }
            user.setId(id);
            return ResponseEntity.ok(userRepository.save(user));
        } else {
            if (Objects.equals(requestUser.getId(), id) &&
                    requestUser.getRole().equals(user.getRole())) {
                user.setId(id);
                return ResponseEntity.ok(userRepository.save(user));
            }
            return ResponseEntity.badRequest().build();
        }
    }

}
