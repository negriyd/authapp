package io.finrev.auth.authapp.dao;

import io.finrev.auth.authapp.model.A_User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<A_User, Long> {
    A_User findByUsername(String username);
}
