package com.fitness.persistence.repository;

import com.fitness.persistence.model.Program;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProgramRepository extends JpaRepository<Program, Long> {
}
