package io.finrev.auth.authapp.dao;

import io.finrev.auth.authapp.model.ARole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<ARole, Long> {
}
