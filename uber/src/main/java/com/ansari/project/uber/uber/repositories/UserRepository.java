package com.ansari.project.uber.uber.repositories;

import com.ansari.project.uber.uber.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
