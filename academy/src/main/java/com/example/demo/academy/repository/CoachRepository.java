package com.example.demo.academy.repository;

import com.example.demo.academy.domain.Coach;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CoachRepository extends JpaRepository<Coach, Long> {

    Optional<Coach> findByUsername(String username);
}
