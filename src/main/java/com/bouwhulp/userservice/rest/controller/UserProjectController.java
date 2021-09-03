package com.bouwhulp.userservice.rest.controller;

import com.bouwhulp.userservice.repository.ProjectRepository;
import com.bouwhulp.userservice.rest.model.Project;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class UserProjectController {

    private ProjectRepository projectRepository;

    @GetMapping("/user/projects/")
    public ResponseEntity<Project> getUserProjects() {
        return ResponseEntity.ok(Project.builder().build());
    }

    @GetMapping("/user/projects/{projectId}")
    public ResponseEntity<List<Project>> getUserProject(@PathVariable Optional<UUID> optionalProjectId) {
        return ResponseEntity.ok(List.of(Project.builder().build()));
    }

    @PostMapping("/user/projects/{projectId}")
    public ResponseEntity<Project> postUserProject(@PathVariable UUID projectId, @RequestBody Project project) {
        return ResponseEntity.ok(Project.builder().build());
    }

    @PutMapping("/user/projects/")
    public ResponseEntity<Void> putUserProject(@RequestBody Project project) {
        return ResponseEntity.ok().build();
    }
}
