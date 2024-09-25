package com.spring.with.tests.testing.repository;

import com.spring.with.tests.testing.entity.Otter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OtterRepository extends JpaRepository<Otter, Long> {
}