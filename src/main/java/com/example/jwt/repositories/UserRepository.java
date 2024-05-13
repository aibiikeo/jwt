package com.example.jwt.repositories;

import com.example.jwt.entities.Role;
import com.example.jwt.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByUsername(String username);
    User findByRole(Role role);
}
