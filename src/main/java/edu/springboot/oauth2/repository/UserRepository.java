package edu.springboot.oauth2.repository;

import edu.springboot.oauth2.domains.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	User findByLogin(String login);
}
