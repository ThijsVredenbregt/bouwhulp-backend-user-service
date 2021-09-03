package com.bouwhulp.userservice.repository;

import com.bouwhulp.userservice.repository.model.ProjectDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProjectRepository extends JpaRepository<ProjectDto, UUID> {
}
