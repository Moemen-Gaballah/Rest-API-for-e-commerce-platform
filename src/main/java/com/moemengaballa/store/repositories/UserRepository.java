package com.moemengaballa.store.repositories;

import com.moemengaballa.store.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
