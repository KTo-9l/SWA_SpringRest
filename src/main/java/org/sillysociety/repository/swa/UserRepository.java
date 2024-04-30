package org.sillysociety.repository.swa;

import org.sillysociety.models.swa.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByLogin(String login);
    User findByEmail(String email);
    Boolean existsByLogin(String login);
}
