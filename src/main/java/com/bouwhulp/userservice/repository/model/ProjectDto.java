package com.bouwhulp.userservice.repository.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.UUID;

@Data
@Entity
public class ProjectDto {

    @Id
    private UUID id;

    @OneToOne
    private BaseProjectDto baseProject;

    private String specification;
}
