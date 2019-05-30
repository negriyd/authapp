package io.finrev.auth.authapp.dao;

import io.finrev.auth.authapp.model.A_Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<A_Role, Long> {
}
