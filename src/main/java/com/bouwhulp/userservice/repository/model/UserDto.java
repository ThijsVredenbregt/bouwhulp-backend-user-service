package com.bouwhulp.userservice.repository.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.UUID;

@Data
@Entity
public class UserDto {

    @Id
    private UUID id;

    @OneToMany
    private List<ProjectDto> projects;
}
