package com.bouwhulp.userservice.repository.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Data
@Entity
public class MaterialDto {

    @Id
    private UUID id;

    @OneToMany
    private List<MaintenanceDto> maintenance;

    @Transient
    private HashMap<String, String> attributes;
}
