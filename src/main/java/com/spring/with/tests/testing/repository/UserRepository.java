package com.spring.with.tests.testing.repository;

import com.spring.with.tests.testing.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
