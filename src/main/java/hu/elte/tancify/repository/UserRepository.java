package hu.elte.tancify.repository;

import hu.elte.tancify.model.User;
import java.util.Optional;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    public Optional<User> findByUserName(String username);
}