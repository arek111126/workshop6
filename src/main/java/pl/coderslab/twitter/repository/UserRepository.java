package pl.coderslab.twitter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.twitter.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findFirstByEmail(String email);

    User findFirstById(int id);
}
