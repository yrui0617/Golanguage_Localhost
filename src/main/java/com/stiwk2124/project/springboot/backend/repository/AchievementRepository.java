package com.stiwk2124.project.springboot.backend.repository;

import com.stiwk2124.project.springboot.backend.model.Achievement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AchievementRepository extends JpaRepository<Achievement, Long> {
    List<Achievement> findByUserId(Long userId);
    Optional<Achievement> findByNameAndUserId(String name, Long id);
}

