package com.bouwhulp.userservice.repository.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.HashMap;
import java.util.UUID;

@Data
@Entity
public class MaintenanceDto {

    @Id
    private UUID id;

    @Transient
    private HashMap<String, String> attributes;
}
