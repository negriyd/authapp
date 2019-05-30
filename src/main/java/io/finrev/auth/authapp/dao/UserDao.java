package io.finrev.auth.authapp.dao;

import io.finrev.auth.authapp.model.AUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<AUser, Long> {
    AUser findByUsername(String username);
}
