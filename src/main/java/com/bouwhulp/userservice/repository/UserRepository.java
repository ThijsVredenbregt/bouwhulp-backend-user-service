package com.bouwhulp.userservice.repository;

import com.bouwhulp.userservice.repository.model.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserDto, UUID> {
}
